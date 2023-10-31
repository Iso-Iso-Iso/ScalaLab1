object Main extends App {
  val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val minNum = nums.min
  val maxNum = nums.max
  val filterNums = nums.filter(_ < 5)
  val findNum = nums.find(_ % 5 == 0)
  val five = nums.exists(_ == 5)
  val firstNum = nums.head
  val withoutFirstNum = nums.tail
  val average = nums.sum.toDouble / nums.length

  println(s"Min Number: $minNum")
  println(s"Max Number: $maxNum")
  println(s"Numbers < 5: ${filterNums.mkString(", ")}")
  println(s"Number that / 5: $findNum")
  println(s"find 5: $five")
  println(s"First Number: $firstNum")
  println(s"List Without First number: ${withoutFirstNum.mkString(", ")}")
  println(s"AVG: $average")
}