# bract.dev

REPL based development and testing support module for Bract.


## Usage

Create a file `dev/user.clj` as follows:

```clojure
(ns user
  (:require
    [bract.core.dev   :refer [start stop config verbose]]
    [bract.dev.reload :refer [go reinit reset restart]]))
```

At the REPL (ensure `user=>` prompt) you can run:
* To start/stop/restart app: `(start)`, `(stop)`, `(go)`, `(reinit)`, `(reset)`, `(restart)`
* To switch config file: `(config "config/config.qa.edn")`
* To switch verbosity: `(verbose true)`

### Leiningen users

Add dependency in the `:dev` profile of your `project.clj`.

```clojure
:profiles {:dev {:dependencies [[bract/bract.dev "0.3.0"]
                                ;; other dependencies
                                ]
                 :source-paths ["dev"]}
           ;; other profiles
           }
```

**Note:** If you have a `:main` entry in `project.clj`, move it to the `uberjar` profile.

### Boot users

Add dependency in a dev task.

```clojure
;; in a dev task
(set-env!
  :source-paths #{"dev"}
  :dependencies '[[bract/bract.dev "0.3.0"]
                  ;; other dependencies
                  ]
  ;; other entries
  )
```


## License

Copyright © 2017 Shantanu Kumar (kumar.shantanu@gmail.com, shantanu.kumar@concur.com)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
