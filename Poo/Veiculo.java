package Poo;

public class Veiculo{

    private String modelo;

    public String GetModelo(){
        return modelo; 
    }
    
    public String SetModelo(String value){
        modelo = value;
        return modelo;
    }

    private int cor;

    public int GetCor(){
        return cor;
    }

    public int SetCor(int value){
        cor = value;
        return cor;
    }

    private int ano;

    public int GetAno(){
        return ano;
    }

    public int SetAno(int value){
        ano = value;
        return ano;
    }

    public Veiculo(){

    }

    public void Exibe(){
        var value1 = GetModelo();
        var value2 = GetAno();
        var value3 = GetCor();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}