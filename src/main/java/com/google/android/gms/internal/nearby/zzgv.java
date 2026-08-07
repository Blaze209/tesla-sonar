package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "OnStartAdvertisingResultParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzgv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgv> CREATOR = new zzgw();

    @SafeParcelable.Field(getter = "getStatusCode", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getLocalEndpointName", id = 2)
    private String zzb;

    private zzgv() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgv) {
            zzgv zzgvVar = (zzgv) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzgvVar.zza)) && Objects.equal(this.zzb, zzgvVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    zzgv(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) String str) {
        this.zza = i11;
        this.zzb = str;
    }
}
