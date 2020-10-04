;   Copyright (c) Shantanu Kumar. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file LICENSE at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.


(ns bract.dev.repl
  "Convenience namespace for REPL workflow. You may set this as the REPL namespace for Bract applications."
  (:require
    [clojure.repl     :refer :all]
    [bract.core.dev   :refer [config-files context-file
                              deinit init
                              start stop verbose]]
    [bract.dev.reload :refer [go reinit reset restart]]))
