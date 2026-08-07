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
@SafeParcelable.Class(creator = "UwbAvailabilityObserverParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zznm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznm> CREATOR = new zznn();

    @SafeParcelable.Field(getter = "getUwbAvailabilityParamsAsBinder", id = 1, type = "android.os.IBinder")
    private zzlg zza;

    private zznm() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zznm) {
            return Objects.equal(this.zza, ((zznm) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zznm(@SafeParcelable.Param(id = 1) IBinder iBinder) {
        zzlg zzleVar;
        if (iBinder == null) {
            zzleVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbAvailabilityObserver");
            zzleVar = iInterfaceQueryLocalInterface instanceof zzlg ? (zzlg) iInterfaceQueryLocalInterface : new zzle(iBinder);
        }
        this.zza = zzleVar;
    }

    /* synthetic */ zznm(zznl zznlVar) {
    }
}
