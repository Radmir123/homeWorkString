public class Main {
    public static void main(String[] args) {
//задание 1
        String  firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника — " + fullName);
        //задание 2
        System.out.println(fullName.toUpperCase());
        // задание 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
        // задача с методами.
        String fullName1 = "Иванов Семён Семёнович";
        String[] fullName1Array = fullName1.split("  ");
        for (int i = 0; i < fullName1Array.length; i++) {
            if (fullName1Array[i].contains("ё")) {
                fullName1Array[i] = fullName1Array[i].replace("ё", "e");
            }
            System.out.print(fullName1Array[i]);
            }


    }
}