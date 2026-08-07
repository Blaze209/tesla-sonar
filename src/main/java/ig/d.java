package ig;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f77682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f77683b;

    public d(float f11, float f12) {
        this.f77682a = f11;
        this.f77683b = f12;
    }

    public boolean a(float f11, float f12) {
        return this.f77682a == f11 && this.f77683b == f12;
    }

    public float b() {
        return this.f77682a;
    }

    public float c() {
        return this.f77683b;
    }

    public void d(float f11, float f12) {
        this.f77682a = f11;
        this.f77683b = f12;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
