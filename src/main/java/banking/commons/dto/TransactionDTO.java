package banking.commons.dto;

import banking.commons.dto.types.AccountType;
import banking.commons.dto.types.TransactionStatus;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TransactionDTO {

    private String transactionId;
    private String fromIban;
    private AccountType fromAccountType;
    private String toIban;
    private AccountType toAccountType;
    private Double transactionAmount;
    private LocalDate transactionTime;
    private TransactionStatus status;
    private int toIndividualId;
    private IndividualDTO toIndividualDTO;
    private int fromIndividualId;
    private IndividualDTO fromIndividualDTO;

}
