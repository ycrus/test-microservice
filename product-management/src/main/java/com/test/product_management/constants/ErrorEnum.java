package com.test.product_management.constants;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
public enum ErrorEnum {
	SUCCESS				("200", "Success", ErrorSource.SYSTEM.name()),
	DATA_NOT_FOUND		("0001", "Data Not Found", ErrorSource.SYSTEM.name()),
	INVALID_INPUT		("0002", "Invalid Input", ErrorSource.SYSTEM.name()),
	INVALID_CREDENTIAL	("0003", "Invalid Credential", ErrorSource.SYSTEM.name()),
	INVALID_TOKEN		("0004", "Invalid Token", ErrorSource.SYSTEM.name()),
	USER_ALREADY_LOGIN	("0005", "User Already login", ErrorSource.SYSTEM.name()),
	RESTRICTED_ACCESS	("0006", "Restricted Access", ErrorSource.SYSTEM.name()),
	DEFAULT_ERROR		("9999", "General Error", ErrorSource.SYSTEM.name())
	;

	@NonNull @Getter private String errorCode;
	@NonNull @Getter private String errorDesc;
	@NonNull @Getter private String errorSource;
	@Getter @Setter private String errorDetail;
	
	public static ErrorEnum getErrorEnumByCode(String code) {
		for (ErrorEnum errorEnum : ErrorEnum.values()) {
			if (errorEnum.getErrorCode().equals(code)) {
				return errorEnum;
			}
		}
		
		return DEFAULT_ERROR;
	}
	
}
