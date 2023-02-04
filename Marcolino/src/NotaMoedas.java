public class NotaMoedas {
        public String billsAndCoins(double input) {
            int notas, moedasDecimais, notasCem, notasCinquenta, notasVinte;
            int notasDez, notasCinco, notasDois, restoNotas, restoMoedas;
            int moedaUm, moedaCinquenta, moedaVinte, moedaDez, moedaCinco, moedaUmCent;
            double dec;
            String resp; 
            
            
            notas = (int )input;
            dec = input*100;
            moedasDecimais = (int)dec%100;
            
            notasCem = notas/100;
            restoNotas = notas-(notasCem*100);
            notasCinquenta = restoNotas/50;
            restoNotas = restoNotas-(notasCinquenta*50);
            notasVinte = restoNotas/20;
            restoNotas = restoNotas-(notasVinte*20);
            notasDez = restoNotas/10;
            restoNotas = restoNotas-(notasDez*10);
            notasCinco = restoNotas/5;
            restoNotas = restoNotas-(notasCinco*5);
            notasDois = restoNotas/2;
            restoNotas = restoNotas-(notasDois*2);
            moedaUm = restoNotas/1;
            restoNotas = restoNotas-(moedaUm*1);
            
            moedaCinquenta = moedasDecimais/50;
            restoMoedas = moedasDecimais-(moedaCinquenta*50);
            moedaVinte = restoMoedas/25;
            restoMoedas = restoMoedas-(moedaVinte*25);
            moedaDez = restoMoedas/10;
            restoMoedas = restoMoedas-(moedaDez*10);
            moedaCinco = restoMoedas/5;
            restoMoedas = restoMoedas-(moedaCinco*5);
            moedaUmCent = restoMoedas/1;
            restoMoedas = restoMoedas-(moedaUmCent*1);
            
            resp = "NOTAS:\n" + notasCem +  " nota(s) de R$ 100.00\n" + notasCinquenta + " nota(s) de R$ 50.00\n" + notasVinte + " nota(s) de R$ 20.00\n" 
                + notasDez + " nota(s) de R$ 10.00\n" + notasCinco + " nota(s) de R$ 5.00\n" + notasDois + " nota(s) de R$ 2.00\n" + "MOEDAS:\n" 
                + moedaUm + " moedas(s) de R$ 1.00\n" + moedaCinquenta + " moedas(s) de R$ 0.50\n" + moedaVinte + " moedas(s) de R$ 0.25\n" 
                + moedaDez + " moedas(s) de R$ 0.10\n" + moedaCinco + " moedas(s) de R$ 0.05\n" + moedaUmCent + " moedas(s) de R$ 0.01";
         
           
            return  resp;
    
        }

    }



/*
 * public class NotaseMoedasJava {
    public static String billsAndCoins(double input) {
        int 
        
        return ("");

    }
    
    public static void main(String[] args) {
        System.out.println(billsAndCoins(4.99));
    }
}
 */