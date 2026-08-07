package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public interface ILicensingService extends IInterface {

    public static abstract class a extends Binder implements ILicensingService {

        /* JADX INFO: renamed from: com.android.vending.licensing.ILicensingService$a$a, reason: collision with other inner class name */
        private static class C0408a implements ILicensingService {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static ILicensingService f20152o;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f20153n;

            C0408a(IBinder iBinder) {
                this.f20153n = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20153n;
            }

            @Override // com.android.vending.licensing.ILicensingService
            public void e0(long j11, String str, com.android.vending.licensing.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                    parcelObtain.writeLong(j11);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f20153n.transact(1, parcelObtain, null, 1) || a.S2() == null) {
                        return;
                    }
                    a.S2().e0(j11, str, aVar);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static ILicensingService R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILicensingService)) ? new C0408a(iBinder) : (ILicensingService) iInterfaceQueryLocalInterface;
        }

        public static ILicensingService S2() {
            return C0408a.f20152o;
        }
    }

    void e0(long j11, String str, com.android.vending.licensing.a aVar);
}
