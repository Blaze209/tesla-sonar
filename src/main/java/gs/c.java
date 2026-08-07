package gs;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.collect.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c {
    public x<b> a(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return ts.c.d(b.J, (ArrayList) ts.a.e(bundle.getParcelableArrayList("c")));
    }
}
