# bract.dev

REPL based development and testing support module for Bract.


## Usage

Create a file `dev/user.clj` as follows:

```clojure
(ns user
  (:require
    [bract.core.dev   :refer [start stop]]
    [bract.dev.reload :refer [go reinit reset]]))
```

### Leiningen users

Add dependency in the `:dev` profile of your `project.clj`.

```clojure
:profiles {:dev {:dependencies [[bract/bract.dev "0.2.0-SNAPSHOT"]
                                ;; other dependencies
                                ]
                 :source-paths ["dev"]}
           ;; other profiles
           }
```

### Boot users

```clojure
;; in a dev task
(set-env!
  :source-paths #{"dev"}
  :dependencies '[[bract/bract.dev "0.2.0-SNAPSHOT"]
                  ;; other dependencies
                  ]
  ;; other entries
  )
```


## License

Copyright © 2017 Shantanu Kumar (kumar.shantanu@gmail.com, shantanu.kumar@concur.com)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
