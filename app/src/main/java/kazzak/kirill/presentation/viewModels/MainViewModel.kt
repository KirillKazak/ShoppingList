package kazzak.kirill.presentation.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kazzak.kirill.data.ShopListRepositoryImpl
import kazzak.kirill.domain.ShopItem
import kazzak.kirill.domain.useCases.ChangeItemUseCase
import kazzak.kirill.domain.useCases.DeleteItemFromShopListUseCase
import kazzak.kirill.domain.useCases.GetShopListUseCase

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteItemFromShopListUseCase = DeleteItemFromShopListUseCase(repository)
    private val changeEnabledStateUseCase = ChangeItemUseCase(repository)

    val shopListLiveData = MutableLiveData<List<ShopItem>>()

    fun getShopList() {
        shopListLiveData.value = getShopListUseCase.getShopList()
    }

    fun deleteShopItem(shopItem: ShopItem) {
        deleteItemFromShopListUseCase.deleteItemFromShopList(shopItem)
        getShopList()
    }

    fun changeEnabledState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        changeEnabledStateUseCase.changeItem(newItem)
        getShopList()
    }
}