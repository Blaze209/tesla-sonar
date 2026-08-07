package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public abstract class UrlTileProvider implements TileProvider {
    private final int zza;
    private final int zzb;

    public UrlTileProvider(int i11, int i12) {
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i11, int i12, int i13) {
        URL tileUrl = getTileUrl(i11, i12, i13);
        if (tileUrl == null) {
            return TileProvider.NO_TILE;
        }
        try {
            com.google.android.gms.internal.maps.zzf.zzb(4352);
            int i14 = this.zza;
            int i15 = this.zzb;
            InputStream inputStream = tileUrl.openConnection().getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Preconditions.checkNotNull(inputStream, "from must not be null.");
            Preconditions.checkNotNull(byteArrayOutputStream, "to must not be null.");
            byte[] bArr = new byte[4096];
            while (true) {
                int i16 = inputStream.read(bArr);
                if (i16 == -1) {
                    return new Tile(i14, i15, byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i16);
            }
        } catch (IOException unused) {
            return null;
        } finally {
            com.google.android.gms.internal.maps.zzf.zza();
        }
    }

    public abstract URL getTileUrl(int i11, int i12, int i13);
}
