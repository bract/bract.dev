;   Copyright (c) Shantanu Kumar. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file LICENSE at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.


(ns bract.dev.reload
  "Utility functions for reloading namespaces and application state."
  (:require
    [clojure.tools.namespace.repl :as ctnr]
    [bract.core.dev  :as core-dev]
    [bract.core.echo :as core-echo])
  (:import
    [bract.core Echo]))


(defn reinit
  "Re-initialize app"
  []
  (core-echo/with-latency-capture "Re-initializing app"
    (core-dev/deinit)
    ;; refresh namespaces and then call 'init'
    (let [result (ctnr/refresh :after 'bract.core.dev/init)]
      (when (instance? Throwable result)
        (throw result)))))


(defn reset
  "Stop application if running, followed by reinitializing the app. You must run `bract.core.dev/start` to start app."
  []
  (core-dev/stop)
  (reinit))


(def go
  "Stop application if running, followed by reinitializing the app. You must run `bract.core.dev/start` to start app.
  Same as 'bract.dev.reload/reset'."
  reset)


(defn restart
  "Stop application if running, followed by reinitializing the app and starting up."
  []
  (core-dev/stop)
  (reinit)
  (core-dev/start))
