package com.google.android.exoplayer2;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import com.google.android.exoplayer2.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.DebugKt;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class u0 implements g {
    private static final u0 I = new b().G();
    private static final String J = ts.p0.t0(0);
    private static final String K = ts.p0.t0(1);
    private static final String L = ts.p0.t0(2);
    private static final String M = ts.p0.t0(3);
    private static final String N = ts.p0.t0(4);
    private static final String O = ts.p0.t0(5);
    private static final String P = ts.p0.t0(6);
    private static final String Q = ts.p0.t0(7);
    private static final String R = ts.p0.t0(8);
    private static final String S = ts.p0.t0(9);
    private static final String T = ts.p0.t0(10);
    private static final String U = ts.p0.t0(11);
    private static final String V = ts.p0.t0(12);
    private static final String W = ts.p0.t0(13);
    private static final String X = ts.p0.t0(14);
    private static final String Y = ts.p0.t0(15);
    private static final String Z = ts.p0.t0(16);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f40685a0 = ts.p0.t0(17);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f40686b0 = ts.p0.t0(18);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f40687c0 = ts.p0.t0(19);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f40688d0 = ts.p0.t0(20);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String f40689e0 = ts.p0.t0(21);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final String f40690f0 = ts.p0.t0(22);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final String f40691g0 = ts.p0.t0(23);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final String f40692h0 = ts.p0.t0(24);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final String f40693i0 = ts.p0.t0(25);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final String f40694j0 = ts.p0.t0(26);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final String f40695k0 = ts.p0.t0(27);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final String f40696l0 = ts.p0.t0(28);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final String f40697m0 = ts.p0.t0(29);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final String f40698n0 = ts.p0.t0(30);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final String f40699o0 = ts.p0.t0(31);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g.a<u0> f40700p0 = new g.a() { // from class: br.q
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return u0.e(bundle);
        }
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    private int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f40707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f40708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f40709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ur.a f40710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f40711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f40712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f40713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<byte[]> f40714n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.h f40715o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f40716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f40717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f40718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f40719s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f40720t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f40721u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f40722v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f40723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final us.c f40724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f40725y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f40726z;

    public static final class b {
        private int A;
        private int B;
        private int C;
        private int D;
        private int E;
        private int F;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f40727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f40728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f40729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f40730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f40731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f40732f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f40733g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f40734h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ur.a f40735i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f40736j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f40737k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f40738l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<byte[]> f40739m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private com.google.android.exoplayer2.drm.h f40740n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f40741o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f40742p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f40743q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f40744r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f40745s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private float f40746t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private byte[] f40747u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f40748v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private us.c f40749w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f40750x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f40751y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f40752z;

        public u0 G() {
            return new u0(this);
        }

        public b H(int i11) {
            this.C = i11;
            return this;
        }

        public b I(int i11) {
            this.f40732f = i11;
            return this;
        }

        public b J(int i11) {
            this.f40750x = i11;
            return this;
        }

        public b K(String str) {
            this.f40734h = str;
            return this;
        }

        public b L(us.c cVar) {
            this.f40749w = cVar;
            return this;
        }

        public b M(String str) {
            this.f40736j = str;
            return this;
        }

        public b N(int i11) {
            this.F = i11;
            return this;
        }

        public b O(com.google.android.exoplayer2.drm.h hVar) {
            this.f40740n = hVar;
            return this;
        }

        public b P(int i11) {
            this.A = i11;
            return this;
        }

        public b Q(int i11) {
            this.B = i11;
            return this;
        }

        public b R(float f11) {
            this.f40744r = f11;
            return this;
        }

        public b S(int i11) {
            this.f40743q = i11;
            return this;
        }

        public b T(int i11) {
            this.f40727a = Integer.toString(i11);
            return this;
        }

        public b U(String str) {
            this.f40727a = str;
            return this;
        }

        public b V(List<byte[]> list) {
            this.f40739m = list;
            return this;
        }

        public b W(String str) {
            this.f40728b = str;
            return this;
        }

        public b X(String str) {
            this.f40729c = str;
            return this;
        }

        public b Y(int i11) {
            this.f40738l = i11;
            return this;
        }

        public b Z(ur.a aVar) {
            this.f40735i = aVar;
            return this;
        }

        public b a0(int i11) {
            this.f40752z = i11;
            return this;
        }

        public b b0(int i11) {
            this.f40733g = i11;
            return this;
        }

        public b c0(float f11) {
            this.f40746t = f11;
            return this;
        }

        public b d0(byte[] bArr) {
            this.f40747u = bArr;
            return this;
        }

        public b e0(int i11) {
            this.f40731e = i11;
            return this;
        }

        public b f0(int i11) {
            this.f40745s = i11;
            return this;
        }

        public b g0(String str) {
            this.f40737k = str;
            return this;
        }

        public b h0(int i11) {
            this.f40751y = i11;
            return this;
        }

        public b i0(int i11) {
            this.f40730d = i11;
            return this;
        }

        public b j0(int i11) {
            this.f40748v = i11;
            return this;
        }

        public b k0(long j11) {
            this.f40741o = j11;
            return this;
        }

        public b l0(int i11) {
            this.D = i11;
            return this;
        }

        public b m0(int i11) {
            this.E = i11;
            return this;
        }

        public b n0(int i11) {
            this.f40742p = i11;
            return this;
        }

        public b() {
            this.f40732f = -1;
            this.f40733g = -1;
            this.f40738l = -1;
            this.f40741o = Long.MAX_VALUE;
            this.f40742p = -1;
            this.f40743q = -1;
            this.f40744r = -1.0f;
            this.f40746t = 1.0f;
            this.f40748v = -1;
            this.f40750x = -1;
            this.f40751y = -1;
            this.f40752z = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = 0;
        }

        private b(u0 u0Var) {
            this.f40727a = u0Var.f40701a;
            this.f40728b = u0Var.f40702b;
            this.f40729c = u0Var.f40703c;
            this.f40730d = u0Var.f40704d;
            this.f40731e = u0Var.f40705e;
            this.f40732f = u0Var.f40706f;
            this.f40733g = u0Var.f40707g;
            this.f40734h = u0Var.f40709i;
            this.f40735i = u0Var.f40710j;
            this.f40736j = u0Var.f40711k;
            this.f40737k = u0Var.f40712l;
            this.f40738l = u0Var.f40713m;
            this.f40739m = u0Var.f40714n;
            this.f40740n = u0Var.f40715o;
            this.f40741o = u0Var.f40716p;
            this.f40742p = u0Var.f40717q;
            this.f40743q = u0Var.f40718r;
            this.f40744r = u0Var.f40719s;
            this.f40745s = u0Var.f40720t;
            this.f40746t = u0Var.f40721u;
            this.f40747u = u0Var.f40722v;
            this.f40748v = u0Var.f40723w;
            this.f40749w = u0Var.f40724x;
            this.f40750x = u0Var.f40725y;
            this.f40751y = u0Var.f40726z;
            this.f40752z = u0Var.A;
            this.A = u0Var.B;
            this.B = u0Var.C;
            this.C = u0Var.D;
            this.D = u0Var.E;
            this.E = u0Var.F;
            this.F = u0Var.G;
        }
    }

    private static <T> T d(T t11, T t12) {
        return t11 != null ? t11 : t12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u0 e(Bundle bundle) {
        b bVar = new b();
        ts.c.c(bundle);
        String string = bundle.getString(J);
        u0 u0Var = I;
        bVar.U((String) d(string, u0Var.f40701a)).W((String) d(bundle.getString(K), u0Var.f40702b)).X((String) d(bundle.getString(L), u0Var.f40703c)).i0(bundle.getInt(M, u0Var.f40704d)).e0(bundle.getInt(N, u0Var.f40705e)).I(bundle.getInt(O, u0Var.f40706f)).b0(bundle.getInt(P, u0Var.f40707g)).K((String) d(bundle.getString(Q), u0Var.f40709i)).Z((ur.a) d((ur.a) bundle.getParcelable(R), u0Var.f40710j)).M((String) d(bundle.getString(S), u0Var.f40711k)).g0((String) d(bundle.getString(T), u0Var.f40712l)).Y(bundle.getInt(U, u0Var.f40713m));
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(h(i11));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i11++;
        }
        b bVarO = bVar.V(arrayList).O((com.google.android.exoplayer2.drm.h) bundle.getParcelable(W));
        String str = X;
        u0 u0Var2 = I;
        bVarO.k0(bundle.getLong(str, u0Var2.f40716p)).n0(bundle.getInt(Y, u0Var2.f40717q)).S(bundle.getInt(Z, u0Var2.f40718r)).R(bundle.getFloat(f40685a0, u0Var2.f40719s)).f0(bundle.getInt(f40686b0, u0Var2.f40720t)).c0(bundle.getFloat(f40687c0, u0Var2.f40721u)).d0(bundle.getByteArray(f40688d0)).j0(bundle.getInt(f40689e0, u0Var2.f40723w));
        Bundle bundle2 = bundle.getBundle(f40690f0);
        if (bundle2 != null) {
            bVar.L((us.c) us.c.f116542l.a(bundle2));
        }
        bVar.J(bundle.getInt(f40691g0, u0Var2.f40725y)).h0(bundle.getInt(f40692h0, u0Var2.f40726z)).a0(bundle.getInt(f40693i0, u0Var2.A)).P(bundle.getInt(f40694j0, u0Var2.B)).Q(bundle.getInt(f40695k0, u0Var2.C)).H(bundle.getInt(f40696l0, u0Var2.D)).l0(bundle.getInt(f40698n0, u0Var2.E)).m0(bundle.getInt(f40699o0, u0Var2.F)).N(bundle.getInt(f40697m0, u0Var2.G));
        return bVar.G();
    }

    private static String h(int i11) {
        return V + "_" + Integer.toString(i11, 36);
    }

    public static String j(u0 u0Var) {
        if (u0Var == null) {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(u0Var.f40701a);
        sb2.append(", mimeType=");
        sb2.append(u0Var.f40712l);
        if (u0Var.f40708h != -1) {
            sb2.append(", bitrate=");
            sb2.append(u0Var.f40708h);
        }
        if (u0Var.f40709i != null) {
            sb2.append(", codecs=");
            sb2.append(u0Var.f40709i);
        }
        if (u0Var.f40715o != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i11 = 0;
            while (true) {
                com.google.android.exoplayer2.drm.h hVar = u0Var.f40715o;
                if (i11 >= hVar.f39823d) {
                    break;
                }
                UUID uuid = hVar.c(i11).f39825b;
                if (uuid.equals(br.d.f17903b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(br.d.f17904c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(br.d.f17906e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(br.d.f17905d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(br.d.f17902a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i11++;
            }
            sb2.append(", drm=[");
            ou.i.f(CoreConstants.COMMA_CHAR).b(sb2, linkedHashSet);
            sb2.append(']');
        }
        if (u0Var.f40717q != -1 && u0Var.f40718r != -1) {
            sb2.append(", res=");
            sb2.append(u0Var.f40717q);
            sb2.append("x");
            sb2.append(u0Var.f40718r);
        }
        us.c cVar = u0Var.f40724x;
        if (cVar != null && cVar.g()) {
            sb2.append(", color=");
            sb2.append(u0Var.f40724x.j());
        }
        if (u0Var.f40719s != -1.0f) {
            sb2.append(", fps=");
            sb2.append(u0Var.f40719s);
        }
        if (u0Var.f40725y != -1) {
            sb2.append(", channels=");
            sb2.append(u0Var.f40725y);
        }
        if (u0Var.f40726z != -1) {
            sb2.append(", sample_rate=");
            sb2.append(u0Var.f40726z);
        }
        if (u0Var.f40703c != null) {
            sb2.append(", language=");
            sb2.append(u0Var.f40703c);
        }
        if (u0Var.f40702b != null) {
            sb2.append(", label=");
            sb2.append(u0Var.f40702b);
        }
        if (u0Var.f40704d != 0) {
            ArrayList arrayList = new ArrayList();
            if ((u0Var.f40704d & 4) != 0) {
                arrayList.add(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            }
            if ((u0Var.f40704d & 1) != 0) {
                arrayList.add("default");
            }
            if ((u0Var.f40704d & 2) != 0) {
                arrayList.add("forced");
            }
            sb2.append(", selectionFlags=[");
            ou.i.f(CoreConstants.COMMA_CHAR).b(sb2, arrayList);
            sb2.append("]");
        }
        if (u0Var.f40705e != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((u0Var.f40705e & 1) != 0) {
                arrayList2.add("main");
            }
            if ((u0Var.f40705e & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((u0Var.f40705e & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((u0Var.f40705e & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((u0Var.f40705e & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((u0Var.f40705e & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((u0Var.f40705e & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((u0Var.f40705e & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((u0Var.f40705e & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((u0Var.f40705e & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((u0Var.f40705e & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((u0Var.f40705e & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((u0Var.f40705e & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((u0Var.f40705e & PKIFailureInfo.certRevoked) != 0) {
                arrayList2.add("easy-read");
            }
            if ((u0Var.f40705e & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sb2.append(", roleFlags=[");
            ou.i.f(CoreConstants.COMMA_CHAR).b(sb2, arrayList2);
            sb2.append("]");
        }
        return sb2.toString();
    }

    public b b() {
        return new b();
    }

    public u0 c(int i11) {
        return b().N(i11).G();
    }

    public boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            int i12 = this.H;
            if ((i12 == 0 || (i11 = u0Var.H) == 0 || i12 == i11) && this.f40704d == u0Var.f40704d && this.f40705e == u0Var.f40705e && this.f40706f == u0Var.f40706f && this.f40707g == u0Var.f40707g && this.f40713m == u0Var.f40713m && this.f40716p == u0Var.f40716p && this.f40717q == u0Var.f40717q && this.f40718r == u0Var.f40718r && this.f40720t == u0Var.f40720t && this.f40723w == u0Var.f40723w && this.f40725y == u0Var.f40725y && this.f40726z == u0Var.f40726z && this.A == u0Var.A && this.B == u0Var.B && this.C == u0Var.C && this.D == u0Var.D && this.E == u0Var.E && this.F == u0Var.F && this.G == u0Var.G && Float.compare(this.f40719s, u0Var.f40719s) == 0 && Float.compare(this.f40721u, u0Var.f40721u) == 0 && ts.p0.c(this.f40701a, u0Var.f40701a) && ts.p0.c(this.f40702b, u0Var.f40702b) && ts.p0.c(this.f40709i, u0Var.f40709i) && ts.p0.c(this.f40711k, u0Var.f40711k) && ts.p0.c(this.f40712l, u0Var.f40712l) && ts.p0.c(this.f40703c, u0Var.f40703c) && Arrays.equals(this.f40722v, u0Var.f40722v) && ts.p0.c(this.f40710j, u0Var.f40710j) && ts.p0.c(this.f40724x, u0Var.f40724x) && ts.p0.c(this.f40715o, u0Var.f40715o) && g(u0Var)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        int i11;
        int i12 = this.f40717q;
        if (i12 == -1 || (i11 = this.f40718r) == -1) {
            return -1;
        }
        return i12 * i11;
    }

    public boolean g(u0 u0Var) {
        if (this.f40714n.size() != u0Var.f40714n.size()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f40714n.size(); i11++) {
            if (!Arrays.equals(this.f40714n.get(i11), u0Var.f40714n.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.H == 0) {
            String str = this.f40701a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f40702b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f40703c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f40704d) * 31) + this.f40705e) * 31) + this.f40706f) * 31) + this.f40707g) * 31;
            String str4 = this.f40709i;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ur.a aVar = this.f40710j;
            int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.f40711k;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f40712l;
            this.H = ((((((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f40713m) * 31) + ((int) this.f40716p)) * 31) + this.f40717q) * 31) + this.f40718r) * 31) + Float.floatToIntBits(this.f40719s)) * 31) + this.f40720t) * 31) + Float.floatToIntBits(this.f40721u)) * 31) + this.f40723w) * 31) + this.f40725y) * 31) + this.f40726z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G;
        }
        return this.H;
    }

    public Bundle i(boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putString(J, this.f40701a);
        bundle.putString(K, this.f40702b);
        bundle.putString(L, this.f40703c);
        bundle.putInt(M, this.f40704d);
        bundle.putInt(N, this.f40705e);
        bundle.putInt(O, this.f40706f);
        bundle.putInt(P, this.f40707g);
        bundle.putString(Q, this.f40709i);
        if (!z11) {
            bundle.putParcelable(R, this.f40710j);
        }
        bundle.putString(S, this.f40711k);
        bundle.putString(T, this.f40712l);
        bundle.putInt(U, this.f40713m);
        for (int i11 = 0; i11 < this.f40714n.size(); i11++) {
            bundle.putByteArray(h(i11), this.f40714n.get(i11));
        }
        bundle.putParcelable(W, this.f40715o);
        bundle.putLong(X, this.f40716p);
        bundle.putInt(Y, this.f40717q);
        bundle.putInt(Z, this.f40718r);
        bundle.putFloat(f40685a0, this.f40719s);
        bundle.putInt(f40686b0, this.f40720t);
        bundle.putFloat(f40687c0, this.f40721u);
        bundle.putByteArray(f40688d0, this.f40722v);
        bundle.putInt(f40689e0, this.f40723w);
        us.c cVar = this.f40724x;
        if (cVar != null) {
            bundle.putBundle(f40690f0, cVar.toBundle());
        }
        bundle.putInt(f40691g0, this.f40725y);
        bundle.putInt(f40692h0, this.f40726z);
        bundle.putInt(f40693i0, this.A);
        bundle.putInt(f40694j0, this.B);
        bundle.putInt(f40695k0, this.C);
        bundle.putInt(f40696l0, this.D);
        bundle.putInt(f40698n0, this.E);
        bundle.putInt(f40699o0, this.F);
        bundle.putInt(f40697m0, this.G);
        return bundle;
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        return i(false);
    }

    public String toString() {
        return "Format(" + this.f40701a + ", " + this.f40702b + ", " + this.f40711k + ", " + this.f40712l + ", " + this.f40709i + ", " + this.f40708h + ", " + this.f40703c + ", [" + this.f40717q + ", " + this.f40718r + ", " + this.f40719s + ", " + this.f40724x + "], [" + this.f40725y + ", " + this.f40726z + "])";
    }

    private u0(b bVar) {
        this.f40701a = bVar.f40727a;
        this.f40702b = bVar.f40728b;
        this.f40703c = ts.p0.F0(bVar.f40729c);
        this.f40704d = bVar.f40730d;
        this.f40705e = bVar.f40731e;
        int i11 = bVar.f40732f;
        this.f40706f = i11;
        int i12 = bVar.f40733g;
        this.f40707g = i12;
        this.f40708h = i12 != -1 ? i12 : i11;
        this.f40709i = bVar.f40734h;
        this.f40710j = bVar.f40735i;
        this.f40711k = bVar.f40736j;
        this.f40712l = bVar.f40737k;
        this.f40713m = bVar.f40738l;
        this.f40714n = bVar.f40739m == null ? Collections.EMPTY_LIST : bVar.f40739m;
        com.google.android.exoplayer2.drm.h hVar = bVar.f40740n;
        this.f40715o = hVar;
        this.f40716p = bVar.f40741o;
        this.f40717q = bVar.f40742p;
        this.f40718r = bVar.f40743q;
        this.f40719s = bVar.f40744r;
        this.f40720t = bVar.f40745s == -1 ? 0 : bVar.f40745s;
        this.f40721u = bVar.f40746t == -1.0f ? 1.0f : bVar.f40746t;
        this.f40722v = bVar.f40747u;
        this.f40723w = bVar.f40748v;
        this.f40724x = bVar.f40749w;
        this.f40725y = bVar.f40750x;
        this.f40726z = bVar.f40751y;
        this.A = bVar.f40752z;
        this.B = bVar.A == -1 ? 0 : bVar.A;
        this.C = bVar.B != -1 ? bVar.B : 0;
        this.D = bVar.C;
        this.E = bVar.D;
        this.F = bVar.E;
        if (bVar.F != 0 || hVar == null) {
            this.G = bVar.F;
        } else {
            this.G = 1;
        }
    }
}
