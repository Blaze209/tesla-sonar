package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.android.vending.licensing.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0409a extends Binder implements a {
        public AbstractBinderC0409a() {
            attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 == 1) {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                p0(parcel.readInt(), parcel.readString(), parcel.readString());
                return true;
            }
            if (i11 != 1598968902) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
            return true;
        }
    }

    void p0(int i11, String str, String str2);
}
