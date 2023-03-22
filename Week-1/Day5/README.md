# Week1_Day5_Question1.java

Consider that there is a cricket player named Smith who hits certain number of 4s and 6s in a cricket match. Find out total numbers of scores he makes with his 4s & 6s only.

Input Format

In First input line, you should enter number of 4s hit by Smith. In Second input line, you should enter number of 6s hit by Smith.

Constraints

Enter only integer (positive) value. 0<=n<=100

Output Format

Total numbers of scores Smith makes with his 4s & 6s only. If any input is given negative, then total scores should be counted as 0.

Sample Input 0

1

2

Sample Output 0

16

Sample Input 1

2

2

Sample Output 1

20

Sample Input 2

2

1

Sample Output 2

14

# Week1_Day5_Question2.java

During the code-based test of Java, Peter has been assigned a task to implement a class which reads the Account Number(Long), Account Holder Name(String), Gender (M/F) (Character) and Amount (Integer) to be withdrawn at runtime.

Given that the Current Account Balance is 20000, it is expected to perform the withdrawl if amount to be withdrawn is less than or equal to 20000 and message to be displayed is:

Hi Mr./Ms. XXX! Your Account Balance after withdrawl is YYYYY.

If the amount to be withdrawn is greater than the Current Account Balance, then the message displayed is:

Hi Mr./Ms. XXX! Insufficient Funds! You can not withdraw AAAAA.

Input Format

First line reads Account Number

Second line reads Account Holder Name

Third line reads Gender

Fourth line reads Amount to be withdrawn

Constraints

Account Number is a 10 digit number

Output Format

**Hi Mr./Ms. XXX!

Your Account Balance after withdrawl is YYYYY.**

Sample Input 0

1234567891

Aman Aggrawal

M

5000

Sample Output 0

Hi Mr. Aman Aggrawal!

Your Account Balance after withdrawl is 15000.

Sample Input 1

1234567899

Chandani

F

25000

Sample Output 1

Hi Ms. Chandani!

Insufficient Funds! You can not withdraw 25000.
