# exercicio-conta-bancaria
Exercício FAPAM, conta bancária

Criar a classe conta bancária que possui o nome do cliente, a conta e o saldo.
A classe deverá ter métodos para as seguintes operações:
Depósito;
Saque;
Transferência (que além do valor deveŕa receber uma outra conta como parâmetro);
VerificaSaldo;
RendeJuros (Que será uma classe que irá render uma quantidade de acordo com o saldo do cliente).
Você deverá uma classe com atributos e métodos estáticos que serão utilizados dentro da classe
conta. Ela deverá ter um atributo fator de rendimento e os métodos calculajuros e calculataxa.
CalculaJuros deverá pegar o saldo do cliente e calcular o fator de juros que ele deve render de
acordo com o atributo fator de fator de rendimento.
CalculaTaxa deverá taxar as operações de Transferência, Saque e depósito com os seguintes
parâmetros.:
Se a operação é de até 100 reais: taxa de 1% da transação.
Se a operação é de entre 100 e 500 reais: taxa de 2% da transação.
Se a operação é de mais que 500 reais: taxa de 3% da transação.
Criar uma classe teste para executar operações sobre contas.
