package kazzak.kirill.domain.useCases

import kazzak.kirill.domain.ShopListRepository

class DeleteItemFromShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteItemFromShopList(shopItem: Int) {
        shopListRepository.deleteItemFromShopList(shopItem)
    }
}