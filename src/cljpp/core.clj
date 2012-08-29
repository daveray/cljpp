(ns cljpp.core
  (:require [clojure.pprint :as pprint])
  (:gen-class))

(defn -main
  [& args]
  (binding [*read-eval* false]
    (loop [form (read *in* false ::end true)]
      (when (not= form ::end)
        (pprint/pprint form)
        (flush)
        (recur (read *in* false ::end true))))
    (flush)))
