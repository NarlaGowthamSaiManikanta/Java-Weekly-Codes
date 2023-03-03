# Java-Weekly-Codes

#Week6_Day5_Question1.java

Create a class Student with attributes name(String) and registrationNo(int) and a method show to display the attributes of the Student. Write a menu driven program with 2 choices to take the input of the student attributes and display the attributes.

Input Format
Your program should take the 2 choice as input. • If the first input will be 1 then also ask to user to enter the details of the student. If the entered registrationNo is negative, do not accept the input and prompt again to take new input until user will not entered the positive registrationNo. • If the first input will be 2 then display the default values of Student attributes separated by comma in the same line. • If the first input will be any other int value, display the message “Wrong Choice”.

Constraints
Student registrationNo should be positive value(excluding 0).

Output Format
Your program should display the attributes of Student or the message “Wrong Choice” as the User choice at the runtime.

Sample Input 0
1
John
10

Sample Output 0
John,10

Sample Input 1
2
Sample Output 1
null,0


#Week6_Day5_Question2.java

Write a program to make "Employee" class consisting of following: -- instance variables --> id & age -- a parameterized constructor to initialize both instance variables.
Create array of "n" Employee objects (where "n" is no. of objects specified by user at run-time) and display the id and age of those employees whose age is less than 30.

Input Format
Program should take the inputs in following sequence: 1) In First input line, no. of Employee objects to create. i.e. value of "n". 2) In remaining input lines, enter id and age values of "n" Employee objects. For example, if no. of Employee-objects to be created are 2, then user-inputs should be as follows: 2 202 31 100 20

Constraints
1) No. of Employee objects range between 1 to 10, i.e. 1 <= n <= 10
2) All id & age values should be positive and range between: 10 <= id <= 1000 ; 18 <= age <= 50

Output Format
If no. of Employee-objects "n" is less than 1 or greater than 10, then "Invalid input" should be displayed and no other input should be taken.
If any input value for id & age goes out-of-range (specified in constraints), then display "Invalid data" as overall output. Otherwise, display the id and age of those employees whose age is less than 30 or the smallest one if more than person's age is less than 30.

Sample Input 0
2
202 31
100 20

Sample Output 0
100 20

