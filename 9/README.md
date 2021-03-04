Practical task #12
_______________________

**************************************
ATTENTION!

(1) the names of the classes and methods are specified;
(2) the names of the files with input data are specified.
**************************************

Note.

Use UTF-8 encoding for source file.
‘Part1’ class has a ‘main’ method that demonstrates the functionality of the corresponding subtask. Do not change this method!
_______________________

Task 1

-----------------------

Class name: com.epam.test.automation.java.practice12.Part1
The input data should be uploaded from the "part1.txt" file

-----------------------

The task should be resolved using regular expressions without using container classes.
Define a class with static methods that convert input data to output data.
As the input data, use a text of the following structure (the values of Login/Name/Email, in fact, can be random); Login and Name can contain Latin letters):


Input data (part1.txt)
-----------------------

Login;Name;Email
ivanov;Ivan Ivanov;ivanov@mail.com
churchill;Winston Churchill;churchill@google.com
obama;Barack Obama;obama@google.com
bush;George Bush;bush@mail.com

-----------------------

The methods that you need to write have the following structure (N is a digit: 1, 2, 3, 4):

-----------------------

public static String convertN(String input) {
    ... 
} 

-----------------------

1.1. The method "convert1"
It should convert input data to a string of the following type:

Output of convert1

-----------------------

ivanov: ivanov@mail.com
churchill: churchill@google.com
obama: obama@google.com
bush: bush@mail.com

-----------------------

1.2. The method "convert2"
It should convert input data to a string of the following type:

Output of convert2 

-----------------------

Ivanov Ivan (email: ivanov@mail.com)
Churchill Winston (email: churchill@google.com)
Obama Barack (email: obama@google.com)
Bush George (email: bush@mail.com)

-----------------------

1.3. The method "convert3"
It should convert input data to a string of the following type (email domain ===> a list of the logins separated with a comma of those users whose emails are registered based on this domain):

Output of convert3 

-----------------------

mail.com ==> ivanov, bush
google.com ==> churchill, obama

-----------------------

1.4. The method "convert4"
It should convert input data to a string of the following type (Password column should be added, the password itself should contain exactly 4 digits that are generated randomly):

Output of convert4 

-----------------------

Login;Name;Email;Password
ivanov;Ivan Ivanov;ivanov@mail.com;4751
churchill;Winston Churchill;churchill@google.com;9473
obama;Barack Obama;obama@google.com;3679
bush;George Bush;bush@mail.com;9289

-----------------------