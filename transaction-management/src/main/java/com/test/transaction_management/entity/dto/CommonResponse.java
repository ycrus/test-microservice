package com.test.transaction_management.entity.dto;


import com.test.transaction_management.constants.ErrorEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse<T> implements Serializable {

    private static final long serialVersionUID = -8330124541253839574L;
    @Builder.Default
    private String responseCode = ErrorEnum.SUCCESS.getErrorCode();

    @Builder.Default
    private String responseMessage = ErrorEnum.SUCCESS.getErrorDesc();

    @Builder.Default
    private T data = null;

    public String getResponseCode() {
        return responseCode == null ? ErrorEnum.SUCCESS.getErrorCode():responseCode;
    }

    public String getResponseMessage() {
        return responseMessage == null ? ErrorEnum.SUCCESS.getErrorDesc():responseMessage;
    }

}
