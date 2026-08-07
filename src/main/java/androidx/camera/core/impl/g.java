package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class g extends j1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f3178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f3179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f3180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f3181j;

    g(int i11, String str, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f3172a = i11;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f3173b = str;
        this.f3174c = i12;
        this.f3175d = i13;
        this.f3176e = i14;
        this.f3177f = i15;
        this.f3178g = i16;
        this.f3179h = i17;
        this.f3180i = i18;
        this.f3181j = i19;
    }

    @Override // androidx.camera.core.impl.j1.c
    public int b() {
        return this.f3179h;
    }

    @Override // androidx.camera.core.impl.j1.c
    public int c() {
        return this.f3174c;
    }

    @Override // androidx.camera.core.impl.j1.c
    public int d() {
        return this.f3180i;
    }

    @Override // androidx.camera.core.impl.j1.c
    public int e() {
        return this.f3172a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1.c) {
            j1.c cVar = (j1.c) obj;
            if (this.f3172a == cVar.e() && this.f3173b.equals(cVar.i()) && this.f3174c == cVar.c() && this.f3175d == cVar.f() && this.f3176e == cVar.k() && this.f3177f == cVar.h() && this.f3178g == cVar.j() && this.f3179h == cVar.b() && this.f3180i == cVar.d() && this.f3181j == cVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.j1.c
    public int f() {
        return this.f3175d;
    }

    @Override // androidx.camera.core.impl.j1.c
    public int g() {
        return this.f3181j;
    }

    @Override // androidx.camera.core.impl.j1.c
    public int h() {
        return this.f3177f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f3172a ^ 1000003) * 1000003) ^ this.f3173b.hashCode()) * 1000003) ^ this.f3174c) * 1000003) ^ this.f3175d) * 1000003) ^ this.f3176e) * 1000003) ^ this.f3177f) * 1000003) ^ this.f3178g) * 1000003) ^ this.f3179h) * 1000003) ^ this.f3180i) * 1000003) ^ this.f3181j;
    }

    @Override // androidx.camera.core.impl.j1.c
    @NonNull
    public String i() {
        return this.f3173b;
    }

    @Override // androidx.camera.core.impl.j1.c
    public int j() {
        return this.f3178g;
    }

    @Override // androidx.camera.core.impl.j1.c
    public int k() {
        return this.f3176e;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f3172a + ", mediaType=" + this.f3173b + ", bitrate=" + this.f3174c + ", frameRate=" + this.f3175d + ", width=" + this.f3176e + ", height=" + this.f3177f + ", profile=" + this.f3178g + ", bitDepth=" + this.f3179h + ", chromaSubsampling=" + this.f3180i + ", hdrFormat=" + this.f3181j + "}";
    }
}
