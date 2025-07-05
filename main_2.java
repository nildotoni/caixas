    import entities.Caixa;
    import entities.Cliente;

    import java.util.ArrayList;
    import java.util.List;

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {

        public static void main(String[] args) {

            Caixa caixaPequena = new Caixa(20, 20, 30, "Caixa Pequena");
            Caixa caixaMedia = new Caixa(49, 50, 80, "Caixa Media");
            Caixa caixaGrande = new Caixa(200, 200, 300, "Caixa Grande");
            Cliente clienteGustavo = new Cliente("Gustavo", new Caixa(120, 125, 130, "caixa personalizada gustavo"));
            Cliente clienteNildo = new Cliente("Nildo", caixaPequena);

            List<Cliente> clientes = new ArrayList<>();
            clientes.add(clienteGustavo);
            clientes.add(clienteNildo);

            List<Caixa> caixas = new ArrayList<Caixa>();
            caixas.add(caixaPequena);
            caixas.add(caixaMedia);
            caixas.add(caixaGrande);

            for(Cliente cliente : clientes) {
                System.out.println("O Cliente " + cliente.getNome());
                System.out.println("Possui a caixa: " + cliente.getCaixa().getNome());
            }

            //Main.processaCategoria(caixas);
            //printListagemProcessadaHeader();
            //printCategoriaCaixas(caixas);
        }

        public static void processaCategoria(List<Caixa> caixas){
            for (Caixa caixa : caixas) {
                if(caixa.getLargura() < 50) {
                    System.out.println("A caixa com nome: " +caixa.getNome());
                    System.out.println("É pequena");
                    caixa.setCategoria("Pequena");
                } else if (caixa.getLargura() >= 50) {
                    System.out.println("A caixa com altura: " + caixa.getNome());
                    System.out.println("É grande");
                    caixa.setCategoria("Grande");
                }
            }
        }

        private static void printCategoriaCaixas(List<Caixa> caixas) {
            for (Caixa caixa : caixas) {
                    System.out.println("A caixa com nome: " + caixa.getNome());
                    System.out.println("categoria da caixa: " + caixa.getCategoria());
            }
        }

        private static void printListagemProcessadaHeader() {
            System.out.println("==============================");
            System.out.println("LISTAGEM DE CAIXAS PROCESSADAS NA REGRA DO MEU NEGOCIO");
            System.out.println("==============================");
        }
    }
