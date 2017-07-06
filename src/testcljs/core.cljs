(ns testcljs.core)

(defn mouse [n]
  (apply str "<:3)" (repeat n "~")))
