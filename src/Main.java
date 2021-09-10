public class Main {
    public static void main(String[] args) {

        // Criando um objeto

        Endereco end1 = new Endereco("Num sei", "s/", "bairro das coisas", "cidade de tudo", "estado de panico",
                "151515151");
        Paciente pac1 = new Paciente("Naruto Uzumaki", "59595959", "54-8485454854", end1);

        Medico med1 = new Medico("59595959", "Antonio", "24-959585664");
        Medico med2 = new Medico("476767767", "Pablo", "42-945849334");

        Internacao internacao1 = new Internacao(pac1, med1);

        // Add dados nos objetos

        end1.setRua("Av. das Ruas");
        end1.setCidade("Porto Alegre");
        end1.setCep("912345-170");
        end1.setEstado("RS");
        end1.setNumero("252");
        end1.setBairro("Meu Bairro");

        pac1.getRg();
        pac1.getCpf();
        pac1.getTelefone();
        pac1.getEndereco();

        // imprimir dados

        System.out.printf(
                "O senhor %s reside no endereço %s nº %s, no bairro %s - %s/%s, estava internado desde %s no hospital. Foi liberado pelo médico %s, supervisionado pelo médico %s.",
                pac1.getNomeCompleto(), end1.getRua(), end1.getNumero(), end1.getBairro(), end1.getCidade(),
                end1.getEstado(), internacao1.getDataInternacao(), med1.getNomeCompleto(), med2.getNomeCompleto());

        System.out.printf("O paciente %s reside em %s e o telefone de contato é %s", pac1.getNomeCompleto(),
                end1.getCidade(), pac1.getTelefone());

    }
}
