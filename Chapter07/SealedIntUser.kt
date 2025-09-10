sealed interface UserRole

object Admin : UserRole {

    fun addBook(title: String, author: String) {
        println("Book '$title' by $author added.")
    }

    fun deleteBook(title: String) {
        println("Book '$title' deleted.")
    }

}

object Editor : UserRole {
    fun editBook(title: String, newDetails: String) {
        println("Book '$title' updated with new details: $newDetails")
    }
}

objectReader : UserRole {
    fun readBook(title: String) {
        println("Reading book: $title")
    }

}

fun handleUserAction(user: UserRole, action: String, bookTitle: String, details: String? = null) {

    when (user) {
        is Admin -> {
            if (action == "add") user.addBook(bookTitle, details ?: "Unknown Author")
            if (action == "delete") user.deleteBook(bookTitle)
        }

        is Editor -> {
            if (action == "edit") user.editBook(bookTitle, details ?: "No details provided")
        }

        is Reader -> {
            if (action == "read") user.readBook(bookTitle)
        }

    }

}
