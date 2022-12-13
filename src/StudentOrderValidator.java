public class StudentOrderValidator {

    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        checkCityRegister();
        checkWedding();
        checkChildren();
        checkStudent();
    }

    static void checkCityRegister() {
        System.out.println("CityRegister is running");
    }

    static void checkWedding() {
        System.out.println("Wedding is starting");
    }

    static void checkChildren() {
        System.out.println("Children Check is starting");
    }

    static void checkStudent() {
        System.out.println("Студенты проверяются");
    }
}
