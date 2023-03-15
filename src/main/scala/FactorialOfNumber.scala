import scala.annotation.tailrec
import scala.jdk.Accumulator

object FactorialOfNumber {
  def factorial(number: Int): BigInt = {
    if (number < 0) throw new IllegalArgumentException()
    else {
      @tailrec
      def anotherFactorial(num: Int, accumulator: BigInt = 0): BigInt =
        if (num <= 1) accumulator
        else
          anotherFactorial(num - 1, num * accumulator)

      anotherFactorial(number, 1)
    }


  }

}
