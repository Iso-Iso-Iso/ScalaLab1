import scala.collection.mutable.ListBuffer

case class Human(name: String, age: Int)

class ListHuman {
  private val humans = ListBuffer[Human]()

  def addHuman(name: String, age: Int): Unit = {
    val human = Human(name, age)
    humans += human
  }

  def deleteHumanByName(name: String): Unit = {
    humans --= humans.filter(_.name == name)
  }

  def findHumanByName(name: String): Option[Human] = {
    humans.find(_.name == name)
  }

  def filterHumans(predicate: Human => Boolean): List[Human] = {
    humans.filter(predicate).toList
  }

  def printAllHumans(): Unit = {
    humans.foreach(human => println(s"Name: ${human.name}, Age: ${human.age}"))
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val listHuman = new ListHuman()

    listHuman.addHuman("Sasha", 45)
    listHuman.addHuman("Oleg", 24)
    listHuman.addHuman("Amogus", 19)

    println("All Humans:")
    listHuman.printAllHumans()

    val findResult = listHuman.findHumanByName("Sasha")
    findResult match {
      case Some(human) => println(s"Found Human: Name: ${human.name}, Age: ${human.age}")
      case None => println("Human not found")
    }

    listHuman.deleteHumanByName("Amogus")

    println("Younger than 30:")
    val filteredHumans = listHuman.filterHumans(_.age < 30)
    filteredHumans.foreach(human => println(s"Name: ${human.name}, Age: ${human.age}"))
  }
}