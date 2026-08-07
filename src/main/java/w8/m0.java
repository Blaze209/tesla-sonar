package w8;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f121368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f121369b;

    public m0(long j11) {
        this(j11, 0L);
    }

    @Override // w8.j0
    public j0.a c(long j11) {
        return new j0.a(new k0(j11, this.f121369b));
    }

    @Override // w8.j0
    public boolean d() {
        return true;
    }

    @Override // w8.j0
    public long g() {
        return this.f121368a;
    }

    public m0(long j11, long j12) {
        this.f121368a = j11;
        this.f121369b = j12;
    }
}
