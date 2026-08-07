package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public interface TileProvider {

    @NonNull
    public static final Tile NO_TILE = new Tile(-1, -1, null);

    Tile getTile(int i11, int i12, int i13);
}
