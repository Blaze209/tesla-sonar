package ec;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: ec.i, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\fB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u0014\u0010%\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0010¨\u0006&"}, d2 = {"Lec/i;", "Lec/n;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "shareable", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "Landroid/graphics/Canvas;", "Lcoil3/Canvas;", "canvas", "Ljn0/h0;", "a", "(Landroid/graphics/Canvas;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/drawable/Drawable;", "c", "()Landroid/graphics/drawable/Drawable;", "b", "Z", "()Z", "", "getSize", "()J", "size", "getWidth", Snapshot.WIDTH, "getHeight", Snapshot.HEIGHT, "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DrawableImage implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Drawable drawable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shareable;

    /* JADX INFO: renamed from: ec.i$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lec/i$a;", "", "", "getSize", "()J", "size", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        long getSize();
    }

    public DrawableImage(Drawable drawable, boolean z11) {
        this.drawable = drawable;
        this.shareable = z11;
    }

    @Override // ec.n
    public void a(Canvas canvas) {
        this.drawable.draw(canvas);
    }

    @Override // ec.n
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getShareable() {
        return this.shareable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawableImage)) {
            return false;
        }
        DrawableImage drawableImage = (DrawableImage) other;
        return p013kotlin.jvm.internal.s.f(this.drawable, drawableImage.drawable) && this.shareable == drawableImage.shareable;
    }

    @Override // ec.n
    public int getHeight() {
        return yc.g0.b(this.drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ec.n
    public long getSize() {
        Drawable drawable = this.drawable;
        return bo0.n.g(drawable instanceof a ? ((a) drawable).getSize() : ((long) yc.g0.g(drawable)) * 4 * ((long) yc.g0.b(this.drawable)), 0L);
    }

    @Override // ec.n
    public int getWidth() {
        return yc.g0.g(this.drawable);
    }

    public int hashCode() {
        return (this.drawable.hashCode() * 31) + Boolean.hashCode(this.shareable);
    }

    public String toString() {
        return "DrawableImage(drawable=" + this.drawable + ", shareable=" + this.shareable + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
