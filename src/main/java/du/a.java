package du;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IBinder f61018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f61019o = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected a(IBinder iBinder, String str) {
        this.f61018n = iBinder;
    }

    protected final Parcel R2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f61019o);
        return parcelObtain;
    }

    protected final void S2(int i11, Parcel parcel) {
        try {
            this.f61018n.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f61018n;
    }
}
