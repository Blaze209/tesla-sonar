package gs;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d {
    public byte[] a(List<b> list) {
        ArrayList<Bundle> arrayListI = ts.c.i(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListI);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
