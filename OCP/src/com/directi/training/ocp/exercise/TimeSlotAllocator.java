package com.directi.training.ocp.exercise;

public class TimeSlotAllocator {
	private static final int INVALID_RESOURCE_ID = -1;
	
	public int allocate(TimeSlot timeSlot)
    {
        int resourceId;      
       
            resourceId = timeSlot.findFreeTimeSlot();
            timeSlot.markTimeSlotBusy(resourceId);
      
            System.out.println("ERROR: Attempted to allocate invalid resource");
            resourceId = INVALID_RESOURCE_ID;
           
        return resourceId;
    }

    public void free(TimeSlot timeSlot, int resourceId)
    {
 
        	timeSlot.markTimeSlotFree(resourceId);
            System.out.println("ERROR: attempted to free invalid resource");
 
    }
    
}

