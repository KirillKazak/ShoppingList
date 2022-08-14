package kazzak.kirill.domain.useCases

import kazzak.kirill.domain.ShopItem
import kazzak.kirill.domain.ShopListRepository

class GetItemFromIdUseCase(private val shopListRepository: ShopListRepository) {

    fun getItemFromId(shopItemId: Int): ShopItem {
        return shopListRepository.getItemFromId(shopItemId)
    }
}