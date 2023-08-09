package StoryElements;

import java.util.ArrayList;

public class Chapter{
    
    private String title;
    private ArrayList<Page> pages;
    
    public Chapter(String title){
        pages = new ArrayList<Page>();
        this.title=title;
    }
    
    public ArrayList<Page> getPages(){
        return pages;
    }
    
    public void addPage(Page page, Chapter c){
        boolean hasPage=false;
        for(Page p:pages){
            if (p==page)
                hasPage=true;
        }
        if (!hasPage)
            pages.add(page);
        if (c!=null){
            c.deletePage(page);
        }
    }
    
    public void deletePage(Page page){
        int val=pages.indexOf(page);
        pages.remove(val);
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
}
