package w5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f120806k = "androidx$core$uwb$backend$IUwb".replace(CoreConstants.DOLLAR, CoreConstants.DOT);

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: w5.b$a$a, reason: collision with other inner class name */
        private static class C2579a implements b {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f120807n;

            C2579a(IBinder iBinder) {
                this.f120807n = iBinder;
            }

            @Override // w5.b
            public d G0() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f120806k);
                    this.f120807n.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return d.a.R2(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // w5.b
            public d P1() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f120806k);
                    this.f120807n.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return d.a.R2(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f120807n;
            }
        }

        public static b R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f120806k);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C2579a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    d G0();

    d P1();
}
