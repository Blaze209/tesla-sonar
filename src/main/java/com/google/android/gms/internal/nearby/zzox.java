package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "UwbDeviceParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzox extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzox> CREATOR = new zzoy();

    @SafeParcelable.Field(getter = "getAddress", id = 1)
    private zzni zza;

    private zzox() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzox) {
            return Objects.equal(this.zza, ((zzox) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzni zza() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    zzox(@SafeParcelable.Param(id = 1) zzni zzniVar) {
        this.zza = zzniVar;
    }

    /* synthetic */ zzox(zzow zzowVar) {
    }
}
