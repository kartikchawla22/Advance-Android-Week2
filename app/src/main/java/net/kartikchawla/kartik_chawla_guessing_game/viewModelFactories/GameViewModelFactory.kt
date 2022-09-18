package net.kartikchawla.kartik_chawla_guessing_game.viewModelFactories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import net.kartikchawla.kartik_chawla_guessing_game.viewModels.GameViewModel

class GameViewModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(GameViewModel::class.java))
            return GameViewModel() as T
        throw IllegalArgumentException("Unknown ViewModel")
    }
}