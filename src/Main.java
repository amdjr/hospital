public class Main {

        public static void main(String[] args) {

                // Criando um objeto

                Endereco end1 = new Endereco("Num sei", "s/", "bairro das coisas", "cidade de tudo", "estado de panico",
                                "151515151");
                Paciente pac1 = new Paciente("Naruto Uzumaki", "59595959", "54-8485454854", end1);

                Medico med1 = new Medico("59595959", "Antonio", "24-959585664");
                Medico med2 = new Medico("476767767", "Pablo", "42-945849334");
                med1.setEndereco(end1);

                Internacao internacao1 = new Internacao(pac1, med1);

                System.out.printf(
                                "O senhor %s reside no endereço %s nº %s, no bairro %s - %s/%s, estava internado desde %s no hospital. Foi liberado pelo médico %s, supervisionado pelo médico %s.",
                                pac1.getNomeCompleto(), end1.getRua(), end1.getNumero(), end1.getBairro(),
                                end1.getCidade(), end1.getEstado(), internacao1.getDataInternacao(),
                                med1.getNomeCompleto(), med2.getNomeCompleto());

                System.out.printf("O paciente %s reside em %s e o telefone de contato é %s", pac1.getNomeCompleto(),
                                end1.getCidade(), pac1.getTelefone());

                System.out.println(internacao1.toString());

        }
}
