public class Main {
    public static void main(String[] args) {

        String student1 = "Berkant";
        String student2 = "Cuma";
        String student3 = "Ayşenur";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("--------------");

        String[] students = new String[4];
        students[0]="Berkant";
        students[1]="Cuma";
        students[2]="Ayşenur";
        students[3]="Şüheda";

        for (int i=0; i<students.length;i++){
            System.out.println(students[i]);
        }

        System.out.println("--------------");

        for(String student:students){
            System.out.println(student);
        }





    }
}