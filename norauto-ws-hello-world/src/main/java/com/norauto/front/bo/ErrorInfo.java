package com.norauto.front.bo;

import lombok.Data;

@Data
public class ErrorInfo {
    
   private String errorCode;
   private String errorDescription;
    
   public ErrorInfo(String errorCode, String errorDescription) {
       this.errorCode = errorCode;
       this.errorDescription = errorDescription;
   }


}
