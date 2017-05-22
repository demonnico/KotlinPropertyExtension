# KotlinPropertyExtension
It helps you add any property for existed classes in Kotlin, just like objc_setAssociateObject in Objective-C at runtime.
```kotlin
data class Student(val name: String)
var Student.email: String by PropertyAttachedDelegation()

fun main(args: Array<String>) {
    val student = Student("nico")
    student.email = "nico@wtf.com"
    print(student.email)
}
```
