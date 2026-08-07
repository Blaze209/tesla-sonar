package jq;

import androidx.compose.ui.platform.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import k3.g4;
import k3.p1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.x;
import p009i2.y;
import p009i2.z;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.w2;
import p020r2.y2;
import w4.n;
import w4.o;
import wn0.l;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0080\u0001\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a~\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Ljq/g;", "pagerState", "Landroidx/compose/ui/d;", "modifier", "", "pageCount", "Lkotlin/Function1;", "pageIndexMapping", "Lk3/p1;", "activeColor", "inactiveColor", "Lw4/h;", "indicatorHeight", "indicatorWidth", "spacing", "Lk3/g4;", "indicatorShape", "Ljn0/h0;", "a", "(Ljq/g;Landroidx/compose/ui/d;ILwn0/l;JJFFFLk3/g4;Lr2/l;II)V", "Ljq/h;", "b", "(Ljq/h;ILandroidx/compose/ui/d;Lwn0/l;JJFFFLk3/g4;Lr2/l;II)V", "pager-indicators_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f84191c = new a();

        a() {
            super(1);
        }

        public final Integer a(int i11) {
            return Integer.valueOf(i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PagerState f84192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f84193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f84194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l<Integer, Integer> f84195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f84196g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f84197h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f84198i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f84199j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f84200k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ g4 f84201l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f84202m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f84203n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(PagerState pagerState, androidx.compose.ui.d dVar, int i11, l<? super Integer, Integer> lVar, long j11, long j12, float f11, float f12, float f13, g4 g4Var, int i12, int i13) {
            super(2);
            this.f84192c = pagerState;
            this.f84193d = dVar;
            this.f84194e = i11;
            this.f84195f = lVar;
            this.f84196g = j11;
            this.f84197h = j12;
            this.f84198i = f11;
            this.f84199j = f12;
            this.f84200k = f13;
            this.f84201l = g4Var;
            this.f84202m = i12;
            this.f84203n = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            d.a(this.f84192c, this.f84193d, this.f84194e, this.f84195f, this.f84196g, this.f84197h, this.f84198i, this.f84199j, this.f84200k, this.f84201l, lVar, k2.a(this.f84202m | 1), this.f84203n);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f84204c = new c();

        c() {
            super(1);
        }

        public final Integer a(int i11) {
            return Integer.valueOf(i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX INFO: renamed from: jq.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw4/d;", "Lw4/n;", "a", "(Lw4/d;)J"}, k = 3, mv = {1, 9, 0})
    static final class C1784d extends u implements l<w4.d, n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Integer, Integer> f84205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f84206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f84207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f84208f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f84209g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1784d(l<? super Integer, Integer> lVar, h hVar, int i11, int i12, int i13) {
            super(1);
            this.f84205c = lVar;
            this.f84206d = hVar;
            this.f84207e = i11;
            this.f84208f = i12;
            this.f84209g = i13;
        }

        public final long a(w4.d offset) {
            s.k(offset, "$this$offset");
            int iIntValue = this.f84205c.invoke(Integer.valueOf(this.f84206d.a())).intValue();
            float fB = this.f84206d.b();
            return o.a(0, (int) ((this.f84208f + this.f84209g) * bo0.n.m(((this.f84205c.invoke(Integer.valueOf(this.f84206d.a() + ((int) Math.signum(fB)))).intValue() - iIntValue) * Math.abs(fB)) + iIntValue, BitmapDescriptorFactory.HUE_RED, bo0.n.f(this.f84207e - 1, 0))));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ n invoke(w4.d dVar) {
            return n.b(a(dVar));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f84210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f84211d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f84212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l<Integer, Integer> f84213f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f84214g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f84215h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f84216i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f84217j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f84218k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ g4 f84219l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f84220m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f84221n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(h hVar, int i11, androidx.compose.ui.d dVar, l<? super Integer, Integer> lVar, long j11, long j12, float f11, float f12, float f13, g4 g4Var, int i12, int i13) {
            super(2);
            this.f84210c = hVar;
            this.f84211d = i11;
            this.f84212e = dVar;
            this.f84213f = lVar;
            this.f84214g = j11;
            this.f84215h = j12;
            this.f84216i = f11;
            this.f84217j = f12;
            this.f84218k = f13;
            this.f84219l = g4Var;
            this.f84220m = i12;
            this.f84221n = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            d.b(this.f84210c, this.f84211d, this.f84212e, this.f84213f, this.f84214g, this.f84215h, this.f84216i, this.f84217j, this.f84218k, this.f84219l, lVar, k2.a(this.f84220m | 1), this.f84221n);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"jq/d$f", "Ljq/h;", "", "a", "()I", "currentPage", "", "b", "()F", "currentPageOffset", "pager-indicators_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PagerState f84222a;

        f(PagerState pagerState) {
            this.f84222a = pagerState;
        }

        @Override // jq.h
        public int a() {
            return this.f84222a.i();
        }

        @Override // jq.h
        public float b() {
            return this.f84222a.k();
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x0135  */
    /* JADX WARN: Code duplicated, block: B:113:0x0141  */
    /* JADX WARN: Code duplicated, block: B:117:0x015c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0166  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:152:0x0201  */
    /* JADX WARN: Code duplicated, block: B:155:0x0207  */
    /* JADX WARN: Code duplicated, block: B:156:0x0222  */
    /* JADX WARN: Code duplicated, block: B:158:0x0225  */
    /* JADX WARN: Code duplicated, block: B:161:0x0231  */
    /* JADX WARN: Code duplicated, block: B:162:0x0237  */
    /* JADX WARN: Code duplicated, block: B:165:0x023d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0244  */
    /* JADX WARN: Code duplicated, block: B:169:0x024b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0271  */
    /* JADX WARN: Code duplicated, block: B:174:0x0296  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:181:0x02af  */
    /* JADX WARN: Code duplicated, block: B:183:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:186:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:190:0x030a  */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    @jn0.e
    public static final void a(PagerState pagerState, androidx.compose.ui.d dVar, int i11, l<? super Integer, Integer> lVar, long j11, long j12, float f11, float f12, float f13, g4 g4Var, p020r2.l lVar2, int i12, int i13) {
        int i14;
        androidx.compose.ui.d dVar2;
        int iO;
        int i15;
        l<? super Integer, Integer> lVar3;
        int i16;
        long j13;
        int i17;
        float fG;
        int i18;
        int i19;
        int i21;
        int i22;
        long jP;
        long jP2;
        float f14;
        int i23;
        float f15;
        int i24;
        g4 g4VarF;
        int i25;
        boolean z11;
        Object objI;
        p020r2.l lVar4;
        int i26;
        androidx.compose.ui.d dVar3;
        l<? super Integer, Integer> lVar5;
        long j14;
        long j15;
        float f16;
        float f17;
        float f18;
        g4 g4Var2;
        w2 w2VarX;
        int i27;
        s.k(pagerState, "pagerState");
        p020r2.l lVarV = lVar2.v(51399291);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (lVarV.n(pagerState) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i28 = i13 & 2;
        if (i28 == 0) {
            if ((i12 & 112) == 0) {
                dVar2 = dVar;
                i14 |= lVarV.n(dVar2) ? 32 : 16;
            }
            if ((i12 & 896) == 0) {
                if ((i13 & 4) == 0) {
                    iO = i11;
                    int i29 = lVarV.r(iO) ? 256 : 128;
                    i14 |= i29;
                } else {
                    iO = i11;
                }
                i14 |= i29;
            } else {
                iO = i11;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i12 & 7168) == 0) {
                    lVar3 = lVar;
                    if (lVarV.K(lVar3)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                if ((i12 & 57344) != 0) {
                    i14 |= ((i13 & 16) == 0 || !lVarV.s(j11)) ? PKIFailureInfo.certRevoked : 16384;
                }
                if ((i12 & 458752) == 0) {
                    j13 = j12;
                    if ((i13 & 32) == 0 || !lVarV.s(j13)) {
                        i27 = 65536;
                    } else {
                        i27 = 131072;
                    }
                    i14 |= i27;
                } else {
                    j13 = j12;
                }
                i17 = i13 & 64;
                if (i17 != 0) {
                    if ((i12 & 3670016) == 0) {
                        fG = f11;
                        if (lVarV.q(fG)) {
                            i18 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i18 = PKIFailureInfo.signerNotTrusted;
                        }
                        i14 |= i18;
                    }
                    i19 = 29360128;
                    if ((i12 & 29360128) != 0) {
                        i14 |= ((i13 & 128) == 0 || !lVarV.q(f12)) ? 4194304 : 8388608;
                    }
                    i21 = 234881024;
                    if ((i12 & 234881024) != 0) {
                        i14 |= ((i13 & 256) == 0 || !lVarV.q(f13)) ? 33554432 : 67108864;
                    }
                    i22 = 1879048192;
                    if ((i12 & 1879048192) != 0) {
                        i14 |= ((i13 & 512) == 0 || !lVarV.n(g4Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i14 & 1533916891) == 306783378 || !lVarV.b()) {
                        lVarV.L();
                        if ((i12 & 1) != 0 || lVarV.k()) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if ((i13 & 4) != 0) {
                                i14 &= -897;
                                iO = pagerState.o();
                            }
                            if (i15 != 0) {
                                lVar3 = a.f84191c;
                            }
                            if ((i13 & 16) != 0) {
                                i14 &= -57345;
                                jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            } else {
                                jP = j11;
                            }
                            if ((i13 & 32) != 0) {
                                jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                                i14 &= -458753;
                            } else {
                                jP2 = j13;
                            }
                            if (i17 != 0) {
                                fG = w4.h.g(8);
                            }
                            if ((i13 & 128) != 0) {
                                i14 &= -29360129;
                                f14 = fG;
                            } else {
                                f14 = f12;
                            }
                            if ((i13 & 256) != 0) {
                                i23 = i14 & (-234881025);
                                f15 = fG;
                            } else {
                                i23 = i14;
                                f15 = f13;
                            }
                            if ((i13 & 512) != 0) {
                                i24 = 3670016;
                                i14 = i23 & (-1879048193);
                                g4VarF = a2.g.f();
                            } else {
                                i24 = 3670016;
                                g4VarF = g4Var;
                                i14 = i23;
                            }
                            i25 = 4;
                        } else {
                            lVarV.j();
                            if ((i13 & 4) != 0) {
                                i14 &= -897;
                            }
                            if ((i13 & 16) != 0) {
                                i14 &= -57345;
                            }
                            if ((i13 & 32) != 0) {
                                i14 &= -458753;
                            }
                            if ((i13 & 128) != 0) {
                                i14 &= -29360129;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                            }
                            if ((i13 & 512) != 0) {
                                i14 &= -1879048193;
                            }
                            iO = iO;
                            i24 = 3670016;
                            f14 = f12;
                            f15 = f13;
                            g4VarF = g4Var;
                            fG = fG;
                            i19 = 29360128;
                            i21 = 234881024;
                            i22 = 1879048192;
                            i25 = 4;
                            jP = j11;
                            lVar3 = lVar3;
                            jP2 = j13;
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
                        }
                        lVarV.H(-1599583166);
                        if ((i14 & 14) == i25) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI = lVarV.I();
                        if (z11 || objI == p020r2.l.INSTANCE.a()) {
                            objI = new f(pagerState);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        lVar4 = lVarV;
                        androidx.compose.ui.d dVar4 = dVar2;
                        b((f) objI, iO, dVar4, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        i26 = iO;
                        dVar3 = dVar4;
                        lVar5 = lVar3;
                        j14 = jP;
                        j15 = jP2;
                        f16 = fG;
                        f17 = f14;
                        f18 = f15;
                        g4Var2 = g4VarF;
                    } else {
                        lVarV.j();
                        g4Var2 = g4Var;
                        lVar4 = lVarV;
                        dVar3 = dVar2;
                        i26 = iO;
                        lVar5 = lVar3;
                        j15 = j13;
                        f16 = fG;
                        j14 = j11;
                        f17 = f12;
                        f18 = f13;
                    }
                    w2VarX = lVar4.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(pagerState, dVar3, i26, lVar5, j14, j15, f16, f17, f18, g4Var2, i12, i13));
                    }
                }
                i14 |= 1572864;
                fG = f11;
                i19 = 29360128;
                if ((i12 & 29360128) != 0) {
                    i14 |= ((i13 & 128) == 0 || !lVarV.q(f12)) ? 4194304 : 8388608;
                }
                i21 = 234881024;
                if ((i12 & 234881024) != 0) {
                    i14 |= ((i13 & 256) == 0 || !lVarV.q(f13)) ? 33554432 : 67108864;
                }
                i22 = 1879048192;
                if ((i12 & 1879048192) != 0) {
                    i14 |= ((i13 & 512) == 0 || !lVarV.n(g4Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i14 & 1533916891) == 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            iO = pagerState.o();
                        }
                        if (i15 != 0) {
                            lVar3 = a.f84191c;
                        }
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                            jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        } else {
                            jP = j11;
                        }
                        if ((i13 & 32) != 0) {
                            jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -458753;
                        } else {
                            jP2 = j13;
                        }
                        if (i17 != 0) {
                            fG = w4.h.g(8);
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                            f14 = fG;
                        } else {
                            f14 = f12;
                        }
                        if ((i13 & 256) != 0) {
                            i23 = i14 & (-234881025);
                            f15 = fG;
                        } else {
                            i23 = i14;
                            f15 = f13;
                        }
                        if ((i13 & 512) != 0) {
                            i24 = 3670016;
                            i14 = i23 & (-1879048193);
                            g4VarF = a2.g.f();
                        } else {
                            i24 = 3670016;
                            g4VarF = g4Var;
                            i14 = i23;
                        }
                        i25 = 4;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            iO = pagerState.o();
                        }
                        if (i15 != 0) {
                            lVar3 = a.f84191c;
                        }
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                            jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        } else {
                            jP = j11;
                        }
                        if ((i13 & 32) != 0) {
                            jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -458753;
                        } else {
                            jP2 = j13;
                        }
                        if (i17 != 0) {
                            fG = w4.h.g(8);
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                            f14 = fG;
                        } else {
                            f14 = f12;
                        }
                        if ((i13 & 256) != 0) {
                            i23 = i14 & (-234881025);
                            f15 = fG;
                        } else {
                            i23 = i14;
                            f15 = f13;
                        }
                        if ((i13 & 512) != 0) {
                            i24 = 3670016;
                            i14 = i23 & (-1879048193);
                            g4VarF = a2.g.f();
                        } else {
                            i24 = 3670016;
                            g4VarF = g4Var;
                            i14 = i23;
                        }
                        i25 = 4;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
                    }
                    lVarV.H(-1599583166);
                    if ((i14 & 14) == i25) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new f(pagerState);
                        lVarV.B(objI);
                    } else {
                        objI = new f(pagerState);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    lVar4 = lVarV;
                    androidx.compose.ui.d dVar5 = dVar2;
                    b((f) objI, iO, dVar5, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    i26 = iO;
                    dVar3 = dVar5;
                    lVar5 = lVar3;
                    j14 = jP;
                    j15 = jP2;
                    f16 = fG;
                    f17 = f14;
                    f18 = f15;
                    g4Var2 = g4VarF;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            iO = pagerState.o();
                        }
                        if (i15 != 0) {
                            lVar3 = a.f84191c;
                        }
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                            jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        } else {
                            jP = j11;
                        }
                        if ((i13 & 32) != 0) {
                            jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -458753;
                        } else {
                            jP2 = j13;
                        }
                        if (i17 != 0) {
                            fG = w4.h.g(8);
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                            f14 = fG;
                        } else {
                            f14 = f12;
                        }
                        if ((i13 & 256) != 0) {
                            i23 = i14 & (-234881025);
                            f15 = fG;
                        } else {
                            i23 = i14;
                            f15 = f13;
                        }
                        if ((i13 & 512) != 0) {
                            i24 = 3670016;
                            i14 = i23 & (-1879048193);
                            g4VarF = a2.g.f();
                        } else {
                            i24 = 3670016;
                            g4VarF = g4Var;
                            i14 = i23;
                        }
                        i25 = 4;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            iO = pagerState.o();
                        }
                        if (i15 != 0) {
                            lVar3 = a.f84191c;
                        }
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                            jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        } else {
                            jP = j11;
                        }
                        if ((i13 & 32) != 0) {
                            jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -458753;
                        } else {
                            jP2 = j13;
                        }
                        if (i17 != 0) {
                            fG = w4.h.g(8);
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                            f14 = fG;
                        } else {
                            f14 = f12;
                        }
                        if ((i13 & 256) != 0) {
                            i23 = i14 & (-234881025);
                            f15 = fG;
                        } else {
                            i23 = i14;
                            f15 = f13;
                        }
                        if ((i13 & 512) != 0) {
                            i24 = 3670016;
                            i14 = i23 & (-1879048193);
                            g4VarF = a2.g.f();
                        } else {
                            i24 = 3670016;
                            g4VarF = g4Var;
                            i14 = i23;
                        }
                        i25 = 4;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
                    }
                    lVarV.H(-1599583166);
                    if ((i14 & 14) == i25) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new f(pagerState);
                        lVarV.B(objI);
                    } else {
                        objI = new f(pagerState);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    lVar4 = lVarV;
                    androidx.compose.ui.d dVar6 = dVar2;
                    b((f) objI, iO, dVar6, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    i26 = iO;
                    dVar3 = dVar6;
                    lVar5 = lVar3;
                    j14 = jP;
                    j15 = jP2;
                    f16 = fG;
                    f17 = f14;
                    f18 = f15;
                    g4Var2 = g4VarF;
                }
                w2VarX = lVar4.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(pagerState, dVar3, i26, lVar5, j14, j15, f16, f17, f18, g4Var2, i12, i13));
                }
            }
            i14 |= 3072;
            lVar3 = lVar;
            if ((i12 & 57344) != 0) {
                i14 |= ((i13 & 16) == 0 || !lVarV.s(j11)) ? PKIFailureInfo.certRevoked : 16384;
            }
            if ((i12 & 458752) == 0) {
                j13 = j12;
                if ((i13 & 32) == 0) {
                    i27 = 65536;
                } else {
                    i27 = 65536;
                }
                i14 |= i27;
            } else {
                j13 = j12;
            }
            i17 = i13 & 64;
            if (i17 != 0) {
                if ((i12 & 3670016) == 0) {
                    fG = f11;
                    if (lVarV.q(fG)) {
                        i18 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i18 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i18;
                }
                i19 = 29360128;
                if ((i12 & 29360128) != 0) {
                    i14 |= ((i13 & 128) == 0 || !lVarV.q(f12)) ? 4194304 : 8388608;
                }
                i21 = 234881024;
                if ((i12 & 234881024) != 0) {
                    i14 |= ((i13 & 256) == 0 || !lVarV.q(f13)) ? 33554432 : 67108864;
                }
                i22 = 1879048192;
                if ((i12 & 1879048192) != 0) {
                    i14 |= ((i13 & 512) == 0 || !lVarV.n(g4Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i14 & 1533916891) == 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            iO = pagerState.o();
                        }
                        if (i15 != 0) {
                            lVar3 = a.f84191c;
                        }
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                            jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        } else {
                            jP = j11;
                        }
                        if ((i13 & 32) != 0) {
                            jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -458753;
                        } else {
                            jP2 = j13;
                        }
                        if (i17 != 0) {
                            fG = w4.h.g(8);
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                            f14 = fG;
                        } else {
                            f14 = f12;
                        }
                        if ((i13 & 256) != 0) {
                            i23 = i14 & (-234881025);
                            f15 = fG;
                        } else {
                            i23 = i14;
                            f15 = f13;
                        }
                        if ((i13 & 512) != 0) {
                            i24 = 3670016;
                            i14 = i23 & (-1879048193);
                            g4VarF = a2.g.f();
                        } else {
                            i24 = 3670016;
                            g4VarF = g4Var;
                            i14 = i23;
                        }
                        i25 = 4;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            iO = pagerState.o();
                        }
                        if (i15 != 0) {
                            lVar3 = a.f84191c;
                        }
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                            jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        } else {
                            jP = j11;
                        }
                        if ((i13 & 32) != 0) {
                            jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -458753;
                        } else {
                            jP2 = j13;
                        }
                        if (i17 != 0) {
                            fG = w4.h.g(8);
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                            f14 = fG;
                        } else {
                            f14 = f12;
                        }
                        if ((i13 & 256) != 0) {
                            i23 = i14 & (-234881025);
                            f15 = fG;
                        } else {
                            i23 = i14;
                            f15 = f13;
                        }
                        if ((i13 & 512) != 0) {
                            i24 = 3670016;
                            i14 = i23 & (-1879048193);
                            g4VarF = a2.g.f();
                        } else {
                            i24 = 3670016;
                            g4VarF = g4Var;
                            i14 = i23;
                        }
                        i25 = 4;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
                    }
                    lVarV.H(-1599583166);
                    if ((i14 & 14) == i25) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new f(pagerState);
                        lVarV.B(objI);
                    } else {
                        objI = new f(pagerState);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    lVar4 = lVarV;
                    androidx.compose.ui.d dVar7 = dVar2;
                    b((f) objI, iO, dVar7, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    i26 = iO;
                    dVar3 = dVar7;
                    lVar5 = lVar3;
                    j14 = jP;
                    j15 = jP2;
                    f16 = fG;
                    f17 = f14;
                    f18 = f15;
                    g4Var2 = g4VarF;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            iO = pagerState.o();
                        }
                        if (i15 != 0) {
                            lVar3 = a.f84191c;
                        }
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                            jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        } else {
                            jP = j11;
                        }
                        if ((i13 & 32) != 0) {
                            jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -458753;
                        } else {
                            jP2 = j13;
                        }
                        if (i17 != 0) {
                            fG = w4.h.g(8);
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                            f14 = fG;
                        } else {
                            f14 = f12;
                        }
                        if ((i13 & 256) != 0) {
                            i23 = i14 & (-234881025);
                            f15 = fG;
                        } else {
                            i23 = i14;
                            f15 = f13;
                        }
                        if ((i13 & 512) != 0) {
                            i24 = 3670016;
                            i14 = i23 & (-1879048193);
                            g4VarF = a2.g.f();
                        } else {
                            i24 = 3670016;
                            g4VarF = g4Var;
                            i14 = i23;
                        }
                        i25 = 4;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            iO = pagerState.o();
                        }
                        if (i15 != 0) {
                            lVar3 = a.f84191c;
                        }
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                            jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        } else {
                            jP = j11;
                        }
                        if ((i13 & 32) != 0) {
                            jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -458753;
                        } else {
                            jP2 = j13;
                        }
                        if (i17 != 0) {
                            fG = w4.h.g(8);
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                            f14 = fG;
                        } else {
                            f14 = f12;
                        }
                        if ((i13 & 256) != 0) {
                            i23 = i14 & (-234881025);
                            f15 = fG;
                        } else {
                            i23 = i14;
                            f15 = f13;
                        }
                        if ((i13 & 512) != 0) {
                            i24 = 3670016;
                            i14 = i23 & (-1879048193);
                            g4VarF = a2.g.f();
                        } else {
                            i24 = 3670016;
                            g4VarF = g4Var;
                            i14 = i23;
                        }
                        i25 = 4;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
                    }
                    lVarV.H(-1599583166);
                    if ((i14 & 14) == i25) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new f(pagerState);
                        lVarV.B(objI);
                    } else {
                        objI = new f(pagerState);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    lVar4 = lVarV;
                    androidx.compose.ui.d dVar8 = dVar2;
                    b((f) objI, iO, dVar8, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    i26 = iO;
                    dVar3 = dVar8;
                    lVar5 = lVar3;
                    j14 = jP;
                    j15 = jP2;
                    f16 = fG;
                    f17 = f14;
                    f18 = f15;
                    g4Var2 = g4VarF;
                }
                w2VarX = lVar4.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(pagerState, dVar3, i26, lVar5, j14, j15, f16, f17, f18, g4Var2, i12, i13));
                }
            }
            i14 |= 1572864;
            fG = f11;
            i19 = 29360128;
            if ((i12 & 29360128) != 0) {
                i14 |= ((i13 & 128) == 0 || !lVarV.q(f12)) ? 4194304 : 8388608;
            }
            i21 = 234881024;
            if ((i12 & 234881024) != 0) {
                i14 |= ((i13 & 256) == 0 || !lVarV.q(f13)) ? 33554432 : 67108864;
            }
            i22 = 1879048192;
            if ((i12 & 1879048192) != 0) {
                i14 |= ((i13 & 512) == 0 || !lVarV.n(g4Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i14 & 1533916891) == 306783378) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        iO = pagerState.o();
                    }
                    if (i15 != 0) {
                        lVar3 = a.f84191c;
                    }
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    } else {
                        jP = j11;
                    }
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j13;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    } else {
                        f14 = f12;
                    }
                    if ((i13 & 256) != 0) {
                        i23 = i14 & (-234881025);
                        f15 = fG;
                    } else {
                        i23 = i14;
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i24 = 3670016;
                        i14 = i23 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i24 = 3670016;
                        g4VarF = g4Var;
                        i14 = i23;
                    }
                    i25 = 4;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        iO = pagerState.o();
                    }
                    if (i15 != 0) {
                        lVar3 = a.f84191c;
                    }
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    } else {
                        jP = j11;
                    }
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j13;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    } else {
                        f14 = f12;
                    }
                    if ((i13 & 256) != 0) {
                        i23 = i14 & (-234881025);
                        f15 = fG;
                    } else {
                        i23 = i14;
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i24 = 3670016;
                        i14 = i23 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i24 = 3670016;
                        g4VarF = g4Var;
                        i14 = i23;
                    }
                    i25 = 4;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
                }
                lVarV.H(-1599583166);
                if ((i14 & 14) == i25) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new f(pagerState);
                    lVarV.B(objI);
                } else {
                    objI = new f(pagerState);
                    lVarV.B(objI);
                }
                lVarV.T();
                lVar4 = lVarV;
                androidx.compose.ui.d dVar9 = dVar2;
                b((f) objI, iO, dVar9, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                i26 = iO;
                dVar3 = dVar9;
                lVar5 = lVar3;
                j14 = jP;
                j15 = jP2;
                f16 = fG;
                f17 = f14;
                f18 = f15;
                g4Var2 = g4VarF;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        iO = pagerState.o();
                    }
                    if (i15 != 0) {
                        lVar3 = a.f84191c;
                    }
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    } else {
                        jP = j11;
                    }
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j13;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    } else {
                        f14 = f12;
                    }
                    if ((i13 & 256) != 0) {
                        i23 = i14 & (-234881025);
                        f15 = fG;
                    } else {
                        i23 = i14;
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i24 = 3670016;
                        i14 = i23 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i24 = 3670016;
                        g4VarF = g4Var;
                        i14 = i23;
                    }
                    i25 = 4;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        iO = pagerState.o();
                    }
                    if (i15 != 0) {
                        lVar3 = a.f84191c;
                    }
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    } else {
                        jP = j11;
                    }
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j13;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    } else {
                        f14 = f12;
                    }
                    if ((i13 & 256) != 0) {
                        i23 = i14 & (-234881025);
                        f15 = fG;
                    } else {
                        i23 = i14;
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i24 = 3670016;
                        i14 = i23 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i24 = 3670016;
                        g4VarF = g4Var;
                        i14 = i23;
                    }
                    i25 = 4;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
                }
                lVarV.H(-1599583166);
                if ((i14 & 14) == i25) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new f(pagerState);
                    lVarV.B(objI);
                } else {
                    objI = new f(pagerState);
                    lVarV.B(objI);
                }
                lVarV.T();
                lVar4 = lVarV;
                androidx.compose.ui.d dVar10 = dVar2;
                b((f) objI, iO, dVar10, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                i26 = iO;
                dVar3 = dVar10;
                lVar5 = lVar3;
                j14 = jP;
                j15 = jP2;
                f16 = fG;
                f17 = f14;
                f18 = f15;
                g4Var2 = g4VarF;
            }
            w2VarX = lVar4.x();
            if (w2VarX != null) {
                w2VarX.a(new b(pagerState, dVar3, i26, lVar5, j14, j15, f16, f17, f18, g4Var2, i12, i13));
            }
        }
        i14 |= 48;
        dVar2 = dVar;
        if ((i12 & 896) == 0) {
            if ((i13 & 4) == 0) {
                iO = i11;
                if (lVarV.r(iO)) {
                }
                i14 |= i29;
            } else {
                iO = i11;
            }
            i14 |= i29;
        } else {
            iO = i11;
        }
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i12 & 7168) == 0) {
                lVar3 = lVar;
                if (lVarV.K(lVar3)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            if ((i12 & 57344) != 0) {
                i14 |= ((i13 & 16) == 0 || !lVarV.s(j11)) ? PKIFailureInfo.certRevoked : 16384;
            }
            if ((i12 & 458752) == 0) {
                j13 = j12;
                if ((i13 & 32) == 0) {
                    i27 = 65536;
                } else {
                    i27 = 65536;
                }
                i14 |= i27;
            } else {
                j13 = j12;
            }
            i17 = i13 & 64;
            if (i17 != 0) {
                if ((i12 & 3670016) == 0) {
                    fG = f11;
                    if (lVarV.q(fG)) {
                        i18 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i18 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i18;
                }
                i19 = 29360128;
                if ((i12 & 29360128) != 0) {
                    i14 |= ((i13 & 128) == 0 || !lVarV.q(f12)) ? 4194304 : 8388608;
                }
                i21 = 234881024;
                if ((i12 & 234881024) != 0) {
                    i14 |= ((i13 & 256) == 0 || !lVarV.q(f13)) ? 33554432 : 67108864;
                }
                i22 = 1879048192;
                if ((i12 & 1879048192) != 0) {
                    i14 |= ((i13 & 512) == 0 || !lVarV.n(g4Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i14 & 1533916891) == 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            iO = pagerState.o();
                        }
                        if (i15 != 0) {
                            lVar3 = a.f84191c;
                        }
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                            jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        } else {
                            jP = j11;
                        }
                        if ((i13 & 32) != 0) {
                            jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -458753;
                        } else {
                            jP2 = j13;
                        }
                        if (i17 != 0) {
                            fG = w4.h.g(8);
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                            f14 = fG;
                        } else {
                            f14 = f12;
                        }
                        if ((i13 & 256) != 0) {
                            i23 = i14 & (-234881025);
                            f15 = fG;
                        } else {
                            i23 = i14;
                            f15 = f13;
                        }
                        if ((i13 & 512) != 0) {
                            i24 = 3670016;
                            i14 = i23 & (-1879048193);
                            g4VarF = a2.g.f();
                        } else {
                            i24 = 3670016;
                            g4VarF = g4Var;
                            i14 = i23;
                        }
                        i25 = 4;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            iO = pagerState.o();
                        }
                        if (i15 != 0) {
                            lVar3 = a.f84191c;
                        }
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                            jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        } else {
                            jP = j11;
                        }
                        if ((i13 & 32) != 0) {
                            jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -458753;
                        } else {
                            jP2 = j13;
                        }
                        if (i17 != 0) {
                            fG = w4.h.g(8);
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                            f14 = fG;
                        } else {
                            f14 = f12;
                        }
                        if ((i13 & 256) != 0) {
                            i23 = i14 & (-234881025);
                            f15 = fG;
                        } else {
                            i23 = i14;
                            f15 = f13;
                        }
                        if ((i13 & 512) != 0) {
                            i24 = 3670016;
                            i14 = i23 & (-1879048193);
                            g4VarF = a2.g.f();
                        } else {
                            i24 = 3670016;
                            g4VarF = g4Var;
                            i14 = i23;
                        }
                        i25 = 4;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
                    }
                    lVarV.H(-1599583166);
                    if ((i14 & 14) == i25) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new f(pagerState);
                        lVarV.B(objI);
                    } else {
                        objI = new f(pagerState);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    lVar4 = lVarV;
                    androidx.compose.ui.d dVar11 = dVar2;
                    b((f) objI, iO, dVar11, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    i26 = iO;
                    dVar3 = dVar11;
                    lVar5 = lVar3;
                    j14 = jP;
                    j15 = jP2;
                    f16 = fG;
                    f17 = f14;
                    f18 = f15;
                    g4Var2 = g4VarF;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            iO = pagerState.o();
                        }
                        if (i15 != 0) {
                            lVar3 = a.f84191c;
                        }
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                            jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        } else {
                            jP = j11;
                        }
                        if ((i13 & 32) != 0) {
                            jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -458753;
                        } else {
                            jP2 = j13;
                        }
                        if (i17 != 0) {
                            fG = w4.h.g(8);
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                            f14 = fG;
                        } else {
                            f14 = f12;
                        }
                        if ((i13 & 256) != 0) {
                            i23 = i14 & (-234881025);
                            f15 = fG;
                        } else {
                            i23 = i14;
                            f15 = f13;
                        }
                        if ((i13 & 512) != 0) {
                            i24 = 3670016;
                            i14 = i23 & (-1879048193);
                            g4VarF = a2.g.f();
                        } else {
                            i24 = 3670016;
                            g4VarF = g4Var;
                            i14 = i23;
                        }
                        i25 = 4;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            iO = pagerState.o();
                        }
                        if (i15 != 0) {
                            lVar3 = a.f84191c;
                        }
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                            jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        } else {
                            jP = j11;
                        }
                        if ((i13 & 32) != 0) {
                            jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -458753;
                        } else {
                            jP2 = j13;
                        }
                        if (i17 != 0) {
                            fG = w4.h.g(8);
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                            f14 = fG;
                        } else {
                            f14 = f12;
                        }
                        if ((i13 & 256) != 0) {
                            i23 = i14 & (-234881025);
                            f15 = fG;
                        } else {
                            i23 = i14;
                            f15 = f13;
                        }
                        if ((i13 & 512) != 0) {
                            i24 = 3670016;
                            i14 = i23 & (-1879048193);
                            g4VarF = a2.g.f();
                        } else {
                            i24 = 3670016;
                            g4VarF = g4Var;
                            i14 = i23;
                        }
                        i25 = 4;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
                    }
                    lVarV.H(-1599583166);
                    if ((i14 & 14) == i25) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new f(pagerState);
                        lVarV.B(objI);
                    } else {
                        objI = new f(pagerState);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    lVar4 = lVarV;
                    androidx.compose.ui.d dVar12 = dVar2;
                    b((f) objI, iO, dVar12, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    i26 = iO;
                    dVar3 = dVar12;
                    lVar5 = lVar3;
                    j14 = jP;
                    j15 = jP2;
                    f16 = fG;
                    f17 = f14;
                    f18 = f15;
                    g4Var2 = g4VarF;
                }
                w2VarX = lVar4.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(pagerState, dVar3, i26, lVar5, j14, j15, f16, f17, f18, g4Var2, i12, i13));
                }
            }
            i14 |= 1572864;
            fG = f11;
            i19 = 29360128;
            if ((i12 & 29360128) != 0) {
                i14 |= ((i13 & 128) == 0 || !lVarV.q(f12)) ? 4194304 : 8388608;
            }
            i21 = 234881024;
            if ((i12 & 234881024) != 0) {
                i14 |= ((i13 & 256) == 0 || !lVarV.q(f13)) ? 33554432 : 67108864;
            }
            i22 = 1879048192;
            if ((i12 & 1879048192) != 0) {
                i14 |= ((i13 & 512) == 0 || !lVarV.n(g4Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i14 & 1533916891) == 306783378) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        iO = pagerState.o();
                    }
                    if (i15 != 0) {
                        lVar3 = a.f84191c;
                    }
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    } else {
                        jP = j11;
                    }
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j13;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    } else {
                        f14 = f12;
                    }
                    if ((i13 & 256) != 0) {
                        i23 = i14 & (-234881025);
                        f15 = fG;
                    } else {
                        i23 = i14;
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i24 = 3670016;
                        i14 = i23 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i24 = 3670016;
                        g4VarF = g4Var;
                        i14 = i23;
                    }
                    i25 = 4;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        iO = pagerState.o();
                    }
                    if (i15 != 0) {
                        lVar3 = a.f84191c;
                    }
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    } else {
                        jP = j11;
                    }
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j13;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    } else {
                        f14 = f12;
                    }
                    if ((i13 & 256) != 0) {
                        i23 = i14 & (-234881025);
                        f15 = fG;
                    } else {
                        i23 = i14;
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i24 = 3670016;
                        i14 = i23 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i24 = 3670016;
                        g4VarF = g4Var;
                        i14 = i23;
                    }
                    i25 = 4;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
                }
                lVarV.H(-1599583166);
                if ((i14 & 14) == i25) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new f(pagerState);
                    lVarV.B(objI);
                } else {
                    objI = new f(pagerState);
                    lVarV.B(objI);
                }
                lVarV.T();
                lVar4 = lVarV;
                androidx.compose.ui.d dVar13 = dVar2;
                b((f) objI, iO, dVar13, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                i26 = iO;
                dVar3 = dVar13;
                lVar5 = lVar3;
                j14 = jP;
                j15 = jP2;
                f16 = fG;
                f17 = f14;
                f18 = f15;
                g4Var2 = g4VarF;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        iO = pagerState.o();
                    }
                    if (i15 != 0) {
                        lVar3 = a.f84191c;
                    }
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    } else {
                        jP = j11;
                    }
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j13;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    } else {
                        f14 = f12;
                    }
                    if ((i13 & 256) != 0) {
                        i23 = i14 & (-234881025);
                        f15 = fG;
                    } else {
                        i23 = i14;
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i24 = 3670016;
                        i14 = i23 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i24 = 3670016;
                        g4VarF = g4Var;
                        i14 = i23;
                    }
                    i25 = 4;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        iO = pagerState.o();
                    }
                    if (i15 != 0) {
                        lVar3 = a.f84191c;
                    }
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    } else {
                        jP = j11;
                    }
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j13;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    } else {
                        f14 = f12;
                    }
                    if ((i13 & 256) != 0) {
                        i23 = i14 & (-234881025);
                        f15 = fG;
                    } else {
                        i23 = i14;
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i24 = 3670016;
                        i14 = i23 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i24 = 3670016;
                        g4VarF = g4Var;
                        i14 = i23;
                    }
                    i25 = 4;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
                }
                lVarV.H(-1599583166);
                if ((i14 & 14) == i25) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new f(pagerState);
                    lVarV.B(objI);
                } else {
                    objI = new f(pagerState);
                    lVarV.B(objI);
                }
                lVarV.T();
                lVar4 = lVarV;
                androidx.compose.ui.d dVar14 = dVar2;
                b((f) objI, iO, dVar14, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                i26 = iO;
                dVar3 = dVar14;
                lVar5 = lVar3;
                j14 = jP;
                j15 = jP2;
                f16 = fG;
                f17 = f14;
                f18 = f15;
                g4Var2 = g4VarF;
            }
            w2VarX = lVar4.x();
            if (w2VarX != null) {
                w2VarX.a(new b(pagerState, dVar3, i26, lVar5, j14, j15, f16, f17, f18, g4Var2, i12, i13));
            }
        }
        i14 |= 3072;
        lVar3 = lVar;
        if ((i12 & 57344) != 0) {
            i14 |= ((i13 & 16) == 0 || !lVarV.s(j11)) ? PKIFailureInfo.certRevoked : 16384;
        }
        if ((i12 & 458752) == 0) {
            j13 = j12;
            if ((i13 & 32) == 0) {
                i27 = 65536;
            } else {
                i27 = 65536;
            }
            i14 |= i27;
        } else {
            j13 = j12;
        }
        i17 = i13 & 64;
        if (i17 != 0) {
            if ((i12 & 3670016) == 0) {
                fG = f11;
                if (lVarV.q(fG)) {
                    i18 = PKIFailureInfo.badCertTemplate;
                } else {
                    i18 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i18;
            }
            i19 = 29360128;
            if ((i12 & 29360128) != 0) {
                i14 |= ((i13 & 128) == 0 || !lVarV.q(f12)) ? 4194304 : 8388608;
            }
            i21 = 234881024;
            if ((i12 & 234881024) != 0) {
                i14 |= ((i13 & 256) == 0 || !lVarV.q(f13)) ? 33554432 : 67108864;
            }
            i22 = 1879048192;
            if ((i12 & 1879048192) != 0) {
                i14 |= ((i13 & 512) == 0 || !lVarV.n(g4Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i14 & 1533916891) == 306783378) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        iO = pagerState.o();
                    }
                    if (i15 != 0) {
                        lVar3 = a.f84191c;
                    }
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    } else {
                        jP = j11;
                    }
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j13;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    } else {
                        f14 = f12;
                    }
                    if ((i13 & 256) != 0) {
                        i23 = i14 & (-234881025);
                        f15 = fG;
                    } else {
                        i23 = i14;
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i24 = 3670016;
                        i14 = i23 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i24 = 3670016;
                        g4VarF = g4Var;
                        i14 = i23;
                    }
                    i25 = 4;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        iO = pagerState.o();
                    }
                    if (i15 != 0) {
                        lVar3 = a.f84191c;
                    }
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    } else {
                        jP = j11;
                    }
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j13;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    } else {
                        f14 = f12;
                    }
                    if ((i13 & 256) != 0) {
                        i23 = i14 & (-234881025);
                        f15 = fG;
                    } else {
                        i23 = i14;
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i24 = 3670016;
                        i14 = i23 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i24 = 3670016;
                        g4VarF = g4Var;
                        i14 = i23;
                    }
                    i25 = 4;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
                }
                lVarV.H(-1599583166);
                if ((i14 & 14) == i25) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new f(pagerState);
                    lVarV.B(objI);
                } else {
                    objI = new f(pagerState);
                    lVarV.B(objI);
                }
                lVarV.T();
                lVar4 = lVarV;
                androidx.compose.ui.d dVar15 = dVar2;
                b((f) objI, iO, dVar15, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                i26 = iO;
                dVar3 = dVar15;
                lVar5 = lVar3;
                j14 = jP;
                j15 = jP2;
                f16 = fG;
                f17 = f14;
                f18 = f15;
                g4Var2 = g4VarF;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        iO = pagerState.o();
                    }
                    if (i15 != 0) {
                        lVar3 = a.f84191c;
                    }
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    } else {
                        jP = j11;
                    }
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j13;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    } else {
                        f14 = f12;
                    }
                    if ((i13 & 256) != 0) {
                        i23 = i14 & (-234881025);
                        f15 = fG;
                    } else {
                        i23 = i14;
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i24 = 3670016;
                        i14 = i23 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i24 = 3670016;
                        g4VarF = g4Var;
                        i14 = i23;
                    }
                    i25 = 4;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        iO = pagerState.o();
                    }
                    if (i15 != 0) {
                        lVar3 = a.f84191c;
                    }
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    } else {
                        jP = j11;
                    }
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j13;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    } else {
                        f14 = f12;
                    }
                    if ((i13 & 256) != 0) {
                        i23 = i14 & (-234881025);
                        f15 = fG;
                    } else {
                        i23 = i14;
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i24 = 3670016;
                        i14 = i23 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i24 = 3670016;
                        g4VarF = g4Var;
                        i14 = i23;
                    }
                    i25 = 4;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
                }
                lVarV.H(-1599583166);
                if ((i14 & 14) == i25) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new f(pagerState);
                    lVarV.B(objI);
                } else {
                    objI = new f(pagerState);
                    lVarV.B(objI);
                }
                lVarV.T();
                lVar4 = lVarV;
                androidx.compose.ui.d dVar16 = dVar2;
                b((f) objI, iO, dVar16, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                i26 = iO;
                dVar3 = dVar16;
                lVar5 = lVar3;
                j14 = jP;
                j15 = jP2;
                f16 = fG;
                f17 = f14;
                f18 = f15;
                g4Var2 = g4VarF;
            }
            w2VarX = lVar4.x();
            if (w2VarX != null) {
                w2VarX.a(new b(pagerState, dVar3, i26, lVar5, j14, j15, f16, f17, f18, g4Var2, i12, i13));
            }
        }
        i14 |= 1572864;
        fG = f11;
        i19 = 29360128;
        if ((i12 & 29360128) != 0) {
            i14 |= ((i13 & 128) == 0 || !lVarV.q(f12)) ? 4194304 : 8388608;
        }
        i21 = 234881024;
        if ((i12 & 234881024) != 0) {
            i14 |= ((i13 & 256) == 0 || !lVarV.q(f13)) ? 33554432 : 67108864;
        }
        i22 = 1879048192;
        if ((i12 & 1879048192) != 0) {
            i14 |= ((i13 & 512) == 0 || !lVarV.n(g4Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
        }
        if ((i14 & 1533916891) == 306783378) {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i28 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if ((i13 & 4) != 0) {
                    i14 &= -897;
                    iO = pagerState.o();
                }
                if (i15 != 0) {
                    lVar3 = a.f84191c;
                }
                if ((i13 & 16) != 0) {
                    i14 &= -57345;
                    jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                } else {
                    jP = j11;
                }
                if ((i13 & 32) != 0) {
                    jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i14 &= -458753;
                } else {
                    jP2 = j13;
                }
                if (i17 != 0) {
                    fG = w4.h.g(8);
                }
                if ((i13 & 128) != 0) {
                    i14 &= -29360129;
                    f14 = fG;
                } else {
                    f14 = f12;
                }
                if ((i13 & 256) != 0) {
                    i23 = i14 & (-234881025);
                    f15 = fG;
                } else {
                    i23 = i14;
                    f15 = f13;
                }
                if ((i13 & 512) != 0) {
                    i24 = 3670016;
                    i14 = i23 & (-1879048193);
                    g4VarF = a2.g.f();
                } else {
                    i24 = 3670016;
                    g4VarF = g4Var;
                    i14 = i23;
                }
                i25 = 4;
            } else {
                if (i28 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if ((i13 & 4) != 0) {
                    i14 &= -897;
                    iO = pagerState.o();
                }
                if (i15 != 0) {
                    lVar3 = a.f84191c;
                }
                if ((i13 & 16) != 0) {
                    i14 &= -57345;
                    jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                } else {
                    jP = j11;
                }
                if ((i13 & 32) != 0) {
                    jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i14 &= -458753;
                } else {
                    jP2 = j13;
                }
                if (i17 != 0) {
                    fG = w4.h.g(8);
                }
                if ((i13 & 128) != 0) {
                    i14 &= -29360129;
                    f14 = fG;
                } else {
                    f14 = f12;
                }
                if ((i13 & 256) != 0) {
                    i23 = i14 & (-234881025);
                    f15 = fG;
                } else {
                    i23 = i14;
                    f15 = f13;
                }
                if ((i13 & 512) != 0) {
                    i24 = 3670016;
                    i14 = i23 & (-1879048193);
                    g4VarF = a2.g.f();
                } else {
                    i24 = 3670016;
                    g4VarF = g4Var;
                    i14 = i23;
                }
                i25 = 4;
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
            }
            lVarV.H(-1599583166);
            if ((i14 & 14) == i25) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI = lVarV.I();
            if (z11) {
                objI = new f(pagerState);
                lVarV.B(objI);
            } else {
                objI = new f(pagerState);
                lVarV.B(objI);
            }
            lVarV.T();
            lVar4 = lVarV;
            androidx.compose.ui.d dVar17 = dVar2;
            b((f) objI, iO, dVar17, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            i26 = iO;
            dVar3 = dVar17;
            lVar5 = lVar3;
            j14 = jP;
            j15 = jP2;
            f16 = fG;
            f17 = f14;
            f18 = f15;
            g4Var2 = g4VarF;
        } else {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i28 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if ((i13 & 4) != 0) {
                    i14 &= -897;
                    iO = pagerState.o();
                }
                if (i15 != 0) {
                    lVar3 = a.f84191c;
                }
                if ((i13 & 16) != 0) {
                    i14 &= -57345;
                    jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                } else {
                    jP = j11;
                }
                if ((i13 & 32) != 0) {
                    jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i14 &= -458753;
                } else {
                    jP2 = j13;
                }
                if (i17 != 0) {
                    fG = w4.h.g(8);
                }
                if ((i13 & 128) != 0) {
                    i14 &= -29360129;
                    f14 = fG;
                } else {
                    f14 = f12;
                }
                if ((i13 & 256) != 0) {
                    i23 = i14 & (-234881025);
                    f15 = fG;
                } else {
                    i23 = i14;
                    f15 = f13;
                }
                if ((i13 & 512) != 0) {
                    i24 = 3670016;
                    i14 = i23 & (-1879048193);
                    g4VarF = a2.g.f();
                } else {
                    i24 = 3670016;
                    g4VarF = g4Var;
                    i14 = i23;
                }
                i25 = 4;
            } else {
                if (i28 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if ((i13 & 4) != 0) {
                    i14 &= -897;
                    iO = pagerState.o();
                }
                if (i15 != 0) {
                    lVar3 = a.f84191c;
                }
                if ((i13 & 16) != 0) {
                    i14 &= -57345;
                    jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                } else {
                    jP = j11;
                }
                if ((i13 & 32) != 0) {
                    jP2 = p1.p(jP, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i14 &= -458753;
                } else {
                    jP2 = j13;
                }
                if (i17 != 0) {
                    fG = w4.h.g(8);
                }
                if ((i13 & 128) != 0) {
                    i14 &= -29360129;
                    f14 = fG;
                } else {
                    f14 = f12;
                }
                if ((i13 & 256) != 0) {
                    i23 = i14 & (-234881025);
                    f15 = fG;
                } else {
                    i23 = i14;
                    f15 = f13;
                }
                if ((i13 & 512) != 0) {
                    i24 = 3670016;
                    i14 = i23 & (-1879048193);
                    g4VarF = a2.g.f();
                } else {
                    i24 = 3670016;
                    g4VarF = g4Var;
                    i14 = i23;
                }
                i25 = 4;
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(51399291, i14, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
            }
            lVarV.H(-1599583166);
            if ((i14 & 14) == i25) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI = lVarV.I();
            if (z11) {
                objI = new f(pagerState);
                lVarV.B(objI);
            } else {
                objI = new f(pagerState);
                lVarV.B(objI);
            }
            lVarV.T();
            lVar4 = lVarV;
            androidx.compose.ui.d dVar18 = dVar2;
            b((f) objI, iO, dVar18, lVar3, jP, jP2, fG, f14, f15, g4VarF, lVar4, (i21 & i14) | (i19 & i14) | (i24 & i14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i22 & i14), 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            i26 = iO;
            dVar3 = dVar18;
            lVar5 = lVar3;
            j14 = jP;
            j15 = jP2;
            f16 = fG;
            f17 = f14;
            f18 = f15;
            g4Var2 = g4VarF;
        }
        w2VarX = lVar4.x();
        if (w2VarX != null) {
            w2VarX.a(new b(pagerState, dVar3, i26, lVar5, j14, j15, f16, f17, f18, g4Var2, i12, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x011b  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:105:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0131  */
    /* JADX WARN: Code duplicated, block: B:111:0x013d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155  */
    /* JADX WARN: Code duplicated, block: B:117:0x016b  */
    /* JADX WARN: Code duplicated, block: B:136:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:145:0x01de  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:148:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:151:0x0207  */
    /* JADX WARN: Code duplicated, block: B:154:0x020e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0213  */
    /* JADX WARN: Code duplicated, block: B:158:0x0219  */
    /* JADX WARN: Code duplicated, block: B:160:0x0228  */
    /* JADX WARN: Code duplicated, block: B:163:0x0238  */
    /* JADX WARN: Code duplicated, block: B:164:0x0246  */
    /* JADX WARN: Code duplicated, block: B:167:0x029d  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:174:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:176:0x02da  */
    /* JADX WARN: Code duplicated, block: B:179:0x0337  */
    /* JADX WARN: Code duplicated, block: B:182:0x0343  */
    /* JADX WARN: Code duplicated, block: B:183:0x0347  */
    /* JADX WARN: Code duplicated, block: B:186:0x0366  */
    /* JADX WARN: Code duplicated, block: B:188:0x0374  */
    /* JADX WARN: Code duplicated, block: B:191:0x03a6 A[LOOP:0: B:190:0x03a4->B:191:0x03a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:194:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:197:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:201:0x0409  */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    public static final void b(h hVar, int i11, androidx.compose.ui.d dVar, l<? super Integer, Integer> lVar, long j11, long j12, float f11, float f12, float f13, g4 g4Var, p020r2.l lVar2, int i12, int i13) {
        int i14;
        androidx.compose.ui.d dVar2;
        int i15;
        l<? super Integer, Integer> lVar3;
        int i16;
        long jP;
        int i17;
        float fG;
        int i18;
        float f14;
        long j13;
        long jP2;
        float f15;
        int i19;
        g4 g4VarF;
        float f16;
        long j14;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        p<b4.g, Integer, h0> pVarB;
        int iA2;
        wn0.a<b4.g> aVarA2;
        p020r2.l lVarA2;
        p<b4.g, Integer, h0> pVarB2;
        androidx.compose.ui.d dVarC;
        int i21;
        androidx.compose.ui.d dVarC2;
        long j15;
        l<? super Integer, Integer> lVar4;
        float f17;
        long j16;
        float f18;
        g4 g4Var2;
        float f19;
        androidx.compose.ui.d dVar3;
        w2 w2VarX;
        int i22;
        int i23;
        p020r2.l lVarV = lVar2.v(1511110220);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (lVarV.n(hVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            i14 |= lVarV.r(i11) ? 32 : 16;
        }
        int i24 = i13 & 4;
        if (i24 == 0) {
            if ((i12 & 896) == 0) {
                dVar2 = dVar;
                i14 |= lVarV.n(dVar2) ? 256 : 128;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i12 & 7168) == 0) {
                    lVar3 = lVar;
                    if (lVarV.K(lVar3)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                if ((57344 & i12) == 0) {
                    if ((i13 & 16) == 0) {
                        jP = j11;
                        if (lVarV.s(jP)) {
                            i23 = 16384;
                        }
                        i14 |= i23;
                    } else {
                        jP = j11;
                    }
                    i23 = PKIFailureInfo.certRevoked;
                    i14 |= i23;
                } else {
                    jP = j11;
                }
                if ((458752 & i12) != 0) {
                    if ((i13 & 32) == 0 || !lVarV.s(j12)) {
                        i22 = 65536;
                    } else {
                        i22 = 131072;
                    }
                    i14 |= i22;
                }
                i17 = i13 & 64;
                if (i17 != 0) {
                    i14 |= 1572864;
                    fG = f11;
                } else {
                    fG = f11;
                    if ((i12 & 3670016) == 0) {
                        if (lVarV.q(fG)) {
                            i18 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i18 = PKIFailureInfo.signerNotTrusted;
                        }
                        i14 |= i18;
                    }
                }
                if ((i12 & 29360128) == 0) {
                    if ((i13 & 128) == 0) {
                        f14 = f12;
                        int i25 = lVarV.q(f14) ? 8388608 : 4194304;
                        i14 |= i25;
                    } else {
                        f14 = f12;
                    }
                    i14 |= i25;
                } else {
                    f14 = f12;
                }
                if ((i12 & 234881024) != 0) {
                    i14 |= ((i13 & 256) == 0 || !lVarV.q(f13)) ? 33554432 : 67108864;
                }
                if ((1879048192 & i12) != 0) {
                    i14 |= ((i13 & 512) == 0 || !lVarV.n(g4Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i14 & 1533916891) == 306783378 || !lVarV.b()) {
                    lVarV.L();
                    if ((i12 & 1) != 0 || lVarV.k()) {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i15 != 0) {
                            lVar3 = c.f84204c;
                        }
                        if ((i13 & 16) != 0) {
                            jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -57345;
                        }
                        j13 = jP;
                        if ((i13 & 32) != 0) {
                            jP2 = p1.p(j13, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i14 &= -458753;
                        } else {
                            jP2 = j12;
                        }
                        if (i17 != 0) {
                            fG = w4.h.g(8);
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                            f14 = fG;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            f15 = fG;
                        } else {
                            f15 = f13;
                        }
                        if ((i13 & 512) != 0) {
                            i19 = i14 & (-1879048193);
                            g4VarF = a2.g.f();
                        } else {
                            i19 = i14;
                            g4VarF = g4Var;
                        }
                        f16 = f15;
                        j14 = jP2;
                        jP = j13;
                    } else {
                        lVarV.j();
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                        }
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                        }
                        if ((i13 & 128) != 0) {
                            i14 &= -29360129;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                        }
                        if ((i13 & 512) != 0) {
                            i14 &= -1879048193;
                        }
                        int i26 = i14;
                        f14 = f14;
                        fG = fG;
                        i19 = i26;
                        j14 = j12;
                        f16 = f13;
                        g4VarF = g4Var;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(1511110220, i19, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:395)");
                    }
                    int iI1 = ((w4.d) lVarV.U(z0.g())).i1(fG);
                    int iI2 = ((w4.d) lVarV.U(z0.g())).i1(f16);
                    d3.c.Companion companion = d3.c.INSTANCE;
                    d3.c cVarM = companion.m();
                    lVarV.H(733328855);
                    i0 i0VarJ = androidx.compose.foundation.layout.g.j(cVarM, false, lVarV, 6);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC = lVarV.c();
                    b4.g.Companion companion2 = b4.g.INSTANCE;
                    aVarA = companion2.a();
                    q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVar2);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, i0VarJ, companion2.c());
                    d4.b(lVarA, xVarC, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
                    v1.b.f fVarN = v1.b.f117444a.n(f16);
                    d3.c.b bVarG = companion.g();
                    lVarV.H(-483455358);
                    androidx.compose.ui.d.Companion companion3 = androidx.compose.ui.d.INSTANCE;
                    i0 i0VarA = v1.g.a(fVarN, bVarG, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA2 = j.a(lVarV, 0);
                    p020r2.x xVarC2 = lVarV.c();
                    float f21 = f16;
                    aVarA2 = companion2.a();
                    q<y2<b4.g>, p020r2.l, Integer, h0> qVarA2 = a0.a(companion3);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA2);
                    } else {
                        lVarV.d();
                    }
                    lVarA2 = d4.a(lVarV);
                    d4.b(lVarA2, i0VarA, companion2.c());
                    d4.b(lVarA2, xVarC2, companion2.e());
                    pVarB2 = companion2.b();
                    if (lVarA2.getInserting() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    }
                    qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.j jVar = v1.j.f117505a;
                    dVarC = androidx.compose.foundation.b.c(androidx.compose.foundation.layout.x.s(companion3, f14, fG), j14, g4VarF);
                    lVarV.H(25775080);
                    for (i21 = 0; i21 < i11; i21++) {
                        androidx.compose.foundation.layout.g.a(dVarC, lVarV, 0);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    dVarC2 = androidx.compose.ui.d.INSTANCE;
                    C1784d c1784d = new C1784d(lVar3, hVar, i11, iI2, iI1);
                    l<? super Integer, Integer> lVar5 = lVar3;
                    androidx.compose.ui.d dVarS = androidx.compose.foundation.layout.x.s(androidx.compose.foundation.layout.q.a(dVarC2, c1784d), f14, fG);
                    if (i11 > 0) {
                        dVarC2 = androidx.compose.foundation.b.c(dVarC2, jP, g4VarF);
                    }
                    androidx.compose.foundation.layout.g.a(dVarS.g(dVarC2), lVarV, 0);
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    j15 = j14;
                    lVar4 = lVar5;
                    f17 = f14;
                    j16 = jP;
                    f18 = f21;
                    g4Var2 = g4VarF;
                    f19 = fG;
                    dVar3 = dVar2;
                } else {
                    lVarV.j();
                    lVar4 = lVar3;
                    j16 = jP;
                    f19 = fG;
                    f18 = f13;
                    g4Var2 = g4Var;
                    f17 = f14;
                    dVar3 = dVar2;
                    j15 = j12;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new e(hVar, i11, dVar3, lVar4, j16, j15, f19, f17, f18, g4Var2, i12, i13));
                }
            }
            i14 |= 3072;
            lVar3 = lVar;
            if ((57344 & i12) == 0) {
                if ((i13 & 16) == 0) {
                    jP = j11;
                    if (lVarV.s(jP)) {
                        i23 = 16384;
                    }
                    i14 |= i23;
                } else {
                    jP = j11;
                }
                i23 = PKIFailureInfo.certRevoked;
                i14 |= i23;
            } else {
                jP = j11;
            }
            if ((458752 & i12) != 0) {
                if ((i13 & 32) == 0) {
                    i22 = 65536;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i17 = i13 & 64;
            if (i17 != 0) {
                i14 |= 1572864;
                fG = f11;
            } else {
                fG = f11;
                if ((i12 & 3670016) == 0) {
                    if (lVarV.q(fG)) {
                        i18 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i18 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i18;
                }
            }
            if ((i12 & 29360128) == 0) {
                if ((i13 & 128) == 0) {
                    f14 = f12;
                    if (lVarV.q(f14)) {
                    }
                    i14 |= i25;
                } else {
                    f14 = f12;
                }
                i14 |= i25;
            } else {
                f14 = f12;
            }
            if ((i12 & 234881024) != 0) {
                i14 |= ((i13 & 256) == 0 || !lVarV.q(f13)) ? 33554432 : 67108864;
            }
            if ((1879048192 & i12) != 0) {
                i14 |= ((i13 & 512) == 0 || !lVarV.n(g4Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i14 & 1533916891) == 306783378) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        lVar3 = c.f84204c;
                    }
                    if ((i13 & 16) != 0) {
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -57345;
                    }
                    j13 = jP;
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(j13, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j12;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        f15 = fG;
                    } else {
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i19 = i14 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i19 = i14;
                        g4VarF = g4Var;
                    }
                    f16 = f15;
                    j14 = jP2;
                    jP = j13;
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        lVar3 = c.f84204c;
                    }
                    if ((i13 & 16) != 0) {
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -57345;
                    }
                    j13 = jP;
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(j13, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j12;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        f15 = fG;
                    } else {
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i19 = i14 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i19 = i14;
                        g4VarF = g4Var;
                    }
                    f16 = f15;
                    j14 = jP2;
                    jP = j13;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(1511110220, i19, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:395)");
                }
                int iI3 = ((w4.d) lVarV.U(z0.g())).i1(fG);
                int iI4 = ((w4.d) lVarV.U(z0.g())).i1(f16);
                d3.c.Companion companion4 = d3.c.INSTANCE;
                d3.c cVarM2 = companion4.m();
                lVarV.H(733328855);
                i0 i0VarJ2 = androidx.compose.foundation.layout.g.j(cVarM2, false, lVarV, 6);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC3 = lVarV.c();
                b4.g.Companion companion5 = b4.g.INSTANCE;
                aVarA = companion5.a();
                q<y2<b4.g>, p020r2.l, Integer, h0> qVarA3 = a0.a(dVar2);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarJ2, companion5.c());
                d4.b(lVarA, xVarC3, companion5.e());
                pVarB = companion5.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA3.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                androidx.compose.foundation.layout.i iVar2 = androidx.compose.foundation.layout.i.f4585a;
                v1.b.f fVarN2 = v1.b.f117444a.n(f16);
                d3.c.b bVarG2 = companion4.g();
                lVarV.H(-483455358);
                androidx.compose.ui.d.Companion companion6 = androidx.compose.ui.d.INSTANCE;
                i0 i0VarA2 = v1.g.a(fVarN2, bVarG2, lVarV, 48);
                lVarV.H(-1323940314);
                iA2 = j.a(lVarV, 0);
                p020r2.x xVarC4 = lVarV.c();
                float f22 = f16;
                aVarA2 = companion5.a();
                q<y2<b4.g>, p020r2.l, Integer, h0> qVarA4 = a0.a(companion6);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = d4.a(lVarV);
                d4.b(lVarA2, i0VarA2, companion5.c());
                d4.b(lVarA2, xVarC4, companion5.e());
                pVarB2 = companion5.b();
                if (lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                qVarA4.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar2 = v1.j.f117505a;
                dVarC = androidx.compose.foundation.b.c(androidx.compose.foundation.layout.x.s(companion6, f14, fG), j14, g4VarF);
                lVarV.H(25775080);
                while (i21 < i11) {
                    androidx.compose.foundation.layout.g.a(dVarC, lVarV, 0);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                dVarC2 = androidx.compose.ui.d.INSTANCE;
                C1784d c1784d2 = new C1784d(lVar3, hVar, i11, iI4, iI3);
                l<? super Integer, Integer> lVar6 = lVar3;
                androidx.compose.ui.d dVarS2 = androidx.compose.foundation.layout.x.s(androidx.compose.foundation.layout.q.a(dVarC2, c1784d2), f14, fG);
                if (i11 > 0) {
                    dVarC2 = androidx.compose.foundation.b.c(dVarC2, jP, g4VarF);
                }
                androidx.compose.foundation.layout.g.a(dVarS2.g(dVarC2), lVarV, 0);
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                j15 = j14;
                lVar4 = lVar6;
                f17 = f14;
                j16 = jP;
                f18 = f22;
                g4Var2 = g4VarF;
                f19 = fG;
                dVar3 = dVar2;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        lVar3 = c.f84204c;
                    }
                    if ((i13 & 16) != 0) {
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -57345;
                    }
                    j13 = jP;
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(j13, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j12;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        f15 = fG;
                    } else {
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i19 = i14 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i19 = i14;
                        g4VarF = g4Var;
                    }
                    f16 = f15;
                    j14 = jP2;
                    jP = j13;
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        lVar3 = c.f84204c;
                    }
                    if ((i13 & 16) != 0) {
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -57345;
                    }
                    j13 = jP;
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(j13, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j12;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        f15 = fG;
                    } else {
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i19 = i14 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i19 = i14;
                        g4VarF = g4Var;
                    }
                    f16 = f15;
                    j14 = jP2;
                    jP = j13;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(1511110220, i19, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:395)");
                }
                int iI5 = ((w4.d) lVarV.U(z0.g())).i1(fG);
                int iI6 = ((w4.d) lVarV.U(z0.g())).i1(f16);
                d3.c.Companion companion7 = d3.c.INSTANCE;
                d3.c cVarM3 = companion7.m();
                lVarV.H(733328855);
                i0 i0VarJ3 = androidx.compose.foundation.layout.g.j(cVarM3, false, lVarV, 6);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC5 = lVarV.c();
                b4.g.Companion companion8 = b4.g.INSTANCE;
                aVarA = companion8.a();
                q<y2<b4.g>, p020r2.l, Integer, h0> qVarA5 = a0.a(dVar2);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarJ3, companion8.c());
                d4.b(lVarA, xVarC5, companion8.e());
                pVarB = companion8.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA5.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                androidx.compose.foundation.layout.i iVar3 = androidx.compose.foundation.layout.i.f4585a;
                v1.b.f fVarN3 = v1.b.f117444a.n(f16);
                d3.c.b bVarG3 = companion7.g();
                lVarV.H(-483455358);
                androidx.compose.ui.d.Companion companion9 = androidx.compose.ui.d.INSTANCE;
                i0 i0VarA3 = v1.g.a(fVarN3, bVarG3, lVarV, 48);
                lVarV.H(-1323940314);
                iA2 = j.a(lVarV, 0);
                p020r2.x xVarC6 = lVarV.c();
                float f23 = f16;
                aVarA2 = companion8.a();
                q<y2<b4.g>, p020r2.l, Integer, h0> qVarA6 = a0.a(companion9);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = d4.a(lVarV);
                d4.b(lVarA2, i0VarA3, companion8.c());
                d4.b(lVarA2, xVarC6, companion8.e());
                pVarB2 = companion8.b();
                if (lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                qVarA6.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar3 = v1.j.f117505a;
                dVarC = androidx.compose.foundation.b.c(androidx.compose.foundation.layout.x.s(companion9, f14, fG), j14, g4VarF);
                lVarV.H(25775080);
                while (i21 < i11) {
                    androidx.compose.foundation.layout.g.a(dVarC, lVarV, 0);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                dVarC2 = androidx.compose.ui.d.INSTANCE;
                C1784d c1784d3 = new C1784d(lVar3, hVar, i11, iI6, iI5);
                l<? super Integer, Integer> lVar7 = lVar3;
                androidx.compose.ui.d dVarS3 = androidx.compose.foundation.layout.x.s(androidx.compose.foundation.layout.q.a(dVarC2, c1784d3), f14, fG);
                if (i11 > 0) {
                    dVarC2 = androidx.compose.foundation.b.c(dVarC2, jP, g4VarF);
                }
                androidx.compose.foundation.layout.g.a(dVarS3.g(dVarC2), lVarV, 0);
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                j15 = j14;
                lVar4 = lVar7;
                f17 = f14;
                j16 = jP;
                f18 = f23;
                g4Var2 = g4VarF;
                f19 = fG;
                dVar3 = dVar2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new e(hVar, i11, dVar3, lVar4, j16, j15, f19, f17, f18, g4Var2, i12, i13));
            }
        }
        i14 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i12 & 7168) == 0) {
                lVar3 = lVar;
                if (lVarV.K(lVar3)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            if ((57344 & i12) == 0) {
                if ((i13 & 16) == 0) {
                    jP = j11;
                    if (lVarV.s(jP)) {
                        i23 = 16384;
                    }
                    i14 |= i23;
                } else {
                    jP = j11;
                }
                i23 = PKIFailureInfo.certRevoked;
                i14 |= i23;
            } else {
                jP = j11;
            }
            if ((458752 & i12) != 0) {
                if ((i13 & 32) == 0) {
                    i22 = 65536;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i17 = i13 & 64;
            if (i17 != 0) {
                i14 |= 1572864;
                fG = f11;
            } else {
                fG = f11;
                if ((i12 & 3670016) == 0) {
                    if (lVarV.q(fG)) {
                        i18 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i18 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i18;
                }
            }
            if ((i12 & 29360128) == 0) {
                if ((i13 & 128) == 0) {
                    f14 = f12;
                    if (lVarV.q(f14)) {
                    }
                    i14 |= i25;
                } else {
                    f14 = f12;
                }
                i14 |= i25;
            } else {
                f14 = f12;
            }
            if ((i12 & 234881024) != 0) {
                i14 |= ((i13 & 256) == 0 || !lVarV.q(f13)) ? 33554432 : 67108864;
            }
            if ((1879048192 & i12) != 0) {
                i14 |= ((i13 & 512) == 0 || !lVarV.n(g4Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i14 & 1533916891) == 306783378) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        lVar3 = c.f84204c;
                    }
                    if ((i13 & 16) != 0) {
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -57345;
                    }
                    j13 = jP;
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(j13, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j12;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        f15 = fG;
                    } else {
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i19 = i14 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i19 = i14;
                        g4VarF = g4Var;
                    }
                    f16 = f15;
                    j14 = jP2;
                    jP = j13;
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        lVar3 = c.f84204c;
                    }
                    if ((i13 & 16) != 0) {
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -57345;
                    }
                    j13 = jP;
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(j13, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j12;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        f15 = fG;
                    } else {
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i19 = i14 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i19 = i14;
                        g4VarF = g4Var;
                    }
                    f16 = f15;
                    j14 = jP2;
                    jP = j13;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(1511110220, i19, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:395)");
                }
                int iI7 = ((w4.d) lVarV.U(z0.g())).i1(fG);
                int iI8 = ((w4.d) lVarV.U(z0.g())).i1(f16);
                d3.c.Companion companion10 = d3.c.INSTANCE;
                d3.c cVarM4 = companion10.m();
                lVarV.H(733328855);
                i0 i0VarJ4 = androidx.compose.foundation.layout.g.j(cVarM4, false, lVarV, 6);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC7 = lVarV.c();
                b4.g.Companion companion11 = b4.g.INSTANCE;
                aVarA = companion11.a();
                q<y2<b4.g>, p020r2.l, Integer, h0> qVarA7 = a0.a(dVar2);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarJ4, companion11.c());
                d4.b(lVarA, xVarC7, companion11.e());
                pVarB = companion11.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA7.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                androidx.compose.foundation.layout.i iVar4 = androidx.compose.foundation.layout.i.f4585a;
                v1.b.f fVarN4 = v1.b.f117444a.n(f16);
                d3.c.b bVarG4 = companion10.g();
                lVarV.H(-483455358);
                androidx.compose.ui.d.Companion companion12 = androidx.compose.ui.d.INSTANCE;
                i0 i0VarA4 = v1.g.a(fVarN4, bVarG4, lVarV, 48);
                lVarV.H(-1323940314);
                iA2 = j.a(lVarV, 0);
                p020r2.x xVarC8 = lVarV.c();
                float f24 = f16;
                aVarA2 = companion11.a();
                q<y2<b4.g>, p020r2.l, Integer, h0> qVarA8 = a0.a(companion12);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = d4.a(lVarV);
                d4.b(lVarA2, i0VarA4, companion11.c());
                d4.b(lVarA2, xVarC8, companion11.e());
                pVarB2 = companion11.b();
                if (lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                qVarA8.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar4 = v1.j.f117505a;
                dVarC = androidx.compose.foundation.b.c(androidx.compose.foundation.layout.x.s(companion12, f14, fG), j14, g4VarF);
                lVarV.H(25775080);
                while (i21 < i11) {
                    androidx.compose.foundation.layout.g.a(dVarC, lVarV, 0);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                dVarC2 = androidx.compose.ui.d.INSTANCE;
                C1784d c1784d4 = new C1784d(lVar3, hVar, i11, iI8, iI7);
                l<? super Integer, Integer> lVar8 = lVar3;
                androidx.compose.ui.d dVarS4 = androidx.compose.foundation.layout.x.s(androidx.compose.foundation.layout.q.a(dVarC2, c1784d4), f14, fG);
                if (i11 > 0) {
                    dVarC2 = androidx.compose.foundation.b.c(dVarC2, jP, g4VarF);
                }
                androidx.compose.foundation.layout.g.a(dVarS4.g(dVarC2), lVarV, 0);
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                j15 = j14;
                lVar4 = lVar8;
                f17 = f14;
                j16 = jP;
                f18 = f24;
                g4Var2 = g4VarF;
                f19 = fG;
                dVar3 = dVar2;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        lVar3 = c.f84204c;
                    }
                    if ((i13 & 16) != 0) {
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -57345;
                    }
                    j13 = jP;
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(j13, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j12;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        f15 = fG;
                    } else {
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i19 = i14 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i19 = i14;
                        g4VarF = g4Var;
                    }
                    f16 = f15;
                    j14 = jP2;
                    jP = j13;
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        lVar3 = c.f84204c;
                    }
                    if ((i13 & 16) != 0) {
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -57345;
                    }
                    j13 = jP;
                    if ((i13 & 32) != 0) {
                        jP2 = p1.p(j13, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i14 &= -458753;
                    } else {
                        jP2 = j12;
                    }
                    if (i17 != 0) {
                        fG = w4.h.g(8);
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                        f14 = fG;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        f15 = fG;
                    } else {
                        f15 = f13;
                    }
                    if ((i13 & 512) != 0) {
                        i19 = i14 & (-1879048193);
                        g4VarF = a2.g.f();
                    } else {
                        i19 = i14;
                        g4VarF = g4Var;
                    }
                    f16 = f15;
                    j14 = jP2;
                    jP = j13;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(1511110220, i19, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:395)");
                }
                int iI9 = ((w4.d) lVarV.U(z0.g())).i1(fG);
                int iI10 = ((w4.d) lVarV.U(z0.g())).i1(f16);
                d3.c.Companion companion13 = d3.c.INSTANCE;
                d3.c cVarM5 = companion13.m();
                lVarV.H(733328855);
                i0 i0VarJ5 = androidx.compose.foundation.layout.g.j(cVarM5, false, lVarV, 6);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC9 = lVarV.c();
                b4.g.Companion companion14 = b4.g.INSTANCE;
                aVarA = companion14.a();
                q<y2<b4.g>, p020r2.l, Integer, h0> qVarA9 = a0.a(dVar2);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarJ5, companion14.c());
                d4.b(lVarA, xVarC9, companion14.e());
                pVarB = companion14.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA9.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                androidx.compose.foundation.layout.i iVar5 = androidx.compose.foundation.layout.i.f4585a;
                v1.b.f fVarN5 = v1.b.f117444a.n(f16);
                d3.c.b bVarG5 = companion13.g();
                lVarV.H(-483455358);
                androidx.compose.ui.d.Companion companion15 = androidx.compose.ui.d.INSTANCE;
                i0 i0VarA5 = v1.g.a(fVarN5, bVarG5, lVarV, 48);
                lVarV.H(-1323940314);
                iA2 = j.a(lVarV, 0);
                p020r2.x xVarC10 = lVarV.c();
                float f25 = f16;
                aVarA2 = companion14.a();
                q<y2<b4.g>, p020r2.l, Integer, h0> qVarA10 = a0.a(companion15);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = d4.a(lVarV);
                d4.b(lVarA2, i0VarA5, companion14.c());
                d4.b(lVarA2, xVarC10, companion14.e());
                pVarB2 = companion14.b();
                if (lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                qVarA10.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar5 = v1.j.f117505a;
                dVarC = androidx.compose.foundation.b.c(androidx.compose.foundation.layout.x.s(companion15, f14, fG), j14, g4VarF);
                lVarV.H(25775080);
                while (i21 < i11) {
                    androidx.compose.foundation.layout.g.a(dVarC, lVarV, 0);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                dVarC2 = androidx.compose.ui.d.INSTANCE;
                C1784d c1784d5 = new C1784d(lVar3, hVar, i11, iI10, iI9);
                l<? super Integer, Integer> lVar9 = lVar3;
                androidx.compose.ui.d dVarS5 = androidx.compose.foundation.layout.x.s(androidx.compose.foundation.layout.q.a(dVarC2, c1784d5), f14, fG);
                if (i11 > 0) {
                    dVarC2 = androidx.compose.foundation.b.c(dVarC2, jP, g4VarF);
                }
                androidx.compose.foundation.layout.g.a(dVarS5.g(dVarC2), lVarV, 0);
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                j15 = j14;
                lVar4 = lVar9;
                f17 = f14;
                j16 = jP;
                f18 = f25;
                g4Var2 = g4VarF;
                f19 = fG;
                dVar3 = dVar2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new e(hVar, i11, dVar3, lVar4, j16, j15, f19, f17, f18, g4Var2, i12, i13));
            }
        }
        i14 |= 3072;
        lVar3 = lVar;
        if ((57344 & i12) == 0) {
            if ((i13 & 16) == 0) {
                jP = j11;
                if (lVarV.s(jP)) {
                    i23 = 16384;
                }
                i14 |= i23;
            } else {
                jP = j11;
            }
            i23 = PKIFailureInfo.certRevoked;
            i14 |= i23;
        } else {
            jP = j11;
        }
        if ((458752 & i12) != 0) {
            if ((i13 & 32) == 0) {
                i22 = 65536;
            } else {
                i22 = 65536;
            }
            i14 |= i22;
        }
        i17 = i13 & 64;
        if (i17 != 0) {
            i14 |= 1572864;
            fG = f11;
        } else {
            fG = f11;
            if ((i12 & 3670016) == 0) {
                if (lVarV.q(fG)) {
                    i18 = PKIFailureInfo.badCertTemplate;
                } else {
                    i18 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i18;
            }
        }
        if ((i12 & 29360128) == 0) {
            if ((i13 & 128) == 0) {
                f14 = f12;
                if (lVarV.q(f14)) {
                }
                i14 |= i25;
            } else {
                f14 = f12;
            }
            i14 |= i25;
        } else {
            f14 = f12;
        }
        if ((i12 & 234881024) != 0) {
            i14 |= ((i13 & 256) == 0 || !lVarV.q(f13)) ? 33554432 : 67108864;
        }
        if ((1879048192 & i12) != 0) {
            i14 |= ((i13 & 512) == 0 || !lVarV.n(g4Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
        }
        if ((i14 & 1533916891) == 306783378) {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i15 != 0) {
                    lVar3 = c.f84204c;
                }
                if ((i13 & 16) != 0) {
                    jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i14 &= -57345;
                }
                j13 = jP;
                if ((i13 & 32) != 0) {
                    jP2 = p1.p(j13, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i14 &= -458753;
                } else {
                    jP2 = j12;
                }
                if (i17 != 0) {
                    fG = w4.h.g(8);
                }
                if ((i13 & 128) != 0) {
                    i14 &= -29360129;
                    f14 = fG;
                }
                if ((i13 & 256) != 0) {
                    i14 &= -234881025;
                    f15 = fG;
                } else {
                    f15 = f13;
                }
                if ((i13 & 512) != 0) {
                    i19 = i14 & (-1879048193);
                    g4VarF = a2.g.f();
                } else {
                    i19 = i14;
                    g4VarF = g4Var;
                }
                f16 = f15;
                j14 = jP2;
                jP = j13;
            } else {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i15 != 0) {
                    lVar3 = c.f84204c;
                }
                if ((i13 & 16) != 0) {
                    jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i14 &= -57345;
                }
                j13 = jP;
                if ((i13 & 32) != 0) {
                    jP2 = p1.p(j13, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i14 &= -458753;
                } else {
                    jP2 = j12;
                }
                if (i17 != 0) {
                    fG = w4.h.g(8);
                }
                if ((i13 & 128) != 0) {
                    i14 &= -29360129;
                    f14 = fG;
                }
                if ((i13 & 256) != 0) {
                    i14 &= -234881025;
                    f15 = fG;
                } else {
                    f15 = f13;
                }
                if ((i13 & 512) != 0) {
                    i19 = i14 & (-1879048193);
                    g4VarF = a2.g.f();
                } else {
                    i19 = i14;
                    g4VarF = g4Var;
                }
                f16 = f15;
                j14 = jP2;
                jP = j13;
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(1511110220, i19, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:395)");
            }
            int iI11 = ((w4.d) lVarV.U(z0.g())).i1(fG);
            int iI12 = ((w4.d) lVarV.U(z0.g())).i1(f16);
            d3.c.Companion companion16 = d3.c.INSTANCE;
            d3.c cVarM6 = companion16.m();
            lVarV.H(733328855);
            i0 i0VarJ6 = androidx.compose.foundation.layout.g.j(cVarM6, false, lVarV, 6);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            p020r2.x xVarC11 = lVarV.c();
            b4.g.Companion companion17 = b4.g.INSTANCE;
            aVarA = companion17.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA11 = a0.a(dVar2);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarJ6, companion17.c());
            d4.b(lVarA, xVarC11, companion17.e());
            pVarB = companion17.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA11.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            androidx.compose.foundation.layout.i iVar6 = androidx.compose.foundation.layout.i.f4585a;
            v1.b.f fVarN6 = v1.b.f117444a.n(f16);
            d3.c.b bVarG6 = companion16.g();
            lVarV.H(-483455358);
            androidx.compose.ui.d.Companion companion18 = androidx.compose.ui.d.INSTANCE;
            i0 i0VarA6 = v1.g.a(fVarN6, bVarG6, lVarV, 48);
            lVarV.H(-1323940314);
            iA2 = j.a(lVarV, 0);
            p020r2.x xVarC12 = lVarV.c();
            float f26 = f16;
            aVarA2 = companion17.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA12 = a0.a(companion18);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarA6, companion17.c());
            d4.b(lVarA2, xVarC12, companion17.e());
            pVarB2 = companion17.b();
            if (lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            qVarA12.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.j jVar6 = v1.j.f117505a;
            dVarC = androidx.compose.foundation.b.c(androidx.compose.foundation.layout.x.s(companion18, f14, fG), j14, g4VarF);
            lVarV.H(25775080);
            while (i21 < i11) {
                androidx.compose.foundation.layout.g.a(dVarC, lVarV, 0);
            }
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            dVarC2 = androidx.compose.ui.d.INSTANCE;
            C1784d c1784d6 = new C1784d(lVar3, hVar, i11, iI12, iI11);
            l<? super Integer, Integer> lVar10 = lVar3;
            androidx.compose.ui.d dVarS6 = androidx.compose.foundation.layout.x.s(androidx.compose.foundation.layout.q.a(dVarC2, c1784d6), f14, fG);
            if (i11 > 0) {
                dVarC2 = androidx.compose.foundation.b.c(dVarC2, jP, g4VarF);
            }
            androidx.compose.foundation.layout.g.a(dVarS6.g(dVarC2), lVarV, 0);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            j15 = j14;
            lVar4 = lVar10;
            f17 = f14;
            j16 = jP;
            f18 = f26;
            g4Var2 = g4VarF;
            f19 = fG;
            dVar3 = dVar2;
        } else {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i15 != 0) {
                    lVar3 = c.f84204c;
                }
                if ((i13 & 16) != 0) {
                    jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i14 &= -57345;
                }
                j13 = jP;
                if ((i13 & 32) != 0) {
                    jP2 = p1.p(j13, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i14 &= -458753;
                } else {
                    jP2 = j12;
                }
                if (i17 != 0) {
                    fG = w4.h.g(8);
                }
                if ((i13 & 128) != 0) {
                    i14 &= -29360129;
                    f14 = fG;
                }
                if ((i13 & 256) != 0) {
                    i14 &= -234881025;
                    f15 = fG;
                } else {
                    f15 = f13;
                }
                if ((i13 & 512) != 0) {
                    i19 = i14 & (-1879048193);
                    g4VarF = a2.g.f();
                } else {
                    i19 = i14;
                    g4VarF = g4Var;
                }
                f16 = f15;
                j14 = jP2;
                jP = j13;
            } else {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i15 != 0) {
                    lVar3 = c.f84204c;
                }
                if ((i13 & 16) != 0) {
                    jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i14 &= -57345;
                }
                j13 = jP;
                if ((i13 & 32) != 0) {
                    jP2 = p1.p(j13, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i14 &= -458753;
                } else {
                    jP2 = j12;
                }
                if (i17 != 0) {
                    fG = w4.h.g(8);
                }
                if ((i13 & 128) != 0) {
                    i14 &= -29360129;
                    f14 = fG;
                }
                if ((i13 & 256) != 0) {
                    i14 &= -234881025;
                    f15 = fG;
                } else {
                    f15 = f13;
                }
                if ((i13 & 512) != 0) {
                    i19 = i14 & (-1879048193);
                    g4VarF = a2.g.f();
                } else {
                    i19 = i14;
                    g4VarF = g4Var;
                }
                f16 = f15;
                j14 = jP2;
                jP = j13;
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(1511110220, i19, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:395)");
            }
            int iI13 = ((w4.d) lVarV.U(z0.g())).i1(fG);
            int iI14 = ((w4.d) lVarV.U(z0.g())).i1(f16);
            d3.c.Companion companion19 = d3.c.INSTANCE;
            d3.c cVarM7 = companion19.m();
            lVarV.H(733328855);
            i0 i0VarJ7 = androidx.compose.foundation.layout.g.j(cVarM7, false, lVarV, 6);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            p020r2.x xVarC13 = lVarV.c();
            b4.g.Companion companion110 = b4.g.INSTANCE;
            aVarA = companion110.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA13 = a0.a(dVar2);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarJ7, companion110.c());
            d4.b(lVarA, xVarC13, companion110.e());
            pVarB = companion110.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA13.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            androidx.compose.foundation.layout.i iVar7 = androidx.compose.foundation.layout.i.f4585a;
            v1.b.f fVarN7 = v1.b.f117444a.n(f16);
            d3.c.b bVarG7 = companion19.g();
            lVarV.H(-483455358);
            androidx.compose.ui.d.Companion companion111 = androidx.compose.ui.d.INSTANCE;
            i0 i0VarA7 = v1.g.a(fVarN7, bVarG7, lVarV, 48);
            lVarV.H(-1323940314);
            iA2 = j.a(lVarV, 0);
            p020r2.x xVarC14 = lVarV.c();
            float f27 = f16;
            aVarA2 = companion110.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA14 = a0.a(companion111);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarA7, companion110.c());
            d4.b(lVarA2, xVarC14, companion110.e());
            pVarB2 = companion110.b();
            if (lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            qVarA14.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.j jVar7 = v1.j.f117505a;
            dVarC = androidx.compose.foundation.b.c(androidx.compose.foundation.layout.x.s(companion111, f14, fG), j14, g4VarF);
            lVarV.H(25775080);
            while (i21 < i11) {
                androidx.compose.foundation.layout.g.a(dVarC, lVarV, 0);
            }
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            dVarC2 = androidx.compose.ui.d.INSTANCE;
            C1784d c1784d7 = new C1784d(lVar3, hVar, i11, iI14, iI13);
            l<? super Integer, Integer> lVar11 = lVar3;
            androidx.compose.ui.d dVarS7 = androidx.compose.foundation.layout.x.s(androidx.compose.foundation.layout.q.a(dVarC2, c1784d7), f14, fG);
            if (i11 > 0) {
                dVarC2 = androidx.compose.foundation.b.c(dVarC2, jP, g4VarF);
            }
            androidx.compose.foundation.layout.g.a(dVarS7.g(dVarC2), lVarV, 0);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            j15 = j14;
            lVar4 = lVar11;
            f17 = f14;
            j16 = jP;
            f18 = f27;
            g4Var2 = g4VarF;
            f19 = fG;
            dVar3 = dVar2;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(hVar, i11, dVar3, lVar4, j16, j15, f19, f17, f18, g4Var2, i12, i13));
        }
    }
}
