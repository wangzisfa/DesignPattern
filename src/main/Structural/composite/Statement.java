package Structural.composite;

public class Statement {
    private String statementCode;
    private String message;
    private String token;

    public Statement() {
    }

    public Statement(String statementCode, String message, String token) {
        this.statementCode = statementCode;
        this.message = message;
        this.token = token;
    }

    public String getStatementCode() {
        return statementCode;
    }

    public void setStatementCode(String statementCode) {
        this.statementCode = statementCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "statementCode='" + statementCode + '\'' +
                ", message='" + message + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
