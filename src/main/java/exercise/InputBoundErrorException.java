package exercise;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class InputBoundErrorException extends Exception{
    private String message;
    public InputBoundErrorException(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }

    public ResponseEntity<String> getResponseEntity(){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(getMessage());
    }
}
