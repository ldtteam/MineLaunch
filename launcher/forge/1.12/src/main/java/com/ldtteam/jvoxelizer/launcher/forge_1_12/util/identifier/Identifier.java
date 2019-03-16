package com.ldtteam.jvoxelizer.launcher.forge_1_12.util.identifier;

import com.ldtteam.jvoxelizer.util.identifier.IIdentifier;
import net.minecraft.util.ResourceLocation;

/**
 * Identifier class for holding resource locations
 */
public class Identifier implements IIdentifier {
    private ResourceLocation forgeIdentifier;

    private Identifier(ResourceLocation forgeIdentifier) {
        this.forgeIdentifier = forgeIdentifier;
    }

    @Override
    public String getDomain() {
        return forgeIdentifier.getResourceDomain();
    }

    @Override
    public String getPath() {
        return forgeIdentifier.getResourcePath();
    }

    public static ResourceLocation asForge(IIdentifier identifier)
    {
        return ((Identifier) identifier).forgeIdentifier;
    }

    public static IIdentifier fromForge(ResourceLocation location)
    {
        if (location instanceof IIdentifier)
            return (IIdentifier) location;

        return new Identifier(location);
    }
}
