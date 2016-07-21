(defvar *langs* nil "A list of programming language plists")
(defvar universal-declaration "It sucks!" "True everywhere, for all time")

(defun delang (name mostlike comment complaints)
  "Define a language and add it to the list"
  (push (list :name name :mostlike mostlike :comment comment :complaints complaints)
   *langs*)
  )

(delang "Ruby" "Smalltalk" "it power lots of the web!" (list 'speed 'weird))
(delang "C" "Algol" "it's the mother of all languages!" (list 'verbose))
(delang "Lisp" "not much else" "it's infinitely flexibile!" (list 'weird))
(delang "Java" "C and its derivatives" "it runs anywhere!" (list 'verbose))
(delang "Brainfuck" "line noise" "why would you ever use this?" (list 'speed 'verbose 'weird))
(delang "Go" "C, but nicer" "It's fast and tiny" (list 'verbose))

(defun sick-burn (&optional cmd)
  ;;The unused optional is necessary since an entry point
  ;;accepting command line input is necessary to compile.

  "Make fun of the languages defined with delang"
  (loop for l in *langs* do
    (format t "~a~%" (concatenate 'string "Let's talk about " (getf l :name) "."))
    (format t "~a~%" (concatenate 'string "It's most like " (getf l :mostlike) "."))
    (format t "~a~%" (concatenate 'string "Also, " (getf l :comment)))
    (format t "~a~%" universal-declaration)
    (loop for c in (getf l :complaints) do
      (case c
        (speed (format t "~a~%" "Why is it so slow?!"))
        (verbose (format t "~a~%" "Why does it take so much text to do so little?!"))
        (weird (format t "~a~%" "Why does this syntax make so little sense?!"))
        )
     )
    (format t "~a~%" "----")
   )
 )
