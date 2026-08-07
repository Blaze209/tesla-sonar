package hr0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class z extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73533n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73534o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73536q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f73537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f73538l;

    static {
        k();
    }

    public z() {
        super("vmhd");
        this.f73537k = 0;
        this.f73538l = new int[3];
        this.f90681h = 1;
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("VideoMediaHeaderBox.java", z.class);
        f73532m = bVar.f("method-execution", bVar.e("1", "getGraphicsmode", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "", "int"), 39);
        f73533n = bVar.f("method-execution", bVar.e("1", "setGraphicsmode", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "int", "graphicsmode", "", "void"), 43);
        f73534o = bVar.f("method-execution", bVar.e("1", "getOpcolor", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "", "[I"), 47);
        f73535p = bVar.f("method-execution", bVar.e("1", "setOpcolor", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "[I", "opcolor", "", "void"), 51);
        f73536q = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "", "java.lang.String"), 78);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
        this.f73537k = mr0.d.h(byteBuffer);
        this.f73538l = new int[3];
        for (int i11 = 0; i11 < 3; i11++) {
            this.f73538l[i11] = mr0.d.h(byteBuffer);
        }
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        mr0.e.e(byteBuffer, this.f73537k);
        for (int i11 : this.f73538l) {
            mr0.e.e(byteBuffer, i11);
        }
    }

    @Override // lr0.a
    protected long d() {
        return 12L;
    }

    public int r() {
        lr0.e.b().c(mq0.b.b(f73532m, this, this));
        return this.f73537k;
    }

    public int[] s() {
        lr0.e.b().c(mq0.b.b(f73534o, this, this));
        return this.f73538l;
    }

    public String toString() {
        lr0.e.b().c(mq0.b.b(f73536q, this, this));
        return "VideoMediaHeaderBox[graphicsmode=" + r() + ";opcolor0=" + s()[0] + ";opcolor1=" + s()[1] + ";opcolor2=" + s()[2] + "]";
    }
}
