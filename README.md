# ExpendApp

API do aplicativo ExpendApp para controle de despesas de um usuário.

## Endpoints

- Login
    - [Validar usuário](#validar-usuário)
- Cadastrar
    - [Inserir dados](#inserir-dados)
- Suporte Online
    - [Conversar com suporte](#suporte-online)
- Home
    - [Perfil](#perfil)
    - [Exibir as compras](#exibir-compras)
    - [Definir limite mensal](#definir-limite-mensal)
    - [Balanço de contas](#balanco-contas)
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
|201| a conta foi cadastrada com sucesso
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
    data: '1980-12-27',
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada uma conta com esse ID

### Suporte Online

`GET` expendapp/api/suporteonline/

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

`GET` expendapp/api/perfil/{id}

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
|404| não foi encontrada uma conta com esse ID

### Definir Limite Mensal

`POST` expendapp/api/limitemensal/{id}

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
