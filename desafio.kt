// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Level { BEGINNER, INTERMEDIATE, ADVANCED }

data class Student(val name:String, val id: Int)

data class EducationContent(val name: String, val time: Int, val level: Level)

data class Formation(val name: String, var contents: List<EducationContent>, val level: Level) {

    val subscribed: MutableList<Student> = mutableListOf(Student("João",1),Student("Maria",2))
    val students: List<Student> = subscribed
    fun addStudents(newStudent: Student) {                                 
    subscribed.add(newStudent)
    println("Registering ...")
}    
    fun  listStudents(): List<Student>{
        return students
    }
    fun show_content(){
        for(content in contents){
            println("Name: ${content.name} | Time: ${content.time} | Level: ${content.level}")
        }
    }
}


fun main() {
    val introduction = EducationContent("Variables",50,Level.BEGINNER)
    val collections = EducationContent("Lists",100,Level.INTERMEDIATE)
    val classes = EducationContent("Seeled Classes",150,Level.ADVANCED)

    val content = mutableListOf<EducationContent>()
        content.add(introduction)
        content.add(collections)
        content.add(classes)
           
    val curse = Formation("Kotlin",content,Level.ADVANCED)
    println("======= Class =======")
    println("  ${curse.name} -- ${curse.level}")    
    println("=======Content=======")
    curse.show_content()    
    println("=====================")
    println("Total of students: ${curse.listStudents().size}")
    curse.addStudents(Student("Paulo",3))
    curse.addStudents(Student("Henrique",4))
    println("=====================")
    println("Total of students: ${curse.listStudents().size}") 
    println("=======Students======")
    println("     ID -- Name")
    curse.listStudents().forEach {                                  
        i -> println("     ${i.id} | ${i.name}")
    	}
    println("=====================")
}