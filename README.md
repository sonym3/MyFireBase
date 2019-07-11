# MyFireBase
This is a database application using firebase.
In this application Name, Number, and age is stored in firebase Cloud storage.
Once the data is stored, there will be a toast appearing to user saying the data is added to cloud successfully.


## Screeshot 1
It represents the GUI which is vissible to user. they have to add Name, Age, Number and press Add to Database
![Screenshot_20190707-145206_MyFireBase](https://user-images.githubusercontent.com/44123490/60773669-bb758f00-a0d6-11e9-9755-585666243663.jpg)
![Screenshot_20190707-145227_MyFireBase](https://user-images.githubusercontent.com/44123490/60773670-bb758f00-a0d6-11e9-98fc-c783bd6dac63.jpg)

## Screenshot 2
Clear button will help to clear the fields in textView.

![Screenshot_20190707-145241_MyFireBase](https://user-images.githubusercontent.com/44123490/60773671-bb758f00-a0d6-11e9-9423-1c283dfbd5b9.jpg)

## About the Project

###### FirebaseDatabase class

The entry point for accessing a Firebase Database. You can get an instance by calling getInstance(). To access a location in the database and read or write data, use getReference().

###### DatabaseReference class
A Firebase reference represents a particular location in your Database and can be used for reading or writing data to that Database location.

This class is the starting point for all Database operations. After you've initialized it with a URL, you can use it to read data, write data, and to create new DatabaseReferences.

###### DatabaseReference push()

It create a reference to an auto-generated child location.

###### setValue(Object value)
Set the data at this location to the given value.
