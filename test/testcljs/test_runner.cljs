(ns testcljs.test-runner
  (:require [testcljs.core-test]
            [doo.runner :refer-macros [doo-tests doo-all-tests]]))

(doo-tests 'testcljs.core-test)
