public class Main {

    public static void main(String[] args) {

        // Criando um objeto
        Endereco end1 = new Endereco();
        Paciente pac1 = new Paciente();
        // Add dados nos objetos
        end1.setRua("Av. das Ruas");
        end1.setCidade("Porto Alegre");
        end1.setCep("912345-170");
        end1.setEstado("RS");
        end1.setNumero("252");
        end1.setBairro("Meu Bairro");

        pac1.rg = "1233445566";
        pac1.cpf = "88899966655";
        pac1.nomeCompleto = "Pedro Bó";
        pac1.telefone = "151515151515";
        pac1.endereco = end1;
        // imprimir dados

        System.out.printf("O senhor %s reside no endereço %s nº %s, no bairro %s - %s/%s", pac1.nomeCompleto,
                end1.getRua(), end1.getNumero(), end1.getBairro(), end1.getCidade(), end1.getEstado());
    }
}
