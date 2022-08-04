package guru.drako.examples.gildedrose

fun main() {
  println("OMGHAI!")

  val shop = Shop(items = listOf(
    Item(name = "+5 Dexterity Vest", sellIn = 110, quality = 40),
    Item(name = "Aged Brie", sellIn = 110, quality = 0),
    Item(name = "Elixir of the Mongoose", sellIn = 0, quality = 7),
    Item(name = "Sulfuras, Hand of Ragnaros", sellIn = 110, quality = 80),
    Item(name = "Backstage passes to a TAFKAL80ETC concert", sellIn = 81, quality = 20),
    Item(name = "Conjured Mana Cake", sellIn = 10, quality = 20)
  ))

  println("Running shop for a day...")
  shop.updateQuality()
  println("Done.")

  println("Current items:")
  shop.items.forEach(::println)
}
