package mm;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public tk.a<Bitmap> a(int i11, int i12) {
        return b(i11, i12, Bitmap.Config.ARGB_8888);
    }

    public tk.a<Bitmap> b(int i11, int i12, Bitmap.Config config) {
        return c(i11, i12, config, null);
    }

    public tk.a<Bitmap> c(int i11, int i12, Bitmap.Config config, Object obj) {
        return d(i11, i12, config);
    }

    public abstract tk.a<Bitmap> d(int i11, int i12, Bitmap.Config config);
}
