package w5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f120808l = "androidx$core$uwb$backend$IUwbAvailabilityObserver".replace(CoreConstants.DOLLAR, CoreConstants.DOT);

    void onUwbStateChanged(boolean z11, int i11);

    public static abstract class a extends Binder implements c {
        public a() {
            attachInterface(this, c.f120808l);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            String str = c.f120808l;
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
            onUwbStateChanged(parcel.readInt() != 0, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
