(defproject cljs-webrtc "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [com.cemerick/piggieback "0.1.3"] ]

  :repl-options  {:nrepl-middleware  [cemerick.piggieback/wrap-cljs-repl]}

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :debug true

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "cljs-webrtc"
              :source-paths ["src"]
              :compiler {
                :preamble ["resources/adapter.js"]
                :output-to "cljs_webrtc.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
