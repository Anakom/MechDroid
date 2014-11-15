package com.artcraft.mavr.mechdroid;

import android.service.wallpaper.WallpaperService;

/**
 * Created by mavr on 11/15/14.
 */
public class liveWallpaper extends WallpaperService {
    protected class  liveWallpaperEngine extends Engine {

    }
    @Override
    public Engine onCreateEngine() {
        return new liveWallpaperEngine();
    }
}

