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
@SafeParcelable.Class(creator = "TriggerSassForUsageParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new zzal();

    @SafeParcelable.Field(getter = "getAudioUsage", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getBooleanCallbackAsBinder", id = 2, type = "android.os.IBinder")
    private zzac zzb;

    private zzak() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzak) {
            zzak zzakVar = (zzak) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzakVar.zza)) && Objects.equal(this.zzb, zzakVar.zzb)) {
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
    zzak(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) IBinder iBinder) {
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

    /* synthetic */ zzak(zzaj zzajVar) {
    }
}
