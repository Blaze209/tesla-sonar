package hr0;

import ch.qos.logback.core.CoreConstants;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class w extends lr0.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static Map<List<a>, SoftReference<long[]>> f73509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73511n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73512o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List<a> f73513k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f73514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f73515b;

        public a(long j11, long j12) {
            this.f73514a = j11;
            this.f73515b = j12;
        }

        public long a() {
            return this.f73514a;
        }

        public long b() {
            return this.f73515b;
        }

        public void c(long j11) {
            this.f73514a = j11;
        }

        public String toString() {
            return "Entry{count=" + this.f73514a + ", delta=" + this.f73515b + CoreConstants.CURLY_RIGHT;
        }
    }

    static {
        k();
        f73509l = new WeakHashMap();
    }

    public w() {
        super("stts");
        this.f73513k = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("TimeToSampleBox.java", w.class);
        f73510m = bVar.f("method-execution", bVar.e("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.TimeToSampleBox", "", "", "", "java.util.List"), 111);
        f73511n = bVar.f("method-execution", bVar.e("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.TimeToSampleBox", "java.util.List", "entries", "", "void"), 115);
        f73512o = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.TimeToSampleBox", "", "", "", "java.lang.String"), 119);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
        int iA = mr0.a.a(mr0.d.j(byteBuffer));
        this.f73513k = new ArrayList(iA);
        for (int i11 = 0; i11 < iA; i11++) {
            this.f73513k.add(new a(mr0.d.j(byteBuffer), mr0.d.j(byteBuffer)));
        }
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        mr0.e.g(byteBuffer, this.f73513k.size());
        for (a aVar : this.f73513k) {
            mr0.e.g(byteBuffer, aVar.a());
            mr0.e.g(byteBuffer, aVar.b());
        }
    }

    @Override // lr0.a
    protected long d() {
        return (this.f73513k.size() * 8) + 8;
    }

    public void r(List<a> list) {
        lr0.e.b().c(mq0.b.c(f73511n, this, this, list));
        this.f73513k = list;
    }

    public String toString() {
        lr0.e.b().c(mq0.b.b(f73512o, this, this));
        return "TimeToSampleBox[entryCount=" + this.f73513k.size() + "]";
    }
}
