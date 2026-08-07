package cg;

/* JADX INFO: loaded from: classes3.dex */
public class t implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f19319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bg.b f19320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bg.b f19321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bg.b f19322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19323f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a forId(int i11) {
            if (i11 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i11 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i11);
        }
    }

    public t(String str, a aVar, bg.b bVar, bg.b bVar2, bg.b bVar3, boolean z11) {
        this.f19318a = str;
        this.f19319b = aVar;
        this.f19320c = bVar;
        this.f19321d = bVar2;
        this.f19322e = bVar3;
        this.f19323f = z11;
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        return new vf.u(bVar, this);
    }

    public bg.b b() {
        return this.f19321d;
    }

    public String c() {
        return this.f19318a;
    }

    public bg.b d() {
        return this.f19322e;
    }

    public bg.b e() {
        return this.f19320c;
    }

    public a f() {
        return this.f19319b;
    }

    public boolean g() {
        return this.f19323f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f19320c + ", end: " + this.f19321d + ", offset: " + this.f19322e + "}";
    }
}
