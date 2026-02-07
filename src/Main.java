//Создайте программу для стилистического преобразования чисел:
//Напишите программу, которая запрашивает у пользователя последовательно день его рождения, месяц и год;
//Напишите функцию, которая определяет какому дню недели соответствует эта дата?
//Напишите функцию, которая определяет - високосный это был год, или нет?
//Напишите функцию, которая определяет сколько сейчас лет пользователю;
//Реализуйте вывод в консоль даты рождения пользователя в формате дд мм гггг,



public void main() {
    int dayOfBirth;
    int monthOfBirth;
    int yearOfBirth;

    // сбор информации от пользователя

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите день рождения: ");
    dayOfBirth = scanner.nextInt();
    System.out.println("Введите месяц рождения: ");
    monthOfBirth = scanner.nextInt();
    System.out.println("Введите год рождения: ");
    yearOfBirth = scanner.nextInt();

//    System.out.println(dayOfBirth+" "+monthOfBirth+" "+yearOfBirth+"!");
//    Проверка високосного года
//    if (DateUtils.isLeapYear(yearOfBirth)){
//        System.out.println("Год високосный");
//    }

    //проверка кода месяца
//    int code;
//    code = DateUtils.monthCode(monthOfBirth, yearOfBirth);
//    System.out.println("Код месяца "+monthOfBirth+" в "+yearOfBirth+" году будет: "+code);


     // проверка кода года
//    int yearCode = DateUtils.yearCode(yearOfBirth);
//    System.out.println(yearCode);



    String weekOfADay = DateUtils.weekDay(dayOfBirth, DateUtils.monthCode(monthOfBirth, yearOfBirth), DateUtils.yearCode(yearOfBirth));  //Напишите функцию, которая определяет какому дню недели соответствует эта дата?
    String formattedDate = String.format("%02d %02d %04d",dayOfBirth,monthOfBirth,yearOfBirth); //Реализуйте вывод в консоль даты рождения пользователя в формате дд мм гггг
    System.out.println(formattedDate);
    System.out.println("День недели в эту дату был: "+weekOfADay);
    boolean leapYear = DateUtils.isLeapYear(yearOfBirth); //Напишите функцию, которая определяет - високосный это был год, или нет?
        if (leapYear){
            System.out.println("Год был високосным!");

        }else {
            System.out.println("Год был не високосным!");
        }
    System.out.println("Ваш возраст: "+DateUtils.yearsOld(dayOfBirth,monthOfBirth,yearOfBirth));  //Напишите функцию, которая определяет сколько сейчас лет пользователю;
}



