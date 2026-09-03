//Gabriel Naoki Uto Turigoe - ADS 4
//Atividade aula 6 - Boas Práticas

public class Sistema {
    public static void main(String[] args) {

        String nomeAluno = "Carlos"; //Declaração das variáveis
        double nota1 = 8;
        double nota2 = 7;
        
        double mediaFinal = calcularMediaFinal(nota1, nota2); //Chama os métodos(onde cada método equivaleira a um módulo: calculo da média, verificação da situação e exibição do resultado)
        
        String situacaoFinal = verificarSituacao(mediaFinal);
        
        exibirResultado(nomeAluno, mediaFinal, situacaoFinal);

    }

    public static double calcularMediaFinal(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static String verificarSituacao(double mediaFinal) {
        if (mediaFinal >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static void exibirResultado(String nomeAluno, double mediaFinal, String situacaoFinal) {
        System.out.println("Nome do Aluno: " + nomeAluno + "\n" +
                            "Média Final: " + mediaFinal + "\n" +
                            "Situação Final: " + situacaoFinal);
    }
}