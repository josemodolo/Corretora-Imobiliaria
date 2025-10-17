package org.jose.corretora;

public class Casa extends Imovel{
    public Casa (String endereco, int numero, Proprietario proprietario){
        super (endereco, numero, proprietario);
    }

    @Override
    public boolean estaAlugado(){
        return alugado;
    }

    public String status(){
        return alugado? "A casa está em " + endereco + " número: " + numero +" está alugada" : "A casa em " + endereco + " número: " + numero + " está disponível";
    }

    @Override
    public int calcularAluguel(int valorBase){
        return (int) (valorBase * 1.20);
    }

}
