package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzn extends com.google.android.gms.internal.nearby.zzb implements zzo {
    public zzn() {
        super("com.google.android.gms.nearby.messages.internal.IMessageListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1 || i11 == 2) {
            com.google.android.gms.internal.nearby.zzc.zzb(parcel);
        } else {
            if (i11 != 4) {
                return false;
            }
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Update.CREATOR);
            com.google.android.gms.internal.nearby.zzc.zzb(parcel);
            zzd(arrayListCreateTypedArrayList);
        }
        return true;
    }
}
