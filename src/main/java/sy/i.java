package sy;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
class i implements k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IBinder f111933n;

    i(IBinder iBinder) {
        this.f111933n = iBinder;
    }

    @Override // sy.k
    public boolean C(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.huawei.nfc.sdk.service.ICUPOnlinePayService");
            parcelObtain.writeString(str);
            this.f111933n.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f111933n;
    }
}
