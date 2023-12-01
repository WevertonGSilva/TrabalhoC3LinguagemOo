
package TrabalhoRenataCarros;


public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String anoModelo;
    private String TpTransmissao;
    private String TpCombustivel;
    private String placa;

    public Carro(String marca, String modelo, String cor, String anoModelo, String TpTransmissao, String TpCombustivel, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoModelo = anoModelo;
        this.TpTransmissao = TpTransmissao;
        this.TpCombustivel = TpCombustivel;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public String getTpTransmissao() {
        return TpTransmissao;
    }

    public String getTpCombustivel() {
        return TpCombustivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void setTpTransmissao(String TpTransmissao) {
        this.TpTransmissao = TpTransmissao;
    }

    public void setTpCombustivel(String TpCombustivel) {
        this.TpCombustivel = TpCombustivel;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", anoModelo=" + anoModelo + ", TpTransmissao=" + TpTransmissao + ", TpCombustivel=" + TpCombustivel + ", placa=" + placa + '}';
    }
    
    
     
}
