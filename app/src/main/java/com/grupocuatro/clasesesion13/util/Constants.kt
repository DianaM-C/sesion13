package com.grupocuatro.clasesesion13.util

object FireStoreCollection {
    val SCORE = "score"
    val USER = "user"
}

object FireDatabase {
    val DATE = "date"
    val USER_ID = "user_id"
}

object SharePrefConstants {
    val LOCAL_SHARED_PREF = "local_shared_pref"
    val USER_SESSION = "user_session"
}

object FirebaseStorageConstants {
    val ROOT_DIRECTORY = "app"
    val SCORE_IMAGE = "score_image"
}

enum class HomeTabs(val index: Int, val key: String) {
    SCORES(0, "scores"),
    TASKS(1, "tasks")
}