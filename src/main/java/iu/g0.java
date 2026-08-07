package iu;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 extends a implements i0 {
    g0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // iu.i0
    public final void Y(Bundle bundle, k0 k0Var) {
        Parcel parcelR2 = R2();
        c0.c(parcelR2, bundle);
        parcelR2.writeStrongBinder(k0Var);
        S2(3, parcelR2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // iu.i0
    public final void c0(Bundle bundle, k0 k0Var) {
        Parcel parcelR2 = R2();
        c0.c(parcelR2, bundle);
        parcelR2.writeStrongBinder(k0Var);
        S2(2, parcelR2);
    }
}
