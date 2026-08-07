package hr0;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class h extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73436p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73437q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73439s;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f73440k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f73441l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f73442m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f73443n;

    static {
        k();
    }

    public h() {
        super("hmhd");
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("HintMediaHeaderBox.java", h.class);
        f73435o = bVar.f("method-execution", bVar.e("1", "getMaxPduSize", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", "int"), 42);
        f73436p = bVar.f("method-execution", bVar.e("1", "getAvgPduSize", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", "int"), 46);
        f73437q = bVar.f("method-execution", bVar.e("1", "getMaxBitrate", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", "long"), 50);
        f73438r = bVar.f("method-execution", bVar.e("1", "getAvgBitrate", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", "long"), 54);
        f73439s = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", "java.lang.String"), 84);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
        this.f73440k = mr0.d.h(byteBuffer);
        this.f73441l = mr0.d.h(byteBuffer);
        this.f73442m = mr0.d.j(byteBuffer);
        this.f73443n = mr0.d.j(byteBuffer);
        mr0.d.j(byteBuffer);
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        mr0.e.e(byteBuffer, this.f73440k);
        mr0.e.e(byteBuffer, this.f73441l);
        mr0.e.g(byteBuffer, this.f73442m);
        mr0.e.g(byteBuffer, this.f73443n);
        mr0.e.g(byteBuffer, 0L);
    }

    @Override // lr0.a
    protected long d() {
        return 20L;
    }

    public String toString() {
        lr0.e.b().c(mq0.b.b(f73439s, this, this));
        return "HintMediaHeaderBox{maxPduSize=" + this.f73440k + ", avgPduSize=" + this.f73441l + ", maxBitrate=" + this.f73442m + ", avgBitrate=" + this.f73443n + CoreConstants.CURLY_RIGHT;
    }
}
