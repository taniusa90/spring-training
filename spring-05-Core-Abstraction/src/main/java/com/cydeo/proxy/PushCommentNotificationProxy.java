package com.cydeo.proxy;

import com.cydeo.entity.Comment;

public class PushCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {

        System.out.println("Sending push notification for comment:" + comment.getText());

    }
}
