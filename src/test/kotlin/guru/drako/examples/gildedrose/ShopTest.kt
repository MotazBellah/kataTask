package guru.drako.examples.gildedrose

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ShopTest {

  private val shop = Shop(items = listOf(
    Item(name = "+5 Dexterity Vest", sellIn = 110, quality = 40),
    Item(name = "Aged Brie", sellIn = 110, quality = 2),
    Item(name = "Elixir of the Mongoose", sellIn = 110, quality = 7),
    Item(name = "Sulfuras, Hand of Ragnaros", sellIn = 110, quality = 80),
    Item(name = "Backstage passes to a TAFKAL80ETC concert", sellIn = 81, quality = 20),
    Item(name = "Conjured Mana Cake", sellIn = 10, quality = 20)
  ))

  private val sellPass = Shop(items = listOf(
    Item(name = "+5 Dexterity Vest", sellIn = 0, quality = 40),
    Item(name = "Aged Brie", sellIn = 0, quality = 2),
    Item(name = "Elixir of the Mongoose", sellIn = 0, quality = 7),
    Item(name = "Sulfuras, Hand of Ragnaros", sellIn = 0, quality = 80),
    Item(name = "Backstage passes to a TAFKAL80ETC concert", sellIn = 0, quality = 20),
    Item(name = "Conjured Mana Cake", sellIn = 0, quality = 20)
  ))

  @Test
  fun testUpdateQuality() {

    shop.updateQuality()

    assertEquals(39, shop.items[0].quality)
    assertEquals(3, shop.items[1].quality)
    assertEquals(6, shop.items[2].quality)
    assertEquals(80, shop.items[3].quality)
    assertEquals(21, shop.items[4].quality)
    assertEquals(18, shop.items[5].quality)

  }

  @Test
  fun testUpdateQualityAfterPass() {

    sellPass.updateQuality()

    assertEquals(38, sellPass.items[0].quality)
    assertEquals(4, sellPass.items[1].quality)
    assertEquals(5, sellPass.items[2].quality)
    assertEquals(80, sellPass.items[3].quality)
    assertEquals(0, sellPass.items[4].quality)
    assertEquals(16, sellPass.items[5].quality)

  }

}