fun main(){
  student("Regina",30,"Akirachix")
    division(20,2)
    details("Richard",24,"American")
    println(addition(2,3,4,6))
    println(numberAverage(20,67,98.0,45,23))
    (personRecord("Regina Richard",40,"79865439","richardregina@gmail.com",40.9,"Uganda"))

}
fun student(name:String,age:Int,school:String){
    var details="My name is $name, i am $age years old and i study at $school"
    println(details)
}
fun division(num1:Int,num2:Int){
    var divide=num1/num2
    println(divide)
}

//1. Create and invoke a function that takes in a users name, age, and nationality and prints out
// “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy,
// I am 23 years old and I am from Kenya” (2 points)
fun details(name:String,age:Int,nationality:String){
    println("Hello my name is $name, i am $age and i am from $nationality")
}
//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun addition(a:Int,b:Int,c:Int,d:Int):Int{
    var sum=a+b+c+d
    return( sum )
}
//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun numberAverage(e:Int,f:Int,g:Double,h:Int,i:Int):Double{
    var aver=(e+f+g+h+i)/5
    return  aver
}
//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
fun personRecord(fullName:String,age: Int,phoneNumber:String,email:String,weight:Double,citizen:String) {
    var origin = "kenya"
    if (citizen == origin) {
        println(true)
    } else {
        println(false)
    }
}


