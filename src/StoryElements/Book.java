package StoryElements;

import java.util.ArrayList;

public class Book {
    
    private String title;
    private ArrayList<Chapter> chapters;
    
    public Book(String title){
        this.title= title;
        chapters = new ArrayList<Chapter>();
    }
    
    public void addChapter(Chapter c){
        chapters.add(c);
    }
    
    public String getTitle(){
        return title;
    }
    
    public ArrayList<Chapter> getChapters(){
        return chapters;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
}
