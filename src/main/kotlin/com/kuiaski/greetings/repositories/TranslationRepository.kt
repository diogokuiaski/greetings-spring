package com.kuiaski.greetings.repositories

import org.springframework.data.repository.CrudRepository
import com.kuiaski.greetings.entities.Translation
import java.util.UUID

interface TranslationRepository : CrudRepository<Translation, UUID> {
    fun findByOriginalAndOriginalLanguageAndTranslatedLanguage(original: String, originalLanguage: String, translatedLanguage: String): Translation?
}