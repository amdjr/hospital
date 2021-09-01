public class Main {

    public static void main(String[] args) {

        // Criando um objeto
        Endereco end1 = new Endereco();
        Paciente pac1 = new Paciente();
        // Add dados nos objetos
        end1.rua = "Av. das Ruas";
        end1.cidade = "Porto Alegre";
        end1.cep = "912345-170";
        end1.estado = "RS";
        end1.numero = "252";
        end1.bairro = "Meu Bairro";

        pac1.rg = "1233445566";
        pac1.cpf = "88899966655";
        pac1.nomeCompleto = "Pedro Bó";
        pac1.telefone = "151515151515";
        pac1.endereco = end1;
        // imprimir dados

        System.out.printf("O senhor %s reside no endereço %s nº %s, no bairro %s - %s/%s", pac1.nomeCompleto, end1.rua,
                end1.numero, end1.bairro, end1.cidade, end1.estado);
    }
}
