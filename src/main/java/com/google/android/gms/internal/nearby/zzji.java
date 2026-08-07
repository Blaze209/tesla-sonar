package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "PresenceActionCreator")
public final class zzji extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzji> CREATOR = new zzjj();

    @SafeParcelable.Field(getter = "getActionIdentifier", id = 1)
    private final int zza;

    @SafeParcelable.Constructor
    zzji(@SafeParcelable.Param(id = 1) int i11) {
        this.zza = i11;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzji) && this.zza == ((zzji) obj).zza;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza));
    }

    public final String toString() {
        return "PresenceAction[action=" + this.zza + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
