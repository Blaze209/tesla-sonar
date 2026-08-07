package hr0;

import com.plaid.internal.EnumC4419g;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.nio.ByteBuffer;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes10.dex */
public class y extends lr0.c {
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

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static Logger f73516u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73519x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73520y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73521z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Date f73522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Date f73523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f73524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f73525n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f73526o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f73527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f73528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private lr0.d f73529r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double f73530s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double f73531t;

    static {
        k();
        f73516u = LoggerFactory.getLogger((Class<?>) y.class);
    }

    public y() {
        super("tkhd");
        this.f73522k = new Date(0L);
        this.f73523l = new Date(0L);
        this.f73529r = lr0.d.f90682j;
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("TrackHeaderBox.java", y.class);
        f73517v = bVar.f("method-execution", bVar.e("1", "getCreationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "java.util.Date"), 62);
        f73518w = bVar.f("method-execution", bVar.e("1", "setCreationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"), 66);
        F = bVar.f("method-execution", bVar.e("1", "getAlternateGroup", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "int"), 112);
        G = bVar.f("method-execution", bVar.e("1", "setAlternateGroup", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "int", "alternateGroup", "", "void"), 116);
        H = bVar.f("method-execution", bVar.e("1", "getVolume", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", InquiryField.FloatField.TYPE), 120);
        I = bVar.f("method-execution", bVar.e("1", "setVolume", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", InquiryField.FloatField.TYPE, "volume", "", "void"), 124);
        J = bVar.f("method-execution", bVar.e("1", "getMatrix", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "org.mp4parser.support.Matrix"), 128);
        K = bVar.f("method-execution", bVar.e("1", "setMatrix", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "org.mp4parser.support.Matrix", "matrix", "", "void"), 132);
        L = bVar.f("method-execution", bVar.e("1", "getWidth", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "double"), 136);
        M = bVar.f("method-execution", bVar.e("1", "setWidth", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "double", Snapshot.WIDTH, "", "void"), 140);
        N = bVar.f("method-execution", bVar.e("1", "getHeight", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "double"), 144);
        O = bVar.f("method-execution", bVar.e("1", "setHeight", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "double", Snapshot.HEIGHT, "", "void"), 148);
        f73519x = bVar.f("method-execution", bVar.e("1", "getModificationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "java.util.Date"), 73);
        P = bVar.f("method-execution", bVar.e("1", "getContent", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 195);
        Q = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "java.lang.String"), EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
        R = bVar.f("method-execution", bVar.e("1", "isEnabled", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", InquiryField.BooleanField.TYPE), EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);
        S = bVar.f("method-execution", bVar.e("1", "setEnabled", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", InquiryField.BooleanField.TYPE, "enabled", "", "void"), EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
        T = bVar.f("method-execution", bVar.e("1", "isInMovie", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", InquiryField.BooleanField.TYPE), EnumC4419g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
        U = bVar.f("method-execution", bVar.e("1", "setInMovie", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", InquiryField.BooleanField.TYPE, "inMovie", "", "void"), EnumC4419g.SDK_ASSET_HEADER_SHIELD_VALUE);
        V = bVar.f("method-execution", bVar.e("1", "isInPreview", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", InquiryField.BooleanField.TYPE), EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE);
        W = bVar.f("method-execution", bVar.e("1", "setInPreview", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", InquiryField.BooleanField.TYPE, "inPreview", "", "void"), EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE);
        X = bVar.f("method-execution", bVar.e("1", "isInPoster", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", InquiryField.BooleanField.TYPE), EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE);
        Y = bVar.f("method-execution", bVar.e("1", "setInPoster", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", InquiryField.BooleanField.TYPE, "inPoster", "", "void"), EnumC4419g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE);
        f73520y = bVar.f("method-execution", bVar.e("1", "setModificationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 77);
        f73521z = bVar.f("method-execution", bVar.e("1", "getTrackId", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "long"), 85);
        A = bVar.f("method-execution", bVar.e("1", "setTrackId", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "long", "trackId", "", "void"), 89);
        B = bVar.f("method-execution", bVar.e("1", "getDuration", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "long"), 93);
        C = bVar.f("method-execution", bVar.e("1", "setDuration", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "long", "duration", "", "void"), 97);
        D = bVar.f("method-execution", bVar.e("1", "getLayer", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "int"), 104);
        E = bVar.f("method-execution", bVar.e("1", "setLayer", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "int", "layer", "", "void"), 108);
    }

    public void A(int i11) {
        lr0.e.b().c(mq0.b.c(G, this, this, lq0.a.d(i11)));
        this.f73527p = i11;
    }

    public void B(Date date) {
        lr0.e.b().c(mq0.b.c(f73518w, this, this, date));
        this.f73522k = date;
        if (mr0.b.a(date) >= 4294967296L) {
            p(1);
        }
    }

    public void C(long j11) {
        lr0.e.b().c(mq0.b.c(C, this, this, lq0.a.e(j11)));
        this.f73525n = j11;
        if (j11 >= 4294967296L) {
            o(1);
        }
    }

    public void D(boolean z11) {
        lr0.e.b().c(mq0.b.c(S, this, this, lq0.a.a(z11)));
        if (z11) {
            o(l() | 1);
        } else {
            o(l() & (-2));
        }
    }

    public void E(double d11) {
        lr0.e.b().c(mq0.b.c(O, this, this, lq0.a.b(d11)));
        this.f73531t = d11;
    }

    public void F(boolean z11) {
        lr0.e.b().c(mq0.b.c(U, this, this, lq0.a.a(z11)));
        if (z11) {
            o(l() | 2);
        } else {
            o(l() & (-3));
        }
    }

    public void G(boolean z11) {
        lr0.e.b().c(mq0.b.c(W, this, this, lq0.a.a(z11)));
        if (z11) {
            o(l() | 4);
        } else {
            o(l() & (-5));
        }
    }

    public void H(int i11) {
        lr0.e.b().c(mq0.b.c(E, this, this, lq0.a.d(i11)));
        this.f73526o = i11;
    }

    public void I(lr0.d dVar) {
        lr0.e.b().c(mq0.b.c(K, this, this, dVar));
        this.f73529r = dVar;
    }

    public void J(Date date) {
        lr0.e.b().c(mq0.b.c(f73520y, this, this, date));
        this.f73523l = date;
        if (mr0.b.a(date) >= 4294967296L) {
            p(1);
        }
    }

    public void K(long j11) {
        lr0.e.b().c(mq0.b.c(A, this, this, lq0.a.e(j11)));
        this.f73524m = j11;
    }

    public void L(float f11) {
        lr0.e.b().c(mq0.b.c(I, this, this, lq0.a.c(f11)));
        this.f73528q = f11;
    }

    public void M(double d11) {
        lr0.e.b().c(mq0.b.c(M, this, this, lq0.a.b(d11)));
        this.f73530s = d11;
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
        if (m() == 1) {
            this.f73522k = mr0.b.b(mr0.d.k(byteBuffer));
            this.f73523l = mr0.b.b(mr0.d.k(byteBuffer));
            this.f73524m = mr0.d.j(byteBuffer);
            mr0.d.j(byteBuffer);
            this.f73525n = byteBuffer.getLong();
        } else {
            this.f73522k = mr0.b.b(mr0.d.j(byteBuffer));
            this.f73523l = mr0.b.b(mr0.d.j(byteBuffer));
            this.f73524m = mr0.d.j(byteBuffer);
            mr0.d.j(byteBuffer);
            this.f73525n = byteBuffer.getInt();
        }
        if (this.f73525n < -1) {
            f73516u.warn("tkhd duration is not in expected range");
        }
        mr0.d.j(byteBuffer);
        mr0.d.j(byteBuffer);
        this.f73526o = mr0.d.h(byteBuffer);
        this.f73527p = mr0.d.h(byteBuffer);
        this.f73528q = mr0.d.e(byteBuffer);
        mr0.d.h(byteBuffer);
        this.f73529r = lr0.d.a(byteBuffer);
        this.f73530s = mr0.d.d(byteBuffer);
        this.f73531t = mr0.d.d(byteBuffer);
    }

    @Override // lr0.a
    public void b(ByteBuffer byteBuffer) {
        lr0.e.b().c(mq0.b.c(P, this, this, byteBuffer));
        q(byteBuffer);
        if (m() == 1) {
            mr0.e.h(byteBuffer, mr0.b.a(this.f73522k));
            mr0.e.h(byteBuffer, mr0.b.a(this.f73523l));
            mr0.e.g(byteBuffer, this.f73524m);
            mr0.e.g(byteBuffer, 0L);
            byteBuffer.putLong(this.f73525n);
        } else {
            mr0.e.g(byteBuffer, mr0.b.a(this.f73522k));
            mr0.e.g(byteBuffer, mr0.b.a(this.f73523l));
            mr0.e.g(byteBuffer, this.f73524m);
            mr0.e.g(byteBuffer, 0L);
            byteBuffer.putInt((int) this.f73525n);
        }
        mr0.e.g(byteBuffer, 0L);
        mr0.e.g(byteBuffer, 0L);
        mr0.e.e(byteBuffer, this.f73526o);
        mr0.e.e(byteBuffer, this.f73527p);
        mr0.e.c(byteBuffer, this.f73528q);
        mr0.e.e(byteBuffer, 0);
        this.f73529r.c(byteBuffer);
        mr0.e.b(byteBuffer, this.f73530s);
        mr0.e.b(byteBuffer, this.f73531t);
    }

    @Override // lr0.a
    protected long d() {
        return (m() == 1 ? 36L : 24L) + 60;
    }

    public int r() {
        lr0.e.b().c(mq0.b.b(F, this, this));
        return this.f73527p;
    }

    public Date s() {
        lr0.e.b().c(mq0.b.b(f73517v, this, this));
        return this.f73522k;
    }

    public long t() {
        lr0.e.b().c(mq0.b.b(B, this, this));
        return this.f73525n;
    }

    public String toString() {
        lr0.e.b().c(mq0.b.b(Q, this, this));
        return "TrackHeaderBox[creationTime=" + s() + ";modificationTime=" + w() + ";trackId=" + x() + ";duration=" + t() + ";layer=" + v() + ";alternateGroup=" + r() + ";volume=" + y() + ";matrix=" + this.f73529r + ";width=" + z() + ";height=" + u() + "]";
    }

    public double u() {
        lr0.e.b().c(mq0.b.b(N, this, this));
        return this.f73531t;
    }

    public int v() {
        lr0.e.b().c(mq0.b.b(D, this, this));
        return this.f73526o;
    }

    public Date w() {
        lr0.e.b().c(mq0.b.b(f73519x, this, this));
        return this.f73523l;
    }

    public long x() {
        lr0.e.b().c(mq0.b.b(f73521z, this, this));
        return this.f73524m;
    }

    public float y() {
        lr0.e.b().c(mq0.b.b(H, this, this));
        return this.f73528q;
    }

    public double z() {
        lr0.e.b().c(mq0.b.b(L, this, this));
        return this.f73530s;
    }
}
