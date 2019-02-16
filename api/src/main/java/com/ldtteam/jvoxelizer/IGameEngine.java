package com.ldtteam.jvoxelizer;

import com.ldtteam.jvoxelizer.client.gui.IGui;
import com.ldtteam.jvoxelizer.entity.player.ISingleplayerPlayerEntity;

public interface IGameEngine
{

    static IGameEngine getInstance()
    {
        return IGameEngineProviderHolder.getInstance().provide();
    }

    ISingleplayerPlayerEntity getSinglePlayerPlayerEntity();

    IGui getCurrentGui();
}
