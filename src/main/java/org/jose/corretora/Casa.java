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
        return alugado? "A casa está disponivel" : "A casa está alugada";
    }

    @Override
    public int calcularAluguel(int valorBase){
        return (int) (valorBase * 1.20);
    }

}
