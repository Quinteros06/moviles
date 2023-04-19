package com.example.laboratorio_05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class primeroFragment : Fragment() {
    private lateinit var floatingActionButton: FloatingActionButton
    private lateinit var CardView: CardView
    private lateinit var Button: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedState: Bundle?
    ): View{
        return inflater.inflate(R.layout.fragment_primero,container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        bindFloating()
        bindCard()
        bindButton()
        floatingActionButton.setOnClickListener{
            it.findNavController().navigate(R.id.action_primeroFragment_to_segundoFragment)
        }

        CardView.setOnClickListener{
            it.findNavController().navigate(R.id.action_primeroFragment_to_segundoFragment)
        }

        Button.setOnClickListener{
            it.findNavController().navigate(R.id.action_primeroFragment_to_segundoFragment)
        }
    }

    private fun bindFloating(){
        floatingActionButton = view?.findViewById(R.id.floatingActionButton) as FloatingActionButton
    }

    private fun bindCard(){
        CardView = view?.findViewById(R.id.cardView) as CardView
    }

    private fun bindButton(){
        Button = view?.findViewById(R.id.button) as Button
    }
}