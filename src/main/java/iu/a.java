package iu;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IBinder f81871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f81872o;

    protected a(IBinder iBinder, String str) {
        this.f81871n = iBinder;
        this.f81872o = str;
    }

    protected final Parcel R2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f81872o);
        return parcelObtain;
    }

    protected final void S2(int i11, Parcel parcel) {
        try {
            this.f81871n.transact(i11, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f81871n;
    }
}
