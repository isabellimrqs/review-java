package org.example;

public class Produto {
    String nome;
    double preco;
    double desconto;

    double calcularPrecoComDesconto(){
        return preco - (preco * desconto);
    }

    /* %d tipo inteiro - byte, short, int e long
    * %f tipos reais - float e double
    * %c tipo caractere - char
    * %b tipo boolean
    * %s string */

    String retornaResumoDoProduto(){
        return String.format("O produto %s está com o preço de %.2f e com o desconto de %f e o " +
                "preço final fica em R$ %.2f", nome, preco, desconto, calcularPrecoComDesconto());
    }

    //Sobrecarga ou polimorfismo estático
    double calcularPrecoComDesconto(double descontoAdicional){
        return preco - preco*(desconto + descontoAdicional);
    }

    double calcularPrecoComDesconto(double descontoAdicional, double descontoPromocao){
        return preco - preco*(desconto + descontoAdicional + descontoPromocao);
    }

    void imprimirNomeDoProduto(){
        System.out.println(nome);
    }
    Produto(){
        System.out.println("Foi chamado o construtor da classe e inicializada");
    }

    Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }




}

