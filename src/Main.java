import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {

                Endereco end1 = new Endereco("Num sei", "s/", "Das coisas", "Cidade de tudo", "Estado de panico",
                                "23234234234");
                Endereco end2 = new Endereco("Vai saber", "66", "Centro", "Sampa", "Lagoa de Dezembro", "151515151");

                Paciente pac1 = new Paciente("Naruto Uzumaki", "59595959", "54-8485454854", end1);
                Paciente pac2 = new Paciente("Itachi Uchiha", "88495599", "25-7955416879", end2);

                ListaPacientes.pacientes.add(pac1);
                ListaPacientes.pacientes.add(pac2);

                System.out.println(ListaPacientes.listar());

                Medico med1 = new Medico("59595959", "Antonio", "24-959585664");
                Medico med2 = new Medico("476767767", "Pablo", "42-945849334");

                ListaMedicos.medicos.add(med1);
                ListaMedicos.medicos.add(med2);

                System.out.println(ListaMedicos.listar());

                Internacao internacao1 = new Internacao(pac1, med1);
                Internacao internacao2 = new Internacao(pac2, med2);

                ListaInternacoes.internacoes.add(internacao1);
                ListaInternacoes.internacoes.add(internacao2);

                LocalDate dataAlta1 = internacao1.getDataInternacao();

                internacao1.setDataAlta(dataAlta1);
                System.out.println(ListaInternacoes.listar());

                System.out.printf(
                                "O senhor %s reside no %s nº %s, no bairro %s - %s/%s, estava internado desde %s no hospital. Foi liberado para alta na data de: %s pelo médico: %s, supervisionado pelo médico %s.\n",
                                pac1.getNomeCompleto(), end1.getRua(), end1.getNumero(), end1.getBairro(),
                                end1.getCidade(), end1.getEstado(), internacao2.getDataInternacao(),
                                internacao1.getDataInternacao(), med1.getNomeCompleto(), med2.getNomeCompleto());

                System.out.printf(
                                "O paciente %s de telefone de contato %s, foi internado em: %s.\n e será acompanhado pelo médico %s",
                                pac2.getNomeCompleto(), pac2.getTelefone(), internacao2.getDataInternacao(),
                                med1.getNomeCompleto());

        }
}
