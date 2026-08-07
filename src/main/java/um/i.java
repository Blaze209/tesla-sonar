package um;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
class i extends b {
    protected i(tk.a<Bitmap> aVar, p pVar, int i11, int i12) {
        super(aVar, pVar, i11, i12);
    }

    protected void finalize() throws Throwable {
        if (getClosed()) {
            return;
        }
        qk.a.K("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    protected i(Bitmap bitmap, tk.h<Bitmap> hVar, p pVar, int i11, int i12) {
        super(bitmap, hVar, pVar, i11, i12);
    }
}
