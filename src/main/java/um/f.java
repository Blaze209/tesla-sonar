package um;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public interface f extends d {
    static f S(Bitmap bitmap, tk.h<Bitmap> hVar, p pVar, int i11) {
        return g0(bitmap, hVar, pVar, i11, 0);
    }

    static f W1(tk.a<Bitmap> aVar, p pVar, int i11) {
        return p3(aVar, pVar, i11, 0);
    }

    static f g0(Bitmap bitmap, tk.h<Bitmap> hVar, p pVar, int i11, int i12) {
        return b.t0() ? new b(bitmap, hVar, pVar, i11, i12) : new i(bitmap, hVar, pVar, i11, i12);
    }

    static f p3(tk.a<Bitmap> aVar, p pVar, int i11, int i12) {
        return b.t0() ? new b(aVar, pVar, i11, i12) : new i(aVar, pVar, i11, i12);
    }

    int L0();

    int U2();

    tk.a<Bitmap> V();
}
