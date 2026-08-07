package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "OnRangingSuspendedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzls extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzls> CREATOR = new zzlt();

    @SafeParcelable.Field(getter = "getDevice", id = 1)
    private zzox zza;

    @SafeParcelable.Field(getter = "getReason", id = 2)
    private int zzb;

    private zzls() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzls) {
            zzls zzlsVar = (zzls) obj;
            if (Objects.equal(this.zza, zzlsVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzlsVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i11, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzox zzb() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    zzls(@SafeParcelable.Param(id = 1) zzox zzoxVar, @SafeParcelable.Param(id = 2) int i11) {
        this.zza = zzoxVar;
        this.zzb = i11;
    }
}
