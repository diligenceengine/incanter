(defproject incanter-zoo "1.4.0"
  :description "Incanter Zoo is a port of Zoo from R."
  :url "http://incanter.org/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git" :url "https://github.com/liebke/incanter"}
  :min-lein-version "2.0.0"
  :dependencies [[incanter/incanter-core "1.4.0"]
                 [incanter/incanter-io "1.4.0"]
                 [clj-time "0.4.4"
                  :exclusions [org.clojure/clojure
                               org.clojure/clojure-contrib]]]
  )
