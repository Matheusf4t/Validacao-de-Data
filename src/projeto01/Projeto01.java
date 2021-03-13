
package projeto01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Projeto01 {

   
    public static void main(String[] args) {
        
      //_________________________BLOCO DE DECLARAÇÃO DE OBJETO_____________________________________

Scanner entrada = new Scanner(System.in); // Ativar a classe Scanner
Date a = new Date(); // Ativar a classe Date
SimpleDateFormat formatar = new SimpleDateFormat("yyyy");
/*
y ano
M mês do ano
d dia do mês

Ultilizei o SimplesDateFormat porque só preciso do ano atual
(assim o código sempre vai estar atualizado) ... o objeto declarado
em Date "a" me traz o ano e mais informações no entanto não consigo
retirar apenas o ano desta informação.
*/

//___________________________________________________________________________________________

//________________________BLOCO DE DECLARAÇÃO DE VAR_________________________________________

int anoH = Integer.parseInt(formatar.format(a)); // Objeto "a" em Int
int dia;
int mes;
int ano;
int bis;
int bis00;
//___________________________________________________________________________________________

//_____________________________BANCO DE DADOS________________________________________________
System.out.println("Valide uma data qualquer. ");

System.out.print("Digite o dia: ");
dia = entrada.nextInt();
System.out.print("Agora digite o mês: ");
mes = entrada.nextInt();
System.out.print("E por fim digite o ano: ");
ano = entrada.nextInt();
//___________________________________________________________________________________________

//____________________________BLOCO DE CALCULOS______________________________________________

bis = ano % 4;
 /* Para calcular se o ano e bissexto ultiliza-se uma regra bastante prática
 se o ano não terminar em 00 e for divisível por 4, ou seja, o seu resto
 for 0 ele e um ano Bissexto.
 */
bis00 = ano % 400;
/* Já para os anos terminados em 00 serão bissextos se a divisão por 400
for exata, ou seja, o resto da divisão ser igual a zero.
*/
//___________________________________________________________________________________________

//____________________________BLOCO CONDICIONAL______________________________________________


// MÊS DE JANEIRO

if (dia >= 1 && dia <= 31 && mes == 1 && ano > 1 && ano <= anoH){

System.out.println("\r\n");

System.out.println("Data válida! ");

System.out.println(dia +"/"+ mes +"/"+ ano);


// MÊS DE FEVEREIRO CASO SEJÁ BISSEXTO

}else if (dia >= 1 && dia <= 29 && mes == 2 && bis == 0 || bis00 == 0 && ano > 1 && ano <= anoH){

System.out.println("\r\n");

System.out.println("Data válida! ");

System.out.println(dia +"/"+ mes +"/"+ ano);


// MÊS DE FEVEREIRO

}else if (dia >=1 && dia <= 28 && mes == 2 && ano > 1 && ano <= anoH){

System.out.println("\r\n");

System.out.println("Data válida! ");

System.out.println(dia +"/"+ mes +"/"+ ano);


// MÊS DE MARÇO

}else if (dia >= 1 && dia <= 31 && mes == 3 && ano > 1 && ano <= anoH){

System.out.println("\r\n");

System.out.println("Data válida! ");

System.out.println(dia +"/"+ mes +"/"+ ano);


// MÊS DE ABRIL

}else if (dia >= 1 && dia <= 30 && mes == 4 && ano > 1 && ano <= anoH){

System.out.println("\r\n");

System.out.println("Data válida! ");

System.out.println(dia +"/"+ mes +"/"+ ano);


// MÊS DE MAIO

}else if (dia >= 1 && dia <= 31 && mes == 5 && ano > 1 && ano <= anoH){

System.out.println("\r\n");

System.out.println("Data válida! ");

System.out.println(dia +"/"+ mes +"/"+ ano);


// MÊS DE JUNHO

}else if (dia >= 1 && dia <= 30 && mes == 6 && ano > 1 && ano <= anoH){

System.out.println("\r\n");

System.out.println("Data válida! ");

System.out.println(dia +"/"+ mes +"/"+ ano);


// MÊS DE JULHO

}else if (dia >= 1 && dia <= 31 && mes == 7 && ano > 1 && ano <= anoH){

System.out.println("\r\n");

System.out.println("Data válida! ");

System.out.println(dia +"/"+ mes +"/"+ ano);


// MÊS DE AGOSTO

}else if (dia >= 1 && dia <= 31 && mes == 8 && ano > 1 && ano <= anoH){

System.out.println("\r\n");

System.out.println("Data válida! ");

System.out.println(dia +"/"+ mes +"/"+ ano);


// MÊS DE SETEMBRO

}else if (dia >= 1 && dia <= 30 && mes == 9 && ano > 1 && ano <= anoH){

System.out.println("\r\n");

System.out.println("Data válida! ");

System.out.println(dia +"/"+ mes +"/"+ ano);


// MÊS DE OUTUBRO

}else if (dia >= 1 && dia <= 31 && mes == 10 && ano > 1 && ano <= anoH){

System.out.println("\r\n");

System.out.println("Data válida! ");

System.out.println(dia +"/"+ mes +"/"+ ano);


 // MÊS DE NOVEMBRO

}else if (dia >= 1 && dia <= 30 && mes == 11 && ano > 1 && ano <= anoH){

System.out.println("\r\n");

System.out.println("Data válida! ");

System.out.println(dia +"/"+ mes +"/"+ ano);

 // MÊS DE DEZEMBRO

}else if (dia >= 1 && dia <= 31 && mes == 12 && ano > 1 && ano <= anoH){

System.out.println("\r\n");

System.out.println("Data válida! ");

System.out.println(dia +"/"+ mes +"/"+ ano);


 // DATAS NÃO EXISTENTES

System.out.println("\r\n");

System.out.println("Data Invalida! ");

 //_________________________________________________________________________________________

 }

 }
  
 }
    

