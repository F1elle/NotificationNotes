package com.f1elle.notificationnotes.feature_reminders.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title: String,
    val note: String,
    @PrimaryKey val id: Int? = null
)
