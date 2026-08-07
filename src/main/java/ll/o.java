package ll;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lll/o;", "Lll/n;", "Landroid/graphics/drawable/NinePatchDrawable;", "ninePatchDrawable", "<init>", "(Landroid/graphics/drawable/NinePatchDrawable;)V", "Landroid/graphics/Canvas;", "canvas", "Ljn0/h0;", "draw", "(Landroid/graphics/Canvas;)V", "drawee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
        p013kotlin.jvm.internal.s.k(ninePatchDrawable, "ninePatchDrawable");
    }

    @Override // ll.n, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        p013kotlin.jvm.internal.s.k(canvas, "canvas");
        if (bn.b.d()) {
            bn.b.a("RoundedNinePatchDrawable#draw");
        }
        if (!k()) {
            super.draw(canvas);
            if (bn.b.d()) {
                bn.b.b();
                return;
            }
            return;
        }
        m();
        l();
        canvas.clipPath(this.f90174e);
        super.draw(canvas);
        if (bn.b.d()) {
            bn.b.b();
        }
    }
}
