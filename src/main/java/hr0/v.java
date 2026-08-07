package hr0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class v extends lr0.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73507n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f73508k;

    static {
        k();
    }

    public v() {
        super("stss");
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("SyncSampleBox.java", v.class);
        f73505l = bVar.f("method-execution", bVar.e("1", "getSampleNumber", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "", "", "", "[J"), 45);
        f73506m = bVar.f("method-execution", bVar.e("1", "setSampleNumber", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "[J", "sampleNumber", "", "void"), 49);
        f73507n = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "", "", "", "java.lang.String"), 80);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
        int iA = mr0.a.a(mr0.d.j(byteBuffer));
        this.f73508k = new long[iA];
        for (int i11 = 0; i11 < iA; i11++) {
            this.f73508k[i11] = mr0.d.j(byteBuffer);
        }
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        mr0.e.g(byteBuffer, this.f73508k.length);
        for (long j11 : this.f73508k) {
            mr0.e.g(byteBuffer, j11);
        }
    }

    @Override // lr0.a
    protected long d() {
        return (((long) this.f73508k.length) * 4) + 8;
    }

    public void r(long[] jArr) {
        lr0.e.b().c(mq0.b.c(f73506m, this, this, jArr));
        this.f73508k = jArr;
    }

    public String toString() {
        lr0.e.b().c(mq0.b.b(f73507n, this, this));
        return "SyncSampleBox[entryCount=" + this.f73508k.length + "]";
    }
}
