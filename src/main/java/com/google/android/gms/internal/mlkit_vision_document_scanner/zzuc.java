package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "DocumentScanningPageParcelCreator")
public final class zzuc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuc> CREATOR = new zzud();

    @SafeParcelable.Field(getter = "getImageTeleporter", id = 1)
    private final BitmapTeleporter zza;

    @SafeParcelable.Constructor
    public zzuc(@SafeParcelable.Param(id = 1) BitmapTeleporter bitmapTeleporter) {
        this.zza = bitmapTeleporter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final BitmapTeleporter zza() {
        return this.zza;
    }
}
