package hr0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class p extends lr0.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73486t;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f73487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f73488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long[] f73489m;

    static {
        k();
    }

    public p() {
        super("stsz");
        this.f73489m = new long[0];
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("SampleSizeBox.java", p.class);
        f73480n = bVar.f("method-execution", bVar.e("1", "getSampleSize", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "long"), 49);
        f73481o = bVar.f("method-execution", bVar.e("1", "setSampleSize", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "long", "sampleSize", "", "void"), 53);
        f73482p = bVar.f("method-execution", bVar.e("1", "getSampleSizeAtIndex", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "int", "index", "", "long"), 58);
        f73483q = bVar.f("method-execution", bVar.e("1", "getSampleCount", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "long"), 66);
        f73484r = bVar.f("method-execution", bVar.e("1", "getSampleSizes", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "[J"), 75);
        f73485s = bVar.f("method-execution", bVar.e("1", "setSampleSizes", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "[J", "sampleSizes", "", "void"), 79);
        f73486t = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "java.lang.String"), 118);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
        this.f73488l = mr0.d.j(byteBuffer);
        int iA = mr0.a.a(mr0.d.j(byteBuffer));
        this.f73487k = iA;
        if (this.f73488l == 0) {
            this.f73489m = new long[iA];
            for (int i11 = 0; i11 < this.f73487k; i11++) {
                this.f73489m[i11] = mr0.d.j(byteBuffer);
            }
        }
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        mr0.e.g(byteBuffer, this.f73488l);
        if (this.f73488l != 0) {
            mr0.e.g(byteBuffer, this.f73487k);
            return;
        }
        mr0.e.g(byteBuffer, this.f73489m.length);
        for (long j11 : this.f73489m) {
            mr0.e.g(byteBuffer, j11);
        }
    }

    @Override // lr0.a
    protected long d() {
        return (this.f73488l == 0 ? this.f73489m.length * 4 : 0) + 12;
    }

    public long r() {
        lr0.e.b().c(mq0.b.b(f73483q, this, this));
        return this.f73488l > 0 ? this.f73487k : this.f73489m.length;
    }

    public long s() {
        lr0.e.b().c(mq0.b.b(f73480n, this, this));
        return this.f73488l;
    }

    public void t(long[] jArr) {
        lr0.e.b().c(mq0.b.c(f73485s, this, this, jArr));
        this.f73489m = jArr;
    }

    public String toString() {
        lr0.e.b().c(mq0.b.b(f73486t, this, this));
        return "SampleSizeBox[sampleSize=" + s() + ";sampleCount=" + r() + "]";
    }
}
