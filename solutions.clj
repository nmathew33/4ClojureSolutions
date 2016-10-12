;; 1
;; This is a clojure form. Enter a value which will make the form evaluate to true.
;; Don't over think it! If you are confused, see the getting started page. Hint: true is equal to true.
;; (= __ true)
true

;; 2
;; If you are not familiar with polish notation, simple arithmetic might seem confusing.
;; Note: Enter only enough to fill in the blank (in this case, a single number) - do
;; not retype the whole problem.
;; (= (- 10 (* 2 3)) __)
4

;; 3
;; Clojure strings are Java strings. This means that you can use any of the Java string
;; methods on Clojure strings.
;; (= __ (.toUpperCase "hello world"))
"HELLO WORLD"

;; 4
;; Lists can be constructed with either a function or a quoted form.
;; (= (list __) '(:a :b :c))
:a :b :c

;; 5
;; When operating on a list, the conj function will return a new list with one or more items
;; "added" to the front.
;; Note that there are two test cases, but you are expected to supply only one answer,
;; which will cause all the tests to pass.
;; (= __ (conj '(2 3 4) 1))
;; (= __ (conj '(3 4) 2 1))
(list 1 2 3 4)

;; 6
;; Vectors can be constructed several ways. You can compare them with lists.
;; Note: the brackets [] surrounding the blanks __ are part of the test case.
;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
:a :b :c

;; 7
;; When operating on a Vector, the conj function will return a new vector with one
;; or more items "added" to the end.
;; (= __ (conj [1 2 3] 4))
;; (= __ (conj [1 2] 3 4))
[1 2 3 4]

;; 8
;; Sets are collections of unique values.
;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
(set '(:a :b :c :d))

;; 9
;; When operating on a set, the conj function returns a new set with one or more keys "added".
;; (= #{1 2 3 4} (conj #{1 4 3} __))
2

;; 10
;; Maps store key-value pairs. Both maps and keywords can be used as lookup functions.
;; Commas can be used to make maps more readable, but they are not required.
;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))
;; (= __ (:b {:a 10, :b 20, :c 30}))
20

;; 11
;; When operating on a map, the conj function returns a new map with one or more key-value pairs "added".
;; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
[:b 2]
