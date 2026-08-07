package mm;

import android.graphics.Bitmap;
import tk.h;

/* JADX INFO: loaded from: classes3.dex */
public class f implements h<Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f92347a;

    private f() {
    }

    public static f b() {
        if (f92347a == null) {
            f92347a = new f();
        }
        return f92347a;
    }

    @Override // tk.h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
