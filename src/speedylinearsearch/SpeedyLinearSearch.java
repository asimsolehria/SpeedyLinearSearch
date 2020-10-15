
package speedylinearsearch;

/**
 *
 * @author asim
 */
public class SpeedyLinearSearch {
    
    public int speedySearch(int array[], int value)
    {
        int start=0;
        int end=array.length-1;
        
        
        int foundIndex=-1;
        
        while(start!=end)
        {
            if(array[start]==value)
            {
                foundIndex=start;
                break;
            }
            if(array[end]==value)
            {
                foundIndex=end;
                break;
            }
            start++;
            end--;
            
        }
        
        return foundIndex;
    }
    
}
