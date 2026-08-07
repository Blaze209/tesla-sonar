package d;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f59231h = "android$support$v4$app$INotificationSideChannel".replace(CoreConstants.DOLLAR, CoreConstants.DOT);

    /* JADX INFO: renamed from: d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1208a extends Binder implements a {

        /* JADX INFO: renamed from: d.a$a$a, reason: collision with other inner class name */
        private static class C1209a implements a {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f59232n;

            C1209a(IBinder iBinder) {
                this.f59232n = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f59232n;
            }

            @Override // d.a
            public void h1(String str, int i11, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f59231h);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeString(str2);
                    b.b(parcelObtain, notification, 0);
                    this.f59232n.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static a R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f59231h);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C1209a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t11, int i11) {
            if (t11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t11.writeToParcel(parcel, i11);
            }
        }
    }

    void h1(String str, int i11, String str2, Notification notification);
}
