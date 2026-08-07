package gj;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class e implements d {
    @Override // gj.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // gj.d
    @NonNull
    public Bitmap d(int i11, int i12, Bitmap.Config config) {
        return Bitmap.createBitmap(i11, i12, config);
    }

    @Override // gj.d
    @NonNull
    public Bitmap e(int i11, int i12, Bitmap.Config config) {
        return d(i11, i12, config);
    }

    @Override // gj.d
    public void b() {
    }

    @Override // gj.d
    public void a(int i11) {
    }
}
