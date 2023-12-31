package hello.exception.servlet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@Slf4j
@Controller
public class ErrorPageController {

    @RequestMapping("/error-page/404")
    public String errorPage404(HttpServletRequest request, HttpServletResponse response) {
        log.info("errorPage 404");
        return "error-page/404";
    }

    @RequestMapping("/error-page/500")
    public String errorPage500(HttpServletRequest request, HttpServletResponse response) {
        log.info("errorPage 500");
        return "error-page/500";
    }

//    private void printErrorInfo (HttpServletRequest request) {
//        log.info ("ERROR_EXCEPTION: {}", request.getAttribute(ERROR_EXCEPTION)) ;
//        log.info("ERROR_EXCEPTION_TYPE: {]", request. getAttribute (ERROR_EXCEPTION_TYPE));
//        log.info ("ERROR_MESSAGE: {}", request.getAttribute(ERROR_MESSAGE)) ;
//        log.info ("ERROR_REQUEST_URI: {]", request. getAttribute (ERROR_REQUEST_URI)) ;
//        log.info ("ERROR_SERVLET_NAME: (]-", request. getAttribute (ERROR_SERVLET_NAME)) ;
//        log.info ("ERROR_STATUS_CODE: (]", request. getAttribute (ERROR_ STATUS_CODE));
//        log.info("dispatchType=(}", request. getDispatcherType ());
}
