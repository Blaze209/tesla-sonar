package ha;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static <T extends Parcelable, U extends Parcelable> T a(U u11, Parcelable.Creator<T> creator) {
        if (u11 == null) {
            return null;
        }
        Parcelable parcelable = (Parcelable) c(u11);
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return (T) c(creator.createFromParcel(parcelObtain));
        } finally {
            parcelObtain.recycle();
        }
    }

    public static <T extends Parcelable, U extends Parcelable> ArrayList<T> b(List<U> list, Parcelable.Creator<T> creator) {
        if (list == null) {
            return null;
        }
        sz.a aVar = (ArrayList<T>) new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            aVar.add(a(list.get(i11), creator));
        }
        return aVar;
    }

    private static <T> T c(T t11) {
        return t11;
    }
}
