package du;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public class b extends Binder implements IInterface {
    protected b(String str) {
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    protected boolean R2(int i11, Parcel parcel, Parcel parcel2, int i12) {
        throw null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i11, parcel, parcel2, i12)) {
            return true;
        }
        return R2(i11, parcel, parcel2, i12);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
