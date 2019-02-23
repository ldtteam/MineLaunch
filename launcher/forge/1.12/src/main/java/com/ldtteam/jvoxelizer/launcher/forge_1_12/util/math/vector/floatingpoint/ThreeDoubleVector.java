package com.ldtteam.jvoxelizer.launcher.forge_1_12.util.math.vector.floatingpoint;

import com.ldtteam.jvoxelizer.util.math.vector.floatingpoint.I3DoubleVector;
import net.minecraft.util.math.Vec3d;

public class ThreeDoubleVector implements I3DoubleVector
{
    private Vec3d vec3d;

    public ThreeDoubleVector(final Vec3d vec3d)
    {
        this.vec3d = vec3d;
    }

    @Override
    public double getX()
    {
        return vec3d.x;
    }

    @Override
    public double getY()
    {
        return vec3d.y;
    }

    @Override
    public double getZ()
    {
        return vec3d.z;
    }
}
