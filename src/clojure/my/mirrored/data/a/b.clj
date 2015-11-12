(ns my.mirrored.data.a.b
  (:require [neko.log :as log]
            [clojure.core.async :as async :refer [<! >! <!! timeout chan alt! go go-loop close!]]))

(defn clock-loop []
  (let [close-chan (chan)]
    (go-loop []
             (log/e "tick tock")
             (recur))
    close-chan))
