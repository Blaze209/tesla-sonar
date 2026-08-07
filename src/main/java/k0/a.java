package k0;

/* JADX INFO: loaded from: classes.dex */
final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f84592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f84593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f84594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f84595d;

    a(float f11, float f12, float f13, float f14) {
        this.f84592a = f11;
        this.f84593b = f12;
        this.f84594c = f13;
        this.f84595d = f14;
    }

    @Override // k0.e, c0.d2
    public float a() {
        return this.f84593b;
    }

    @Override // k0.e, c0.d2
    public float b() {
        return this.f84595d;
    }

    @Override // k0.e, c0.d2
    public float c() {
        return this.f84594c;
    }

    @Override // k0.e, c0.d2
    public float d() {
        return this.f84592a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (Float.floatToIntBits(this.f84592a) == Float.floatToIntBits(eVar.d()) && Float.floatToIntBits(this.f84593b) == Float.floatToIntBits(eVar.a()) && Float.floatToIntBits(this.f84594c) == Float.floatToIntBits(eVar.c()) && Float.floatToIntBits(this.f84595d) == Float.floatToIntBits(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f84592a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f84593b)) * 1000003) ^ Float.floatToIntBits(this.f84594c)) * 1000003) ^ Float.floatToIntBits(this.f84595d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f84592a + ", maxZoomRatio=" + this.f84593b + ", minZoomRatio=" + this.f84594c + ", linearZoom=" + this.f84595d + "}";
    }
}
