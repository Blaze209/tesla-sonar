package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public interface c extends IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f14692e = "androidx$work$multiprocess$IWorkManagerImplCallback".replace(CoreConstants.DOLLAR, CoreConstants.DOT);

    public static abstract class a extends Binder implements c {

        /* JADX INFO: renamed from: androidx.work.multiprocess.c$a$a, reason: collision with other inner class name */
        private static class C0253a implements c {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f14693n;

            C0253a(IBinder iBinder) {
                this.f14693n = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14693n;
            }

            @Override // androidx.work.multiprocess.c
            public void d1(byte[] bArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f14692e);
                    parcelObtain.writeByteArray(bArr);
                    this.f14693n.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.c
            public void u2(String str) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f14692e);
                    parcelObtain.writeString(str);
                    this.f14693n.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, c.f14692e);
        }

        public static c R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.f14692e);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0253a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            String str = c.f14692e;
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i11 == 1) {
                d1(parcel.createByteArray());
            } else {
                if (i11 != 2) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                u2(parcel.readString());
            }
            return true;
        }
    }

    void d1(byte[] bArr);

    void u2(String str);
}
