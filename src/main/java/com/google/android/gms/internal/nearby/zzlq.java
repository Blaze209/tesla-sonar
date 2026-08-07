package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "OnRangingResultParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzlq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlq> CREATOR = new zzlr();

    @SafeParcelable.Field(getter = "getDevice", id = 1)
    private zzox zza;

    @SafeParcelable.Field(getter = "getPosition", id = 2)
    private zzmk zzb;

    private zzlq() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlq) {
            zzlq zzlqVar = (zzlq) obj;
            if (Objects.equal(this.zza, zzlqVar.zza) && Objects.equal(this.zzb, zzlqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzmk zza() {
        return this.zzb;
    }

    public final zzox zzb() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    zzlq(@SafeParcelable.Param(id = 1) zzox zzoxVar, @SafeParcelable.Param(id = 2) zzmk zzmkVar) {
        this.zza = zzoxVar;
        this.zzb = zzmkVar;
    }
}
