# Week4_Day1_Question1.java

Jeevan has been given a task by his Java professor Mrs. Shruti to create an enum of the subjects which he is studying in current semester. It is also instructed that there must be 2 attributes of each Subject i.e. Faculty Name and credits(int) of the subject. Details of the subjects are:

**Subject, Credits, Faculty Name **

Java, 4, Shruti OS, 3, Puneet Kumar AI, 2, James William Android, 3, Md. Adil Khan

Jethalal is supposed to write a main class in which the name of subject is taken as input and the faculty name and credits of that subject should be displayed using switch statement. If the input given is not matching with the listed subjects, display This subject is not running in this semester.

Input Format

First line of the input reads the subject name

Constraints

NA

Output Format

Prints the name of the Faculty and credits seperated by SPACE.

Prints This subject is not running in this semester. if input does not match with the subjects of enum.

Sample Input 0

Android

Sample Output 0

Md. Adil Khan 3

# Week4_Day1_Question2.java

Suppose that you want to write a program to calculate the marks of a student of all his subjects that he has learnt in a particular semester. Take the input from the user which will ask him to enter no. of subjects he has learnt. If the input given is greater than 0, then program should ask the user to enter the marks of each subject. After entering all the marks, calculate and print total marks scored by him in all subjects. If the input given is negative or zero, then display the message “Invalid”.

Input Format

The first input line should ask the user to enter no. of subjects he has learnt. The remaining input lines should ask the user to enter the marks scored by him in each subject.

Constraints

Number of subjects should be greater than 0. i.e. 1 ≤ n ≤ 10 If any subject marks entered by him is negative value or greater than 100, then it should not be considered. i.e. 0 ≤ marks ≤ 100

Output Format

Sum of marks of all subjects entered by user.

Sample Input 0

4

20

10

30

70

Sample Output 0

130

Sample Input 1

0

Sample Output 1

Invalid
