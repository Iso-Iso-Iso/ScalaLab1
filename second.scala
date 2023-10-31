class Address(val street: String, val city: String, val houseNum: Int) {
  override def toString: String = s"$houseNum $street, $city"
}

class Human(val firstName: String, val lastName: String, val age: Int, val address: Address) {
  def displayInfo(): Unit = {
    println(s"Ім'я: $firstName")
    println(s"Прізвище: $lastName")
    println(s"Вік: $age")
    println(s"Адреса: ${address.toString}")
  }
}

object MyApp {
  def main(args: Array[String]): Unit = {
    val address = new Address("Вулиця", "Узька", 30)
    val human = new Human("Olex", "Slavniy", 19, address)
    human.displayInfo()
  }
}