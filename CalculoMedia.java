public class CalculoMedia {

    public static void main(String args[]) {
        System.out.println("**** Cálculo da Média Aritmética ****");
        System.out.println(" ");
        double nota1 = 6.50;
        double nota2 = 7.50;
        double nota3 = 8.00;
        double nota4 = 7.00;
        double mediaA = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média Aritmética: " + mediaA);
        int mA = 7;
        if (mA >=7) {
            System.out.println("Resultado: Aluno Aprovado.");
        } else {
            System.out.println("Resultado: Aluno Reprovado.");
        }

    }
}
