package com.kuiaski.greetings.controllers

import com.kuiaski.greetings.entities.Translation
import com.kuiaski.greetings.repositories.TranslationRepository

import org.springframework.http.HttpStatus.*
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/translate")
class TranslationController(private val repository: TranslationRepository) {

  @GetMapping("/{originalLanguage}/{translatedLanguage}/{original}")
  fun findOne(@PathVariable("originalLanguage") originalLanguage: String, @PathVariable("translatedLanguage") translatedLanguage: String, @PathVariable("original") original: String): Translation {
    println(originalLanguage + " to " + translatedLanguage + " of " + original)
    return repository.findByOriginalAndOriginalLanguageAndTranslatedLanguage(original, originalLanguage, translatedLanguage) ?: throw ResponseStatusException(NOT_FOUND, "This translation does not exist")
  }
}