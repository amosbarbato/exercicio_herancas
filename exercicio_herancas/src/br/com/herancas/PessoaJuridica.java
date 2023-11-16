package br.com.herancas;

public class PessoaJuridica extends Pessoa {

    private String CNPJ;

    private String RepresentativeName;

    private Double monthlyProfit;

    @Override
    public Double taxCalculate() {
        return this.monthlyProfit * this.getTax();
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRepresentativeName() {
        return RepresentativeName;
    }

    public void setRepresentativeName(String representativeName) {
        RepresentativeName = representativeName;
    }

    public Double getMonthlyProfit() {
        return monthlyProfit;
    }

    public void setMonthlyProfit(Double monthlyProfit) {
        this.monthlyProfit = monthlyProfit;
    }
}
