package ts;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f115032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f115034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f115035d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f115036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f115037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f115038c = 1.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f115039d;

        public b(int i11, int i12) {
            this.f115036a = i11;
            this.f115037b = i12;
        }

        public p a() {
            return new p(this.f115036a, this.f115037b, this.f115038c, this.f115039d);
        }

        public b b(float f11) {
            this.f115038c = f11;
            return this;
        }
    }

    private p(int i11, int i12, float f11, long j11) {
        ts.a.b(i11 > 0, "width must be positive, but is: " + i11);
        ts.a.b(i12 > 0, "height must be positive, but is: " + i12);
        this.f115032a = i11;
        this.f115033b = i12;
        this.f115034c = f11;
        this.f115035d = j11;
    }
}
