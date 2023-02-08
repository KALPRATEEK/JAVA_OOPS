import java.util.HashSet;

/**
 * Write a description of class hash here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hash
{
    HashSet<Tag> h= new HashSet();
     int c=0;
    public void hashadd(Tag t)
    {
        Tag _t=t;
       
        if(h.contains(_t))
        {
        c=c+1;
        }else{h.add(t);}
        
    
    }
    void display()
    {
    System.out.println(h);
        System.out.println(c);
}
}
