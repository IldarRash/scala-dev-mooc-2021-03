package module1

object functions {


  /**
   * Функции
   */



  // SAM Single Abstract Method


  trait Function1[Int, Int]{ def apply(x: Int): Int}



  /**
   *  Задание 1. Написать ф-цию метод isEven, которая будет вычислять является ли число четным
   */


  /**
   * Задание 2. Написать ф-цию метод isOdd, которая будет вычислять является ли число нечетным
   */



  /**
   * Задание 3. Написать ф-цию метод filterEven, которая получает на вход массив чисел и возвращает массив тех из них,
   * которые являются четными
   */



  /**
   * Задание 3. Написать ф-цию метод filterOdd, которая получает на вход массив чисел и возвращает массив тех из них,
   * которые являются нечетными
   */


  /**
   * return statement
   *
   *
   * val two = (x: Int) => { return x; 2 }
   *
   *
   * def sumItUp: Int = {
   *    def one(x: Int): Int = { return x; 1 }
   *    val two = (x: Int) => { return x; 2 }
   *    1 + one(2) + two(3)
   * }
   */



}
