package dz;

import com.mrousavy.camera.frameprocessors.Frame;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldz/p0;", "Landroidx/camera/core/f$a;", "Ldz/j$b;", "callback", "<init>", "(Ldz/j$b;)V", "Landroidx/camera/core/n;", "imageProxy", "Ljn0/h0;", "analyze", "(Landroidx/camera/core/n;)V", "a", "Ldz/j$b;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p0 implements androidx.camera.core.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j.b callback;

    public p0(j.b callback) {
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.callback = callback;
    }

    @Override // androidx.camera.core.f.a
    public void analyze(androidx.camera.core.n imageProxy) {
        p013kotlin.jvm.internal.s.k(imageProxy, "imageProxy");
        Frame frame = new Frame(imageProxy);
        try {
            frame.incrementRefCount();
            this.callback.q(frame);
        } finally {
            frame.decrementRefCount();
        }
    }
}
