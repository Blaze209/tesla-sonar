package s7;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public interface h {
    com.google.common.util.concurrent.s<Bitmap> a(byte[] bArr);

    default com.google.common.util.concurrent.s<Bitmap> b(p7.e0 e0Var) {
        byte[] bArr = e0Var.f101286k;
        if (bArr != null) {
            return a(bArr);
        }
        Uri uri = e0Var.f101288m;
        if (uri != null) {
            return c(uri);
        }
        return null;
    }

    com.google.common.util.concurrent.s<Bitmap> c(Uri uri);
}
