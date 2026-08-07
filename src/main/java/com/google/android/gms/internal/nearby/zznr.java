package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "UwbComplexChannelParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zznr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznr> CREATOR = new zzns();

    @SafeParcelable.Field(getter = "getChannel", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getPreambleIndex", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private int zzc;

    private zznr() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zznr) {
            zznr zznrVar = (zznr) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zznrVar.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zznrVar.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zznrVar.zzc))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    zznr(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) int i12, @SafeParcelable.Param(id = 3) int i13) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
    }

    /* synthetic */ zznr(zznq zznqVar) {
    }
}
