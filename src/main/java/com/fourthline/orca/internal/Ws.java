package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.TextStyle;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Ws {

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.a f29598b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f29598b = aVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f29598b, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f29597a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f29598b.invoke();
            return jn0.h0.f84049a;
        }
    }

    static final class b implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Yj f29599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f29600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ QA f29602d;

        b(Yj yj2, boolean z11, int i11, QA qa2) {
            this.f29599a = yj2;
            this.f29600b = z11;
            this.f29601c = i11;
            this.f29602d = qa2;
        }

        public final void a(v1.i OrcaScreen, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(OrcaScreen, "$this$OrcaScreen");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1269223699, i11, -1, "com.fourthline.orca.core.internal.composable.ProgressScreen.<anonymous> (ProgressScreen.kt:62)");
            }
            Ws.a(this.f29599a, this.f29600b, this.f29601c, this.f29602d, lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v1.i) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }
    }

    static final class c implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ QA f29603a;

        c(QA qa2) {
            this.f29603a = qa2;
        }

        public final void a(v1.i OrcaScreen, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(OrcaScreen, "$this$OrcaScreen");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1754168948, i11, -1, "com.fourthline.orca.core.internal.composable.ProgressScreen.<anonymous> (ProgressScreen.kt:70)");
            }
            AbstractC3091bh.a((androidx.compose.ui.d) null, RA.c(this.f29603a, lVar, 0), t4.j.INSTANCE.a(), 0L, (InterfaceC3903uh) null, lVar, 0, 25);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v1.i) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Yj yj2, boolean z11, int i11, QA qa2, int i12, p020r2.l lVar, int i13) {
        a(yj2, z11, i11, qa2, lVar, p020r2.k2.a(i12 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c() {
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(String str, QA qa2, int i11, boolean z11, QA qa3, QA qa4, Yj yj2, wn0.a aVar, wn0.a aVar2, wn0.a aVar3, int i12, int i13, p020r2.l lVar, int i14) {
        a(str, qa2, i11, z11, qa3, qa4, yj2, aVar, aVar2, aVar3, lVar, p020r2.k2.a(i12 | 1), i13);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a() {
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b() {
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0131  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:108:0x013e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:113:0x014f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:122:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0173  */
    /* JADX WARN: Code duplicated, block: B:125:0x0185  */
    /* JADX WARN: Code duplicated, block: B:127:0x0193  */
    /* JADX WARN: Code duplicated, block: B:129:0x0196  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:137:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:149:0x0202  */
    /* JADX WARN: Code duplicated, block: B:151:0x020a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0229  */
    /* JADX WARN: Code duplicated, block: B:155:0x022b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0233  */
    /* JADX WARN: Code duplicated, block: B:160:0x023b  */
    /* JADX WARN: Code duplicated, block: B:163:0x028e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0291  */
    /* JADX WARN: Code duplicated, block: B:167:0x0299  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:172:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    public static final void a(final String screenName, final QA title, final int i11, final boolean z11, final QA description, final QA hint, final Yj lottieSource, wn0.a aVar, wn0.a aVar2, wn0.a aVar3, p020r2.l lVar, final int i12, final int i13) {
        int i14;
        wn0.a aVar4;
        int i15;
        wn0.a aVar5;
        int i16;
        int i17;
        int i18;
        wn0.a aVar6;
        final wn0.a aVar7;
        final wn0.a aVar8;
        boolean z12;
        Object objI;
        boolean z13;
        Object objI2;
        boolean z14;
        Object objI3;
        final wn0.a aVar9;
        final wn0.a aVar10;
        final wn0.a aVar11;
        Object objI4;
        Object objI5;
        Object objI6;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(screenName, "screenName");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p020r2.l lVarV = lVar.v(1095839290);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (lVarV.n(screenName) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            i14 |= (i12 & 64) == 0 ? lVarV.n(title) : lVarV.K(title) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= KyberEngine.KyberPolyBytes;
        } else if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
            i14 |= lVarV.r(i11) ? 256 : 128;
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i12 & 3072) == 0) {
            i14 |= lVarV.p(z11) ? 2048 : 1024;
        }
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((i12 & 24576) == 0) {
            i14 |= (32768 & i12) == 0 ? lVarV.n(description) : lVarV.K(description) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i13 & 32) != 0) {
            i14 |= 196608;
        } else if ((i12 & 196608) == 0) {
            i14 |= (262144 & i12) == 0 ? lVarV.n(hint) : lVarV.K(hint) ? 131072 : 65536;
        }
        if ((i13 & 64) != 0) {
            i14 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            i14 |= (2097152 & i12) == 0 ? lVarV.n(lottieSource) : lVarV.K(lottieSource) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i19 = i13 & 128;
        if (i19 == 0) {
            if ((12582912 & i12) == 0) {
                aVar4 = aVar;
                i14 |= lVarV.K(aVar4) ? 8388608 : 4194304;
            }
            i15 = i13 & 256;
            if (i15 != 0) {
                i14 |= 100663296;
                aVar5 = aVar2;
            } else {
                aVar5 = aVar2;
                if ((i12 & 100663296) == 0) {
                    if (lVarV.K(aVar5)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i14 |= i16;
                }
            }
            i17 = i13 & 512;
            if (i17 != 0) {
                i14 |= 805306368;
            } else if ((i12 & 805306368) == 0) {
                if (lVarV.K(aVar3)) {
                    i18 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i18 = 268435456;
                }
                i14 |= i18;
            }
            if ((i14 & 306783379) != 306783378 && lVarV.b()) {
                lVarV.j();
                aVar10 = aVar5;
                aVar9 = aVar4;
                aVar11 = aVar3;
            } else {
                if (i19 != 0) {
                    lVarV.o(-1914374047);
                    objI6 = lVarV.I();
                    if (objI6 == p020r2.l.INSTANCE.a()) {
                        objI6 = new wn0.a() { // from class: com.fourthline.orca.internal.fv0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Ws.a();
                            }
                        };
                        lVarV.B(objI6);
                    }
                    aVar6 = (wn0.a) objI6;
                    lVarV.l();
                } else {
                    aVar6 = aVar4;
                }
                if (i15 != 0) {
                    lVarV.o(-1914372607);
                    objI5 = lVarV.I();
                    if (objI5 == p020r2.l.INSTANCE.a()) {
                        objI5 = new wn0.a() { // from class: com.fourthline.orca.internal.gv0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Ws.b();
                            }
                        };
                        lVarV.B(objI5);
                    }
                    aVar7 = (wn0.a) objI5;
                    lVarV.l();
                } else {
                    aVar7 = aVar5;
                }
                if (i17 != 0) {
                    lVarV.o(-1914371295);
                    objI4 = lVarV.I();
                    if (objI4 == p020r2.l.INSTANCE.a()) {
                        objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.hv0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Ws.c();
                            }
                        };
                        lVarV.B(objI4);
                    }
                    aVar8 = (wn0.a) objI4;
                    lVarV.l();
                } else {
                    aVar8 = aVar3;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1095839290, i14, -1, "com.fourthline.orca.core.internal.composable.ProgressScreen (ProgressScreen.kt:48)");
                }
                lVarV.o(-1914370459);
                if ((234881024 & i14) == 67108864) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI = lVarV.I();
                if (!z12 || objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.iv0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Ws.a(aVar7);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
                jn0.h0 h0Var = jn0.h0.f84049a;
                lVarV.o(-1914368355);
                if ((29360128 & i14) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = lVarV.I();
                if (!z13 || objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new a(aVar6, null);
                    lVarV.B(objI2);
                }
                lVarV.l();
                Function0.g(h0Var, (wn0.p) objI2, lVarV, 6);
                String strC = RA.c(title, lVarV, (i14 >> 3) & 14);
                d3.c.b bVarG = d3.c.INSTANCE.g();
                wn0.a aVar12 = aVar6;
                z2.a aVarE = z2.c.e(-1269223699, true, new b(lottieSource, z11, i11, description), lVarV, 54);
                z2.a aVarE2 = z2.c.e(-1754168948, true, new c(hint), lVarV, 54);
                InterfaceC3777rk.a.c cVar = new InterfaceC3777rk.a.c(null, 1, null);
                lVarV.o(-1914342187);
                if ((1879048192 & i14) == 536870912) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI3 = lVarV.I();
                if (!z14 || objI3 == p020r2.l.INSTANCE.a()) {
                    objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.jv0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return Ws.a(aVar8, (InterfaceC3807sD) obj);
                        }
                    };
                    lVarV.B(objI3);
                }
                lVarV.l();
                wn0.a aVar13 = aVar8;
                wn0.a aVar14 = aVar7;
                AbstractC3269fp.a(screenName, strC, bVarG, aVarE, aVarE2, new C3820sk(null, new C3735qk(cVar, (wn0.l) objI3), false, 4, null), null, false, null, lVarV, (i14 & 14) | 28032, 448);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                aVar9 = aVar12;
                aVar10 = aVar14;
                aVar11 = aVar13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.kv0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return Ws.a(screenName, title, i11, z11, description, hint, lottieSource, aVar9, aVar10, aVar11, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 12582912;
        aVar4 = aVar;
        i15 = i13 & 256;
        if (i15 != 0) {
            i14 |= 100663296;
            aVar5 = aVar2;
        } else {
            aVar5 = aVar2;
            if ((i12 & 100663296) == 0) {
                if (lVarV.K(aVar5)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
                i14 |= i16;
            }
        }
        i17 = i13 & 512;
        if (i17 != 0) {
            i14 |= 805306368;
        } else if ((i12 & 805306368) == 0) {
            if (lVarV.K(aVar3)) {
                i18 = PKIFailureInfo.duplicateCertReq;
            } else {
                i18 = 268435456;
            }
            i14 |= i18;
        }
        if ((i14 & 306783379) != 306783378) {
            if (i19 != 0) {
                lVarV.o(-1914374047);
                objI6 = lVarV.I();
                if (objI6 == p020r2.l.INSTANCE.a()) {
                    objI6 = new wn0.a() { // from class: com.fourthline.orca.internal.fv0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Ws.a();
                        }
                    };
                    lVarV.B(objI6);
                }
                aVar6 = (wn0.a) objI6;
                lVarV.l();
            } else {
                aVar6 = aVar4;
            }
            if (i15 != 0) {
                lVarV.o(-1914372607);
                objI5 = lVarV.I();
                if (objI5 == p020r2.l.INSTANCE.a()) {
                    objI5 = new wn0.a() { // from class: com.fourthline.orca.internal.gv0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Ws.b();
                        }
                    };
                    lVarV.B(objI5);
                }
                aVar7 = (wn0.a) objI5;
                lVarV.l();
            } else {
                aVar7 = aVar5;
            }
            if (i17 != 0) {
                lVarV.o(-1914371295);
                objI4 = lVarV.I();
                if (objI4 == p020r2.l.INSTANCE.a()) {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.hv0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Ws.c();
                        }
                    };
                    lVarV.B(objI4);
                }
                aVar8 = (wn0.a) objI4;
                lVarV.l();
            } else {
                aVar8 = aVar3;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1095839290, i14, -1, "com.fourthline.orca.core.internal.composable.ProgressScreen (ProgressScreen.kt:48)");
            }
            lVarV.o(-1914370459);
            if ((234881024 & i14) == 67108864) {
                z12 = true;
            } else {
                z12 = false;
            }
            objI = lVarV.I();
            if (!z12) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.iv0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ws.a(aVar7);
                    }
                };
                lVarV.B(objI);
            } else {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.iv0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ws.a(aVar7);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
            jn0.h0 h0Var2 = jn0.h0.f84049a;
            lVarV.o(-1914368355);
            if ((29360128 & i14) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            objI2 = lVarV.I();
            if (!z13) {
                objI2 = new a(aVar6, null);
                lVarV.B(objI2);
            } else {
                objI2 = new a(aVar6, null);
                lVarV.B(objI2);
            }
            lVarV.l();
            Function0.g(h0Var2, (wn0.p) objI2, lVarV, 6);
            String strC2 = RA.c(title, lVarV, (i14 >> 3) & 14);
            d3.c.b bVarG2 = d3.c.INSTANCE.g();
            wn0.a aVar15 = aVar6;
            z2.a aVarE3 = z2.c.e(-1269223699, true, new b(lottieSource, z11, i11, description), lVarV, 54);
            z2.a aVarE4 = z2.c.e(-1754168948, true, new c(hint), lVarV, 54);
            InterfaceC3777rk.a.c cVar2 = new InterfaceC3777rk.a.c(null, 1, null);
            lVarV.o(-1914342187);
            if ((1879048192 & i14) == 536870912) {
                z14 = true;
            } else {
                z14 = false;
            }
            objI3 = lVarV.I();
            if (!z14) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.jv0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Ws.a(aVar8, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI3);
            } else {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.jv0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Ws.a(aVar8, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            wn0.a aVar16 = aVar8;
            wn0.a aVar17 = aVar7;
            AbstractC3269fp.a(screenName, strC2, bVarG2, aVarE3, aVarE4, new C3820sk(null, new C3735qk(cVar2, (wn0.l) objI3), false, 4, null), null, false, null, lVarV, (i14 & 14) | 28032, 448);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            aVar9 = aVar15;
            aVar10 = aVar17;
            aVar11 = aVar16;
        } else {
            if (i19 != 0) {
                lVarV.o(-1914374047);
                objI6 = lVarV.I();
                if (objI6 == p020r2.l.INSTANCE.a()) {
                    objI6 = new wn0.a() { // from class: com.fourthline.orca.internal.fv0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Ws.a();
                        }
                    };
                    lVarV.B(objI6);
                }
                aVar6 = (wn0.a) objI6;
                lVarV.l();
            } else {
                aVar6 = aVar4;
            }
            if (i15 != 0) {
                lVarV.o(-1914372607);
                objI5 = lVarV.I();
                if (objI5 == p020r2.l.INSTANCE.a()) {
                    objI5 = new wn0.a() { // from class: com.fourthline.orca.internal.gv0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Ws.b();
                        }
                    };
                    lVarV.B(objI5);
                }
                aVar7 = (wn0.a) objI5;
                lVarV.l();
            } else {
                aVar7 = aVar5;
            }
            if (i17 != 0) {
                lVarV.o(-1914371295);
                objI4 = lVarV.I();
                if (objI4 == p020r2.l.INSTANCE.a()) {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.hv0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Ws.c();
                        }
                    };
                    lVarV.B(objI4);
                }
                aVar8 = (wn0.a) objI4;
                lVarV.l();
            } else {
                aVar8 = aVar3;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1095839290, i14, -1, "com.fourthline.orca.core.internal.composable.ProgressScreen (ProgressScreen.kt:48)");
            }
            lVarV.o(-1914370459);
            if ((234881024 & i14) == 67108864) {
                z12 = true;
            } else {
                z12 = false;
            }
            objI = lVarV.I();
            if (!z12) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.iv0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ws.a(aVar7);
                    }
                };
                lVarV.B(objI);
            } else {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.iv0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ws.a(aVar7);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
            jn0.h0 h0Var3 = jn0.h0.f84049a;
            lVarV.o(-1914368355);
            if ((29360128 & i14) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            objI2 = lVarV.I();
            if (!z13) {
                objI2 = new a(aVar6, null);
                lVarV.B(objI2);
            } else {
                objI2 = new a(aVar6, null);
                lVarV.B(objI2);
            }
            lVarV.l();
            Function0.g(h0Var3, (wn0.p) objI2, lVarV, 6);
            String strC3 = RA.c(title, lVarV, (i14 >> 3) & 14);
            d3.c.b bVarG3 = d3.c.INSTANCE.g();
            wn0.a aVar18 = aVar6;
            z2.a aVarE5 = z2.c.e(-1269223699, true, new b(lottieSource, z11, i11, description), lVarV, 54);
            z2.a aVarE6 = z2.c.e(-1754168948, true, new c(hint), lVarV, 54);
            InterfaceC3777rk.a.c cVar3 = new InterfaceC3777rk.a.c(null, 1, null);
            lVarV.o(-1914342187);
            if ((1879048192 & i14) == 536870912) {
                z14 = true;
            } else {
                z14 = false;
            }
            objI3 = lVarV.I();
            if (!z14) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.jv0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Ws.a(aVar8, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI3);
            } else {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.jv0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Ws.a(aVar8, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            wn0.a aVar19 = aVar8;
            wn0.a aVar110 = aVar7;
            AbstractC3269fp.a(screenName, strC3, bVarG3, aVarE5, aVarE6, new C3820sk(null, new C3735qk(cVar3, (wn0.l) objI3), false, 4, null), null, false, null, lVarV, (i14 & 14) | 28032, 448);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            aVar9 = aVar18;
            aVar10 = aVar110;
            aVar11 = aVar19;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.kv0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ws.a(screenName, title, i11, z11, description, hint, lottieSource, aVar9, aVar10, aVar11, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.a aVar) {
        aVar.invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.a aVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        aVar.invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.String, w4.v] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static final void a(final Yj yj2, final boolean z11, final int i11, final QA qa2, p020r2.l lVar, final int i12) {
        int i13;
        p020r2.l lVar2;
        androidx.compose.ui.d.Companion companion;
        C3825sp c3825sp;
        ?? r11;
        int i14;
        p020r2.l lVar3;
        p020r2.l lVarV = lVar.v(-1059719526);
        if ((i12 & 6) == 0) {
            i13 = ((i12 & 8) == 0 ? lVarV.n(yj2) : lVarV.K(yj2) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= lVarV.p(z11) ? 32 : 16;
        }
        if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.r(i11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= (i12 & 4096) == 0 ? lVarV.n(qa2) : lVarV.K(qa2) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
            lVar3 = lVarV;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1059719526, i13, -1, "com.fourthline.orca.core.internal.composable.Body (ProgressScreen.kt:91)");
            }
            androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(companion2, BitmapDescriptorFactory.HUE_RED, 1, null);
            v1.b bVar = v1.b.f117444a;
            v1.b.f fVarE = bVar.e();
            d3.c.Companion companion3 = d3.c.INSTANCE;
            z3.i0 i0VarA = v1.g.a(fVarE, companion3.g(), lVarV, 54);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarH);
            b4.g.Companion companion4 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion4.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarA, companion4.c());
            p020r2.d4.b(lVarA, xVarC, companion4.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion4.b();
            if (lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion4.d());
            v1.j jVar = v1.j.f117505a;
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion2, w4.h.g(48)), lVarV, 6);
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(companion3.e(), false);
            int iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, companion2);
            wn0.a<b4.g> aVarA2 = companion4.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA2 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA2, i0VarH, companion4.c());
            p020r2.d4.b(lVarA2, xVarC2, companion4.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB2 = companion4.b();
            if (lVarA2.u() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE2, companion4.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            androidx.compose.ui.d dVarA = AbstractC3307gk.a(androidx.compose.foundation.layout.x.q(companion2, w4.h.g(180)), "illustrationView", (String) null, 2, (Object) null);
            C3825sp c3825sp2 = C3825sp.f35377a;
            int i15 = i13;
            TA.a(dVarA, false, false, 0L, c3825sp2.b(lVarV, 6).getSpinner().getBackground().a(lVarV, 0), 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, yj2, null, null, null, lVarV, 12582912, i15 & 14, 15214);
            lVarV.o(-589434172);
            if (z11) {
                companion = companion2;
                androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
                z3.i0 i0VarB = v1.e0.b(bVar.b(), companion3.i(), lVarV, 54);
                int iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC3 = lVarV.c();
                androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarH2);
                wn0.a<b4.g> aVarA3 = companion4.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                p020r2.l lVarA3 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA3, i0VarB, companion4.c());
                p020r2.d4.b(lVarA3, xVarC3, companion4.e());
                wn0.p<b4.g, Integer, jn0.h0> pVarB3 = companion4.b();
                if (lVarA3.u() || !p013kotlin.jvm.internal.s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE3, companion4.d());
                v1.h0 h0Var = v1.h0.f117504a;
                androidx.compose.ui.d dVarD = h0Var.d(companion);
                String strValueOf = String.valueOf(i11);
                t4.j.Companion companion5 = t4.j.INSTANCE;
                i14 = 6;
                c3825sp = c3825sp2;
                p009i2.v2.b(strValueOf, dVarD, 0L, w4.w.h(48), null, null, null, 0L, null, t4.j.h(companion5.a()), w4.w.h(52), 0, false, 0, 0, null, c3825sp2.b(lVarV, 6).getScreen().getTitle().a(null, lVarV, 0, 1), lVarV, 3072, 6, 63988);
                androidx.compose.ui.d dVarD2 = h0Var.d(companion);
                int iA4 = companion5.a();
                TextStyle textStyleA = c3825sp.b(lVarV, 6).getScreen().getTitle().a(null, lVarV, 0, 1);
                long jH = w4.w.h(32);
                long jH2 = w4.w.h(40);
                t4.j jVarH = t4.j.h(iA4);
                r11 = 0;
                p009i2.v2.b("%", dVarD2, 0L, jH, null, null, null, 0L, null, jVarH, jH2, 0, false, 0, 0, null, textStyleA, lVarV, 3078, 6, 63988);
                lVar2 = lVarV;
                lVar2.g();
            } else {
                lVar2 = lVarV;
                companion = companion2;
                c3825sp = c3825sp2;
                r11 = 0;
                i14 = 6;
            }
            lVar2.l();
            lVar2.g();
            float f11 = 32;
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(f11)), lVar2, i14);
            lVar3 = lVar2;
            p009i2.v2.b(RA.c(qa2, lVar2, (i15 >> 9) & 14), AbstractC3307gk.a(androidx.compose.foundation.layout.t.k(companion, w4.h.g(f11), BitmapDescriptorFactory.HUE_RED, 2, r11), "messageView", (String) r11, 2, (Object) r11), 0L, 0L, null, null, null, 0L, null, t4.j.h(t4.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, c3825sp.b(lVar2, i14).getScreen().getMessage().a(r11, lVar2, 0, 1), lVar3, 0, 0, 65020);
            lVar3.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVar3.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ev0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ws.a(yj2, z11, i11, qa2, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
