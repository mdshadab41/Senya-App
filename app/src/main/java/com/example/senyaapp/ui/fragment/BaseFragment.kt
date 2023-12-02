package com.example.senyaapp.ui.fragment

import androidx.fragment.app.Fragment
import com.example.senyaapp.ui.MainActivity

abstract class BaseFragment: Fragment() {

    protected val navController by lazy {
        (activity as MainActivity).navController
    }
}