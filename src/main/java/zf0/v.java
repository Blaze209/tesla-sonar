package zf0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzf0/v;", "", "Lc0/i;", "camera", "Lc0/r0;", "imageCapture", "Lzf0/u;", "cameraProperties", "<init>", "(Lc0/i;Lc0/r0;Lzf0/u;)V", "a", "Lc0/i;", "()Lc0/i;", "b", "Lc0/r0;", "c", "()Lc0/r0;", "Lzf0/u;", "()Lzf0/u;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0.i camera;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0.r0 imageCapture;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u cameraProperties;

    public v(c0.i camera, c0.r0 r0Var, u cameraProperties) {
        p013kotlin.jvm.internal.s.k(camera, "camera");
        p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
        this.camera = camera;
        this.imageCapture = r0Var;
        this.cameraProperties = cameraProperties;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c0.i getCamera() {
        return this.camera;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final u getCameraProperties() {
        return this.cameraProperties;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c0.r0 getImageCapture() {
        return this.imageCapture;
    }
}
