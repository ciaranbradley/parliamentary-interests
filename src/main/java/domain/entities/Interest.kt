package domain.entities

import java.util.*

data class Interest(val category: String,
                    val data: String,
                    val dateAdded: Date,
                    val dateRemoved: Date)