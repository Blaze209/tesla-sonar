package p023w50;

import android.text.Annotation;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import i4.SpanStyle;
import i4.TextLayoutResult;
import i4.TextStyle;
import java.util.Iterator;
import java.util.Map;
import jn0.h0;
import jn0.t;
import jn0.x;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p021s1.a0;
import t4.k;
import v3.f0;
import v3.o0;
import v50.g;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aj\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a.\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a/\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002H\u0003¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%²\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\u00038\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002"}, d2 = {"Lv50/g;", "text", "Lkotlin/Function1;", "", "Ljn0/h0;", "onClickableTextClick", "Li4/r0;", "defaultStyle", "Landroidx/compose/ui/d;", "modifier", "", "Lw50/k;", "Li4/d0;", "annotationStyles", "", "maxLines", "Lt4/t;", "overflow", "a", "(Lv50/g;Lwn0/l;Li4/r0;Landroidx/compose/ui/d;Ljava/util/Map;IILr2/l;II)V", "Li4/m0;", "Lj3/g;", "offset", "Li4/d;", "resource", "Li4/d$c;", "l", "(Li4/m0;JLi4/d;)Li4/d$c;", "", "Landroid/text/Annotation;", "m", "(Ljava/lang/Object;)Landroid/text/Annotation;", "spanStyleForAnnotation", "k", "(Lv50/g;Lwn0/l;Lr2/l;II)Li4/d;", "pressedAnnotation", "layoutResult", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/m0;", "it", "Ljn0/h0;", "a", "(Li4/m0;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<TextLayoutResult, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<TextLayoutResult> f120980c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p1<TextLayoutResult> p1Var) {
            super(1);
            this.f120980c = p1Var;
        }

        public final void a(TextLayoutResult it) {
            s.k(it, "it");
            n.e(this.f120980c, it);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f120981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<String, h0> f120982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f120983e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f120984f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map<k, SpanStyle> f120985g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f120986h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f120987i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f120988j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f120989k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(g gVar, l<? super String, h0> lVar, TextStyle textStyle, androidx.compose.ui.d dVar, Map<k, SpanStyle> map, int i11, int i12, int i13, int i14) {
            super(2);
            this.f120981c = gVar;
            this.f120982d = lVar;
            this.f120983e = textStyle;
            this.f120984f = dVar;
            this.f120985g = map;
            this.f120986h = i11;
            this.f120987i = i12;
            this.f120988j = i13;
            this.f120989k = i14;
        }

        public final void a(p020r2.l lVar, int i11) {
            n.a(this.f120981c, this.f120982d, this.f120983e, this.f120984f, this.f120985g, this.f120986h, this.f120987i, lVar, k2.a(this.f120988j | 1), this.f120989k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.ui.components.TextKt$AnnotatedText$pressIndicator$1$1", f = "Text.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<f0, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120990n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f120991o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ i4.d f120992p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p1<TextLayoutResult> f120993q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p1<String> f120994r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ l<String, h0> f120995s;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls1/q;", "Lj3/g;", "offset", "Ljn0/h0;", "<anonymous>", "(Ls1/q;Lj3/g;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.ui.components.TextKt$AnnotatedText$pressIndicator$1$1$1", f = "Text.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements q<p021s1.q, j3.g, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f120996n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f120997o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ long f120998p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ i4.d f120999q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ p1<TextLayoutResult> f121000r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p1<String> f121001s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i4.d dVar, p1<TextLayoutResult> p1Var, p1<String> p1Var2, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f120999q = dVar;
                this.f121000r = p1Var;
                this.f121001s = p1Var2;
            }

            public final Object a(p021s1.q qVar, long j11, Continuation<? super h0> continuation) {
                a aVar = new a(this.f120999q, this.f121000r, this.f121001s, continuation);
                aVar.f120997o = qVar;
                aVar.f120998p = j11;
                return aVar.invokeSuspend(h0.f84049a);
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ Object invoke(p021s1.q qVar, j3.g gVar, Continuation<? super h0> continuation) {
                return a(qVar, gVar.getPackedValue(), continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f120996n;
                if (i11 == 0) {
                    t.b(obj);
                    p021s1.q qVar = (p021s1.q) this.f120997o;
                    long j11 = this.f120998p;
                    TextLayoutResult textLayoutResultD = n.d(this.f121000r);
                    i4.d.Range rangeL = textLayoutResultD != null ? n.l(textLayoutResultD, j11, this.f120999q) : null;
                    n.c(this.f121001s, rangeL != null ? (String) rangeL.e() : null);
                    this.f120996n = 1;
                    if (qVar.l1(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                n.c(this.f121001s, null);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/g;", "offset", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements l<j3.g, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i4.d f121002c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p1<TextLayoutResult> f121003d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ l<String, h0> f121004e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(i4.d dVar, p1<TextLayoutResult> p1Var, l<? super String, h0> lVar) {
                super(1);
                this.f121002c = dVar;
                this.f121003d = p1Var;
                this.f121004e = lVar;
            }

            public final void a(long j11) {
                i4.d.Range rangeL;
                TextLayoutResult textLayoutResultD = n.d(this.f121003d);
                if (textLayoutResultD == null || (rangeL = n.l(textLayoutResultD, j11, this.f121002c)) == null) {
                    return;
                }
                this.f121004e.invoke((String) rangeL.e());
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(j3.g gVar) {
                a(gVar.getPackedValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i4.d dVar, p1<TextLayoutResult> p1Var, p1<String> p1Var2, l<? super String, h0> lVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f120992p = dVar;
            this.f120993q = p1Var;
            this.f120994r = p1Var2;
            this.f120995s = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f120992p, this.f120993q, this.f120994r, this.f120995s, continuation);
            cVar.f120991o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f120990n;
            if (i11 == 0) {
                t.b(obj);
                f0 f0Var = (f0) this.f120991o;
                a aVar = new a(this.f120992p, this.f120993q, this.f120994r, null);
                b bVar = new b(this.f120992p, this.f120993q, this.f120995s);
                this.f120990n = 1;
                if (a0.j(f0Var, null, null, aVar, bVar, this, 3, null) == coroutine_suspended) {
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
            return ((c) create(f0Var, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/text/Annotation;", "annotation", "Li4/d0;", "a", "(Landroid/text/Annotation;)Li4/d0;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements l<Annotation, SpanStyle> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<k, SpanStyle> f121005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f121006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p1<String> f121007e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Map<k, SpanStyle> map, long j11, p1<String> p1Var) {
            super(1);
            this.f121005c = map;
            this.f121006d = j11;
            this.f121007e = p1Var;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpanStyle invoke(Annotation annotation) {
            k next;
            s.k(annotation, "annotation");
            Iterator<k> it = k.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.f(next.getValue(), annotation.getKey()));
            SpanStyle spanStyle = this.f121005c.get(next);
            if (!s.f(n.b(this.f121007e), annotation.getValue())) {
                return spanStyle;
            }
            if (spanStyle != null) {
                return SpanStyle.b(spanStyle, this.f121006d, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null);
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends u implements l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f121008c = new e();

        e() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Annotation it) {
            s.k(it, "it");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0187  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01da  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:117:0x020f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0249  */
    /* JADX WARN: Code duplicated, block: B:124:0x0257  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:88:0x0142  */
    /* JADX WARN: Code duplicated, block: B:90:0x0146  */
    /* JADX WARN: Code duplicated, block: B:92:0x014c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0157  */
    /* JADX WARN: Code duplicated, block: B:97:0x0163  */
    public static final void a(g text, l<? super String, h0> lVar, TextStyle defaultStyle, androidx.compose.ui.d dVar, Map<k, SpanStyle> map, int i11, int i12, p020r2.l lVar2, int i13, int i14) {
        int i15;
        androidx.compose.ui.d dVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        Map<k, SpanStyle> mapF;
        int iA;
        androidx.compose.ui.d dVar3;
        Map<k, SpanStyle> map2;
        Object objI;
        p020r2.l.Companion companion;
        p1 p1Var;
        i4.d dVarK;
        Object objI2;
        p1 p1Var2;
        boolean z11;
        boolean z12;
        i4.d dVar4;
        Object cVar;
        Object objI3;
        Map<k, SpanStyle> map3;
        int i24;
        int i25;
        androidx.compose.ui.d dVar5;
        w2 w2VarX;
        l<? super String, h0> onClickableTextClick = lVar;
        s.k(text, "text");
        s.k(onClickableTextClick, "onClickableTextClick");
        s.k(defaultStyle, "defaultStyle");
        p020r2.l lVarV = lVar2.v(-1670114880);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (lVarV.n(text) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 112) == 0) {
            i15 |= lVarV.K(onClickableTextClick) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= KyberEngine.KyberPolyBytes;
        } else if ((i13 & 896) == 0) {
            i15 |= lVarV.n(defaultStyle) ? 256 : 128;
        }
        int i26 = i14 & 8;
        if (i26 == 0) {
            if ((i13 & 7168) == 0) {
                dVar2 = dVar;
                i15 |= lVarV.n(dVar2) ? 2048 : 1024;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                i15 |= PKIFailureInfo.certRevoked;
            }
            i17 = i14 & 32;
            if (i17 != 0) {
                if ((458752 & i13) == 0) {
                    i18 = i11;
                    if (lVarV.r(i18)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i15 |= i19;
                }
                i21 = i14 & 64;
                if (i21 != 0) {
                    i15 |= 1572864;
                    i22 = i12;
                } else {
                    i22 = i12;
                    if ((i13 & 3670016) == 0) {
                        if (lVarV.r(i22)) {
                            i23 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i23 = PKIFailureInfo.signerNotTrusted;
                        }
                        i15 |= i23;
                    }
                }
                if (i16 != 16 && (2995931 & i15) == 599186 && lVarV.b()) {
                    lVarV.j();
                    map3 = map;
                    onClickableTextClick = onClickableTextClick;
                    i24 = i22;
                    dVar5 = dVar2;
                    i25 = i18;
                } else {
                    lVarV.L();
                    if ((i13 & 1) != 0 || lVarV.k()) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i16 != 0) {
                            mapF = v0.f(x.a(k.CLICKABLE, SpanStyle.b(defaultStyle.O(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null)));
                            i15 &= -57345;
                        } else {
                            mapF = map;
                        }
                        if (i17 != 0) {
                            i18 = Integer.MAX_VALUE;
                        }
                        if (i21 != 0) {
                            iA = t4.t.INSTANCE.a();
                        } else {
                            iA = i22;
                        }
                        dVar3 = dVar2;
                        map2 = mapF;
                    } else {
                        lVarV.j();
                        if (i16 != 0) {
                            i15 &= -57345;
                        }
                        i15 = i15;
                        iA = i22;
                        dVar3 = dVar2;
                        map2 = map;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1670114880, i15, -1, "com.stripe.android.financialconnections.ui.components.AnnotatedText (Text.kt:40)");
                    }
                    long textDefault = p026y50.d.f125064a.a(lVarV, 6).getTextDefault();
                    lVarV.H(1381268281);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    lVarV.T();
                    dVarK = k(text, new d(map2, textDefault, p1Var), lVarV, i15 & 14, 0);
                    lVarV.H(1381285932);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(null, null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var2 = (p1) objI2;
                    lVarV.T();
                    androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
                    lVarV.H(1381290420);
                    boolean zN = lVarV.n(dVarK);
                    if ((i15 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | zN;
                    Object objI4 = lVarV.I();
                    if (!z12 || objI4 == companion.a()) {
                        dVar4 = dVarK;
                        cVar = new c(dVar4, p1Var2, p1Var, onClickableTextClick, null);
                        lVarV.B(cVar);
                    } else {
                        dVar4 = dVarK;
                        cVar = objI4;
                    }
                    lVarV.T();
                    androidx.compose.ui.d dVarG = dVar3.g(o0.d(companion2, onClickableTextClick, (p) cVar));
                    lVarV.H(1381317441);
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new a(p1Var2);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    Map<k, SpanStyle> map4 = map2;
                    int i27 = iA;
                    androidx.compose.ui.d dVar6 = dVar3;
                    int i28 = i18;
                    kotlin.d.a(dVar4, dVarG, defaultStyle, (l) objI3, i27, true, i28, 0, null, null, lVarV, 199680 | (i15 & 896) | ((i15 >> 6) & 57344) | ((i15 << 3) & 3670016), 896);
                    if (o.J()) {
                        o.R();
                    }
                    map3 = map4;
                    i24 = i27;
                    i25 = i28;
                    dVar5 = dVar6;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(text, onClickableTextClick, defaultStyle, dVar5, map3, i25, i24, i13, i14));
                }
            }
            i15 |= 196608;
            i18 = i11;
            i21 = i14 & 64;
            if (i21 != 0) {
                i15 |= 1572864;
                i22 = i12;
            } else {
                i22 = i12;
                if ((i13 & 3670016) == 0) {
                    if (lVarV.r(i22)) {
                        i23 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i23 = PKIFailureInfo.signerNotTrusted;
                    }
                    i15 |= i23;
                }
            }
            if (i16 != 16) {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        mapF = v0.f(x.a(k.CLICKABLE, SpanStyle.b(defaultStyle.O(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null)));
                        i15 &= -57345;
                    } else {
                        mapF = map;
                    }
                    if (i17 != 0) {
                        i18 = Integer.MAX_VALUE;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i22;
                    }
                    dVar3 = dVar2;
                    map2 = mapF;
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        mapF = v0.f(x.a(k.CLICKABLE, SpanStyle.b(defaultStyle.O(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null)));
                        i15 &= -57345;
                    } else {
                        mapF = map;
                    }
                    if (i17 != 0) {
                        i18 = Integer.MAX_VALUE;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i22;
                    }
                    dVar3 = dVar2;
                    map2 = mapF;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1670114880, i15, -1, "com.stripe.android.financialconnections.ui.components.AnnotatedText (Text.kt:40)");
                }
                long textDefault2 = p026y50.d.f125064a.a(lVarV, 6).getTextDefault();
                lVarV.H(1381268281);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                dVarK = k(text, new d(map2, textDefault2, p1Var), lVarV, i15 & 14, 0);
                lVarV.H(1381285932);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = s3.d(null, null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var2 = (p1) objI2;
                lVarV.T();
                androidx.compose.ui.d.Companion companion3 = androidx.compose.ui.d.INSTANCE;
                lVarV.H(1381290420);
                boolean zN2 = lVarV.n(dVarK);
                if ((i15 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | zN2;
                Object objI5 = lVarV.I();
                if (z12) {
                    dVar4 = dVarK;
                    cVar = new c(dVar4, p1Var2, p1Var, onClickableTextClick, null);
                    lVarV.B(cVar);
                } else {
                    dVar4 = dVarK;
                    cVar = new c(dVar4, p1Var2, p1Var, onClickableTextClick, null);
                    lVarV.B(cVar);
                }
                lVarV.T();
                androidx.compose.ui.d dVarG2 = dVar3.g(o0.d(companion3, onClickableTextClick, (p) cVar));
                lVarV.H(1381317441);
                objI3 = lVarV.I();
                if (objI3 == companion.a()) {
                    objI3 = new a(p1Var2);
                    lVarV.B(objI3);
                }
                lVarV.T();
                Map<k, SpanStyle> map5 = map2;
                int i29 = iA;
                androidx.compose.ui.d dVar7 = dVar3;
                int i210 = i18;
                kotlin.d.a(dVar4, dVarG2, defaultStyle, (l) objI3, i29, true, i210, 0, null, null, lVarV, 199680 | (i15 & 896) | ((i15 >> 6) & 57344) | ((i15 << 3) & 3670016), 896);
                if (o.J()) {
                    o.R();
                }
                map3 = map5;
                i24 = i29;
                i25 = i210;
                dVar5 = dVar7;
            } else {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        mapF = v0.f(x.a(k.CLICKABLE, SpanStyle.b(defaultStyle.O(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null)));
                        i15 &= -57345;
                    } else {
                        mapF = map;
                    }
                    if (i17 != 0) {
                        i18 = Integer.MAX_VALUE;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i22;
                    }
                    dVar3 = dVar2;
                    map2 = mapF;
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        mapF = v0.f(x.a(k.CLICKABLE, SpanStyle.b(defaultStyle.O(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null)));
                        i15 &= -57345;
                    } else {
                        mapF = map;
                    }
                    if (i17 != 0) {
                        i18 = Integer.MAX_VALUE;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i22;
                    }
                    dVar3 = dVar2;
                    map2 = mapF;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1670114880, i15, -1, "com.stripe.android.financialconnections.ui.components.AnnotatedText (Text.kt:40)");
                }
                long textDefault3 = p026y50.d.f125064a.a(lVarV, 6).getTextDefault();
                lVarV.H(1381268281);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                dVarK = k(text, new d(map2, textDefault3, p1Var), lVarV, i15 & 14, 0);
                lVarV.H(1381285932);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = s3.d(null, null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var2 = (p1) objI2;
                lVarV.T();
                androidx.compose.ui.d.Companion companion4 = androidx.compose.ui.d.INSTANCE;
                lVarV.H(1381290420);
                boolean zN3 = lVarV.n(dVarK);
                if ((i15 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | zN3;
                Object objI6 = lVarV.I();
                if (z12) {
                    dVar4 = dVarK;
                    cVar = new c(dVar4, p1Var2, p1Var, onClickableTextClick, null);
                    lVarV.B(cVar);
                } else {
                    dVar4 = dVarK;
                    cVar = new c(dVar4, p1Var2, p1Var, onClickableTextClick, null);
                    lVarV.B(cVar);
                }
                lVarV.T();
                androidx.compose.ui.d dVarG3 = dVar3.g(o0.d(companion4, onClickableTextClick, (p) cVar));
                lVarV.H(1381317441);
                objI3 = lVarV.I();
                if (objI3 == companion.a()) {
                    objI3 = new a(p1Var2);
                    lVarV.B(objI3);
                }
                lVarV.T();
                Map<k, SpanStyle> map6 = map2;
                int i211 = iA;
                androidx.compose.ui.d dVar8 = dVar3;
                int i212 = i18;
                kotlin.d.a(dVar4, dVarG3, defaultStyle, (l) objI3, i211, true, i212, 0, null, null, lVarV, 199680 | (i15 & 896) | ((i15 >> 6) & 57344) | ((i15 << 3) & 3670016), 896);
                if (o.J()) {
                    o.R();
                }
                map3 = map6;
                i24 = i211;
                i25 = i212;
                dVar5 = dVar8;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(text, onClickableTextClick, defaultStyle, dVar5, map3, i25, i24, i13, i14));
            }
        }
        i15 |= 3072;
        dVar2 = dVar;
        i16 = i14 & 16;
        if (i16 != 0) {
            i15 |= PKIFailureInfo.certRevoked;
        }
        i17 = i14 & 32;
        if (i17 != 0) {
            if ((458752 & i13) == 0) {
                i18 = i11;
                if (lVarV.r(i18)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i15 |= i19;
            }
            i21 = i14 & 64;
            if (i21 != 0) {
                i15 |= 1572864;
                i22 = i12;
            } else {
                i22 = i12;
                if ((i13 & 3670016) == 0) {
                    if (lVarV.r(i22)) {
                        i23 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i23 = PKIFailureInfo.signerNotTrusted;
                    }
                    i15 |= i23;
                }
            }
            if (i16 != 16) {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        mapF = v0.f(x.a(k.CLICKABLE, SpanStyle.b(defaultStyle.O(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null)));
                        i15 &= -57345;
                    } else {
                        mapF = map;
                    }
                    if (i17 != 0) {
                        i18 = Integer.MAX_VALUE;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i22;
                    }
                    dVar3 = dVar2;
                    map2 = mapF;
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        mapF = v0.f(x.a(k.CLICKABLE, SpanStyle.b(defaultStyle.O(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null)));
                        i15 &= -57345;
                    } else {
                        mapF = map;
                    }
                    if (i17 != 0) {
                        i18 = Integer.MAX_VALUE;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i22;
                    }
                    dVar3 = dVar2;
                    map2 = mapF;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1670114880, i15, -1, "com.stripe.android.financialconnections.ui.components.AnnotatedText (Text.kt:40)");
                }
                long textDefault4 = p026y50.d.f125064a.a(lVarV, 6).getTextDefault();
                lVarV.H(1381268281);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                dVarK = k(text, new d(map2, textDefault4, p1Var), lVarV, i15 & 14, 0);
                lVarV.H(1381285932);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = s3.d(null, null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var2 = (p1) objI2;
                lVarV.T();
                androidx.compose.ui.d.Companion companion5 = androidx.compose.ui.d.INSTANCE;
                lVarV.H(1381290420);
                boolean zN4 = lVarV.n(dVarK);
                if ((i15 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | zN4;
                Object objI7 = lVarV.I();
                if (z12) {
                    dVar4 = dVarK;
                    cVar = new c(dVar4, p1Var2, p1Var, onClickableTextClick, null);
                    lVarV.B(cVar);
                } else {
                    dVar4 = dVarK;
                    cVar = new c(dVar4, p1Var2, p1Var, onClickableTextClick, null);
                    lVarV.B(cVar);
                }
                lVarV.T();
                androidx.compose.ui.d dVarG4 = dVar3.g(o0.d(companion5, onClickableTextClick, (p) cVar));
                lVarV.H(1381317441);
                objI3 = lVarV.I();
                if (objI3 == companion.a()) {
                    objI3 = new a(p1Var2);
                    lVarV.B(objI3);
                }
                lVarV.T();
                Map<k, SpanStyle> map7 = map2;
                int i213 = iA;
                androidx.compose.ui.d dVar9 = dVar3;
                int i214 = i18;
                kotlin.d.a(dVar4, dVarG4, defaultStyle, (l) objI3, i213, true, i214, 0, null, null, lVarV, 199680 | (i15 & 896) | ((i15 >> 6) & 57344) | ((i15 << 3) & 3670016), 896);
                if (o.J()) {
                    o.R();
                }
                map3 = map7;
                i24 = i213;
                i25 = i214;
                dVar5 = dVar9;
            } else {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        mapF = v0.f(x.a(k.CLICKABLE, SpanStyle.b(defaultStyle.O(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null)));
                        i15 &= -57345;
                    } else {
                        mapF = map;
                    }
                    if (i17 != 0) {
                        i18 = Integer.MAX_VALUE;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i22;
                    }
                    dVar3 = dVar2;
                    map2 = mapF;
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i16 != 0) {
                        mapF = v0.f(x.a(k.CLICKABLE, SpanStyle.b(defaultStyle.O(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null)));
                        i15 &= -57345;
                    } else {
                        mapF = map;
                    }
                    if (i17 != 0) {
                        i18 = Integer.MAX_VALUE;
                    }
                    if (i21 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i22;
                    }
                    dVar3 = dVar2;
                    map2 = mapF;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1670114880, i15, -1, "com.stripe.android.financialconnections.ui.components.AnnotatedText (Text.kt:40)");
                }
                long textDefault5 = p026y50.d.f125064a.a(lVarV, 6).getTextDefault();
                lVarV.H(1381268281);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                dVarK = k(text, new d(map2, textDefault5, p1Var), lVarV, i15 & 14, 0);
                lVarV.H(1381285932);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = s3.d(null, null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var2 = (p1) objI2;
                lVarV.T();
                androidx.compose.ui.d.Companion companion6 = androidx.compose.ui.d.INSTANCE;
                lVarV.H(1381290420);
                boolean zN5 = lVarV.n(dVarK);
                if ((i15 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | zN5;
                Object objI8 = lVarV.I();
                if (z12) {
                    dVar4 = dVarK;
                    cVar = new c(dVar4, p1Var2, p1Var, onClickableTextClick, null);
                    lVarV.B(cVar);
                } else {
                    dVar4 = dVarK;
                    cVar = new c(dVar4, p1Var2, p1Var, onClickableTextClick, null);
                    lVarV.B(cVar);
                }
                lVarV.T();
                androidx.compose.ui.d dVarG5 = dVar3.g(o0.d(companion6, onClickableTextClick, (p) cVar));
                lVarV.H(1381317441);
                objI3 = lVarV.I();
                if (objI3 == companion.a()) {
                    objI3 = new a(p1Var2);
                    lVarV.B(objI3);
                }
                lVarV.T();
                Map<k, SpanStyle> map8 = map2;
                int i215 = iA;
                androidx.compose.ui.d dVar10 = dVar3;
                int i216 = i18;
                kotlin.d.a(dVar4, dVarG5, defaultStyle, (l) objI3, i215, true, i216, 0, null, null, lVarV, 199680 | (i15 & 896) | ((i15 >> 6) & 57344) | ((i15 << 3) & 3670016), 896);
                if (o.J()) {
                    o.R();
                }
                map3 = map8;
                i24 = i215;
                i25 = i216;
                dVar5 = dVar10;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(text, onClickableTextClick, defaultStyle, dVar5, map3, i25, i24, i13, i14));
            }
        }
        i15 |= 196608;
        i18 = i11;
        i21 = i14 & 64;
        if (i21 != 0) {
            i15 |= 1572864;
            i22 = i12;
        } else {
            i22 = i12;
            if ((i13 & 3670016) == 0) {
                if (lVarV.r(i22)) {
                    i23 = PKIFailureInfo.badCertTemplate;
                } else {
                    i23 = PKIFailureInfo.signerNotTrusted;
                }
                i15 |= i23;
            }
        }
        if (i16 != 16) {
            lVarV.L();
            if ((i13 & 1) != 0) {
                if (i26 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i16 != 0) {
                    mapF = v0.f(x.a(k.CLICKABLE, SpanStyle.b(defaultStyle.O(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null)));
                    i15 &= -57345;
                } else {
                    mapF = map;
                }
                if (i17 != 0) {
                    i18 = Integer.MAX_VALUE;
                }
                if (i21 != 0) {
                    iA = t4.t.INSTANCE.a();
                } else {
                    iA = i22;
                }
                dVar3 = dVar2;
                map2 = mapF;
            } else {
                if (i26 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i16 != 0) {
                    mapF = v0.f(x.a(k.CLICKABLE, SpanStyle.b(defaultStyle.O(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null)));
                    i15 &= -57345;
                } else {
                    mapF = map;
                }
                if (i17 != 0) {
                    i18 = Integer.MAX_VALUE;
                }
                if (i21 != 0) {
                    iA = t4.t.INSTANCE.a();
                } else {
                    iA = i22;
                }
                dVar3 = dVar2;
                map2 = mapF;
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1670114880, i15, -1, "com.stripe.android.financialconnections.ui.components.AnnotatedText (Text.kt:40)");
            }
            long textDefault6 = p026y50.d.f125064a.a(lVarV, 6).getTextDefault();
            lVarV.H(1381268281);
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = s3.d(null, null, 2, null);
                lVarV.B(objI);
            }
            p1Var = (p1) objI;
            lVarV.T();
            dVarK = k(text, new d(map2, textDefault6, p1Var), lVarV, i15 & 14, 0);
            lVarV.H(1381285932);
            objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = s3.d(null, null, 2, null);
                lVarV.B(objI2);
            }
            p1Var2 = (p1) objI2;
            lVarV.T();
            androidx.compose.ui.d.Companion companion7 = androidx.compose.ui.d.INSTANCE;
            lVarV.H(1381290420);
            boolean zN6 = lVarV.n(dVarK);
            if ((i15 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | zN6;
            Object objI9 = lVarV.I();
            if (z12) {
                dVar4 = dVarK;
                cVar = new c(dVar4, p1Var2, p1Var, onClickableTextClick, null);
                lVarV.B(cVar);
            } else {
                dVar4 = dVarK;
                cVar = new c(dVar4, p1Var2, p1Var, onClickableTextClick, null);
                lVarV.B(cVar);
            }
            lVarV.T();
            androidx.compose.ui.d dVarG6 = dVar3.g(o0.d(companion7, onClickableTextClick, (p) cVar));
            lVarV.H(1381317441);
            objI3 = lVarV.I();
            if (objI3 == companion.a()) {
                objI3 = new a(p1Var2);
                lVarV.B(objI3);
            }
            lVarV.T();
            Map<k, SpanStyle> map9 = map2;
            int i217 = iA;
            androidx.compose.ui.d dVar11 = dVar3;
            int i218 = i18;
            kotlin.d.a(dVar4, dVarG6, defaultStyle, (l) objI3, i217, true, i218, 0, null, null, lVarV, 199680 | (i15 & 896) | ((i15 >> 6) & 57344) | ((i15 << 3) & 3670016), 896);
            if (o.J()) {
                o.R();
            }
            map3 = map9;
            i24 = i217;
            i25 = i218;
            dVar5 = dVar11;
        } else {
            lVarV.L();
            if ((i13 & 1) != 0) {
                if (i26 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i16 != 0) {
                    mapF = v0.f(x.a(k.CLICKABLE, SpanStyle.b(defaultStyle.O(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null)));
                    i15 &= -57345;
                } else {
                    mapF = map;
                }
                if (i17 != 0) {
                    i18 = Integer.MAX_VALUE;
                }
                if (i21 != 0) {
                    iA = t4.t.INSTANCE.a();
                } else {
                    iA = i22;
                }
                dVar3 = dVar2;
                map2 = mapF;
            } else {
                if (i26 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i16 != 0) {
                    mapF = v0.f(x.a(k.CLICKABLE, SpanStyle.b(defaultStyle.O(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.INSTANCE.d(), null, null, null, 61439, null)));
                    i15 &= -57345;
                } else {
                    mapF = map;
                }
                if (i17 != 0) {
                    i18 = Integer.MAX_VALUE;
                }
                if (i21 != 0) {
                    iA = t4.t.INSTANCE.a();
                } else {
                    iA = i22;
                }
                dVar3 = dVar2;
                map2 = mapF;
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1670114880, i15, -1, "com.stripe.android.financialconnections.ui.components.AnnotatedText (Text.kt:40)");
            }
            long textDefault7 = p026y50.d.f125064a.a(lVarV, 6).getTextDefault();
            lVarV.H(1381268281);
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = s3.d(null, null, 2, null);
                lVarV.B(objI);
            }
            p1Var = (p1) objI;
            lVarV.T();
            dVarK = k(text, new d(map2, textDefault7, p1Var), lVarV, i15 & 14, 0);
            lVarV.H(1381285932);
            objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = s3.d(null, null, 2, null);
                lVarV.B(objI2);
            }
            p1Var2 = (p1) objI2;
            lVarV.T();
            androidx.compose.ui.d.Companion companion8 = androidx.compose.ui.d.INSTANCE;
            lVarV.H(1381290420);
            boolean zN7 = lVarV.n(dVarK);
            if ((i15 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | zN7;
            Object objI10 = lVarV.I();
            if (z12) {
                dVar4 = dVarK;
                cVar = new c(dVar4, p1Var2, p1Var, onClickableTextClick, null);
                lVarV.B(cVar);
            } else {
                dVar4 = dVarK;
                cVar = new c(dVar4, p1Var2, p1Var, onClickableTextClick, null);
                lVarV.B(cVar);
            }
            lVarV.T();
            androidx.compose.ui.d dVarG7 = dVar3.g(o0.d(companion8, onClickableTextClick, (p) cVar));
            lVarV.H(1381317441);
            objI3 = lVarV.I();
            if (objI3 == companion.a()) {
                objI3 = new a(p1Var2);
                lVarV.B(objI3);
            }
            lVarV.T();
            Map<k, SpanStyle> map10 = map2;
            int i219 = iA;
            androidx.compose.ui.d dVar12 = dVar3;
            int i2110 = i18;
            kotlin.d.a(dVar4, dVarG7, defaultStyle, (l) objI3, i219, true, i2110, 0, null, null, lVarV, 199680 | (i15 & 896) | ((i15 >> 6) & 57344) | ((i15 << 3) & 3670016), 896);
            if (o.J()) {
                o.R();
            }
            map3 = map10;
            i24 = i219;
            i25 = i2110;
            dVar5 = dVar12;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(text, onClickableTextClick, defaultStyle, dVar5, map3, i25, i24, i13, i14));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(p1<String> p1Var) {
        return p1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p1<String> p1Var, String str) {
        p1Var.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLayoutResult d(p1<TextLayoutResult> p1Var) {
        return p1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p1<TextLayoutResult> p1Var, TextLayoutResult textLayoutResult) {
        p1Var.setValue(textLayoutResult);
    }

    private static final i4.d k(g gVar, l<? super Annotation, SpanStyle> lVar, p020r2.l lVar2, int i11, int i12) {
        lVar2.H(134522096);
        if ((i12 & 2) != 0) {
            lVar = e.f121008c;
        }
        if (o.J()) {
            o.S(134522096, i11, -1, "com.stripe.android.financialconnections.ui.components.annotatedStringResource (Text.kt:117)");
        }
        SpannedString spannedString = new SpannedString(gVar.i2(lVar2, i11 & 14));
        i4.d.a aVar = new i4.d.a(0, 1, null);
        String string = spannedString.toString();
        s.j(string, "toString(...)");
        aVar.i(string);
        for (Object obj : spannedString.getSpans(0, spannedString.length(), Object.class)) {
            int spanStart = spannedString.getSpanStart(obj);
            int spanEnd = spannedString.getSpanEnd(obj);
            Annotation annotationM = m(obj);
            if (annotationM != null) {
                String key = annotationM.getKey();
                s.j(key, "getKey(...)");
                String value = annotationM.getValue();
                s.j(value, "getValue(...)");
                aVar.a(key, value, spanStart, spanEnd);
                SpanStyle spanStyleInvoke = lVar.invoke(annotationM);
                if (spanStyleInvoke != null) {
                    aVar.c(spanStyleInvoke, spanStart, spanEnd);
                }
            }
        }
        i4.d dVarO = aVar.o();
        if (o.J()) {
            o.R();
        }
        lVar2.T();
        return dVarO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i4.d.Range<String> l(TextLayoutResult textLayoutResult, long j11, i4.d dVar) {
        int iX = textLayoutResult.x(j11);
        return (i4.d.Range) v.q0(dVar.j(k.CLICKABLE.getValue(), iX, iX));
    }

    private static final Annotation m(Object obj) {
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 0 || style != 1) {
                return null;
            }
            return new Annotation(k.BOLD.getValue(), "");
        }
        if (obj instanceof URLSpan) {
            return new Annotation(k.CLICKABLE.getValue(), ((URLSpan) obj).getURL());
        }
        if (obj instanceof Annotation) {
            return (Annotation) obj;
        }
        return null;
    }
}
