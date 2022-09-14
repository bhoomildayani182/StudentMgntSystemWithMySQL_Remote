package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.User;
import in.ac.charusat.studentmgmtsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    private JavaMailSender javaMailSender;


    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public List<User> addUser(@RequestBody User user) {
        userRepository.save(user);
        sendEmail();
        return userRepository.findAll();
    }
    void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("bhoomildayani05@gmail.com", "to_2@gmail.com", "to_3@yahoo.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");

        javaMailSender.send(msg);

    }
}
