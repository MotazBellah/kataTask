package guru.drako.examples.gildedrose

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ShopTest {

  private  val items = listOf<Item>(
    Item("Conjured", 5, 10),
    Item("Conjured", 0, 10)
  )
  private val testShop: Shop = Shop(items)

  @Test
  fun testUpdateQuality() {
    val expected = 8
    testShop.updateQuality()

    assertEquals(expected, testShop.items[0].quality)
  }

  @Test
  fun testSillIn() {
    val expected = 6
    testShop.updateQuality()

    assertEquals(expected, testShop.items[1].quality)
  }
}