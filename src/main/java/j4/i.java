package j4;

import android.graphics.Canvas;
import android.graphics.Paint;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J_\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J_\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lj4/i;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "text", "", "index", "count", "contextIndex", "contextCount", "", "x", "y", "", "isRtl", "Landroid/graphics/Paint;", "paint", "Ljn0/h0;", "b", "(Landroid/graphics/Canvas;[CIIIIFFZLandroid/graphics/Paint;)V", "", "start", "end", "contextStart", "contextEnd", "a", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f82512a = new i();

    private i() {
    }

    public final void a(Canvas canvas, CharSequence text, int start, int end, int contextStart, int contextEnd, float x11, float y11, boolean isRtl, Paint paint) {
        canvas.drawTextRun(text, start, end, contextStart, contextEnd, x11, y11, isRtl, paint);
    }

    public final void b(Canvas canvas, char[] text, int index, int count, int contextIndex, int contextCount, float x11, float y11, boolean isRtl, Paint paint) {
        canvas.drawTextRun(text, index, count, contextIndex, contextCount, x11, y11, isRtl, paint);
    }
}
