package Abstraction;

public class PrivateWhatsApp extends WhatsApp
{
    @Override
    public void postStatus() {
        System.out.println("Only Contacts view Status");
    }

    @Override
    public void videoCall() {
        System.out.println("Only Contact can Video Call");
    }

    @Override
    public void voiceCall() {
        System.out.println("Only Contacts can Voice Call");
    }
}
