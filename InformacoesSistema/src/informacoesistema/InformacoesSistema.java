
package informacoesistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class InformacoesSistema {

    public static void main(String[] args) {

        System.out.println("***********************************");
        System.out.println("Informações técnicas do meu sistema");
        //System.out.println("***********************************");
        //System.out.println("");
        
        String ponto = ".";
        
        //getProperty = pega as propriedades
        
        //configurações do sistema 
        System.out.println("------------");
        System.out.println("OS e USUÁRIO");
        System.out.println("------------");
        System.out.println("Meu sistema é: " + System.getProperty("os.name") + ponto);
        System.out.println("Está na versão: " + System.getProperty("os.version") + ponto);
        
        String sistema = System.getProperty("os.name"); //variável para guardar o nome do sistema
        
        System.out.println("O usuário que está utilizando o " + sistema + " é: " + System.getProperty("user.name") + ponto); //vai imprimir na tela o sistema e o usuário

        //idioma do sistema
        System.out.println("--------------------------");
        System.out.println("IDIOMA e RESOLUÇÃO DA TELA");
        System.out.println("--------------------------");
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma é: " + idioma.getDisplayLanguage().toUpperCase() + ponto) ; //UpperCase para deixar maiúscula
        
         //resolução da tela
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = tela.getScreenSize();
        
        System.out.println("A resolução do display é: " + d.width + "x" + d.height + "p" + ponto);

        //Ano atual + data e hora
        System.out.println("-----------");
        System.out.println("DATA E HORA");
        System.out.println("-----------");
        Calendar ano = GregorianCalendar.getInstance();
        int anoAtual = ano.get(Calendar.YEAR);//variável para guardar o dia
        int mes = ano.get(Calendar.MONTH);
        int dia = ano.get(Calendar.DAY_OF_MONTH);//variável para guardar o dia
        int hora = ano.get(Calendar.HOUR_OF_DAY); //variável para guardar a hora
        int minuto = ano.get(Calendar.MINUTE); //variável para guardar o minuto
        int segundos = ano.get(Calendar.SECOND); //variável para guardar os segundos
        //Date Datahoras = new Date();
        System.out.println("Agora são exatamente: " + hora + ":" + minuto + ":" + segundos + "seg, no dia " + dia + "/" + "0" + mes + "/" + anoAtual + ponto );
      
        //versão do Java
        System.out.println("--------------");
        System.out.println("VERSÃO JAVA");
        System.out.println("--------------");
        System.out.println("A versão utilizada do Java é: " + System.getProperty("java.runtime.version") + ponto);
                
        System.out.println("");
        
    }
    
}
