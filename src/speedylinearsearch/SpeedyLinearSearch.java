
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
        int mid=(start+end)/2;
        int founIndex=-1;
        while(start<=mid && end>=mid)
        {
            if(array[start]==value)
            {   
                founIndex=start;
                break;
            }
            if(array[end]==value)
            {
                founIndex=end;
                break;
            }
            
            start++;
            end--;
            
        }
        
        return founIndex;
    }
    
}
