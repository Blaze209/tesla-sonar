package z80;

import androidx.compose.ui.platform.x2;
import i4.TextLayoutResult;
import i4.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.s3;
import p020r2.w2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"", "text", "Landroidx/compose/ui/d;", "modifier", "Lk3/p1;", "color", "Li4/r0;", "style", "Ljn0/h0;", "a", "(Ljava/lang/String;Landroidx/compose/ui/d;JLi4/r0;Lr2/l;II)V", "", "Lz80/q1;", "b", "(Ljava/lang/String;)Ljava/util/List;", "Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "urlPattern", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f127497a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.ui.core.elements.HyperlinkedTextKt$HyperlinkedText$1", f = "HyperlinkedText.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<v3.f0, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f127498n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f127499o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p020r2.p1<TextLayoutResult> f127500p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ i4.d f127501q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ x2 f127502r;

        /* JADX INFO: renamed from: z80.h1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/g;", "offsetPosition", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        static final class C2771a extends p013kotlin.jvm.internal.u implements wn0.l<j3.g, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p020r2.p1<TextLayoutResult> f127503c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i4.d f127504d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ x2 f127505e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2771a(p020r2.p1<TextLayoutResult> p1Var, i4.d dVar, x2 x2Var) {
                super(1);
                this.f127503c = p1Var;
                this.f127504d = dVar;
                this.f127505e = x2Var;
            }

            public final void a(long j11) {
                TextLayoutResult value = this.f127503c.getValue();
                if (value != null) {
                    i4.d dVar = this.f127504d;
                    x2 x2Var = this.f127505e;
                    int iX = value.x(j11);
                    i4.d.Range range = (i4.d.Range) p013kotlin.collections.v.q0(dVar.i(iX, iX));
                    if (range == null || !p013kotlin.jvm.internal.s.f(range.getTag(), "URL")) {
                        return;
                    }
                    x2Var.a((String) range.e());
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(j3.g gVar) {
                a(gVar.getPackedValue());
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p020r2.p1<TextLayoutResult> p1Var, i4.d dVar, x2 x2Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f127500p = p1Var;
            this.f127501q = dVar;
            this.f127502r = x2Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f127500p, this.f127501q, this.f127502r, continuation);
            aVar.f127499o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f127498n;
            if (i11 == 0) {
                jn0.t.b(obj);
                v3.f0 f0Var = (v3.f0) this.f127499o;
                C2771a c2771a = new C2771a(this.f127500p, this.f127501q, this.f127502r);
                this.f127498n = 1;
                if (p021s1.a0.j(f0Var, null, null, null, c2771a, this, 7, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(v3.f0 f0Var, Continuation<? super jn0.h0> continuation) {
            return ((a) create(f0Var, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/m0;", "it", "Ljn0/h0;", "a", "(Li4/m0;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<TextLayoutResult, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p020r2.p1<TextLayoutResult> f127506c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p020r2.p1<TextLayoutResult> p1Var) {
            super(1);
            this.f127506c = p1Var;
        }

        public final void a(TextLayoutResult it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            this.f127506c.setValue(it);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f127507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f127508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f127509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextStyle f127510f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f127511g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f127512h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, androidx.compose.ui.d dVar, long j11, TextStyle textStyle, int i11, int i12) {
            super(2);
            this.f127507c = str;
            this.f127508d = dVar;
            this.f127509e = j11;
            this.f127510f = textStyle;
            this.f127511g = i11;
            this.f127512h = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            h1.a(this.f127507c, this.f127508d, this.f127509e, this.f127510f, lVar, p020r2.k2.a(this.f127511g | 1), this.f127512h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    static {
        Pattern patternCompile = Pattern.compile("(https?://[a-z0-9.-]+\\.[a-z]{2,3}(?:/\\S*?(?=\\.*(?:\\s|$)))?)", 42);
        p013kotlin.jvm.internal.s.j(patternCompile, "compile(...)");
        f127497a = patternCompile;
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x0103  */
    /* JADX WARN: Code duplicated, block: B:79:0x011b  */
    /* JADX WARN: Code duplicated, block: B:80:0x011d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:0x012a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0142 A[LOOP:0: B:86:0x013c->B:88:0x0142, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x0183  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d3  */
    public static final void a(String text, androidx.compose.ui.d dVar, long j11, TextStyle textStyle, p020r2.l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        long j12;
        int i15;
        TextStyle textStyle2;
        long j13;
        int i16;
        androidx.compose.ui.d dVar3;
        TextStyle textStyle3;
        Object objI;
        p020r2.l.Companion companion;
        p020r2.p1 p1Var;
        boolean z11;
        Object objI2;
        i4.d.a aVar;
        Object objI3;
        p020r2.l lVar2;
        androidx.compose.ui.d dVar4;
        long j14;
        TextStyle textStyle4;
        w2 w2VarX;
        p013kotlin.jvm.internal.s.k(text, "text");
        p020r2.l lVarV = lVar.v(1671475014);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(text) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i17 = i12 & 2;
        if (i17 == 0) {
            if ((i11 & 112) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 896) == 0) {
                    j12 = j11;
                    if (lVarV.s(j12)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i11 & 7168) == 0) {
                    if ((i12 & 8) == 0) {
                        textStyle2 = textStyle;
                        int i18 = lVarV.n(textStyle2) ? 2048 : 1024;
                        i13 |= i18;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i13 |= i18;
                } else {
                    textStyle2 = textStyle;
                }
                if ((i13 & 5851) == 1170 || !lVarV.b()) {
                    lVarV.L();
                    if ((i11 & 1) != 0 || lVarV.k()) {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            j13 = k3.p1.INSTANCE.j();
                        } else {
                            j13 = j12;
                        }
                        if ((i12 & 8) != 0) {
                            textStyle3 = (TextStyle) lVarV.U(v2.e());
                            i16 = i13 & (-7169);
                            dVar3 = dVar2;
                        } else {
                            i16 = i13;
                            dVar3 = dVar2;
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(1671475014, i16, -1, "com.stripe.android.ui.core.elements.HyperlinkedText (HyperlinkedText.kt:25)");
                        }
                        x2 x2Var = (x2) lVarV.U(androidx.compose.ui.platform.z0.t());
                        lVarV.H(-431032317);
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = s3.d(null, null, 2, null);
                            lVarV.B(objI);
                        }
                        p1Var = (p020r2.p1) objI;
                        lVarV.T();
                        lVarV.H(-431029084);
                        if ((i16 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI2 = lVarV.I();
                        if (z11 || objI2 == companion.a()) {
                            aVar = new i4.d.a(0, 1, null);
                            aVar.i(text);
                            for (LinkAnnotation linkAnnotation : b(text)) {
                                aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                            }
                            objI2 = aVar.o();
                            lVarV.B(objI2);
                        }
                        i4.d dVar5 = (i4.d) objI2;
                        lVarV.T();
                        androidx.compose.ui.d dVarD = v3.o0.d(dVar3, jn0.h0.f84049a, new a(p1Var, dVar5, x2Var, null));
                        lVarV.H(-430997090);
                        objI3 = lVarV.I();
                        if (objI3 == p020r2.l.INSTANCE.a()) {
                            objI3 = new b(p1Var);
                            lVarV.B(objI3);
                        }
                        lVarV.T();
                        lVar2 = lVarV;
                        v2.c(dVar5, dVarD, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (wn0.l) objI3, textStyle3, lVar2, i16 & 896, ((i16 << 12) & 29360128) | 1572864, 65528);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        dVar4 = dVar3;
                        j14 = j13;
                        textStyle4 = textStyle3;
                    } else {
                        lVarV.j();
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        i16 = i13;
                        dVar3 = dVar2;
                        j13 = j12;
                    }
                    textStyle3 = textStyle2;
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(1671475014, i16, -1, "com.stripe.android.ui.core.elements.HyperlinkedText (HyperlinkedText.kt:25)");
                    }
                    x2 x2Var2 = (x2) lVarV.U(androidx.compose.ui.platform.z0.t());
                    lVarV.H(-431032317);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p020r2.p1) objI;
                    lVarV.T();
                    lVarV.H(-431029084);
                    if ((i16 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI2 = lVarV.I();
                    if (z11) {
                        aVar = new i4.d.a(0, 1, null);
                        aVar.i(text);
                        while (r5.hasNext()) {
                            aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                        }
                        objI2 = aVar.o();
                        lVarV.B(objI2);
                    } else {
                        aVar = new i4.d.a(0, 1, null);
                        aVar.i(text);
                        while (r5.hasNext()) {
                            aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                        }
                        objI2 = aVar.o();
                        lVarV.B(objI2);
                    }
                    i4.d dVar6 = (i4.d) objI2;
                    lVarV.T();
                    androidx.compose.ui.d dVarD2 = v3.o0.d(dVar3, jn0.h0.f84049a, new a(p1Var, dVar6, x2Var2, null));
                    lVarV.H(-430997090);
                    objI3 = lVarV.I();
                    if (objI3 == p020r2.l.INSTANCE.a()) {
                        objI3 = new b(p1Var);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    lVar2 = lVarV;
                    v2.c(dVar6, dVarD2, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (wn0.l) objI3, textStyle3, lVar2, i16 & 896, ((i16 << 12) & 29360128) | 1572864, 65528);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    j14 = j13;
                    textStyle4 = textStyle3;
                } else {
                    lVarV.j();
                    lVar2 = lVarV;
                    dVar4 = dVar2;
                    j14 = j12;
                    textStyle4 = textStyle2;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(text, dVar4, j14, textStyle4, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            j12 = j11;
            if ((i11 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    textStyle2 = textStyle;
                    if (lVarV.n(textStyle2)) {
                    }
                    i13 |= i18;
                } else {
                    textStyle2 = textStyle;
                }
                i13 |= i18;
            } else {
                textStyle2 = textStyle;
            }
            if ((i13 & 5851) == 1170) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i12 & 8) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i16 = i13 & (-7169);
                        dVar3 = dVar2;
                    } else {
                        i16 = i13;
                        dVar3 = dVar2;
                        textStyle3 = textStyle2;
                    }
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i12 & 8) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i16 = i13 & (-7169);
                        dVar3 = dVar2;
                    } else {
                        i16 = i13;
                        dVar3 = dVar2;
                        textStyle3 = textStyle2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(1671475014, i16, -1, "com.stripe.android.ui.core.elements.HyperlinkedText (HyperlinkedText.kt:25)");
                }
                x2 x2Var3 = (x2) lVarV.U(androidx.compose.ui.platform.z0.t());
                lVarV.H(-431032317);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p020r2.p1) objI;
                lVarV.T();
                lVarV.H(-431029084);
                if ((i16 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI2 = lVarV.I();
                if (z11) {
                    aVar = new i4.d.a(0, 1, null);
                    aVar.i(text);
                    while (r5.hasNext()) {
                        aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                    }
                    objI2 = aVar.o();
                    lVarV.B(objI2);
                } else {
                    aVar = new i4.d.a(0, 1, null);
                    aVar.i(text);
                    while (r5.hasNext()) {
                        aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                    }
                    objI2 = aVar.o();
                    lVarV.B(objI2);
                }
                i4.d dVar7 = (i4.d) objI2;
                lVarV.T();
                androidx.compose.ui.d dVarD3 = v3.o0.d(dVar3, jn0.h0.f84049a, new a(p1Var, dVar7, x2Var3, null));
                lVarV.H(-430997090);
                objI3 = lVarV.I();
                if (objI3 == p020r2.l.INSTANCE.a()) {
                    objI3 = new b(p1Var);
                    lVarV.B(objI3);
                }
                lVarV.T();
                lVar2 = lVarV;
                v2.c(dVar7, dVarD3, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (wn0.l) objI3, textStyle3, lVar2, i16 & 896, ((i16 << 12) & 29360128) | 1572864, 65528);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                j14 = j13;
                textStyle4 = textStyle3;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i12 & 8) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i16 = i13 & (-7169);
                        dVar3 = dVar2;
                    } else {
                        i16 = i13;
                        dVar3 = dVar2;
                        textStyle3 = textStyle2;
                    }
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i12 & 8) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i16 = i13 & (-7169);
                        dVar3 = dVar2;
                    } else {
                        i16 = i13;
                        dVar3 = dVar2;
                        textStyle3 = textStyle2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(1671475014, i16, -1, "com.stripe.android.ui.core.elements.HyperlinkedText (HyperlinkedText.kt:25)");
                }
                x2 x2Var4 = (x2) lVarV.U(androidx.compose.ui.platform.z0.t());
                lVarV.H(-431032317);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p020r2.p1) objI;
                lVarV.T();
                lVarV.H(-431029084);
                if ((i16 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI2 = lVarV.I();
                if (z11) {
                    aVar = new i4.d.a(0, 1, null);
                    aVar.i(text);
                    while (r5.hasNext()) {
                        aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                    }
                    objI2 = aVar.o();
                    lVarV.B(objI2);
                } else {
                    aVar = new i4.d.a(0, 1, null);
                    aVar.i(text);
                    while (r5.hasNext()) {
                        aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                    }
                    objI2 = aVar.o();
                    lVarV.B(objI2);
                }
                i4.d dVar8 = (i4.d) objI2;
                lVarV.T();
                androidx.compose.ui.d dVarD4 = v3.o0.d(dVar3, jn0.h0.f84049a, new a(p1Var, dVar8, x2Var4, null));
                lVarV.H(-430997090);
                objI3 = lVarV.I();
                if (objI3 == p020r2.l.INSTANCE.a()) {
                    objI3 = new b(p1Var);
                    lVarV.B(objI3);
                }
                lVarV.T();
                lVar2 = lVarV;
                v2.c(dVar8, dVarD4, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (wn0.l) objI3, textStyle3, lVar2, i16 & 896, ((i16 << 12) & 29360128) | 1572864, 65528);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                j14 = j13;
                textStyle4 = textStyle3;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new c(text, dVar4, j14, textStyle4, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 896) == 0) {
                j12 = j11;
                if (lVarV.s(j12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i11 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    textStyle2 = textStyle;
                    if (lVarV.n(textStyle2)) {
                    }
                    i13 |= i18;
                } else {
                    textStyle2 = textStyle;
                }
                i13 |= i18;
            } else {
                textStyle2 = textStyle;
            }
            if ((i13 & 5851) == 1170) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i12 & 8) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i16 = i13 & (-7169);
                        dVar3 = dVar2;
                    } else {
                        i16 = i13;
                        dVar3 = dVar2;
                        textStyle3 = textStyle2;
                    }
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i12 & 8) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i16 = i13 & (-7169);
                        dVar3 = dVar2;
                    } else {
                        i16 = i13;
                        dVar3 = dVar2;
                        textStyle3 = textStyle2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(1671475014, i16, -1, "com.stripe.android.ui.core.elements.HyperlinkedText (HyperlinkedText.kt:25)");
                }
                x2 x2Var5 = (x2) lVarV.U(androidx.compose.ui.platform.z0.t());
                lVarV.H(-431032317);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p020r2.p1) objI;
                lVarV.T();
                lVarV.H(-431029084);
                if ((i16 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI2 = lVarV.I();
                if (z11) {
                    aVar = new i4.d.a(0, 1, null);
                    aVar.i(text);
                    while (r5.hasNext()) {
                        aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                    }
                    objI2 = aVar.o();
                    lVarV.B(objI2);
                } else {
                    aVar = new i4.d.a(0, 1, null);
                    aVar.i(text);
                    while (r5.hasNext()) {
                        aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                    }
                    objI2 = aVar.o();
                    lVarV.B(objI2);
                }
                i4.d dVar9 = (i4.d) objI2;
                lVarV.T();
                androidx.compose.ui.d dVarD5 = v3.o0.d(dVar3, jn0.h0.f84049a, new a(p1Var, dVar9, x2Var5, null));
                lVarV.H(-430997090);
                objI3 = lVarV.I();
                if (objI3 == p020r2.l.INSTANCE.a()) {
                    objI3 = new b(p1Var);
                    lVarV.B(objI3);
                }
                lVarV.T();
                lVar2 = lVarV;
                v2.c(dVar9, dVarD5, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (wn0.l) objI3, textStyle3, lVar2, i16 & 896, ((i16 << 12) & 29360128) | 1572864, 65528);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                j14 = j13;
                textStyle4 = textStyle3;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i12 & 8) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i16 = i13 & (-7169);
                        dVar3 = dVar2;
                    } else {
                        i16 = i13;
                        dVar3 = dVar2;
                        textStyle3 = textStyle2;
                    }
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i12 & 8) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i16 = i13 & (-7169);
                        dVar3 = dVar2;
                    } else {
                        i16 = i13;
                        dVar3 = dVar2;
                        textStyle3 = textStyle2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(1671475014, i16, -1, "com.stripe.android.ui.core.elements.HyperlinkedText (HyperlinkedText.kt:25)");
                }
                x2 x2Var6 = (x2) lVarV.U(androidx.compose.ui.platform.z0.t());
                lVarV.H(-431032317);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p020r2.p1) objI;
                lVarV.T();
                lVarV.H(-431029084);
                if ((i16 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI2 = lVarV.I();
                if (z11) {
                    aVar = new i4.d.a(0, 1, null);
                    aVar.i(text);
                    while (r5.hasNext()) {
                        aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                    }
                    objI2 = aVar.o();
                    lVarV.B(objI2);
                } else {
                    aVar = new i4.d.a(0, 1, null);
                    aVar.i(text);
                    while (r5.hasNext()) {
                        aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                    }
                    objI2 = aVar.o();
                    lVarV.B(objI2);
                }
                i4.d dVar10 = (i4.d) objI2;
                lVarV.T();
                androidx.compose.ui.d dVarD6 = v3.o0.d(dVar3, jn0.h0.f84049a, new a(p1Var, dVar10, x2Var6, null));
                lVarV.H(-430997090);
                objI3 = lVarV.I();
                if (objI3 == p020r2.l.INSTANCE.a()) {
                    objI3 = new b(p1Var);
                    lVarV.B(objI3);
                }
                lVarV.T();
                lVar2 = lVarV;
                v2.c(dVar10, dVarD6, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (wn0.l) objI3, textStyle3, lVar2, i16 & 896, ((i16 << 12) & 29360128) | 1572864, 65528);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                j14 = j13;
                textStyle4 = textStyle3;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new c(text, dVar4, j14, textStyle4, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        j12 = j11;
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                textStyle2 = textStyle;
                if (lVarV.n(textStyle2)) {
                }
                i13 |= i18;
            } else {
                textStyle2 = textStyle;
            }
            i13 |= i18;
        } else {
            textStyle2 = textStyle;
        }
        if ((i13 & 5851) == 1170) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i17 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    j13 = k3.p1.INSTANCE.j();
                } else {
                    j13 = j12;
                }
                if ((i12 & 8) != 0) {
                    textStyle3 = (TextStyle) lVarV.U(v2.e());
                    i16 = i13 & (-7169);
                    dVar3 = dVar2;
                } else {
                    i16 = i13;
                    dVar3 = dVar2;
                    textStyle3 = textStyle2;
                }
            } else {
                if (i17 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    j13 = k3.p1.INSTANCE.j();
                } else {
                    j13 = j12;
                }
                if ((i12 & 8) != 0) {
                    textStyle3 = (TextStyle) lVarV.U(v2.e());
                    i16 = i13 & (-7169);
                    dVar3 = dVar2;
                } else {
                    i16 = i13;
                    dVar3 = dVar2;
                    textStyle3 = textStyle2;
                }
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(1671475014, i16, -1, "com.stripe.android.ui.core.elements.HyperlinkedText (HyperlinkedText.kt:25)");
            }
            x2 x2Var7 = (x2) lVarV.U(androidx.compose.ui.platform.z0.t());
            lVarV.H(-431032317);
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = s3.d(null, null, 2, null);
                lVarV.B(objI);
            }
            p1Var = (p020r2.p1) objI;
            lVarV.T();
            lVarV.H(-431029084);
            if ((i16 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI2 = lVarV.I();
            if (z11) {
                aVar = new i4.d.a(0, 1, null);
                aVar.i(text);
                while (r5.hasNext()) {
                    aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                }
                objI2 = aVar.o();
                lVarV.B(objI2);
            } else {
                aVar = new i4.d.a(0, 1, null);
                aVar.i(text);
                while (r5.hasNext()) {
                    aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                }
                objI2 = aVar.o();
                lVarV.B(objI2);
            }
            i4.d dVar11 = (i4.d) objI2;
            lVarV.T();
            androidx.compose.ui.d dVarD7 = v3.o0.d(dVar3, jn0.h0.f84049a, new a(p1Var, dVar11, x2Var7, null));
            lVarV.H(-430997090);
            objI3 = lVarV.I();
            if (objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new b(p1Var);
                lVarV.B(objI3);
            }
            lVarV.T();
            lVar2 = lVarV;
            v2.c(dVar11, dVarD7, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (wn0.l) objI3, textStyle3, lVar2, i16 & 896, ((i16 << 12) & 29360128) | 1572864, 65528);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
            j14 = j13;
            textStyle4 = textStyle3;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i17 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    j13 = k3.p1.INSTANCE.j();
                } else {
                    j13 = j12;
                }
                if ((i12 & 8) != 0) {
                    textStyle3 = (TextStyle) lVarV.U(v2.e());
                    i16 = i13 & (-7169);
                    dVar3 = dVar2;
                } else {
                    i16 = i13;
                    dVar3 = dVar2;
                    textStyle3 = textStyle2;
                }
            } else {
                if (i17 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    j13 = k3.p1.INSTANCE.j();
                } else {
                    j13 = j12;
                }
                if ((i12 & 8) != 0) {
                    textStyle3 = (TextStyle) lVarV.U(v2.e());
                    i16 = i13 & (-7169);
                    dVar3 = dVar2;
                } else {
                    i16 = i13;
                    dVar3 = dVar2;
                    textStyle3 = textStyle2;
                }
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(1671475014, i16, -1, "com.stripe.android.ui.core.elements.HyperlinkedText (HyperlinkedText.kt:25)");
            }
            x2 x2Var8 = (x2) lVarV.U(androidx.compose.ui.platform.z0.t());
            lVarV.H(-431032317);
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = s3.d(null, null, 2, null);
                lVarV.B(objI);
            }
            p1Var = (p020r2.p1) objI;
            lVarV.T();
            lVarV.H(-431029084);
            if ((i16 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI2 = lVarV.I();
            if (z11) {
                aVar = new i4.d.a(0, 1, null);
                aVar.i(text);
                while (r5.hasNext()) {
                    aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                }
                objI2 = aVar.o();
                lVarV.B(objI2);
            } else {
                aVar = new i4.d.a(0, 1, null);
                aVar.i(text);
                while (r5.hasNext()) {
                    aVar.a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                }
                objI2 = aVar.o();
                lVarV.B(objI2);
            }
            i4.d dVar12 = (i4.d) objI2;
            lVarV.T();
            androidx.compose.ui.d dVarD8 = v3.o0.d(dVar3, jn0.h0.f84049a, new a(p1Var, dVar12, x2Var8, null));
            lVarV.H(-430997090);
            objI3 = lVarV.I();
            if (objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new b(p1Var);
                lVarV.B(objI3);
            }
            lVarV.T();
            lVar2 = lVarV;
            v2.c(dVar12, dVarD8, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (wn0.l) objI3, textStyle3, lVar2, i16 & 896, ((i16 << 12) & 29360128) | 1572864, 65528);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
            j14 = j13;
            textStyle4 = textStyle3;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new c(text, dVar4, j14, textStyle4, i11, i12));
        }
    }

    private static final List<LinkAnnotation> b(String str) {
        Matcher matcher = f127497a.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            int iStart = matcher.start(1);
            int iEnd = matcher.end();
            String strSubstring = str.substring(iStart, iEnd);
            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            if (!p013kotlin.text.t.b0(strSubstring, "http://", false, 2, null) && !p013kotlin.text.t.b0(strSubstring, "https://", false, 2, null)) {
                strSubstring = "https://" + strSubstring;
            }
            arrayList.add(new LinkAnnotation(strSubstring, iStart, iEnd));
        }
        return arrayList;
    }
}
