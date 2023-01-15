

public class Main {
    public static void main(String[] args) throws Exception {
        SmartPhone iphone = new SmartPhone("iphone Xs");
        iphone.setCamera(12);
        iphone.setProcessador("A12 bionic");
        iphone.setTela("OLED 60HZ");
        iphone.tirarFoto();

        SmartPhone iphone2 = new SmartPhone("iphone 14 pro Max");
        iphone2.setCamera(48);
        iphone2.setProcessador("A16 bionix");
        iphone2.setTela("Super XDR Display");
        iphone2.setCarregando(true);
        for(int i = 0 ; i < 235 ; i++){
            iphone2.tirarFoto();
        }

        iphone.status();
        iphone2.status();

        System.out.println("......fim do programa.....");
    }   
}
