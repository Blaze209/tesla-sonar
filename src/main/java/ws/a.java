package ws;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import mq.b;
import mq.c;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: ws.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC2627a extends b implements a {

        /* JADX INFO: renamed from: ws.a$a$a, reason: collision with other inner class name */
        public static class C2628a extends mq.a implements a {
            C2628a(IBinder iBinder) {
                super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            }

            @Override // ws.a
            public final Bundle a(Bundle bundle) {
                Parcel parcelR2 = R2();
                c.b(parcelR2, bundle);
                Parcel parcelS2 = S2(parcelR2);
                Bundle bundle2 = (Bundle) c.a(parcelS2, Bundle.CREATOR);
                parcelS2.recycle();
                return bundle2;
            }
        }

        public static a R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C2628a(iBinder);
        }
    }

    Bundle a(Bundle bundle);
}
