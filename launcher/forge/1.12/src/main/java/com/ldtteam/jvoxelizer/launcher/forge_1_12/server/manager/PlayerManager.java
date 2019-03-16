package com.ldtteam.jvoxelizer.launcher.forge_1_12.server.manager;

import com.ldtteam.jvoxelizer.entity.living.player.IMultiplayerPlayerEntity;
import com.ldtteam.jvoxelizer.server.manager.IPlayerManager;
import net.minecraft.server.management.PlayerList;

import java.util.UUID;

public class PlayerManager implements IPlayerManager
{
    private final PlayerList list;

    private PlayerManager(final PlayerList list)
    {
        this.list = list;
    }

    @Override
    public IMultiplayerPlayerEntity getById(final UUID id)
    {
        return null;
    }

    public static PlayerList asForge(final IPlayerManager engine)
    {
        return ((PlayerManager) engine).list;
    }

    public static IPlayerManager fromForge(final PlayerList engine)
    {
        return new PlayerManager(engine);
    }
}
