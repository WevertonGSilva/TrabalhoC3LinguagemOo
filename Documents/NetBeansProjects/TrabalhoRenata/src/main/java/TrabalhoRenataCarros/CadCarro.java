package TrabalhoRenataCarros;

import java.util.ArrayList;
import java.util.List;


public class CadCarro {

    private ArrayList<Carro> cad;

    public CadCarro() {
        cad = new ArrayList<>();
    }

    public void cadastrar(Carro carro) {
        this.cad.add(carro);
    }

    public boolean remover(String modelo) {
        Carro aux = this.pesquisarCarro(modelo);
        if (aux != null) {
            this.cad.remove(aux);
            return true;
        }
        return false;
    }

    public Carro pesquisarCarro(String modelo) {
        for (int i = 0; i < this.cad.size(); i++) {
            if (this.cad.get(i).getModelo().equalsIgnoreCase(modelo)) {
                return this.cad.get(i);
            }
        }
        return null;
    }
    
    public void alterarCarro(String modelo, String novaMarca, String novoAnoModelo, String novaCor, String novaPlaca,
                             String novoTpTransmissao, String novoTpCombustivel) {
        // Pesquisa o carro pelo modelo
        Carro carro = pesquisarCarro(modelo);

        // Se o carro for encontrado, altera os valores
        if (carro != null) {
            carro.setMarca(novaMarca);
            carro.setAnoModelo(novoAnoModelo);
            carro.setCor(novaCor);
            carro.setPlaca(novaPlaca);
            carro.setTpTransmissao(novoTpTransmissao);
            carro.setTpCombustivel(novoTpCombustivel);
        }
    }
    
    public List<Carro> getCarros() {
        return cad;
    }
    
    @Override
    public String toString() {
        String aux = "";
        for (int i = 0; i < this.cad.size(); i++) {
            aux += this.cad.get(i).toString() + "\n";
        }
        return aux;
    }

}
