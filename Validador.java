public class Validador {
    public static void main(String[] args) {
        System.out.println("Iniciando verificação...");

        boolean bancoPronto = true;

        if (bancoPronto) {
            System.out.println("SISTEMA OK!!! SUCESSO ");
            System.exit(0);
        }else{
            System.out.println("SISTEMA DEU RUIM!!!!");
            System.exit(1);
        }
    }
}
