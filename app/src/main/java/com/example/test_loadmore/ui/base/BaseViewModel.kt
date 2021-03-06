package com.example.test_loadmore.ui.base

import androidx.lifecycle.ViewModel

import javax.inject.Inject


/**
 * Created by AhmedEltaher
 */


abstract class BaseViewModel : ViewModel() {
    /**Inject Singleton ErrorManager
     * Use this errorManager to get the Errors
     */
    @Inject
    lateinit var errorManager: com.example.test_loadmore.error.ErrorManager
}
