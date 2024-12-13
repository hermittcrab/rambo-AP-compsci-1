
public class StepTracker{
  
  int days;
  int steps;
  int activeDays;
  
    
public StepTracker(){
  days = 0;
  steps = 0;
  
}

public StepTracker(int steps){
  
    this.steps = steps;
    
}

public int activeDays(){
   if (steps >= 10000){
    return activeDays;
    }
 
}

public int addDays(){
    return days;
}

public int addDailySteps(){
   return steps;
}


public double averageSteps(){
    return (steps/days);
}
    
    
}    
    
    
    
    
    
    
