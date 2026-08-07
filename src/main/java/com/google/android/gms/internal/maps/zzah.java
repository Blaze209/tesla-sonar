package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

/* JADX INFO: loaded from: classes5.dex */
public final class zzah extends zza implements zzaj {
    zzah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final Tile zzb(int i11, int i12, int i13) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i11);
        parcelZza.writeInt(i12);
        parcelZza.writeInt(i13);
        Parcel parcelZzH = zzH(1, parcelZza);
        Tile tile = (Tile) zzc.zza(parcelZzH, Tile.CREATOR);
        parcelZzH.recycle();
        return tile;
    }
}
