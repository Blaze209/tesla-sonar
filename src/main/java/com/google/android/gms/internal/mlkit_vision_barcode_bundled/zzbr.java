package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "MlBinarizerOptionsParcelCreator")
public final class zzbr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbr> CREATOR = new zzbs();

    @SafeParcelable.Field(getter = "getUseMlBinarizerSequenceFor2d", id = 1)
    private final boolean zza;

    @SafeParcelable.Field(getter = "getBinarizerModelData", id = 2)
    private final byte[] zzb;

    @SafeParcelable.Field(getter = "getUseNnapi", id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getForegroundThreshold", id = 4)
    private final float zzd;

    @SafeParcelable.Field(getter = "getUsePaddedInput", id = 5)
    private final boolean zze;

    @SafeParcelable.Constructor
    public zzbr(@SafeParcelable.Param(id = 1) boolean z11, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) boolean z12, @SafeParcelable.Param(id = 4) float f11, @SafeParcelable.Param(id = 5) boolean z13) {
        this.zza = z11;
        this.zzb = bArr;
        this.zzc = z12;
        this.zzd = f11;
        this.zze = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        boolean z11 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z11);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeFloat(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
