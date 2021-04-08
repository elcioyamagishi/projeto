function gerarRelatorio() {
    // let dateFrom = document.getElementById("dataInicio").value

    fetch("http://localhost:8080/event/id/1")
        .then(res => tratarResposta(res))
    // console.log(dateFrom)
}

function tratarResposta(resposta) {
    if (resposta) {
        resposta.json().then(res => exibirDados(res))
    }
}

function exibirDados(event) {
    let tabela = '<table> <tr> <th>Data</th> <th>Alarme</th> <th>Equipamento</th>'

    // for (i=0; i < eventsList.content.length; i++) {
        // tabela += `<tr> <td>${eventsList[i].num_seq}</td> </tr>`
        tabela += `<tr> <td>${event.dataEvento}</td> <td>${event.id_alarme.nome}</td> <td>${event.id_equipamento.hostname}</td> </tr>`
    // }

    tabela += '</table>'

    document.getElementById("tabela").innerHTML = tabela
    console.log(event)
}