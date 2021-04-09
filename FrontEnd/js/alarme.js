function gerarRelatorio() {
    fetch("http://localhost:8080/alarme/all")
        .then(res => tratarResposta(res))
    // console.log(dateFrom)
}

function tratarResposta(resposta) {
    if (resposta) {
        resposta.json().then(res => exibirDados(res))
    }
}

function exibirDados(alarmeList) {
    let tabela = '<table class="table table-bordered"s> <tr> <th>Id</th> <th>Nome</th> <th>Descricao</th>'

    for (i=0; i < alarmeList.length; i++) {
        tabela += `<tr> <td>${alarmeList[i].id}</td> <td>${alarmeList[i].nome}</td> <td>${alarmeList[i].descricao}</td> </tr>`
    }

    tabela += '</table>'

    document.getElementById("tabela").innerHTML = tabela
    // console.log(event)
}