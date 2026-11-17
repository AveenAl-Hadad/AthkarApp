
package com.athkar.app.model

/**
 * Datenmodell für einen einzelnen Dhikr.
 */
data class Dhikr(
    val id: Int,
    val arabicText: String,
    val germanTranslation: String,
    val transliteration: String,
    val repeatCount: Int
)
