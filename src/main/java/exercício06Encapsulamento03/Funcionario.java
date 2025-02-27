package exercício06Encapsulamento03;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        setNome(nome);
        setSalario(salario);
        setCargo(cargo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido. O nome não pode ser nulo ou vazio.");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 1320) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido. O salário deve ser maior que R$ 1320,00");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo.equals("Gerente")) {
            this.cargo = cargo;
        } else {
            System.out.println("Cargo inválido. O cargo deve Gerente, Analista ou Programador.");
        }
    }

    public void calcularAumento(double percentual) {
        if (percentual > 0) {
            salario += salario * (percentual / 100);
            System.out.println("Aumento de " + percentual + "% aplicado com sucesso!!");
        } else {
            System.out.println("Percentual de aumento inválido. O percentual dever ser positivo.");
        }
    }
}