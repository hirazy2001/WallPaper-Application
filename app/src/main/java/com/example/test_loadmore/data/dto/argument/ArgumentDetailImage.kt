package com.example.test_loadmore.data.dto.argument

import com.example.test_loadmore.base.OBase
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class ArgumentDetailImage(
    @SerializedName("id")
    var id: Int  = 0,

    var type: Int = 0): OBase()