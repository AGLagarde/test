package com.example.bonni.ben.NavigationBottomBar.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bonni.ben.R


class LikeFragment : Fragment() {
  companion object {

    fun newInstance(): LikeFragment {
      return LikeFragment()
    }
  }


  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater?.inflate(R.layout.fragment_like, container, false)
  }
}
