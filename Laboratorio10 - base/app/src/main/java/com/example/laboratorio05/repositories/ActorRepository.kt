package com.example.laboratorio05.repositories

import com.example.laboratorio05.data.dao.ActorDao
import com.example.laboratorio05.data.model.ActorModel
import com.example.laboratorio05.data.model.MovieModel

class ActorRepository(private val actorDao: ActorDao) {

    suspend fun getActors() = actorDao.getAllActor()

    suspend fun addActor(actor: ActorModel) = actorDao.insertActor(actor)

}