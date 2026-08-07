package androidx.media3.session;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface n extends IInterface {

    public static abstract class a extends Binder implements n {

        /* JADX INFO: renamed from: androidx.media3.session.n$a$a, reason: collision with other inner class name */
        private static class C0208a implements n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f11984n;

            C0208a(IBinder iBinder) {
                this.f11984n = iBinder;
            }

            @Override // androidx.media3.session.n
            public void H0(int i11, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    this.f11984n.transact(3009, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.n
            public void J0(int i11, Bundle bundle, Bundle bundle2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    b.d(parcelObtain, bundle2, 0);
                    this.f11984n.transact(AuthApiStatusCodes.AUTH_URL_RESOLUTION, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.n
            public void J1(int i11, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    this.f11984n.transact(AuthApiStatusCodes.AUTH_API_SERVER_ERROR, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.n
            public void K2(int i11, Bundle bundle, boolean z11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    this.f11984n.transact(3007, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.n
            public void P(int i11, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    this.f11984n.transact(AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11984n;
            }

            @Override // androidx.media3.session.n
            public void c(int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i11);
                    this.f11984n.transact(AuthApiStatusCodes.AUTH_APP_CERT_ERROR, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.n
            public void t2(int i11, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    this.f11984n.transact(3008, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.n
            public void w(int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i11);
                    this.f11984n.transact(3011, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.n
            public void w0(int i11, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    this.f11984n.transact(AuthApiStatusCodes.AUTH_API_CLIENT_ERROR, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.n
            public void x2(int i11, Bundle bundle, Bundle bundle2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    b.d(parcelObtain, bundle2, 0);
                    this.f11984n.transact(3013, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.media3.session.IMediaController");
        }

        public static n R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n)) ? new C0208a(iBinder) : (n) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface("androidx.media3.session.IMediaController");
            }
            if (i11 == 1598968902) {
                parcel2.writeString("androidx.media3.session.IMediaController");
                return true;
            }
            if (i11 == 4001) {
                N2(parcel.readInt(), parcel.readString(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
            } else if (i11 != 4002) {
                switch (i11) {
                    case AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN /* 3001 */:
                        P(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                        w0(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case AuthApiStatusCodes.AUTH_API_SERVER_ERROR /* 3003 */:
                        J1(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case AuthApiStatusCodes.AUTH_TOKEN_ERROR /* 3004 */:
                        m1(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                        break;
                    case AuthApiStatusCodes.AUTH_URL_RESOLUTION /* 3005 */:
                        int i13 = parcel.readInt();
                        Parcelable.Creator creator = Bundle.CREATOR;
                        J0(i13, (Bundle) b.c(parcel, creator), (Bundle) b.c(parcel, creator));
                        break;
                    case AuthApiStatusCodes.AUTH_APP_CERT_ERROR /* 3006 */:
                        c(parcel.readInt());
                        break;
                    case 3007:
                        K2(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                        break;
                    case 3008:
                        t2(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 3009:
                        H0(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 3010:
                        int i14 = parcel.readInt();
                        Parcelable.Creator creator2 = Bundle.CREATOR;
                        P0(i14, (Bundle) b.c(parcel, creator2), (Bundle) b.c(parcel, creator2));
                        break;
                    case 3011:
                        w(parcel.readInt());
                        break;
                    case 3012:
                        G2(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 3013:
                        int i15 = parcel.readInt();
                        Parcelable.Creator creator3 = Bundle.CREATOR;
                        x2(i15, (Bundle) b.c(parcel, creator3), (Bundle) b.c(parcel, creator3));
                        break;
                    case 3014:
                        I1(parcel.readInt(), (PendingIntent) b.c(parcel, PendingIntent.CREATOR));
                        break;
                    case 3015:
                        E0(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 3016:
                        X(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                        break;
                    default:
                        return super.onTransact(i11, parcel, parcel2, i12);
                }
            } else {
                Z(parcel.readInt(), parcel.readString(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
            }
            return true;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
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

    void E0(int i11, Bundle bundle);

    void G2(int i11, Bundle bundle);

    void H0(int i11, Bundle bundle);

    void I1(int i11, PendingIntent pendingIntent);

    void J0(int i11, Bundle bundle, Bundle bundle2);

    void J1(int i11, Bundle bundle);

    void K2(int i11, Bundle bundle, boolean z11);

    void N2(int i11, String str, int i12, Bundle bundle);

    void P(int i11, Bundle bundle);

    void P0(int i11, Bundle bundle, Bundle bundle2);

    void X(int i11, List<Bundle> list);

    void Z(int i11, String str, int i12, Bundle bundle);

    void c(int i11);

    void m1(int i11, List<Bundle> list);

    void t2(int i11, Bundle bundle);

    void w(int i11);

    void w0(int i11, Bundle bundle);

    void x2(int i11, Bundle bundle, Bundle bundle2);
}
