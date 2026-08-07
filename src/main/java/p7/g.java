package p7;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Binder {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f101339o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.common.collect.x<Bundle> f101340n;

    static {
        f101339o = Build.VERSION.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public g(List<Bundle> list) {
        this.f101340n = com.google.common.collect.x.n(list);
    }

    public static com.google.common.collect.x<Bundle> a(IBinder iBinder) {
        return iBinder instanceof g ? ((g) iBinder).f101340n : b(iBinder);
    }

    static com.google.common.collect.x<Bundle> b(IBinder iBinder) {
        int i11;
        com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
        int i12 = 0;
        int i13 = 1;
        while (i13 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i12);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i11 = parcelObtain2.readInt();
                        if (i11 == 1) {
                            aVarK.a((Bundle) s7.a.f(parcelObtain2.readBundle()));
                            i12++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i13 = i11;
                } catch (RemoteException e11) {
                    throw new RuntimeException(e11);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        return aVarK.k();
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return super.onTransact(i11, parcel, parcel2, i12);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f101340n.size();
        int i13 = parcel.readInt();
        while (i13 < size && parcel2.dataSize() < f101339o) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f101340n.get(i13));
            i13++;
        }
        parcel2.writeInt(i13 < size ? 2 : 0);
        return true;
    }
}
