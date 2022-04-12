package uz.project.myapplication.presenter.result_screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import uz.project.myapplication.R
import uz.project.myapplication.databinding.FragmentResultBinding
import uz.project.myapplication.utils.scope

class ResultFragment : Fragment(R.layout.fragment_main) {
    private val binding: FragmentResultBinding by viewBinding(FragmentResultBinding::bind)
    private val viewModel by viewModel<ResultViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = binding.scope {
        super.onViewCreated(view, savedInstanceState)

    }
}