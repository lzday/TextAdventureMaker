package StoryElements;

public class Node {
    
    private Chapter linkedChapter;
    private Page linkedPage;
    private String title;
    //for file read/write (keeping track of indexes)
    private int chpPos;
    private int pgPos;
        
    public Node(String title, Page linkedPage, Chapter linkedChapter, int pgPos, int chpPos){
        this.title=title;
        this.linkedPage=linkedPage;
        this.linkedChapter=linkedChapter;
        this.pgPos=pgPos;
        this.chpPos=chpPos;
    }
    
    //for file read/write
    public Node(String title, int pgPos, int chpPos){
        this.title=title;
        this.pgPos=pgPos;
        this.chpPos=chpPos;
    }
    
    public String getTitle(){
        return title;
    }
    
    public Page getLinkedPage(){
        return linkedPage;
    }
    
    public Chapter getLinkedChapter(){
        return linkedChapter;
    }
    
    public int getChpPos(){//for file read/write
        return chpPos;
    }
    
    public int getPgPos(){//for file read/write
        return pgPos;
    }
    
    public void linkPage(Page p){//for file read/write
        linkedPage=p;
    }
    
    public void linkChapter(Chapter c){
        linkedChapter=c;
    }
    
    public void setLinkedPage(Page p, int pos){
        linkedPage=p;
        pgPos=pos;
    }
    
    public void setLinkedChapter(Chapter c, int pos){
        linkedChapter=c;
        chpPos=pos;
        if (linkedChapter.getPages().indexOf(linkedPage)==-1){//comboPage shows first item on list (due to updateUI()), even though the page is not linked 
            setLinkedPage(linkedChapter.getPages().get(0), 0);//so this is to help with consistency
            pgPos=0;
        }
    }
    
    public void setTitle(String s){
        title=s;
    }
}
