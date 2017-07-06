(ns testcljs.test-runner
  (:require [testcljs.core-test]
            [doo.runner :refer-macros [doo-tests doo-all-tests]]))

(enable-console-print!)

(doo-tests 'testcljs.core-test)
