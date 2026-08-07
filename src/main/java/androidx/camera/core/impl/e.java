package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class e extends j1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3161f;

    e(int i11, String str, int i12, int i13, int i14, int i15) {
        this.f3156a = i11;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f3157b = str;
        this.f3158c = i12;
        this.f3159d = i13;
        this.f3160e = i14;
        this.f3161f = i15;
    }

    @Override // androidx.camera.core.impl.j1.a
    public int b() {
        return this.f3158c;
    }

    @Override // androidx.camera.core.impl.j1.a
    public int c() {
        return this.f3160e;
    }

    @Override // androidx.camera.core.impl.j1.a
    public int d() {
        return this.f3156a;
    }

    @Override // androidx.camera.core.impl.j1.a
    @NonNull
    public String e() {
        return this.f3157b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1.a) {
            j1.a aVar = (j1.a) obj;
            if (this.f3156a == aVar.d() && this.f3157b.equals(aVar.e()) && this.f3158c == aVar.b() && this.f3159d == aVar.g() && this.f3160e == aVar.c() && this.f3161f == aVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.j1.a
    public int f() {
        return this.f3161f;
    }

    @Override // androidx.camera.core.impl.j1.a
    public int g() {
        return this.f3159d;
    }

    public int hashCode() {
        return ((((((((((this.f3156a ^ 1000003) * 1000003) ^ this.f3157b.hashCode()) * 1000003) ^ this.f3158c) * 1000003) ^ this.f3159d) * 1000003) ^ this.f3160e) * 1000003) ^ this.f3161f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f3156a + ", mediaType=" + this.f3157b + ", bitrate=" + this.f3158c + ", sampleRate=" + this.f3159d + ", channels=" + this.f3160e + ", profile=" + this.f3161f + "}";
    }
}
