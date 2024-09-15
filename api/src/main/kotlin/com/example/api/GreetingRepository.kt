package com.example.api

import com.example.api.entities.GreetingEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
interface GreetingRepository : JpaRepository<GreetingEntity, String> {
    fun findFirstByLang(lang: String): GreetingEntity
}