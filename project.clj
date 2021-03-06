(defproject bract/bract.dev "0.6.2-0.2.0"
  :description "Dev module for Bract"
  :url "https://github.com/bract/bract.dev"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :global-vars {*warn-on-reflection* true
                *assert* true
                *unchecked-math* :warn-on-boxed}
  :dependencies [[bract/bract.core "0.6.2"]
                 [org.clojure/tools.namespace "1.1.0"]]
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :coverage {:plugins [[lein-cloverage "1.0.9"]]}
             :rel {:min-lein-version "2.7.1"
                   :pedantic? :abort}
             :c07 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :c08 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :c09 {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :c10 {:dependencies [[org.clojure/clojure "1.10.3-rc1"]]}
             :dln {:jvm-opts ["-Dclojure.compiler.direct-linking=true"]}}
  :aliases {"test-all" ["with-profile" "c07:c08:c09:c10" "test"]})
