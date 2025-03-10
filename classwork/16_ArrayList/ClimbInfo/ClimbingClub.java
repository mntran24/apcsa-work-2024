import java.util.ArrayList;

public class ClimbingClub
{
    /** The list of climbs completed by members of the club.
    * Guaranteed not to be null. Contains only non-null references.
    */
    
    private ArrayList<ClimbInfo> climbList;
    
    /** Creates a new ClimbingClub object. */
    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }

    public int getSize(){
      return climbList.size();
    }

    public ClimbInfo getItem(int index){
      return climbList.get(index);
    }
    
    /** Adds a new climb with name peakName and time climbTime to the list of climbs.
    * @param peakName the name of the mountain peak climbed
    * @param climbTime the number of minutes taken to complete the climb
    */
    public void addClimb(String peakName, int climbTime)
    { /* to be implemented in part (1) with ClimbInfo objects in alphabetical order by name */
        for (int i = 0;i<climbList.size();i++){
            if (climbList.get(i).getName().compareTo(peakName)>0){
                climbList.add(i,new ClimbInfo(peakName,climbTime));
                return;
            }
        }
        climbList.add(new ClimbInfo(peakName,climbTime));
    }
    /** @return the number of distinct names in the list of climbs */
    public int distinctPeakNames()
    { /* implementation shown in directions file */

        if (climbList.size() == 0)
        {
          return 0;
        }
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;
        for (int k = 1; k < climbList.size(); k++)
        {
          currInfo = climbList.get(k);
          currName = currInfo.getName();
          if (prevName.compareTo(currName) != 0)
          {
            numNames++;
            prevName = currName;
          }
        }
        return numNames;
    }

}