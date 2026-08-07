package du;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // du.f
    public final void F2(String str, Bundle bundle, h hVar) {
        Parcel parcelR2 = R2();
        parcelR2.writeString(str);
        int i11 = c.f61020a;
        parcelR2.writeInt(1);
        bundle.writeToParcel(parcelR2, 0);
        parcelR2.writeStrongBinder(hVar);
        S2(2, parcelR2);
    }
}
