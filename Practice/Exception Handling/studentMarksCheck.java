public class studentMarksCheck {

    public void checkAttendance(int attendance)
            throws LowAttendanceException {

        if (attendance < 75) {
            throw new LowAttendanceException(
                "Attendance is below 75%"
            );
        }
        System.out.println("Eligible for exams!");
    }
}