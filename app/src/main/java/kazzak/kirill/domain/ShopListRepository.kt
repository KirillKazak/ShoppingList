package kazzak.kirill.domain

interface ShopListRepository {

    fun getShopList(): List<ShopItem>
    fun addItemToShopList(shopItem: ShopItem)
    fun deleteItemFromShopList(shopItem: ShopItem)
    fun changeItem(shopItem: ShopItem)
    fun getItemFromId(shopItemId: Int): ShopItem
}