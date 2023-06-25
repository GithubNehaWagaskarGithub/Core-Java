package Abstraction;

public abstract class WhatsApp {
    public void sendMsg()
    {
        System.out.println("Sending Message");
    }

    public abstract void postStatus();
    public abstract void videoCall();
    public abstract void voiceCall();
}
