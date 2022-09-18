package net.kartikchawla.kartik_chawla_guessing_game.viewModelFactories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import net.kartikchawla.kartik_chawla_guessing_game.viewModels.ResultViewModel

class ResultViewModelFactory(private val finalResult: String): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ResultViewModel::class.java))
            return ResultViewModel(finalResult) as T
        throw IllegalArgumentException("Unknown ViewModel")
    }
}