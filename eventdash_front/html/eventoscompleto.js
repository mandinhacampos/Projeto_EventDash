function gerarRelatorioCompleto(){
    var url="http://localhost:8080/alarmes"
    fetch(url).then(res => res.json()).then(listaAlarmes => preencheTabela(listaAlarmes));
}

function logout(){
    localStorage.removeItem("userDASH");
    window.location = "index.html";
}

function home(){
    window.location = "relatorios.html";
}

function preencheTabela(listaAlarmes) {
    var strTabela = `<table class="table">
                        <thead>
                            <th class=text-left> Id </th>
                            <th class=text-left> Alarme </th>
                            <th class=text-left> Descrição </th>
                        </thead> 
                        
                        <tbody> `;

    // agora eu preciso percorrer a lista e preencher cada uma das linhas
    for (i = 0; i < listaAlarmes.length; i++) {
        let alarme = listaAlarmes[i];

        strTabela = strTabela + `<tr>
        <td> ${alarme.id} </td>
        <td> ${alarme.nome} </td>
        <td> ${alarme.descricao} </td>     
    </tr>`;

    }
    strTabela = strTabela + ` </tbody>
                                </table>`;

    document.getElementById("relatorio").innerHTML = strTabela

}