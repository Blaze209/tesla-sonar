package hr0;

import java.nio.ByteBuffer;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes10.dex */
public class j extends lr0.c {
    private static /* synthetic */ jq0.a.InterfaceC1785a A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static Logger f73444p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73445q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73446r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73447s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73448t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73449u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73450v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73451w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73452x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73453y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73454z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Date f73455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Date f73456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f73457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f73458n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f73459o;

    static {
        k();
        f73444p = LoggerFactory.getLogger((Class<?>) j.class);
    }

    public j() {
        super("mdhd");
        this.f73455k = new Date();
        this.f73456l = new Date();
        this.f73459o = "eng";
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("MediaHeaderBox.java", j.class);
        f73445q = bVar.f("method-execution", bVar.e("1", "getCreationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.util.Date"), 48);
        f73446r = bVar.f("method-execution", bVar.e("1", "setCreationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"), 52);
        A = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.lang.String"), 125);
        f73447s = bVar.f("method-execution", bVar.e("1", "getModificationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.util.Date"), 56);
        f73448t = bVar.f("method-execution", bVar.e("1", "setModificationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"), 60);
        f73449u = bVar.f("method-execution", bVar.e("1", "getTimescale", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "long"), 64);
        f73450v = bVar.f("method-execution", bVar.e("1", "setTimescale", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "long", "timescale", "", "void"), 68);
        f73451w = bVar.f("method-execution", bVar.e("1", "getDuration", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "long"), 72);
        f73452x = bVar.f("method-execution", bVar.e("1", "setDuration", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "long", "duration", "", "void"), 76);
        f73453y = bVar.f("method-execution", bVar.e("1", "getLanguage", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.lang.String"), 80);
        f73454z = bVar.f("method-execution", bVar.e("1", "setLanguage", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.lang.String", "language", "", "void"), 84);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
        if (m() == 1) {
            this.f73455k = mr0.b.b(mr0.d.k(byteBuffer));
            this.f73456l = mr0.b.b(mr0.d.k(byteBuffer));
            this.f73457m = mr0.d.j(byteBuffer);
            this.f73458n = byteBuffer.getLong();
        } else {
            this.f73455k = mr0.b.b(mr0.d.j(byteBuffer));
            this.f73456l = mr0.b.b(mr0.d.j(byteBuffer));
            this.f73457m = mr0.d.j(byteBuffer);
            this.f73458n = byteBuffer.getInt();
        }
        if (this.f73458n < -1) {
            f73444p.warn("mdhd duration is not in expected range");
        }
        this.f73459o = mr0.d.f(byteBuffer);
        mr0.d.h(byteBuffer);
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        if (m() == 1) {
            mr0.e.h(byteBuffer, mr0.b.a(this.f73455k));
            mr0.e.h(byteBuffer, mr0.b.a(this.f73456l));
            mr0.e.g(byteBuffer, this.f73457m);
            byteBuffer.putLong(this.f73458n);
        } else {
            mr0.e.g(byteBuffer, mr0.b.a(this.f73455k));
            mr0.e.g(byteBuffer, mr0.b.a(this.f73456l));
            mr0.e.g(byteBuffer, this.f73457m);
            byteBuffer.putInt((int) this.f73458n);
        }
        mr0.e.d(byteBuffer, this.f73459o);
        mr0.e.e(byteBuffer, 0);
    }

    @Override // lr0.a
    protected long d() {
        return (m() == 1 ? 32L : 20L) + 4;
    }

    public Date r() {
        lr0.e.b().c(mq0.b.b(f73445q, this, this));
        return this.f73455k;
    }

    public long s() {
        lr0.e.b().c(mq0.b.b(f73451w, this, this));
        return this.f73458n;
    }

    public String t() {
        lr0.e.b().c(mq0.b.b(f73453y, this, this));
        return this.f73459o;
    }

    public String toString() {
        lr0.e.b().c(mq0.b.b(A, this, this));
        return "MediaHeaderBox[creationTime=" + r() + ";modificationTime=" + u() + ";timescale=" + v() + ";duration=" + s() + ";language=" + t() + "]";
    }

    public Date u() {
        lr0.e.b().c(mq0.b.b(f73447s, this, this));
        return this.f73456l;
    }

    public long v() {
        lr0.e.b().c(mq0.b.b(f73449u, this, this));
        return this.f73457m;
    }

    public void w(Date date) {
        lr0.e.b().c(mq0.b.c(f73446r, this, this, date));
        this.f73455k = date;
    }

    public void x(long j11) {
        lr0.e.b().c(mq0.b.c(f73452x, this, this, lq0.a.e(j11)));
        this.f73458n = j11;
    }

    public void y(String str) {
        lr0.e.b().c(mq0.b.c(f73454z, this, this, str));
        this.f73459o = str;
    }

    public void z(long j11) {
        lr0.e.b().c(mq0.b.c(f73450v, this, this, lq0.a.e(j11)));
        this.f73457m = j11;
    }
}
