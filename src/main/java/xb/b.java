package xb;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static boolean a(Parcel parcel) {
        return parcel.readInt() == 1;
    }

    public static <T extends Parcelable> T b(Parcel parcel, Class<T> cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return Build.VERSION.SDK_INT >= 33 ? (T) parcel.readParcelable(classLoader, cls) : (T) parcel.readParcelable(classLoader);
    }

    public static void c(Parcel parcel, boolean z11) {
        parcel.writeInt(z11 ? 1 : 0);
    }
}
