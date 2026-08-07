package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Ly {

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.a f26866b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f26866b = aVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f26866b, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f26865a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f26866b.invoke();
            return jn0.h0.f84049a;
        }
    }

    static final class b implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ QA f26867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Yj f26868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ E3 f26869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a f26870d;

        b(QA qa2, Yj yj2, E3 e11, wn0.a aVar) {
            this.f26867a = qa2;
            this.f26868b = yj2;
            this.f26869c = e11;
            this.f26870d = aVar;
        }

        public final void a(v1.i OrcaScaffold, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(OrcaScaffold, "$this$OrcaScaffold");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-755303063, i11, -1, "com.fourthline.orca.core.internal.composable.SpinnerScreen.<anonymous> (SpinnerScreen.kt:44)");
            }
            Ly.a(this.f26867a, this.f26868b, this.f26869c, this.f26870d, lVar, 0, 0);
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
    public static final jn0.h0 a(QA qa2, Yj yj2, E3 e11, wn0.a aVar, wn0.a aVar2, wn0.a aVar3, int i11, int i12, p020r2.l lVar, int i13) {
        a(qa2, yj2, e11, aVar, aVar2, aVar3, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(QA qa2, Yj yj2, E3 e11, wn0.a aVar, int i11, int i12, p020r2.l lVar, int i13) {
        a(qa2, yj2, e11, aVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b() {
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a() {
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0159  */
    /* JADX WARN: Code duplicated, block: B:106:0x0160  */
    /* JADX WARN: Code duplicated, block: B:108:0x0168  */
    /* JADX WARN: Code duplicated, block: B:111:0x019a  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x0104  */
    /* JADX WARN: Code duplicated, block: B:88:0x0112  */
    /* JADX WARN: Code duplicated, block: B:91:0x0119  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:95:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0135  */
    public static final void a(final QA title, final Yj lottieSource, E3 e11, final wn0.a onScreenShown, wn0.a aVar, final wn0.a onSystemBackClicked, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        wn0.a aVar2;
        int i14;
        wn0.a aVar3;
        boolean z11;
        Object objI;
        boolean z12;
        Object objI2;
        final wn0.a aVar4;
        Object objI3;
        final E3 e12;
        p020r2.w2 w2VarX;
        E3 e13 = e11;
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p013kotlin.jvm.internal.s.k(onScreenShown, "onScreenShown");
        p013kotlin.jvm.internal.s.k(onSystemBackClicked, "onSystemBackClicked");
        p020r2.l lVarV = lVar.v(535210673);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? lVarV.n(title) : lVarV.K(title) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? lVarV.n(lottieSource) : lVarV.K(lottieSource) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= (i11 & 512) == 0 ? lVarV.n(e13) : lVarV.K(e13) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= lVarV.K(onScreenShown) ? 2048 : 1024;
        }
        int i16 = i12 & 16;
        if (i16 == 0) {
            if ((i11 & 24576) == 0) {
                aVar2 = aVar;
                i13 |= lVarV.K(aVar2) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(onSystemBackClicked)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i13 |= i14;
            }
            if ((74899 & i13) != 74898 && lVarV.b()) {
                lVarV.j();
                aVar4 = aVar2;
            } else {
                if (i15 != 0) {
                    e13 = null;
                }
                if (i16 != 0) {
                    lVarV.o(-1160809022);
                    objI3 = lVarV.I();
                    if (objI3 == p020r2.l.INSTANCE.a()) {
                        objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.ji0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Ly.a();
                            }
                        };
                        lVarV.B(objI3);
                    }
                    aVar3 = (wn0.a) objI3;
                    lVarV.l();
                } else {
                    aVar3 = aVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(535210673, i13, -1, "com.fourthline.orca.core.internal.composable.SpinnerScreen (SpinnerScreen.kt:34)");
                }
                lVarV.o(-1160807035);
                if ((458752 & i13) == 131072) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (!z11 || objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.ki0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Ly.a(onSystemBackClicked);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
                jn0.h0 h0Var = jn0.h0.f84049a;
                lVarV.o(-1160804993);
                z12 = (i13 & 7168) == 2048;
                objI2 = lVarV.I();
                if (!z12 || objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new a(onScreenShown, null);
                    lVarV.B(objI2);
                }
                lVarV.l();
                Function0.g(h0Var, (wn0.p) objI2, lVarV, 6);
                wn0.a aVar5 = aVar3;
                Wo.a(null, false, null, null, z2.c.e(-755303063, true, new b(title, lottieSource, e13, aVar3), lVarV, 54), lVarV, 24576, 15);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                aVar4 = aVar5;
            }
            e12 = e13;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.li0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return Ly.a(title, lottieSource, e12, onScreenShown, aVar4, onSystemBackClicked, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        aVar2 = aVar;
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (lVarV.K(onSystemBackClicked)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i13 |= i14;
        }
        if ((74899 & i13) != 74898) {
            if (i15 != 0) {
                e13 = null;
            }
            if (i16 != 0) {
                lVarV.o(-1160809022);
                objI3 = lVarV.I();
                if (objI3 == p020r2.l.INSTANCE.a()) {
                    objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.ji0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Ly.a();
                        }
                    };
                    lVarV.B(objI3);
                }
                aVar3 = (wn0.a) objI3;
                lVarV.l();
            } else {
                aVar3 = aVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(535210673, i13, -1, "com.fourthline.orca.core.internal.composable.SpinnerScreen (SpinnerScreen.kt:34)");
            }
            lVarV.o(-1160807035);
            if ((458752 & i13) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI = lVarV.I();
            if (!z11) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ki0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ly.a(onSystemBackClicked);
                    }
                };
                lVarV.B(objI);
            } else {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ki0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ly.a(onSystemBackClicked);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
            jn0.h0 h0Var2 = jn0.h0.f84049a;
            lVarV.o(-1160804993);
            if ((i13 & 7168) == 2048) {
            }
            objI2 = lVarV.I();
            if (!z12) {
                objI2 = new a(onScreenShown, null);
                lVarV.B(objI2);
            } else {
                objI2 = new a(onScreenShown, null);
                lVarV.B(objI2);
            }
            lVarV.l();
            Function0.g(h0Var2, (wn0.p) objI2, lVarV, 6);
            wn0.a aVar6 = aVar3;
            Wo.a(null, false, null, null, z2.c.e(-755303063, true, new b(title, lottieSource, e13, aVar3), lVarV, 54), lVarV, 24576, 15);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            aVar4 = aVar6;
        } else {
            if (i15 != 0) {
                e13 = null;
            }
            if (i16 != 0) {
                lVarV.o(-1160809022);
                objI3 = lVarV.I();
                if (objI3 == p020r2.l.INSTANCE.a()) {
                    objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.ji0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Ly.a();
                        }
                    };
                    lVarV.B(objI3);
                }
                aVar3 = (wn0.a) objI3;
                lVarV.l();
            } else {
                aVar3 = aVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(535210673, i13, -1, "com.fourthline.orca.core.internal.composable.SpinnerScreen (SpinnerScreen.kt:34)");
            }
            lVarV.o(-1160807035);
            if ((458752 & i13) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI = lVarV.I();
            if (!z11) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ki0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ly.a(onSystemBackClicked);
                    }
                };
                lVarV.B(objI);
            } else {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ki0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ly.a(onSystemBackClicked);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
            jn0.h0 h0Var3 = jn0.h0.f84049a;
            lVarV.o(-1160804993);
            if ((i13 & 7168) == 2048) {
            }
            objI2 = lVarV.I();
            if (!z12) {
                objI2 = new a(onScreenShown, null);
                lVarV.B(objI2);
            } else {
                objI2 = new a(onScreenShown, null);
                lVarV.B(objI2);
            }
            lVarV.l();
            Function0.g(h0Var3, (wn0.p) objI2, lVarV, 6);
            wn0.a aVar7 = aVar3;
            Wo.a(null, false, null, null, z2.c.e(-755303063, true, new b(title, lottieSource, e13, aVar3), lVarV, 54), lVarV, 24576, 15);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            aVar4 = aVar7;
        }
        e12 = e13;
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.li0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ly.a(title, lottieSource, e12, onScreenShown, aVar4, onSystemBackClicked, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.a aVar) {
        aVar.invoke();
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code duplicated, block: B:76:0x011b  */
    /* JADX WARN: Code duplicated, block: B:77:0x011f  */
    /* JADX WARN: Code duplicated, block: B:80:0x013e  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0265  */
    /* JADX WARN: Code duplicated, block: B:86:0x026a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0276  */
    /* JADX WARN: Code duplicated, block: B:89:0x0279  */
    /* JADX WARN: Code duplicated, block: B:92:0x0280  */
    /* JADX WARN: Code duplicated, block: B:96:0x028c  */
    public static final void a(final QA title, final Yj lottieSource, E3 e11, wn0.a aVar, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        final wn0.a aVar2;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        int i14;
        wn0.a aVar3;
        E3 e12;
        boolean z11;
        Object objI;
        E3 e13;
        final E3 e14;
        Object objI2;
        final wn0.a aVar4;
        p020r2.w2 w2VarX;
        E3 e15 = e11;
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p020r2.l lVarV = lVar.v(-1451853678);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? lVarV.n(title) : lVarV.K(title) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? lVarV.n(lottieSource) : lVarV.K(lottieSource) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= (i11 & 512) == 0 ? lVarV.n(e15) : lVarV.K(e15) ? 256 : 128;
        }
        int i16 = i12 & 8;
        if (i16 == 0) {
            if ((i11 & 3072) == 0) {
                aVar2 = aVar;
                i13 |= lVarV.K(aVar2) ? 2048 : 1024;
            }
            if ((i13 & 1171) != 1170 && lVarV.b()) {
                lVarV.j();
                e14 = e15;
            } else {
                if (i15 != 0) {
                    e15 = null;
                }
                if (i16 != 0) {
                    lVarV.o(308901755);
                    objI2 = lVarV.I();
                    if (objI2 == p020r2.l.INSTANCE.a()) {
                        objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.mi0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Ly.b();
                            }
                        };
                        lVarV.B(objI2);
                    }
                    lVarV.l();
                    aVar2 = (wn0.a) objI2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1451853678, i13, -1, "com.fourthline.orca.core.internal.composable.SpinnerView (SpinnerScreen.kt:59)");
                }
                androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
                z3.i0 i0VarA = v1.g.a(v1.b.f117444a.e(), d3.c.INSTANCE.g(), lVarV, 54);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC = lVarV.c();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarH);
                b4.g.Companion companion2 = b4.g.INSTANCE;
                aVarA = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA, i0VarA, companion2.c());
                p020r2.d4.b(lVarA, xVarC, companion2.e());
                pVarB = companion2.b();
                if (!lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE, companion2.d());
                v1.j jVar = v1.j.f117505a;
                v1.i0.a(v1.i.b(jVar, companion, 1.0f, false, 2, null), lVarV, 0);
                androidx.compose.ui.d dVarA = AbstractC3307gk.a(companion, "titleView", (String) null, 2, (Object) null);
                String strC = RA.c(title, lVarV, i13 & 14);
                C3825sp c3825sp = C3825sp.f35377a;
                i14 = i13;
                aVar3 = aVar2;
                e12 = e15;
                p009i2.v2.b(strC, dVarA, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3825sp.b(lVarV, 6).getScreen().getTitle().a(null, lVarV, 0, 1), lVarV, 0, 0, 65532);
                v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(32)), lVarV, 6);
                TA.a(AbstractC3307gk.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(180)), "illustrationView", (String) null, 2, (Object) null), false, false, 0L, c3825sp.b(lVarV, 6).getSpinner().getBackground().a(lVarV, 0), 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, lottieSource, null, null, null, lVarV, 12582912, (i14 >> 3) & 14, 15214);
                lVarV = lVarV;
                v1.i0.a(v1.i.b(jVar, companion, 1.5f, false, 2, null), lVarV, 0);
                lVarV.o(-1351718434);
                if (e12 == null) {
                    e13 = e12;
                    aVar2 = aVar3;
                } else {
                    lVarV.o(-926077688);
                    if ((i14 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (!z11 || objI == p020r2.l.INSTANCE.a()) {
                        aVar2 = aVar3;
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.ni0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return Ly.a(aVar2, (InterfaceC3807sD) obj);
                            }
                        };
                        lVarV.B(objI);
                    } else {
                        aVar2 = aVar3;
                    }
                    lVarV.l();
                    e13 = e12;
                    S3.a(null, e13, null, (wn0.l) objI, lVarV, 0, 5);
                }
                lVarV.l();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                e14 = e13;
            }
            aVar4 = aVar2;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.oi0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return Ly.a(title, lottieSource, e14, aVar4, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        aVar2 = aVar;
        if ((i13 & 1171) != 1170) {
            if (i15 != 0) {
                e15 = null;
            }
            if (i16 != 0) {
                lVarV.o(308901755);
                objI2 = lVarV.I();
                if (objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.mi0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Ly.b();
                        }
                    };
                    lVarV.B(objI2);
                }
                lVarV.l();
                aVar2 = (wn0.a) objI2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1451853678, i13, -1, "com.fourthline.orca.core.internal.composable.SpinnerView (SpinnerScreen.kt:59)");
            }
            androidx.compose.ui.d.Companion companion3 = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.x.h(companion3, BitmapDescriptorFactory.HUE_RED, 1, null);
            z3.i0 i0VarA2 = v1.g.a(v1.b.f117444a.e(), d3.c.INSTANCE.g(), lVarV, 54);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarH2);
            b4.g.Companion companion4 = b4.g.INSTANCE;
            aVarA = companion4.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarA2, companion4.c());
            p020r2.d4.b(lVarA, xVarC2, companion4.e());
            pVarB = companion4.b();
            if (!lVarA.u()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE2, companion4.d());
            v1.j jVar2 = v1.j.f117505a;
            v1.i0.a(v1.i.b(jVar2, companion3, 1.0f, false, 2, null), lVarV, 0);
            androidx.compose.ui.d dVarA2 = AbstractC3307gk.a(companion3, "titleView", (String) null, 2, (Object) null);
            String strC2 = RA.c(title, lVarV, i13 & 14);
            C3825sp c3825sp2 = C3825sp.f35377a;
            i14 = i13;
            aVar3 = aVar2;
            e12 = e15;
            p009i2.v2.b(strC2, dVarA2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3825sp2.b(lVarV, 6).getScreen().getTitle().a(null, lVarV, 0, 1), lVarV, 0, 0, 65532);
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion3, w4.h.g(32)), lVarV, 6);
            TA.a(AbstractC3307gk.a(androidx.compose.foundation.layout.x.q(companion3, w4.h.g(180)), "illustrationView", (String) null, 2, (Object) null), false, false, 0L, c3825sp2.b(lVarV, 6).getSpinner().getBackground().a(lVarV, 0), 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, lottieSource, null, null, null, lVarV, 12582912, (i14 >> 3) & 14, 15214);
            lVarV = lVarV;
            v1.i0.a(v1.i.b(jVar2, companion3, 1.5f, false, 2, null), lVarV, 0);
            lVarV.o(-1351718434);
            if (e12 == null) {
                e13 = e12;
                aVar2 = aVar3;
            } else {
                lVarV.o(-926077688);
                if ((i14 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (z11) {
                    aVar2 = aVar3;
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.ni0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return Ly.a(aVar2, (InterfaceC3807sD) obj);
                        }
                    };
                    lVarV.B(objI);
                } else {
                    aVar2 = aVar3;
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.ni0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return Ly.a(aVar2, (InterfaceC3807sD) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                e13 = e12;
                S3.a(null, e13, null, (wn0.l) objI, lVarV, 0, 5);
            }
            lVarV.l();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            e14 = e13;
        } else {
            if (i15 != 0) {
                e15 = null;
            }
            if (i16 != 0) {
                lVarV.o(308901755);
                objI2 = lVarV.I();
                if (objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.mi0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Ly.b();
                        }
                    };
                    lVarV.B(objI2);
                }
                lVarV.l();
                aVar2 = (wn0.a) objI2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1451853678, i13, -1, "com.fourthline.orca.core.internal.composable.SpinnerView (SpinnerScreen.kt:59)");
            }
            androidx.compose.ui.d.Companion companion5 = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarH3 = androidx.compose.foundation.layout.x.h(companion5, BitmapDescriptorFactory.HUE_RED, 1, null);
            z3.i0 i0VarA3 = v1.g.a(v1.b.f117444a.e(), d3.c.INSTANCE.g(), lVarV, 54);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC3 = lVarV.c();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarH3);
            b4.g.Companion companion6 = b4.g.INSTANCE;
            aVarA = companion6.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarA3, companion6.c());
            p020r2.d4.b(lVarA, xVarC3, companion6.e());
            pVarB = companion6.b();
            if (!lVarA.u()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE3, companion6.d());
            v1.j jVar3 = v1.j.f117505a;
            v1.i0.a(v1.i.b(jVar3, companion5, 1.0f, false, 2, null), lVarV, 0);
            androidx.compose.ui.d dVarA3 = AbstractC3307gk.a(companion5, "titleView", (String) null, 2, (Object) null);
            String strC3 = RA.c(title, lVarV, i13 & 14);
            C3825sp c3825sp3 = C3825sp.f35377a;
            i14 = i13;
            aVar3 = aVar2;
            e12 = e15;
            p009i2.v2.b(strC3, dVarA3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3825sp3.b(lVarV, 6).getScreen().getTitle().a(null, lVarV, 0, 1), lVarV, 0, 0, 65532);
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion5, w4.h.g(32)), lVarV, 6);
            TA.a(AbstractC3307gk.a(androidx.compose.foundation.layout.x.q(companion5, w4.h.g(180)), "illustrationView", (String) null, 2, (Object) null), false, false, 0L, c3825sp3.b(lVarV, 6).getSpinner().getBackground().a(lVarV, 0), 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, lottieSource, null, null, null, lVarV, 12582912, (i14 >> 3) & 14, 15214);
            lVarV = lVarV;
            v1.i0.a(v1.i.b(jVar3, companion5, 1.5f, false, 2, null), lVarV, 0);
            lVarV.o(-1351718434);
            if (e12 == null) {
                e13 = e12;
                aVar2 = aVar3;
            } else {
                lVarV.o(-926077688);
                if ((i14 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (z11) {
                    aVar2 = aVar3;
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.ni0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return Ly.a(aVar2, (InterfaceC3807sD) obj);
                        }
                    };
                    lVarV.B(objI);
                } else {
                    aVar2 = aVar3;
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.ni0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return Ly.a(aVar2, (InterfaceC3807sD) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                e13 = e12;
                S3.a(null, e13, null, (wn0.l) objI, lVarV, 0, 5);
            }
            lVarV.l();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            e14 = e13;
        }
        aVar4 = aVar2;
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.oi0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ly.a(title, lottieSource, e14, aVar4, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.a aVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        aVar.invoke();
        return jn0.h0.f84049a;
    }
}
