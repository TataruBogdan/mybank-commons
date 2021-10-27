package banking.commons.dto;

import banking.commons.dto.types.DepositStatus;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class AccountDepositDTO {

    @NotNull
    private String iban;
    private Double depositAmount;
    private Double balance;
    private int individualId;
    private LocalDate maturityDate;
    private int maturityMonths;
    private Double interestRate;
    private boolean selfCapitalization;
    private String maturityIban;
    private LocalDate startDate;
    private DepositStatus status;
    private IndividualDTO individual;

}
