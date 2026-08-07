package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14690d = "androidx$work$multiprocess$IWorkManagerImpl".replace(CoreConstants.DOLLAR, CoreConstants.DOT);

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: androidx.work.multiprocess.b$a$a, reason: collision with other inner class name */
        private static class C0252a implements b {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f14691n;

            C0252a(IBinder iBinder) {
                this.f14691n = iBinder;
            }

            @Override // androidx.work.multiprocess.b
            public void I(String str, c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f14690d);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f14691n.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14691n;
            }

            @Override // androidx.work.multiprocess.b
            public void h0(String str, byte[] bArr, c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f14690d);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f14691n.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public void q1(byte[] bArr, c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f14690d);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f14691n.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public void y0(byte[] bArr, c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f14690d);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f14691n.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, b.f14690d);
        }

        public static b R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f14690d);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0252a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            String str = b.f14690d;
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i11) {
                case 1:
                    q1(parcel.createByteArray(), c.a.R2(parcel.readStrongBinder()));
                    return true;
                case 2:
                    h0(parcel.readString(), parcel.createByteArray(), c.a.R2(parcel.readStrongBinder()));
                    return true;
                case 3:
                    y0(parcel.createByteArray(), c.a.R2(parcel.readStrongBinder()));
                    return true;
                case 4:
                    M1(parcel.readString(), c.a.R2(parcel.readStrongBinder()));
                    return true;
                case 5:
                    g1(parcel.readString(), c.a.R2(parcel.readStrongBinder()));
                    return true;
                case 6:
                    I(parcel.readString(), c.a.R2(parcel.readStrongBinder()));
                    return true;
                case 7:
                    r1(c.a.R2(parcel.readStrongBinder()));
                    return true;
                case 8:
                    v2(parcel.createByteArray(), c.a.R2(parcel.readStrongBinder()));
                    return true;
                case 9:
                    v0(parcel.createByteArray(), c.a.R2(parcel.readStrongBinder()));
                    return true;
                case 10:
                    A2(parcel.createByteArray(), c.a.R2(parcel.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(i11, parcel, parcel2, i12);
            }
        }
    }

    void A2(byte[] bArr, c cVar);

    void I(String str, c cVar);

    void M1(String str, c cVar);

    void g1(String str, c cVar);

    void h0(String str, byte[] bArr, c cVar);

    void q1(byte[] bArr, c cVar);

    void r1(c cVar);

    void v0(byte[] bArr, c cVar);

    void v2(byte[] bArr, c cVar);

    void y0(byte[] bArr, c cVar);
}
