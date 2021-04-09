package com.coffee.code.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // essa anotacao indica que a classe é mapeadano banco de dados
@Table(name = "itmn_equipamento") // indica a tabela do banco de dados

public class Equipamento {
    @Id // indica chave primaria, independente do nome da variavel
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que o campo é gerado pelo mysql 
    @Column(name = "id_equip")
    private int idEquip;

    @Column(name = "hostname", length = 50, nullable = false)
    private String hostname;

    @Column(name = "ipaddr", length = 15, nullable = false)
    private String ipaddr;

    public int getIdEquip() {
        return idEquip;
    }

    public String getHostname() {
        return hostname;
    }

    public String getIpaddr() {
        return ipaddr;
    }

}
