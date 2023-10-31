package model;

public class Entity {
    private Entity path, word;

    public Entity() {
    }

    public Entity(Entity path, Entity word) {
        this.path = path;
        this.word = word;
    }

    public Entity getPath() {
        return path;
    }

    public void setPath(Entity path) {
        this.path = path;
    }

    public Entity getWord() {
        return word;
    }

    public void setWord(Entity word) {
        this.word = word;
    }
    
    
}
