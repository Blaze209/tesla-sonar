package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "TextRecognizerOptionsCreator")
public final class zzvh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvh> CREATOR = new zzvi();

    @SafeParcelable.Field(getter = "getConfigLabel", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getLoggingLibraryName", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getModelPath", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getIsMLKit", id = 4)
    private final boolean zzd;

    @SafeParcelable.Field(getter = "getDetectionTypeValue", id = 5)
    private final int zze;

    @SafeParcelable.Field(getter = "getLanguageHint", id = 6)
    private final String zzf;

    @SafeParcelable.Field(getter = "getEnableLowLatencyInBackground", id = 7)
    private final boolean zzg;

    @SafeParcelable.Constructor
    public zzvh(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) boolean z11, @SafeParcelable.Param(id = 5) int i11, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) boolean z12) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzf = str4;
        this.zze = i11;
        this.zzd = z11;
        this.zzg = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
