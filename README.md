Stopwatch tasks by Patcharapol Nirunpornputta
I ran the tasks on Hp and got these results:

Task      |  Time
----------|----------
Append 50,000 chars to String | 0.985794 sec
Append 100,000 chars to String | 3.891619 sec
Append 100,000 chars to StringBuilder | 0.002092 sec
Add 1 billion double using array | 1.807369 sec
Add 1 billion Double using array | 7.004992 sec
Add 1 billion BigDecimal using array | 12.496924 sec

1. Why does appending 100,000 chars to a String take more than 2X the time to append 50,000
chars?
Because When you add a string to computer it will consume your computer memory.If you try to add more Strings it will consume more
memory and you computer will take more time to do a task.

2. Why is appending to StringBuilder so much different than appending to String? What is
happening to the String?
Because StringBuider have array char and when you add a new String it will update a value inside array char. When exceeded the maximum
capacity of array char it will increase more memories and it will consume your computer memory only this time.But when you append String
it will consume computer memory everytime.

3. Explain difference in time to sum double, Double, and BigDecimal. Which is faster and
why?
double is fastest next is Double and the slowest is BigDecimal because double doesn't contain any method,attributes on the other hand
Double is object that contain method,attributes and need to be tranform to double and tranform back again to Double it will take time
than double.And BigDecimal it has a lot of attributes and a special process that consume a lot of memory be cause of slowest to sum
