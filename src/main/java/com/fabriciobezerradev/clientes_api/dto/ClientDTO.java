package com.fabriciobezerradev.clientes_api.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import com.fabriciobezerradev.clientes_api.entity.Client;

public class ClientDTO {
    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 4, max = 80, message = "Nome deve ter de 4 a 80 caracteres")
    private String name;
    
    @NotBlank(message = "Campo requerido")
    @Size(min = 11, max = 11, message = "CPF deve ter 11 caracteres")
    private String cpf;
    
    @Positive(message = "O valor do campo salário deve ser positivo")
    @NotNull(message = "Campo requerido")
    private Double income;
    
    @PastOrPresent(message = "Data de nascimento não pode ser futura")
    @NotNull(message = "Campo requerido")
    private LocalDate birthDate;
    
    @Positive(message = "Quantidade de dependentes dever ser positiva")
    @NotNull(message = "Campo requerido")
    private Integer children;


    public ClientDTO() {
    }

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.cpf = entity.getCpf();
        this.income = entity.getIncome();
        this.birthDate = entity.getBirthDate();
        this.children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    
}
