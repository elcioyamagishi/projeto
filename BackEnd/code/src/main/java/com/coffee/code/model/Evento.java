package com.coffee.code.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
    @OneToOne
    @JoinColumn(name = "id_alarme")
    private Alarme alarmeId;

    @OneToOne
    @JoinColumn(name = "id_equip")
    private Equipamento equipamentoId;

    @Column(name = "data_evt")
    private LocalDate dataEvento;

    public int getId() {
        return id;
    }

    public Alarme getId_alarme() {
        return alarmeId;
    }

    public Equipamento getId_equipamento() {
        return equipamentoId;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }
}
