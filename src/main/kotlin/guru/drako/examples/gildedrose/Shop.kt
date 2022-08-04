package guru.drako.examples.gildedrose


class Shop(val items: List<Item>) {
  fun updateQuality() {
    for (item in items) {
      // Update the quality of the item
      item.quality = Utils.updateItemQuality(item.name, item.sellIn, item.quality)
      // One day pass, reduce the sell-in value by one
      if (!Utils.checkItem(item.name, "Sulfuras")) item.sellIn--
      // Check the sell-in, if pass then update the quality
      if (item.sellIn < 0) item.quality = Utils.updateItemQuality(item.name, item.sellIn, item.quality)

    }
  }
}
