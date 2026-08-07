package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14688c = "androidx$work$multiprocess$IListenableWorkerImpl".replace(CoreConstants.DOLLAR, CoreConstants.DOT);

    /* JADX INFO: renamed from: androidx.work.multiprocess.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0250a extends Binder implements a {

        /* JADX INFO: renamed from: androidx.work.multiprocess.a$a$a, reason: collision with other inner class name */
        private static class C0251a implements a {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f14689n;

            C0251a(IBinder iBinder) {
                this.f14689n = iBinder;
            }

            @Override // androidx.work.multiprocess.a
            public void E2(byte[] bArr, c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f14688c);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f14689n.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.a
            public void S0(byte[] bArr, c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f14688c);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f14689n.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.a
            public void U(byte[] bArr, c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f14688c);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f14689n.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14689n;
            }
        }

        public static a R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f14688c);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0251a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }

    void E2(byte[] bArr, c cVar);

    void S0(byte[] bArr, c cVar);

    void U(byte[] bArr, c cVar);
}
