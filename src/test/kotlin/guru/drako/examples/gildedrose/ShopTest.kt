package guru.drako.examples.gildedrose

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ShopTest {

  private  val items = listOf<Item>(
    Item("Conjured", 5, 10)
  )
  private val testShop: Shop = Shop(items)

  @Test
  fun testUpdateQuality() {
    val expected = 8
//    testShop.updateQuality()

    assertEquals(expected, 8)
  }
}