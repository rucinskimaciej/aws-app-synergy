package online.rumac.common.exceptions;

public class EmptyCapabilitiesException extends IllegalArgumentException {

    public EmptyCapabilitiesException() {
        super("-Djson.capabilities property is required. See README for more information");
    }

}
