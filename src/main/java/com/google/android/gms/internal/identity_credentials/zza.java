package com.google.android.gms.internal.identity_credentials;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public class zza implements IInterface {
    private final String mDescriptor = "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    private final IBinder mRemote;

    protected zza(IBinder iBinder, String str) {
        this.mRemote = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.mRemote;
    }

    protected Parcel obtainAndWriteInterfaceToken() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.mDescriptor);
        return parcelObtain;
    }

    protected void transactAndReadExceptionReturnVoid(int i11, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.mRemote.transact(i11, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
