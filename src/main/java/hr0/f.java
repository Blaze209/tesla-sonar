package hr0;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class f extends lr0.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73417o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f73418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f73419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f73420i;

    static {
        k();
    }

    public f() {
        super("ftyp");
        this.f73420i = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("FileTypeBox.java", f.class);
        f73412j = bVar.f("method-execution", bVar.e("1", "getMajorBrand", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "", "", "", "java.lang.String"), 85);
        f73413k = bVar.f("method-execution", bVar.e("1", "setMajorBrand", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        f73414l = bVar.f("method-execution", bVar.e("1", "getMinorVersion", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "", "", "", "long"), 104);
        f73415m = bVar.f("method-execution", bVar.e("1", "setMinorVersion", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "long", "minorVersion", "", "void"), 113);
        f73416n = bVar.f("method-execution", bVar.e("1", "getCompatibleBrands", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "", "", "", "java.util.List"), 122);
        f73417o = bVar.f("method-execution", bVar.e("1", "setCompatibleBrands", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "java.util.List", "compatibleBrands", "", "void"), 126);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        this.f73418g = mr0.d.b(byteBuffer);
        this.f73419h = mr0.d.j(byteBuffer);
        int iRemaining = byteBuffer.remaining() / 4;
        this.f73420i = new LinkedList();
        for (int i11 = 0; i11 < iRemaining; i11++) {
            this.f73420i.add(mr0.d.b(byteBuffer));
        }
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        byteBuffer.put(fr0.c.B(this.f73418g));
        mr0.e.g(byteBuffer, this.f73419h);
        Iterator<String> it = this.f73420i.iterator();
        while (it.hasNext()) {
            byteBuffer.put(fr0.c.B(it.next()));
        }
    }

    @Override // lr0.a
    protected long d() {
        return (this.f73420i.size() * 4) + 8;
    }

    public String l() {
        lr0.e.b().c(mq0.b.b(f73412j, this, this));
        return this.f73418g;
    }

    public long m() {
        lr0.e.b().c(mq0.b.b(f73414l, this, this));
        return this.f73419h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FileTypeBox[");
        sb2.append("majorBrand=");
        sb2.append(l());
        sb2.append(";");
        sb2.append("minorVersion=");
        sb2.append(m());
        for (String str : this.f73420i) {
            sb2.append(";");
            sb2.append("compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public f(String str, long j11, List<String> list) {
        super("ftyp");
        List list2 = Collections.EMPTY_LIST;
        this.f73418g = str;
        this.f73419h = j11;
        this.f73420i = list;
    }
}
