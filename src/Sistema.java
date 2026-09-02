//Gabriel Naoki Uto Turigoe - ADS 4
//Atividade aula 6 - Boas Práticas

public class Sistema {
    public static void main(String[] args) {
        String n = "Carlos";
        double a = 8;
        double b = 7;
        double c = (a + b) / 2;

        System.out.println("Aluno: " + n);
        System.out.println("Média: " + c);

        if (c >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}