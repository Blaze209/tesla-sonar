package androidx.camera.video.internal.encoder;

/* JADX INFO: loaded from: classes.dex */
public class EncodeException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3670a;

    public EncodeException(int i11, String str, Throwable th2) {
        super(str, th2);
        this.f3670a = i11;
    }
}
