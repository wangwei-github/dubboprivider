package utils;

public class JsonResult<T> {
    private Integer stat;
    private String message;
    private T data;

    public JsonResult() {
    }

    public JsonResult(Integer stat, String message, T data) {
        this.stat = stat;
        this.message = message;
        this.data = data;
    }

    public JsonResult(Integer stat) {
        this.stat = stat;
    }

    public JsonResult(Integer stat, T data) {
        this.stat = stat;
        this.data = data;
    }

    public JsonResult(Integer stat, String message) {
        this.stat = stat;
        this.message = message;
    }

    public JsonResult(String message) {
        this.message = message;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
