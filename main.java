import entities.Caixa;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Caixa caixaPequena = new Caixa(20, 20, 30, "Caixa Pequena");
        Caixa caixaMedia = new Caixa(50, 50, 80, "Caixa Media");
        Caixa caixaGrande = new Caixa(200, 200, 300, "Caixa Grande");

        List<Caixa> caixas = new ArrayList<Caixa>();
        caixas.add(caixaPequena);
        caixas.add(caixaMedia);
        caixas.add(caixaGrande);

        for (Caixa caixa : caixas) {
            System.out.println(caixa.getNome());
            System.out.println("largura " + caixa.getLargura());
            System.out.println("altura " + caixa.getAltura());
            System.out.println("comprimento " + caixa.getComprimento());
            System.out.println("");
        }
    }
}
