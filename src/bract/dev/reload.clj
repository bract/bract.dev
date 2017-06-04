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
      (if (instance? Throwable result)
        (throw result)
        result))))


(defn reset
  "Stop application if running, followed by reinitializing the app. You must run bract.core.dev/start to start app."
  []
  (core-dev/stop)
  (reinit))


(def go "Same as 'reset'." reset)


(defn restart
  "Stop application if running, followed by reinitializing the app and starting up."
  []
  (core-dev/stop)
  (reinit)
  (core-dev/start))


(defn verbose
  "Set verbose mode to specified status (unless environment variable APP_VERBOSE is set):
  true  - enable verbose mode
  false - disable verbose mode
  nil   - clear verbose mode override"
  [status?]
  (case status?
    nil   (System/clearProperty "app.verbose")
    true  (do (System/setProperty "app.verbose" "true")  (Echo/setVerbose true))
    false (do (System/setProperty "app.verbose" "false") (Echo/setVerbose false))
    (throw (ex-info (str "Expected argument to be true, false or nil but found " (pr-str status?)) {}))))
