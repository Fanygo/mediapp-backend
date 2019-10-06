package com.mitocode.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/**
 * Signo
 */
@Entity(name="Signo")
@Table(name = "signos")
public class Signo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSigno;
    
    @ManyToOne
    @JoinColumn(name = "id_paciente",nullable = false,foreignKey = @ForeignKey(name="fk_signo_paciente"))
    private Paciente paciente;

    @JsonSerialize(using = ToStringSerializer.class) // ISODate
    private LocalDateTime fecha;
    
    @Column(name = "temperatura", length = 15)
    private String temperatura;

    @Column(name = "pulso", length = 15)
    private String pulso;

    @Column(name = "ritmo_respiratorio", length = 20)
    private String ritmo_respiratorio;

    public Integer getIdSigno() {
        return idSigno;
    }

    public void setIdSigno(Integer idSignos) {
        this.idSigno = idSignos;
    }
    @JsonProperty
    public Paciente getPaciente() {
        return paciente;
    }
    @JsonProperty
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getPulso() {
        return pulso;
    }

    public void setPulso(String pulso) {
        this.pulso = pulso;
    }

    public String getRitmo_respiratorio() {
        return ritmo_respiratorio;
    }

    public void setRitmo_respiratorio(String ritmo_respiratorio) {
        this.ritmo_respiratorio = ritmo_respiratorio;
    }
}