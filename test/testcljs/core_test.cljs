(ns testcljs.core-test
  (:require [testcljs.core :refer [mouse]]
            [clojure.test :refer [deftest testing is are async run-tests]]))

(deftest mouse-test
  (testing "it has a cute tail"
    (are [n m] (= (mouse n) m)
      0 "<:3)"
      1 "<:3)~"
      2 "<:3)~~"
      10 "<:3)~~~~~~~~~~")))

(comment
  (mouse-test)
  (run-tests))
