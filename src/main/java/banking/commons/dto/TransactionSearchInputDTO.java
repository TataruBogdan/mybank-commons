package banking.commons.dto;

import banking.commons.dto.types.TransactionStatus;
import lombok.Data;

import java.util.List;

@Data
public class TransactionSearchInputDTO {

    private List<TransactionStatus> statusList;
}
