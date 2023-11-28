import entidades;

 public class PessoaFisica extends Pagador{
 private double gastosSaude;

 public PessoaFisica() {

 }
 public PessoaFisica(String nome, double totalRecebido, double gastosSaude) {
 super(nome, totalRecebido);
 this.gastosSaude = gastosSaude;
 }

 public double getGastosSaude() {
 return gastosSaude;
 }
 public void setGastosSaude(double gastosSaude) {
 this.gastosSaude = gastosSaude;
 }

 @Override
 public double imposto() {
 if(this.totalRecebido>20000.00) {
 return (totalRecebido*0.25)-gastosSaude*0.5;
 }
 else {
 return (totalRecebido*0.15)-gastosSaude*0.5;
 }
}

 @Override
 public String toString() {
 return nome+": $ "+String.format("%.2f",imposto());
 }

}
