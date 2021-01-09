This is my fifth or sixth attempt at doing the Bowling Game kata using TDD.
In previous attempts, after the first couple of tests, i would throw caution to the wind and create the Frame class with major refactoring
This time, after re-reading the Transformation Priority Premise and the word-wrap kata, I set out again, expecting to get to the same design and instead found all tests passing with far less complexity.
There are four different Iterations:
BowlingGameI0: return 0 (constant)
BowlingGameI1: return sum of rolls (variable)
BowlingGameI2: sum of rolls with spare logic (conditional)
BowlingGameI3: sum of rolls with spare logic and strike logic (extra conditional)
At this point, all tests pass, and other than any desired refactoring, nothing needs to be done
