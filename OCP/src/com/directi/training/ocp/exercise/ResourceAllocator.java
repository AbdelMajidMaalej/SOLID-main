package com.directi.training.ocp.exercise;

public interface ResourceAllocator
{
    public int allocate(ResourceType resourceType);
    public void free(ResourceType resourceType, int resourceId);

}
