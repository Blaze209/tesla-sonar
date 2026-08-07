package iu;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j0 extends a0 implements k0 {
    public j0() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // iu.a0
    protected final boolean R2(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 2) {
            Bundle bundle = (Bundle) c0.a(parcel, Bundle.CREATOR);
            c0.b(parcel);
            R0(bundle);
            return true;
        }
        if (i11 == 3) {
            Bundle bundle2 = (Bundle) c0.a(parcel, Bundle.CREATOR);
            c0.b(parcel);
            S(bundle2);
            return true;
        }
        if (i11 == 4) {
            Bundle bundle3 = (Bundle) c0.a(parcel, Bundle.CREATOR);
            c0.b(parcel);
            X0(bundle3);
            return true;
        }
        if (i11 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) c0.a(parcel, Bundle.CREATOR);
        c0.b(parcel);
        W(bundle4);
        return true;
    }
}
