package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "RangingControleeParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmc> CREATOR = new zzmd();

    @SafeParcelable.Field(getter = "getAddress", id = 1)
    private zzni zza;

    @SafeParcelable.Field(getter = "getSubSessionId", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getSubSessionKey", id = 3)
    private byte[] zzc;

    private zzmc() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmc) {
            zzmc zzmcVar = (zzmc) obj;
            if (Objects.equal(this.zza, zzmcVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzmcVar.zzb)) && Arrays.equals(this.zzc, zzmcVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), Integer.valueOf(Arrays.hashCode(this.zzc)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i11, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* synthetic */ zzmc(zzmb zzmbVar) {
    }

    @SafeParcelable.Constructor
    zzmc(@SafeParcelable.Param(id = 1) zzni zzniVar, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) byte[] bArr) {
        this.zza = zzniVar;
        this.zzb = i11;
        this.zzc = bArr;
    }
}
