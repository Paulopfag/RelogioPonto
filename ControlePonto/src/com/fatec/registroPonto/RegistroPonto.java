package com.fatec.registroPonto;

import com.fatec.funcionarios.Funcionario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {

    private Long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;


    public void apresentaRegistroPonto(){
        System.out.println("===================");
        System.out.println("Nome: " + func.getClass().getSimpleName() + " " + func.getNome());
        System.out.println("Data de registro: " + dataRegistro);
        System.out.println("Horário de Entrada: " + horaEntrada);
        System.out.println("Horário de Saída: " + horaSaida);
    }


    public Long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(Long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }
}
