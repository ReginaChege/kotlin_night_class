fun main(){
  student("Regina",30,"Akirachix")
    division(20,2)
    details("Richard",24,"American")
    println(addition(2,3,4,6))
    println(numberAverage(20,67,98.0,45,23))
    (personRecord("Regina Richard",40,"79865439","richardregina@gmail.com",40.9,"Uganda"))
    var h="hopper " +"lab"
    println(h)
    var school="akirachix"
    println(school.capitalize())
    var details="my name is shiku"
    var subject="i like Data analistics"
    println(detailss("Regina",95,"Kenya"))
    println(len("Regina"))
    sentence("Chege")

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


//1. Write a function that takes in 3 parameters, name, age, and country, and returns a String
// with this structure “Hi, my name is x, I am y years old and I am from z.” Where x, y, and z are
// the provided name, age, and country respectively. (3 points)
 fun detailss(name:String,age:Int,country:String):String{
     return ("Hi,my name is $name, I am $age years and i am from $country")
 }
//2. Write a function that takes in a String and returns its length (2 points)
fun len(word:String):Int{
   return (word.length)
}
//3. Write a function that takes in a name and prints out “That’s me!” when your name is
// passed to it, otherwise, it prints out “I don’t know who that is” (3 points)
fun sentence(name:String){
    var name="Regina"
    if (name==name){
        println("That's me !")
    }
    else{
        println("i don't know who that is")
    }
}
//4. Write a Kotlin function that takes in a string will all the vowels replaces by the character
// ‘*’. Use string interpolation to generate the output. (2 points)
fun vowelReplace(names: String) {
    var vowels = "aeiou"
    var output = ""
    for (i in names) {
        if (i in vowels) {
            output += "*"
        } else {
            output += i
        }
    }
    return
}







