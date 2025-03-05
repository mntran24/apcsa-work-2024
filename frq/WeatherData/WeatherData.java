import java.util.ArrayList;

public class WeatherData
{
/** Guaranteed not to be null and to contain only non-null entries */
private ArrayList<Double> temperatures;
/**
* Cleans the data by removing from temperatures all values that are less than
* lower and all values that are greater than upper, as described in part (a)
*/

public WeatherData(ArrayList<Double> temperatures){
    this.temperatures = temperatures;
}
public void cleanData(double lower, double upper)
{ /* to be implemented in part (a) */ 
    for (int i = 0;i<temperatures.size();i++){
        if (temperatures.get(i) < lower || temperatures.get(i) > upper){
            temperatures.remove(i);
            i--;
        }
    }
}
/**
* Returns the length of the longest heat wave found in temperatures, as described in
* part (b)
* Precondition: There is at least one heat wave in temperatures based on threshold.
*/
public int longestHeatWave(double threshold)
{ /* to be implemented in part (b) */ 
    int longest = 2;
    boolean currWave = false;
    int currlength = 0;
    for (int i = 0; i<temperatures.size();i++){
        if (temperatures.get(i)>threshold){
            currWave = true;
            currlength++;
        }
        else{
            currWave = false;
            currlength = 0;
        }
        if (currlength>longest){
            longest = currlength;
        }
    }
    return longest;
}
// There may be instance variables, constructors, and methods that are not shown.
}