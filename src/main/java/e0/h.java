package e0;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes.dex */
final class h extends a1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImageCaptureException f61318b;

    h(int i11, ImageCaptureException imageCaptureException) {
        this.f61317a = i11;
        if (imageCaptureException == null) {
            throw new NullPointerException("Null imageCaptureException");
        }
        this.f61318b = imageCaptureException;
    }

    @Override // e0.a1.a
    @NonNull
    ImageCaptureException a() {
        return this.f61318b;
    }

    @Override // e0.a1.a
    int b() {
        return this.f61317a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a1.a) {
            a1.a aVar = (a1.a) obj;
            if (this.f61317a == aVar.b() && this.f61318b.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f61317a ^ 1000003) * 1000003) ^ this.f61318b.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f61317a + ", imageCaptureException=" + this.f61318b + "}";
    }
}
