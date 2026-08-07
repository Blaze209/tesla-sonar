package ll;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u001c"}, d2 = {"Lll/d;", "", "<init>", "()V", "", "alpha", "Ljn0/h0;", "b", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "c", "(Landroid/graphics/ColorFilter;)V", "", "dither", DateTokenConverter.CONVERTER_KEY, "(Z)V", "filterBitmap", "e", "Landroid/graphics/drawable/Drawable;", "drawable", "a", "(Landroid/graphics/drawable/Drawable;)V", "I", "Z", "isSetColorFilter", "Landroid/graphics/ColorFilter;", "f", "drawee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isSetColorFilter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ColorFilter colorFilter;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int alpha = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int dither = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int filterBitmap = -1;

    @SuppressLint({"Range"})
    public final void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i11 = this.alpha;
        if (i11 != -1) {
            drawable.setAlpha(i11);
        }
        if (this.isSetColorFilter) {
            drawable.setColorFilter(this.colorFilter);
        }
        int i12 = this.dither;
        if (i12 != -1) {
            drawable.setDither(i12 != 0);
        }
        int i13 = this.filterBitmap;
        if (i13 != -1) {
            drawable.setFilterBitmap(i13 != 0);
        }
    }

    public final void b(int alpha) {
        this.alpha = alpha;
    }

    public final void c(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        this.isSetColorFilter = colorFilter != null;
    }

    public final void d(boolean dither) {
        this.dither = dither ? 1 : 0;
    }

    public final void e(boolean filterBitmap) {
        this.filterBitmap = filterBitmap ? 1 : 0;
    }
}
