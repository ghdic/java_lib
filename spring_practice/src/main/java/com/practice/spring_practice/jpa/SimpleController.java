package com.practice.spring_practice.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/jpa")
@ResponseBody
public class SimpleController {
    private UserEntity userEntity;
    private PostEntity postEntity;

    @Autowired
    public SimpleController(UserEntity userEntity, PostEntity postEntity) {
        this.userEntity = userEntity;
        this.postEntity = postEntity;
    }

    @GetMapping("/user/insert")
    public User insertUser(@RequestParam String username) {
        User user = new User();
        user.setUsername(username);
        return userEntity.save(user);
    }

    @GetMapping("/post/insert")
    public Post insertPost(@RequestParam String content) {
        Post post = new Post();
        post.setContent(content);
        return postEntity.save(post);
    }
}
