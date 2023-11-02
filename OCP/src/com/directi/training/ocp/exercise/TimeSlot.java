package com.directi.training.ocp.exercise;

public class TimeSlot implements ResourceType {
	
	public TimeSlot() {}
	
	public void markTimeSlotFree(int resourceId)
    {
    }
  

	public void markTimeSlotBusy(int resourceId)
    {
    }

	public int findFreeTimeSlot()
    {
        return 0;
    }

	@Override
	public String GetType() {
		return "TimeSlot";
	}
}
