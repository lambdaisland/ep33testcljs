(defproject ep33testcljs "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/clojurescript "1.9.671"]]

  :plugins [[lein-figwheel "0.5.11"]]

  :cljsbuild {:builds
              [{:id "dev"
                :figwheel true
                :source-paths ["src" "test"]
                :compiler {:main testcljs.core
                           :optimizations :none
                           :output-dir "resources/public/js/out"
                           :asset-path "js/out"
                           :output-to "resources/public/js/app.js"}}]})
