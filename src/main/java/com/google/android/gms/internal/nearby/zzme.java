package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "RangingMeasurementParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzme extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzme> CREATOR = new zzmf();

    @SafeParcelable.Field(getter = "getConfidence", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getValue", id = 2)
    private float zzb;

    private zzme() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzme) {
            zzme zzmeVar = (zzme) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzmeVar.zza)) && Objects.equal(Float.valueOf(this.zzb), Float.valueOf(zzmeVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Float.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeFloat(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final float zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    zzme(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) float f11) {
        this.zza = i11;
        this.zzb = f11;
    }
}
