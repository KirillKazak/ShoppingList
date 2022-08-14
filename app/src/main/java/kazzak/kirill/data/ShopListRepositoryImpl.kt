package kazzak.kirill.data

import kazzak.kirill.domain.ShopItem
import kazzak.kirill.domain.ShopListRepository
import java.lang.RuntimeException

object ShopListRepositoryImpl: ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()
    private var autoIncrementId = 0

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }

    override fun addItemToShopList(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun deleteItemFromShopList(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun changeItem(shopItem: ShopItem) {
        val oldItem = getItemFromId(shopItem.id)
        shopList.remove(oldItem)
        addItemToShopList(shopItem)
    }

    override fun getItemFromId(shopItemId: Int): ShopItem {
        return shopList.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Element with id: $shopItemId not found")
    }
}