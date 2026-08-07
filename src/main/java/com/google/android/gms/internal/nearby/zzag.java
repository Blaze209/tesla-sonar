package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "SassDeviceAvailableParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new zzah();

    @SafeParcelable.Field(getter = "getAudioUsage", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getBooleanCallbackAsBinder", id = 2, type = "android.os.IBinder")
    private zzac zzb;

    private zzag() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzag) {
            zzag zzagVar = (zzag) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzagVar.zza)) && Objects.equal(this.zzb, zzagVar.zzb)) {
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
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzag(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) IBinder iBinder) {
        zzac zzaaVar;
        if (iBinder == null) {
            zzaaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IBooleanCallback");
            zzaaVar = iInterfaceQueryLocalInterface instanceof zzac ? (zzac) iInterfaceQueryLocalInterface : new zzaa(iBinder);
        }
        this.zza = i11;
        this.zzb = zzaaVar;
    }

    /* synthetic */ zzag(zzaf zzafVar) {
    }
}
