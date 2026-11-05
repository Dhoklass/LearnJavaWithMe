public class main {

    public static void main(String[] args) {

        studentMarksCheck student = new studentMarksCheck();

        try {
            student.checkAttendance(85);
        }
        catch (LowAttendanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program execution completed.");
    }
}