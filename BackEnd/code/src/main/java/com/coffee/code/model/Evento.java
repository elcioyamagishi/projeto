package com.coffee.code.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // classe mapeada no banco de dados
@Table(name = "itmn_evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1, 2, 3...
    @Column(name = "num_seq")
    private int id;

    /* relacionamento das tabelas
        itmn_evento -> itmn_alarme
                    -> itmn_equipamento
    referência: https://www.baeldung.com/spring-data-rest-relationships */
    @ManyToOne
    @JoinColumn(name = "id_alarme")
    private Alarme alarmeId;

    @ManyToOne
    @JoinColumn(name = "id_equip")
    private itmnEquipamento equipamentoId;

    @Column(name = "data_evt")
    private Date dataEvento;

    public int getId() {
        return id;
    }

    public Alarme getId_alarme() {
        return alarmeId;
    }

    public itmnEquipamento getId_equipamento() {
        return equipamentoId;
    }

    public Date getDataEvento() {
        return dataEvento;
    }
}
