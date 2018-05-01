@file:JvmName("ReverseString")

fun main(args: Array<String>) {
    print(reverse("robot"))
}

fun reverse(input: String): String {
    var result = ""
    for (i in input.length-1 downTo 0) {
        result += input.get(i)
    }
    return result
}