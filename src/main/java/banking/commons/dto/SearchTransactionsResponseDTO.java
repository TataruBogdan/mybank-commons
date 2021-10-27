package banking.commons.dto;

import lombok.Data;

import java.util.List;

@Data
public class SearchTransactionsResponseDTO {

    private List<String> ids;
}
