package org.akh.digiltalbanking.sevices;

import org.akh.digiltalbanking.entities.BankAccount;
import org.akh.digiltalbanking.entities.CurrentAccount;
import org.akh.digiltalbanking.entities.SavingAccount;
import org.akh.digiltalbanking.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BankServices {
    @Autowired
    BankAccountRepository bankAccountRepository;
    public void Consulter(){
        BankAccount bankAccount = bankAccountRepository.findById("0e13f712-cf44-4935-8272-e9053dad1bf8").orElse(null);
        System.out.println("------------------------------");
        System.out.println(bankAccount.getId());
        System.out.println(bankAccount.getCustomer().getName());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getStatus());
        System.out.println(bankAccount.getCreatedAt());
        if (bankAccount instanceof CurrentAccount) {
            System.out.println("Over draft :" + ((CurrentAccount) bankAccount).getOverdraft());
        } else if (bankAccount instanceof SavingAccount) {
            System.out.println("Inerest rate : " + ((SavingAccount) bankAccount).getInterestRate());
        }
        bankAccount.getAccountOperations().forEach(op -> {
            System.out.println("================================");
            System.out.println(op.getType() + "\t|  " + op.getOperationDate() + "\t|  " + op.getAmount());
        });
    }
}
