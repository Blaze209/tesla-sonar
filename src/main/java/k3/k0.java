package k3;

import android.graphics.Bitmap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00138VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lk3/k0;", "Lk3/i3;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "Ljn0/h0;", "a", "()V", "b", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "", "getWidth", "()I", Snapshot.WIDTH, "getHeight", Snapshot.HEIGHT, "Lk3/j3;", "config", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k0 implements i3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bitmap bitmap;

    public k0(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override // k3.i3
    public void a() {
        this.bitmap.prepareToDraw();
    }

    @Override // k3.i3
    public int b() {
        return n0.e(this.bitmap.getConfig());
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // k3.i3
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // k3.i3
    public int getWidth() {
        return this.bitmap.getWidth();
    }
}
