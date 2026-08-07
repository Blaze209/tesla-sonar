package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "NearbyDeviceFilterCreator")
public final class zzis extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzis> CREATOR = new zzit();

    @SafeParcelable.VersionField(id = 1000)
    final int zza;

    @SafeParcelable.Field(id = 1)
    final int zzb;

    @SafeParcelable.Field(id = 2)
    final byte[] zzc;

    @SafeParcelable.Field(id = 3)
    final boolean zzd;

    @SafeParcelable.Constructor
    zzis(@SafeParcelable.Param(id = 1000) int i11, @SafeParcelable.Param(id = 1) int i12, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) boolean z11) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = bArr;
        this.zzd = z11;
    }

    public static zzis zza(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        return new zzis(2, new com.google.android.gms.nearby.messages.internal.zzg(com.google.android.gms.nearby.messages.internal.zzc.zzd(String.valueOf(str).concat(str2))).zzc());
    }

    public static zzis zzb(UUID uuid, Short sh2, Short sh3) {
        return new zzis(3, new com.google.android.gms.nearby.messages.internal.zzl(uuid, sh2, sh3).zzc());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzis(int i11, byte[] bArr) {
        this(1, i11, bArr, false);
    }
}
