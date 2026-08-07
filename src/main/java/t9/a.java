package t9;

import android.os.Bundle;
import android.os.Parcel;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public d a(long j11, byte[] bArr, int i11, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i11, i12);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new d(s7.i.d(new r7.d(), (ArrayList) s7.a.f(bundle.getParcelableArrayList("c"))), j11, bundle.getLong(DateTokenConverter.CONVERTER_KEY));
    }
}
