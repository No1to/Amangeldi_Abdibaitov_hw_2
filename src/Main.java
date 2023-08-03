public class Main {

    public static void main(String[] args) {

        for (int w = 5; w > 0; w--) { /*increment «увеличение» как я понял
            просто добавив два минуса после переменой я создал декремент
            for делает цикл 5 раз пока не станет 0 w-- каждый цикл у меньшает знаечение переменой на 1*/
            int age = generateRandomAge();
            int temperature = generateRandomTemperature();

            String result = checkWeatherAndAge(age, temperature);
            System.out.println("Возраст: " + age + ", Температура: " + temperature + " - " + result);
        }
    }

    public static String checkWeatherAndAge(int age, int temperature) {

        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {

            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 60); // Генерируем случайный возраст от 0 до 59
    }

    public static int generateRandomTemperature() {
        return (int) (Math.random() * 51) - 30; // Генерируем случайную температуру от -30 до 20
    }
}