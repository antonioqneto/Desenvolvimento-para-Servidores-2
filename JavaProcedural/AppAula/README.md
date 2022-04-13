# Aula de 12/04/2022

## JAVA BEANS

Beans são boas práticas 

### Variáveis

As variáveis se iniciam sempre com letras, com 2 exceções aceitas ( $ e _ )

lowerCamelCase - inicia-se com letra minúscula e as palavras seguintes iniciam-se com maiúscula


    int numero1;

### Métodos

**lowerCamelCase**

Alguns prefixos são padronizados.

**set**
**get**
**do**
**add**
**remove**

exemplo:

    void getDescontoInss(double s){
        return doCalculoInss();
    }

    void setSalario(double sal){
        this.salario = sal;        
    }

### Classe

Usa-se basicamente os mesmos beans das variáveis, exceto que se é utilizado **UpperCamelCase**

    public class FuncionarioBase{}