package hr0;

import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.nio.ByteBuffer;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes10.dex */
public class m extends lr0.c {
    private static /* synthetic */ jq0.a.InterfaceC1785a A;
    private static /* synthetic */ jq0.a.InterfaceC1785a B;
    private static /* synthetic */ jq0.a.InterfaceC1785a C;
    private static /* synthetic */ jq0.a.InterfaceC1785a D;
    private static /* synthetic */ jq0.a.InterfaceC1785a E;
    private static /* synthetic */ jq0.a.InterfaceC1785a F;
    private static /* synthetic */ jq0.a.InterfaceC1785a G;
    private static /* synthetic */ jq0.a.InterfaceC1785a H;
    private static /* synthetic */ jq0.a.InterfaceC1785a I;
    private static /* synthetic */ jq0.a.InterfaceC1785a J;
    private static /* synthetic */ jq0.a.InterfaceC1785a K;
    private static /* synthetic */ jq0.a.InterfaceC1785a L;
    private static /* synthetic */ jq0.a.InterfaceC1785a M;
    private static /* synthetic */ jq0.a.InterfaceC1785a N;
    private static /* synthetic */ jq0.a.InterfaceC1785a O;
    private static /* synthetic */ jq0.a.InterfaceC1785a P;
    private static /* synthetic */ jq0.a.InterfaceC1785a Q;
    private static /* synthetic */ jq0.a.InterfaceC1785a R;
    private static /* synthetic */ jq0.a.InterfaceC1785a S;
    private static /* synthetic */ jq0.a.InterfaceC1785a T;
    private static /* synthetic */ jq0.a.InterfaceC1785a U;
    private static /* synthetic */ jq0.a.InterfaceC1785a V;
    private static /* synthetic */ jq0.a.InterfaceC1785a W;
    private static /* synthetic */ jq0.a.InterfaceC1785a X;
    private static /* synthetic */ jq0.a.InterfaceC1785a Y;
    private static /* synthetic */ jq0.a.InterfaceC1785a Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73460a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73461b0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static Logger f73462y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73463z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Date f73464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Date f73465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f73466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f73467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private double f73468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f73469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private lr0.d f73470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f73471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f73472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f73473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f73474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f73475v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f73476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f73477x;

    static {
        k();
        f73462y = LoggerFactory.getLogger((Class<?>) m.class);
    }

    public m() {
        super("mvhd");
        this.f73468o = 1.0d;
        this.f73469p = 1.0f;
        this.f73470q = lr0.d.f90682j;
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("MovieHeaderBox.java", m.class);
        f73463z = bVar.f("method-execution", bVar.e("1", "getCreationTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "java.util.Date"), 64);
        A = bVar.f("method-execution", bVar.e("1", "setCreationTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"), 68);
        J = bVar.f("method-execution", bVar.e("1", "getVolume", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", InquiryField.FloatField.TYPE), 115);
        K = bVar.f("method-execution", bVar.e("1", "setVolume", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", InquiryField.FloatField.TYPE, "volume", "", "void"), 119);
        L = bVar.f("method-execution", bVar.e("1", "getMatrix", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "org.mp4parser.support.Matrix"), 123);
        M = bVar.f("method-execution", bVar.e("1", "setMatrix", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "org.mp4parser.support.Matrix", "matrix", "", "void"), 127);
        N = bVar.f("method-execution", bVar.e("1", "getNextTrackId", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "long"), 131);
        O = bVar.f("method-execution", bVar.e("1", "setNextTrackId", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "long", "nextTrackId", "", "void"), 135);
        P = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "java.lang.String"), 189);
        Q = bVar.f("method-execution", bVar.e("1", "getPreviewTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "int"), EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE);
        R = bVar.f("method-execution", bVar.e("1", "setPreviewTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "previewTime", "", "void"), EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);
        S = bVar.f("method-execution", bVar.e("1", "getPreviewDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "int"), EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);
        B = bVar.f("method-execution", bVar.e("1", "getModificationTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "java.util.Date"), 76);
        T = bVar.f("method-execution", bVar.e("1", "setPreviewDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "previewDuration", "", "void"), 255);
        U = bVar.f("method-execution", bVar.e("1", "getPosterTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "int"), EnumC4419g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE);
        V = bVar.f("method-execution", bVar.e("1", "setPosterTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "posterTime", "", "void"), EnumC4419g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE);
        W = bVar.f("method-execution", bVar.e("1", "getSelectionTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "int"), EnumC4419g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);
        X = bVar.f("method-execution", bVar.e("1", "setSelectionTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "selectionTime", "", "void"), EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE);
        Y = bVar.f("method-execution", bVar.e("1", "getSelectionDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "int"), EnumC4419g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE);
        Z = bVar.f("method-execution", bVar.e("1", "setSelectionDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "selectionDuration", "", "void"), EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);
        f73460a0 = bVar.f("method-execution", bVar.e("1", "getCurrentTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "int"), EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_VALUE);
        f73461b0 = bVar.f("method-execution", bVar.e("1", "setCurrentTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "currentTime", "", "void"), EnumC4419g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE);
        C = bVar.f("method-execution", bVar.e("1", "setModificationTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), 80);
        D = bVar.f("method-execution", bVar.e("1", "getTimescale", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "long"), 88);
        E = bVar.f("method-execution", bVar.e("1", "setTimescale", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "long", "timescale", "", "void"), 92);
        F = bVar.f("method-execution", bVar.e("1", "getDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "long"), 96);
        G = bVar.f("method-execution", bVar.e("1", "setDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "long", "duration", "", "void"), 100);
        H = bVar.f("method-execution", bVar.e("1", "getRate", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "double"), 107);
        I = bVar.f("method-execution", bVar.e("1", "setRate", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "double", "rate", "", "void"), 111);
    }

    public void A(lr0.d dVar) {
        lr0.e.b().c(mq0.b.c(M, this, this, dVar));
        this.f73470q = dVar;
    }

    public void B(Date date) {
        lr0.e.b().c(mq0.b.c(C, this, this, date));
        this.f73465l = date;
        if (mr0.b.a(date) >= 4294967296L) {
            p(1);
        }
    }

    public void C(long j11) {
        lr0.e.b().c(mq0.b.c(O, this, this, lq0.a.e(j11)));
        this.f73471r = j11;
    }

    public void D(long j11) {
        lr0.e.b().c(mq0.b.c(E, this, this, lq0.a.e(j11)));
        this.f73466m = j11;
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
        if (m() == 1) {
            this.f73464k = mr0.b.b(mr0.d.k(byteBuffer));
            this.f73465l = mr0.b.b(mr0.d.k(byteBuffer));
            this.f73466m = mr0.d.j(byteBuffer);
            this.f73467n = byteBuffer.getLong();
        } else {
            this.f73464k = mr0.b.b(mr0.d.j(byteBuffer));
            this.f73465l = mr0.b.b(mr0.d.j(byteBuffer));
            this.f73466m = mr0.d.j(byteBuffer);
            this.f73467n = byteBuffer.getInt();
        }
        if (this.f73467n < -1) {
            f73462y.warn("mvhd duration is not in expected range");
        }
        this.f73468o = mr0.d.d(byteBuffer);
        this.f73469p = mr0.d.e(byteBuffer);
        mr0.d.h(byteBuffer);
        mr0.d.j(byteBuffer);
        mr0.d.j(byteBuffer);
        this.f73470q = lr0.d.a(byteBuffer);
        this.f73472s = byteBuffer.getInt();
        this.f73473t = byteBuffer.getInt();
        this.f73474u = byteBuffer.getInt();
        this.f73475v = byteBuffer.getInt();
        this.f73476w = byteBuffer.getInt();
        this.f73477x = byteBuffer.getInt();
        this.f73471r = mr0.d.j(byteBuffer);
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        if (m() == 1) {
            mr0.e.h(byteBuffer, mr0.b.a(this.f73464k));
            mr0.e.h(byteBuffer, mr0.b.a(this.f73465l));
            mr0.e.g(byteBuffer, this.f73466m);
            byteBuffer.putLong(this.f73467n);
        } else {
            mr0.e.g(byteBuffer, mr0.b.a(this.f73464k));
            mr0.e.g(byteBuffer, mr0.b.a(this.f73465l));
            mr0.e.g(byteBuffer, this.f73466m);
            byteBuffer.putInt((int) this.f73467n);
        }
        mr0.e.b(byteBuffer, this.f73468o);
        mr0.e.c(byteBuffer, this.f73469p);
        mr0.e.e(byteBuffer, 0);
        mr0.e.g(byteBuffer, 0L);
        mr0.e.g(byteBuffer, 0L);
        this.f73470q.c(byteBuffer);
        byteBuffer.putInt(this.f73472s);
        byteBuffer.putInt(this.f73473t);
        byteBuffer.putInt(this.f73474u);
        byteBuffer.putInt(this.f73475v);
        byteBuffer.putInt(this.f73476w);
        byteBuffer.putInt(this.f73477x);
        mr0.e.g(byteBuffer, this.f73471r);
    }

    @Override // lr0.a
    protected long d() {
        return (m() == 1 ? 32L : 20L) + 80;
    }

    public Date r() {
        lr0.e.b().c(mq0.b.b(f73463z, this, this));
        return this.f73464k;
    }

    public long s() {
        lr0.e.b().c(mq0.b.b(F, this, this));
        return this.f73467n;
    }

    public Date t() {
        lr0.e.b().c(mq0.b.b(B, this, this));
        return this.f73465l;
    }

    public String toString() {
        lr0.e.b().c(mq0.b.b(P, this, this));
        return "MovieHeaderBox[creationTime=" + r() + ";modificationTime=" + t() + ";timescale=" + w() + ";duration=" + s() + ";rate=" + v() + ";volume=" + x() + ";matrix=" + this.f73470q + ";nextTrackId=" + u() + "]";
    }

    public long u() {
        lr0.e.b().c(mq0.b.b(N, this, this));
        return this.f73471r;
    }

    public double v() {
        lr0.e.b().c(mq0.b.b(H, this, this));
        return this.f73468o;
    }

    public long w() {
        lr0.e.b().c(mq0.b.b(D, this, this));
        return this.f73466m;
    }

    public float x() {
        lr0.e.b().c(mq0.b.b(J, this, this));
        return this.f73469p;
    }

    public void y(Date date) {
        lr0.e.b().c(mq0.b.c(A, this, this, date));
        this.f73464k = date;
        if (mr0.b.a(date) >= 4294967296L) {
            p(1);
        }
    }

    public void z(long j11) {
        lr0.e.b().c(mq0.b.c(G, this, this, lq0.a.e(j11)));
        this.f73467n = j11;
        if (j11 >= 4294967296L) {
            p(1);
        }
    }
}
