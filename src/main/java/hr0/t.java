package hr0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class t extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73502n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long[] f73503l;

    static {
        k();
    }

    public t() {
        super("stco");
        this.f73503l = new long[0];
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("StaticChunkOffsetBox.java", t.class);
        f73501m = bVar.f("method-execution", bVar.e("1", "getChunkOffsets", "org.mp4parser.boxes.iso14496.part12.StaticChunkOffsetBox", "", "", "", "[J"), 38);
        f73502n = bVar.f("method-execution", bVar.e("1", "setChunkOffsets", "org.mp4parser.boxes.iso14496.part12.StaticChunkOffsetBox", "[J", "chunkOffsets", "", "void"), 43);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
        int iA = mr0.a.a(mr0.d.j(byteBuffer));
        this.f73503l = new long[iA];
        for (int i11 = 0; i11 < iA; i11++) {
            this.f73503l[i11] = mr0.d.j(byteBuffer);
        }
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        mr0.e.g(byteBuffer, this.f73503l.length);
        for (long j11 : this.f73503l) {
            mr0.e.g(byteBuffer, j11);
        }
    }

    @Override // lr0.a
    protected long d() {
        return (this.f73503l.length * 4) + 8;
    }

    @Override // hr0.b
    public long[] r() {
        lr0.e.b().c(mq0.b.b(f73501m, this, this));
        return this.f73503l;
    }

    public void s(long[] jArr) {
        lr0.e.b().c(mq0.b.c(f73502n, this, this, jArr));
        this.f73503l = jArr;
    }
}
