package r0;

import android.opengl.EGLSurface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EGLSurface f106297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f106298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f106299c;

    c(EGLSurface eGLSurface, int i11, int i12) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f106297a = eGLSurface;
        this.f106298b = i11;
        this.f106299c = i12;
    }

    @Override // r0.g
    @NonNull
    public EGLSurface a() {
        return this.f106297a;
    }

    @Override // r0.g
    public int b() {
        return this.f106299c;
    }

    @Override // r0.g
    public int c() {
        return this.f106298b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f106297a.equals(gVar.a()) && this.f106298b == gVar.c() && this.f106299c == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f106297a.hashCode() ^ 1000003) * 1000003) ^ this.f106298b) * 1000003) ^ this.f106299c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f106297a + ", width=" + this.f106298b + ", height=" + this.f106299c + "}";
    }
}
