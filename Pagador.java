import entidades;

 public abstract class Pagador {
 protected String nome;
 protected double totalRecebido;

 public Pagador() {

 }
 public Pagador(String nome, double totalRecebido) {
 super();
 this.nome = nome;
 this.totalRecebido = totalRecebido;
 }

 public String getNome() {
 return nome;
 }
 public void setNome(String nome) {
 this.nome = nome;
 }
 public double getTotalRecebido() {
 return totalRecebido;
 }
 public void setTotalRecebido(double totalRecebido) {
 this.totalRecebido = totalRecebido;
 }
 public abstract double imposto();

 @Override
 public String toString() {
 return nome+": $ "+totalRecebido;
 }

}