package hr0;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes10.dex */
public class g extends lr0.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Map<String, String> f73421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73423t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73424u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73425v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73427x;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f73428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f73429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f73430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f73431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f73432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f73433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f73434q;

    static {
        k();
        HashMap map = new HashMap();
        map.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mdir", "Apple Meta Data iTunes Reader");
        map.put("mp7b", "MPEG-7 binary XML");
        map.put("mp7t", "MPEG-7 XML");
        map.put("vide", "Video Track");
        map.put("soun", "Sound Track");
        map.put("hint", "Hint Track");
        map.put("appl", "Apple specific");
        map.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        f73421r = Collections.unmodifiableMap(map);
    }

    public g() {
        super("hdlr");
        this.f73429l = null;
        this.f73433p = true;
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("HandlerBox.java", g.class);
        f73422s = bVar.f("method-execution", bVar.e("1", "getHandlerType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 78);
        f73423t = bVar.f("method-execution", bVar.e("1", "setHandlerType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "java.lang.String", "handlerType", "", "void"), 82);
        f73424u = bVar.f("method-execution", bVar.e("1", "getName", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 86);
        f73425v = bVar.f("method-execution", bVar.e("1", "setName", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "java.lang.String", "name", "", "void"), 95);
        f73426w = bVar.f("method-execution", bVar.e("1", "getHumanReadableTrackType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 99);
        f73427x = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 149);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
        this.f73434q = mr0.d.j(byteBuffer);
        this.f73428k = mr0.d.b(byteBuffer);
        this.f73430m = mr0.d.j(byteBuffer);
        this.f73431n = mr0.d.j(byteBuffer);
        this.f73432o = mr0.d.j(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            this.f73433p = false;
            return;
        }
        String strG = mr0.d.g(byteBuffer, byteBuffer.remaining());
        this.f73429l = strG;
        if (!strG.endsWith(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            this.f73433p = false;
            return;
        }
        String str = this.f73429l;
        this.f73429l = str.substring(0, str.length() - 1);
        this.f73433p = true;
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        mr0.e.g(byteBuffer, this.f73434q);
        byteBuffer.put(fr0.c.B(this.f73428k));
        mr0.e.g(byteBuffer, this.f73430m);
        mr0.e.g(byteBuffer, this.f73431n);
        mr0.e.g(byteBuffer, this.f73432o);
        String str = this.f73429l;
        if (str != null) {
            byteBuffer.put(mr0.f.b(str));
        }
        if (this.f73433p) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // lr0.a
    protected long d() {
        return this.f73433p ? mr0.f.c(this.f73429l) + 25 : mr0.f.c(this.f73429l) + 24;
    }

    public String r() {
        lr0.e.b().c(mq0.b.b(f73422s, this, this));
        return this.f73428k;
    }

    public String s() {
        lr0.e.b().c(mq0.b.b(f73424u, this, this));
        return this.f73429l;
    }

    public void t(String str) {
        lr0.e.b().c(mq0.b.c(f73423t, this, this, str));
        this.f73428k = str;
    }

    public String toString() {
        lr0.e.b().c(mq0.b.b(f73427x, this, this));
        return "HandlerBox[handlerType=" + r() + ";name=" + s() + "]";
    }

    public void u(String str) {
        lr0.e.b().c(mq0.b.c(f73425v, this, this, str));
        this.f73429l = str;
    }
}
