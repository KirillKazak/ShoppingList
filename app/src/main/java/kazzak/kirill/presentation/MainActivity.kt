package kazzak.kirill.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import kazzak.kirill.R
import kazzak.kirill.domain.ShopItem
import kazzak.kirill.presentation.viewModels.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.shopListLiveData.observe(this) {
            Log.d("MAIN_TAG", it.toString())
        }
        viewModel.getShopList()
//        viewModel.deleteShopItem(viewModel.shopListLiveData.value?.get(0)!!)
        viewModel.changeEnabledState(viewModel.shopListLiveData.value?.get(2)!!)
    }
}