@file:JvmName("Twofer")

fun twofer(input: String?): String {
    return if (input == null) {
        "One for you, one for me."
    } else {
        "One for $input, one for me."
    }
}