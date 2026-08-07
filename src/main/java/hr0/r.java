package hr0;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class r extends lr0.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73490l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73491m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73492n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73493o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List<a> f73494k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f73495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f73496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f73497c;

        public a(long j11, long j12, long j13) {
            this.f73495a = j11;
            this.f73496b = j12;
            this.f73497c = j13;
        }

        public long a() {
            return this.f73495a;
        }

        public long b() {
            return this.f73497c;
        }

        public long c() {
            return this.f73496b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f73495a == aVar.f73495a && this.f73497c == aVar.f73497c && this.f73496b == aVar.f73496b;
        }

        public int hashCode() {
            long j11 = this.f73495a;
            long j12 = this.f73496b;
            int i11 = ((((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f73497c;
            return i11 + ((int) ((j13 >>> 32) ^ j13));
        }

        public String toString() {
            return "Entry{firstChunk=" + this.f73495a + ", samplesPerChunk=" + this.f73496b + ", sampleDescriptionIndex=" + this.f73497c + CoreConstants.CURLY_RIGHT;
        }
    }

    static {
        k();
    }

    public r() {
        super("stsc");
        this.f73494k = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("SampleToChunkBox.java", r.class);
        f73490l = bVar.f("method-execution", bVar.e("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "", "", "", "java.util.List"), 41);
        f73491m = bVar.f("method-execution", bVar.e("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "java.util.List", "entries", "", "void"), 45);
        f73492n = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "", "", "", "java.lang.String"), 78);
        f73493o = bVar.f("method-execution", bVar.e("1", "blowup", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "int", "chunkCount", "", "[J"), 89);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
        int iA = mr0.a.a(mr0.d.j(byteBuffer));
        this.f73494k = new ArrayList(iA);
        for (int i11 = 0; i11 < iA; i11++) {
            this.f73494k.add(new a(mr0.d.j(byteBuffer), mr0.d.j(byteBuffer), mr0.d.j(byteBuffer)));
        }
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        mr0.e.g(byteBuffer, this.f73494k.size());
        for (a aVar : this.f73494k) {
            mr0.e.g(byteBuffer, aVar.a());
            mr0.e.g(byteBuffer, aVar.c());
            mr0.e.g(byteBuffer, aVar.b());
        }
    }

    @Override // lr0.a
    protected long d() {
        return (this.f73494k.size() * 12) + 8;
    }

    public List<a> r() {
        lr0.e.b().c(mq0.b.b(f73490l, this, this));
        return this.f73494k;
    }

    public void s(List<a> list) {
        lr0.e.b().c(mq0.b.c(f73491m, this, this, list));
        this.f73494k = list;
    }

    public String toString() {
        lr0.e.b().c(mq0.b.b(f73492n, this, this));
        return "SampleToChunkBox[entryCount=" + this.f73494k.size() + "]";
    }
}
