package restaurante;
import java.util.ArrayList;

public class Mesa {

    private ArrayList<Cliente> clientesNaMesa = new ArrayList<Cliente>();

    private int pessoasNaMesa;
    private int numeroDaMesa;

    public Mesa(int numeroDaMesa){
        this.numeroDaMesa = numeroDaMesa;
    }

    public void adicionarCliente(Cliente cliente){
        if(!clientesNaMesa.contains(cliente)){
            clientesNaMesa.add(cliente);
        }else{
            System.out.println("Erro, cliente ja esta na mesa");
        }
    }
}
