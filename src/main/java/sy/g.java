package sy;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g extends Binder implements h {
    public g() {
        attachInterface(this, "com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            parcel.enforceInterface("com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService");
            L2(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
        } else {
            if (i11 != 2) {
                if (i11 != 1598968902) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                parcel2.writeString("com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService");
                return true;
            }
            parcel.enforceInterface("com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService");
            N(parcel.readString(), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
