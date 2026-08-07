package androidx.camera.core;

/* JADX INFO: loaded from: classes.dex */
public class CameraUnavailableException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3018a;

    public CameraUnavailableException(int i11, String str) {
        super(str);
        this.f3018a = i11;
    }

    public CameraUnavailableException(int i11, Throwable th2) {
        super(th2);
        this.f3018a = i11;
    }
}
