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
@SafeParcelable.Class(creator = "CancelPayloadParamsCreator")
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();

    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzfs zza;

    @SafeParcelable.Field(getter = "getPayloadId", id = 2)
    private long zzb;

    private zzav() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzav) {
            zzav zzavVar = (zzav) obj;
            if (Objects.equal(this.zza, zzavVar.zza) && Objects.equal(Long.valueOf(this.zzb), Long.valueOf(zzavVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzfs zzfsVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzfsVar == null ? null : zzfsVar.asBinder(), false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzav(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) long j11) {
        zzfs zzfqVar;
        if (iBinder == null) {
            zzfqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzfqVar = iInterfaceQueryLocalInterface instanceof zzfs ? (zzfs) iInterfaceQueryLocalInterface : new zzfq(iBinder);
        }
        this.zza = zzfqVar;
        this.zzb = j11;
    }

    /* synthetic */ zzav(zzau zzauVar) {
    }
}
