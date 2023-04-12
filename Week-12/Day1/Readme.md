# Week12_Day1_Question1.java

Create a functional interface with the following method in it: boolean valid(String str, int n);

Write a program with the help of lambda expression that will use this valid() method to find out if a string (str) is having characters greater than "n" in it or not.

Input Format

Your program will take 2 types of inputs. First input will be a string (i.e. value for "str") and second input will be no. of characters to compare (i.e. value for "n"). If value of "n" entered less than 1, then display message "Invalid input". Otherwise, display message "Valid string" if string is having characters greater than "n" or display message "Invalid string" if string is having characters less than "n".

Constraints

No. of characters (i.e. "n") should be greater than 0.

Output Format

Display message "Valid string" if string is having characters greater than "n" or display message "Invalid string" if string is having characters less than "n".

Sample Input 0

Lovely<br>
4

Sample Output 0

Valid string

# Week12_Day1_Question2.java

Create a class Student having attributes name (String), rollNo (int) and department (String). Create a functional interface Predicate with an abstract method test with following signature: boolean test(Student t); Write a test program to filter all the Students who is from ‘CSE’ department’ by using above test method with the help of lambda expression.

Input Format

Your program should take 2 types of inputs. First will represents the number of Students and second will be the attributes of students in the order (name, rollNo, department). If the number of students will be less than equal 1 then display the message “Invalid” without asking for any input

Constraints

Number of students should be greater than 1

Output Format

Your program should display rollNo of the students in separate lines which are from ‘CSE’ department.

Sample Input 0

3<br>
Raghav<br>
5<br>
CSE<br>
Amit<br>
7<br>
ECE<br>
Shavi<br>
10<br>
CSE

Sample Output 0

5<br>
10
