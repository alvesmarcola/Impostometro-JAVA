package principal;

 import java.util.ArrayList;

 public class Main {

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 List <Pagador> pagadores = new ArrayList<>();

 System.out.print("Informe o numero de pagadores: ");
 int numPagadores = sc.nextInt();
 for(int i =0;i<numPagadores;i++) {
 System.out.print("Pessoa Fisica ou Juridica? (f/j):");
 char opcao = sc.next().charAt(0);
 System.out.print("Nome: ");
 String nome = sc.next();
 System.out.print("Total Recebido: ");
 double totalRecebido = sc.nextDouble();
 switch(opcao) {
 case 'f':
 case 'F':System.out.print("Gasto com Saúde: ");
 double gastosSaude = sc.nextDouble();
 pagadores.add(new PessoaFisica(nome,totalRecebido,gastosSaude));break;

 case 'j':
 case 'J':System.out.print("Numero de Funcionários: ");
 int numEmpregados = sc.nextInt();
 pagadores.add(new
PessoaJuridica(nome,totalRecebido,numEmpregados));break;
 
 default:System.out.println("Valor invalido!!!");break;
 }
 }

 sc.close();
 System.out.println("Pagamento de Impostos: ");
 for(Pagador p : pagadores) {
 System.out.println(p.toString());
 }

double soma = 0.0;
for (Pagador p : pagadores) {
    soma += p.imposto();
}
System.out.print("Total Geral: $" + String.format("%.2f", soma));
 }

 }
