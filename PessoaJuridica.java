import entidades;

 public class PessoaJuridica extends Pagador {
 private int numEmpregados;

 public PessoaJuridica() {

}
 public PessoaJuridica(String nome, double totalRecebido, int numEmpregados) {
 super(nome, totalRecebido);
 this.numEmpregados = numEmpregados;
}
 public int getNumEmpregados() {
 return numEmpregados;
 }
 public void setNumEmpregados(int numEmpregados) {
 this.numEmpregados = numEmpregados;
 }

@Override
 public double imposto() {
 if(numEmpregados>10) {
 return totalRecebido*0.14;
 }
 else {
 return totalRecebido*0.16;
 }
}

@Override
public String toString() {
    return nome + ": $ " + String.format("%.2f", imposto());
}
 }
