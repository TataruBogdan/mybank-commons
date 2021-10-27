package banking.commons.dto.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.util.StringUtils;

public enum AccountType {

    CURRENT("CURR", "mybank-current-account-service"),
    DEPOSIT("DEP", "mybank-deposits-service"),
    LOAN("LOAN", "mybank-loans-service");

    private final String ibanType;
    private final String microservice;

    AccountType(String ibanType, String microservice) {
        this.ibanType = ibanType;
        this.microservice = microservice;
    }

    @JsonValue
    public String getMicroservice() {
        return microservice;
    }

    @JsonCreator
    public static  AccountType parseIbanType(String ibanType){
        if (!StringUtils.hasLength(ibanType)) {
            return null;
        }
        for (AccountType accountType: AccountType.values()) {
            if (accountType.ibanType.equalsIgnoreCase(ibanType)){
                return accountType;
            }
        }
        return null;
    }

}
