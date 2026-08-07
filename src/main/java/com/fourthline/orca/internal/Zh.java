package com.fourthline.orca.internal;

import com.fourthline.orca.core.flavor.OrcaColors;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public interface Zh {
    OrcaColors.OrcaColor a();

    OrcaColors.OrcaColor b();

    OrcaColors.OrcaColor c();

    OrcaColors.OrcaColor d();

    OrcaColors.OrcaColor e();

    OrcaColors.OrcaColor f();

    OrcaColors.OrcaColor g();

    OrcaColors.OrcaColor h();

    OrcaColors.OrcaColor i();

    OrcaColors.OrcaColor j();

    OrcaColors.OrcaColor k();

    OrcaColors.OrcaColor l();

    OrcaColors.OrcaColor m();

    public static final class a implements Zh {
        private final OrcaColors.OrcaColor A;
        private final OrcaColors.OrcaColor B;
        private final OrcaColors.OrcaColor C;
        private final OrcaColors.OrcaColor D;
        private final OrcaColors.OrcaColor E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30031f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30032g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30033h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30034i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30035j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30036k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30037l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30038m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30039n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30040o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30041p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30042q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30043r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30044s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30045t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30046u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30047v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30048w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30049x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30050y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30051z;

        public a(OrcaColors.OrcaColor success, OrcaColors.OrcaColor danger, OrcaColors.OrcaColor warning, OrcaColors.OrcaColor caution, OrcaColors.OrcaColor info, OrcaColors.OrcaColor hint, OrcaColors.OrcaColor transparent, OrcaColors.OrcaColor white, OrcaColors.OrcaColor black, OrcaColors.OrcaColor dark90, OrcaColors.OrcaColor dark80, OrcaColors.OrcaColor dark70, OrcaColors.OrcaColor dark60, OrcaColors.OrcaColor dark50, OrcaColors.OrcaColor dark40, OrcaColors.OrcaColor dark30, OrcaColors.OrcaColor dark20, OrcaColors.OrcaColor dark10, OrcaColors.OrcaColor dark3, OrcaColors.OrcaColor light90, OrcaColors.OrcaColor light80, OrcaColors.OrcaColor light70, OrcaColors.OrcaColor light60, OrcaColors.OrcaColor light50, OrcaColors.OrcaColor light40, OrcaColors.OrcaColor light30, OrcaColors.OrcaColor light20, OrcaColors.OrcaColor light10, OrcaColors.OrcaColor light3, OrcaColors.OrcaColor neutral4, OrcaColors.OrcaColor neutral5) {
            p013kotlin.jvm.internal.s.k(success, "success");
            p013kotlin.jvm.internal.s.k(danger, "danger");
            p013kotlin.jvm.internal.s.k(warning, "warning");
            p013kotlin.jvm.internal.s.k(caution, "caution");
            p013kotlin.jvm.internal.s.k(info, "info");
            p013kotlin.jvm.internal.s.k(hint, "hint");
            p013kotlin.jvm.internal.s.k(transparent, "transparent");
            p013kotlin.jvm.internal.s.k(white, "white");
            p013kotlin.jvm.internal.s.k(black, "black");
            p013kotlin.jvm.internal.s.k(dark90, "dark90");
            p013kotlin.jvm.internal.s.k(dark80, "dark80");
            p013kotlin.jvm.internal.s.k(dark70, "dark70");
            p013kotlin.jvm.internal.s.k(dark60, "dark60");
            p013kotlin.jvm.internal.s.k(dark50, "dark50");
            p013kotlin.jvm.internal.s.k(dark40, "dark40");
            p013kotlin.jvm.internal.s.k(dark30, "dark30");
            p013kotlin.jvm.internal.s.k(dark20, "dark20");
            p013kotlin.jvm.internal.s.k(dark10, "dark10");
            p013kotlin.jvm.internal.s.k(dark3, "dark3");
            p013kotlin.jvm.internal.s.k(light90, "light90");
            p013kotlin.jvm.internal.s.k(light80, "light80");
            p013kotlin.jvm.internal.s.k(light70, "light70");
            p013kotlin.jvm.internal.s.k(light60, "light60");
            p013kotlin.jvm.internal.s.k(light50, "light50");
            p013kotlin.jvm.internal.s.k(light40, "light40");
            p013kotlin.jvm.internal.s.k(light30, "light30");
            p013kotlin.jvm.internal.s.k(light20, "light20");
            p013kotlin.jvm.internal.s.k(light10, "light10");
            p013kotlin.jvm.internal.s.k(light3, "light3");
            p013kotlin.jvm.internal.s.k(neutral4, "neutral4");
            p013kotlin.jvm.internal.s.k(neutral5, "neutral5");
            this.f30026a = success;
            this.f30027b = danger;
            this.f30028c = warning;
            this.f30029d = caution;
            this.f30030e = info;
            this.f30031f = hint;
            this.f30032g = transparent;
            this.f30033h = white;
            this.f30034i = black;
            this.f30035j = dark90;
            this.f30036k = dark80;
            this.f30037l = dark70;
            this.f30038m = dark60;
            this.f30039n = dark50;
            this.f30040o = dark40;
            this.f30041p = dark30;
            this.f30042q = dark20;
            this.f30043r = dark10;
            this.f30044s = dark3;
            this.f30045t = light90;
            this.f30046u = light80;
            this.f30047v = light70;
            this.f30048w = light60;
            this.f30049x = light50;
            this.f30050y = light40;
            this.f30051z = light30;
            this.A = light20;
            this.B = light10;
            this.C = light3;
            this.D = neutral4;
            this.E = neutral5;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor a() {
            return this.f30044s;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor b() {
            return this.f30043r;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor c() {
            return this.f30038m;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor d() {
            return this.D;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor e() {
            return this.f30028c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f30026a, aVar.f30026a) && p013kotlin.jvm.internal.s.f(this.f30027b, aVar.f30027b) && p013kotlin.jvm.internal.s.f(this.f30028c, aVar.f30028c) && p013kotlin.jvm.internal.s.f(this.f30029d, aVar.f30029d) && p013kotlin.jvm.internal.s.f(this.f30030e, aVar.f30030e) && p013kotlin.jvm.internal.s.f(this.f30031f, aVar.f30031f) && p013kotlin.jvm.internal.s.f(this.f30032g, aVar.f30032g) && p013kotlin.jvm.internal.s.f(this.f30033h, aVar.f30033h) && p013kotlin.jvm.internal.s.f(this.f30034i, aVar.f30034i) && p013kotlin.jvm.internal.s.f(this.f30035j, aVar.f30035j) && p013kotlin.jvm.internal.s.f(this.f30036k, aVar.f30036k) && p013kotlin.jvm.internal.s.f(this.f30037l, aVar.f30037l) && p013kotlin.jvm.internal.s.f(this.f30038m, aVar.f30038m) && p013kotlin.jvm.internal.s.f(this.f30039n, aVar.f30039n) && p013kotlin.jvm.internal.s.f(this.f30040o, aVar.f30040o) && p013kotlin.jvm.internal.s.f(this.f30041p, aVar.f30041p) && p013kotlin.jvm.internal.s.f(this.f30042q, aVar.f30042q) && p013kotlin.jvm.internal.s.f(this.f30043r, aVar.f30043r) && p013kotlin.jvm.internal.s.f(this.f30044s, aVar.f30044s) && p013kotlin.jvm.internal.s.f(this.f30045t, aVar.f30045t) && p013kotlin.jvm.internal.s.f(this.f30046u, aVar.f30046u) && p013kotlin.jvm.internal.s.f(this.f30047v, aVar.f30047v) && p013kotlin.jvm.internal.s.f(this.f30048w, aVar.f30048w) && p013kotlin.jvm.internal.s.f(this.f30049x, aVar.f30049x) && p013kotlin.jvm.internal.s.f(this.f30050y, aVar.f30050y) && p013kotlin.jvm.internal.s.f(this.f30051z, aVar.f30051z) && p013kotlin.jvm.internal.s.f(this.A, aVar.A) && p013kotlin.jvm.internal.s.f(this.B, aVar.B) && p013kotlin.jvm.internal.s.f(this.C, aVar.C) && p013kotlin.jvm.internal.s.f(this.D, aVar.D) && p013kotlin.jvm.internal.s.f(this.E, aVar.E);
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor f() {
            return this.f30042q;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor g() {
            return this.f30032g;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor h() {
            return this.f30027b;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f30026a.hashCode() * 31) + this.f30027b.hashCode()) * 31) + this.f30028c.hashCode()) * 31) + this.f30029d.hashCode()) * 31) + this.f30030e.hashCode()) * 31) + this.f30031f.hashCode()) * 31) + this.f30032g.hashCode()) * 31) + this.f30033h.hashCode()) * 31) + this.f30034i.hashCode()) * 31) + this.f30035j.hashCode()) * 31) + this.f30036k.hashCode()) * 31) + this.f30037l.hashCode()) * 31) + this.f30038m.hashCode()) * 31) + this.f30039n.hashCode()) * 31) + this.f30040o.hashCode()) * 31) + this.f30041p.hashCode()) * 31) + this.f30042q.hashCode()) * 31) + this.f30043r.hashCode()) * 31) + this.f30044s.hashCode()) * 31) + this.f30045t.hashCode()) * 31) + this.f30046u.hashCode()) * 31) + this.f30047v.hashCode()) * 31) + this.f30048w.hashCode()) * 31) + this.f30049x.hashCode()) * 31) + this.f30050y.hashCode()) * 31) + this.f30051z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode();
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor i() {
            return this.f30029d;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor j() {
            return this.f30030e;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor k() {
            return this.f30033h;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor l() {
            return this.E;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor m() {
            return this.f30026a;
        }

        public String toString() {
            return "Dark(success=" + this.f30026a + ", danger=" + this.f30027b + ", warning=" + this.f30028c + ", caution=" + this.f30029d + ", info=" + this.f30030e + ", hint=" + this.f30031f + ", transparent=" + this.f30032g + ", white=" + this.f30033h + ", black=" + this.f30034i + ", dark90=" + this.f30035j + ", dark80=" + this.f30036k + ", dark70=" + this.f30037l + ", dark60=" + this.f30038m + ", dark50=" + this.f30039n + ", dark40=" + this.f30040o + ", dark30=" + this.f30041p + ", dark20=" + this.f30042q + ", dark10=" + this.f30043r + ", dark3=" + this.f30044s + ", light90=" + this.f30045t + ", light80=" + this.f30046u + ", light70=" + this.f30047v + ", light60=" + this.f30048w + ", light50=" + this.f30049x + ", light40=" + this.f30050y + ", light30=" + this.f30051z + ", light20=" + this.A + ", light10=" + this.B + ", light3=" + this.C + ", neutral4=" + this.D + ", neutral5=" + this.E + ")";
        }

        public /* synthetic */ a(OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, OrcaColors.OrcaColor orcaColor4, OrcaColors.OrcaColor orcaColor5, OrcaColors.OrcaColor orcaColor6, OrcaColors.OrcaColor orcaColor7, OrcaColors.OrcaColor orcaColor8, OrcaColors.OrcaColor orcaColor9, OrcaColors.OrcaColor orcaColor10, OrcaColors.OrcaColor orcaColor11, OrcaColors.OrcaColor orcaColor12, OrcaColors.OrcaColor orcaColor13, OrcaColors.OrcaColor orcaColor14, OrcaColors.OrcaColor orcaColor15, OrcaColors.OrcaColor orcaColor16, OrcaColors.OrcaColor orcaColor17, OrcaColors.OrcaColor orcaColor18, OrcaColors.OrcaColor orcaColor19, OrcaColors.OrcaColor orcaColor20, OrcaColors.OrcaColor orcaColor21, OrcaColors.OrcaColor orcaColor22, OrcaColors.OrcaColor orcaColor23, OrcaColors.OrcaColor orcaColor24, OrcaColors.OrcaColor orcaColor25, OrcaColors.OrcaColor orcaColor26, OrcaColors.OrcaColor orcaColor27, OrcaColors.OrcaColor orcaColor28, OrcaColors.OrcaColor orcaColor29, OrcaColors.OrcaColor orcaColor30, OrcaColors.OrcaColor orcaColor31, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            OrcaColors.OrcaColor fromLong;
            OrcaColors.OrcaColor orcaColor32;
            OrcaColors.OrcaColor orcaColor33;
            OrcaColors.OrcaColor fromInt = (i11 & 1) != 0 ? new OrcaColors.OrcaColor.FromInt(57442) : orcaColor;
            OrcaColors.OrcaColor fromInt2 = (i11 & 2) != 0 ? new OrcaColors.OrcaColor.FromInt(15834011) : orcaColor2;
            OrcaColors.OrcaColor fromInt3 = (i11 & 4) != 0 ? new OrcaColors.OrcaColor.FromInt(16750675) : orcaColor3;
            OrcaColors.OrcaColor fromInt4 = (i11 & 8) != 0 ? new OrcaColors.OrcaColor.FromInt(16764672) : orcaColor4;
            OrcaColors.OrcaColor fromInt5 = (i11 & 16) != 0 ? new OrcaColors.OrcaColor.FromInt(3952740) : orcaColor5;
            OrcaColors.OrcaColor fromInt6 = (i11 & 32) != 0 ? new OrcaColors.OrcaColor.FromInt(4085871) : orcaColor6;
            OrcaColors.OrcaColor fromLong2 = (i11 & 64) != 0 ? new OrcaColors.OrcaColor.FromLong(0L) : orcaColor7;
            OrcaColors.OrcaColor fromInt7 = (i11 & 128) != 0 ? new OrcaColors.OrcaColor.FromInt(16777215) : orcaColor8;
            OrcaColors.OrcaColor fromInt8 = (i11 & 256) != 0 ? new OrcaColors.OrcaColor.FromInt(0) : orcaColor9;
            OrcaColors.OrcaColor fromLong3 = (i11 & 512) != 0 ? new OrcaColors.OrcaColor.FromLong(3875536895L) : orcaColor10;
            OrcaColors.OrcaColor fromLong4 = (i11 & 1024) != 0 ? new OrcaColors.OrcaColor.FromLong(3439329279L) : orcaColor11;
            OrcaColors.OrcaColor fromLong5 = (i11 & 2048) != 0 ? new OrcaColors.OrcaColor.FromLong(3019898879L) : orcaColor12;
            OrcaColors.OrcaColor fromLong6 = (i11 & 4096) != 0 ? new OrcaColors.OrcaColor.FromLong(2583691263L) : orcaColor13;
            OrcaColors.OrcaColor fromLong7 = (i11 & PKIFailureInfo.certRevoked) != 0 ? new OrcaColors.OrcaColor.FromLong(2164260863L) : orcaColor14;
            OrcaColors.OrcaColor fromLong8 = (i11 & 16384) != 0 ? new OrcaColors.OrcaColor.FromLong(1728053247L) : orcaColor15;
            OrcaColors.OrcaColor fromLong9 = (i11 & 32768) != 0 ? new OrcaColors.OrcaColor.FromLong(1308622847L) : orcaColor16;
            OrcaColors.OrcaColor fromLong10 = (i11 & 65536) != 0 ? new OrcaColors.OrcaColor.FromLong(872415231L) : orcaColor17;
            OrcaColors.OrcaColor fromLong11 = (i11 & 131072) != 0 ? new OrcaColors.OrcaColor.FromLong(452984831L) : orcaColor18;
            OrcaColors.OrcaColor fromLong12 = (i11 & 262144) != 0 ? new OrcaColors.OrcaColor.FromLong(150994943L) : orcaColor19;
            OrcaColors.OrcaColor fromLong13 = (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? new OrcaColors.OrcaColor.FromLong(3858759680L) : orcaColor20;
            OrcaColors.OrcaColor fromLong14 = (i11 & PKIFailureInfo.badCertTemplate) != 0 ? new OrcaColors.OrcaColor.FromLong(3422552064L) : orcaColor21;
            OrcaColors.OrcaColor fromLong15 = (i11 & PKIFailureInfo.badSenderNonce) != 0 ? new OrcaColors.OrcaColor.FromLong(3003121664L) : orcaColor22;
            OrcaColors.OrcaColor fromLong16 = (i11 & 4194304) != 0 ? new OrcaColors.OrcaColor.FromLong(2566914048L) : orcaColor23;
            OrcaColors.OrcaColor fromLong17 = (i11 & 8388608) != 0 ? new OrcaColors.OrcaColor.FromLong(2147483648L) : orcaColor24;
            OrcaColors.OrcaColor fromLong18 = (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? new OrcaColors.OrcaColor.FromLong(1711276032L) : orcaColor25;
            OrcaColors.OrcaColor fromLong19 = (i11 & 33554432) != 0 ? new OrcaColors.OrcaColor.FromLong(1291845632L) : orcaColor26;
            OrcaColors.OrcaColor fromLong20 = (i11 & 67108864) != 0 ? new OrcaColors.OrcaColor.FromLong(855638016L) : orcaColor27;
            OrcaColors.OrcaColor fromLong21 = (i11 & 134217728) != 0 ? new OrcaColors.OrcaColor.FromLong(436207616L) : orcaColor28;
            OrcaColors.OrcaColor fromLong22 = (i11 & 268435456) != 0 ? new OrcaColors.OrcaColor.FromLong(134217728L) : orcaColor29;
            OrcaColors.OrcaColor fromLong23 = (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? new OrcaColors.OrcaColor.FromLong(1728053247L) : orcaColor30;
            if ((i11 & 1073741824) != 0) {
                orcaColor32 = fromLong22;
                orcaColor33 = fromLong23;
                fromLong = new OrcaColors.OrcaColor.FromLong(4280693828L);
            } else {
                fromLong = orcaColor31;
                orcaColor32 = fromLong22;
                orcaColor33 = fromLong23;
            }
            this(fromInt, fromInt2, fromInt3, fromInt4, fromInt5, fromInt6, fromLong2, fromInt7, fromInt8, fromLong3, fromLong4, fromLong5, fromLong6, fromLong7, fromLong8, fromLong9, fromLong10, fromLong11, fromLong12, fromLong13, fromLong14, fromLong15, fromLong16, fromLong17, fromLong18, fromLong19, fromLong20, fromLong21, orcaColor32, orcaColor33, fromLong);
        }
    }

    public static final class b implements Zh {
        private final OrcaColors.OrcaColor A;
        private final OrcaColors.OrcaColor B;
        private final OrcaColors.OrcaColor C;
        private final OrcaColors.OrcaColor D;
        private final OrcaColors.OrcaColor E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30059h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30060i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30061j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30062k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30063l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30064m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30065n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30066o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30067p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30068q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30069r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30070s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30071t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30072u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30073v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30074w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30075x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30076y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final OrcaColors.OrcaColor f30077z;

        public b(OrcaColors.OrcaColor success, OrcaColors.OrcaColor danger, OrcaColors.OrcaColor warning, OrcaColors.OrcaColor caution, OrcaColors.OrcaColor info, OrcaColors.OrcaColor hint, OrcaColors.OrcaColor transparent, OrcaColors.OrcaColor white, OrcaColors.OrcaColor black, OrcaColors.OrcaColor dark90, OrcaColors.OrcaColor dark80, OrcaColors.OrcaColor dark70, OrcaColors.OrcaColor dark60, OrcaColors.OrcaColor dark50, OrcaColors.OrcaColor dark40, OrcaColors.OrcaColor dark30, OrcaColors.OrcaColor dark20, OrcaColors.OrcaColor dark10, OrcaColors.OrcaColor dark3, OrcaColors.OrcaColor light90, OrcaColors.OrcaColor light80, OrcaColors.OrcaColor light70, OrcaColors.OrcaColor light60, OrcaColors.OrcaColor light50, OrcaColors.OrcaColor light40, OrcaColors.OrcaColor light30, OrcaColors.OrcaColor light20, OrcaColors.OrcaColor light10, OrcaColors.OrcaColor light3, OrcaColors.OrcaColor neutral4, OrcaColors.OrcaColor neutral5) {
            p013kotlin.jvm.internal.s.k(success, "success");
            p013kotlin.jvm.internal.s.k(danger, "danger");
            p013kotlin.jvm.internal.s.k(warning, "warning");
            p013kotlin.jvm.internal.s.k(caution, "caution");
            p013kotlin.jvm.internal.s.k(info, "info");
            p013kotlin.jvm.internal.s.k(hint, "hint");
            p013kotlin.jvm.internal.s.k(transparent, "transparent");
            p013kotlin.jvm.internal.s.k(white, "white");
            p013kotlin.jvm.internal.s.k(black, "black");
            p013kotlin.jvm.internal.s.k(dark90, "dark90");
            p013kotlin.jvm.internal.s.k(dark80, "dark80");
            p013kotlin.jvm.internal.s.k(dark70, "dark70");
            p013kotlin.jvm.internal.s.k(dark60, "dark60");
            p013kotlin.jvm.internal.s.k(dark50, "dark50");
            p013kotlin.jvm.internal.s.k(dark40, "dark40");
            p013kotlin.jvm.internal.s.k(dark30, "dark30");
            p013kotlin.jvm.internal.s.k(dark20, "dark20");
            p013kotlin.jvm.internal.s.k(dark10, "dark10");
            p013kotlin.jvm.internal.s.k(dark3, "dark3");
            p013kotlin.jvm.internal.s.k(light90, "light90");
            p013kotlin.jvm.internal.s.k(light80, "light80");
            p013kotlin.jvm.internal.s.k(light70, "light70");
            p013kotlin.jvm.internal.s.k(light60, "light60");
            p013kotlin.jvm.internal.s.k(light50, "light50");
            p013kotlin.jvm.internal.s.k(light40, "light40");
            p013kotlin.jvm.internal.s.k(light30, "light30");
            p013kotlin.jvm.internal.s.k(light20, "light20");
            p013kotlin.jvm.internal.s.k(light10, "light10");
            p013kotlin.jvm.internal.s.k(light3, "light3");
            p013kotlin.jvm.internal.s.k(neutral4, "neutral4");
            p013kotlin.jvm.internal.s.k(neutral5, "neutral5");
            this.f30052a = success;
            this.f30053b = danger;
            this.f30054c = warning;
            this.f30055d = caution;
            this.f30056e = info;
            this.f30057f = hint;
            this.f30058g = transparent;
            this.f30059h = white;
            this.f30060i = black;
            this.f30061j = dark90;
            this.f30062k = dark80;
            this.f30063l = dark70;
            this.f30064m = dark60;
            this.f30065n = dark50;
            this.f30066o = dark40;
            this.f30067p = dark30;
            this.f30068q = dark20;
            this.f30069r = dark10;
            this.f30070s = dark3;
            this.f30071t = light90;
            this.f30072u = light80;
            this.f30073v = light70;
            this.f30074w = light60;
            this.f30075x = light50;
            this.f30076y = light40;
            this.f30077z = light30;
            this.A = light20;
            this.B = light10;
            this.C = light3;
            this.D = neutral4;
            this.E = neutral5;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor a() {
            return this.f30070s;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor b() {
            return this.f30069r;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor c() {
            return this.f30064m;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor d() {
            return this.D;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor e() {
            return this.f30054c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f30052a, bVar.f30052a) && p013kotlin.jvm.internal.s.f(this.f30053b, bVar.f30053b) && p013kotlin.jvm.internal.s.f(this.f30054c, bVar.f30054c) && p013kotlin.jvm.internal.s.f(this.f30055d, bVar.f30055d) && p013kotlin.jvm.internal.s.f(this.f30056e, bVar.f30056e) && p013kotlin.jvm.internal.s.f(this.f30057f, bVar.f30057f) && p013kotlin.jvm.internal.s.f(this.f30058g, bVar.f30058g) && p013kotlin.jvm.internal.s.f(this.f30059h, bVar.f30059h) && p013kotlin.jvm.internal.s.f(this.f30060i, bVar.f30060i) && p013kotlin.jvm.internal.s.f(this.f30061j, bVar.f30061j) && p013kotlin.jvm.internal.s.f(this.f30062k, bVar.f30062k) && p013kotlin.jvm.internal.s.f(this.f30063l, bVar.f30063l) && p013kotlin.jvm.internal.s.f(this.f30064m, bVar.f30064m) && p013kotlin.jvm.internal.s.f(this.f30065n, bVar.f30065n) && p013kotlin.jvm.internal.s.f(this.f30066o, bVar.f30066o) && p013kotlin.jvm.internal.s.f(this.f30067p, bVar.f30067p) && p013kotlin.jvm.internal.s.f(this.f30068q, bVar.f30068q) && p013kotlin.jvm.internal.s.f(this.f30069r, bVar.f30069r) && p013kotlin.jvm.internal.s.f(this.f30070s, bVar.f30070s) && p013kotlin.jvm.internal.s.f(this.f30071t, bVar.f30071t) && p013kotlin.jvm.internal.s.f(this.f30072u, bVar.f30072u) && p013kotlin.jvm.internal.s.f(this.f30073v, bVar.f30073v) && p013kotlin.jvm.internal.s.f(this.f30074w, bVar.f30074w) && p013kotlin.jvm.internal.s.f(this.f30075x, bVar.f30075x) && p013kotlin.jvm.internal.s.f(this.f30076y, bVar.f30076y) && p013kotlin.jvm.internal.s.f(this.f30077z, bVar.f30077z) && p013kotlin.jvm.internal.s.f(this.A, bVar.A) && p013kotlin.jvm.internal.s.f(this.B, bVar.B) && p013kotlin.jvm.internal.s.f(this.C, bVar.C) && p013kotlin.jvm.internal.s.f(this.D, bVar.D) && p013kotlin.jvm.internal.s.f(this.E, bVar.E);
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor f() {
            return this.f30068q;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor g() {
            return this.f30058g;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor h() {
            return this.f30053b;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f30052a.hashCode() * 31) + this.f30053b.hashCode()) * 31) + this.f30054c.hashCode()) * 31) + this.f30055d.hashCode()) * 31) + this.f30056e.hashCode()) * 31) + this.f30057f.hashCode()) * 31) + this.f30058g.hashCode()) * 31) + this.f30059h.hashCode()) * 31) + this.f30060i.hashCode()) * 31) + this.f30061j.hashCode()) * 31) + this.f30062k.hashCode()) * 31) + this.f30063l.hashCode()) * 31) + this.f30064m.hashCode()) * 31) + this.f30065n.hashCode()) * 31) + this.f30066o.hashCode()) * 31) + this.f30067p.hashCode()) * 31) + this.f30068q.hashCode()) * 31) + this.f30069r.hashCode()) * 31) + this.f30070s.hashCode()) * 31) + this.f30071t.hashCode()) * 31) + this.f30072u.hashCode()) * 31) + this.f30073v.hashCode()) * 31) + this.f30074w.hashCode()) * 31) + this.f30075x.hashCode()) * 31) + this.f30076y.hashCode()) * 31) + this.f30077z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode();
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor i() {
            return this.f30055d;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor j() {
            return this.f30056e;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor k() {
            return this.f30059h;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor l() {
            return this.E;
        }

        @Override // com.fourthline.orca.internal.Zh
        public OrcaColors.OrcaColor m() {
            return this.f30052a;
        }

        public String toString() {
            return "Light(success=" + this.f30052a + ", danger=" + this.f30053b + ", warning=" + this.f30054c + ", caution=" + this.f30055d + ", info=" + this.f30056e + ", hint=" + this.f30057f + ", transparent=" + this.f30058g + ", white=" + this.f30059h + ", black=" + this.f30060i + ", dark90=" + this.f30061j + ", dark80=" + this.f30062k + ", dark70=" + this.f30063l + ", dark60=" + this.f30064m + ", dark50=" + this.f30065n + ", dark40=" + this.f30066o + ", dark30=" + this.f30067p + ", dark20=" + this.f30068q + ", dark10=" + this.f30069r + ", dark3=" + this.f30070s + ", light90=" + this.f30071t + ", light80=" + this.f30072u + ", light70=" + this.f30073v + ", light60=" + this.f30074w + ", light50=" + this.f30075x + ", light40=" + this.f30076y + ", light30=" + this.f30077z + ", light20=" + this.A + ", light10=" + this.B + ", light3=" + this.C + ", neutral4=" + this.D + ", neutral5=" + this.E + ")";
        }

        public /* synthetic */ b(OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, OrcaColors.OrcaColor orcaColor4, OrcaColors.OrcaColor orcaColor5, OrcaColors.OrcaColor orcaColor6, OrcaColors.OrcaColor orcaColor7, OrcaColors.OrcaColor orcaColor8, OrcaColors.OrcaColor orcaColor9, OrcaColors.OrcaColor orcaColor10, OrcaColors.OrcaColor orcaColor11, OrcaColors.OrcaColor orcaColor12, OrcaColors.OrcaColor orcaColor13, OrcaColors.OrcaColor orcaColor14, OrcaColors.OrcaColor orcaColor15, OrcaColors.OrcaColor orcaColor16, OrcaColors.OrcaColor orcaColor17, OrcaColors.OrcaColor orcaColor18, OrcaColors.OrcaColor orcaColor19, OrcaColors.OrcaColor orcaColor20, OrcaColors.OrcaColor orcaColor21, OrcaColors.OrcaColor orcaColor22, OrcaColors.OrcaColor orcaColor23, OrcaColors.OrcaColor orcaColor24, OrcaColors.OrcaColor orcaColor25, OrcaColors.OrcaColor orcaColor26, OrcaColors.OrcaColor orcaColor27, OrcaColors.OrcaColor orcaColor28, OrcaColors.OrcaColor orcaColor29, OrcaColors.OrcaColor orcaColor30, OrcaColors.OrcaColor orcaColor31, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            OrcaColors.OrcaColor fromLong;
            OrcaColors.OrcaColor orcaColor32;
            OrcaColors.OrcaColor orcaColor33;
            OrcaColors.OrcaColor fromInt = (i11 & 1) != 0 ? new OrcaColors.OrcaColor.FromInt(57442) : orcaColor;
            OrcaColors.OrcaColor fromInt2 = (i11 & 2) != 0 ? new OrcaColors.OrcaColor.FromInt(14688288) : orcaColor2;
            OrcaColors.OrcaColor fromInt3 = (i11 & 4) != 0 ? new OrcaColors.OrcaColor.FromInt(16409600) : orcaColor3;
            OrcaColors.OrcaColor fromInt4 = (i11 & 8) != 0 ? new OrcaColors.OrcaColor.FromInt(16764672) : orcaColor4;
            OrcaColors.OrcaColor fromInt5 = (i11 & 16) != 0 ? new OrcaColors.OrcaColor.FromInt(15593213) : orcaColor5;
            OrcaColors.OrcaColor fromInt6 = (i11 & 32) != 0 ? new OrcaColors.OrcaColor.FromInt(15989247) : orcaColor6;
            OrcaColors.OrcaColor fromLong2 = (i11 & 64) != 0 ? new OrcaColors.OrcaColor.FromLong(0L) : orcaColor7;
            OrcaColors.OrcaColor fromInt7 = (i11 & 128) != 0 ? new OrcaColors.OrcaColor.FromInt(16777215) : orcaColor8;
            OrcaColors.OrcaColor fromInt8 = (i11 & 256) != 0 ? new OrcaColors.OrcaColor.FromInt(0) : orcaColor9;
            OrcaColors.OrcaColor fromLong3 = (i11 & 512) != 0 ? new OrcaColors.OrcaColor.FromLong(3858759680L) : orcaColor10;
            OrcaColors.OrcaColor fromLong4 = (i11 & 1024) != 0 ? new OrcaColors.OrcaColor.FromLong(3422552064L) : orcaColor11;
            OrcaColors.OrcaColor fromLong5 = (i11 & 2048) != 0 ? new OrcaColors.OrcaColor.FromLong(3003121664L) : orcaColor12;
            OrcaColors.OrcaColor fromLong6 = (i11 & 4096) != 0 ? new OrcaColors.OrcaColor.FromLong(2566914048L) : orcaColor13;
            OrcaColors.OrcaColor fromLong7 = (i11 & PKIFailureInfo.certRevoked) != 0 ? new OrcaColors.OrcaColor.FromLong(2147483648L) : orcaColor14;
            OrcaColors.OrcaColor fromLong8 = (i11 & 16384) != 0 ? new OrcaColors.OrcaColor.FromLong(1711276032L) : orcaColor15;
            OrcaColors.OrcaColor fromLong9 = (32768 & i11) != 0 ? new OrcaColors.OrcaColor.FromLong(1291845632L) : orcaColor16;
            OrcaColors.OrcaColor fromLong10 = (i11 & 65536) != 0 ? new OrcaColors.OrcaColor.FromLong(855638016L) : orcaColor17;
            OrcaColors.OrcaColor fromLong11 = (i11 & 131072) != 0 ? new OrcaColors.OrcaColor.FromLong(436207616L) : orcaColor18;
            OrcaColors.OrcaColor fromLong12 = (i11 & 262144) != 0 ? new OrcaColors.OrcaColor.FromLong(134217728L) : orcaColor19;
            OrcaColors.OrcaColor fromLong13 = (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? new OrcaColors.OrcaColor.FromLong(3875536895L) : orcaColor20;
            OrcaColors.OrcaColor fromLong14 = (i11 & PKIFailureInfo.badCertTemplate) != 0 ? new OrcaColors.OrcaColor.FromLong(3439329279L) : orcaColor21;
            OrcaColors.OrcaColor fromLong15 = (i11 & PKIFailureInfo.badSenderNonce) != 0 ? new OrcaColors.OrcaColor.FromLong(3019898879L) : orcaColor22;
            OrcaColors.OrcaColor fromLong16 = (i11 & 4194304) != 0 ? new OrcaColors.OrcaColor.FromLong(2583691263L) : orcaColor23;
            OrcaColors.OrcaColor fromLong17 = (i11 & 8388608) != 0 ? new OrcaColors.OrcaColor.FromLong(2164260863L) : orcaColor24;
            OrcaColors.OrcaColor fromLong18 = (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? new OrcaColors.OrcaColor.FromLong(1728053247L) : orcaColor25;
            OrcaColors.OrcaColor fromLong19 = (i11 & 33554432) != 0 ? new OrcaColors.OrcaColor.FromLong(1308622847L) : orcaColor26;
            OrcaColors.OrcaColor fromLong20 = (i11 & 67108864) != 0 ? new OrcaColors.OrcaColor.FromLong(872415231L) : orcaColor27;
            OrcaColors.OrcaColor fromLong21 = (i11 & 134217728) != 0 ? new OrcaColors.OrcaColor.FromLong(452984831L) : orcaColor28;
            OrcaColors.OrcaColor fromLong22 = (i11 & 268435456) != 0 ? new OrcaColors.OrcaColor.FromLong(150994943L) : orcaColor29;
            OrcaColors.OrcaColor fromLong23 = (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? new OrcaColors.OrcaColor.FromLong(4289967027L) : orcaColor30;
            if ((i11 & 1073741824) != 0) {
                orcaColor32 = fromLong22;
                orcaColor33 = fromLong23;
                fromLong = new OrcaColors.OrcaColor.FromLong(4292269782L);
            } else {
                fromLong = orcaColor31;
                orcaColor32 = fromLong22;
                orcaColor33 = fromLong23;
            }
            this(fromInt, fromInt2, fromInt3, fromInt4, fromInt5, fromInt6, fromLong2, fromInt7, fromInt8, fromLong3, fromLong4, fromLong5, fromLong6, fromLong7, fromLong8, fromLong9, fromLong10, fromLong11, fromLong12, fromLong13, fromLong14, fromLong15, fromLong16, fromLong17, fromLong18, fromLong19, fromLong20, fromLong21, orcaColor32, orcaColor33, fromLong);
        }
    }
}
