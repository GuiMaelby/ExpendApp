# ExpendApp

API do aplicativo ExpendApp para controle de despesas de um usuário.

## Endpoints

- Login
    - [Validar usuário](#validar-usuario)
    - [Cadastrar usuário](#cadastrar-usuario)
    - [Suporte Online](#suporte-online)
- Cadastrar -----------precisa mexer no figma, adicionar essa tela!
    - [Inserir dados pessoais](#inserir-dados)
    - [Criar conta](#criar-usuario)
- Home
    - [Perfil](#config-conta)
    - [Exibir as compras dos meses](#exibir-compras)
    - [Definir limite mensal](#limite-mensal)
    - [Configurar o balanço de contas](#balanco-contas)
    - [Listar compras desejadas](#compras-futuras)
    - [Configurações Gerais](#config-geral)
- Compras do Mês
    - Exibir as compras dos meses
- Adicionar Compra
    - [Valor da compra](#inserir-valor)
    - [Nome da compra](#inserir-nome)
    - [Local da compra](#inserir-local)
    - [Forma de pagamento](#inserir-pagamento)
    - [Data da compra](#inserir-data)
    - [Adicionar compra](#adicionar-compra)

### Validar Usuário

`POST` /expendapp/api/login

*Campos de requisição*

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----------
|valor|decimal positivo|sim| o valor da despesa
|data|data|sim| a data da despesa
|contaId|inteiro|sim| o id de uma conta previamente cadastrada
|categoriaId|inteiro|sim| o id de uma categoria previamente cadastrada
|descricao|texto|não| um texto sobre a despesa

*Exemplo de requisição*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|201| a conta foi cadastrada com sucesso
|400| campos inválidos

### Cadastrar Usuário

`POST` expendapp/api/conta/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Suporte Online

`POST` expendapp/api/suporteonline/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Inserir Dados Pessoais

`POST` expendapp/api/dadoscadastro/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Criar Conta

`POST` expendapp/api/cadastroconta/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Perfil

`POST` expendapp/api/perfil/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Exibir As Compras Dos Meses

`GET` expendapp/api/comprasmes/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Definir Limite Mensal

`POST` expendapp/api/limitemensal/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Configurar O Balanço De Contas

`POST` expendapp/api/balancoconta/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Listar Compras Desejadas

`GET` expendapp/api/compradesejada/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Configurações Gerais

`POST` expendapp/api/configgeral/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Exibir As Compras Dos Meses

`GET` expendapp/api/comprasmes/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-02-22',
    contaId: 1,
    categoriaId: 1,
    descricao: 'restaurante'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma compra com esse ID

### Valor Da Compra

`POST` expendapp/api/valorcompra/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Nome Da Compra

`POST` expendapp/api/nomecompra/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Local Da Compra

`POST` expendapp/api/localcompra/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Forma De Pagamento

`POST` expendapp/api/formapag/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Data Da Compra

`POST` expendapp/api/datacompra/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Adicionar Compra

`POST` expendapp/api/addcompra/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID
