package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {


//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long answer;
        answer = 199;
        System.out.println("saveStudentOrder" );

        return answer;

    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);



        return so;
    }
}
