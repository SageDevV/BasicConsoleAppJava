import Poo.Veiculo;

public class TestaVeiculo {
    
    public static void main(String[] args) {
        var veiculo1 = new Veiculo();
        var veiculo2 = new Veiculo();

        var modelo1 = veiculo1.SetModelo("Carro terrestre");
        var cor1 = veiculo1.SetCor(500);
        var ano1 = veiculo1.SetAno(2021);
        
        var modelo2 = veiculo2.SetModelo("Carro híbrido");
        var cor2 = veiculo2.SetCor(600);
        var ano2 = veiculo2.SetAno(2022);

        veiculo1.Exibe();
        veiculo2.Exibe();

    }
}
