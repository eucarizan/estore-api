package dev.nj.estoreapi.exceptions;

public enum ErrorCode {
    GENERIC_ERROR("ESTORE-0001", "The system is unable to complete the request. Contact system support."),
    HTTP_MEDIATYPE_NOT_SUPPORTED("ESTORE-0002", "Requested media type is not supported. Please use application/json or application/xml as 'Content-Type' header value"),
    HTTP_MESSAGE_NOT_WRITABLE("ESTORE-0003", "Missing 'Accept' header. Please add 'Accept' header."),
    HTTP_MEDIA_TYPE_NOT_ACCEPTABLE("ESTORE-0004", "Requested 'Accept' header value is not supported. Please use application/json or application/xml as 'Accept' value"),
    JSON_PARSE_ERROR("ESTORE-0005", "Make sure request payload should be a valid JSON object"),
    HTTP_MESSAGE_NOT_READABLE("ESTORE-0006", "Make sure request payload should be a valid JSON or XML object according to 'Content-Type'.");

    private final String errCode;
    private final String errMsgKey;

    ErrorCode(final String errCode, final String errMsgKey) {
        this.errCode = errCode;
        this.errMsgKey = errMsgKey;
    }

    public String getErrCode() {return  errCode;}
    public String getErrMsgKey() { return errMsgKey; }
}
