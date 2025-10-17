package org.jose.corretora;

abstract class Imovel {
    protected String endereco;
    protected int numero;
    protected boolean alugado;
    protected Proprietario proprietario;

    public Imovel(String endereco, int numero, Proprietario proprietario){
        this.endereco = endereco;
        this.numero = numero;
        this.proprietario = proprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public abstract boolean estaAlugado();

    public  String contatoProprietario(){
        return "Contato do proprietário: " + proprietario.getNome() +
                "| Telefone: " + proprietario.getTelefone() +
                "| CPF: " + proprietario.getCpf();
    }

    public int calcularAluguel(int valorBase){
        return (int) (valorBase * 1.10);

    }
}
