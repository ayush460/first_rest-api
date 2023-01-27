package com.avengers.StudentManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    //Map<Integer,Student> db=new HashMap<>();
    StudentService studentService;
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam ("q") int admnNo){

        return studentService.getStudent(admnNo);
    }
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);

    }
    @DeleteMapping("/delete_studen/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        return studentService.deleteStudent(id);

    }
    @PutMapping("/update_student")
    public String updateStudent(@RequestParam("id") int id,@RequestParam("age") int age){
        return studentService.updateStudent(id,age);
    }

}
