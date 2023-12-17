Aplicação de supermercado

Descrição

Esta aplicação simula um supermercado, com produtos, funcionários e compras.

Requisitos

Java 11 ou superior
Instalação

Clone o repositório do GitHub:
git clone https://github.com/jonathan-pereira-lima/mpooSupermarkete
Acesse o diretório do projeto:
cd supermercado-app
Compilar o código:
javac *.java
Execução

Para executar a aplicação, execute o seguinte comando:

java App
Saída

A aplicação exibirá a seguinte saída:

**Compras**
ID: 1, valor: R$10,00
ID: 2, valor: R$100,00
ID: 3, valor: R$5,00
ID: 4, valor: R$90,00
ID: 5, valor: R$25,00

**Quantidades disponíveis**
feijão da Serra: 9
arroz da Serra: 9
biscoito formoso: 9
laranja mimosa: 5

**Dados dos vendedores**
Nome: João Santos
CPF: 222.222.222-22
Salário: R$1.452,00
CodVendedor: vend001

Nome: Godofredo Sá
CPF: 333.333.333-33
Salário: R$1.452,00
CodVendedor: vend002

Nome: José Lima
CPF: 444.444.444-44
Salário: R$1.320,00
Observações

A aplicação utiliza a classe Verificador para verificar se um produto está vencido.
A classe Gerente pode conceder um desconto de 50% para as laranjas, que estão perecíveis.
O salário de um vendedor é calculado com base nas comissões.
