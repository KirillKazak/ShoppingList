package kazzak.kirill.domain.useCases

import kazzak.kirill.domain.ShopListRepository

class AddItemToShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun addItemToShopList(shopItem: Int) {
       shopListRepository.addItemToShopList(shopItem)
    }
}