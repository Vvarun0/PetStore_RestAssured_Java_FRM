package Constant;
/*Stores the response code and messages as enum constants*/
public enum StatusCode {
    CODE_200(200,"Request Successfull"),
    CODE_201(201,""),
    CODE_400(400,"MISSING REQUIRED FILED"),
    CODE_401(401,"INVALID ACCESS"),
    CODE_404(404,"INVALID REQUEST");

    public final int code ;
    public final String msg;

    StatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
