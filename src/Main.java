import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int usuario = 0;
        int escolha;
        boolean funcionando = true;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Quem está utilizando: \n1 - Garçom \n2 - Gerente");
        escolha = scan.nextInt();

        if (usuario == 1) {
            while (funcionando) {
                System.out.printf("O que deseja fazer? \n\n1 - Abrir nova comanda \n2 - Editar Comanda \n3 - Fechar Comanda \n4 - Sair do Programa");

            }
        } else if (usuario == 2) {
            System.out.printf("O que deseja fazer? \n\n1 - Criar Novo Prato \n2 - Editar Prato \n3 - Excluir Prato");
        }

    }
}