package org.akh.digiltalbanking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.akh.digiltalbanking.enums.OperationType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date OperationDate;
    private double amount ;
    private OperationType type;
    @ManyToOne
    private BankAccount bankAccount;

}
