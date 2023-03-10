# ExpendApp

API do aplicativo ExpendApp para controle de despesas de um usuário.

## Endpoints

- Login
    - [Validar usuário](#login)
- Cadastrar
    - [Inserir dados](#cadastro)
- Suporte online
    - [Conversar com suporte](#suporte-online)
- Home
    - [Exibir perfil](#perfil)
    - [Exibir as compras](#exibir-compras)
    - [Balanço de contas](#balanço-de-contas)
    - [Configurações Gerais](#conf-gerais)
- Limite do mês
    - [Definir limite mensal](#limite)    
- Novo produto
    - [Adicionar produto](#produto)
    
### Validar Usuário

`POST` /expendapp/api/login/

*Campos de requisição*

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----------
|email|texto|sim| o endereço de email
|senha|texto|sim| a senha do usuário


*Exemplo de requisição*

```js
{
    email: 'felipe@email.com',
    senha: 'senha123'
}
```

*Resposta*

| código | descrição 
|--------|----------
|201| a conta foi válidada com sucesso
|400| campos inválidos

### Inserir dados

`POST` expendapp/api/cadastro/

*Campos de requisição*

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----------
|nome|texto|sim| nome completo do usuário
|email|texto|sim| o endereço de email
|senha|texto|sim| a senha do usuário
|data nascimento|data|sim| data de nascimento do usuário

*Exemplo de resposta*

```js
{
    nome: 'José da Silva',
    email: 'josesilva@hotmail.com',
    senha: 'jose123',
    nascimento: '1980-12-27',
}
```

*Resposta*

| código | descrição 
|--------|----------
|201| os dados foram cadastrados
|400| campos inválidos

### Suporte Online

`GET` expendapp/api/suporteonline/

*Exemplo de resposta*

```js
{
    numero whatsapp: '011 93838-3939'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|500| erro no servidor

### Exibir Perfil

`GET` expendapp/api/perfilusuario/

*Exemplo de resposta*

```js
{
    nome: 'José da Silva',
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrado

### Exibir Compras

`GET` expendapp/api/comprasmes/{id}

*Exemplo de resposta*

```js
{
    compra: 'Mouse Gamer'
    valor: 250.59,
    data: '2022-03-27',
    quantidade: 1
    tipo de pagamento: 'Dédito'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| campos não preenchidos

### Balanço de contas

`GET` expendapp/api/balancodecontas/{id}

*Exemplo de resposta*

```js
{
    quantidade compras do mês: '11',
    valor total do mes: 1200.00,
    limite mensal: 2000.00,
    economia: 800.00,
    forma de pagamento mais usado: 'Crédito',
    média de gasto mensal: 'Abaixo'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrado

### Configurações gerais

`POST` expendapp/api/confgerais/{id}

*Campos de requisição*

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----------
|notificações |boleano|sim |ligar notificações
|novidades por email |boleano|sim |ativar emails com novidades
|tema |boleano|sim |ativar modo noturno

*Exemplo de resposta*

```js
{
    notificações: 'sim',
    novidades por email: 'sim',
    tema: 'noturno'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|500| erro no servidor



### Definir Limite Mensal

`POST` expendapp/api/limite/{id}

*Campos de requisição*

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----------
|valor limite |decimal inteiro |não |valor limite mensal

*Exemplo de resposta*

```js
{
    valor limite: 2500,00
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| valor inválido

### Adicionar produto

`POST` expendapp/api/produto/{id}

*Campos de requisição*

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----------
|nome compra |texto |sim |o nome da compra
|valor |decimal inteiro |sim |o valor da compra
|data |data |sim |a data da compra
|quantidade |inteiro |sim |a quantidade de itens comprados
|tipo pagamento |texto |não |o tipo de pagamento usado

*Exemplo de resposta*

```js
{
    nome compra: 'Mouse Gamer'
    valor: 250.59,
    data: '2022-03-27',
    quantidade: 1
    tipo de pagamento: 'Débito'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|400| campos inválidos