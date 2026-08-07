package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.Address;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.location.zzh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "DeviceOrientationRequestInternalCreator")
public final class C4339zzh extends AbstractSafeParcelable {

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_DEVICE_ORIENTATION_REQUEST", id = 1)
    final DeviceOrientationRequest zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_CLIENTS", id = 2)
    final List zzd;

    @SafeParcelable.Field(defaultValueUnchecked = Address.ADDRESS_NULL_PLACEHOLDER, id = 3)
    final String zze;
    static final List zza = Collections.EMPTY_LIST;
    static final DeviceOrientationRequest zzb = new DeviceOrientationRequest.Builder(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT).build();
    public static final Parcelable.Creator<C4339zzh> CREATOR = new zzi();

    @SafeParcelable.Constructor
    C4339zzh(@SafeParcelable.Param(id = 1) DeviceOrientationRequest deviceOrientationRequest, @SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) String str) {
        this.zzc = deviceOrientationRequest;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4339zzh)) {
            return false;
        }
        C4339zzh c4339zzh = (C4339zzh) obj;
        return Objects.equal(this.zzc, c4339zzh.zzc) && Objects.equal(this.zzd, c4339zzh.zzd) && Objects.equal(this.zze, c4339zzh.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        String str = this.zze;
        StringBuilder sb2 = new StringBuilder(length + 68 + length2 + 7 + String.valueOf(str).length() + 2);
        sb2.append("DeviceOrientationRequestInternal[deviceOrientationRequest=");
        sb2.append(strValueOf);
        sb2.append(", clients=");
        sb2.append(strValueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("']");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i11, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 3, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
