package com.ldtteam.jvoxelizer.launcher.forge_1_12.dimension;

import com.ldtteam.jvoxelizer.dimension.IDimension;
import com.ldtteam.jvoxelizer.entity.IEntity;
import net.minecraft.world.World;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Dimension<I> extends DimensionReader<I> implements IDimension<I>
{
    private final World forgeWorld;

    public Dimension(final World world)
    {
        super(world);
        this.forgeWorld = world;
    }

    @Override
    public int getId()
    {
        return forgeWorld.provider.getDimension();
    }

    @Override
    public List<IEntity> getLoadedEntities()
    {
        throw new NotImplementedException();
    }

    public World getForgeWorld()
    {
        return forgeWorld;
    }
}