# Week7_Day1_Question1.java

Dr. Max has conducted the academic task in his class with 5 Multiple Choice Questions each having 4 options A/B/C/D. He wanted to write a program which can evaluate the test papers of all the N students such that each correct answer is awarded 1 mark and for incorrect answer penalty is 0.25 marks.

The program must read the number of students N and the the answers of all the N students in the form of a String. If any question is not attempted by any student, then X should be given as input corresponding to that question e.g. ABAXD

It is expected that the marks of all the N students are displayed separated by SPACE.

Input Format

First Line of the input reads the String of CORRECT ANSWERS

Second Line of the input reads the number of students N

Next N lines read the answer Strings of the N students respectively.

Constraints

N > 0

Input characters can be either in Upper Case or Lower Case

Else "Incorrect Input"

Output Format

Print the marks of all the N students separated by SPACE

Sample Input 0

ACBDC

2

BCXDX

AXXDC

Sample Output 0

1.75 3.0


# Week7_Day1_Question2.java

Chacha Chaudhary has asked Sheena to find out the Nth occurence of any Word in the Paragraph. Sheena finds it a tedious task to find Nth occurence so she wants you to write a small java program which can solve her problem and she will give you a gift for helping her. Let us write a code.

Input Format

First line reads the paragraph contents

Second line reads the word to be found and N separated by Space

Constraints

N>0 Else "Incorrect Input"

Output Format

Prints the starting index of the Nth occurence of the word in the paragraph

Prints Not Present if not occuring even a single time and prints the last occurence if occuring less than N times.

Sample Input 0

Aana bought banana.

ana 1

Sample Output 0

1

Sample Input 1

Aana bought banana

baa 3

Sample Output 1

Not Present
