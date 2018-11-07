# java-scripts

scripts in java


[ "abcd1", "cdef1", "dghef1"] <br>
[ "abcd2", "cdef2", "dghef2"] <br>
[ "abcd3", "cdef3", "dghef3"]


EVEN THREAD:

[ "abcd3", "cdef1", "dghef3"] <br>
[ "abcd2", "cdef2", "dghef2"] <br>
[ "abcd1", "cdef3", "dghef1"]


write alll the six strings to file

if any of the corner six stirngs are equal to 3 middle strings, throw an Exceptions

SECONDARY THREAD
work on secodary diagonal
user input "dghef3"
if you find this in the seondary daigonal then alphabetical order  "3defgh" and then replace
if nothing is same as user input in secodary disgonal, Exception throw

String s = "";
s = s + str.charAt(i);
StringBuffer sb = new StringBuffer(s.nextLine());
