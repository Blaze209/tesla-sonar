package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public interface k extends IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f13725b = "androidx$room$IMultiInstanceInvalidationService".replace(CoreConstants.DOLLAR, CoreConstants.DOT);

    public static abstract class a extends Binder implements k {

        /* JADX INFO: renamed from: androidx.room.k$a$a, reason: collision with other inner class name */
        private static class C0228a implements k {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f13726n;

            C0228a(IBinder iBinder) {
                this.f13726n = iBinder;
            }

            @Override // androidx.room.k
            public void O2(j jVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(k.f13725b);
                    parcelObtain.writeStrongInterface(jVar);
                    parcelObtain.writeInt(i11);
                    this.f13726n.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.k
            public void Y1(int i11, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(k.f13725b);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeStringArray(strArr);
                    this.f13726n.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13726n;
            }

            @Override // androidx.room.k
            public int n2(j jVar, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(k.f13725b);
                    parcelObtain.writeStrongInterface(jVar);
                    parcelObtain.writeString(str);
                    this.f13726n.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, k.f13725b);
        }

        public static k R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(k.f13725b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof k)) ? new C0228a(iBinder) : (k) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            String str = k.f13725b;
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i11 == 1) {
                int iN2 = n2(j.a.R2(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iN2);
            } else if (i11 == 2) {
                O2(j.a.R2(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i11 != 3) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                Y1(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void O2(j jVar, int i11);

    void Y1(int i11, String[] strArr);

    int n2(j jVar, String str);
}
