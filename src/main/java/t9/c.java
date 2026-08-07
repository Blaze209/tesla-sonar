package t9;

import android.os.Bundle;
import android.os.Parcel;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public byte[] a(List<r7.a> list, long j11) {
        ArrayList<Bundle> arrayListH = s7.i.h(list, new ou.h() { // from class: t9.b
            @Override // ou.h
            public final Object apply(Object obj) {
                return ((r7.a) obj).e();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListH);
        bundle.putLong(DateTokenConverter.CONVERTER_KEY, j11);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
