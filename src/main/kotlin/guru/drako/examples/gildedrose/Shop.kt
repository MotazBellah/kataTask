package guru.drako.examples.gildedrose


class Shop(val items: List<Item>) {
  fun updateQuality() {
    for (item in items) {

      // Update the system, by adding new feature
      when {
        // Aged Brie actually increases in quality the older it gets
        Utils.checkItem(item.name, "Aged Brie") -> if (item.quality < 50)  ++item.quality
        // Backstage passes, like aged brie, increases in quality as its sellIn value approaches
        Utils.checkItem(item.name, "Backstage passes") -> item.quality = Utils.sellInCheck(item.sellIn, item.quality)
        // "Conjured" items degrade in quality twice as fast as normal items
        (Utils.checkItem(item.name, "Conjured") && (item.quality > 0)) -> if (item.quality >= 2)  item.quality -= 2 else item.quality--
        // "Sulfuras", being a legendary item, never has to be sold or decreases in quality
        else -> if (!Utils.checkItem(item.name, "Sulfuras") && (item.quality > 0)) item.quality -= 1
      }


      if (!Utils.checkItem(item.name, "Sulfuras")) item.sellIn--


      if (item.sellIn < 0) {
        when {
          (Utils.checkItem(item.name, "Aged Brie") && (item.quality < 50)) -> ++item.quality
          (Utils.checkItem(item.name, "Backstage passes")) -> item.quality -= item.quality
          else -> if (
                      (item.quality > 0)
                      && !Utils.checkItem(item.name, "Sulfuras")
                      ) item.quality--

        }
      }
    }
  }
}
