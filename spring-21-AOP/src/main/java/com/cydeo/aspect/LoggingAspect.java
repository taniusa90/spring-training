package com.cydeo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("execution(* com.cydeo.controller.CourseController.*(..))")
    public void myPointcut() {
    }
//
//    @Before("myPointcut()")
//    public void log() {
//        logger.info("Info log..........");
//    }
//
//    @Before("execution(* com.cydeo.controller.CourseController.*(..))")
//    public void log() {
//        logger.info("Info log..........");


//    @Pointcut("execution(* com.cydeo.repository.CourseRepository.findById(*))")
//    public void courseRepositoryFindByIdPC() {}
//
//    @Before("courseRepositoryFindByIdPC()")
//    public void beforeCourseRepositoryFindById(JoinPoint joinPoint) {
//        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
//                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//    }

//    @Pointcut("within(com.cydeo.controller..*)")//all the methods in this pack and subpackage will be my join points
//    public void anyControllerOperation() {
//    }
//
//    //I want all the meth in my service class to be my endpoints
//    @Pointcut("@within(org.springframework.stereotype.Service)")
//    public void anyServiceOperation() {
//    }
//
//    @Before("anyControllerOperation() || anyServiceOperation()")
//    public void beforeControllerOrServiceAdvice(JoinPoint joinPoint) {
//        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
//                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//
//}


    @Pointcut("@annotation(org.springframework.web.bind.annotation.DeleteMapping)")
    public void anyDeleteControllerOperation() {
    }

//    @Before("anyDeleteControllerOperation()")
//    public void beforeDeleteMappingAnnotation(JoinPoint joinPoint) {
//        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
//                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//
//
//    }

//    @Pointcut("@annotation(com.cydeo.annotation.LoggingAnnotation)")
//    public void loggingAnnotationPC(){}
//
//       @Before("loggingAnnotationPC()")
//    public void beforeDeleteMappingAnnotation(JoinPoint joinPoint) {
//        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
//                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//

    }

//    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
//    public void afterReturningGetMappingAnnotation() {}
//
//    @AfterReturning(pointcut = "afterReturningGetMappingAnnotation()", returning = "result")
//    public void afterReturningGetMappingOperation(JoinPoint joinPoint, Object result) {
//        logger.info("After Returning -> Method: {}, Result: {}", joinPoint.getSignature(), result.toString());
//    }
//
//    @AfterReturning(pointcut = "afterReturningGetMappingAnnotation()", returning = "results")
//    public void afterReturningGetMappingOperation(JoinPoint joinPoint, List<CourseDTO> results) {
//        logger.info("After Returning -> Method: {}, Result: {}", joinPoint.getSignature(), results.toString());
//    }
//
// CourseDTO -> Object     --> This is ok
// List<CourseDTO> -> List<Object>     --> This is not ok
//
//    @AfterThrowing(pointcut = "afterReturningGetMappingAnnotation()", throwing = "exception")
//    public void afterThrowingGetMappingOperation(JoinPoint joinPoint, RuntimeException exception) {
//        logger.error("After Throwing -> Method: {}, Exception: {}"
//                , joinPoint.getSignature().toShortString(), exception.getMessage());
//    }





