package kazzak.kirill.domain

interface ShopListRepository {

    fun getShopList(): List<ShopItem>
    fun addItemToShopList(shopItem: Int)
    fun deleteItemFromShopList(shopItem: Int)
    fun changeItem(shopItem: Int)
    fun getItemFromId(shopItemId: Int)
}