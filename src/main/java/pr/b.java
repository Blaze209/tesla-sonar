package pr;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.u0;
import com.google.common.collect.x;
import com.plaid.internal.EnumC4419g;
import hr.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ts.d0;
import ts.p0;
import ts.u;
import ts.y;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f103751a = p0.l0("OpusHead");

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f103752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f103753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f103754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f103755d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f103756e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final d0 f103757f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final d0 f103758g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f103759h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f103760i;

        public a(d0 d0Var, d0 d0Var2, boolean z11) throws ParserException {
            this.f103758g = d0Var;
            this.f103757f = d0Var2;
            this.f103756e = z11;
            d0Var2.U(12);
            this.f103752a = d0Var2.L();
            d0Var.U(12);
            this.f103760i = d0Var.L();
            hr.n.a(d0Var.q() == 1, "first_chunk must be 1");
            this.f103753b = -1;
        }

        public boolean a() {
            int i11 = this.f103753b + 1;
            this.f103753b = i11;
            if (i11 == this.f103752a) {
                return false;
            }
            this.f103755d = this.f103756e ? this.f103757f.M() : this.f103757f.J();
            if (this.f103753b == this.f103759h) {
                this.f103754c = this.f103758g.L();
                this.f103758g.V(4);
                int i12 = this.f103760i - 1;
                this.f103760i = i12;
                this.f103759h = i12 > 0 ? this.f103758g.L() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: pr.b$b, reason: collision with other inner class name */
    private static final class C2200b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f103761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f103762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f103763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f103764d;

        public C2200b(String str, byte[] bArr, long j11, long j12) {
            this.f103761a = str;
            this.f103762b = bArr;
            this.f103763c = j11;
            this.f103764d = j12;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ur.a f103765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f103766b;

        public c(ur.a aVar, long j11) {
            this.f103765a = aVar;
            this.f103766b = j11;
        }
    }

    private interface d {
        int a();

        int b();

        int c();
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p[] f103767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u0 f103768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f103769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f103770d = 0;

        public e(int i11) {
            this.f103767a = new p[i11];
        }
    }

    static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f103771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f103772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d0 f103773c;

        public f(pr.a.b bVar, u0 u0Var) {
            d0 d0Var = bVar.f103750b;
            this.f103773c = d0Var;
            d0Var.U(12);
            int iL = d0Var.L();
            if ("audio/raw".equals(u0Var.f40712l)) {
                int iC0 = p0.c0(u0Var.A, u0Var.f40725y);
                if (iL == 0 || iL % iC0 != 0) {
                    u.i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iC0 + ", stsz sample size: " + iL);
                    iL = iC0;
                }
            }
            this.f103771a = iL == 0 ? -1 : iL;
            this.f103772b = d0Var.L();
        }

        @Override // pr.b.d
        public int a() {
            int i11 = this.f103771a;
            return i11 == -1 ? this.f103773c.L() : i11;
        }

        @Override // pr.b.d
        public int b() {
            return this.f103772b;
        }

        @Override // pr.b.d
        public int c() {
            return this.f103771a;
        }
    }

    static final class g implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0 f103774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f103775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f103776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f103777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f103778e;

        public g(pr.a.b bVar) {
            d0 d0Var = bVar.f103750b;
            this.f103774a = d0Var;
            d0Var.U(12);
            this.f103776c = d0Var.L() & 255;
            this.f103775b = d0Var.L();
        }

        @Override // pr.b.d
        public int a() {
            int i11 = this.f103776c;
            if (i11 == 8) {
                return this.f103774a.H();
            }
            if (i11 == 16) {
                return this.f103774a.N();
            }
            int i12 = this.f103777d;
            this.f103777d = i12 + 1;
            if (i12 % 2 != 0) {
                return this.f103778e & 15;
            }
            int iH = this.f103774a.H();
            this.f103778e = iH;
            return (iH & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
        }

        @Override // pr.b.d
        public int b() {
            return this.f103775b;
        }

        @Override // pr.b.d
        public int c() {
            return -1;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f103779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f103780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f103781c;

        public h(int i11, long j11, int i12) {
            this.f103779a = i11;
            this.f103780b = j11;
            this.f103781c = i12;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ur.a f103782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ur.a f103783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ur.a f103784c;

        public i(ur.a aVar, ur.a aVar2, ur.a aVar3) {
            this.f103782a = aVar;
            this.f103783b = aVar2;
            this.f103784c = aVar3;
        }
    }

    private static o A(pr.a.C2199a c2199a, pr.a.b bVar, long j11, com.google.android.exoplayer2.drm.h hVar, boolean z11, boolean z12) throws ParserException {
        long[] jArr;
        long[] jArr2;
        pr.a.C2199a c2199aF;
        Pair<long[], long[]> pairI;
        pr.a.C2199a c2199a2 = (pr.a.C2199a) ts.a.e(c2199a.f(1835297121));
        int iE = e(l(((pr.a.b) ts.a.e(c2199a2.g(1751411826))).f103750b));
        if (iE == -1) {
            return null;
        }
        h hVarZ = z(((pr.a.b) ts.a.e(c2199a.g(1953196132))).f103750b);
        long j12 = j11 == -9223372036854775807L ? hVarZ.f103780b : j11;
        long j13 = q(bVar.f103750b).f103766b;
        long jM0 = j12 != -9223372036854775807L ? p0.M0(j12, 1000000L, j13) : -9223372036854775807L;
        pr.a.C2199a c2199a3 = (pr.a.C2199a) ts.a.e(((pr.a.C2199a) ts.a.e(c2199a2.f(1835626086))).f(1937007212));
        Pair<Long, String> pairN = n(((pr.a.b) ts.a.e(c2199a2.g(1835296868))).f103750b);
        pr.a.b bVarG = c2199a3.g(1937011556);
        if (bVarG == null) {
            throw ParserException.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        e eVarX = x(bVarG.f103750b, hVarZ.f103779a, hVarZ.f103781c, (String) pairN.second, hVar, z12);
        if (z11 || (c2199aF = c2199a.f(1701082227)) == null || (pairI = i(c2199aF)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairI.first;
            jArr2 = (long[]) pairI.second;
            jArr = jArr3;
        }
        if (eVarX.f103768b == null) {
            return null;
        }
        return new o(hVarZ.f103779a, iE, ((Long) pairN.first).longValue(), j13, jM0, eVarX.f103768b, eVarX.f103770d, eVarX.f103767a, eVarX.f103769c, jArr, jArr2);
    }

    public static List<r> B(pr.a.C2199a c2199a, v vVar, long j11, com.google.android.exoplayer2.drm.h hVar, boolean z11, boolean z12, ou.h<o, o> hVar2) {
        o oVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < c2199a.f103749d.size(); i11++) {
            pr.a.C2199a c2199a2 = c2199a.f103749d.get(i11);
            if (c2199a2.f103746a == 1953653099 && (oVarApply = hVar2.apply(A(c2199a2, (pr.a.b) ts.a.e(c2199a.g(1836476516)), j11, hVar, z11, z12))) != null) {
                arrayList.add(w(oVarApply, (pr.a.C2199a) ts.a.e(((pr.a.C2199a) ts.a.e(((pr.a.C2199a) ts.a.e(c2199a2.f(1835297121))).f(1835626086))).f(1937007212)), vVar));
            }
        }
        return arrayList;
    }

    public static i C(pr.a.b bVar) {
        d0 d0Var = bVar.f103750b;
        d0Var.U(8);
        ur.a aVarD = null;
        ur.a aVarV = null;
        ur.a aVarF = null;
        while (d0Var.a() >= 8) {
            int iF = d0Var.f();
            int iQ = d0Var.q();
            int iQ2 = d0Var.q();
            if (iQ2 == 1835365473) {
                d0Var.U(iF);
                aVarD = D(d0Var, iF + iQ);
            } else if (iQ2 == 1936553057) {
                d0Var.U(iF);
                aVarV = v(d0Var, iF + iQ);
            } else if (iQ2 == -1451722374) {
                aVarF = F(d0Var);
            }
            d0Var.U(iF + iQ);
        }
        return new i(aVarD, aVarV, aVarF);
    }

    private static ur.a D(d0 d0Var, int i11) {
        d0Var.V(8);
        f(d0Var);
        while (d0Var.f() < i11) {
            int iF = d0Var.f();
            int iQ = d0Var.q();
            if (d0Var.q() == 1768715124) {
                d0Var.U(iF);
                return m(d0Var, iF + iQ);
            }
            d0Var.U(iF + iQ);
        }
        return null;
    }

    private static void E(d0 d0Var, int i11, int i12, int i13, int i14, int i15, com.google.android.exoplayer2.drm.h hVar, e eVar, int i16) throws ParserException {
        String str;
        int i17;
        float f11;
        List<byte[]> list;
        int i18;
        int i19;
        String str2;
        int i21;
        int i22;
        int i23;
        String str3;
        int i24 = i12;
        int i25 = i13;
        com.google.android.exoplayer2.drm.h hVarB = hVar;
        e eVar2 = eVar;
        d0Var.U(i24 + 16);
        d0Var.V(16);
        int iN = d0Var.N();
        int iN2 = d0Var.N();
        d0Var.V(50);
        int iF = d0Var.f();
        int iIntValue = i11;
        if (iIntValue == 1701733238) {
            Pair<Integer, p> pairT = t(d0Var, i24, i25);
            if (pairT != null) {
                iIntValue = ((Integer) pairT.first).intValue();
                hVarB = hVarB == null ? null : hVarB.b(((p) pairT.second).f103892b);
                eVar2.f103767a[i16] = (p) pairT.second;
            }
            d0Var.U(iF);
        }
        String str4 = "video/3gpp";
        if (iIntValue == 1831958048) {
            str = "video/mpeg";
        } else {
            str = iIntValue == 1211250227 ? "video/3gpp" : null;
        }
        float fR = 1.0f;
        String str5 = null;
        List<byte[]> listS = null;
        byte[] bArrS = null;
        int i26 = -1;
        int iH = -1;
        int i27 = -1;
        int i28 = -1;
        ByteBuffer byteBufferA = null;
        C2200b c2200bJ = null;
        boolean z11 = false;
        while (iF - i24 < i25) {
            d0Var.U(iF);
            int iF2 = d0Var.f();
            int iQ = d0Var.q();
            if (iQ == 0 && d0Var.f() - i12 == i25) {
                break;
            }
            hr.n.a(iQ > 0, "childAtomSize must be positive");
            int iQ2 = d0Var.q();
            if (iQ2 == 1635148611) {
                hr.n.a(str == null, null);
                d0Var.U(iF2 + 8);
                us.a aVarB = us.a.b(d0Var);
                listS = aVarB.f116527a;
                eVar2.f103769c = aVarB.f116528b;
                if (!z11) {
                    fR = aVarB.f116534h;
                }
                str5 = aVarB.f116535i;
                i21 = aVarB.f116531e;
                i22 = aVarB.f116532f;
                i23 = aVarB.f116533g;
                str3 = "video/avc";
            } else {
                if (iQ2 == 1752589123) {
                    hr.n.a(str == null, null);
                    d0Var.U(iF2 + 8);
                    us.f fVarA = us.f.a(d0Var);
                    listS = fVarA.f116569a;
                    eVar2.f103769c = fVarA.f116570b;
                    if (!z11) {
                        fR = fVarA.f116576h;
                    }
                    str5 = fVarA.f116577i;
                    i21 = fVarA.f116573e;
                    i22 = fVarA.f116574f;
                    i23 = fVarA.f116575g;
                    str3 = "video/hevc";
                } else {
                    if (iQ2 == 1685480259 || iQ2 == 1685485123) {
                        hVarB = hVarB;
                        i17 = iF;
                        iIntValue = iIntValue;
                        str4 = str4;
                        f11 = fR;
                        list = listS;
                        i18 = iH;
                        i19 = i28;
                        us.d dVarA = us.d.a(d0Var);
                        if (dVarA != null) {
                            str5 = dVarA.f116554c;
                            str = "video/dolby-vision";
                        }
                    } else {
                        i17 = iF;
                        if (iQ2 == 1987076931) {
                            hr.n.a(str == null, null);
                            str2 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                            d0Var.U(iF2 + 12);
                            d0Var.V(2);
                            boolean z12 = (d0Var.H() & 1) != 0;
                            int iH2 = d0Var.H();
                            int iH3 = d0Var.H();
                            iH = us.c.h(iH2);
                            i27 = z12 ? 1 : 2;
                            i28 = us.c.i(iH3);
                        } else if (iQ2 == 1635135811) {
                            hr.n.a(str == null, null);
                            str2 = "video/av01";
                        } else if (iQ2 == 1668050025) {
                            if (byteBufferA == null) {
                                byteBufferA = a();
                            }
                            ByteBuffer byteBuffer = byteBufferA;
                            byteBuffer.position(21);
                            byteBuffer.putShort(d0Var.D());
                            byteBuffer.putShort(d0Var.D());
                            byteBufferA = byteBuffer;
                        } else if (iQ2 == 1835295606) {
                            if (byteBufferA == null) {
                                byteBufferA = a();
                            }
                            ByteBuffer byteBuffer2 = byteBufferA;
                            short sD = d0Var.D();
                            short sD2 = d0Var.D();
                            short sD3 = d0Var.D();
                            short sD4 = d0Var.D();
                            short sD5 = d0Var.D();
                            short sD6 = d0Var.D();
                            short sD7 = d0Var.D();
                            List<byte[]> list2 = listS;
                            short sD8 = d0Var.D();
                            long J = d0Var.J();
                            long J2 = d0Var.J();
                            byteBuffer2.position(1);
                            byteBuffer2.putShort(sD5);
                            byteBuffer2.putShort(sD6);
                            byteBuffer2.putShort(sD);
                            byteBuffer2.putShort(sD2);
                            byteBuffer2.putShort(sD3);
                            byteBuffer2.putShort(sD4);
                            byteBuffer2.putShort(sD7);
                            byteBuffer2.putShort(sD8);
                            byteBuffer2.putShort((short) (J / 10000));
                            byteBuffer2.putShort((short) (J2 / 10000));
                            byteBufferA = byteBuffer2;
                            listS = list2;
                            fR = fR;
                        } else {
                            hVarB = hVarB;
                            iIntValue = iIntValue;
                            str4 = str4;
                            f11 = fR;
                            list = listS;
                            if (iQ2 == 1681012275) {
                                hr.n.a(str == null, null);
                                str = str4;
                            } else if (iQ2 == 1702061171) {
                                hr.n.a(str == null, null);
                                c2200bJ = j(d0Var, iF2);
                                String str6 = c2200bJ.f103761a;
                                byte[] bArr = c2200bJ.f103762b;
                                listS = bArr != null ? x.s(bArr) : list;
                                str = str6;
                                fR = f11;
                            } else if (iQ2 == 1885434736) {
                                fR = r(d0Var, iF2);
                                listS = list;
                                z11 = true;
                            } else if (iQ2 == 1937126244) {
                                bArrS = s(d0Var, iF2, iQ);
                            } else if (iQ2 == 1936995172) {
                                int iH4 = d0Var.H();
                                d0Var.V(3);
                                if (iH4 == 0) {
                                    int iH5 = d0Var.H();
                                    if (iH5 == 0) {
                                        i26 = 0;
                                    } else if (iH5 == 1) {
                                        i26 = 1;
                                    } else if (iH5 == 2) {
                                        i26 = 2;
                                    } else if (iH5 == 3) {
                                        i26 = 3;
                                    }
                                }
                            } else {
                                i18 = iH;
                                if (iQ2 == 1668246642) {
                                    i19 = i28;
                                    if (i18 == -1 && i19 == -1) {
                                        int iQ3 = d0Var.q();
                                        if (iQ3 == 1852009592 || iQ3 == 1852009571) {
                                            int iN3 = d0Var.N();
                                            int iN4 = d0Var.N();
                                            d0Var.V(2);
                                            boolean z13 = iQ == 19 && (d0Var.H() & 128) != 0;
                                            iH = us.c.h(iN3);
                                            i27 = z13 ? 1 : 2;
                                            i28 = us.c.i(iN4);
                                        } else {
                                            u.i("AtomParsers", "Unsupported color type: " + pr.a.a(iQ3));
                                        }
                                    }
                                } else {
                                    i19 = i28;
                                }
                            }
                            listS = list;
                            fR = f11;
                        }
                        str = str2;
                    }
                    i28 = i19;
                    iH = i18;
                    listS = list;
                    fR = f11;
                }
                iF = i17 + iQ;
                i24 = i12;
                i25 = i13;
                eVar2 = eVar;
                iIntValue = iIntValue;
                str4 = str4;
                hVarB = hVarB;
            }
            i28 = i23;
            iH = i21;
            i17 = iF;
            i27 = i22;
            str = str3;
            iF = i17 + iQ;
            i24 = i12;
            i25 = i13;
            eVar2 = eVar;
            iIntValue = iIntValue;
            str4 = str4;
            hVarB = hVarB;
        }
        com.google.android.exoplayer2.drm.h hVar2 = hVarB;
        float f12 = fR;
        List<byte[]> list3 = listS;
        int i29 = iH;
        int i31 = i28;
        if (str == null) {
            return;
        }
        u0.b bVarO = new u0.b().T(i14).g0(str).K(str5).n0(iN).S(iN2).c0(f12).f0(i15).d0(bArrS).j0(i26).V(list3).O(hVar2);
        int i32 = i27;
        if (i29 != -1 || i32 != -1 || i31 != -1 || byteBufferA != null) {
            bVarO.L(new us.c(i29, i32, i31, byteBufferA != null ? byteBufferA.array() : null));
        }
        if (c2200bJ != null) {
            bVarO.I(ru.f.m(c2200bJ.f103763c)).b0(ru.f.m(c2200bJ.f103764d));
        }
        eVar.f103768b = bVarO.G();
    }

    private static ur.a F(d0 d0Var) {
        short sD = d0Var.D();
        d0Var.V(2);
        String strE = d0Var.E(sD);
        int iMax = Math.max(strE.lastIndexOf(43), strE.lastIndexOf(45));
        try {
            return new ur.a(new er.b(Float.parseFloat(strE.substring(0, iMax)), Float.parseFloat(strE.substring(iMax, strE.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j11, long j12, long j13) {
        int length = jArr.length - 1;
        return jArr[0] <= j12 && j12 < jArr[p0.q(4, 0, length)] && jArr[p0.q(jArr.length - 4, 0, length)] < j13 && j13 <= j11;
    }

    private static boolean c(int i11) {
        return i11 != 1;
    }

    private static int d(d0 d0Var, int i11, int i12, int i13) throws ParserException {
        int iF = d0Var.f();
        hr.n.a(iF >= i12, null);
        while (iF - i12 < i13) {
            d0Var.U(iF);
            int iQ = d0Var.q();
            hr.n.a(iQ > 0, "childAtomSize must be positive");
            if (d0Var.q() == i11) {
                return iF;
            }
            iF += iQ;
        }
        return -1;
    }

    private static int e(int i11) {
        if (i11 == 1936684398) {
            return 1;
        }
        if (i11 == 1986618469) {
            return 2;
        }
        if (i11 == 1952807028 || i11 == 1935832172 || i11 == 1937072756 || i11 == 1668047728) {
            return 3;
        }
        return i11 == 1835365473 ? 5 : -1;
    }

    public static void f(d0 d0Var) {
        int iF = d0Var.f();
        d0Var.V(4);
        if (d0Var.q() != 1751411826) {
            iF += 4;
        }
        d0Var.U(iF);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0173  */
    /* JADX WARN: Code duplicated, block: B:102:0x0176  */
    /* JADX WARN: Code duplicated, block: B:105:0x0185  */
    /* JADX WARN: Code duplicated, block: B:108:0x019c  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:152:0x02db  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:156:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:173:0x0301 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0301 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x016a  */
    private static void g(d0 d0Var, int i11, int i12, int i13, int i14, String str, boolean z11, com.google.android.exoplayer2.drm.h hVar, e eVar, int i15) throws ParserException {
        int iN;
        int I;
        int iQ;
        int iL;
        String str2;
        String str3;
        int i16;
        String str4;
        C2200b c2200bJ;
        String str5;
        List<byte[]> listS;
        int iQ2;
        boolean z12;
        int iQ3;
        int iD;
        byte[] bArr;
        boolean z13;
        int i17 = i12;
        int i18 = i13;
        com.google.android.exoplayer2.drm.h hVarB = hVar;
        d0Var.U(i17 + 16);
        if (z11) {
            iN = d0Var.N();
            d0Var.V(6);
        } else {
            d0Var.V(8);
            iN = 0;
        }
        if (iN == 0 || iN == 1) {
            int iN2 = d0Var.N();
            d0Var.V(6);
            I = d0Var.I();
            d0Var.U(d0Var.f() - 4);
            iQ = d0Var.q();
            if (iN == 1) {
                d0Var.V(16);
            }
            iL = iN2;
        } else {
            if (iN != 2) {
                return;
            }
            d0Var.V(16);
            I = (int) Math.round(d0Var.o());
            iL = d0Var.L();
            d0Var.V(20);
            iQ = 0;
        }
        int iF = d0Var.f();
        int iIntValue = i11;
        if (iIntValue == 1701733217) {
            Pair<Integer, p> pairT = t(d0Var, i17, i18);
            if (pairT != null) {
                iIntValue = ((Integer) pairT.first).intValue();
                hVarB = hVarB == null ? null : hVarB.b(((p) pairT.second).f103892b);
                eVar.f103767a[i15] = (p) pairT.second;
            }
            d0Var.U(iF);
        }
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (iIntValue != 1935767394) {
                str3 = "audio/raw";
                if (iIntValue == 1819304813 || iIntValue == 1936684916) {
                    i16 = 2;
                } else if (iIntValue == 1953984371) {
                    i16 = 268435456;
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = "audio/mpeg";
                } else if (iIntValue == 1835557169) {
                    str2 = "audio/mha1";
                } else if (iIntValue == 1835560241) {
                    str2 = "audio/mhm1";
                } else if (iIntValue == 1634492771) {
                    str2 = "audio/alac";
                } else if (iIntValue == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (iIntValue == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (iIntValue == 1332770163) {
                    str2 = "audio/opus";
                } else if (iIntValue == 1716281667) {
                    str2 = "audio/flac";
                } else if (iIntValue == 1835823201) {
                    str2 = "audio/true-hd";
                } else {
                    i16 = -1;
                    str3 = null;
                }
                str4 = str3;
                c2200bJ = null;
                str5 = null;
                listS = null;
                while (iF - i17 < i18) {
                    d0Var.U(iF);
                    iQ2 = d0Var.q();
                    if (iQ2 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    hr.n.a(z12, "childAtomSize must be positive");
                    iQ3 = d0Var.q();
                    if (iQ3 == 1835557187) {
                        int i19 = iQ2 - 13;
                        byte[] bArr2 = new byte[i19];
                        d0Var.U(iF + 13);
                        d0Var.l(bArr2, 0, i19);
                        listS = x.s(bArr2);
                    } else {
                        if (iQ3 != 1702061171 || (z11 && iQ3 == 2002876005)) {
                            if (iQ3 == 1702061171) {
                                iD = iF;
                            } else {
                                iD = d(d0Var, 1702061171, iF, iQ2);
                            }
                            if (iD != -1) {
                                c2200bJ = j(d0Var, iD);
                                str4 = c2200bJ.f103761a;
                                bArr = c2200bJ.f103762b;
                                if (bArr != null) {
                                    if ("audio/mp4a-latm".equals(str4)) {
                                        dr.a.b bVarE = dr.a.e(bArr);
                                        I = bVarE.f60845a;
                                        iL = bVarE.f60846b;
                                        str5 = bVarE.f60847c;
                                    }
                                    listS = x.s(bArr);
                                }
                            }
                        } else {
                            if (iQ3 == 1684103987) {
                                d0Var.U(iF + 8);
                                eVar.f103768b = dr.b.d(d0Var, Integer.toString(i14), str, hVarB);
                            } else if (iQ3 == 1684366131) {
                                d0Var.U(iF + 8);
                                eVar.f103768b = dr.b.h(d0Var, Integer.toString(i14), str, hVarB);
                            } else if (iQ3 == 1684103988) {
                                d0Var.U(iF + 8);
                                eVar.f103768b = dr.c.b(d0Var, Integer.toString(i14), str, hVarB);
                            } else if (iQ3 == 1684892784) {
                                if (iQ <= 0) {
                                    throw ParserException.a("Invalid sample rate for Dolby TrueHD MLP stream: " + iQ, null);
                                }
                                I = iQ;
                                iL = 2;
                            } else if (iQ3 == 1684305011 || iQ3 == 1969517683) {
                                z13 = false;
                                eVar.f103768b = new u0.b().T(i14).g0(str4).J(iL).h0(I).O(hVarB).X(str).G();
                            } else if (iQ3 == 1682927731) {
                                int i21 = iQ2 - 8;
                                byte[] bArr3 = f103751a;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i21);
                                d0Var.U(iF + 8);
                                d0Var.l(bArrCopyOf, bArr3.length, i21);
                                listS = dr.v.a(bArrCopyOf);
                            } else if (iQ3 == 1684425825) {
                                byte[] bArr4 = new byte[iQ2 - 8];
                                bArr4[0] = 102;
                                bArr4[1] = 76;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                d0Var.U(iF + 12);
                                d0Var.l(bArr4, 4, iQ2 - 12);
                                listS = x.s(bArr4);
                            } else if (iQ3 == 1634492771) {
                                int i22 = iQ2 - 12;
                                byte[] bArr5 = new byte[i22];
                                d0Var.U(iF + 12);
                                d0Var.l(bArr5, 0, i22);
                                Pair<Integer, Integer> pairE = ts.e.e(bArr5);
                                int iIntValue2 = ((Integer) pairE.first).intValue();
                                int iIntValue3 = ((Integer) pairE.second).intValue();
                                listS = x.s(bArr5);
                                I = iIntValue2;
                                iL = iIntValue3;
                            } else {
                                z13 = false;
                            }
                            z13 = false;
                        }
                        iF += iQ2;
                        i17 = i12;
                        i18 = i13;
                    }
                    iF += iQ2;
                    i17 = i12;
                    i18 = i13;
                }
                if (eVar.f103768b == null || str4 == null) {
                }
                u0.b bVarX = new u0.b().T(i14).g0(str4).K(str5).J(iL).h0(I).a0(i16).V(listS).O(hVarB).X(str);
                if (c2200bJ != null) {
                    bVarX.I(ru.f.m(c2200bJ.f103763c)).b0(ru.f.m(c2200bJ.f103764d));
                }
                eVar.f103768b = bVarX.G();
                return;
            }
            str2 = "audio/amr-wb";
        }
        str3 = str2;
        i16 = -1;
        str4 = str3;
        c2200bJ = null;
        str5 = null;
        listS = null;
        while (iF - i17 < i18) {
            d0Var.U(iF);
            iQ2 = d0Var.q();
            if (iQ2 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            hr.n.a(z12, "childAtomSize must be positive");
            iQ3 = d0Var.q();
            if (iQ3 == 1835557187) {
                int i110 = iQ2 - 13;
                byte[] bArr6 = new byte[i110];
                d0Var.U(iF + 13);
                d0Var.l(bArr6, 0, i110);
                listS = x.s(bArr6);
            } else {
                if (iQ3 != 1702061171) {
                    if (iQ3 == 1702061171) {
                        iD = iF;
                    } else {
                        iD = d(d0Var, 1702061171, iF, iQ2);
                    }
                    if (iD != -1) {
                        c2200bJ = j(d0Var, iD);
                        str4 = c2200bJ.f103761a;
                        bArr = c2200bJ.f103762b;
                        if (bArr != null) {
                            if ("audio/mp4a-latm".equals(str4)) {
                                dr.a.b bVarE2 = dr.a.e(bArr);
                                I = bVarE2.f60845a;
                                iL = bVarE2.f60846b;
                                str5 = bVarE2.f60847c;
                            }
                            listS = x.s(bArr);
                        }
                    }
                } else {
                    if (iQ3 == 1702061171) {
                        iD = iF;
                    } else {
                        iD = d(d0Var, 1702061171, iF, iQ2);
                    }
                    if (iD != -1) {
                        c2200bJ = j(d0Var, iD);
                        str4 = c2200bJ.f103761a;
                        bArr = c2200bJ.f103762b;
                        if (bArr != null) {
                            if ("audio/mp4a-latm".equals(str4)) {
                                dr.a.b bVarE3 = dr.a.e(bArr);
                                I = bVarE3.f60845a;
                                iL = bVarE3.f60846b;
                                str5 = bVarE3.f60847c;
                            }
                            listS = x.s(bArr);
                        }
                    }
                }
                iF += iQ2;
                i17 = i12;
                i18 = i13;
            }
            iF += iQ2;
            i17 = i12;
            i18 = i13;
        }
        if (eVar.f103768b == null) {
        }
    }

    static Pair<Integer, p> h(d0 d0Var, int i11, int i12) throws ParserException {
        int i13 = i11 + 8;
        int i14 = -1;
        int i15 = 0;
        String strE = null;
        Integer numValueOf = null;
        while (i13 - i11 < i12) {
            d0Var.U(i13);
            int iQ = d0Var.q();
            int iQ2 = d0Var.q();
            if (iQ2 == 1718775137) {
                numValueOf = Integer.valueOf(d0Var.q());
            } else if (iQ2 == 1935894637) {
                d0Var.V(4);
                strE = d0Var.E(4);
            } else if (iQ2 == 1935894633) {
                i14 = i13;
                i15 = iQ;
            }
            i13 += iQ;
        }
        if (!"cenc".equals(strE) && !"cbc1".equals(strE) && !"cens".equals(strE) && !"cbcs".equals(strE)) {
            return null;
        }
        hr.n.a(numValueOf != null, "frma atom is mandatory");
        hr.n.a(i14 != -1, "schi atom is mandatory");
        p pVarU = u(d0Var, i14, i15, strE);
        hr.n.a(pVarU != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (p) p0.j(pVarU));
    }

    private static Pair<long[], long[]> i(pr.a.C2199a c2199a) {
        pr.a.b bVarG = c2199a.g(1701606260);
        if (bVarG == null) {
            return null;
        }
        d0 d0Var = bVarG.f103750b;
        d0Var.U(8);
        int iC = pr.a.c(d0Var.q());
        int iL = d0Var.L();
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        for (int i11 = 0; i11 < iL; i11++) {
            jArr[i11] = iC == 1 ? d0Var.M() : d0Var.J();
            jArr2[i11] = iC == 1 ? d0Var.A() : d0Var.q();
            if (d0Var.D() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            d0Var.V(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static C2200b j(d0 d0Var, int i11) {
        d0Var.U(i11 + 12);
        d0Var.V(1);
        k(d0Var);
        d0Var.V(2);
        int iH = d0Var.H();
        if ((iH & 128) != 0) {
            d0Var.V(2);
        }
        if ((iH & 64) != 0) {
            d0Var.V(d0Var.H());
        }
        if ((iH & 32) != 0) {
            d0Var.V(2);
        }
        d0Var.V(1);
        k(d0Var);
        String strF = y.f(d0Var.H());
        if ("audio/mpeg".equals(strF) || "audio/vnd.dts".equals(strF) || "audio/vnd.dts.hd".equals(strF)) {
            return new C2200b(strF, null, -1L, -1L);
        }
        d0Var.V(4);
        long J = d0Var.J();
        long J2 = d0Var.J();
        d0Var.V(1);
        int iK = k(d0Var);
        long j11 = J2;
        byte[] bArr = new byte[iK];
        d0Var.l(bArr, 0, iK);
        if (j11 <= 0) {
            j11 = -1;
        }
        return new C2200b(strF, bArr, j11, J > 0 ? J : -1L);
    }

    private static int k(d0 d0Var) {
        int iH = d0Var.H();
        int i11 = iH & 127;
        while ((iH & 128) == 128) {
            iH = d0Var.H();
            i11 = (i11 << 7) | (iH & 127);
        }
        return i11;
    }

    private static int l(d0 d0Var) {
        d0Var.U(16);
        return d0Var.q();
    }

    private static ur.a m(d0 d0Var, int i11) {
        d0Var.V(8);
        ArrayList arrayList = new ArrayList();
        while (d0Var.f() < i11) {
            ur.a.b bVarC = pr.h.c(d0Var);
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ur.a(arrayList);
    }

    private static Pair<Long, String> n(d0 d0Var) {
        d0Var.U(8);
        int iC = pr.a.c(d0Var.q());
        d0Var.V(iC == 0 ? 8 : 16);
        long J = d0Var.J();
        d0Var.V(iC == 0 ? 4 : 8);
        int iN = d0Var.N();
        return Pair.create(Long.valueOf(J), "" + ((char) (((iN >> 10) & 31) + 96)) + ((char) (((iN >> 5) & 31) + 96)) + ((char) ((iN & 31) + 96)));
    }

    public static ur.a o(pr.a.C2199a c2199a) {
        pr.a.b bVarG = c2199a.g(1751411826);
        pr.a.b bVarG2 = c2199a.g(1801812339);
        pr.a.b bVarG3 = c2199a.g(1768715124);
        if (bVarG == null || bVarG2 == null || bVarG3 == null || l(bVarG.f103750b) != 1835299937) {
            return null;
        }
        d0 d0Var = bVarG2.f103750b;
        d0Var.U(12);
        int iQ = d0Var.q();
        String[] strArr = new String[iQ];
        for (int i11 = 0; i11 < iQ; i11++) {
            int iQ2 = d0Var.q();
            d0Var.V(4);
            strArr[i11] = d0Var.E(iQ2 - 8);
        }
        d0 d0Var2 = bVarG3.f103750b;
        d0Var2.U(8);
        ArrayList arrayList = new ArrayList();
        while (d0Var2.a() > 8) {
            int iF = d0Var2.f();
            int iQ3 = d0Var2.q();
            int iQ4 = d0Var2.q() - 1;
            if (iQ4 < 0 || iQ4 >= iQ) {
                u.i("AtomParsers", "Skipped metadata with unknown key index: " + iQ4);
            } else {
                as.a aVarF = pr.h.f(d0Var2, iF + iQ3, strArr[iQ4]);
                if (aVarF != null) {
                    arrayList.add(aVarF);
                }
            }
            d0Var2.U(iF + iQ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ur.a(arrayList);
    }

    private static void p(d0 d0Var, int i11, int i12, int i13, e eVar) {
        d0Var.U(i12 + 16);
        if (i11 == 1835365492) {
            d0Var.B();
            String strB = d0Var.B();
            if (strB != null) {
                eVar.f103768b = new u0.b().T(i13).g0(strB).G();
            }
        }
    }

    public static c q(d0 d0Var) {
        long J;
        d0Var.U(8);
        if (pr.a.c(d0Var.q()) == 0) {
            J = d0Var.J();
            d0Var.V(4);
        } else {
            long jA = d0Var.A();
            d0Var.V(8);
            J = jA;
        }
        return new c(new ur.a(new er.a((J - ((long) 2082844800)) * 1000)), d0Var.J());
    }

    private static float r(d0 d0Var, int i11) {
        d0Var.U(i11 + 8);
        return d0Var.L() / d0Var.L();
    }

    private static byte[] s(d0 d0Var, int i11, int i12) {
        int i13 = i11 + 8;
        while (i13 - i11 < i12) {
            d0Var.U(i13);
            int iQ = d0Var.q();
            if (d0Var.q() == 1886547818) {
                return Arrays.copyOfRange(d0Var.e(), i13, iQ + i13);
            }
            i13 += iQ;
        }
        return null;
    }

    private static Pair<Integer, p> t(d0 d0Var, int i11, int i12) throws ParserException {
        Pair<Integer, p> pairH;
        int iF = d0Var.f();
        while (iF - i11 < i12) {
            d0Var.U(iF);
            int iQ = d0Var.q();
            hr.n.a(iQ > 0, "childAtomSize must be positive");
            if (d0Var.q() == 1936289382 && (pairH = h(d0Var, iF, iQ)) != null) {
                return pairH;
            }
            iF += iQ;
        }
        return null;
    }

    private static p u(d0 d0Var, int i11, int i12, String str) {
        int i13;
        int i14;
        int i15 = i11 + 8;
        while (true) {
            byte[] bArr = null;
            if (i15 - i11 >= i12) {
                return null;
            }
            d0Var.U(i15);
            int iQ = d0Var.q();
            if (d0Var.q() == 1952804451) {
                int iC = pr.a.c(d0Var.q());
                d0Var.V(1);
                if (iC == 0) {
                    d0Var.V(1);
                    i14 = 0;
                    i13 = 0;
                } else {
                    int iH = d0Var.H();
                    i13 = iH & 15;
                    i14 = (iH & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
                }
                boolean z11 = d0Var.H() == 1;
                int iH2 = d0Var.H();
                byte[] bArr2 = new byte[16];
                d0Var.l(bArr2, 0, 16);
                if (z11 && iH2 == 0) {
                    int iH3 = d0Var.H();
                    bArr = new byte[iH3];
                    d0Var.l(bArr, 0, iH3);
                }
                return new p(z11, str, iH2, bArr2, i14, i13, bArr);
            }
            i15 += iQ;
        }
    }

    private static ur.a v(d0 d0Var, int i11) {
        d0Var.V(12);
        while (d0Var.f() < i11) {
            int iF = d0Var.f();
            int iQ = d0Var.q();
            if (d0Var.q() == 1935766900) {
                if (iQ < 14) {
                    return null;
                }
                d0Var.V(5);
                int iH = d0Var.H();
                if (iH != 12 && iH != 13) {
                    return null;
                }
                float f11 = iH == 12 ? 240.0f : 120.0f;
                d0Var.V(1);
                return new ur.a(new as.e(f11, d0Var.H()));
            }
            d0Var.U(iF + iQ);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [int] */
    /* JADX WARN: Type inference failed for: r12v16, types: [int] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    private static r w(o oVar, pr.a.C2199a c2199a, v vVar) throws ParserException {
        d gVar;
        boolean z11;
        int iL;
        int iL2;
        int iL3;
        boolean z12;
        long j11;
        long[] jArrCopyOf;
        int i11;
        int i12;
        long j12;
        boolean z13;
        int[] iArr;
        long[] jArr;
        ?? r11;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        long j13;
        int[] iArr6;
        int[] iArr7;
        int i13;
        boolean z14;
        int i14;
        int i15;
        pr.a.b bVarG = c2199a.g(1937011578);
        if (bVarG != null) {
            gVar = new f(bVarG, oVar.f103885f);
        } else {
            pr.a.b bVarG2 = c2199a.g(1937013298);
            if (bVarG2 == null) {
                throw ParserException.a("Track has no sample table size information", null);
            }
            gVar = new g(bVarG2);
        }
        int iB = gVar.b();
        if (iB == 0) {
            return new r(oVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        pr.a.b bVarG3 = c2199a.g(1937007471);
        if (bVarG3 == null) {
            bVarG3 = (pr.a.b) ts.a.e(c2199a.g(1668232756));
            z11 = true;
        } else {
            z11 = false;
        }
        d0 d0Var = bVarG3.f103750b;
        d0 d0Var2 = ((pr.a.b) ts.a.e(c2199a.g(1937011555))).f103750b;
        d0 d0Var3 = ((pr.a.b) ts.a.e(c2199a.g(1937011827))).f103750b;
        pr.a.b bVarG4 = c2199a.g(1937011571);
        d0 d0Var4 = bVarG4 != null ? bVarG4.f103750b : null;
        pr.a.b bVarG5 = c2199a.g(1668576371);
        d0 d0Var5 = bVarG5 != null ? bVarG5.f103750b : null;
        a aVar = new a(d0Var2, d0Var, z11);
        d0Var3.U(12);
        int iL4 = d0Var3.L() - 1;
        int iL5 = d0Var3.L();
        int iL6 = d0Var3.L();
        if (d0Var5 != null) {
            d0Var5.U(12);
            iL = d0Var5.L();
        } else {
            iL = 0;
        }
        if (d0Var4 != null) {
            d0Var4.U(12);
            iL3 = d0Var4.L();
            if (iL3 > 0) {
                iL2 = d0Var4.L() - 1;
                z12 = false;
            } else {
                iL2 = -1;
                z12 = false;
                d0Var4 = null;
            }
        } else {
            iL2 = -1;
            iL3 = 0;
            z12 = false;
        }
        int iC = gVar.c();
        String str = oVar.f103885f.f40712l;
        boolean z15 = (iC == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iL4 == 0 && iL == 0 && iL3 == 0)) ? z12 ? 1 : 0 : true;
        d dVar = gVar;
        if (z15) {
            int i16 = aVar.f103752a;
            long[] jArr2 = new long[i16];
            int[] iArr8 = new int[i16];
            while (aVar.a()) {
                int i17 = aVar.f103753b;
                jArr2[i17] = aVar.f103755d;
                iArr8[i17] = aVar.f103754c;
            }
            pr.d.b bVarA = pr.d.a(iC, jArr2, iArr8, iL6);
            long[] jArr3 = bVarA.f103789a;
            iArr = bVarA.f103790b;
            int i18 = bVarA.f103791c;
            long[] jArr4 = bVarA.f103792d;
            int[] iArr9 = bVarA.f103793e;
            j12 = bVarA.f103794f;
            jArr = jArr3;
            r11 = i18;
            jArrCopyOf = jArr4;
            iArr2 = iArr9;
            j11 = 0;
        } else {
            long[] jArr5 = new long[iB];
            j11 = 0;
            int[] iArrCopyOf = new int[iB];
            jArrCopyOf = new long[iB];
            d0 d0Var6 = d0Var5;
            int[] iArrCopyOf2 = new int[iB];
            d0 d0Var7 = d0Var4;
            int iL7 = iL2;
            int i19 = z12 ? 1 : 0;
            int iQ = i19;
            int i21 = iQ == true ? 1 : 0;
            int i22 = i21;
            long j14 = 0;
            long j15 = 0;
            int i23 = iL;
            int iQ2 = iL6;
            int i24 = iL5;
            int i25 = iL4;
            int i26 = i22 == true ? 1 : 0;
            while (true) {
                if (i19 >= iB) {
                    boolean z16 = iB == true ? 1 : 0;
                    i11 = i24;
                    i12 = i21;
                    break;
                }
                long j16 = j15;
                int i27 = i21;
                boolean zA = true;
                while (i27 == 0) {
                    zA = aVar.a();
                    if (!zA) {
                        break;
                    }
                    int i28 = i24;
                    long j17 = aVar.f103755d;
                    i27 = aVar.f103754c;
                    j16 = j17;
                    i24 = i28;
                    iQ2 = iQ2;
                    iB = iB == true ? 1 : 0;
                }
                int i29 = iB;
                i11 = i24;
                int i31 = iQ2;
                if (!zA) {
                    u.i("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr5, i19);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i19);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i19);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i19);
                    jArr5 = jArrCopyOf2;
                    iB = i19;
                    i12 = i27;
                    break;
                }
                if (d0Var6 != null) {
                    int iL8 = i22 == true ? 1 : 0;
                    while (iL8 == 0 && i23 > 0) {
                        iL8 = d0Var6.L();
                        iQ = d0Var6.q();
                        i23--;
                    }
                    i22 = iL8 - 1;
                }
                jArr5[i19] = j16;
                int iA = dVar.a();
                iArrCopyOf[i19] = iA;
                if (iA > i26) {
                    i26 = iA;
                }
                jArrCopyOf[i19] = j14 + ((long) iQ);
                iArrCopyOf2[i19] = d0Var7 == null ? 1 : z12 ? 1 : 0;
                if (i19 == iL7) {
                    iArrCopyOf2[i19] = 1;
                    iL3--;
                    if (iL3 > 0) {
                        iL7 = ((d0) ts.a.e(d0Var7)).L() - 1;
                    }
                }
                j14 += (long) i31;
                int iL9 = i11 - 1;
                if (iL9 != 0 || i25 <= 0) {
                    iQ2 = i31;
                } else {
                    iL9 = d0Var3.L();
                    i25--;
                    iQ2 = d0Var3.q();
                }
                i24 = iL9;
                long j18 = j16 + ((long) iArrCopyOf[i19]);
                i21 = i27 - 1;
                i19++;
                j15 = j18;
                iB = i29 == true ? 1 : 0;
            }
            j12 = j14 + ((long) iQ);
            if (d0Var6 == null) {
                z13 = true;
                break;
            }
            while (true) {
                if (i23 <= 0) {
                    z13 = true;
                    break;
                }
                if (d0Var6.L() != 0) {
                    z13 = z12 ? 1 : 0;
                    break;
                }
                d0Var6.q();
                i23--;
            }
            if (iL3 != 0 || i11 != 0 || i12 != 0 || i25 != 0 || i22 != 0 || !z13) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Inconsistent stbl box for track ");
                sb2.append(oVar.f103880a);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(iL3);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i11);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i12);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i25);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i22 == true ? 1 : 0 ? 1 : 0);
                sb2.append(!z13 ? ", ctts invalid" : "");
                u.i("AtomParsers", sb2.toString());
            }
            iArr = iArrCopyOf;
            jArr = jArr5;
            r11 = i26 == true ? 1 : 0;
            iArr2 = iArrCopyOf2;
        }
        long j19 = j12;
        long jM0 = p0.M0(j19, 1000000L, oVar.f103882c);
        long[] jArr6 = oVar.f103887h;
        if (jArr6 == null) {
            p0.N0(jArrCopyOf, 1000000L, oVar.f103882c);
            return new r(oVar, jArr, iArr, r11 == true ? 1 : 0, jArrCopyOf, iArr2, jM0);
        }
        int[] iArr10 = iArr;
        int i32 = iB;
        int[] iArr11 = iArr10;
        if (jArr6.length == 1 && oVar.f103881b == 1 && jArrCopyOf.length >= 2) {
            long j21 = ((long[]) ts.a.e(oVar.f103888i))[z12 ? 1 : 0];
            long jM1 = j21 + p0.M0(oVar.f103887h[z12 ? 1 : 0], oVar.f103882c, oVar.f103883d);
            long[] jArr7 = jArr;
            long[] jArr8 = jArrCopyOf;
            jArrCopyOf = jArr8;
            if (b(jArr8, j19, j21, jM1)) {
                long jM2 = p0.M0(j21 - jArrCopyOf[z12 ? 1 : 0], oVar.f103885f.f40726z, oVar.f103882c);
                long jM3 = p0.M0(j19 - jM1, oVar.f103885f.f40726z, oVar.f103882c);
                if (jM2 != j11 || jM3 != j11) {
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j19 = j19;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j19 = j19;
                    if (jM2 <= 2147483647L && jM3 <= 2147483647L) {
                        vVar.f73396a = (int) jM2;
                        vVar.f73397b = (int) jM3;
                        p0.N0(jArrCopyOf, 1000000L, oVar.f103882c);
                        return new r(oVar, jArr7, iArr11, r11 == true ? 1 : 0, jArrCopyOf, iArr2, p0.M0(oVar.f103887h[z12 ? 1 : 0], 1000000L, oVar.f103883d));
                    }
                }
            }
            iArr3 = iArr11;
            iArr3 = iArr11;
            iArr3 = iArr11;
            j19 = j19;
            iArr3 = iArr11;
            iArr3 = iArr11;
            iArr3 = iArr11;
            j19 = j19;
            jArr = jArr7;
            iArr3 = iArr11;
        }
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        long[] jArr9 = oVar.f103887h;
        if (jArr9.length == 1 && jArr9[z12 ? 1 : 0] == j11) {
            long j22 = ((long[]) ts.a.e(oVar.f103888i))[z12 ? 1 : 0];
            for (int i33 = z12 ? 1 : 0; i33 < jArrCopyOf.length; i33++) {
                jArrCopyOf[i33] = p0.M0(jArrCopyOf[i33] - j22, 1000000L, oVar.f103882c);
            }
            return new r(oVar, jArr, iArr3, r11 == true ? 1 : 0, jArrCopyOf, iArr2, p0.M0(j19 - j22, 1000000L, oVar.f103882c));
        }
        boolean z17 = oVar.f103881b == 1 ? true : z12 ? 1 : 0;
        int[] iArr12 = new int[jArr9.length];
        int[] iArr13 = new int[jArr9.length];
        long[] jArr10 = (long[]) ts.a.e(oVar.f103888i);
        int i34 = z12 ? 1 : 0;
        boolean z18 = i34 == true ? 1 : 0;
        int i35 = z18 ? 1 : 0;
        int i36 = i35;
        boolean z19 = z18;
        while (true) {
            long[] jArr11 = oVar.f103887h;
            iArr4 = iArr13;
            if (i34 >= jArr11.length) {
                break;
            }
            int[] iArr14 = iArr12;
            long[] jArr12 = jArr10;
            long j23 = jArr12[i34];
            if (j23 != -1) {
                long j24 = jArr11[i34];
                i13 = i34;
                boolean z21 = z19 ? 1 : 0;
                long jM4 = p0.M0(j24, oVar.f103882c, oVar.f103883d);
                iArr7 = iArr14;
                iArr7[i13 == true ? 1 : 0] = p0.i(jArrCopyOf, j23, true, true);
                long j25 = j23 + jM4;
                z14 = z12;
                iArr4[i13 == true ? 1 : 0] = p0.e(jArrCopyOf, j25, z17, z14);
                while (true) {
                    i14 = iArr7[i13 == true ? 1 : 0];
                    i15 = iArr4[i13 == true ? 1 : 0];
                    if (i14 >= i15 || (iArr2[i14] & 1) != 0) {
                        break;
                    }
                    iArr7[i13 == true ? 1 : 0] = i14 + 1;
                }
                i35 += i15 - i14;
                z19 = (z21 ? 1 : 0) | (i36 != i14 ? true : z14 ? 1 : 0);
                i36 = i15;
            } else {
                iArr7 = iArr14;
                i13 = i34;
                boolean z22 = z19 ? 1 : 0;
                z14 = z12;
            }
            jArr10 = jArr12;
            z12 = z14;
            iArr13 = iArr4;
            i34 = i13 + 1;
            iArr12 = iArr7;
            z19 = z19;
        }
        int[] iArr15 = iArr12;
        boolean z23 = z12;
        boolean z24 = (z19 ? 1 : 0 ? 1 : 0) | (i35 != i32 ? true : z23);
        long[] jArr13 = z24 != 0 ? new long[i35] : jArr;
        if (z24 != 0) {
            iArr6 = new int[i35];
        } else {
            iArr5 = iArr3;
        }
        if (z24 != 0) {
            iArr5 = iArr6;
            r11 = z23;
        }
        int[] iArr16 = z24 != 0 ? new int[i35] : iArr2;
        long[] jArr14 = new long[i35];
        ?? r12 = z23;
        long j26 = j11;
        boolean z25 = z24;
        int[] iArr17 = iArr3;
        ?? r13 = r11;
        ?? r14 = z23;
        while (r14 < oVar.f103887h.length) {
            long j27 = oVar.f103888i[r14];
            int i37 = iArr15[r14];
            boolean z26 = z25;
            int i38 = iArr4[r14];
            ?? r38 = r13;
            if (z26 != 0) {
                int i39 = i38 - i37;
                System.arraycopy(jArr, i37, jArr13, r12, i39);
                System.arraycopy(iArr17, i37, iArr5, r12, i39);
                System.arraycopy(iArr2, i37, iArr16, r12, i39);
            }
            int i41 = r38 == true ? 1 : 0;
            int[] iArr18 = iArr17;
            ?? r15 = r12;
            while (i37 < i38) {
                long[] jArr15 = jArr;
                int[] iArr19 = iArr18;
                long jM5 = p0.M0(j26, 1000000L, oVar.f103883d);
                long jM6 = p0.M0(jArrCopyOf[i37] - j27, 1000000L, oVar.f103882c);
                int i42 = i38;
                long[] jArr16 = jArrCopyOf;
                if (c(oVar.f103881b)) {
                    j13 = j11;
                    jM6 = Math.max(j13, jM6);
                } else {
                    j13 = j11;
                }
                jArr14[r15] = jM5 + jM6;
                if (z26 != 0 && iArr5[r15] > i41) {
                    i41 = iArr19[i37];
                }
                i37++;
                j11 = j13;
                jArr = jArr15;
                iArr18 = iArr19;
                jArrCopyOf = jArr16;
                iArr2 = iArr2;
                i38 = i42;
                i41 = i41;
                r15++;
            }
            j26 += oVar.f103887h[r14];
            jArr = jArr;
            jArrCopyOf = jArrCopyOf;
            iArr2 = iArr2;
            z25 = z26;
            iArr17 = iArr18;
            r13 = i41;
            r14++;
            r12 = r15;
        }
        return new r(oVar, jArr13, iArr5, r13, jArr14, iArr16, p0.M0(j26, 1000000L, oVar.f103883d));
    }

    private static e x(d0 d0Var, int i11, int i12, String str, com.google.android.exoplayer2.drm.h hVar, boolean z11) throws ParserException {
        d0Var.U(12);
        int iQ = d0Var.q();
        e eVar = new e(iQ);
        int i13 = 0;
        while (i13 < iQ) {
            int iF = d0Var.f();
            int iQ2 = d0Var.q();
            hr.n.a(iQ2 > 0, "childAtomSize must be positive");
            int iQ3 = d0Var.q();
            if (iQ3 == 1635148593 || iQ3 == 1635148595 || iQ3 == 1701733238 || iQ3 == 1831958048 || iQ3 == 1836070006 || iQ3 == 1752589105 || iQ3 == 1751479857 || iQ3 == 1932670515 || iQ3 == 1211250227 || iQ3 == 1987063864 || iQ3 == 1987063865 || iQ3 == 1635135537 || iQ3 == 1685479798 || iQ3 == 1685479729 || iQ3 == 1685481573 || iQ3 == 1685481521) {
                e eVar2 = eVar;
                int i14 = i13;
                E(d0Var, iQ3, iF, iQ2, i11, i12, hVar, eVar2, i14);
                eVar = eVar2;
                i13 = i14;
            } else if (iQ3 == 1836069985 || iQ3 == 1701733217 || iQ3 == 1633889587 || iQ3 == 1700998451 || iQ3 == 1633889588 || iQ3 == 1835823201 || iQ3 == 1685353315 || iQ3 == 1685353317 || iQ3 == 1685353320 || iQ3 == 1685353324 || iQ3 == 1685353336 || iQ3 == 1935764850 || iQ3 == 1935767394 || iQ3 == 1819304813 || iQ3 == 1936684916 || iQ3 == 1953984371 || iQ3 == 778924082 || iQ3 == 778924083 || iQ3 == 1835557169 || iQ3 == 1835560241 || iQ3 == 1634492771 || iQ3 == 1634492791 || iQ3 == 1970037111 || iQ3 == 1332770163 || iQ3 == 1716281667) {
                e eVar3 = eVar;
                g(d0Var, iQ3, iF, iQ2, i11, str, z11, hVar, eVar3, i13);
                eVar = eVar3;
            } else if (iQ3 == 1414810956 || iQ3 == 1954034535 || iQ3 == 2004251764 || iQ3 == 1937010800 || iQ3 == 1664495672) {
                y(d0Var, iQ3, iF, iQ2, i11, str, eVar);
            } else if (iQ3 == 1835365492) {
                p(d0Var, iQ3, iF, i11, eVar);
            } else if (iQ3 == 1667329389) {
                eVar.f103768b = new u0.b().T(i11).g0("application/x-camera-motion").G();
            }
            d0Var.U(iF + iQ2);
            i13++;
        }
        return eVar;
    }

    private static void y(d0 d0Var, int i11, int i12, int i13, int i14, String str, e eVar) {
        d0Var.U(i12 + 16);
        String str2 = "application/ttml+xml";
        x xVarS = null;
        long j11 = Long.MAX_VALUE;
        if (i11 != 1414810956) {
            if (i11 == 1954034535) {
                int i15 = i13 - 16;
                byte[] bArr = new byte[i15];
                d0Var.l(bArr, 0, i15);
                xVarS = x.s(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i11 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i11 == 1937010800) {
                j11 = 0;
            } else {
                if (i11 != 1664495672) {
                    throw new IllegalStateException();
                }
                eVar.f103770d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        eVar.f103768b = new u0.b().T(i14).g0(str2).X(str).k0(j11).V(xVarS).G();
    }

    private static h z(d0 d0Var) {
        long j11;
        d0Var.U(8);
        int iC = pr.a.c(d0Var.q());
        d0Var.V(iC == 0 ? 8 : 16);
        int iQ = d0Var.q();
        d0Var.V(4);
        int iF = d0Var.f();
        int i11 = iC == 0 ? 4 : 8;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            j11 = -9223372036854775807L;
            if (i13 >= i11) {
                d0Var.V(i11);
                break;
            }
            if (d0Var.e()[iF + i13] != -1) {
                long J = iC == 0 ? d0Var.J() : d0Var.M();
                if (J == 0) {
                    break;
                }
                j11 = J;
                break;
            }
            i13++;
        }
        d0Var.V(16);
        int iQ2 = d0Var.q();
        int iQ3 = d0Var.q();
        d0Var.V(4);
        int iQ4 = d0Var.q();
        int iQ5 = d0Var.q();
        if (iQ2 == 0 && iQ3 == 65536 && iQ4 == -65536 && iQ5 == 0) {
            i12 = 90;
        } else if (iQ2 == 0 && iQ3 == -65536 && iQ4 == 65536 && iQ5 == 0) {
            i12 = EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
        } else if (iQ2 == -65536 && iQ3 == 0 && iQ4 == 0 && iQ5 == -65536) {
            i12 = 180;
        }
        return new h(iQ, j11, i12);
    }
}
