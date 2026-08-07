package hu;

import android.os.Build;

/* JADX INFO: loaded from: classes5.dex */
public final class i {
    public static h a() {
        switch (Build.VERSION.SDK_INT) {
            case 24:
                return new r();
            case 25:
                return new t();
            case 26:
                return new w();
            case 27:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new x();
                }
                break;
        }
        return new z();
    }
}
