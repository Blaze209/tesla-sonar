package kotlin;

import i4.TextLayoutResult;
import i4.TextStyle;
import j3.g;
import jn0.h0;
import jn0.t;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p021s1.a0;
import v3.f0;
import v3.o0;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001av\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Li4/d;", "text", "Landroidx/compose/ui/d;", "modifier", "Li4/r0;", "style", "", "softWrap", "Lt4/t;", "overflow", "", "maxLines", "Lkotlin/Function1;", "Li4/m0;", "Ljn0/h0;", "onTextLayout", "onClick", "a", "(Li4/d;Landroidx/compose/ui/d;Li4/r0;ZIILwn0/l;Lwn0/l;Lr2/l;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    @p013kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/m0;", "it", "Ljn0/h0;", "a", "(Li4/m0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<TextLayoutResult, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<TextLayoutResult> f15485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<TextLayoutResult, h0> f15486d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p1<TextLayoutResult> p1Var, l<? super TextLayoutResult, h0> lVar) {
            super(1);
            this.f15485c = p1Var;
            this.f15486d = lVar;
        }

        public final void a(TextLayoutResult textLayoutResult) {
            this.f15485c.setValue(textLayoutResult);
            this.f15486d.invoke(textLayoutResult);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i4.d f15487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f15488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f15489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f15490f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15491g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f15492h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ l<TextLayoutResult, h0> f15493i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ l<Integer, h0> f15494j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f15495k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f15496l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i4.d dVar, androidx.compose.ui.d dVar2, TextStyle textStyle, boolean z11, int i11, int i12, l<? super TextLayoutResult, h0> lVar, l<? super Integer, h0> lVar2, int i13, int i14) {
            super(2);
            this.f15487c = dVar;
            this.f15488d = dVar2;
            this.f15489e = textStyle;
            this.f15490f = z11;
            this.f15491g = i11;
            this.f15492h = i12;
            this.f15493i = lVar;
            this.f15494j = lVar2;
            this.f15495k = i13;
            this.f15496l = i14;
        }

        public final void a(p020r2.l lVar, int i11) {
            e.a(this.f15487c, this.f15488d, this.f15489e, this.f15490f, this.f15491g, this.f15492h, this.f15493i, this.f15494j, lVar, k2.a(this.f15495k | 1), this.f15496l);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", f = "ClickableText.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<f0, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f15497n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f15498o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p1<TextLayoutResult> f15499p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ l<Integer, h0> f15500q;

        @p013kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/g;", "pos", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements l<g, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p1<TextLayoutResult> f15501c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l<Integer, h0> f15502d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p1<TextLayoutResult> p1Var, l<? super Integer, h0> lVar) {
                super(1);
                this.f15501c = p1Var;
                this.f15502d = lVar;
            }

            public final void a(long j11) {
                TextLayoutResult value = this.f15501c.getValue();
                if (value != null) {
                    this.f15502d.invoke(Integer.valueOf(value.x(j11)));
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(g gVar) {
                a(gVar.getPackedValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p1<TextLayoutResult> p1Var, l<? super Integer, h0> lVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f15499p = p1Var;
            this.f15500q = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f15499p, this.f15500q, continuation);
            dVar.f15498o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f15497n;
            if (i11 == 0) {
                t.b(obj);
                f0 f0Var = (f0) this.f15498o;
                a aVar = new a(this.f15499p, this.f15500q);
                this.f15497n = 1;
                if (a0.j(f0Var, null, null, null, aVar, this, 7, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(f0 f0Var, Continuation<? super h0> continuation) {
            return ((d) create(f0Var, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x012f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0133  */
    /* JADX WARN: Code duplicated, block: B:107:0x0136  */
    /* JADX WARN: Code duplicated, block: B:110:0x013e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0154  */
    /* JADX WARN: Code duplicated, block: B:116:0x016c  */
    /* JADX WARN: Code duplicated, block: B:117:0x016e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0176  */
    /* JADX WARN: Code duplicated, block: B:122:0x017c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0199  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:133:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0111  */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    /* JADX WARN: Code duplicated, block: B:99:0x011f  */
    @jn0.e
    public static final void a(i4.d dVar, androidx.compose.ui.d dVar2, TextStyle textStyle, boolean z11, int i11, int i12, l<? super TextLayoutResult, h0> lVar, l<? super Integer, h0> lVar2, p020r2.l lVar3, int i13, int i14) {
        i4.d dVar3;
        int i15;
        androidx.compose.ui.d dVar4;
        int i16;
        TextStyle textStyleA;
        int i17;
        int i18;
        boolean z12;
        int i19;
        int i21;
        int iA;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        l<? super TextLayoutResult, h0> lVar4;
        Object objI;
        p020r2.l.Companion companion;
        p1 p1Var;
        boolean z13;
        Object objI2;
        boolean z14;
        Object objI3;
        p020r2.l lVar5;
        l<? super TextLayoutResult, h0> lVar6;
        TextStyle textStyle2;
        boolean z15;
        int i29;
        androidx.compose.ui.d dVar5;
        int i31;
        w2 w2VarX;
        p020r2.l lVarV = lVar3.v(-246609449);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
            dVar3 = dVar;
        } else {
            dVar3 = dVar;
            if ((i13 & 6) == 0) {
                i15 = (lVarV.n(dVar3) ? 4 : 2) | i13;
            } else {
                i15 = i13;
            }
        }
        int i32 = i14 & 2;
        if (i32 == 0) {
            if ((i13 & 48) == 0) {
                dVar4 = dVar2;
                i15 |= lVarV.n(dVar4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
                    textStyleA = textStyle;
                    if (lVarV.n(textStyleA)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        z12 = z11;
                        if (lVarV.p(z12)) {
                            i19 = 2048;
                        } else {
                            i19 = 1024;
                        }
                        i15 |= i19;
                    }
                    i21 = i14 & 16;
                    if (i21 != 0) {
                        if ((i13 & 24576) == 0) {
                            iA = i11;
                            if (lVarV.r(iA)) {
                                i22 = 16384;
                            } else {
                                i22 = PKIFailureInfo.certRevoked;
                            }
                            i15 |= i22;
                        }
                        i23 = i14 & 32;
                        if (i23 != 0) {
                            i15 |= 196608;
                        } else if ((i13 & 196608) == 0) {
                            if (lVarV.r(i12)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i15 |= i24;
                        }
                        i25 = i14 & 64;
                        if (i25 != 0) {
                            i15 |= 1572864;
                        } else if ((i13 & 1572864) == 0) {
                            if (lVarV.K(lVar)) {
                                i26 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i26 = PKIFailureInfo.signerNotTrusted;
                            }
                            i15 |= i26;
                        }
                        if ((i14 & 128) != 0) {
                            i15 |= 12582912;
                        } else if ((i13 & 12582912) == 0) {
                            if (lVarV.K(lVar2)) {
                                i27 = 8388608;
                            } else {
                                i27 = 4194304;
                            }
                            i15 |= i27;
                        }
                        if ((i15 & 4793491) == 4793490 || !lVarV.b()) {
                            if (i32 != 0) {
                                dVar4 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i16 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i18 != 0) {
                                z12 = true;
                            }
                            if (i21 != 0) {
                                iA = t4.t.INSTANCE.a();
                            }
                            if (i23 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i12;
                            }
                            if (i25 != 0) {
                                lVar4 = a.f15484c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (o.J()) {
                                o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                            }
                            objI = lVarV.I();
                            companion = p020r2.l.INSTANCE;
                            if (objI == companion.a()) {
                                objI = s3.d(null, null, 2, null);
                                lVarV.B(objI);
                            }
                            p1Var = (p1) objI;
                            androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
                            int i33 = i15;
                            if ((i15 & 29360128) == 8388608) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objI2 = lVarV.I();
                            if (z13 || objI2 == companion.a()) {
                                objI2 = new d(p1Var, lVar2, null);
                                lVarV.B(objI2);
                            }
                            androidx.compose.ui.d dVarG = dVar4.g(o0.d(companion2, lVar2, (p) objI2));
                            z14 = (i33 & 3670016) == 1048576;
                            objI3 = lVarV.I();
                            if (z14 || objI3 == companion.a()) {
                                objI3 = new b(p1Var, lVar4);
                                lVarV.B(objI3);
                            }
                            lVar5 = lVarV;
                            int i34 = i28;
                            boolean z16 = z12;
                            TextStyle textStyle3 = textStyleA;
                            kotlin.d.a(dVar3, dVarG, textStyle3, (l) objI3, iA, z16, i34, 0, null, null, lVar5, (i33 & 58254) | (458752 & (i33 << 6)) | ((i33 << 3) & 3670016), 896);
                            if (o.J()) {
                                o.R();
                            }
                            lVar6 = lVar4;
                            textStyle2 = textStyle3;
                            z15 = z16;
                            i29 = i34;
                        } else {
                            lVarV.j();
                            i29 = i12;
                            lVar5 = lVarV;
                            textStyle2 = textStyleA;
                            z15 = z12;
                            lVar6 = lVar;
                        }
                        dVar5 = dVar4;
                        i31 = iA;
                        w2VarX = lVar5.x();
                        if (w2VarX != null) {
                            w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
                        }
                    }
                    i15 |= 24576;
                    iA = i11;
                    i23 = i14 & 32;
                    if (i23 != 0) {
                        i15 |= 196608;
                    } else if ((i13 & 196608) == 0) {
                        if (lVarV.r(i12)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (lVarV.K(lVar)) {
                            i26 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i26 = PKIFailureInfo.signerNotTrusted;
                        }
                        i15 |= i26;
                    }
                    if ((i14 & 128) != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (lVarV.K(lVar2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i15 & 4793491) == 4793490) {
                        if (i32 != 0) {
                            dVar4 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i16 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i18 != 0) {
                            z12 = true;
                        }
                        if (i21 != 0) {
                            iA = t4.t.INSTANCE.a();
                        }
                        if (i23 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i12;
                        }
                        if (i25 != 0) {
                            lVar4 = a.f15484c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (o.J()) {
                            o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = s3.d(null, null, 2, null);
                            lVarV.B(objI);
                        }
                        p1Var = (p1) objI;
                        androidx.compose.ui.d.Companion companion3 = androidx.compose.ui.d.INSTANCE;
                        int i35 = i15;
                        if ((i15 & 29360128) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = lVarV.I();
                        if (z13) {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        }
                        androidx.compose.ui.d dVarG2 = dVar4.g(o0.d(companion3, lVar2, (p) objI2));
                        if ((i35 & 3670016) == 1048576) {
                        }
                        objI3 = lVarV.I();
                        if (z14) {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        }
                        lVar5 = lVarV;
                        int i36 = i28;
                        boolean z17 = z12;
                        TextStyle textStyle4 = textStyleA;
                        kotlin.d.a(dVar3, dVarG2, textStyle4, (l) objI3, iA, z17, i36, 0, null, null, lVar5, (i35 & 58254) | (458752 & (i35 << 6)) | ((i35 << 3) & 3670016), 896);
                        if (o.J()) {
                            o.R();
                        }
                        lVar6 = lVar4;
                        textStyle2 = textStyle4;
                        z15 = z17;
                        i29 = i36;
                    } else {
                        if (i32 != 0) {
                            dVar4 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i16 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i18 != 0) {
                            z12 = true;
                        }
                        if (i21 != 0) {
                            iA = t4.t.INSTANCE.a();
                        }
                        if (i23 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i12;
                        }
                        if (i25 != 0) {
                            lVar4 = a.f15484c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (o.J()) {
                            o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = s3.d(null, null, 2, null);
                            lVarV.B(objI);
                        }
                        p1Var = (p1) objI;
                        androidx.compose.ui.d.Companion companion4 = androidx.compose.ui.d.INSTANCE;
                        int i37 = i15;
                        if ((i15 & 29360128) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = lVarV.I();
                        if (z13) {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        }
                        androidx.compose.ui.d dVarG3 = dVar4.g(o0.d(companion4, lVar2, (p) objI2));
                        if ((i37 & 3670016) == 1048576) {
                        }
                        objI3 = lVarV.I();
                        if (z14) {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        }
                        lVar5 = lVarV;
                        int i38 = i28;
                        boolean z18 = z12;
                        TextStyle textStyle5 = textStyleA;
                        kotlin.d.a(dVar3, dVarG3, textStyle5, (l) objI3, iA, z18, i38, 0, null, null, lVar5, (i37 & 58254) | (458752 & (i37 << 6)) | ((i37 << 3) & 3670016), 896);
                        if (o.J()) {
                            o.R();
                        }
                        lVar6 = lVar4;
                        textStyle2 = textStyle5;
                        z15 = z18;
                        i29 = i38;
                    }
                    dVar5 = dVar4;
                    i31 = iA;
                    w2VarX = lVar5.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
                    }
                }
                i15 |= 3072;
                z12 = z11;
                i21 = i14 & 16;
                if (i21 != 0) {
                    if ((i13 & 24576) == 0) {
                        iA = i11;
                        if (lVarV.r(iA)) {
                            i22 = 16384;
                        } else {
                            i22 = PKIFailureInfo.certRevoked;
                        }
                        i15 |= i22;
                    }
                    i23 = i14 & 32;
                    if (i23 != 0) {
                        i15 |= 196608;
                    } else if ((i13 & 196608) == 0) {
                        if (lVarV.r(i12)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (lVarV.K(lVar)) {
                            i26 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i26 = PKIFailureInfo.signerNotTrusted;
                        }
                        i15 |= i26;
                    }
                    if ((i14 & 128) != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (lVarV.K(lVar2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i15 & 4793491) == 4793490) {
                        if (i32 != 0) {
                            dVar4 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i16 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i18 != 0) {
                            z12 = true;
                        }
                        if (i21 != 0) {
                            iA = t4.t.INSTANCE.a();
                        }
                        if (i23 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i12;
                        }
                        if (i25 != 0) {
                            lVar4 = a.f15484c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (o.J()) {
                            o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = s3.d(null, null, 2, null);
                            lVarV.B(objI);
                        }
                        p1Var = (p1) objI;
                        androidx.compose.ui.d.Companion companion5 = androidx.compose.ui.d.INSTANCE;
                        int i39 = i15;
                        if ((i15 & 29360128) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = lVarV.I();
                        if (z13) {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        }
                        androidx.compose.ui.d dVarG4 = dVar4.g(o0.d(companion5, lVar2, (p) objI2));
                        if ((i39 & 3670016) == 1048576) {
                        }
                        objI3 = lVarV.I();
                        if (z14) {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        }
                        lVar5 = lVarV;
                        int i310 = i28;
                        boolean z19 = z12;
                        TextStyle textStyle6 = textStyleA;
                        kotlin.d.a(dVar3, dVarG4, textStyle6, (l) objI3, iA, z19, i310, 0, null, null, lVar5, (i39 & 58254) | (458752 & (i39 << 6)) | ((i39 << 3) & 3670016), 896);
                        if (o.J()) {
                            o.R();
                        }
                        lVar6 = lVar4;
                        textStyle2 = textStyle6;
                        z15 = z19;
                        i29 = i310;
                    } else {
                        if (i32 != 0) {
                            dVar4 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i16 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i18 != 0) {
                            z12 = true;
                        }
                        if (i21 != 0) {
                            iA = t4.t.INSTANCE.a();
                        }
                        if (i23 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i12;
                        }
                        if (i25 != 0) {
                            lVar4 = a.f15484c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (o.J()) {
                            o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = s3.d(null, null, 2, null);
                            lVarV.B(objI);
                        }
                        p1Var = (p1) objI;
                        androidx.compose.ui.d.Companion companion6 = androidx.compose.ui.d.INSTANCE;
                        int i311 = i15;
                        if ((i15 & 29360128) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = lVarV.I();
                        if (z13) {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        }
                        androidx.compose.ui.d dVarG5 = dVar4.g(o0.d(companion6, lVar2, (p) objI2));
                        if ((i311 & 3670016) == 1048576) {
                        }
                        objI3 = lVarV.I();
                        if (z14) {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        }
                        lVar5 = lVarV;
                        int i312 = i28;
                        boolean z110 = z12;
                        TextStyle textStyle7 = textStyleA;
                        kotlin.d.a(dVar3, dVarG5, textStyle7, (l) objI3, iA, z110, i312, 0, null, null, lVar5, (i311 & 58254) | (458752 & (i311 << 6)) | ((i311 << 3) & 3670016), 896);
                        if (o.J()) {
                            o.R();
                        }
                        lVar6 = lVar4;
                        textStyle2 = textStyle7;
                        z15 = z110;
                        i29 = i312;
                    }
                    dVar5 = dVar4;
                    i31 = iA;
                    w2VarX = lVar5.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
                    }
                }
                i15 |= 24576;
                iA = i11;
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (lVarV.r(i12)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (lVarV.K(lVar)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i15 |= i26;
                }
                if ((i14 & 128) != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (lVarV.K(lVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i15 & 4793491) == 4793490) {
                    if (i32 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i12;
                    }
                    if (i25 != 0) {
                        lVar4 = a.f15484c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    androidx.compose.ui.d.Companion companion7 = androidx.compose.ui.d.INSTANCE;
                    int i313 = i15;
                    if ((i15 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = lVarV.I();
                    if (z13) {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    }
                    androidx.compose.ui.d dVarG6 = dVar4.g(o0.d(companion7, lVar2, (p) objI2));
                    if ((i313 & 3670016) == 1048576) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    }
                    lVar5 = lVarV;
                    int i314 = i28;
                    boolean z111 = z12;
                    TextStyle textStyle8 = textStyleA;
                    kotlin.d.a(dVar3, dVarG6, textStyle8, (l) objI3, iA, z111, i314, 0, null, null, lVar5, (i313 & 58254) | (458752 & (i313 << 6)) | ((i313 << 3) & 3670016), 896);
                    if (o.J()) {
                        o.R();
                    }
                    lVar6 = lVar4;
                    textStyle2 = textStyle8;
                    z15 = z111;
                    i29 = i314;
                } else {
                    if (i32 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i12;
                    }
                    if (i25 != 0) {
                        lVar4 = a.f15484c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    androidx.compose.ui.d.Companion companion8 = androidx.compose.ui.d.INSTANCE;
                    int i315 = i15;
                    if ((i15 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = lVarV.I();
                    if (z13) {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    }
                    androidx.compose.ui.d dVarG7 = dVar4.g(o0.d(companion8, lVar2, (p) objI2));
                    if ((i315 & 3670016) == 1048576) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    }
                    lVar5 = lVarV;
                    int i316 = i28;
                    boolean z112 = z12;
                    TextStyle textStyle9 = textStyleA;
                    kotlin.d.a(dVar3, dVarG7, textStyle9, (l) objI3, iA, z112, i316, 0, null, null, lVar5, (i315 & 58254) | (458752 & (i315 << 6)) | ((i315 << 3) & 3670016), 896);
                    if (o.J()) {
                        o.R();
                    }
                    lVar6 = lVar4;
                    textStyle2 = textStyle9;
                    z15 = z112;
                    i29 = i316;
                }
                dVar5 = dVar4;
                i31 = iA;
                w2VarX = lVar5.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
                }
            }
            i15 |= KyberEngine.KyberPolyBytes;
            textStyleA = textStyle;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i15 |= i19;
                }
                i21 = i14 & 16;
                if (i21 != 0) {
                    if ((i13 & 24576) == 0) {
                        iA = i11;
                        if (lVarV.r(iA)) {
                            i22 = 16384;
                        } else {
                            i22 = PKIFailureInfo.certRevoked;
                        }
                        i15 |= i22;
                    }
                    i23 = i14 & 32;
                    if (i23 != 0) {
                        i15 |= 196608;
                    } else if ((i13 & 196608) == 0) {
                        if (lVarV.r(i12)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (lVarV.K(lVar)) {
                            i26 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i26 = PKIFailureInfo.signerNotTrusted;
                        }
                        i15 |= i26;
                    }
                    if ((i14 & 128) != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (lVarV.K(lVar2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i15 & 4793491) == 4793490) {
                        if (i32 != 0) {
                            dVar4 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i16 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i18 != 0) {
                            z12 = true;
                        }
                        if (i21 != 0) {
                            iA = t4.t.INSTANCE.a();
                        }
                        if (i23 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i12;
                        }
                        if (i25 != 0) {
                            lVar4 = a.f15484c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (o.J()) {
                            o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = s3.d(null, null, 2, null);
                            lVarV.B(objI);
                        }
                        p1Var = (p1) objI;
                        androidx.compose.ui.d.Companion companion9 = androidx.compose.ui.d.INSTANCE;
                        int i317 = i15;
                        if ((i15 & 29360128) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = lVarV.I();
                        if (z13) {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        }
                        androidx.compose.ui.d dVarG8 = dVar4.g(o0.d(companion9, lVar2, (p) objI2));
                        if ((i317 & 3670016) == 1048576) {
                        }
                        objI3 = lVarV.I();
                        if (z14) {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        }
                        lVar5 = lVarV;
                        int i318 = i28;
                        boolean z113 = z12;
                        TextStyle textStyle10 = textStyleA;
                        kotlin.d.a(dVar3, dVarG8, textStyle10, (l) objI3, iA, z113, i318, 0, null, null, lVar5, (i317 & 58254) | (458752 & (i317 << 6)) | ((i317 << 3) & 3670016), 896);
                        if (o.J()) {
                            o.R();
                        }
                        lVar6 = lVar4;
                        textStyle2 = textStyle10;
                        z15 = z113;
                        i29 = i318;
                    } else {
                        if (i32 != 0) {
                            dVar4 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i16 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i18 != 0) {
                            z12 = true;
                        }
                        if (i21 != 0) {
                            iA = t4.t.INSTANCE.a();
                        }
                        if (i23 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i12;
                        }
                        if (i25 != 0) {
                            lVar4 = a.f15484c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (o.J()) {
                            o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = s3.d(null, null, 2, null);
                            lVarV.B(objI);
                        }
                        p1Var = (p1) objI;
                        androidx.compose.ui.d.Companion companion10 = androidx.compose.ui.d.INSTANCE;
                        int i319 = i15;
                        if ((i15 & 29360128) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = lVarV.I();
                        if (z13) {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        }
                        androidx.compose.ui.d dVarG9 = dVar4.g(o0.d(companion10, lVar2, (p) objI2));
                        if ((i319 & 3670016) == 1048576) {
                        }
                        objI3 = lVarV.I();
                        if (z14) {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        }
                        lVar5 = lVarV;
                        int i3110 = i28;
                        boolean z114 = z12;
                        TextStyle textStyle11 = textStyleA;
                        kotlin.d.a(dVar3, dVarG9, textStyle11, (l) objI3, iA, z114, i3110, 0, null, null, lVar5, (i319 & 58254) | (458752 & (i319 << 6)) | ((i319 << 3) & 3670016), 896);
                        if (o.J()) {
                            o.R();
                        }
                        lVar6 = lVar4;
                        textStyle2 = textStyle11;
                        z15 = z114;
                        i29 = i3110;
                    }
                    dVar5 = dVar4;
                    i31 = iA;
                    w2VarX = lVar5.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
                    }
                }
                i15 |= 24576;
                iA = i11;
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (lVarV.r(i12)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (lVarV.K(lVar)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i15 |= i26;
                }
                if ((i14 & 128) != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (lVarV.K(lVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i15 & 4793491) == 4793490) {
                    if (i32 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i12;
                    }
                    if (i25 != 0) {
                        lVar4 = a.f15484c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    androidx.compose.ui.d.Companion companion11 = androidx.compose.ui.d.INSTANCE;
                    int i3111 = i15;
                    if ((i15 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = lVarV.I();
                    if (z13) {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    }
                    androidx.compose.ui.d dVarG10 = dVar4.g(o0.d(companion11, lVar2, (p) objI2));
                    if ((i3111 & 3670016) == 1048576) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    }
                    lVar5 = lVarV;
                    int i3112 = i28;
                    boolean z115 = z12;
                    TextStyle textStyle12 = textStyleA;
                    kotlin.d.a(dVar3, dVarG10, textStyle12, (l) objI3, iA, z115, i3112, 0, null, null, lVar5, (i3111 & 58254) | (458752 & (i3111 << 6)) | ((i3111 << 3) & 3670016), 896);
                    if (o.J()) {
                        o.R();
                    }
                    lVar6 = lVar4;
                    textStyle2 = textStyle12;
                    z15 = z115;
                    i29 = i3112;
                } else {
                    if (i32 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i12;
                    }
                    if (i25 != 0) {
                        lVar4 = a.f15484c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    androidx.compose.ui.d.Companion companion12 = androidx.compose.ui.d.INSTANCE;
                    int i3113 = i15;
                    if ((i15 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = lVarV.I();
                    if (z13) {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    }
                    androidx.compose.ui.d dVarG11 = dVar4.g(o0.d(companion12, lVar2, (p) objI2));
                    if ((i3113 & 3670016) == 1048576) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    }
                    lVar5 = lVarV;
                    int i3114 = i28;
                    boolean z116 = z12;
                    TextStyle textStyle13 = textStyleA;
                    kotlin.d.a(dVar3, dVarG11, textStyle13, (l) objI3, iA, z116, i3114, 0, null, null, lVar5, (i3113 & 58254) | (458752 & (i3113 << 6)) | ((i3113 << 3) & 3670016), 896);
                    if (o.J()) {
                        o.R();
                    }
                    lVar6 = lVar4;
                    textStyle2 = textStyle13;
                    z15 = z116;
                    i29 = i3114;
                }
                dVar5 = dVar4;
                i31 = iA;
                w2VarX = lVar5.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
                }
            }
            i15 |= 3072;
            z12 = z11;
            i21 = i14 & 16;
            if (i21 != 0) {
                if ((i13 & 24576) == 0) {
                    iA = i11;
                    if (lVarV.r(iA)) {
                        i22 = 16384;
                    } else {
                        i22 = PKIFailureInfo.certRevoked;
                    }
                    i15 |= i22;
                }
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (lVarV.r(i12)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (lVarV.K(lVar)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i15 |= i26;
                }
                if ((i14 & 128) != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (lVarV.K(lVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i15 & 4793491) == 4793490) {
                    if (i32 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i12;
                    }
                    if (i25 != 0) {
                        lVar4 = a.f15484c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    androidx.compose.ui.d.Companion companion13 = androidx.compose.ui.d.INSTANCE;
                    int i3115 = i15;
                    if ((i15 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = lVarV.I();
                    if (z13) {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    }
                    androidx.compose.ui.d dVarG12 = dVar4.g(o0.d(companion13, lVar2, (p) objI2));
                    if ((i3115 & 3670016) == 1048576) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    }
                    lVar5 = lVarV;
                    int i3116 = i28;
                    boolean z117 = z12;
                    TextStyle textStyle14 = textStyleA;
                    kotlin.d.a(dVar3, dVarG12, textStyle14, (l) objI3, iA, z117, i3116, 0, null, null, lVar5, (i3115 & 58254) | (458752 & (i3115 << 6)) | ((i3115 << 3) & 3670016), 896);
                    if (o.J()) {
                        o.R();
                    }
                    lVar6 = lVar4;
                    textStyle2 = textStyle14;
                    z15 = z117;
                    i29 = i3116;
                } else {
                    if (i32 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i12;
                    }
                    if (i25 != 0) {
                        lVar4 = a.f15484c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    androidx.compose.ui.d.Companion companion14 = androidx.compose.ui.d.INSTANCE;
                    int i3117 = i15;
                    if ((i15 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = lVarV.I();
                    if (z13) {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    }
                    androidx.compose.ui.d dVarG13 = dVar4.g(o0.d(companion14, lVar2, (p) objI2));
                    if ((i3117 & 3670016) == 1048576) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    }
                    lVar5 = lVarV;
                    int i3118 = i28;
                    boolean z118 = z12;
                    TextStyle textStyle15 = textStyleA;
                    kotlin.d.a(dVar3, dVarG13, textStyle15, (l) objI3, iA, z118, i3118, 0, null, null, lVar5, (i3117 & 58254) | (458752 & (i3117 << 6)) | ((i3117 << 3) & 3670016), 896);
                    if (o.J()) {
                        o.R();
                    }
                    lVar6 = lVar4;
                    textStyle2 = textStyle15;
                    z15 = z118;
                    i29 = i3118;
                }
                dVar5 = dVar4;
                i31 = iA;
                w2VarX = lVar5.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
                }
            }
            i15 |= 24576;
            iA = i11;
            i23 = i14 & 32;
            if (i23 != 0) {
                i15 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (lVarV.r(i12)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (lVarV.K(lVar)) {
                    i26 = PKIFailureInfo.badCertTemplate;
                } else {
                    i26 = PKIFailureInfo.signerNotTrusted;
                }
                i15 |= i26;
            }
            if ((i14 & 128) != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (lVarV.K(lVar2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i15 & 4793491) == 4793490) {
                if (i32 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i16 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i18 != 0) {
                    z12 = true;
                }
                if (i21 != 0) {
                    iA = t4.t.INSTANCE.a();
                }
                if (i23 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i12;
                }
                if (i25 != 0) {
                    lVar4 = a.f15484c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                androidx.compose.ui.d.Companion companion15 = androidx.compose.ui.d.INSTANCE;
                int i3119 = i15;
                if ((i15 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = lVarV.I();
                if (z13) {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                } else {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                }
                androidx.compose.ui.d dVarG14 = dVar4.g(o0.d(companion15, lVar2, (p) objI2));
                if ((i3119 & 3670016) == 1048576) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                }
                lVar5 = lVarV;
                int i31110 = i28;
                boolean z119 = z12;
                TextStyle textStyle16 = textStyleA;
                kotlin.d.a(dVar3, dVarG14, textStyle16, (l) objI3, iA, z119, i31110, 0, null, null, lVar5, (i3119 & 58254) | (458752 & (i3119 << 6)) | ((i3119 << 3) & 3670016), 896);
                if (o.J()) {
                    o.R();
                }
                lVar6 = lVar4;
                textStyle2 = textStyle16;
                z15 = z119;
                i29 = i31110;
            } else {
                if (i32 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i16 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i18 != 0) {
                    z12 = true;
                }
                if (i21 != 0) {
                    iA = t4.t.INSTANCE.a();
                }
                if (i23 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i12;
                }
                if (i25 != 0) {
                    lVar4 = a.f15484c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                androidx.compose.ui.d.Companion companion16 = androidx.compose.ui.d.INSTANCE;
                int i31111 = i15;
                if ((i15 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = lVarV.I();
                if (z13) {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                } else {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                }
                androidx.compose.ui.d dVarG15 = dVar4.g(o0.d(companion16, lVar2, (p) objI2));
                if ((i31111 & 3670016) == 1048576) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                }
                lVar5 = lVarV;
                int i31112 = i28;
                boolean z1110 = z12;
                TextStyle textStyle17 = textStyleA;
                kotlin.d.a(dVar3, dVarG15, textStyle17, (l) objI3, iA, z1110, i31112, 0, null, null, lVar5, (i31111 & 58254) | (458752 & (i31111 << 6)) | ((i31111 << 3) & 3670016), 896);
                if (o.J()) {
                    o.R();
                }
                lVar6 = lVar4;
                textStyle2 = textStyle17;
                z15 = z1110;
                i29 = i31112;
            }
            dVar5 = dVar4;
            i31 = iA;
            w2VarX = lVar5.x();
            if (w2VarX != null) {
                w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
            }
        }
        i15 |= 48;
        dVar4 = dVar2;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
                textStyleA = textStyle;
                if (lVarV.n(textStyleA)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i15 |= i19;
                }
                i21 = i14 & 16;
                if (i21 != 0) {
                    if ((i13 & 24576) == 0) {
                        iA = i11;
                        if (lVarV.r(iA)) {
                            i22 = 16384;
                        } else {
                            i22 = PKIFailureInfo.certRevoked;
                        }
                        i15 |= i22;
                    }
                    i23 = i14 & 32;
                    if (i23 != 0) {
                        i15 |= 196608;
                    } else if ((i13 & 196608) == 0) {
                        if (lVarV.r(i12)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (lVarV.K(lVar)) {
                            i26 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i26 = PKIFailureInfo.signerNotTrusted;
                        }
                        i15 |= i26;
                    }
                    if ((i14 & 128) != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (lVarV.K(lVar2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i15 & 4793491) == 4793490) {
                        if (i32 != 0) {
                            dVar4 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i16 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i18 != 0) {
                            z12 = true;
                        }
                        if (i21 != 0) {
                            iA = t4.t.INSTANCE.a();
                        }
                        if (i23 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i12;
                        }
                        if (i25 != 0) {
                            lVar4 = a.f15484c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (o.J()) {
                            o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = s3.d(null, null, 2, null);
                            lVarV.B(objI);
                        }
                        p1Var = (p1) objI;
                        androidx.compose.ui.d.Companion companion17 = androidx.compose.ui.d.INSTANCE;
                        int i31113 = i15;
                        if ((i15 & 29360128) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = lVarV.I();
                        if (z13) {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        }
                        androidx.compose.ui.d dVarG16 = dVar4.g(o0.d(companion17, lVar2, (p) objI2));
                        if ((i31113 & 3670016) == 1048576) {
                        }
                        objI3 = lVarV.I();
                        if (z14) {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        }
                        lVar5 = lVarV;
                        int i31114 = i28;
                        boolean z1111 = z12;
                        TextStyle textStyle18 = textStyleA;
                        kotlin.d.a(dVar3, dVarG16, textStyle18, (l) objI3, iA, z1111, i31114, 0, null, null, lVar5, (i31113 & 58254) | (458752 & (i31113 << 6)) | ((i31113 << 3) & 3670016), 896);
                        if (o.J()) {
                            o.R();
                        }
                        lVar6 = lVar4;
                        textStyle2 = textStyle18;
                        z15 = z1111;
                        i29 = i31114;
                    } else {
                        if (i32 != 0) {
                            dVar4 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i16 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i18 != 0) {
                            z12 = true;
                        }
                        if (i21 != 0) {
                            iA = t4.t.INSTANCE.a();
                        }
                        if (i23 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i12;
                        }
                        if (i25 != 0) {
                            lVar4 = a.f15484c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (o.J()) {
                            o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = s3.d(null, null, 2, null);
                            lVarV.B(objI);
                        }
                        p1Var = (p1) objI;
                        androidx.compose.ui.d.Companion companion18 = androidx.compose.ui.d.INSTANCE;
                        int i31115 = i15;
                        if ((i15 & 29360128) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = lVarV.I();
                        if (z13) {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        }
                        androidx.compose.ui.d dVarG17 = dVar4.g(o0.d(companion18, lVar2, (p) objI2));
                        if ((i31115 & 3670016) == 1048576) {
                        }
                        objI3 = lVarV.I();
                        if (z14) {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new b(p1Var, lVar4);
                            lVarV.B(objI3);
                        }
                        lVar5 = lVarV;
                        int i31116 = i28;
                        boolean z1112 = z12;
                        TextStyle textStyle19 = textStyleA;
                        kotlin.d.a(dVar3, dVarG17, textStyle19, (l) objI3, iA, z1112, i31116, 0, null, null, lVar5, (i31115 & 58254) | (458752 & (i31115 << 6)) | ((i31115 << 3) & 3670016), 896);
                        if (o.J()) {
                            o.R();
                        }
                        lVar6 = lVar4;
                        textStyle2 = textStyle19;
                        z15 = z1112;
                        i29 = i31116;
                    }
                    dVar5 = dVar4;
                    i31 = iA;
                    w2VarX = lVar5.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
                    }
                }
                i15 |= 24576;
                iA = i11;
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (lVarV.r(i12)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (lVarV.K(lVar)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i15 |= i26;
                }
                if ((i14 & 128) != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (lVarV.K(lVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i15 & 4793491) == 4793490) {
                    if (i32 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i12;
                    }
                    if (i25 != 0) {
                        lVar4 = a.f15484c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    androidx.compose.ui.d.Companion companion19 = androidx.compose.ui.d.INSTANCE;
                    int i31117 = i15;
                    if ((i15 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = lVarV.I();
                    if (z13) {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    }
                    androidx.compose.ui.d dVarG18 = dVar4.g(o0.d(companion19, lVar2, (p) objI2));
                    if ((i31117 & 3670016) == 1048576) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    }
                    lVar5 = lVarV;
                    int i31118 = i28;
                    boolean z1113 = z12;
                    TextStyle textStyle110 = textStyleA;
                    kotlin.d.a(dVar3, dVarG18, textStyle110, (l) objI3, iA, z1113, i31118, 0, null, null, lVar5, (i31117 & 58254) | (458752 & (i31117 << 6)) | ((i31117 << 3) & 3670016), 896);
                    if (o.J()) {
                        o.R();
                    }
                    lVar6 = lVar4;
                    textStyle2 = textStyle110;
                    z15 = z1113;
                    i29 = i31118;
                } else {
                    if (i32 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i12;
                    }
                    if (i25 != 0) {
                        lVar4 = a.f15484c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    androidx.compose.ui.d.Companion companion110 = androidx.compose.ui.d.INSTANCE;
                    int i31119 = i15;
                    if ((i15 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = lVarV.I();
                    if (z13) {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    }
                    androidx.compose.ui.d dVarG19 = dVar4.g(o0.d(companion110, lVar2, (p) objI2));
                    if ((i31119 & 3670016) == 1048576) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    }
                    lVar5 = lVarV;
                    int i311110 = i28;
                    boolean z1114 = z12;
                    TextStyle textStyle111 = textStyleA;
                    kotlin.d.a(dVar3, dVarG19, textStyle111, (l) objI3, iA, z1114, i311110, 0, null, null, lVar5, (i31119 & 58254) | (458752 & (i31119 << 6)) | ((i31119 << 3) & 3670016), 896);
                    if (o.J()) {
                        o.R();
                    }
                    lVar6 = lVar4;
                    textStyle2 = textStyle111;
                    z15 = z1114;
                    i29 = i311110;
                }
                dVar5 = dVar4;
                i31 = iA;
                w2VarX = lVar5.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
                }
            }
            i15 |= 3072;
            z12 = z11;
            i21 = i14 & 16;
            if (i21 != 0) {
                if ((i13 & 24576) == 0) {
                    iA = i11;
                    if (lVarV.r(iA)) {
                        i22 = 16384;
                    } else {
                        i22 = PKIFailureInfo.certRevoked;
                    }
                    i15 |= i22;
                }
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (lVarV.r(i12)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (lVarV.K(lVar)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i15 |= i26;
                }
                if ((i14 & 128) != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (lVarV.K(lVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i15 & 4793491) == 4793490) {
                    if (i32 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i12;
                    }
                    if (i25 != 0) {
                        lVar4 = a.f15484c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    androidx.compose.ui.d.Companion companion111 = androidx.compose.ui.d.INSTANCE;
                    int i311111 = i15;
                    if ((i15 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = lVarV.I();
                    if (z13) {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    }
                    androidx.compose.ui.d dVarG110 = dVar4.g(o0.d(companion111, lVar2, (p) objI2));
                    if ((i311111 & 3670016) == 1048576) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    }
                    lVar5 = lVarV;
                    int i311112 = i28;
                    boolean z1115 = z12;
                    TextStyle textStyle112 = textStyleA;
                    kotlin.d.a(dVar3, dVarG110, textStyle112, (l) objI3, iA, z1115, i311112, 0, null, null, lVar5, (i311111 & 58254) | (458752 & (i311111 << 6)) | ((i311111 << 3) & 3670016), 896);
                    if (o.J()) {
                        o.R();
                    }
                    lVar6 = lVar4;
                    textStyle2 = textStyle112;
                    z15 = z1115;
                    i29 = i311112;
                } else {
                    if (i32 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i12;
                    }
                    if (i25 != 0) {
                        lVar4 = a.f15484c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    androidx.compose.ui.d.Companion companion112 = androidx.compose.ui.d.INSTANCE;
                    int i311113 = i15;
                    if ((i15 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = lVarV.I();
                    if (z13) {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    }
                    androidx.compose.ui.d dVarG111 = dVar4.g(o0.d(companion112, lVar2, (p) objI2));
                    if ((i311113 & 3670016) == 1048576) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    }
                    lVar5 = lVarV;
                    int i311114 = i28;
                    boolean z1116 = z12;
                    TextStyle textStyle113 = textStyleA;
                    kotlin.d.a(dVar3, dVarG111, textStyle113, (l) objI3, iA, z1116, i311114, 0, null, null, lVar5, (i311113 & 58254) | (458752 & (i311113 << 6)) | ((i311113 << 3) & 3670016), 896);
                    if (o.J()) {
                        o.R();
                    }
                    lVar6 = lVar4;
                    textStyle2 = textStyle113;
                    z15 = z1116;
                    i29 = i311114;
                }
                dVar5 = dVar4;
                i31 = iA;
                w2VarX = lVar5.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
                }
            }
            i15 |= 24576;
            iA = i11;
            i23 = i14 & 32;
            if (i23 != 0) {
                i15 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (lVarV.r(i12)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (lVarV.K(lVar)) {
                    i26 = PKIFailureInfo.badCertTemplate;
                } else {
                    i26 = PKIFailureInfo.signerNotTrusted;
                }
                i15 |= i26;
            }
            if ((i14 & 128) != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (lVarV.K(lVar2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i15 & 4793491) == 4793490) {
                if (i32 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i16 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i18 != 0) {
                    z12 = true;
                }
                if (i21 != 0) {
                    iA = t4.t.INSTANCE.a();
                }
                if (i23 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i12;
                }
                if (i25 != 0) {
                    lVar4 = a.f15484c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                androidx.compose.ui.d.Companion companion113 = androidx.compose.ui.d.INSTANCE;
                int i311115 = i15;
                if ((i15 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = lVarV.I();
                if (z13) {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                } else {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                }
                androidx.compose.ui.d dVarG112 = dVar4.g(o0.d(companion113, lVar2, (p) objI2));
                if ((i311115 & 3670016) == 1048576) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                }
                lVar5 = lVarV;
                int i311116 = i28;
                boolean z1117 = z12;
                TextStyle textStyle114 = textStyleA;
                kotlin.d.a(dVar3, dVarG112, textStyle114, (l) objI3, iA, z1117, i311116, 0, null, null, lVar5, (i311115 & 58254) | (458752 & (i311115 << 6)) | ((i311115 << 3) & 3670016), 896);
                if (o.J()) {
                    o.R();
                }
                lVar6 = lVar4;
                textStyle2 = textStyle114;
                z15 = z1117;
                i29 = i311116;
            } else {
                if (i32 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i16 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i18 != 0) {
                    z12 = true;
                }
                if (i21 != 0) {
                    iA = t4.t.INSTANCE.a();
                }
                if (i23 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i12;
                }
                if (i25 != 0) {
                    lVar4 = a.f15484c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                androidx.compose.ui.d.Companion companion114 = androidx.compose.ui.d.INSTANCE;
                int i311117 = i15;
                if ((i15 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = lVarV.I();
                if (z13) {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                } else {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                }
                androidx.compose.ui.d dVarG113 = dVar4.g(o0.d(companion114, lVar2, (p) objI2));
                if ((i311117 & 3670016) == 1048576) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                }
                lVar5 = lVarV;
                int i311118 = i28;
                boolean z1118 = z12;
                TextStyle textStyle115 = textStyleA;
                kotlin.d.a(dVar3, dVarG113, textStyle115, (l) objI3, iA, z1118, i311118, 0, null, null, lVar5, (i311117 & 58254) | (458752 & (i311117 << 6)) | ((i311117 << 3) & 3670016), 896);
                if (o.J()) {
                    o.R();
                }
                lVar6 = lVar4;
                textStyle2 = textStyle115;
                z15 = z1118;
                i29 = i311118;
            }
            dVar5 = dVar4;
            i31 = iA;
            w2VarX = lVar5.x();
            if (w2VarX != null) {
                w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
            }
        }
        i15 |= KyberEngine.KyberPolyBytes;
        textStyleA = textStyle;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i15 |= i19;
            }
            i21 = i14 & 16;
            if (i21 != 0) {
                if ((i13 & 24576) == 0) {
                    iA = i11;
                    if (lVarV.r(iA)) {
                        i22 = 16384;
                    } else {
                        i22 = PKIFailureInfo.certRevoked;
                    }
                    i15 |= i22;
                }
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (lVarV.r(i12)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (lVarV.K(lVar)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i15 |= i26;
                }
                if ((i14 & 128) != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (lVarV.K(lVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i15 & 4793491) == 4793490) {
                    if (i32 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i12;
                    }
                    if (i25 != 0) {
                        lVar4 = a.f15484c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    androidx.compose.ui.d.Companion companion115 = androidx.compose.ui.d.INSTANCE;
                    int i311119 = i15;
                    if ((i15 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = lVarV.I();
                    if (z13) {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    }
                    androidx.compose.ui.d dVarG114 = dVar4.g(o0.d(companion115, lVar2, (p) objI2));
                    if ((i311119 & 3670016) == 1048576) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    }
                    lVar5 = lVarV;
                    int i3111110 = i28;
                    boolean z1119 = z12;
                    TextStyle textStyle116 = textStyleA;
                    kotlin.d.a(dVar3, dVarG114, textStyle116, (l) objI3, iA, z1119, i3111110, 0, null, null, lVar5, (i311119 & 58254) | (458752 & (i311119 << 6)) | ((i311119 << 3) & 3670016), 896);
                    if (o.J()) {
                        o.R();
                    }
                    lVar6 = lVar4;
                    textStyle2 = textStyle116;
                    z15 = z1119;
                    i29 = i3111110;
                } else {
                    if (i32 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i12;
                    }
                    if (i25 != 0) {
                        lVar4 = a.f15484c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    androidx.compose.ui.d.Companion companion116 = androidx.compose.ui.d.INSTANCE;
                    int i3111111 = i15;
                    if ((i15 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objI2 = lVarV.I();
                    if (z13) {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new d(p1Var, lVar2, null);
                        lVarV.B(objI2);
                    }
                    androidx.compose.ui.d dVarG115 = dVar4.g(o0.d(companion116, lVar2, (p) objI2));
                    if ((i3111111 & 3670016) == 1048576) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar4);
                        lVarV.B(objI3);
                    }
                    lVar5 = lVarV;
                    int i3111112 = i28;
                    boolean z11110 = z12;
                    TextStyle textStyle117 = textStyleA;
                    kotlin.d.a(dVar3, dVarG115, textStyle117, (l) objI3, iA, z11110, i3111112, 0, null, null, lVar5, (i3111111 & 58254) | (458752 & (i3111111 << 6)) | ((i3111111 << 3) & 3670016), 896);
                    if (o.J()) {
                        o.R();
                    }
                    lVar6 = lVar4;
                    textStyle2 = textStyle117;
                    z15 = z11110;
                    i29 = i3111112;
                }
                dVar5 = dVar4;
                i31 = iA;
                w2VarX = lVar5.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
                }
            }
            i15 |= 24576;
            iA = i11;
            i23 = i14 & 32;
            if (i23 != 0) {
                i15 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (lVarV.r(i12)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (lVarV.K(lVar)) {
                    i26 = PKIFailureInfo.badCertTemplate;
                } else {
                    i26 = PKIFailureInfo.signerNotTrusted;
                }
                i15 |= i26;
            }
            if ((i14 & 128) != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (lVarV.K(lVar2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i15 & 4793491) == 4793490) {
                if (i32 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i16 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i18 != 0) {
                    z12 = true;
                }
                if (i21 != 0) {
                    iA = t4.t.INSTANCE.a();
                }
                if (i23 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i12;
                }
                if (i25 != 0) {
                    lVar4 = a.f15484c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                androidx.compose.ui.d.Companion companion117 = androidx.compose.ui.d.INSTANCE;
                int i3111113 = i15;
                if ((i15 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = lVarV.I();
                if (z13) {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                } else {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                }
                androidx.compose.ui.d dVarG116 = dVar4.g(o0.d(companion117, lVar2, (p) objI2));
                if ((i3111113 & 3670016) == 1048576) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                }
                lVar5 = lVarV;
                int i3111114 = i28;
                boolean z11111 = z12;
                TextStyle textStyle118 = textStyleA;
                kotlin.d.a(dVar3, dVarG116, textStyle118, (l) objI3, iA, z11111, i3111114, 0, null, null, lVar5, (i3111113 & 58254) | (458752 & (i3111113 << 6)) | ((i3111113 << 3) & 3670016), 896);
                if (o.J()) {
                    o.R();
                }
                lVar6 = lVar4;
                textStyle2 = textStyle118;
                z15 = z11111;
                i29 = i3111114;
            } else {
                if (i32 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i16 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i18 != 0) {
                    z12 = true;
                }
                if (i21 != 0) {
                    iA = t4.t.INSTANCE.a();
                }
                if (i23 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i12;
                }
                if (i25 != 0) {
                    lVar4 = a.f15484c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                androidx.compose.ui.d.Companion companion118 = androidx.compose.ui.d.INSTANCE;
                int i3111115 = i15;
                if ((i15 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = lVarV.I();
                if (z13) {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                } else {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                }
                androidx.compose.ui.d dVarG117 = dVar4.g(o0.d(companion118, lVar2, (p) objI2));
                if ((i3111115 & 3670016) == 1048576) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                }
                lVar5 = lVarV;
                int i3111116 = i28;
                boolean z11112 = z12;
                TextStyle textStyle119 = textStyleA;
                kotlin.d.a(dVar3, dVarG117, textStyle119, (l) objI3, iA, z11112, i3111116, 0, null, null, lVar5, (i3111115 & 58254) | (458752 & (i3111115 << 6)) | ((i3111115 << 3) & 3670016), 896);
                if (o.J()) {
                    o.R();
                }
                lVar6 = lVar4;
                textStyle2 = textStyle119;
                z15 = z11112;
                i29 = i3111116;
            }
            dVar5 = dVar4;
            i31 = iA;
            w2VarX = lVar5.x();
            if (w2VarX != null) {
                w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
            }
        }
        i15 |= 3072;
        z12 = z11;
        i21 = i14 & 16;
        if (i21 != 0) {
            if ((i13 & 24576) == 0) {
                iA = i11;
                if (lVarV.r(iA)) {
                    i22 = 16384;
                } else {
                    i22 = PKIFailureInfo.certRevoked;
                }
                i15 |= i22;
            }
            i23 = i14 & 32;
            if (i23 != 0) {
                i15 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (lVarV.r(i12)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (lVarV.K(lVar)) {
                    i26 = PKIFailureInfo.badCertTemplate;
                } else {
                    i26 = PKIFailureInfo.signerNotTrusted;
                }
                i15 |= i26;
            }
            if ((i14 & 128) != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (lVarV.K(lVar2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i15 & 4793491) == 4793490) {
                if (i32 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i16 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i18 != 0) {
                    z12 = true;
                }
                if (i21 != 0) {
                    iA = t4.t.INSTANCE.a();
                }
                if (i23 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i12;
                }
                if (i25 != 0) {
                    lVar4 = a.f15484c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                androidx.compose.ui.d.Companion companion119 = androidx.compose.ui.d.INSTANCE;
                int i3111117 = i15;
                if ((i15 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = lVarV.I();
                if (z13) {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                } else {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                }
                androidx.compose.ui.d dVarG118 = dVar4.g(o0.d(companion119, lVar2, (p) objI2));
                if ((i3111117 & 3670016) == 1048576) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                }
                lVar5 = lVarV;
                int i3111118 = i28;
                boolean z11113 = z12;
                TextStyle textStyle1110 = textStyleA;
                kotlin.d.a(dVar3, dVarG118, textStyle1110, (l) objI3, iA, z11113, i3111118, 0, null, null, lVar5, (i3111117 & 58254) | (458752 & (i3111117 << 6)) | ((i3111117 << 3) & 3670016), 896);
                if (o.J()) {
                    o.R();
                }
                lVar6 = lVar4;
                textStyle2 = textStyle1110;
                z15 = z11113;
                i29 = i3111118;
            } else {
                if (i32 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i16 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i18 != 0) {
                    z12 = true;
                }
                if (i21 != 0) {
                    iA = t4.t.INSTANCE.a();
                }
                if (i23 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i12;
                }
                if (i25 != 0) {
                    lVar4 = a.f15484c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                androidx.compose.ui.d.Companion companion1110 = androidx.compose.ui.d.INSTANCE;
                int i3111119 = i15;
                if ((i15 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI2 = lVarV.I();
                if (z13) {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                } else {
                    objI2 = new d(p1Var, lVar2, null);
                    lVarV.B(objI2);
                }
                androidx.compose.ui.d dVarG119 = dVar4.g(o0.d(companion1110, lVar2, (p) objI2));
                if ((i3111119 & 3670016) == 1048576) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar4);
                    lVarV.B(objI3);
                }
                lVar5 = lVarV;
                int i31111110 = i28;
                boolean z11114 = z12;
                TextStyle textStyle1111 = textStyleA;
                kotlin.d.a(dVar3, dVarG119, textStyle1111, (l) objI3, iA, z11114, i31111110, 0, null, null, lVar5, (i3111119 & 58254) | (458752 & (i3111119 << 6)) | ((i3111119 << 3) & 3670016), 896);
                if (o.J()) {
                    o.R();
                }
                lVar6 = lVar4;
                textStyle2 = textStyle1111;
                z15 = z11114;
                i29 = i31111110;
            }
            dVar5 = dVar4;
            i31 = iA;
            w2VarX = lVar5.x();
            if (w2VarX != null) {
                w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
            }
        }
        i15 |= 24576;
        iA = i11;
        i23 = i14 & 32;
        if (i23 != 0) {
            i15 |= 196608;
        } else if ((i13 & 196608) == 0) {
            if (lVarV.r(i12)) {
                i24 = 131072;
            } else {
                i24 = 65536;
            }
            i15 |= i24;
        }
        i25 = i14 & 64;
        if (i25 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (lVarV.K(lVar)) {
                i26 = PKIFailureInfo.badCertTemplate;
            } else {
                i26 = PKIFailureInfo.signerNotTrusted;
            }
            i15 |= i26;
        }
        if ((i14 & 128) != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (lVarV.K(lVar2)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i15 |= i27;
        }
        if ((i15 & 4793491) == 4793490) {
            if (i32 != 0) {
                dVar4 = androidx.compose.ui.d.INSTANCE;
            }
            if (i16 != 0) {
                textStyleA = TextStyle.INSTANCE.a();
            }
            if (i18 != 0) {
                z12 = true;
            }
            if (i21 != 0) {
                iA = t4.t.INSTANCE.a();
            }
            if (i23 != 0) {
                i28 = Integer.MAX_VALUE;
            } else {
                i28 = i12;
            }
            if (i25 != 0) {
                lVar4 = a.f15484c;
            } else {
                lVar4 = lVar;
            }
            if (o.J()) {
                o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
            }
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = s3.d(null, null, 2, null);
                lVarV.B(objI);
            }
            p1Var = (p1) objI;
            androidx.compose.ui.d.Companion companion1111 = androidx.compose.ui.d.INSTANCE;
            int i31111111 = i15;
            if ((i15 & 29360128) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            objI2 = lVarV.I();
            if (z13) {
                objI2 = new d(p1Var, lVar2, null);
                lVarV.B(objI2);
            } else {
                objI2 = new d(p1Var, lVar2, null);
                lVarV.B(objI2);
            }
            androidx.compose.ui.d dVarG1110 = dVar4.g(o0.d(companion1111, lVar2, (p) objI2));
            if ((i31111111 & 3670016) == 1048576) {
            }
            objI3 = lVarV.I();
            if (z14) {
                objI3 = new b(p1Var, lVar4);
                lVarV.B(objI3);
            } else {
                objI3 = new b(p1Var, lVar4);
                lVarV.B(objI3);
            }
            lVar5 = lVarV;
            int i31111112 = i28;
            boolean z11115 = z12;
            TextStyle textStyle1112 = textStyleA;
            kotlin.d.a(dVar3, dVarG1110, textStyle1112, (l) objI3, iA, z11115, i31111112, 0, null, null, lVar5, (i31111111 & 58254) | (458752 & (i31111111 << 6)) | ((i31111111 << 3) & 3670016), 896);
            if (o.J()) {
                o.R();
            }
            lVar6 = lVar4;
            textStyle2 = textStyle1112;
            z15 = z11115;
            i29 = i31111112;
        } else {
            if (i32 != 0) {
                dVar4 = androidx.compose.ui.d.INSTANCE;
            }
            if (i16 != 0) {
                textStyleA = TextStyle.INSTANCE.a();
            }
            if (i18 != 0) {
                z12 = true;
            }
            if (i21 != 0) {
                iA = t4.t.INSTANCE.a();
            }
            if (i23 != 0) {
                i28 = Integer.MAX_VALUE;
            } else {
                i28 = i12;
            }
            if (i25 != 0) {
                lVar4 = a.f15484c;
            } else {
                lVar4 = lVar;
            }
            if (o.J()) {
                o.S(-246609449, i15, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
            }
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = s3.d(null, null, 2, null);
                lVarV.B(objI);
            }
            p1Var = (p1) objI;
            androidx.compose.ui.d.Companion companion1112 = androidx.compose.ui.d.INSTANCE;
            int i31111113 = i15;
            if ((i15 & 29360128) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            objI2 = lVarV.I();
            if (z13) {
                objI2 = new d(p1Var, lVar2, null);
                lVarV.B(objI2);
            } else {
                objI2 = new d(p1Var, lVar2, null);
                lVarV.B(objI2);
            }
            androidx.compose.ui.d dVarG1111 = dVar4.g(o0.d(companion1112, lVar2, (p) objI2));
            if ((i31111113 & 3670016) == 1048576) {
            }
            objI3 = lVarV.I();
            if (z14) {
                objI3 = new b(p1Var, lVar4);
                lVarV.B(objI3);
            } else {
                objI3 = new b(p1Var, lVar4);
                lVarV.B(objI3);
            }
            lVar5 = lVarV;
            int i31111114 = i28;
            boolean z11116 = z12;
            TextStyle textStyle1113 = textStyleA;
            kotlin.d.a(dVar3, dVarG1111, textStyle1113, (l) objI3, iA, z11116, i31111114, 0, null, null, lVar5, (i31111113 & 58254) | (458752 & (i31111113 << 6)) | ((i31111113 << 3) & 3670016), 896);
            if (o.J()) {
                o.R();
            }
            lVar6 = lVar4;
            textStyle2 = textStyle1113;
            z15 = z11116;
            i29 = i31111114;
        }
        dVar5 = dVar4;
        i31 = iA;
        w2VarX = lVar5.x();
        if (w2VarX != null) {
            w2VarX.a(new c(dVar, dVar5, textStyle2, z15, i31, i29, lVar6, lVar2, i13, i14));
        }
    }

    @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements l<TextLayoutResult, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15484c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return h0.f84049a;
        }

        public final void a(TextLayoutResult textLayoutResult) {
        }
    }
}
