package c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f18228g = "android$support$customtabs$ICustomTabsService".replace(CoreConstants.DOLLAR, CoreConstants.DOT);

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: c.b$a$a, reason: collision with other inner class name */
        private static class C0365a implements b {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f18229n;

            C0365a(IBinder iBinder) {
                this.f18229n = iBinder;
            }

            @Override // c.b
            public boolean I0(long j11) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f18228g);
                    parcelObtain.writeLong(j11);
                    this.f18229n.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean S1(c.a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f18228g);
                    parcelObtain.writeStrongInterface(aVar);
                    C0366b.d(parcelObtain, uri, 0);
                    C0366b.d(parcelObtain, bundle, 0);
                    C0366b.c(parcelObtain, list, 0);
                    this.f18229n.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18229n;
            }

            @Override // c.b
            public boolean l1(c.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f18228g);
                    parcelObtain.writeStrongInterface(aVar);
                    C0366b.d(parcelObtain, bundle, 0);
                    this.f18229n.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean u1(c.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f18228g);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f18229n.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static b R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f18228g);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0365a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: c.b$b, reason: collision with other inner class name */
    public static class C0366b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, List<T> list, int i11) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i12 = 0; i12 < size; i12++) {
                d(parcel, list.get(i12), i11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t11, int i11) {
            if (t11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t11.writeToParcel(parcel, i11);
            }
        }
    }

    boolean I0(long j11);

    boolean S1(c.a aVar, Uri uri, Bundle bundle, List<Bundle> list);

    boolean l1(c.a aVar, Bundle bundle);

    boolean u1(c.a aVar);
}
