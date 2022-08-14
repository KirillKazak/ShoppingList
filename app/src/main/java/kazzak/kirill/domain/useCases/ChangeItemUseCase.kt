package kazzak.kirill.domain.useCases

import kazzak.kirill.domain.ShopItem
import kazzak.kirill.domain.ShopListRepository

class ChangeItemUseCase(private val shopListRepository: ShopListRepository) {

    fun changeItem(shopItem: ShopItem) {
        shopListRepository.changeItem(shopItem)
    }
}