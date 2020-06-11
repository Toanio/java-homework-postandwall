package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;
    private int ownerId;
    private String domain;
    private String query;
    private boolean ownersOnly;
    private int count;
    private int offset;
    private int postId;


    public void delete(int ownerId, int postId) {
        this.ownerId = ownerId;
        this.postId = postId;
    }



    public Post[] search(int ownerId, String domain, String query, boolean ownersOnly, int count, int offset) {
        this.ownerId = ownerId;
        this.domain = domain;
        this.query = query;
        this.ownersOnly = ownersOnly;
        this.count = count;
        this.offset = offset;

        return null;

    }







}
