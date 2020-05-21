package com.kuiaski.greetings.entities

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table

@Entity
@Table(name = "translation", schema = "public")
public class Translation (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID,

    @Column(name="original_language", nullable = false)
    val originalLanguage: String,

    @Column(nullable = false)
    val original: String,

    @Column(name="translated_language", nullable = false)
    val translatedLanguage: String,

    @Column(nullable = false)
    val translated: String
)