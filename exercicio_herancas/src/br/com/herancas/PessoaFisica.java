package br.com.herancas;

public class PessoaFisica extends Pessoa {

    String CPF;

    String motherName;

    Double monthlyRent;

    @Override
    public Double taxCalculate() {
        return this.monthlyRent * this.getTax();
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(Double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }
}
