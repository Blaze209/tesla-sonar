package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        private static class C0056a implements b {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f1829n;

            C0056a(IBinder iBinder) {
                this.f1829n = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1829n;
            }

            @Override // android.support.v4.media.session.b
            public void z0(android.support.v4.media.session.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongInterface(aVar);
                    this.f1829n.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
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
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0056a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    void z0(android.support.v4.media.session.a aVar);
}
