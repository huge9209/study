package com.edu.config;

import com.edu.Enum.ResultStatus;

/*** 
* @Description:
* @Param:  
* @return:  
* @Author: nico
* @Date: 2020/11/11 
*/
public class ResultException extends Exception {

    /**
     * 业务异常信息信息
     */
    ResultStatus resultStatus;

    public ResultException() {
        this(ResultStatus.INTERNAL_SERVER_ERROR);
    }

    public ResultException(ResultStatus resultStatus) {
        super(resultStatus.getMessage());
        this.resultStatus = resultStatus;
    }

    public ResultStatus getResultStatus() {
        return resultStatus;
    }
}