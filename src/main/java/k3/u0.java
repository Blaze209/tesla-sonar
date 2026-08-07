package k3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lk3/u0;", "Lk3/w3;", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "<init>", "(Landroid/graphics/PathMeasure;)V", "", "startDistance", "stopDistance", "Lk3/t3;", "destination", "", "startWithMoveTo", "b", "(FFLk3/t3;Z)Z", "path", "forceClosed", "Ljn0/h0;", "a", "(Lk3/t3;Z)V", "Landroid/graphics/PathMeasure;", "getLength", "()F", "length", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u0 implements w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PathMeasure internalPathMeasure;

    public u0(PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // k3.w3
    public void a(t3 path, boolean forceClosed) {
        Path internalPath;
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (path == null) {
            internalPath = null;
        } else {
            if (!(path instanceof r0)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            internalPath = ((r0) path).getInternalPath();
        }
        pathMeasure.setPath(internalPath, forceClosed);
    }

    @Override // k3.w3
    public boolean b(float startDistance, float stopDistance, t3 destination, boolean startWithMoveTo) {
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (destination instanceof r0) {
            return pathMeasure.getSegment(startDistance, stopDistance, ((r0) destination).getInternalPath(), startWithMoveTo);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // k3.w3
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }
}
