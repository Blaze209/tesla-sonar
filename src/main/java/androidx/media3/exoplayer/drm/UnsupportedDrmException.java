package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedDrmException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9788a;

    public UnsupportedDrmException(int i11) {
        this.f9788a = i11;
    }

    public UnsupportedDrmException(int i11, Exception exc) {
        super(exc);
        this.f9788a = i11;
    }
}
