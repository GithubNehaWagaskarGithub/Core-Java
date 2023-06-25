package Abstraction;

public class PublicWhatsApp extends WhatsApp{
    @Override
    public void postStatus() {
        System.out.println("Anyone Can view status");
    }

    @Override
    public void videoCall() {
        System.out.println("Anyone Can Video Call");
    }

    @Override
    public void voiceCall() {
        System.out.println("Anyone Can Voice Call");
    }
}
