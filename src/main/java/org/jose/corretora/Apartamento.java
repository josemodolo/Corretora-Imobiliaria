package org.jose.corretora;

public class Apartamento  extends Imovel{
    public Apartamento (String endereco, int numero, Proprietario proprietario){
        super (endereco, numero, proprietario);
    }

    @Override
    public boolean estaAlugado(){
        return alugado;
    }

    public String status(){
        return alugado?  "O apartamento de número " + numero + " está disponível" : "O apartamento de número " + numero + "está alugado";
    }

    @Override
    public int calcularAluguel(int valorBase){
        return (int) (valorBase * 1.30);
    }
}
