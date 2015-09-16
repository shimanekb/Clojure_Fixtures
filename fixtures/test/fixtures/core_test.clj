(ns fixtures.core-test
  (:require [clojure.test :refer :all]
            [fixtures.core :refer :all]))

(defn fixture-fn [x]
  (println "This would be a setup")
  (x)
  (println "This would be a teardown"))

(deftest the-test 
  (println "I am the test")
  (is (= 1 1)))

(deftest the-other-test
  (println "Im the other test")
  (is (= 2 1)))

;for each
;(use-fixtures :each fixture-fn)

;once
(use-fixtures :once fixture-fn)
