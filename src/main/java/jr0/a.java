package jr0;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.nio.ByteBuffer;
import java.util.List;
import lr0.e;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends lr0.a {
    private static /* synthetic */ jq0.a.InterfaceC1785a A;
    private static /* synthetic */ jq0.a.InterfaceC1785a B;
    private static /* synthetic */ jq0.a.InterfaceC1785a C;
    private static /* synthetic */ jq0.a.InterfaceC1785a D;
    private static /* synthetic */ jq0.a.InterfaceC1785a E;
    private static /* synthetic */ jq0.a.InterfaceC1785a F;
    private static /* synthetic */ jq0.a.InterfaceC1785a G;
    private static /* synthetic */ jq0.a.InterfaceC1785a H;
    private static /* synthetic */ jq0.a.InterfaceC1785a I;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84290o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84291p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84292q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84296u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84297v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84299x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84300y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f84301z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f84302g;

    static {
        k();
    }

    public a() {
        super("avcC");
        this.f84302g = new b();
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("AvcConfigurationBox.java", a.class);
        f84283h = bVar.f("method-execution", bVar.e("1", "getConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 44);
        f84284i = bVar.f("method-execution", bVar.e("1", "setConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 48);
        f84293r = bVar.f("method-execution", bVar.e("1", "getSequenceParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 84);
        f84294s = bVar.f("method-execution", bVar.e("1", "setSequenceParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 88);
        f84295t = bVar.f("method-execution", bVar.e("1", "getPictureParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 92);
        f84296u = bVar.f("method-execution", bVar.e("1", "setPictureParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 96);
        f84297v = bVar.f("method-execution", bVar.e("1", "getChromaFormat", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 100);
        f84298w = bVar.f("method-execution", bVar.e("1", "setChromaFormat", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 104);
        f84299x = bVar.f("method-execution", bVar.e("1", "getBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 108);
        f84300y = bVar.f("method-execution", bVar.e("1", "setBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 112);
        f84301z = bVar.f("method-execution", bVar.e("1", "getBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 116);
        A = bVar.f("method-execution", bVar.e("1", "setBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 120);
        f84285j = bVar.f("method-execution", bVar.e("1", "getAvcProfileIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 52);
        B = bVar.f("method-execution", bVar.e("1", "getSequenceParameterSetExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 124);
        C = bVar.f("method-execution", bVar.e("1", "setSequenceParameterSetExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 128);
        D = bVar.f("method-execution", bVar.e("1", "hasExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", InquiryField.BooleanField.TYPE), 132);
        E = bVar.f("method-execution", bVar.e("1", "setHasExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", InquiryField.BooleanField.TYPE, "hasExts", "", "void"), 136);
        F = bVar.f("method-execution", bVar.e("1", "getContentSize", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "long"), 147);
        G = bVar.f("method-execution", bVar.e("1", "getContent", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 153);
        H = bVar.f("method-execution", bVar.e("1", "getavcDecoderConfigurationRecord", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "org.mp4parser.boxes.iso14496.part15.AvcDecoderConfigurationRecord"), 158);
        I = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), 163);
        f84286k = bVar.f("method-execution", bVar.e("1", "setAvcProfileIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 56);
        f84287l = bVar.f("method-execution", bVar.e("1", "getProfileCompatibility", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 60);
        f84288m = bVar.f("method-execution", bVar.e("1", "setProfileCompatibility", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 64);
        f84289n = bVar.f("method-execution", bVar.e("1", "getAvcLevelIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 68);
        f84290o = bVar.f("method-execution", bVar.e("1", "setAvcLevelIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 72);
        f84291p = bVar.f("method-execution", bVar.e("1", "getLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 76);
        f84292q = bVar.f("method-execution", bVar.e("1", "setLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 80);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        this.f84302g = new b(byteBuffer);
    }

    @Override // lr0.a
    public void b(ByteBuffer byteBuffer) {
        e.b().c(mq0.b.c(G, this, this, byteBuffer));
        this.f84302g.a(byteBuffer);
    }

    @Override // lr0.a
    public long d() {
        e.b().c(mq0.b.b(F, this, this));
        return this.f84302g.b();
    }

    public void l(int i11) {
        e.b().c(mq0.b.c(f84290o, this, this, lq0.a.d(i11)));
        this.f84302g.f84306d = i11;
    }

    public void m(int i11) {
        e.b().c(mq0.b.c(f84286k, this, this, lq0.a.d(i11)));
        this.f84302g.f84304b = i11;
    }

    public void n(int i11) {
        e.b().c(mq0.b.c(A, this, this, lq0.a.d(i11)));
        this.f84302g.f84313k = i11;
    }

    public void o(int i11) {
        e.b().c(mq0.b.c(f84300y, this, this, lq0.a.d(i11)));
        this.f84302g.f84312j = i11;
    }

    public void p(int i11) {
        e.b().c(mq0.b.c(f84298w, this, this, lq0.a.d(i11)));
        this.f84302g.f84311i = i11;
    }

    public void q(int i11) {
        e.b().c(mq0.b.c(f84284i, this, this, lq0.a.d(i11)));
        this.f84302g.f84303a = i11;
    }

    public void r(int i11) {
        e.b().c(mq0.b.c(f84292q, this, this, lq0.a.d(i11)));
        this.f84302g.f84307e = i11;
    }

    public void s(List<ByteBuffer> list) {
        e.b().c(mq0.b.c(f84296u, this, this, list));
        this.f84302g.f84309g = list;
    }

    public void t(int i11) {
        e.b().c(mq0.b.c(f84288m, this, this, lq0.a.d(i11)));
        this.f84302g.f84305c = i11;
    }

    public String toString() {
        e.b().c(mq0.b.b(I, this, this));
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f84302g + CoreConstants.CURLY_RIGHT;
    }

    public void u(List<ByteBuffer> list) {
        e.b().c(mq0.b.c(f84294s, this, this, list));
        this.f84302g.f84308f = list;
    }
}
