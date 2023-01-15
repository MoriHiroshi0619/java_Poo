public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("au au au au au au ");
    } 

    public void reagir(String frase){
        if(frase == "toma comida" || frase == "oi"){
            System.out.println("abanar e latir feliz");
        }
        else{
            System.out.println("rosnar!!!");
        }
    }

    public void reagir(int hora, int minuto){
        if(hora < 12){
            System.out.println("abanar");
        }else if(hora <= 18){
            System.out.println("ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono){
        if(dono){
            System.out.println("abanar feliz");
        }else{
            System.out.println("rosnar!!!!");
        }
    }

    public void reagir(int idade, float peso){
        if(idade < 5){
            if(peso < 10f){
                System.out.println("Abanar");
            }else{
                System.out.println("latir");
            }
        }else{
            if(peso < 10f){
                System.out.println("rosnar");
            }else{
                System.out.println("ignorar");
            }
        }
    }    
}
