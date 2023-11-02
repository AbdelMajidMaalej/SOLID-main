package com.directi.training.ocp.exercise;

public class SpaceSlot implements ResourceType{
	
	public SpaceSlot() {}
	
	public void markSpaceSlotFree(int resourceId)
    {
    }
	
	public void markSpaceSlotBusy(int resourceId)
    {
    }

	public int findFreeSpaceSlot()
    {
        return 0;
    }

	@Override
	public String GetType() {
		return "SpaceSlot";
	}
    
}
