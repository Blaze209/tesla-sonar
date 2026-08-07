package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public interface j extends IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f13721a = "androidx$room$IMultiInstanceInvalidationCallback".replace(CoreConstants.DOLLAR, CoreConstants.DOT);

    public static abstract class a extends Binder implements j {

        /* JADX INFO: renamed from: androidx.room.j$a$a, reason: collision with other inner class name */
        private static class C0227a implements j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f13722n;

            C0227a(IBinder iBinder) {
                this.f13722n = iBinder;
            }

            @Override // androidx.room.j
            public void M(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.f13721a);
                    parcelObtain.writeStringArray(strArr);
                    this.f13722n.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13722n;
            }
        }

        public a() {
            attachInterface(this, j.f13721a);
        }

        public static j R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(j.f13721a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j)) ? new C0227a(iBinder) : (j) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            String str = j.f13721a;
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i11 != 1) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            M(parcel.createStringArray());
            return true;
        }
    }

    void M(String[] strArr);
}
