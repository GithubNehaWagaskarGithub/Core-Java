package Abstraction;

public class Software extends FrontEnd implements BackEnd,DataBase{
    @Override
    public void serverPages(String lang) {
        System.out.println("Backend Language is :"+lang);
    }

    @Override
    public void storeData(String vendor) {
        System.out.println("Data Base used is :"+vendor);
    }
}
