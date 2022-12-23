package tn.hkiri.pagination.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.util.Map;
@Data
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class HttpResponse {

    private String timeStamp;
    private int statusCode;
    private HttpStatus httpStatus;
    private String message;
    private Map<?,?> data;



}
