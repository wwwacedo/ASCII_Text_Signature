package signature

const val BOARD = "8"
const val SPACE = " "

enum class Roman(val font: MutableList<String>) {
    a(
        mutableListOf(
            "          ",
            "          ",
            " .oooo.   ",
            "`P  )88b  ",
            " .oP\"888  ",
            "d8(  888  ",
            "`Y888\"\"8o ",
            "          ",
            "          ",
            "          "
        )
    ),
    b(
        mutableListOf(
            " .o8       ",
            "\"888       ",
            " 888oooo.  ",
            " d88' `88b ",
            " 888   888 ",
            " 888   888 ",
            " `Y8bod8P' ",
            "           ",
            "           ",
            "           "
        )
    ),
    c(
        mutableListOf(
            "          ",
            "          ",
            " .ooooo.  ",
            "d88' `\"Y8 ",
            "888       ",
            "888   .o8 ",
            "`Y8bod8P' ",
            "          ",
            "          ",
            "          "
        )
    ),
    d(
        mutableListOf(
            "      .o8  ",
            "     \"888  ",
            " .oooo888  ",
            "d88' `888  ",
            "888   888  ",
            "888   888  ",
            "`Y8bod88P\" ",
            "           ",
            "           ",
            "           "
        )
    ),
    e(
        mutableListOf(
            "          ",
            "          ",
            " .ooooo.  ",
            "d88' `88b ",
            "888ooo888 ",
            "888    .o ",
            "`Y8bod8P' ",
            "          ",
            "          ",
            "          "
        )
    ),
    f(
        mutableListOf(
            " .o88o. ",
            " 888 `\" ",
            "o888oo  ",
            " 888    ",
            " 888    ",
            " 888    ",
            "o888o   ",
            "        ",
            "        ",
            "        "
        )
    ),
    g(
        mutableListOf(
            "           ",
            "           ",
            " .oooooooo ",
            "888' `88b  ",
            "888   888  ",
            "`88bod8P'  ",
            "`8oooooo.  ",
            "d\"     YD  ",
            "\"Y88888P'  ",
            "           "
        )
    ),
    h(
        mutableListOf(
            "oooo        ",
            "`888        ",
            " 888 .oo.   ",
            " 888P\"Y88b  ",
            " 888   888  ",
            " 888   888  ",
            "o888o o888o ",
            "            ",
            "            ",
            "            "
        )
    ),
    i(
        mutableListOf(
            " o8o  ",
            " `\"'  ",
            "oooo  ",
            "`888  ",
            " 888  ",
            " 888  ",
            "o888o ",
            "      ",
            "      ",
            "      "
        )
    ),
    j(
        mutableListOf(
            "    o8o ",
            "    `\"' ",
            "   oooo ",
            "   `888 ",
            "    888 ",
            "    888 ",
            "    888 ",
            "    888 ",
            ".o. 88P ",
            "`Y888P  "
        )
    ),
    k(
        mutableListOf(
            "oooo        ",
            "`888        ",
            " 888  oooo  ",
            " 888 .8P'   ",
            " 888888.    ",
            " 888 `88b.  ",
            "o888o o888o ",
            "            ",
            "            ",
            "            "
        )
    ),
    l(
        mutableListOf(
            "oooo  ",
            "`888  ",
            " 888  ",
            " 888  ",
            " 888  ",
            " 888  ",
            "o888o ",
            "      ",
            "      ",
            "      "
        )
    ),
    m(
        mutableListOf(
            "                  ",
            "                  ",
            "ooo. .oo.  .oo.   ",
            "`888P\"Y88bP\"Y88b  ",
            " 888   888   888  ",
            " 888   888   888  ",
            "o888o o888o o888o ",
            "                  ",
            "                  ",
            "                  "
        )
    ),
    n(
        mutableListOf(
            "            ",
            "            ",
            "ooo. .oo.   ",
            "`888P\"Y88b  ",
            " 888   888  ",
            " 888   888  ",
            "o888o o888o ",
            "            ",
            "            ",
            "            "
        )
    ),
    o(
        mutableListOf(
            "          ",
            "          ",
            " .ooooo.  ",
            "d88' `88b ",
            "888   888 ",
            "888   888 ",
            "`Y8bod8P' ",
            "          ",
            "          ",
            "          "
        )
    ),
    p(
        mutableListOf(
            "           ",
            "           ",
            "oo.ooooo.  ",
            " 888' `88b ",
            " 888   888 ",
            " 888   888 ",
            " 888bod8P' ",
            " 888       ",
            "o888o      ",
            "           "
        )
    ),
    q(
        mutableListOf(
            "           ",
            "           ",
            " .ooooo oo ",
            "d88' `888  ",
            "888   888  ",
            "888   888  ",
            "`V8bod888  ",
            "      888. ",
            "      8P'  ",
            "      \"    "
        )
    ),
    r(
        mutableListOf(
            "         ",
            "         ",
            "oooo d8b ",
            "`888\"\"8P ",
            " 888     ",
            " 888     ",
            "d888b    ",
            "         ",
            "         ",
            "         "
        )
    ),
    s(
        mutableListOf(
            "         ",
            "         ",
            " .oooo.o ",
            "d88(  \"8 ",
            "`\"Y88b.  ",
            "o.  )88b ",
            "8\"\"888P' ",
            "         ",
            "         ",
            "         "
        )
    ),
    t(
        mutableListOf(
            "    .   ",
            "  .o8   ",
            ".o888oo ",
            "  888   ",
            "  888   ",
            "  888 . ",
            "  \"888\" ",
            "        ",
            "        ",
            "        "
        )
    ),
    u(
        mutableListOf(
            "            ",
            "            ",
            "oooo  oooo  ",
            "`888  `888  ",
            " 888   888  ",
            " 888   888  ",
            " `V88V\"V8P' ",
            "            ",
            "            ",
            "            "
        )
    ),
    v(
        mutableListOf(
            "            ",
            "            ",
            "oooo    ooo ",
            " `88.  .8'  ",
            "  `88..8'   ",
            "   `888'    ",
            "    `8'     ",
            "            ",
            "            ",
            "            "
        )
    ),
    w(
        mutableListOf(
            "                 ",
            "                 ",
            "oooo oooo    ooo ",
            " `88. `88.  .8'  ",
            "  `88..]88..8'   ",
            "   `888'`888'    ",
            "    `8'  `8'     ",
            "                 ",
            "                 ",
            "                 "
        )
    ),
    x(
        mutableListOf(
            "            ",
            "            ",
            "oooo    ooo ",
            " `88b..8P'  ",
            "   Y888'    ",
            " .o8\"'88b   ",
            "o88'   888o ",
            "            ",
            "            ",
            "            "
        )
    ),
    y(
        mutableListOf(
            "            ",
            "            ",
            "oooo    ooo ",
            " `88.  .8'  ",
            "  `88..8'   ",
            "   `888'    ",
            "    .8'     ",
            ".o..P'      ",
            "`Y8P'       ",
            "            "
        )
    ),
    z(
        mutableListOf(
            "           ",
            "           ",
            "  oooooooo ",
            " d'\"\"7d8P  ",
            "   .d8P'   ",
            " .d8P'  .P ",
            "d8888888P  ",
            "           ",
            "           ",
            "           "
        )
    ),
    A(
        mutableListOf(
            "      .o.       ",
            "     .888.      ",
            "    .8\"888.     ",
            "   .8' `888.    ",
            "  .88ooo8888.   ",
            " .8'     `888.  ",
            "o88o     o8888o ",
            "                ",
            "                ",
            "                "
        )
    ),
    B(
        mutableListOf(
            "oooooooooo.  ",
            "`888'   `Y8b ",
            " 888     888 ",
            " 888oooo888' ",
            " 888    `88b ",
            " 888    .88P ",
            "o888bood8P'  ",
            "             ",
            "             ",
            "             "
        )
    ),
    C(
        mutableListOf(
            "  .oooooo.   ",
            " d8P'  `Y8b  ",
            "888          ",
            "888          ",
            "888          ",
            "`88b    ooo  ",
            " `Y8bood8P'  ",
            "             ",
            "             ",
            "             "
        )
    ),
    D(
        mutableListOf(
            "oooooooooo.   ",
            "`888'   `Y8b  ",
            " 888      888 ",
            " 888      888 ",
            " 888      888 ",
            " 888     d88' ",
            "o888bood8P'   ",
            "              ",
            "              ",
            "              "
        )
    ),
    E(
        mutableListOf(
            "oooooooooooo ",
            "`888'     `8 ",
            " 888         ",
            " 888oooo8    ",
            " 888    \"    ",
            " 888       o ",
            "o888ooooood8 ",
            "             ",
            "             ",
            "             "
        )
    ),
    F(
        mutableListOf(
            "oooooooooooo ",
            "`888'     `8 ",
            " 888         ",
            " 888oooo8    ",
            " 888    \"    ",
            " 888         ",
            "o888o        ",
            "             ",
            "             ",
            "             "
        )
    ),
    G(
        mutableListOf(
            "  .oooooo.    ",
            " d8P'  `Y8b   ",
            "888           ",
            "888           ",
            "888     ooooo ",
            "`88.    .88'  ",
            " `Y8bood8P'   ",
            "              ",
            "              ",
            "              "
        )
    ),
    H(
        mutableListOf(
            "ooooo   ooooo ",
            "`888'   `888' ",
            " 888     888  ",
            " 888ooooo888  ",
            " 888     888  ",
            " 888     888  ",
            "o888o   o888o ",
            "              ",
            "              ",
            "              "
        )
    ),
    I(
        mutableListOf(
            "ooooo ",
            "`888' ",
            " 888  ",
            " 888  ",
            " 888  ",
            " 888  ",
            "o888o ",
            "      ",
            "      ",
            "      "
        )
    ),
    J(
        mutableListOf(
            "   oooo ",
            "   `888 ",
            "    888 ",
            "    888 ",
            "    888 ",
            "    888 ",
            ".o. 88P ",
            "`Y888P  ",
            "        ",
            "        "
        )
    ),
    K(
        mutableListOf(
            "oooo    oooo ",
            "`888   .8P'  ",
            " 888  d8'    ",
            " 88888[      ",
            " 888`88b.    ",
            " 888  `88b.  ",
            "o888o  o888o ",
            "             ",
            "             ",
            "             "
        )
    ),
    L(
        mutableListOf(
            "ooooo        ",
            "`888'        ",
            " 888         ",
            " 888         ",
            " 888         ",
            " 888       o ",
            "o888ooooood8 ",
            "             ",
            "             ",
            "             "
        )
    ),
    M(
        mutableListOf(
            "ooo        ooooo ",
            "`88.       .888' ",
            " 888b     d'888  ",
            " 8 Y88. .P  888  ",
            " 8  `888'   888  ",
            " 8    Y     888  ",
            "o8o        o888o ",
            "                 ",
            "                 ",
            "                 "
        )
    ),
    N(
        mutableListOf(
            "ooooo      ooo ",
            "`888b.     `8' ",
            " 8 `88b.    8  ",
            " 8   `88b.  8  ",
            " 8     `88b.8  ",
            " 8       `888  ",
            "o8o        `8  ",
            "               ",
            "               ",
            "               "
        )
    ),
    O(
        mutableListOf(
            "  .oooooo.   ",
            " d8P'  `Y8b  ",
            "888      888 ",
            "888      888 ",
            "888      888 ",
            "`88b    d88' ",
            " `Y8bood8P'  ",
            "             ",
            "             ",
            "             "
        )
    ),
    P(
        mutableListOf(
            "ooooooooo.   ",
            "`888   `Y88. ",
            " 888   .d88' ",
            " 888ooo88P'  ",
            " 888         ",
            " 888         ",
            "o888o        ",
            "             ",
            "             ",
            "             "
        )
    ),
    Q(
        mutableListOf(
            "  .oooooo.      ",
            " d8P'  `Y8b     ",
            "888      888    ",
            "888      888    ",
            "888      888    ",
            "`88b    d88b    ",
            " `Y8bood8P'Ybd' ",
            "                ",
            "                ",
            "                "
        )
    ),
    R(
        mutableListOf(
            "ooooooooo.   ",
            "`888   `Y88. ",
            " 888   .d88' ",
            " 888ooo88P'  ",
            " 888`88b.    ",
            " 888  `88b.  ",
            "o888o  o888o ",
            "             ",
            "             ",
            "             "
        )
    ),
    S(
        mutableListOf(
            " .oooooo..o ",
            "d8P'    `Y8 ",
            "Y88bo.      ",
            " `\"Y8888o.  ",
            "     `\"Y88b ",
            "oo     .d8P ",
            "8\"\"88888P'  ",
            "            ",
            "            ",
            "            "
        )
    ),
    T(
        mutableListOf(
            "ooooooooooooo ",
            "8'   888   `8 ",
            "     888      ",
            "     888      ",
            "     888      ",
            "     888      ",
            "    o888o     ",
            "              ",
            "              ",
            "              "
        )
    ),
    U(
        mutableListOf(
            "ooooo     ooo ",
            "`888'     `8' ",
            " 888       8  ",
            " 888       8  ",
            " 888       8  ",
            " `88.    .8'  ",
            "   `YbodP'    ",
            "              ",
            "              ",
            "              "
        )
    ),
    V(
        mutableListOf(
            "oooooo     oooo ",
            " `888.     .8'  ",
            "  `888.   .8'   ",
            "   `888. .8'    ",
            "    `888.8'     ",
            "     `888'      ",
            "      `8'       ",
            "                ",
            "                ",
            "                "
        )
    ),
    W(
        mutableListOf(
            "oooooo   oooooo     oooo ",
            " `888.    `888.     .8'  ",
            "  `888.   .8888.   .8'   ",
            "   `888  .8'`888. .8'    ",
            "    `888.8'  `888.8'     ",
            "     `888'    `888'      ",
            "      `8'      `8'       ",
            "                         ",
            "                         ",
            "                         "
        )
    ),
    X(
        mutableListOf(
            "ooooooo  ooooo ",
            " `8888    d8'  ",
            "   Y888..8P    ",
            "    `8888'     ",
            "   .8PY888.    ",
            "  d8'  `888b   ",
            "o888o  o88888o ",
            "               ",
            "               ",
            "               "
        )
    ),
    Y(
        mutableListOf(
            "oooooo   oooo ",
            " `888.   .8'  ",
            "  `888. .8'   ",
            "   `888.8'    ",
            "    `888'     ",
            "     888      ",
            "    o888o     ",
            "              ",
            "              ",
            "              "
        )
    ),
    Z(
        mutableListOf(
            " oooooooooooo ",
            "d'\"\"\"\"\"\"d888' ",
            "      .888P   ",
            "     d888'    ",
            "   .888P      ",
            "  d888'    .P ",
            ".8888888888P  ",
            "              ",
            "              ",
            "              "
        )
    ),
    NULL(
        mutableListOf(
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          "
        )
    );

    companion object {
        fun finder(letter: Char): MutableList<String> {
            for (enum in values()) {
                if (letter.toString() == enum.name) return enum.font
            }
            return NULL.font
        }
    }
}

enum class Medium(val font: MutableList<String>) {
    A(mutableListOf("____ ", "|__| ", "|  | ")),
    B(mutableListOf("___  ", "|__] ", "|__] ")),
    C(mutableListOf("____ ", "|    ", "|___ ")),
    D(mutableListOf("___  ", "|  \\ ", "|__/ ")),
    E(mutableListOf("____ ", "|___ ", "|___ ")),
    F(mutableListOf("____ ", "|___ ", "|    ")),
    G(mutableListOf("____ ", "| __ ", "|__] ")),
    H(mutableListOf("_  _ ", "|__| ", "|  | ")),
    I(mutableListOf("_ ", "| ", "| ")),
    J(mutableListOf(" _ ", " | ", "_| ")),
    K(mutableListOf("_  _ ", "|_/  ", "| \\_ ")),
    L(mutableListOf("_    ", "|    ", "|___ ")),
    M(mutableListOf("_  _ ", "|\\/| ", "|  | ")),
    N(mutableListOf("_  _ ", "|\\ | ", "| \\| ")),
    O(mutableListOf("____ ", "|  | ", "|__| ")),
    P(mutableListOf("___  ", "|__] ", "|    ")),
    Q(mutableListOf("____ ", "|  | ", "|_\\| ")),
    R(mutableListOf("____ ", "|__/ ", "|  \\ ")),
    S(mutableListOf("____ ", "[__  ", "___] ")),
    T(mutableListOf("___ ", " |  ", " |  ")),
    U(mutableListOf("_  _ ", "|  | ", "|__| ")),
    V(mutableListOf("_  _ ", "|  | ", " \\/  ")),
    W(mutableListOf("_ _ _ ", "| | | ", "|_|_| ")),
    X(mutableListOf("_  _ ", " \\/  ", "_/\\_ ")),
    Y(mutableListOf("_   _ ", " \\_/  ", "  |   ")),
    Z(mutableListOf("___  ", "  /  ", " /__ ")),
    NULL(mutableListOf("     ", "     ", "     "));

    companion object {
        fun finder(letter: Char): MutableList<String> {
            for (enum in values()) {
                if (letter.toString() == enum.name) return enum.font
            }
            return NULL.font
        }
    }
}

object Printer {
    private val fullName: String
    private val status: String
    private var beforeName = 0
    private var afterName = 0
    private var beforeStatus = 0
    private var afterStatus = 0
    private var spaces = 0

    init {
        print("Enter name and surname: ")
        fullName = readLine()!!
        print("Enter the person's status: ")
        status = readLine()!!
        defineSpaces()
    }

    private fun defineSpaces() {
        when (count()) {
            count(fullName) -> {
                spaces = 4 + count(fullName) - count(status)
                beforeStatus = spaces / 2
                afterStatus = spaces / 2
                beforeName = 2
                afterName = 2
                if (!isEven(count(fullName)) && isEven(count(status))
                    || isEven(count(fullName)) && !isEven(count(status))
                ) afterStatus++

            }
            count(status) -> {
                spaces = 4 + count(status) - count(fullName)
                beforeName = spaces / 2
                afterName = spaces / 2
                beforeStatus = 2
                afterStatus = 2
                if (!isEven(count(fullName)) && isEven(count(status))
                    || isEven(count(fullName)) && !isEven(count(status))
                ) afterName++
            }
        }
    }

    private fun isEven(n: Int) = n % 2 == 0

    private fun count() = if (count(fullName) >= count(status)) count(fullName) else count(status)

    private fun count(str: String): Int {
        var n = 0
        when (str) {
            fullName -> {
                for (letter in fullName) {
                    n += Roman.finder(letter)[0].length
                }
            }
            status -> {
                for (letter in status) {
                    n += Medium.finder(letter.uppercaseChar())[0].length
                }
            }
        }
        return n
    }

    private fun repeatChar(n: Int, str: String): String {
        var line = ""
        repeat(n) {
            line += "$str"
        }
        return line
    }

    private fun printBoard() = println(repeatChar(count() + 8, BOARD))

    private fun printName() {
        for (i in 0..9) {
            var line = "$BOARD$BOARD${repeatChar(beforeName, SPACE)}"
            for (letter in fullName) {
                line += "${Roman.finder(letter)[i]}"
            }
            line += "${repeatChar(afterName, SPACE)}$BOARD$BOARD"
            println(line)
        }
    }

    private fun printStatus() {
        for (i in 0..2) {
            var line = "$BOARD$BOARD${repeatChar(beforeStatus, SPACE)}"
            for (letter in status) {
                line += "${Medium.finder(letter.uppercaseChar())[i]}"
            }
            line += "${repeatChar(afterStatus, SPACE)}$BOARD$BOARD"
            println(line)
        }
    }

    fun printTag() {
        printBoard()
        printName()
        printStatus()
        printBoard()
    }
}

fun main() {
    Printer.printTag()
}


