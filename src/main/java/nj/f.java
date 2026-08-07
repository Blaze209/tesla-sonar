package nj;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
final class f extends e<Drawable> {
    private f(Drawable drawable) {
        super(drawable);
    }

    static fj.c<Drawable> c(Drawable drawable) {
        if (drawable != null) {
            return new f(drawable);
        }
        return null;
    }

    @Override // fj.c
    @NonNull
    public Class<Drawable> a() {
        return this.f95061a.getClass();
    }

    @Override // fj.c
    public int getSize() {
        return Math.max(1, this.f95061a.getIntrinsicWidth() * this.f95061a.getIntrinsicHeight() * 4);
    }

    @Override // fj.c
    public void recycle() {
    }
}
