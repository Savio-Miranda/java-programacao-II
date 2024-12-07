package lista01;

// Escreva um programa que troque o valor de duas variáveis primitivas. Em seguida,
// reescreva esse programa sem fazer uso de variável auxiliar para trocar os valores.

public class Questao06 {
   int a, b;
   String x, y;
   public Questao06(int a, int b, String x, String y){
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
   }

   public void trocarValorPrimitivasComTemp(){
        int temp = this.a;
        this.a = this.b;
        this.b = temp;
        this.printNumeros();
   }
   public void trocarValorPrimitivasSemTemp(){
        this.a = this.b - this.a;
        this.b = this.b - this.a;
        this.a = this.a + this.b;
        this.printNumeros();
   }

   public void trocarStringSemTemp(){
     this.x += this.y; // abccba
     
     this.y = this.x.split(this.y)[0].toString(); // y = x[abc, cba][0] = abc
     this.x = this.x.split(this.y)[1].toString(); // x = x[abc, cba][1] = cba
     printString();
   }

   private void printNumeros(){
        System.out.println("a: " + this.a);
        System.out.println("b: " + this.b);
   }
   private void printString(){
        System.out.println("x: " + this.x);
        System.out.println("y: " + this.y);
   }
}