package com.rmnivnv.cryptomoon.ui.main

import android.content.Intent

/**
 * Created by rmnivnv on 06/07/2017.
 */
interface IMain {

    interface View {
        fun setCoinsLoadingVisibility(isLoading: Boolean)
        fun startActivityFromIntent(intent: Intent)
        fun setMenuIconsVisibility(isSelected: Boolean)
    }

    interface Presenter {
        fun onCreate()
        fun onDestroy()
        fun onAddCoinClicked()
        fun onSettingsClicked()
        fun onDeleteClicked()
        fun onPageSelected(position: Int)
    }
}