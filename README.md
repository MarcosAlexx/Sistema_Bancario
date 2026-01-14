# 🏦 Sistema Bancário

Sistema bancário simples desenvolvido em Java utilizando o padrão MVC (Model-View-Controller) para gerenciamento de contas correntes e poupança.

## 📋 Sobre o Projeto

Este projeto implementa um sistema bancário básico que permite:
- Criação de contas corrente e poupança
- Operações de depósito e saque
- Consulta de saldo e limite
- Visualização de extrato de transações
- Gerenciamento de dados do cliente

## 🛠️ Tecnologias Utilizadas

- **Java** - Linguagem de programação
- **Padrão MVC** - Arquitetura de software
- **POO** - Programação Orientada a Objetos (Herança, Polimorfismo, Abstração)

## 📁 Estrutura do Projeto
```
Sistema_Bancario/
├── src/
│   ├── model/
│   │   ├── Conta.java (classe abstrata)
│   │   ├── ContaCorrente.java
│   │   ├── ContaPoupanca.java
│   │   ├── Transacao.java
│   │   └── TipoTransacao.java
│   ├── service/
│   │   ├── ContaService.java
│   │   ├── ContaCorrenteService.java
│   │   └── ContaPoupancaService.java
│   └── Main.java
└── README.md
```

## ⚙️ Funcionalidades

### Conta Corrente
- Saque com limite de crédito
- Depósito
- Consulta de saldo e limite
- Histórico de transações

### Conta Poupança
- Saque apenas do saldo disponível (sem limite)
- Depósito
- Consulta de saldo
- Histórico de transações

## 🚀 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/MarcosAlexx/Sistema_Bancario.git
```

2. Navegue até o diretório do projeto:
```bash
cd Sistema_Bancario
```

3. Compile o projeto:
```bash
javac -d bin src/**/*.java src/Main.java
```

4. Execute a aplicação:
```bash
java -cp bin Main
```

## 💡 Como Usar

Ao executar o programa, você verá um menu interativo:

1. **Escolha a conta** - Selecione entre Conta Corrente ou Poupança
2. **Menu de opções**:
   - `1` - Visualizar dados da conta
   - `2` - Consultar saldo
   - `3` - Consultar limite (apenas Conta Corrente)
   - `4` - Realizar saque
   - `5` - Realizar depósito
   - `6` - Ver extrato de transações
   - `7` - Sair

## 📊 Exemplo de Uso
```java
// Criando uma conta corrente
ContaCorrente contaCorrente = new ContaCorrente(
    "Marcos",
    "111.111.111-11",
    "Rua dos Testes",
    "1234-0",
    1000,  // limite
    500    // saldo inicial
);

// Realizando operações via Service
ContaService service = new ContaService();
service.depositar(contaCorrente, 200.0);
contaCorrente.sacar(100.0);
service.mostrarExtrato(contaCorrente);
```

## 🎯 Conceitos Aplicados

- **Herança**: `ContaCorrente` e `ContaPoupanca` herdam de `Conta`
- **Polimorfismo**: Método `sacar()` com comportamentos diferentes
- **Abstração**: Classe abstrata `Conta` com método abstrato `sacar()`
- **Encapsulamento**: Atributos privados com getters/setters
- **Padrão MVC**: Separação de responsabilidades (Model, Service, Main)

## 👨‍💻 Autor

**Marcos** - Backend Java Developer

- LinkedIn: [@MarcosAlexander](https://www.linkedin.com/in/marcosalexander/)
- GitHub: [@MarcosAlexx](https://github.com/MarcosAlexx)

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 🤝 Contribuindo

Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/NovaFuncionalidade`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`)
4. Push para a branch (`git push origin feature/NovaFuncionalidade`)
5. Abra um Pull Request

---

⭐ Se este projeto foi útil para você, considere dar uma estrela!
