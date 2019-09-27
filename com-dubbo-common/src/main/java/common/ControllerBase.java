package common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import utils.JsonResult;

public class ControllerBase {
    public static final Integer SUCCESS = 2000;
    @ExceptionHandler({Exception.class})
    public JsonResult<Void> handlerException(Exception e){
        JsonResult<Void> jr =  new JsonResult<>();
        jr.setMessage(e.getMessage());
        if (e instanceof  Exception){
           jr.setStat(4000);
        }
        return jr;
    }
}
