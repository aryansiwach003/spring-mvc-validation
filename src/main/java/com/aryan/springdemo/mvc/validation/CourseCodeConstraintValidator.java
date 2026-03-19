package com.aryan.springdemo.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator  implements ConstraintValidator<CourseCode,String> {

    private String coursePrefix;
   @Override
   public void initialize(CourseCode thCourseCode){
        coursePrefix=thCourseCode.value();
   }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext theconstraintValidatorContext) {

        boolean res;

        if(s!=null){
              res=s.startsWith(coursePrefix);
        }
        else{
            res=true;
        }

        return res;
    }
}
