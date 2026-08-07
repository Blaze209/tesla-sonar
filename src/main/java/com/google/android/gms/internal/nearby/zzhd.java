package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
final class zzhd extends zzhh {
    zzhd() {
    }

    @Override // com.google.android.gms.internal.nearby.zzhh, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.internal.nearby.zzhh
    /* JADX INFO: renamed from: zza */
    public final zzhg createFromParcel(Parcel parcel) {
        zzhg zzhgVarCreateFromParcel = super.createFromParcel(parcel);
        if (zzhgVarCreateFromParcel.zzb != null) {
            zzhgVarCreateFromParcel.zza = zzhg.zzd(zzhgVarCreateFromParcel.zzb);
        }
        return zzhgVarCreateFromParcel;
    }
}
