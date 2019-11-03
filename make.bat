@echo off

if (%1) == (c) goto :Compile
if (%1) == (d) goto :Doc
if (%1) == (1) goto :Run1
if (%1) == (2) goto :Run2
if (%1) == (3) goto :Run3
if (%1) == (4) goto :Run4
if (%1) == (5) goto :Run5
if (%1) == (6) goto :Run6
if (%1) == (7) goto :Run7
if (%1) == (8) goto :Run8
if (%1) == (9) goto :Run9
if (%1) == (10) goto :Run10

goto :Compile

:Run1
  cd examples\blocks
  java utilities.jshop2.InternalDomain blocks
  java utilities.jshop2.InternalDomain -r problem
  javac problem.java
  java -Xss2048K problem
  REM del blocks.java
  REM del blocks.txt
  REM del problem.java
  del *.class
  cd ..\..
  goto :End

:Run2
  cd examples\basic
  java utilities.jshop2.InternalDomain basic
  java utilities.jshop2.InternalDomain -r problem
  REM javac problem.java
  REM java problem
  REM del basic.java
  REM del basic.txt
  REM del problem.java
  REM del *.class
  cd ..\..
  goto :End

:Run3
  cd examples\oldblocks
  java InternalDomain oldblocks
  java InternalDomain -r problem
  javac problem.java
  java problem
  del oldblocks.java
  del oldblocks.txt
  del problem.java
  del *.class
  cd ..\..
  goto :End

:Run4
  cd examples\test
  java InternalDomain test
  java InternalDomain -r12 problem
  javac problem.java
  java problem
  del test.java
  del test.txt
  del problem.java
  del *.class
  cd ..\..
  goto :End

:Run5
  cd examples\logistics
  java InternalDomain logistics
  java InternalDomain -r problem
  javac problem.java
  java problem
  del logistics.java
  del logistics.txt
  del problem.java
  del *.class
  cd ..\..
  goto :End

:Run6
  cd examples\freecell
  java InternalDomain freecell
  java InternalDomain -r problem
  javac problem.java
  java problem
  del freecell.java
  del freecell.txt
  del problem.java
  del *.class
  cd ..\..
  goto :End

:Run7
  cd examples\propagation
  java InternalDomain propagation
  java InternalDomain -r problem
  javac problem.java
  java problem
  del propagation.java
  del propagation.txt
  del problem.java
  del *.class
  cd ..\..
  goto :End

:Run8
  cd examples\forall
  java InternalDomain forall
  java InternalDomain -ra problem
  javac problem.java
  java problem
  del forallexample.java
  del forallexample.txt
  del problem.java
  del *.class
  cd ..\..
  goto :End

:Run9
  cd examples\rover
  java InternalDomain rover
  java InternalDomain -r problem
  javac problem.java
  java problem
  del rover.java
  del rover.txt
  del problem.java
  del *.class
  cd ..\..
  goto :End

:Run10
  cd examples\blocks
  java InternalDomain blocks
  java InternalDomain -ra smallproblem
  javac smallproblem.java
  java smallproblem
  del blocks.java
  del blocks.txt
  del smallproblem.java
  del *.class
  cd ..\..
  goto :End

:End
