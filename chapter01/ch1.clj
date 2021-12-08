;; ********************************************
;; *********** Language basics ***********
;; ********************************************

;; **********************
;; 1. Basic syntax

(str "Hello, " "World!")

(str "Hello from " "Clojure with " "lots of " " arguments")

;; **********************
;; 2. Basic arithmetic

(+ 1 2) ;; Result: 3

(+ 1 2 3) ;; Result: 6

;; **********************
;; 3. Explicit precedence rules

(+ 3 (* 4 2)) ;; Result: 11

;; ********************************************
;; *********** Host interoperation: A JVM crash course ***********
;; ********************************************

;; **********************
;; 1. Using the dot operator to call Java static methods

(. Math PI) ;; Result: 3.141592653589793

(. Math abs -3) ;; Result: 3
(Math/abs -3) ;; Result: 3

;; **********************
;; 2. Using the dot operator to call Java instance methods

(.toUpperCase "foo") ;; Result: "FOO"
(. "foo" toUpperCase) ;; Result: "FOO"

;; **********************
;; 3. Creating instances of Java classes 

(new Integer "42") ;; Result: 42
(Integer. "42") ;; Result: 42
