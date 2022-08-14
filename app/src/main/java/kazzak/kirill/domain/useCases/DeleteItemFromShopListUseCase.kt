package kazzak.kirill.domain.useCases

import kazzak.kirill.domain.ShopItem
import kazzak.kirill.domain.ShopListRepository

class DeleteItemFromShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteItemFromShopList(shopItem: ShopItem) {
        shopListRepository.deleteItemFromShopList(shopItem)
    }
}