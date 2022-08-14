package kazzak.kirill.domain.useCases

import kazzak.kirill.domain.ShopItem
import kazzak.kirill.domain.ShopListRepository

class GetItemFromIdIseCase(private val shopListRepository: ShopListRepository) {

    fun getItemFromId(shopItemId: Int) {
        shopListRepository.getItemFromId(shopItemId)
    }
}