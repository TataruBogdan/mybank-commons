package banking.commons.dto;

import banking.commons.dto.types.LoanStatus;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AccountLoanDTO {

    private String iban;
    private double loanAmount;
    private int period;
    private double interestRate;
    private LocalDate startDate;
    private LoanStatus loanStatus;
    private double principal;
    private IndividualDTO individualDTO;

}
