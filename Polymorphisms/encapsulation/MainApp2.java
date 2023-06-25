package encapsulation;

public class MainApp2 {
    public static void main(String[] args) {
        Master m1=new Master();
        m1.masterMethod();

        Master.Central c1= m1.new Central();
        c1.centralMethod();

        Master.Sample s1= m1.new Sample();
        s1.sampleMethod();
    }
}
