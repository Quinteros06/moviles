package com.example.laboratorio05.ui.movie

import android.nfc.Tag
import android.os.Bundle
import android.os.ParcelFileDescriptor
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.example.laboratorio05.R
import com.example.laboratorio05.data.model.MovieModel
import com.example.laboratorio05.data.model.description2
import com.google.android.material.tabs.TabLayout.TabGravity

/**
 * A simple [Fragment] subclass.
 * Use the [thirdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class thirdFragment : Fragment() {

    private lateinit var name: EditText
    private lateinit var category: EditText
    private lateinit var description: EditText
    private lateinit var qualification: EditText
    private lateinit var submit: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        submitMovie()

    }

    private val MovieViewModels: MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }

    private fun bind() {
        name = view?.findViewById(R.id.editTextTextPersonName)!!
        category = view?.findViewById(R.id.editTextTextCategory)!!
        description = view?.findViewById(R.id.editTextTextDescription)!!
        qualification = view?.findViewById(R.id.editTextTextCalification)!!
        submit = view?.findViewById(R.id.button)!!
    }

    private fun submitMovie(){
        submit.setOnClickListener{
            var nameMovie = name.text
            var categoryMovie = category.text
            var descriptionMovie = description.text
            var qualificationMovie = qualification.text

            var newMovie = MovieModel(nameMovie.toString(), categoryMovie.toString(), descriptionMovie.toString(), qualificationMovie.toString())
            MovieViewModels.addMovies(newMovie)
            getMovie()
        }
    }

    private fun getMovie(){
        Log.i("Lista de peliculas", MovieViewModels.getMovies().toString())
    }

}