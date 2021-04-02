case class KaznuStudents(name: String, age: Int)
val aidar1 = new KaznuStudents("Aidar", 22)
val aidar2 = new KaznuStudents("Aidar", 22)
// println(bob1 == bob2) error: not found

var x, y, z = (1, 2, 3)
println(x)

// задача 1
val someValue: Option[Double] = Some(20.0)
val value = someValue match{
  case Some(v) => v
  case None => 0.0
}
println(value)

val noValue: Option[Double] = None
val value1 = noValue match {
  case Some(v) => v
  case None => 0.0
}
println(value1)

// задача 2
val kaznuLabs = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
println(kaznuLabs.length) // длина списка
println(kaznuLabs map (_ * 2)) // удвоение значение элементов списка
println(kaznuLabs.reverse) // перевернутый список
println(kaznuLabs filter(_ % 3 == 0)) // отфильтрование всех значения в списке, кратные 3

// задача 3
val numbers = List(11, 22, 33)
var total = 0
for(i <- numbers){
  total += i
}
println(total)
println(numbers.foldLeft(0)(_ + _))

// задача 4
def individual_analysis_data(expr: Any) =
  expr match{
    case ("go", "simple") => "Go language must have"
    case ("scala", "the best") => "Scala is the best high-load backend language"
    case ("python", "excellent") => "Python excellent for data and scripting"
    case _ => "Okey, every language matter"
  }
individual_analysis_data("scala", "the best")
individual_analysis_data("go", "simple")
individual_analysis_data("python", "excellent")
individual_analysis_data("C#")
