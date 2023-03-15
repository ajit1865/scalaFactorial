import org.scalatest.funsuite.AnyFunSuite

class TestFactorial extends AnyFunSuite {
  test("scala test1") {
    assert(FactorialOfNumber.factorial(0) == 1)
  }
  test("scala test2") {
    assert(FactorialOfNumber.factorial(1) == 1)
  }
  test("scala test3") {
    assert(FactorialOfNumber.factorial(5) == 120)
  }
  test("scala test4") {
    assert(FactorialOfNumber.factorial(10) == 3628800)
  }
  test("scala test5") {
    assertThrows[IllegalArgumentException](FactorialOfNumber.factorial(-1))
  }
}