# Rest API

As APIs (Interface de Programação de Aplicativos) são conjuntos de regras, protocolos e ferramentas que permitem a comunicação entre diferentes aplicativos de software. Elas definem os métodos e formatos de comunicação que os desenvolvedores podem usar para solicitar e obter acesso aos recursos e funcionalidades de um sistema ou serviço específico.

## Introdução

Uma Rest API (Interface de Programação de Aplicativos, do inglês, REpresentational State Transfer) é um conjunto de diretrizes arquiteturais para o design de sistemas de rede, especialmente para serviços da web. Ela utiliza o protocolo HTTP para comunicação e é baseada nos princípios do REST.

## Funcionamento

- **Abstração de Funcionalidades**: As APIs abstraem as funcionalidades de um sistema. Isso permite que os desenvolvedores acessem essas funcionalidades sem precisar entender sua implementação, é uma abstração de altíssimo nível.

- **Padronização de Comunicação**: As APIs definem padrões de comunicação, como Rest, GraphQL, etc.

- **Integração de Sistemas**: O uso de APIs permite com que diferentes sistemas possam ser integrados com maior facilidade, justamente pelo maior nível de abstração.


## Principais Características

1. **Arquitetura Cliente-Servidor**: Segue o modelo cliente-servidor, onde o cliente e o servidor são independentes um do outro e se comunicam por meio de requisições HTTP.

2. **Ausência de estado "Statelessness"**: As APIs RESTful não tem necessidade de estado, isso é, uma requisição do cliente contém toda a informação necessária para que o servidor execute a solicitação.

3. **Recursos Identificáveis**: Os recursos da API são identificados por URIs (Uniform Resource Identifiers). Cada recurso é acessado por meio de sua URI única. Ex: url/rota_1/{id}?queryParam=11

4. **Operações HTTP**: Utiliza os métodos HTTP (GET, POST, PUT, DELETE, etc.) para realizar operações sobre os recursos. Por exemplo, GET para recuperar um recurso, POST para criar um novo recurso, PUT para atualizar um recurso existente e DELETE para remover um recurso.

5. **Formatos de Representação**: As respostas da API podem ser em diferentes formatos como JSON (JavaScript Object Notation) ou XML (eXtensible Markup Language), permitindo a interoperabilidade com diversas linguagens de programação.

## Outros protocolos:
Além do padrão rest, uma API pode ter outros protocolos:
- SOAP
- GraphQL
- RPC