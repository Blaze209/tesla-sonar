package w5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f120805j = "androidx$core$uwb$backend$IRangingSessionCallback".replace(CoreConstants.DOLLAR, CoreConstants.DOT);

    void N0(k kVar);

    void Z1(k kVar, int i11);

    void n1(k kVar, h hVar);

    /* JADX INFO: renamed from: w5.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC2578a extends Binder implements a {
        public AbstractBinderC2578a() {
            attachInterface(this, a.f120805j);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            String str = a.f120805j;
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i11 == 1) {
                N0((k) parcel.readTypedObject(k.CREATOR));
            } else if (i11 == 2) {
                n1((k) parcel.readTypedObject(k.CREATOR), (h) parcel.readTypedObject(h.CREATOR));
            } else {
                if (i11 != 3) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                Z1((k) parcel.readTypedObject(k.CREATOR), parcel.readInt());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
