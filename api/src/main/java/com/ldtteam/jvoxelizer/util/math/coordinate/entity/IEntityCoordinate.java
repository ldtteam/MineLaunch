package com.ldtteam.jvoxelizer.util.math.coordinate.entity;

import com.ldtteam.jvoxelizer.util.math.vector.floatingpoint.I3DoubleVector;
import com.ldtteam.jvoxelizer.util.math.vector.integer.I3IntVector;

/**
 * Represents an exact coordinate in the 3D space of the game world
 */
public interface IEntityCoordinate extends I3DoubleVector
{

    static IEntityCoordinate create(double x, double y, double z)
    {
        return EntityCoordinateProviderHolder.getInstance().provide(x, y, z);
    }
}
