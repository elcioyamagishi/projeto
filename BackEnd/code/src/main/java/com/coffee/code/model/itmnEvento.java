package com.coffee.code.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // essa anotacao indica que a classe é mapeadano banco de dados
@Table(name = "itmn_evento") // indica a tabela do banco de dados

public class itmnEvento {
    @Id // indica chave primaria, independente do nome da variavel
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que o campo é gerado pelo mysql 
    @Column(name = "num_seq")
    private int numSeq;

    @Column(name = "data_evt")
    private Date dataEvt;

    @Column(name = "id_alarme")
    private int idAlarme;

    @Column(name = "id_equip")
    private int idEquip;    

    public int getNumSeq() {
        return numSeq;
    }

    public Date getDataEvt() {
        return dataEvt;
    }

    public int getIdAlarme() {
        return idAlarme;
    }

    public int getIdEquip() {
        return idEquip;
    }
}
