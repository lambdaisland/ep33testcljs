(ns testcljs.test-runner
  (:require [testcljs.core-test]
            [clojure.test :refer [run-all-tests]]))

(enable-console-print!)

(run-all-tests)
