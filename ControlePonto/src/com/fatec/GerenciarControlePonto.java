package com.fatec;

import com.fatec.funcionarios.Funcionario;
import com.fatec.funcionarios.Gerente;
import com.fatec.funcionarios.Operador;
import com.fatec.funcionarios.Secretaria;
import com.fatec.registroPonto.RegistroPonto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GerenciarControlePonto {

    public static void main(String[] args) {

        //Instância do Gerente
        Gerente gerente = new Gerente();
        gerente.setIdFunc(1);
        gerente.setNome("João");
        gerente.setDocumento("132.456.654-55");
        gerente.setEmail("joao@email.com");
        gerente.setLogin("joaogerente");
        gerente.setSenha("1234");

        //Instância da Secretária
        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(2);
        secretaria.setNome("Maria");
        secretaria.setDocumento("456.621.233-41");
        secretaria.setEmail("maria@email.com");
        secretaria.setTelefone("(19)5555-5005");
        secretaria.setRamal("5005");

        //Instância do Operador
        Operador operador = new Operador();
        operador.setIdFunc(3);
        operador.setNome("Zé");
        operador.setDocumento("468.697.314-47");
        operador.setEmail("ze@email.com");
        operador.setValorHora(2.50);



        //Lista de registros para manter uma referência dos pontos registrados
        List<RegistroPonto> registros = new ArrayList<>();
        //Lista de registros para manter uma referência dos funcionários cadastrados
        List<Funcionario> funcionarios = new ArrayList<>(Arrays.asList(gerente, secretaria, operador));

        int contador = 1; //Este contador é utilizado como meio de refência para validar o "if" e aproveitar o uso do for encadeado
        for(int i = 0; i < 3; i++){

            if(contador <= 3){
                for(int j = 0; j < 3; j++){
                    RegistroPonto registroPonto = new RegistroPonto();
                    registroPonto.setFunc(funcionarios.get(j));
                    registroPonto.setIdRegPonto((long) j);
                    registroPonto.setDataRegistro(LocalDate.now());
                    registroPonto.setHoraEntrada(LocalDateTime.now());

                    //Este "try catch" foi necessário pois sem ele, não foi possível utilizar o método "sleep" da classe "Thread"
                    try {
                        Thread.sleep(1000); //Temporizador de 1 segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //Exibe o registro atual
                    registroPonto.apresentaRegistroPonto();

                    //Adiciona o registro na lista
                    registros.add(registroPonto);

                    contador++;
                }
            }

            registros.get(i).setHoraSaida(LocalDateTime.now());
            registros.get(i).apresentaRegistroPonto();

        }



    }
}
