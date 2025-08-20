import javax.script.SimpleScriptContext;

public class AtividadeSala02 {
    public static void main (String[] args){
        String nome = "Samuel";
        String sobrenome = "Lucas";
        int idade = 16;
        double peso = 84;
        double altura = 1.76;System.out.println("Nome " +nome +sobrenome);
        int anoNasc = 2025 -idade;
        System.out.println("Ano de Nacimento" + anoNasc);
        String texto = "Peso" + peso + "; Altura:" + altura;
        System.out.println(texto); double imc = peso / (altura*altura);
        System.out.println("IMC: " +imc);


    }
}