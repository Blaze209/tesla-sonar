package hg;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f72725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f72726b;

    public void a(float f11) {
        float f12 = this.f72725a + f11;
        this.f72725a = f12;
        int i11 = this.f72726b + 1;
        this.f72726b = i11;
        if (i11 == Integer.MAX_VALUE) {
            this.f72725a = f12 / 2.0f;
            this.f72726b = i11 / 2;
        }
    }
}
