Diamond Kata
============

This project contains sourcefiles and a skeleton for a solution to the Diamond Kata. You can of course just code
this kata from scratch in any way you wish. This repo will help you to explore two different approaches to the
problem - an interative approach, where you 'recycle' test cases, and an incremental approach, where all test cases
are valid for the full solution.

For more discussion of 'test recycling' see Seb Rose's [blog post](http://claysnow.co.uk/recycling-tests-in-tdd/)

So far I have starting code for the problem in Scala, Java and Python. The original version was the Scala, so please be
forgiving if I have used Scala idioms or generally translated it badly into the other languages. I welcome pull requests
with improvements and/or translations to more programming languages.

Kata Description
----------------

(this description is copied from http://cyber-dojo.org)

Given a letter print a diamond starting with 'A'
with the supplied letter at the widest point.

For example: print-diamond 'E' prints

<pre>
    A
   B B
  C   C
 D     D
E       E
 D     D
  C   C
   B B
    A
</pre>
For example: print-diamond 'C' prints

<pre>
  A
 B B
C   C
 B B
  A
</pre>
