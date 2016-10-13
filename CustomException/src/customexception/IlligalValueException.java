/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customexception;

/**
 *
 * @author dasg
 */
public class IlligalValueException extends Exception {

    public IlligalValueException() {
        super();
    }

    public IlligalValueException(String message) {
        super(message);
    }

    public IlligalValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public IlligalValueException(Throwable cause) {
        super(cause);
    }

}
