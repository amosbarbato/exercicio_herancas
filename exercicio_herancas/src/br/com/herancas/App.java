package br.com.herancas;

public class App {

    public static void main(String[] args) {

        PessoaJuridica business = new PessoaJuridica();
        business.setName("Uber");
        business.setAdress("Av Brigadeiro Faria Lima, 949 - Pinheiros - SP");
        business.setCNPJ("17.895.646/0001-87");
        business.setRepresentativeName("Lucas Silvestre");
        business.setMonthlyProfit(20000000d);
        business.setTax(.40d);
        business.taxPay();


        PessoaFisica person = new PessoaFisica();
        person.setName("Jose da Silva");
        person.setAdress("Rua João das Flores, 80");
        person.setCPF("123.456.789-01");
        person.setMotherName("Dona Florinda");
        person.setMonthlyRent(50000d);
        person.setTax(.30d);
        person.taxPay();
    }
    
}
