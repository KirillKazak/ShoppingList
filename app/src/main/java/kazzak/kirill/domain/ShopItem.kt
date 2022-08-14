package kazzak.kirill.domain

import java.net.IDN

data class ShopItem (
    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean
        )