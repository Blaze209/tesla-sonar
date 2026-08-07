package k3;

import android.graphics.Rect;
import android.graphics.RectF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u0001*\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lj3/i;", "Landroid/graphics/Rect;", "a", "(Lj3/i;)Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "c", "(Lj3/i;)Landroid/graphics/RectF;", "e", "(Landroid/graphics/Rect;)Lj3/i;", "f", "(Landroid/graphics/RectF;)Lj3/i;", "Lw4/p;", "b", "(Lw4/p;)Landroid/graphics/Rect;", DateTokenConverter.CONVERTER_KEY, "(Landroid/graphics/Rect;)Lw4/p;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class z3 {
    @jn0.e
    public static final Rect a(j3.i iVar) {
        return new Rect((int) iVar.getLeft(), (int) iVar.getTop(), (int) iVar.getRight(), (int) iVar.getBottom());
    }

    public static final Rect b(w4.p pVar) {
        return new Rect(pVar.getLeft(), pVar.getTop(), pVar.getRight(), pVar.getBottom());
    }

    public static final RectF c(j3.i iVar) {
        return new RectF(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
    }

    public static final w4.p d(Rect rect) {
        return new w4.p(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final j3.i e(Rect rect) {
        return new j3.i(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final j3.i f(RectF rectF) {
        return new j3.i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
