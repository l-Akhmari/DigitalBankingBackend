package org.akh.digiltalbanking.dtos;

import lombok.Data;
import org.akh.digiltalbanking.enums.AccountStatus;

import java.util.Date;

@Data
public class CurrentBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double OverDraft;
}