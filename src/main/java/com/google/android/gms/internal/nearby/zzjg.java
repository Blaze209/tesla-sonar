package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
import java.util.Objects;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "DeviceTypeCreator")
public final class zzjg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjg> CREATOR = new zzjh();

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getValue", id = 1)
    private final int zza;

    @SafeParcelable.Constructor
    public zzjg(@SafeParcelable.Param(id = 1) int i11) {
        this.zza = i11;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzjg) && this.zza == ((zzjg) obj).zza;
    }

    public final int hashCode() {
        return Objects.hash(22, Integer.valueOf(this.zza));
    }

    public final String toString() {
        return String.format(Locale.US, "DataElement<type: %s, value: %d>", "DeviceType", Integer.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
