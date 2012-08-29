(ns cljpp.core
  (:require [clojure.pprint :as pprint])
  (:gen-class))

(defn -main
  [& args]
  (binding [*read-eval* false]
    (pprint/pprint (read))
    (flush)))
