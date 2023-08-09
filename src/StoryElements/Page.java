package StoryElements;

import java.util.ArrayList;

public class Page{
    
    private String title;
    private String story;
    private ArrayList<Node> nodes;
    
    public Page(String title){
        this.title=title;
        story="";
        nodes=new ArrayList<Node>();
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public void setStory(String s){
        story=s;
    }
    
    public String getStory(){
        return story;
    }
    
    public void addNode(Node n){
        nodes.add(n);
    }
    
    public Node getNode(int index){
        return nodes.get(index);
    }
    
    public ArrayList<Node> getNodes(){
        return nodes;
    }
}
