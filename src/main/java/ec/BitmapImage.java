package ec;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: ec.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u0014\u0010%\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0010¨\u0006&"}, d2 = {"Lec/a;", "Lec/n;", "Landroid/graphics/Bitmap;", "bitmap", "", "shareable", "<init>", "(Landroid/graphics/Bitmap;Z)V", "Landroid/graphics/Canvas;", "Lcoil3/Canvas;", "canvas", "Ljn0/h0;", "a", "(Landroid/graphics/Canvas;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "b", "Z", "()Z", "", "getSize", "()J", "size", "getWidth", Snapshot.WIDTH, "getHeight", Snapshot.HEIGHT, "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BitmapImage implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap bitmap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shareable;

    public BitmapImage(Bitmap bitmap, boolean z11) {
        this.bitmap = bitmap;
        this.shareable = z11;
    }

    @Override // ec.n
    public void a(Canvas canvas) {
        canvas.drawBitmap(this.bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
    }

    @Override // ec.n
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getShareable() {
        return this.shareable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitmapImage)) {
            return false;
        }
        BitmapImage bitmapImage = (BitmapImage) other;
        return p013kotlin.jvm.internal.s.f(this.bitmap, bitmapImage.bitmap) && this.shareable == bitmapImage.shareable;
    }

    @Override // ec.n
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // ec.n
    public long getSize() {
        return yc.b.a(this.bitmap);
    }

    @Override // ec.n
    public int getWidth() {
        return this.bitmap.getWidth();
    }

    public int hashCode() {
        return (this.bitmap.hashCode() * 31) + Boolean.hashCode(this.shareable);
    }

    public String toString() {
        return "BitmapImage(bitmap=" + this.bitmap + ", shareable=" + this.shareable + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
