object Main {
  def main(args: Array[String]): Unit = {
    (1 to 5).map(println)

    for (i <- 1 to 5) {
      println(s"i = $i")
    }
    JavaStuff.printMessage()
  }
}

