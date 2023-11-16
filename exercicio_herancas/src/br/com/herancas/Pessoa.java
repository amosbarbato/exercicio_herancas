package br.com.herancas;

public abstract class Pessoa {

    private String name;

    private String adress;

    private Double tax;


    public abstract Double taxCalculate();

    public void taxPay() {
        System.out.println("Imposto de " + this.taxCalculate() + " pago com sucesso por " + this.name + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
}
