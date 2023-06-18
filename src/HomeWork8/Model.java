package HomeWork8;

public class Model extends MobilePhone implements Mobile {

    boolean phoneCanCall;
    public boolean setPhoneCanCall(boolean phoneCanCall) {
        this.phoneCanCall = phoneCanCall;
        return phoneCanCall;
    }
    @Override
    public boolean isCanCalling(boolean canOrNot) {
        return setPhoneCanCall(canOrNot);
    }
    @Override
    public void call(int phoneNumber) {
        System.out.println("You calling to " + phoneNumber);
    }
    @Override
    public void sendMessage(int phoneNumber, String yourText) {
        System.out.println("Sending message " + yourText + " to the " + phoneNumber);
    }
    @Override
    public void makePhoto() {
        System.out.println("Photo successfully saved to gallery");
    }
    @Override
    public void playMusic() {
        System.out.println("La La La La Laaaaaa");
    }
}
