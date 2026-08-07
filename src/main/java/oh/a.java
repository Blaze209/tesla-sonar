package oh;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: oh.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC2090a extends Binder implements a {

        /* JADX INFO: renamed from: oh.a$a$a, reason: collision with other inner class name */
        public static class C2091a implements a {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public IBinder f97332n;

            public C2091a(IBinder iBinder) {
                this.f97332n = iBinder;
            }

            @Override // oh.a
            public String a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    this.f97332n.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f97332n;
            }
        }

        public static a R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C2091a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }

    String a();
}
