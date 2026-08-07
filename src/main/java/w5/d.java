package w5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public interface d extends IInterface {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f120809m = "androidx$core$uwb$backend$IUwbClient".replace(CoreConstants.DOLLAR, CoreConstants.DOT);

    public static abstract class a extends Binder implements d {

        /* JADX INFO: renamed from: w5.d$a$a, reason: collision with other inner class name */
        private static class C2580a implements d {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f120810n;

            C2580a(IBinder iBinder) {
                this.f120810n = iBinder;
            }

            @Override // w5.d
            public void A1(w5.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f120809m);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f120810n.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // w5.d
            public void L(c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f120809m);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f120810n.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f120810n;
            }

            @Override // w5.d
            public j getComplexChannel() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f120809m);
                    this.f120810n.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (j) parcelObtain2.readTypedObject(j.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // w5.d
            public i getLocalAddress() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f120809m);
                    this.f120810n.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (i) parcelObtain2.readTypedObject(i.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // w5.d
            public e getRangingCapabilities() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f120809m);
                    this.f120810n.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (e) parcelObtain2.readTypedObject(e.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // w5.d
            public boolean isAvailable() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f120809m);
                    this.f120810n.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // w5.d
            public void k2(g gVar, w5.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f120809m);
                    parcelObtain.writeTypedObject(gVar, 0);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f120810n.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // w5.d
            public void s0() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f120809m);
                    this.f120810n.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static d R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d.f120809m);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C2580a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }
    }

    void A1(w5.a aVar);

    void L(c cVar);

    j getComplexChannel();

    i getLocalAddress();

    e getRangingCapabilities();

    boolean isAvailable();

    void k2(g gVar, w5.a aVar);

    void s0();
}
