package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzs extends BinderC4334zzb implements zzt {
    public zzs() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.identity.BinderC4334zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            int i13 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            C4335zzc.zzd(parcel);
            zzb(i13, strArrCreateStringArray);
        } else if (i11 == 2) {
            int i14 = parcel.readInt();
            String[] strArrCreateStringArray2 = parcel.createStringArray();
            C4335zzc.zzd(parcel);
            zzc(i14, strArrCreateStringArray2);
        } else {
            if (i11 != 3) {
                return false;
            }
            int i15 = parcel.readInt();
            PendingIntent pendingIntent = (PendingIntent) C4335zzc.zza(parcel, PendingIntent.CREATOR);
            C4335zzc.zzd(parcel);
            zzd(i15, pendingIntent);
        }
        return true;
    }
}
