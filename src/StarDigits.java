public class StarDigits {
        public static final String[][] DIGITS = {
                { // 0
                        "***",
                        "* *",
                        "* *",
                        "* *",
                        "***"
                },
                { // 1
                        "  *",
                        "  *",
                        "  *",
                        "  *",
                        "  *"
                },
                { // 2
                        "***",
                        "  *",
                        "***",
                        "*  ",
                        "***"
                },
                { // 3
                        "***",
                        "  *",
                        "***",
                        "  *",
                        "***"
                },
                { // 4
                        "* *",
                        "* *",
                        "***",
                        "  *",
                        "  *"
                },
                { // 5
                        "***",
                        "*  ",
                        "***",
                        "  *",
                        "***"
                },
                { // 6
                        "***",
                        "*  ",
                        "***",
                        "* *",
                        "***"
                },
                { // 7
                        "***",
                        "  *",
                        "  *",
                        "  *",
                        "  *"
                },
                { // 8
                        "***",
                        "* *",
                        "***",
                        "* *",
                        "***"
                },
                { // 9
                        "***",
                        "* *",
                        "***",
                        "  *",
                        "***"
                }
        };


    public static void printDateInStars(int day, int month, int year) {
        String dateStr = String.format("%02d%02d%04d", day, month, year);
        // строка для каждой “вертикали” цифр
        for (int row = 0; row < 5; row++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < dateStr.length(); i++) {
                char ch = dateStr.charAt(i);
                if (ch == ' ') {
                    sb.append("   "); // три пробела для пустой позиции
                } else {
                    sb.append(StarDigits.DIGITS[ch - '0'][row]);
                }
                sb.append(" "); // пробел между цифрами
            }
            System.out.println(sb.toString());
        }
    }

}



