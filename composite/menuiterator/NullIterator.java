package composite.menuiterator;
import java.util.Iterator;

// for leaf nodes (Menu items) - they have no childs
public class NullIterator implements Iterator<MenuComponent>{
    public MenuComponent next(){
        return null;
    }
    public boolean hasNext(){
        return false;
    }
}