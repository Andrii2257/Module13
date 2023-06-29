package hw1.models;

public class CommentEntity {
    private int id;
    private int postId;
    private String name;
    private String email;
    private String body;

    public CommentEntity(int postId, String name, String email, String body) {
        this.postId = postId;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "CommentEntity{" +
                "id=" + id +
                ", postId=" + postId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
