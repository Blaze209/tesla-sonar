package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "NearbyDeviceCreator")
public final class zziq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zziq> CREATOR = new zzir();
    public static final zziq zza = new zziq(1, "", null);

    @SafeParcelable.VersionField(id = 1000)
    final int zzb;

    @SafeParcelable.Field(getter = "getHandle", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getBluetoothAddress", id = 6)
    private final String zzd;

    @SafeParcelable.Constructor
    zziq(@SafeParcelable.Param(id = 1000) int i11, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 6) String str2) {
        this.zzb = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i11))).intValue();
        this.zzc = str == null ? "" : str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zziq)) {
            return false;
        }
        zziq zziqVar = (zziq) obj;
        return Objects.equal(this.zzc, zziqVar.zzc) && Objects.equal(this.zzd, zziqVar.zzd);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzc, this.zzd);
    }

    public final String toString() {
        return "NearbyDevice{handle=" + this.zzc + ", bluetoothAddress=" + this.zzd + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.zzc;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 3, str, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
