class Customer

class Contact(val id: Int, var email: String)

class Contact(val id: Int, var email: String) {
    val category: String = ""
}

class Contact(val id: Int, var email: String = "example@gmail.com") {
    val category: String = "work"
}

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "thalles@gmail.com")
}

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "thalles@gmail.com")
    
    // Prints the value of the property: email
    println(contact.email)           
    // thalles@gmail.com

    // Updates the value of the property: email
    contact.email = "joao@gmail.com"
    
    // Prints the new value of the property: email
    println(contact.email)           
    // joao@gmail.com

    class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    // Calls member function printId()
    contact.printId()           
    // 1
}
}

class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    // Calls member function printId()
    contact.printId()           
    // 1
}

data class User(val name: String, val id: Int)

val user = User("Alex", 1)

// Automatically uses toString() function so that output is easy to read
println(user)            
// User(name=Alex, id=1)

val user = User("Alex", 1)
val secondUser = User("Alex", 1)
val thirdUser = User("Max", 2)

// Compares user to second user
println("user == secondUser: ${user == secondUser}") 
// user == secondUser: true

// Compares user to third user
println("user == thirdUser: ${user == thirdUser}")   
// user == thirdUser: false

val user = User("Alex", 1)
val secondUser = User("Alex", 1)
val thirdUser = User("Max", 2)

// Creates an exact copy of user
println(user.copy())       
// User(name=Alex, id=1)

// Creates a copy of user with name: "Max"
println(user.copy("Max"))  
// User(name=Max, id=1)

// Creates a copy of user with id: 3
println(user.copy(id = 3)) 
// User(name=Alex, id=3)

