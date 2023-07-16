package interfaceGeneric;

public class Code<T> implements Work<T>{

    @Override
    public void goCompany(T obj) {
        System.out.println("Go to " + obj);
    }

    @Override
    public void doWork(T obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Code<String> codeWork = new Code<String>();
        codeWork.goCompany("SRV");
        codeWork.doWork("Code Algorithms");
    }
}
