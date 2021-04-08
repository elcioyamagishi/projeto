function gerarRelatorio() {
    let dateFrom = document.getElementById("eventsFrom").value
    let dateTo = document.getElementById("eventsTo").value

    let dateRange = {
        from: '2020-02-23',
        to: '2020-02-24'
    }

    let msg = {
        method: 'POST',
        body: JSON.stringify(dateRange),
        headers: {
            'Content-type': 'application/json'
        }
    }

    fetch("http://localhost:8080/event/between", msg)
        .then(res => tratarResposta(res))
    // console.log(dateFrom)
}

function tratarResposta(resposta) {
    if (resposta) {
        resposta.json().then(res => exibirDados(res))
    }
}

function exibirDados(eventsList) {
    let tabela = '<table> <tr> <th>Data</th> <th>Alarme</th> <th>Equipamento</th>'

    for (i=0; i < eventsList.length; i++) {
        tabela += `<tr> <td>${eventsList[i].dataEvento}</td> <td>${eventsList[i].id_alarme.nome}</td> <td>${eventsList[i].id_equipamento.hostname}</td> </tr>`
        // tabela += `<tr> <td>${event.dataEvento}</td> <td>${event.id_alarme.nome}</td> <td>${event.id_equipamento.hostname}</td> </tr>`
    }

    tabela += '</table>'

    document.getElementById("tabela").innerHTML = tabela
    // console.log(event)
}