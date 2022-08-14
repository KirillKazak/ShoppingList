package kazzak.kirill.domain.useCases

import kazzak.kirill.domain.ShopItem
import kazzak.kirill.domain.ShopListRepository

class AddItemToShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun addItemToShopList(shopItem: ShopItem) {
       shopListRepository.addItemToShopList(shopItem)
    }
}