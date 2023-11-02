package com.directi.training.ocp.exercise;

public class SpaceSlotAllocator {
	private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(SpaceSlot spaceSlot)
    {
        int resourceId;
        
            resourceId = spaceSlot.findFreeSpaceSlot();
            spaceSlot.markSpaceSlotBusy(resourceId);
        
            System.out.println("ERROR: Attempted to allocate invalid resource");
            resourceId = INVALID_RESOURCE_ID;
        return resourceId;
    }

    public void free(SpaceSlot spaceSlot, int resourceId)
    { 
    	spaceSlot.markSpaceSlotFree(resourceId);
        System.out.println("ERROR: attempted to free invalid resource");         
    }
}
