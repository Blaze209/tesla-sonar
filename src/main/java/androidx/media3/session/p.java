package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;

/* JADX INFO: loaded from: classes3.dex */
public interface p extends IInterface {

    public static abstract class a extends Binder implements p {

        /* JADX INFO: renamed from: androidx.media3.session.p$a$a, reason: collision with other inner class name */
        private static class C0210a implements p {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f12108n;

            C0210a(IBinder iBinder) {
                this.f12108n = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12108n;
            }

            @Override // androidx.media3.session.p
            public void m2(n nVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSessionService");
                    parcelObtain.writeStrongInterface(nVar);
                    b.d(parcelObtain, bundle, 0);
                    this.f12108n.transact(AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.media3.session.IMediaSessionService");
        }

        public static p R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p)) ? new C0210a(iBinder) : (p) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
            }
            if (i11 == 1598968902) {
                parcel2.writeString("androidx.media3.session.IMediaSessionService");
                return true;
            }
            if (i11 != 3001) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            m2(n.a.R2(parcel.readStrongBinder()), (Bundle) b.c(parcel, Bundle.CREATOR));
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

    void m2(n nVar, Bundle bundle);
}
