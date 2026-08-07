package mq;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IBinder f92429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f92430o;

    protected a(IBinder iBinder, String str) {
        this.f92429n = iBinder;
        this.f92430o = str;
    }

    protected final Parcel R2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f92430o);
        return parcelObtain;
    }

    protected final Parcel S2(Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f92429n.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e11) {
                parcelObtain.recycle();
                throw e11;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f92429n;
    }
}
