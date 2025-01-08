public class Main {
    public static void main(String[] args) {
        boolean[][] schedule = new boolean [8][60];
        AppointmentBook a = new AppointmentBook(schedule); 
        for (int i = 10; i<15;i++) schedule[1][i]=true;
        for (int i = 30; i<45;i++) schedule[1][i]=true;
        for (int i = 50; i<59;i++) schedule[1][i]=true; 
        System.out.println(a.findFreeBlock(2, 15));
        System.out.println(a.findFreeBlock(2, 9));
        System.out.println(a.findFreeBlock(2, 20));
        a.findFreeBlock(2, 9);
        a.findFreeBlock(2, 20);
        //a.printPeriod(2); 
        boolean[][] schedule1 = new boolean[8][60]; 
        for (int i = 25; i<30;i++) schedule1[1][i]=true;
        for (int i = 0; i<15;i++) schedule1[2][i]=true;
        for (int i = 41; i<60;i++) schedule1[2][i]=true;
        for (int i = 5; i<30;i++) schedule1[3][i]=true;
        for (int i = 44; i<60;i++) schedule1[3][i]=true;
        AppointmentBook b = new AppointmentBook(schedule1); 
       // int period = 2; 
        //while (period<5) {
       //  System.out.println("Period: " +period);
       //  b.printPeriod(period);
        //    period++;
       //}
        //b.printPeriod (4); 
        System.out.println(b.makeAppointment(2, 4, 22));
        AppointmentBook c= new AppointmentBook(schedule1);
        System.out.println(c.makeAppointment(3, 4, 3));
        AppointmentBook d= new AppointmentBook(schedule1);
        System.out.println(d.makeAppointment(2, 4, 30)); 

    }
}