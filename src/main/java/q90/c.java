package q90;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Spanned;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import g4.y;
import i4.Placeholder;
import i4.SpanStyle;
import i4.TextLayoutResult;
import i4.TextStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.t;
import k3.n0;
import k3.r1;
import kotlin.q;
import kotlin.r;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.j1;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p014n4.FontWeight;
import p020r2.Function0;
import p020r2.k2;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.y3;
import p021s1.a0;
import q1.b0;
import v3.f0;
import v3.o0;
import w4.w;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a:\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a^\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00000\u00152\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a|\u0010$\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u0082\u0001\u0010)\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001e\u0010#\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010(0'\u0012\u0004\u0012\u00020\u00130&H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a7\u0010-\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00012\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\u00002\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b-\u0010.\u001a\u0092\u0001\u00107\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00002\b\b\u0002\u00100\u001a\u00020\u001f2\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00104\u001a\u0002032\u0014\b\u0002\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00130&2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00130&H\u0003ø\u0001\u0000¢\u0006\u0004\b7\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"", "", "Lq90/b$b;", "drawableImageLoader", "Li4/x;", "imageAlign", "Lb2/q;", "g", "(Ljava/util/Map;ILr2/l;I)Ljava/util/Map;", "Lq90/b$a;", "bitmapImageLoader", "f", "Li4/d;", "annotatedText", "Lq90/b;", "imageLoader", "Lo90/f;", "stripeImageLoader", "Lkotlin/Function0;", "Ljn0/h0;", "onLoaded", "Lr2/y3;", "h", "(Li4/d;Ljava/util/Map;Lo90/f;ILwn0/a;Lr2/l;I)Lr2/y3;", "html", "Landroidx/compose/ui/d;", "modifier", "Lk3/p1;", "color", "Li4/r0;", "style", "", "enabled", "Li4/d0;", "urlSpanStyle", "onClick", "b", "(Ljava/lang/String;Landroidx/compose/ui/d;Ljava/util/Map;JLi4/r0;ZLi4/d0;ILwn0/a;Lr2/l;II)V", "Lkotlin/Function1;", "", "Li4/d$c;", "c", "(Ljava/lang/String;Landroidx/compose/ui/d;Ljava/util/Map;JLi4/r0;Li4/d0;ILwn0/l;Lr2/l;II)V", "text", "imageGetter", "e", "(Ljava/lang/String;Ljava/util/Map;Li4/d0;Lr2/l;II)Li4/d;", "inlineContent", "softWrap", "Lt4/t;", "overflow", "", "maxLines", "Li4/m0;", "onTextLayout", "a", "(Li4/d;JLi4/r0;Landroidx/compose/ui/d;Ljava/util/Map;ZIILwn0/l;Lwn0/l;Lr2/l;II)V", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements wn0.l<TextLayoutResult, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f105128c = new a();

        a() {
            super(1);
        }

        public final void a(TextLayoutResult it) {
            s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/m0;", "it", "Ljn0/h0;", "a", "(Li4/m0;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<TextLayoutResult, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<TextLayoutResult> f105129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<TextLayoutResult, h0> f105130d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p1<TextLayoutResult> p1Var, wn0.l<? super TextLayoutResult, h0> lVar) {
            super(1);
            this.f105129c = p1Var;
            this.f105130d = lVar;
        }

        public final void a(TextLayoutResult it) {
            s.k(it, "it");
            this.f105129c.setValue(it);
            this.f105130d.invoke(it);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: q90.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C2222c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i4.d f105131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f105132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f105133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f105134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map<String, q> f105135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f105136h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f105137i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f105138j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ wn0.l<TextLayoutResult, h0> f105139k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, h0> f105140l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f105141m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f105142n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2222c(i4.d dVar, long j11, TextStyle textStyle, androidx.compose.ui.d dVar2, Map<String, q> map, boolean z11, int i11, int i12, wn0.l<? super TextLayoutResult, h0> lVar, wn0.l<? super Integer, h0> lVar2, int i13, int i14) {
            super(2);
            this.f105131c = dVar;
            this.f105132d = j11;
            this.f105133e = textStyle;
            this.f105134f = dVar2;
            this.f105135g = map;
            this.f105136h = z11;
            this.f105137i = i11;
            this.f105138j = i12;
            this.f105139k = lVar;
            this.f105140l = lVar2;
            this.f105141m = i13;
            this.f105142n = i14;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.a(this.f105131c, this.f105132d, this.f105133e, this.f105134f, this.f105135g, this.f105136h, this.f105137i, this.f105138j, this.f105139k, this.f105140l, lVar, k2.a(this.f105141m | 1), this.f105142n);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.uicore.text.HtmlKt$ClickableText$pressIndicator$1$1", f = "Html.kt", i = {}, l = {448}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<f0, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f105143n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f105144o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p1<TextLayoutResult> f105145p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, h0> f105146q;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/g;", "pos", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<j3.g, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p1<TextLayoutResult> f105147c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.l<Integer, h0> f105148d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p1<TextLayoutResult> p1Var, wn0.l<? super Integer, h0> lVar) {
                super(1);
                this.f105147c = p1Var;
                this.f105148d = lVar;
            }

            public final void a(long j11) {
                List<j3.i> listA;
                List listL0;
                Object next;
                TextLayoutResult value = this.f105147c.getValue();
                if (value != null && (listA = value.A()) != null && (listL0 = v.l0(listA)) != null) {
                    Iterator it = listL0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        j3.i iVar = (j3.i) next;
                        if (j3.g.m(j11) > j3.g.m(iVar.m()) && j3.g.m(j11) < j3.g.m(iVar.n())) {
                            break;
                        }
                    }
                    j3.i iVar2 = (j3.i) next;
                    if (iVar2 != null) {
                        j11 = j3.g.g(iVar2.n(), j3.g.m(iVar2.n()) + 0.1f, BitmapDescriptorFactory.HUE_RED, 2, null);
                    }
                }
                TextLayoutResult value2 = this.f105147c.getValue();
                if (value2 != null) {
                    this.f105148d.invoke(Integer.valueOf(value2.x(j11) - 1));
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(j3.g gVar) {
                a(gVar.getPackedValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p1<TextLayoutResult> p1Var, wn0.l<? super Integer, h0> lVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f105145p = p1Var;
            this.f105146q = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f105145p, this.f105146q, continuation);
            dVar.f105144o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f105143n;
            if (i11 == 0) {
                t.b(obj);
                f0 f0Var = (f0) this.f105144o;
                a aVar = new a(this.f105145p, this.f105146q);
                this.f105143n = 1;
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Li4/d$c;", "", "annotatedStringRanges", "Ljn0/h0;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements wn0.l<List<? extends i4.d.Range<String>>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f105150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f105151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f105152e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z11, wn0.a<h0> aVar, Context context) {
            super(1);
            this.f105150c = z11;
            this.f105151d = aVar;
            this.f105152e = context;
        }

        public final void a(List<i4.d.Range<String>> annotatedStringRanges) {
            s.k(annotatedStringRanges, "annotatedStringRanges");
            if (this.f105150c) {
                this.f105151d.invoke();
                i4.d.Range range = (i4.d.Range) v.q0(annotatedStringRanges);
                if (range != null) {
                    Context context = this.f105152e;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse((String) range.e()));
                    context.startActivity(intent);
                }
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(List<? extends i4.d.Range<String>> list) {
            a(list);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f105153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f105154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map<String, q90.b> f105155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f105156f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ TextStyle f105157g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f105158h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ SpanStyle f105159i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f105160j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f105161k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f105162l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f105163m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(String str, androidx.compose.ui.d dVar, Map<String, ? extends q90.b> map, long j11, TextStyle textStyle, boolean z11, SpanStyle spanStyle, int i11, wn0.a<h0> aVar, int i12, int i13) {
            super(2);
            this.f105153c = str;
            this.f105154d = dVar;
            this.f105155e = map;
            this.f105156f = j11;
            this.f105157g = textStyle;
            this.f105158h = z11;
            this.f105159i = spanStyle;
            this.f105160j = i11;
            this.f105161k = aVar;
            this.f105162l = i12;
            this.f105163m = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.b(this.f105153c, this.f105154d, this.f105155e, this.f105156f, this.f105157g, this.f105158h, this.f105159i, this.f105160j, this.f105161k, lVar, k2.a(this.f105162l | 1), this.f105163m);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f105164c = new h();

        h() {
            super(1);
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(I)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends u implements wn0.l<Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<List<i4.d.Range<String>>, h0> f105165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i4.d f105166d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(wn0.l<? super List<i4.d.Range<String>>, h0> lVar, i4.d dVar) {
            super(1);
            this.f105165c = lVar;
            this.f105166d = dVar;
        }

        public final void a(int i11) {
            this.f105165c.invoke(this.f105166d.j("URL", i11, i11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Integer num) {
            a(num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class j extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f105167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f105168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map<String, q90.b> f105169e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f105170f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ TextStyle f105171g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ SpanStyle f105172h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f105173i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ wn0.l<List<i4.d.Range<String>>, h0> f105174j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f105175k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f105176l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(String str, androidx.compose.ui.d dVar, Map<String, ? extends q90.b> map, long j11, TextStyle textStyle, SpanStyle spanStyle, int i11, wn0.l<? super List<i4.d.Range<String>>, h0> lVar, int i12, int i13) {
            super(2);
            this.f105167c = str;
            this.f105168d = dVar;
            this.f105169e = map;
            this.f105170f = j11;
            this.f105171g = textStyle;
            this.f105172h = spanStyle;
            this.f105173i = i11;
            this.f105174j = lVar;
            this.f105175k = i12;
            this.f105176l = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.c(this.f105167c, this.f105168d, this.f105169e, this.f105170f, this.f105171g, this.f105172h, this.f105173i, this.f105174j, lVar, k2.a(this.f105175k | 1), this.f105176l);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class k extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f105177c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(p1<Boolean> p1Var) {
            super(0);
            this.f105177c = p1Var;
        }

        public final void b() {
            this.f105177c.setValue(Boolean.TRUE);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends u implements wn0.q<String, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q90.b.Bitmap f105178c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(q90.b.Bitmap bitmap) {
            super(3);
            this.f105178c = bitmap;
        }

        public final void a(String it, p020r2.l lVar, int i11) {
            s.k(it, "it");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-560842123, i11, -1, "com.stripe.android.uicore.text.rememberBitmapImages.<anonymous>.<anonymous> (Html.kt:130)");
            }
            b0.b(n0.c(this.f105178c.getBitmap()), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, 0, lVar, 56, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(String str, p020r2.l lVar, Integer num) {
            a(str, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class m extends u implements wn0.q<String, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q90.b.Drawable f105179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.painter.b f105180d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(q90.b.Drawable drawable, androidx.compose.ui.graphics.painter.b bVar) {
            super(3);
            this.f105179c = drawable;
            this.f105180d = bVar;
        }

        public final void a(String it, p020r2.l lVar, int i11) {
            s.k(it, "it");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-737684954, i11, -1, "com.stripe.android.uicore.text.rememberDrawableImages.<anonymous>.<anonymous> (Html.kt:95)");
            }
            androidx.compose.ui.d dVarD = x.d(x.h(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            b0.a(this.f105180d, e4.i.c(this.f105179c.getContentDescription(), lVar, 0), dVarD, null, null, BitmapDescriptorFactory.HUE_RED, this.f105179c.getColorFilter(), lVar, 392, 56);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(String str, p020r2.l lVar, Integer num) {
            a(str, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.uicore.text.HtmlKt$rememberRemoteImages$1", f = "Html.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f105181n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f105182o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ List<i4.d.Range<String>> f105183p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ MutableStateFlow<Map<String, q>> f105184q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f105185r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ o90.f f105186s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ w4.d f105187t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f105188u;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.q<String, p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map.Entry<String, Bitmap> f105189c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ o90.f f105190d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f105191e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Map.Entry<String, Bitmap> entry, o90.f fVar, long j11) {
                super(3);
                this.f105189c = entry;
                this.f105190d = fVar;
                this.f105191e = j11;
            }

            public final void a(String it, p020r2.l lVar, int i11) {
                s.k(it, "it");
                if ((i11 & 81) == 16 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(858918421, i11, -1, "com.stripe.android.uicore.text.rememberRemoteImages.<anonymous>.<anonymous>.<anonymous> (Html.kt:186)");
                }
                com.stripe.android.uicore.image.a.a(this.f105189c.getKey(), this.f105190d, null, x.i(x.v(androidx.compose.ui.d.INSTANCE, w4.h.g(j3.m.k(this.f105191e))), w4.h.g(j3.m.i(this.f105191e))), null, null, null, null, false, null, null, lVar, 448, 0, 2032);
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(String str, p020r2.l lVar, Integer num) {
                a(str, lVar, num.intValue());
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.uicore.text.HtmlKt$rememberRemoteImages$1$deferred$1$1", f = "Html.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super Pair<? extends String, ? extends Bitmap>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f105192n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f105193o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ i4.d.Range<String> f105194p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ o90.f f105195q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i4.d.Range<String> range, o90.f fVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f105194p = range;
                this.f105195q = fVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f105194p, this.f105195q, continuation);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends String, ? extends Bitmap>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super Pair<String, Bitmap>>) continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object value;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f105193o;
                if (i11 == 0) {
                    t.b(obj);
                    String strE = this.f105194p.e();
                    o90.f fVar = this.f105195q;
                    String strE2 = this.f105194p.e();
                    this.f105192n = strE;
                    this.f105193o = 1;
                    Object objH = fVar.h(strE2, this);
                    if (objH == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = strE;
                    value = objH;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f105192n;
                    t.b(obj);
                    value = ((jn0.s) obj).getValue();
                }
                if (jn0.s.g(value)) {
                    value = null;
                }
                return new Pair(obj2, value);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<String, Bitmap>> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(List<i4.d.Range<String>> list, MutableStateFlow<Map<String, q>> mutableStateFlow, wn0.a<h0> aVar, o90.f fVar, w4.d dVar, int i11, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f105183p = list;
            this.f105184q = mutableStateFlow;
            this.f105185r = aVar;
            this.f105186s = fVar;
            this.f105187t = dVar;
            this.f105188u = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            n nVar = new n(this.f105183p, this.f105184q, this.f105185r, this.f105186s, this.f105187t, this.f105188u, continuation);
            nVar.f105182o = obj;
            return nVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objAwaitAll;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f105181n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f105182o;
                List<i4.d.Range<String>> list = this.f105183p;
                o90.f fVar = this.f105186s;
                ArrayList arrayList = new ArrayList(v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new b((i4.d.Range) it.next(), fVar, null), 3, null));
                }
                this.f105181n = 1;
                objAwaitAll = AwaitKt.awaitAll(arrayList, this);
                if (objAwaitAll == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                objAwaitAll = obj;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Pair pair : (Iterable) objAwaitAll) {
                Bitmap bitmap = (Bitmap) pair.f();
                Pair pair2 = bitmap != null ? new Pair(pair.e(), bitmap) : null;
                if (pair2 != null) {
                    arrayList2.add(pair2);
                }
            }
            Map mapY = v0.y(arrayList2);
            MutableStateFlow<Map<String, q>> mutableStateFlow = this.f105184q;
            w4.d dVar = this.f105187t;
            int i12 = this.f105188u;
            o90.f fVar2 = this.f105186s;
            LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(mapY.size()));
            for (Iterator it2 = mapY.entrySet().iterator(); it2.hasNext(); it2 = it2) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                long jN = j3.m.n(j3.n.a(((Bitmap) entry.getValue()).getWidth(), ((Bitmap) entry.getValue()).getHeight()), 1 / dVar.getDensity());
                linkedHashMap.put(key, new q(new Placeholder(w.g(j3.m.k(jN)), w.g(j3.m.i(jN)), i12, null), z2.c.c(858918421, true, new a(entry, fVar2, jN))));
            }
            mutableStateFlow.setValue(linkedHashMap);
            this.f105185r.invoke();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:109:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:112:0x0156  */
    /* JADX WARN: Code duplicated, block: B:113:0x0158  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0163  */
    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:119:0x016b  */
    /* JADX WARN: Code duplicated, block: B:121:0x016f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0172  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0186  */
    /* JADX WARN: Code duplicated, block: B:129:0x019d  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:133:0x01be  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:141:0x022a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0232  */
    /* JADX WARN: Code duplicated, block: B:146:0x0238  */
    /* JADX WARN: Code duplicated, block: B:149:0x0278  */
    /* JADX WARN: Code duplicated, block: B:153:0x028b  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x011f  */
    public static final void a(i4.d dVar, long j11, TextStyle textStyle, androidx.compose.ui.d dVar2, Map<String, q> map, boolean z11, int i11, int i12, wn0.l<? super TextLayoutResult, h0> lVar, wn0.l<? super Integer, h0> lVar2, p020r2.l lVar3, int i13, int i14) {
        i4.d dVar3;
        int i15;
        long j12;
        int i16;
        androidx.compose.ui.d dVar4;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Map<String, q> mapI;
        boolean z12;
        int iA;
        int i29;
        wn0.l<? super TextLayoutResult, h0> lVar4;
        Object objI;
        p020r2.l.Companion companion;
        int i31;
        p1 p1Var;
        boolean z13;
        Object objI2;
        wn0.l<? super TextLayoutResult, h0> lVar5;
        boolean z14;
        Object objI3;
        p020r2.l lVar6;
        wn0.l<? super TextLayoutResult, h0> lVar7;
        androidx.compose.ui.d dVar5;
        int i32;
        boolean z15;
        int i33;
        Map<String, q> map2;
        w2 w2VarX;
        p020r2.l lVarV = lVar3.v(-1952998280);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
            dVar3 = dVar;
        } else {
            dVar3 = dVar;
            if ((i13 & 14) == 0) {
                i15 = (lVarV.n(dVar3) ? 4 : 2) | i13;
            } else {
                i15 = i13;
            }
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
            j12 = j11;
        } else {
            j12 = j11;
            if ((i13 & 112) == 0) {
                i15 |= lVarV.s(j12) ? 32 : 16;
            }
        }
        if ((i14 & 4) == 0) {
            if ((i13 & 896) == 0) {
                i15 |= lVarV.n(textStyle) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 7168) == 0) {
                    dVar4 = dVar2;
                    if (lVarV.n(dVar4)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    i15 |= PKIFailureInfo.certRevoked;
                }
                i19 = i14 & 32;
                if (i19 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    if (lVarV.p(z11)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i15 |= i21;
                }
                i22 = i14 & 64;
                if (i22 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (lVarV.r(i11)) {
                        i23 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i23 = PKIFailureInfo.signerNotTrusted;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 128;
                if (i24 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (lVarV.r(i12)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 256;
                if (i26 != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 234881024) == 0) {
                    if (lVarV.K(lVar)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i15 |= i27;
                }
                if ((i14 & 512) != 0) {
                    if ((i13 & 1879048192) == 0) {
                        if (lVarV.K(lVar2)) {
                            i28 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i28 = 268435456;
                        }
                    }
                    if (i18 != 16 && (1533916891 & i15) == 306783378 && lVarV.b()) {
                        lVarV.j();
                        map2 = map;
                        z15 = z11;
                        i32 = i11;
                        lVar7 = lVar;
                        lVar6 = lVarV;
                        dVar5 = dVar4;
                        i33 = i12;
                    } else {
                        if (i16 != 0) {
                            dVar4 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i18 != 0) {
                            mapI = v0.i();
                        } else {
                            mapI = map;
                        }
                        if (i19 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i22 != 0) {
                            iA = t4.t.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if (i24 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i12;
                        }
                        if (i26 != 0) {
                            lVar4 = a.f105128c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (o.J()) {
                            o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
                        }
                        lVarV.H(-1159067030);
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        i31 = i15;
                        if (objI == companion.a()) {
                            objI = s3.d(null, null, 2, null);
                            lVarV.B(objI);
                        }
                        p1Var = (p1) objI;
                        lVarV.T();
                        androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
                        lVarV.H(-1159062838);
                        if ((i31 & 1879048192) == 536870912) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objI2 = lVarV.I();
                        if (z13 || objI2 == companion.a()) {
                            objI2 = new d(p1Var, lVar2, null);
                            lVarV.B(objI2);
                        }
                        lVarV.T();
                        androidx.compose.ui.d dVarG = dVar4.g(o0.d(companion2, lVar2, (p) objI2));
                        lVar5 = lVar4;
                        TextStyle textStyleE = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
                        lVarV.H(-1159030910);
                        z14 = (i31 & 234881024) == 67108864;
                        objI3 = lVarV.I();
                        if (z14 || objI3 == companion.a()) {
                            objI3 = new b(p1Var, lVar5);
                            lVarV.B(objI3);
                        }
                        lVarV.T();
                        Map<String, q> map3 = mapI;
                        lVar6 = lVarV;
                        int i34 = i29;
                        boolean z16 = z12;
                        int i35 = iA;
                        kotlin.d.a(dVar3, dVarG, textStyleE, (wn0.l) objI3, i35, z16, i34, 0, map3, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
                        if (o.J()) {
                            o.R();
                        }
                        lVar7 = lVar5;
                        dVar5 = dVar4;
                        i32 = i35;
                        z15 = z16;
                        i33 = i34;
                        map2 = map3;
                    }
                    w2VarX = lVar6.x();
                    if (w2VarX != null) {
                        w2VarX.a(new C2222c(dVar, j11, textStyle, dVar5, map2, z15, i32, i33, lVar7, lVar2, i13, i14));
                    }
                }
                i28 = 805306368;
                i15 |= i28;
                if (i18 != 16) {
                    if (i16 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i18 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i19 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i22 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if (i24 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i12;
                    }
                    if (i26 != 0) {
                        lVar4 = a.f105128c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
                    }
                    lVarV.H(-1159067030);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    i31 = i15;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    lVarV.T();
                    androidx.compose.ui.d.Companion companion3 = androidx.compose.ui.d.INSTANCE;
                    lVarV.H(-1159062838);
                    if ((i31 & 1879048192) == 536870912) {
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
                    lVarV.T();
                    androidx.compose.ui.d dVarG2 = dVar4.g(o0.d(companion3, lVar2, (p) objI2));
                    lVar5 = lVar4;
                    TextStyle textStyleE2 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
                    lVarV.H(-1159030910);
                    if ((i31 & 234881024) == 67108864) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar5);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar5);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    Map<String, q> map4 = mapI;
                    lVar6 = lVarV;
                    int i36 = i29;
                    boolean z17 = z12;
                    int i37 = iA;
                    kotlin.d.a(dVar3, dVarG2, textStyleE2, (wn0.l) objI3, i37, z17, i36, 0, map4, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
                    if (o.J()) {
                        o.R();
                    }
                    lVar7 = lVar5;
                    dVar5 = dVar4;
                    i32 = i37;
                    z15 = z17;
                    i33 = i36;
                    map2 = map4;
                } else {
                    if (i16 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i18 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i19 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i22 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if (i24 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i12;
                    }
                    if (i26 != 0) {
                        lVar4 = a.f105128c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
                    }
                    lVarV.H(-1159067030);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    i31 = i15;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    lVarV.T();
                    androidx.compose.ui.d.Companion companion4 = androidx.compose.ui.d.INSTANCE;
                    lVarV.H(-1159062838);
                    if ((i31 & 1879048192) == 536870912) {
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
                    lVarV.T();
                    androidx.compose.ui.d dVarG3 = dVar4.g(o0.d(companion4, lVar2, (p) objI2));
                    lVar5 = lVar4;
                    TextStyle textStyleE3 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
                    lVarV.H(-1159030910);
                    if ((i31 & 234881024) == 67108864) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar5);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar5);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    Map<String, q> map5 = mapI;
                    lVar6 = lVarV;
                    int i38 = i29;
                    boolean z18 = z12;
                    int i39 = iA;
                    kotlin.d.a(dVar3, dVarG3, textStyleE3, (wn0.l) objI3, i39, z18, i38, 0, map5, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
                    if (o.J()) {
                        o.R();
                    }
                    lVar7 = lVar5;
                    dVar5 = dVar4;
                    i32 = i39;
                    z15 = z18;
                    i33 = i38;
                    map2 = map5;
                }
                w2VarX = lVar6.x();
                if (w2VarX != null) {
                    w2VarX.a(new C2222c(dVar, j11, textStyle, dVar5, map2, z15, i32, i33, lVar7, lVar2, i13, i14));
                }
            }
            i15 |= 3072;
            dVar4 = dVar2;
            i18 = i14 & 16;
            if (i18 != 0) {
                i15 |= PKIFailureInfo.certRevoked;
            }
            i19 = i14 & 32;
            if (i19 != 0) {
                i15 |= 196608;
            } else if ((i13 & 458752) == 0) {
                if (lVarV.p(z11)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i15 |= i21;
            }
            i22 = i14 & 64;
            if (i22 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (lVarV.r(i11)) {
                    i23 = PKIFailureInfo.badCertTemplate;
                } else {
                    i23 = PKIFailureInfo.signerNotTrusted;
                }
                i15 |= i23;
            }
            i24 = i14 & 128;
            if (i24 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (lVarV.r(i12)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i15 |= i25;
            }
            i26 = i14 & 256;
            if (i26 != 0) {
                i15 |= 100663296;
            } else if ((i13 & 234881024) == 0) {
                if (lVarV.K(lVar)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i15 |= i27;
            }
            if ((i14 & 512) != 0) {
                if ((i13 & 1879048192) == 0) {
                    if (lVarV.K(lVar2)) {
                        i28 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i28 = 268435456;
                    }
                }
                if (i18 != 16) {
                    if (i16 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i18 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i19 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i22 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if (i24 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i12;
                    }
                    if (i26 != 0) {
                        lVar4 = a.f105128c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
                    }
                    lVarV.H(-1159067030);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    i31 = i15;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    lVarV.T();
                    androidx.compose.ui.d.Companion companion5 = androidx.compose.ui.d.INSTANCE;
                    lVarV.H(-1159062838);
                    if ((i31 & 1879048192) == 536870912) {
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
                    lVarV.T();
                    androidx.compose.ui.d dVarG4 = dVar4.g(o0.d(companion5, lVar2, (p) objI2));
                    lVar5 = lVar4;
                    TextStyle textStyleE4 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
                    lVarV.H(-1159030910);
                    if ((i31 & 234881024) == 67108864) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar5);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar5);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    Map<String, q> map6 = mapI;
                    lVar6 = lVarV;
                    int i310 = i29;
                    boolean z19 = z12;
                    int i311 = iA;
                    kotlin.d.a(dVar3, dVarG4, textStyleE4, (wn0.l) objI3, i311, z19, i310, 0, map6, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
                    if (o.J()) {
                        o.R();
                    }
                    lVar7 = lVar5;
                    dVar5 = dVar4;
                    i32 = i311;
                    z15 = z19;
                    i33 = i310;
                    map2 = map6;
                } else {
                    if (i16 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i18 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i19 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i22 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if (i24 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i12;
                    }
                    if (i26 != 0) {
                        lVar4 = a.f105128c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
                    }
                    lVarV.H(-1159067030);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    i31 = i15;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    lVarV.T();
                    androidx.compose.ui.d.Companion companion6 = androidx.compose.ui.d.INSTANCE;
                    lVarV.H(-1159062838);
                    if ((i31 & 1879048192) == 536870912) {
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
                    lVarV.T();
                    androidx.compose.ui.d dVarG5 = dVar4.g(o0.d(companion6, lVar2, (p) objI2));
                    lVar5 = lVar4;
                    TextStyle textStyleE5 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
                    lVarV.H(-1159030910);
                    if ((i31 & 234881024) == 67108864) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar5);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar5);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    Map<String, q> map7 = mapI;
                    lVar6 = lVarV;
                    int i312 = i29;
                    boolean z110 = z12;
                    int i313 = iA;
                    kotlin.d.a(dVar3, dVarG5, textStyleE5, (wn0.l) objI3, i313, z110, i312, 0, map7, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
                    if (o.J()) {
                        o.R();
                    }
                    lVar7 = lVar5;
                    dVar5 = dVar4;
                    i32 = i313;
                    z15 = z110;
                    i33 = i312;
                    map2 = map7;
                }
                w2VarX = lVar6.x();
                if (w2VarX != null) {
                    w2VarX.a(new C2222c(dVar, j11, textStyle, dVar5, map2, z15, i32, i33, lVar7, lVar2, i13, i14));
                }
            }
            i28 = 805306368;
            i15 |= i28;
            if (i18 != 16) {
                if (i16 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i18 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i19 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i22 != 0) {
                    iA = t4.t.INSTANCE.a();
                } else {
                    iA = i11;
                }
                if (i24 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i12;
                }
                if (i26 != 0) {
                    lVar4 = a.f105128c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
                }
                lVarV.H(-1159067030);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                i31 = i15;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                androidx.compose.ui.d.Companion companion7 = androidx.compose.ui.d.INSTANCE;
                lVarV.H(-1159062838);
                if ((i31 & 1879048192) == 536870912) {
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
                lVarV.T();
                androidx.compose.ui.d dVarG6 = dVar4.g(o0.d(companion7, lVar2, (p) objI2));
                lVar5 = lVar4;
                TextStyle textStyleE6 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
                lVarV.H(-1159030910);
                if ((i31 & 234881024) == 67108864) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar5);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar5);
                    lVarV.B(objI3);
                }
                lVarV.T();
                Map<String, q> map8 = mapI;
                lVar6 = lVarV;
                int i314 = i29;
                boolean z111 = z12;
                int i315 = iA;
                kotlin.d.a(dVar3, dVarG6, textStyleE6, (wn0.l) objI3, i315, z111, i314, 0, map8, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
                if (o.J()) {
                    o.R();
                }
                lVar7 = lVar5;
                dVar5 = dVar4;
                i32 = i315;
                z15 = z111;
                i33 = i314;
                map2 = map8;
            } else {
                if (i16 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i18 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i19 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i22 != 0) {
                    iA = t4.t.INSTANCE.a();
                } else {
                    iA = i11;
                }
                if (i24 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i12;
                }
                if (i26 != 0) {
                    lVar4 = a.f105128c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
                }
                lVarV.H(-1159067030);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                i31 = i15;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                androidx.compose.ui.d.Companion companion8 = androidx.compose.ui.d.INSTANCE;
                lVarV.H(-1159062838);
                if ((i31 & 1879048192) == 536870912) {
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
                lVarV.T();
                androidx.compose.ui.d dVarG7 = dVar4.g(o0.d(companion8, lVar2, (p) objI2));
                lVar5 = lVar4;
                TextStyle textStyleE7 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
                lVarV.H(-1159030910);
                if ((i31 & 234881024) == 67108864) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar5);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar5);
                    lVarV.B(objI3);
                }
                lVarV.T();
                Map<String, q> map9 = mapI;
                lVar6 = lVarV;
                int i316 = i29;
                boolean z112 = z12;
                int i317 = iA;
                kotlin.d.a(dVar3, dVarG7, textStyleE7, (wn0.l) objI3, i317, z112, i316, 0, map9, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
                if (o.J()) {
                    o.R();
                }
                lVar7 = lVar5;
                dVar5 = dVar4;
                i32 = i317;
                z15 = z112;
                i33 = i316;
                map2 = map9;
            }
            w2VarX = lVar6.x();
            if (w2VarX != null) {
                w2VarX.a(new C2222c(dVar, j11, textStyle, dVar5, map2, z15, i32, i33, lVar7, lVar2, i13, i14));
            }
        }
        i15 |= KyberEngine.KyberPolyBytes;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 7168) == 0) {
                dVar4 = dVar2;
                if (lVarV.n(dVar4)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                i15 |= PKIFailureInfo.certRevoked;
            }
            i19 = i14 & 32;
            if (i19 != 0) {
                i15 |= 196608;
            } else if ((i13 & 458752) == 0) {
                if (lVarV.p(z11)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i15 |= i21;
            }
            i22 = i14 & 64;
            if (i22 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (lVarV.r(i11)) {
                    i23 = PKIFailureInfo.badCertTemplate;
                } else {
                    i23 = PKIFailureInfo.signerNotTrusted;
                }
                i15 |= i23;
            }
            i24 = i14 & 128;
            if (i24 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (lVarV.r(i12)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i15 |= i25;
            }
            i26 = i14 & 256;
            if (i26 != 0) {
                i15 |= 100663296;
            } else if ((i13 & 234881024) == 0) {
                if (lVarV.K(lVar)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i15 |= i27;
            }
            if ((i14 & 512) != 0) {
                if ((i13 & 1879048192) == 0) {
                    if (lVarV.K(lVar2)) {
                        i28 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i28 = 268435456;
                    }
                }
                if (i18 != 16) {
                    if (i16 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i18 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i19 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i22 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if (i24 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i12;
                    }
                    if (i26 != 0) {
                        lVar4 = a.f105128c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
                    }
                    lVarV.H(-1159067030);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    i31 = i15;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    lVarV.T();
                    androidx.compose.ui.d.Companion companion9 = androidx.compose.ui.d.INSTANCE;
                    lVarV.H(-1159062838);
                    if ((i31 & 1879048192) == 536870912) {
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
                    lVarV.T();
                    androidx.compose.ui.d dVarG8 = dVar4.g(o0.d(companion9, lVar2, (p) objI2));
                    lVar5 = lVar4;
                    TextStyle textStyleE8 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
                    lVarV.H(-1159030910);
                    if ((i31 & 234881024) == 67108864) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar5);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar5);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    Map<String, q> map10 = mapI;
                    lVar6 = lVarV;
                    int i318 = i29;
                    boolean z113 = z12;
                    int i319 = iA;
                    kotlin.d.a(dVar3, dVarG8, textStyleE8, (wn0.l) objI3, i319, z113, i318, 0, map10, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
                    if (o.J()) {
                        o.R();
                    }
                    lVar7 = lVar5;
                    dVar5 = dVar4;
                    i32 = i319;
                    z15 = z113;
                    i33 = i318;
                    map2 = map10;
                } else {
                    if (i16 != 0) {
                        dVar4 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i18 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i19 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i22 != 0) {
                        iA = t4.t.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if (i24 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i12;
                    }
                    if (i26 != 0) {
                        lVar4 = a.f105128c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (o.J()) {
                        o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
                    }
                    lVarV.H(-1159067030);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    i31 = i15;
                    if (objI == companion.a()) {
                        objI = s3.d(null, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    lVarV.T();
                    androidx.compose.ui.d.Companion companion10 = androidx.compose.ui.d.INSTANCE;
                    lVarV.H(-1159062838);
                    if ((i31 & 1879048192) == 536870912) {
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
                    lVarV.T();
                    androidx.compose.ui.d dVarG9 = dVar4.g(o0.d(companion10, lVar2, (p) objI2));
                    lVar5 = lVar4;
                    TextStyle textStyleE9 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
                    lVarV.H(-1159030910);
                    if ((i31 & 234881024) == 67108864) {
                    }
                    objI3 = lVarV.I();
                    if (z14) {
                        objI3 = new b(p1Var, lVar5);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new b(p1Var, lVar5);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    Map<String, q> map11 = mapI;
                    lVar6 = lVarV;
                    int i3110 = i29;
                    boolean z114 = z12;
                    int i3111 = iA;
                    kotlin.d.a(dVar3, dVarG9, textStyleE9, (wn0.l) objI3, i3111, z114, i3110, 0, map11, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
                    if (o.J()) {
                        o.R();
                    }
                    lVar7 = lVar5;
                    dVar5 = dVar4;
                    i32 = i3111;
                    z15 = z114;
                    i33 = i3110;
                    map2 = map11;
                }
                w2VarX = lVar6.x();
                if (w2VarX != null) {
                    w2VarX.a(new C2222c(dVar, j11, textStyle, dVar5, map2, z15, i32, i33, lVar7, lVar2, i13, i14));
                }
            }
            i28 = 805306368;
            i15 |= i28;
            if (i18 != 16) {
                if (i16 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i18 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i19 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i22 != 0) {
                    iA = t4.t.INSTANCE.a();
                } else {
                    iA = i11;
                }
                if (i24 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i12;
                }
                if (i26 != 0) {
                    lVar4 = a.f105128c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
                }
                lVarV.H(-1159067030);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                i31 = i15;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                androidx.compose.ui.d.Companion companion11 = androidx.compose.ui.d.INSTANCE;
                lVarV.H(-1159062838);
                if ((i31 & 1879048192) == 536870912) {
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
                lVarV.T();
                androidx.compose.ui.d dVarG10 = dVar4.g(o0.d(companion11, lVar2, (p) objI2));
                lVar5 = lVar4;
                TextStyle textStyleE10 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
                lVarV.H(-1159030910);
                if ((i31 & 234881024) == 67108864) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar5);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar5);
                    lVarV.B(objI3);
                }
                lVarV.T();
                Map<String, q> map12 = mapI;
                lVar6 = lVarV;
                int i3112 = i29;
                boolean z115 = z12;
                int i3113 = iA;
                kotlin.d.a(dVar3, dVarG10, textStyleE10, (wn0.l) objI3, i3113, z115, i3112, 0, map12, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
                if (o.J()) {
                    o.R();
                }
                lVar7 = lVar5;
                dVar5 = dVar4;
                i32 = i3113;
                z15 = z115;
                i33 = i3112;
                map2 = map12;
            } else {
                if (i16 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i18 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i19 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i22 != 0) {
                    iA = t4.t.INSTANCE.a();
                } else {
                    iA = i11;
                }
                if (i24 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i12;
                }
                if (i26 != 0) {
                    lVar4 = a.f105128c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
                }
                lVarV.H(-1159067030);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                i31 = i15;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                androidx.compose.ui.d.Companion companion12 = androidx.compose.ui.d.INSTANCE;
                lVarV.H(-1159062838);
                if ((i31 & 1879048192) == 536870912) {
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
                lVarV.T();
                androidx.compose.ui.d dVarG11 = dVar4.g(o0.d(companion12, lVar2, (p) objI2));
                lVar5 = lVar4;
                TextStyle textStyleE11 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
                lVarV.H(-1159030910);
                if ((i31 & 234881024) == 67108864) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar5);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar5);
                    lVarV.B(objI3);
                }
                lVarV.T();
                Map<String, q> map13 = mapI;
                lVar6 = lVarV;
                int i3114 = i29;
                boolean z116 = z12;
                int i3115 = iA;
                kotlin.d.a(dVar3, dVarG11, textStyleE11, (wn0.l) objI3, i3115, z116, i3114, 0, map13, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
                if (o.J()) {
                    o.R();
                }
                lVar7 = lVar5;
                dVar5 = dVar4;
                i32 = i3115;
                z15 = z116;
                i33 = i3114;
                map2 = map13;
            }
            w2VarX = lVar6.x();
            if (w2VarX != null) {
                w2VarX.a(new C2222c(dVar, j11, textStyle, dVar5, map2, z15, i32, i33, lVar7, lVar2, i13, i14));
            }
        }
        i15 |= 3072;
        dVar4 = dVar2;
        i18 = i14 & 16;
        if (i18 != 0) {
            i15 |= PKIFailureInfo.certRevoked;
        }
        i19 = i14 & 32;
        if (i19 != 0) {
            i15 |= 196608;
        } else if ((i13 & 458752) == 0) {
            if (lVarV.p(z11)) {
                i21 = 131072;
            } else {
                i21 = 65536;
            }
            i15 |= i21;
        }
        i22 = i14 & 64;
        if (i22 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 3670016) == 0) {
            if (lVarV.r(i11)) {
                i23 = PKIFailureInfo.badCertTemplate;
            } else {
                i23 = PKIFailureInfo.signerNotTrusted;
            }
            i15 |= i23;
        }
        i24 = i14 & 128;
        if (i24 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 29360128) == 0) {
            if (lVarV.r(i12)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i15 |= i25;
        }
        i26 = i14 & 256;
        if (i26 != 0) {
            i15 |= 100663296;
        } else if ((i13 & 234881024) == 0) {
            if (lVarV.K(lVar)) {
                i27 = 67108864;
            } else {
                i27 = 33554432;
            }
            i15 |= i27;
        }
        if ((i14 & 512) != 0) {
            if ((i13 & 1879048192) == 0) {
                if (lVarV.K(lVar2)) {
                    i28 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i28 = 268435456;
                }
            }
            if (i18 != 16) {
                if (i16 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i18 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i19 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i22 != 0) {
                    iA = t4.t.INSTANCE.a();
                } else {
                    iA = i11;
                }
                if (i24 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i12;
                }
                if (i26 != 0) {
                    lVar4 = a.f105128c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
                }
                lVarV.H(-1159067030);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                i31 = i15;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                androidx.compose.ui.d.Companion companion13 = androidx.compose.ui.d.INSTANCE;
                lVarV.H(-1159062838);
                if ((i31 & 1879048192) == 536870912) {
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
                lVarV.T();
                androidx.compose.ui.d dVarG12 = dVar4.g(o0.d(companion13, lVar2, (p) objI2));
                lVar5 = lVar4;
                TextStyle textStyleE12 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
                lVarV.H(-1159030910);
                if ((i31 & 234881024) == 67108864) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar5);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar5);
                    lVarV.B(objI3);
                }
                lVarV.T();
                Map<String, q> map14 = mapI;
                lVar6 = lVarV;
                int i3116 = i29;
                boolean z117 = z12;
                int i3117 = iA;
                kotlin.d.a(dVar3, dVarG12, textStyleE12, (wn0.l) objI3, i3117, z117, i3116, 0, map14, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
                if (o.J()) {
                    o.R();
                }
                lVar7 = lVar5;
                dVar5 = dVar4;
                i32 = i3117;
                z15 = z117;
                i33 = i3116;
                map2 = map14;
            } else {
                if (i16 != 0) {
                    dVar4 = androidx.compose.ui.d.INSTANCE;
                }
                if (i18 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i19 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i22 != 0) {
                    iA = t4.t.INSTANCE.a();
                } else {
                    iA = i11;
                }
                if (i24 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i12;
                }
                if (i26 != 0) {
                    lVar4 = a.f105128c;
                } else {
                    lVar4 = lVar;
                }
                if (o.J()) {
                    o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
                }
                lVarV.H(-1159067030);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                i31 = i15;
                if (objI == companion.a()) {
                    objI = s3.d(null, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                androidx.compose.ui.d.Companion companion14 = androidx.compose.ui.d.INSTANCE;
                lVarV.H(-1159062838);
                if ((i31 & 1879048192) == 536870912) {
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
                lVarV.T();
                androidx.compose.ui.d dVarG13 = dVar4.g(o0.d(companion14, lVar2, (p) objI2));
                lVar5 = lVar4;
                TextStyle textStyleE13 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
                lVarV.H(-1159030910);
                if ((i31 & 234881024) == 67108864) {
                }
                objI3 = lVarV.I();
                if (z14) {
                    objI3 = new b(p1Var, lVar5);
                    lVarV.B(objI3);
                } else {
                    objI3 = new b(p1Var, lVar5);
                    lVarV.B(objI3);
                }
                lVarV.T();
                Map<String, q> map15 = mapI;
                lVar6 = lVarV;
                int i3118 = i29;
                boolean z118 = z12;
                int i3119 = iA;
                kotlin.d.a(dVar3, dVarG13, textStyleE13, (wn0.l) objI3, i3119, z118, i3118, 0, map15, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
                if (o.J()) {
                    o.R();
                }
                lVar7 = lVar5;
                dVar5 = dVar4;
                i32 = i3119;
                z15 = z118;
                i33 = i3118;
                map2 = map15;
            }
            w2VarX = lVar6.x();
            if (w2VarX != null) {
                w2VarX.a(new C2222c(dVar, j11, textStyle, dVar5, map2, z15, i32, i33, lVar7, lVar2, i13, i14));
            }
        }
        i28 = 805306368;
        i15 |= i28;
        if (i18 != 16) {
            if (i16 != 0) {
                dVar4 = androidx.compose.ui.d.INSTANCE;
            }
            if (i18 != 0) {
                mapI = v0.i();
            } else {
                mapI = map;
            }
            if (i19 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i22 != 0) {
                iA = t4.t.INSTANCE.a();
            } else {
                iA = i11;
            }
            if (i24 != 0) {
                i29 = Integer.MAX_VALUE;
            } else {
                i29 = i12;
            }
            if (i26 != 0) {
                lVar4 = a.f105128c;
            } else {
                lVar4 = lVar;
            }
            if (o.J()) {
                o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
            }
            lVarV.H(-1159067030);
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            i31 = i15;
            if (objI == companion.a()) {
                objI = s3.d(null, null, 2, null);
                lVarV.B(objI);
            }
            p1Var = (p1) objI;
            lVarV.T();
            androidx.compose.ui.d.Companion companion15 = androidx.compose.ui.d.INSTANCE;
            lVarV.H(-1159062838);
            if ((i31 & 1879048192) == 536870912) {
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
            lVarV.T();
            androidx.compose.ui.d dVarG14 = dVar4.g(o0.d(companion15, lVar2, (p) objI2));
            lVar5 = lVar4;
            TextStyle textStyleE14 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
            lVarV.H(-1159030910);
            if ((i31 & 234881024) == 67108864) {
            }
            objI3 = lVarV.I();
            if (z14) {
                objI3 = new b(p1Var, lVar5);
                lVarV.B(objI3);
            } else {
                objI3 = new b(p1Var, lVar5);
                lVarV.B(objI3);
            }
            lVarV.T();
            Map<String, q> map16 = mapI;
            lVar6 = lVarV;
            int i31110 = i29;
            boolean z119 = z12;
            int i31111 = iA;
            kotlin.d.a(dVar3, dVarG14, textStyleE14, (wn0.l) objI3, i31111, z119, i31110, 0, map16, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
            if (o.J()) {
                o.R();
            }
            lVar7 = lVar5;
            dVar5 = dVar4;
            i32 = i31111;
            z15 = z119;
            i33 = i31110;
            map2 = map16;
        } else {
            if (i16 != 0) {
                dVar4 = androidx.compose.ui.d.INSTANCE;
            }
            if (i18 != 0) {
                mapI = v0.i();
            } else {
                mapI = map;
            }
            if (i19 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i22 != 0) {
                iA = t4.t.INSTANCE.a();
            } else {
                iA = i11;
            }
            if (i24 != 0) {
                i29 = Integer.MAX_VALUE;
            } else {
                i29 = i12;
            }
            if (i26 != 0) {
                lVar4 = a.f105128c;
            } else {
                lVar4 = lVar;
            }
            if (o.J()) {
                o.S(-1952998280, i15, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:444)");
            }
            lVarV.H(-1159067030);
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            i31 = i15;
            if (objI == companion.a()) {
                objI = s3.d(null, null, 2, null);
                lVarV.B(objI);
            }
            p1Var = (p1) objI;
            lVarV.T();
            androidx.compose.ui.d.Companion companion16 = androidx.compose.ui.d.INSTANCE;
            lVarV.H(-1159062838);
            if ((i31 & 1879048192) == 536870912) {
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
            lVarV.T();
            androidx.compose.ui.d dVarG15 = dVar4.g(o0.d(companion16, lVar2, (p) objI2));
            lVar5 = lVar4;
            TextStyle textStyleE15 = TextStyle.e(textStyle, j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null);
            lVarV.H(-1159030910);
            if ((i31 & 234881024) == 67108864) {
            }
            objI3 = lVarV.I();
            if (z14) {
                objI3 = new b(p1Var, lVar5);
                lVarV.B(objI3);
            } else {
                objI3 = new b(p1Var, lVar5);
                lVarV.B(objI3);
            }
            lVarV.T();
            Map<String, q> map17 = mapI;
            lVar6 = lVarV;
            int i31112 = i29;
            boolean z1110 = z12;
            int i31113 = iA;
            kotlin.d.a(dVar3, dVarG15, textStyleE15, (wn0.l) objI3, i31113, z1110, i31112, 0, map17, null, lVar6, 134217728 | (i31 & 14) | (57344 & (i31 >> 6)) | (i31 & 458752) | ((i31 >> 3) & 3670016), 640);
            if (o.J()) {
                o.R();
            }
            lVar7 = lVar5;
            dVar5 = dVar4;
            i32 = i31113;
            z15 = z1110;
            i33 = i31112;
            map2 = map17;
        }
        w2VarX = lVar6.x();
        if (w2VarX != null) {
            w2VarX.a(new C2222c(dVar, j11, textStyle, dVar5, map2, z15, i32, i33, lVar7, lVar2, i13, i14));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0165  */
    /* JADX WARN: Code duplicated, block: B:113:0x016a  */
    /* JADX WARN: Code duplicated, block: B:114:0x016f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0173  */
    /* JADX WARN: Code duplicated, block: B:117:0x017a  */
    /* JADX WARN: Code duplicated, block: B:120:0x017f  */
    /* JADX WARN: Code duplicated, block: B:121:0x018c  */
    /* JADX WARN: Code duplicated, block: B:123:0x018f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0192  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:139:0x022c  */
    /* JADX WARN: Code duplicated, block: B:143:0x023e  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0133  */
    public static final void b(String html, androidx.compose.ui.d dVar, Map<String, ? extends q90.b> map, long j11, TextStyle textStyle, boolean z11, SpanStyle spanStyle, int i11, wn0.a<h0> aVar, p020r2.l lVar, int i12, int i13) {
        int i14;
        androidx.compose.ui.d dVar2;
        int i15;
        int i16;
        long j12;
        int i17;
        TextStyle textStyle2;
        int i18;
        int i19;
        boolean z12;
        int i21;
        int i22;
        int i23;
        int iA;
        int i24;
        int i25;
        Map<String, ? extends q90.b> mapI;
        long j13;
        TextStyle textStyle3;
        SpanStyle spanStyle2;
        int i26;
        wn0.a<h0> aVar2;
        androidx.compose.ui.d dVar3;
        boolean z13;
        TextStyle textStyle4;
        int i27;
        long j14;
        SpanStyle spanStyle3;
        SpanStyle spanStyle4;
        wn0.a<h0> aVar3;
        TextStyle textStyle5;
        int i28;
        boolean z14;
        long j15;
        Map<String, ? extends q90.b> map2;
        androidx.compose.ui.d dVar4;
        w2 w2VarX;
        int i29;
        s.k(html, "html");
        p020r2.l lVarV = lVar.v(-9822761);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (lVarV.n(html) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i31 = i13 & 2;
        if (i31 == 0) {
            if ((i12 & 112) == 0) {
                dVar2 = dVar;
                i14 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                i14 |= 128;
            }
            i16 = i13 & 8;
            if (i16 != 0) {
                i14 |= 3072;
                j12 = j11;
            } else {
                j12 = j11;
                if ((i12 & 7168) == 0) {
                    if (lVarV.s(j12)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i14 |= i17;
                }
            }
            if ((i12 & 57344) == 0) {
                if ((i13 & 16) == 0) {
                    textStyle2 = textStyle;
                    if (lVarV.n(textStyle2)) {
                        i29 = 16384;
                    }
                    i14 |= i29;
                } else {
                    textStyle2 = textStyle;
                }
                i29 = PKIFailureInfo.certRevoked;
                i14 |= i29;
            } else {
                textStyle2 = textStyle;
            }
            i18 = i13 & 32;
            if (i18 != 0) {
                i14 |= 196608;
                i19 = 57344;
                z12 = z11;
            } else {
                i19 = 57344;
                z12 = z11;
                if ((i12 & 458752) == 0) {
                    if (lVarV.p(z12)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                }
            }
            i22 = i13 & 64;
            if (i22 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (lVarV.n(spanStyle)) {
                    i23 = PKIFailureInfo.badCertTemplate;
                } else {
                    i23 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i23;
            }
            if ((i12 & 29360128) == 0) {
                if ((i13 & 128) == 0) {
                    iA = i11;
                    int i32 = lVarV.r(iA) ? 8388608 : 4194304;
                    i14 |= i32;
                } else {
                    iA = i11;
                }
                i14 |= i32;
            } else {
                iA = i11;
            }
            i24 = i13 & 256;
            if (i24 != 0) {
                i14 |= 100663296;
            } else if ((i12 & 234881024) != 0) {
                if (lVarV.K(aVar)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i14 |= i25;
            }
            if (i15 != 4 && (191739611 & i14) == 38347922 && lVarV.b()) {
                lVarV.j();
                dVar4 = dVar2;
                z14 = z12;
                j15 = j12;
                textStyle5 = textStyle2;
                spanStyle4 = spanStyle;
                aVar3 = aVar;
                i28 = iA;
                map2 = map;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0 || lVarV.k()) {
                    if (i31 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i16 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i13 & 16) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i14 &= -57345;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i22 != 0) {
                        spanStyle2 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                    } else {
                        spanStyle2 = spanStyle;
                    }
                    if ((i13 & 128) != 0) {
                        iA = i4.x.INSTANCE.a();
                        i14 = (-29360129) & i14;
                    }
                    if (i24 != 0) {
                        i26 = i14;
                        aVar2 = e.f105149c;
                    } else {
                        i26 = i14;
                        aVar2 = aVar;
                    }
                    dVar3 = dVar2;
                    z13 = z12;
                    textStyle4 = textStyle3;
                    i27 = iA;
                    j14 = j13;
                    spanStyle3 = spanStyle2;
                } else {
                    lVarV.j();
                    if ((i13 & 16) != 0) {
                        i14 &= -57345;
                    }
                    if ((i13 & 128) != 0) {
                        i14 &= -29360129;
                    }
                    spanStyle3 = spanStyle;
                    aVar2 = aVar;
                    i26 = i14;
                    i27 = iA;
                    dVar3 = dVar2;
                    j14 = j12;
                    textStyle4 = textStyle2;
                    mapI = map;
                    z13 = z12;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-9822761, i26, -1, "com.stripe.android.uicore.text.Html (Html.kt:234)");
                }
                int i33 = (i26 & 14) | 512 | (i26 & 112) | (i26 & 7168) | (i26 & i19);
                int i34 = i26 >> 3;
                c(html, dVar3, mapI, j14, textStyle4, spanStyle3, i27, new f(z13, aVar2, (Context) lVarV.U(AndroidCompositionLocals_androidKt.g())), lVarV, (i34 & 3670016) | i33 | (i34 & 458752), 0);
                if (o.J()) {
                    o.R();
                }
                spanStyle4 = spanStyle3;
                aVar3 = aVar2;
                textStyle5 = textStyle4;
                i28 = i27;
                z14 = z13;
                j15 = j14;
                map2 = mapI;
                dVar4 = dVar3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new g(html, dVar4, map2, j15, textStyle5, z14, spanStyle4, i28, aVar3, i12, i13));
            }
        }
        i14 |= 48;
        dVar2 = dVar;
        i15 = i13 & 4;
        if (i15 != 0) {
            i14 |= 128;
        }
        i16 = i13 & 8;
        if (i16 != 0) {
            i14 |= 3072;
            j12 = j11;
        } else {
            j12 = j11;
            if ((i12 & 7168) == 0) {
                if (lVarV.s(j12)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i14 |= i17;
            }
        }
        if ((i12 & 57344) == 0) {
            if ((i13 & 16) == 0) {
                textStyle2 = textStyle;
                if (lVarV.n(textStyle2)) {
                    i29 = 16384;
                }
                i14 |= i29;
            } else {
                textStyle2 = textStyle;
            }
            i29 = PKIFailureInfo.certRevoked;
            i14 |= i29;
        } else {
            textStyle2 = textStyle;
        }
        i18 = i13 & 32;
        if (i18 != 0) {
            i14 |= 196608;
            i19 = 57344;
            z12 = z11;
        } else {
            i19 = 57344;
            z12 = z11;
            if ((i12 & 458752) == 0) {
                if (lVarV.p(z12)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i14 |= i21;
            }
        }
        i22 = i13 & 64;
        if (i22 != 0) {
            i14 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (lVarV.n(spanStyle)) {
                i23 = PKIFailureInfo.badCertTemplate;
            } else {
                i23 = PKIFailureInfo.signerNotTrusted;
            }
            i14 |= i23;
        }
        if ((i12 & 29360128) == 0) {
            if ((i13 & 128) == 0) {
                iA = i11;
                if (lVarV.r(iA)) {
                }
                i14 |= i32;
            } else {
                iA = i11;
            }
            i14 |= i32;
        } else {
            iA = i11;
        }
        i24 = i13 & 256;
        if (i24 != 0) {
            i14 |= 100663296;
        } else if ((i12 & 234881024) != 0) {
            if (lVarV.K(aVar)) {
                i25 = 67108864;
            } else {
                i25 = 33554432;
            }
            i14 |= i25;
        }
        if (i15 != 4) {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i31 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i15 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i16 != 0) {
                    j13 = k3.p1.INSTANCE.j();
                } else {
                    j13 = j12;
                }
                if ((i13 & 16) != 0) {
                    textStyle3 = (TextStyle) lVarV.U(v2.e());
                    i14 &= -57345;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i18 != 0) {
                    z12 = true;
                }
                if (i22 != 0) {
                    spanStyle2 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                } else {
                    spanStyle2 = spanStyle;
                }
                if ((i13 & 128) != 0) {
                    iA = i4.x.INSTANCE.a();
                    i14 = (-29360129) & i14;
                }
                if (i24 != 0) {
                    i26 = i14;
                    aVar2 = e.f105149c;
                } else {
                    i26 = i14;
                    aVar2 = aVar;
                }
                dVar3 = dVar2;
                z13 = z12;
                textStyle4 = textStyle3;
                i27 = iA;
                j14 = j13;
                spanStyle3 = spanStyle2;
            } else {
                if (i31 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i15 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i16 != 0) {
                    j13 = k3.p1.INSTANCE.j();
                } else {
                    j13 = j12;
                }
                if ((i13 & 16) != 0) {
                    textStyle3 = (TextStyle) lVarV.U(v2.e());
                    i14 &= -57345;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i18 != 0) {
                    z12 = true;
                }
                if (i22 != 0) {
                    spanStyle2 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                } else {
                    spanStyle2 = spanStyle;
                }
                if ((i13 & 128) != 0) {
                    iA = i4.x.INSTANCE.a();
                    i14 = (-29360129) & i14;
                }
                if (i24 != 0) {
                    i26 = i14;
                    aVar2 = e.f105149c;
                } else {
                    i26 = i14;
                    aVar2 = aVar;
                }
                dVar3 = dVar2;
                z13 = z12;
                textStyle4 = textStyle3;
                i27 = iA;
                j14 = j13;
                spanStyle3 = spanStyle2;
            }
            lVarV.C();
            if (o.J()) {
                o.S(-9822761, i26, -1, "com.stripe.android.uicore.text.Html (Html.kt:234)");
            }
            int i35 = (i26 & 14) | 512 | (i26 & 112) | (i26 & 7168) | (i26 & i19);
            int i36 = i26 >> 3;
            c(html, dVar3, mapI, j14, textStyle4, spanStyle3, i27, new f(z13, aVar2, (Context) lVarV.U(AndroidCompositionLocals_androidKt.g())), lVarV, (i36 & 3670016) | i35 | (i36 & 458752), 0);
            if (o.J()) {
                o.R();
            }
            spanStyle4 = spanStyle3;
            aVar3 = aVar2;
            textStyle5 = textStyle4;
            i28 = i27;
            z14 = z13;
            j15 = j14;
            map2 = mapI;
            dVar4 = dVar3;
        } else {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i31 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i15 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i16 != 0) {
                    j13 = k3.p1.INSTANCE.j();
                } else {
                    j13 = j12;
                }
                if ((i13 & 16) != 0) {
                    textStyle3 = (TextStyle) lVarV.U(v2.e());
                    i14 &= -57345;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i18 != 0) {
                    z12 = true;
                }
                if (i22 != 0) {
                    spanStyle2 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                } else {
                    spanStyle2 = spanStyle;
                }
                if ((i13 & 128) != 0) {
                    iA = i4.x.INSTANCE.a();
                    i14 = (-29360129) & i14;
                }
                if (i24 != 0) {
                    i26 = i14;
                    aVar2 = e.f105149c;
                } else {
                    i26 = i14;
                    aVar2 = aVar;
                }
                dVar3 = dVar2;
                z13 = z12;
                textStyle4 = textStyle3;
                i27 = iA;
                j14 = j13;
                spanStyle3 = spanStyle2;
            } else {
                if (i31 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i15 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i16 != 0) {
                    j13 = k3.p1.INSTANCE.j();
                } else {
                    j13 = j12;
                }
                if ((i13 & 16) != 0) {
                    textStyle3 = (TextStyle) lVarV.U(v2.e());
                    i14 &= -57345;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i18 != 0) {
                    z12 = true;
                }
                if (i22 != 0) {
                    spanStyle2 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                } else {
                    spanStyle2 = spanStyle;
                }
                if ((i13 & 128) != 0) {
                    iA = i4.x.INSTANCE.a();
                    i14 = (-29360129) & i14;
                }
                if (i24 != 0) {
                    i26 = i14;
                    aVar2 = e.f105149c;
                } else {
                    i26 = i14;
                    aVar2 = aVar;
                }
                dVar3 = dVar2;
                z13 = z12;
                textStyle4 = textStyle3;
                i27 = iA;
                j14 = j13;
                spanStyle3 = spanStyle2;
            }
            lVarV.C();
            if (o.J()) {
                o.S(-9822761, i26, -1, "com.stripe.android.uicore.text.Html (Html.kt:234)");
            }
            int i37 = (i26 & 14) | 512 | (i26 & 112) | (i26 & 7168) | (i26 & i19);
            int i38 = i26 >> 3;
            c(html, dVar3, mapI, j14, textStyle4, spanStyle3, i27, new f(z13, aVar2, (Context) lVarV.U(AndroidCompositionLocals_androidKt.g())), lVarV, (i38 & 3670016) | i37 | (i38 & 458752), 0);
            if (o.J()) {
                o.R();
            }
            spanStyle4 = spanStyle3;
            aVar3 = aVar2;
            textStyle5 = textStyle4;
            i28 = i27;
            z14 = z13;
            j15 = j14;
            map2 = mapI;
            dVar4 = dVar3;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new g(html, dVar4, map2, j15, textStyle5, z14, spanStyle4, i28, aVar3, i12, i13));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x012f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x013d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0144  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:111:0x0156  */
    /* JADX WARN: Code duplicated, block: B:113:0x0159  */
    /* JADX WARN: Code duplicated, block: B:114:0x0188  */
    /* JADX WARN: Code duplicated, block: B:117:0x018e  */
    /* JADX WARN: Code duplicated, block: B:118:0x019c  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:128:0x0215  */
    /* JADX WARN: Code duplicated, block: B:132:0x0243  */
    /* JADX WARN: Code duplicated, block: B:139:0x028d  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:152:0x0308  */
    /* JADX WARN: Code duplicated, block: B:155:0x0324  */
    /* JADX WARN: Code duplicated, block: B:158:0x0330  */
    /* JADX WARN: Code duplicated, block: B:160:0x0336  */
    /* JADX WARN: Code duplicated, block: B:164:0x0368  */
    /* JADX WARN: Code duplicated, block: B:168:0x0377  */
    /* JADX WARN: Code duplicated, block: B:171:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x0111  */
    /* JADX WARN: Instruction removed from duplicated block: B:152:0x0308, please report this as an issue */
    public static final void c(String html, androidx.compose.ui.d dVar, Map<String, ? extends q90.b> map, long j11, TextStyle textStyle, SpanStyle spanStyle, int i11, wn0.l<? super List<i4.d.Range<String>>, h0> onClick, p020r2.l lVar, int i12, int i13) {
        int i14;
        androidx.compose.ui.d dVar2;
        int i15;
        int i16;
        long j12;
        int i17;
        TextStyle textStyle2;
        int i18;
        SpanStyle spanStyle2;
        int i19;
        int i21;
        Map<String, ? extends q90.b> mapI;
        long j13;
        TextStyle textStyle3;
        SpanStyle spanStyle3;
        int i22;
        int iA;
        Context context;
        i4.d dVarE;
        Object objI;
        p020r2.l.Companion companion;
        p1 p1Var;
        Object objI2;
        o90.f fVar;
        LinkedHashMap linkedHashMap;
        int i23;
        Map<String, q> mapG;
        LinkedHashMap linkedHashMap2;
        Iterator<Map.Entry<String, ? extends q90.b>> it;
        Map<String, q> mapF;
        Object objI3;
        p020r2.l.Companion companion2;
        int i24;
        Map<String, q> value;
        boolean zN;
        Object objI4;
        p020r2.l lVar2;
        Map<String, ? extends q90.b> map2;
        androidx.compose.ui.d dVar3;
        SpanStyle spanStyle4;
        long j14;
        TextStyle textStyle4;
        Map.Entry<String, ? extends q90.b> next;
        w2 w2VarX;
        int i25;
        int i26;
        s.k(html, "html");
        s.k(onClick, "onClick");
        p020r2.l lVarV = lVar.v(583944314);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (lVarV.n(html) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i27 = i13 & 2;
        if (i27 == 0) {
            if ((i12 & 112) == 0) {
                dVar2 = dVar;
                i14 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                i14 |= 128;
            }
            i16 = i13 & 8;
            if (i16 != 0) {
                if ((i12 & 7168) == 0) {
                    j12 = j11;
                    if (lVarV.s(j12)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i14 |= i17;
                }
                if ((57344 & i12) == 0) {
                    if ((i13 & 16) == 0) {
                        textStyle2 = textStyle;
                        if (lVarV.n(textStyle2)) {
                            i26 = 16384;
                        }
                        i14 |= i26;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i26 = PKIFailureInfo.certRevoked;
                    i14 |= i26;
                } else {
                    textStyle2 = textStyle;
                }
                i18 = i13 & 32;
                if (i18 != 0) {
                    i14 |= 196608;
                    spanStyle2 = spanStyle;
                } else {
                    spanStyle2 = spanStyle;
                    if ((i12 & 458752) == 0) {
                        if (lVarV.n(spanStyle2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i14 |= i19;
                    }
                }
                if ((i12 & 3670016) != 0) {
                    if ((i13 & 64) == 0 || !lVarV.r(i11)) {
                        i25 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i25 = PKIFailureInfo.badCertTemplate;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    if ((i12 & 29360128) == 0) {
                        if (lVarV.K(onClick)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                    }
                    if (i15 != 4 && (23967451 & i14) == 4793490 && lVarV.b()) {
                        lVarV.j();
                        map2 = map;
                        i24 = i11;
                        lVar2 = lVarV;
                        dVar3 = dVar2;
                        spanStyle4 = spanStyle2;
                        textStyle4 = textStyle2;
                        j14 = j12;
                    } else {
                        lVarV.L();
                        if ((i12 & 1) != 0 || lVarV.k()) {
                            if (i27 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i15 != 0) {
                                mapI = v0.i();
                            } else {
                                mapI = map;
                            }
                            if (i16 != 0) {
                                j13 = k3.p1.INSTANCE.j();
                            } else {
                                j13 = j12;
                            }
                            if ((i13 & 16) != 0) {
                                textStyle3 = (TextStyle) lVarV.U(v2.e());
                                i14 &= -57345;
                            } else {
                                textStyle3 = textStyle2;
                            }
                            if (i18 != 0) {
                                spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                            } else {
                                spanStyle3 = spanStyle2;
                            }
                            if ((i13 & 64) != 0) {
                                i22 = i14 & (-3670017);
                                iA = i4.x.INSTANCE.a();
                                textStyle2 = textStyle3;
                                j12 = j13;
                                spanStyle2 = spanStyle3;
                            } else {
                                i22 = i14;
                                textStyle2 = textStyle3;
                                j12 = j13;
                                spanStyle2 = spanStyle3;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                            }
                            context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                            int i28 = i22 >> 9;
                            Map<String, ? extends q90.b> map3 = mapI;
                            dVarE = e(html, map3, spanStyle2, lVarV, (i22 & 14) | 64 | (i28 & 896), 0);
                            lVarV.H(-217733872);
                            objI = lVarV.I();
                            companion = p020r2.l.INSTANCE;
                            if (objI == companion.a()) {
                                objI = s3.d(Boolean.FALSE, null, 2, null);
                                lVarV.B(objI);
                            }
                            p1Var = (p1) objI;
                            lVarV.T();
                            lVarV.H(-217731777);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = new o90.f(context, null, null, null, null, 14, null);
                                lVarV.B(objI2);
                            }
                            fVar = (o90.f) objI2;
                            lVarV.T();
                            linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<String, ? extends q90.b> entry : map3.entrySet()) {
                                fVar = fVar;
                                if (entry.getValue() instanceof q90.b.Drawable) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                    i22 = i22;
                                }
                            }
                            o90.f fVar2 = fVar;
                            i23 = i22;
                            int i29 = ((i23 >> 15) & 112) | 8;
                            mapG = g(linkedHashMap, iA, lVarV, i29);
                            linkedHashMap2 = new LinkedHashMap();
                            it = map3.entrySet().iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                Iterator<Map.Entry<String, ? extends q90.b>> it2 = it;
                                if (next.getValue() instanceof q90.b.Bitmap) {
                                    linkedHashMap2.put(next.getKey(), next.getValue());
                                }
                                it = it2;
                            }
                            mapF = f(linkedHashMap2, iA, lVarV, i29);
                            lVarV.H(-217704547);
                            objI3 = lVarV.I();
                            companion2 = p020r2.l.INSTANCE;
                            if (objI3 == companion2.a()) {
                                objI3 = new k(p1Var);
                                lVarV.B(objI3);
                            }
                            lVarV.T();
                            int i31 = iA;
                            y3<Map<String, q>> y3VarH = h(dVarE, map3, fVar2, i31, (wn0.a) objI3, lVarV, (i28 & 7168) | 25152);
                            i24 = i31;
                            value = y3VarH.getValue();
                            if (!value.isEmpty() || ((Boolean) p1Var.getValue()).booleanValue()) {
                                androidx.compose.ui.d dVarC = g4.o.c(dVar2, true, h.f105164c);
                                Map mapR = v0.r(v0.r(mapG, mapF), value);
                                lVarV.H(-217688304);
                                zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                                objI4 = lVarV.I();
                                if (zN || objI4 == companion2.a()) {
                                    objI4 = new i(onClick, dVarE);
                                    lVarV.B(objI4);
                                }
                                lVarV.T();
                                int i32 = i23 >> 6;
                                lVar2 = lVarV;
                                a(dVarE, j12, textStyle2, dVarC, mapR, false, 0, 0, null, (wn0.l) objI4, lVar2, (i32 & 112) | 32768 | (i32 & 896), 480);
                            } else {
                                lVar2 = lVarV;
                            }
                            if (o.J()) {
                                o.R();
                            }
                            map2 = map3;
                            dVar3 = dVar2;
                            spanStyle4 = spanStyle2;
                            j14 = j12;
                            textStyle4 = textStyle2;
                        } else {
                            lVarV.j();
                            if ((i13 & 16) != 0) {
                                i14 &= -57345;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                            }
                            mapI = map;
                            i22 = i14;
                        }
                        iA = i11;
                        lVarV.C();
                        if (o.J()) {
                            o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                        }
                        context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                        int i210 = i22 >> 9;
                        Map<String, ? extends q90.b> map4 = mapI;
                        dVarE = e(html, map4, spanStyle2, lVarV, (i22 & 14) | 64 | (i210 & 896), 0);
                        lVarV.H(-217733872);
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = s3.d(Boolean.FALSE, null, 2, null);
                            lVarV.B(objI);
                        }
                        p1Var = (p1) objI;
                        lVarV.T();
                        lVarV.H(-217731777);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = new o90.f(context, null, null, null, null, 14, null);
                            lVarV.B(objI2);
                        }
                        fVar = (o90.f) objI2;
                        lVarV.T();
                        linkedHashMap = new LinkedHashMap();
                        while (r6.hasNext()) {
                            fVar = fVar;
                            if (entry.getValue() instanceof q90.b.Drawable) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                                i22 = i22;
                            }
                        }
                        o90.f fVar3 = fVar;
                        i23 = i22;
                        int i211 = ((i23 >> 15) & 112) | 8;
                        mapG = g(linkedHashMap, iA, lVarV, i211);
                        linkedHashMap2 = new LinkedHashMap();
                        it = map4.entrySet().iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            Iterator<Map.Entry<String, ? extends q90.b>> it3 = it;
                            if (next.getValue() instanceof q90.b.Bitmap) {
                                linkedHashMap2.put(next.getKey(), next.getValue());
                            }
                            it = it3;
                        }
                        mapF = f(linkedHashMap2, iA, lVarV, i211);
                        lVarV.H(-217704547);
                        objI3 = lVarV.I();
                        companion2 = p020r2.l.INSTANCE;
                        if (objI3 == companion2.a()) {
                            objI3 = new k(p1Var);
                            lVarV.B(objI3);
                        }
                        lVarV.T();
                        int i33 = iA;
                        y3<Map<String, q>> y3VarH2 = h(dVarE, map4, fVar3, i33, (wn0.a) objI3, lVarV, (i210 & 7168) | 25152);
                        i24 = i33;
                        value = y3VarH2.getValue();
                        if (value.isEmpty()) {
                            androidx.compose.ui.d dVarC2 = g4.o.c(dVar2, true, h.f105164c);
                            Map mapR2 = v0.r(v0.r(mapG, mapF), value);
                            lVarV.H(-217688304);
                            zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                            objI4 = lVarV.I();
                            if (zN) {
                                objI4 = new i(onClick, dVarE);
                                lVarV.B(objI4);
                            } else {
                                objI4 = new i(onClick, dVarE);
                                lVarV.B(objI4);
                            }
                            lVarV.T();
                            int i34 = i23 >> 6;
                            lVar2 = lVarV;
                            a(dVarE, j12, textStyle2, dVarC2, mapR2, false, 0, 0, null, (wn0.l) objI4, lVar2, (i34 & 112) | 32768 | (i34 & 896), 480);
                        } else {
                            androidx.compose.ui.d dVarC3 = g4.o.c(dVar2, true, h.f105164c);
                            Map mapR3 = v0.r(v0.r(mapG, mapF), value);
                            lVarV.H(-217688304);
                            zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                            objI4 = lVarV.I();
                            if (zN) {
                                objI4 = new i(onClick, dVarE);
                                lVarV.B(objI4);
                            } else {
                                objI4 = new i(onClick, dVarE);
                                lVarV.B(objI4);
                            }
                            lVarV.T();
                            int i35 = i23 >> 6;
                            lVar2 = lVarV;
                            a(dVarE, j12, textStyle2, dVarC3, mapR3, false, 0, 0, null, (wn0.l) objI4, lVar2, (i35 & 112) | 32768 | (i35 & 896), 480);
                        }
                        if (o.J()) {
                            o.R();
                        }
                        map2 = map4;
                        dVar3 = dVar2;
                        spanStyle4 = spanStyle2;
                        j14 = j12;
                        textStyle4 = textStyle2;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new j(html, dVar3, map2, j14, textStyle4, spanStyle4, i24, onClick, i12, i13));
                    }
                }
                i21 = 12582912;
                i14 |= i21;
                if (i15 != 4) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i27 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i15 != 0) {
                            mapI = v0.i();
                        } else {
                            mapI = map;
                        }
                        if (i16 != 0) {
                            j13 = k3.p1.INSTANCE.j();
                        } else {
                            j13 = j12;
                        }
                        if ((i13 & 16) != 0) {
                            textStyle3 = (TextStyle) lVarV.U(v2.e());
                            i14 &= -57345;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i18 != 0) {
                            spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                        } else {
                            spanStyle3 = spanStyle2;
                        }
                        if ((i13 & 64) != 0) {
                            i22 = i14 & (-3670017);
                            iA = i4.x.INSTANCE.a();
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                        } else {
                            i22 = i14;
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                            iA = i11;
                        }
                    } else {
                        if (i27 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i15 != 0) {
                            mapI = v0.i();
                        } else {
                            mapI = map;
                        }
                        if (i16 != 0) {
                            j13 = k3.p1.INSTANCE.j();
                        } else {
                            j13 = j12;
                        }
                        if ((i13 & 16) != 0) {
                            textStyle3 = (TextStyle) lVarV.U(v2.e());
                            i14 &= -57345;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i18 != 0) {
                            spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                        } else {
                            spanStyle3 = spanStyle2;
                        }
                        if ((i13 & 64) != 0) {
                            i22 = i14 & (-3670017);
                            iA = i4.x.INSTANCE.a();
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                        } else {
                            i22 = i14;
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                            iA = i11;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                    }
                    context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                    int i212 = i22 >> 9;
                    Map<String, ? extends q90.b> map5 = mapI;
                    dVarE = e(html, map5, spanStyle2, lVarV, (i22 & 14) | 64 | (i212 & 896), 0);
                    lVarV.H(-217733872);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(Boolean.FALSE, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    lVarV.T();
                    lVarV.H(-217731777);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = new o90.f(context, null, null, null, null, 14, null);
                        lVarV.B(objI2);
                    }
                    fVar = (o90.f) objI2;
                    lVarV.T();
                    linkedHashMap = new LinkedHashMap();
                    while (r6.hasNext()) {
                        fVar = fVar;
                        if (entry.getValue() instanceof q90.b.Drawable) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            i22 = i22;
                        }
                    }
                    o90.f fVar4 = fVar;
                    i23 = i22;
                    int i213 = ((i23 >> 15) & 112) | 8;
                    mapG = g(linkedHashMap, iA, lVarV, i213);
                    linkedHashMap2 = new LinkedHashMap();
                    it = map5.entrySet().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        Iterator<Map.Entry<String, ? extends q90.b>> it4 = it;
                        if (next.getValue() instanceof q90.b.Bitmap) {
                            linkedHashMap2.put(next.getKey(), next.getValue());
                        }
                        it = it4;
                    }
                    mapF = f(linkedHashMap2, iA, lVarV, i213);
                    lVarV.H(-217704547);
                    objI3 = lVarV.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI3 == companion2.a()) {
                        objI3 = new k(p1Var);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    int i36 = iA;
                    y3<Map<String, q>> y3VarH3 = h(dVarE, map5, fVar4, i36, (wn0.a) objI3, lVarV, (i212 & 7168) | 25152);
                    i24 = i36;
                    value = y3VarH3.getValue();
                    if (value.isEmpty()) {
                        androidx.compose.ui.d dVarC4 = g4.o.c(dVar2, true, h.f105164c);
                        Map mapR4 = v0.r(v0.r(mapG, mapF), value);
                        lVarV.H(-217688304);
                        zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                        objI4 = lVarV.I();
                        if (zN) {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        }
                        lVarV.T();
                        int i37 = i23 >> 6;
                        lVar2 = lVarV;
                        a(dVarE, j12, textStyle2, dVarC4, mapR4, false, 0, 0, null, (wn0.l) objI4, lVar2, (i37 & 112) | 32768 | (i37 & 896), 480);
                    } else {
                        androidx.compose.ui.d dVarC5 = g4.o.c(dVar2, true, h.f105164c);
                        Map mapR5 = v0.r(v0.r(mapG, mapF), value);
                        lVarV.H(-217688304);
                        zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                        objI4 = lVarV.I();
                        if (zN) {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        }
                        lVarV.T();
                        int i38 = i23 >> 6;
                        lVar2 = lVarV;
                        a(dVarE, j12, textStyle2, dVarC5, mapR5, false, 0, 0, null, (wn0.l) objI4, lVar2, (i38 & 112) | 32768 | (i38 & 896), 480);
                    }
                    if (o.J()) {
                        o.R();
                    }
                    map2 = map5;
                    dVar3 = dVar2;
                    spanStyle4 = spanStyle2;
                    j14 = j12;
                    textStyle4 = textStyle2;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i27 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i15 != 0) {
                            mapI = v0.i();
                        } else {
                            mapI = map;
                        }
                        if (i16 != 0) {
                            j13 = k3.p1.INSTANCE.j();
                        } else {
                            j13 = j12;
                        }
                        if ((i13 & 16) != 0) {
                            textStyle3 = (TextStyle) lVarV.U(v2.e());
                            i14 &= -57345;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i18 != 0) {
                            spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                        } else {
                            spanStyle3 = spanStyle2;
                        }
                        if ((i13 & 64) != 0) {
                            i22 = i14 & (-3670017);
                            iA = i4.x.INSTANCE.a();
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                        } else {
                            i22 = i14;
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                            iA = i11;
                        }
                    } else {
                        if (i27 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i15 != 0) {
                            mapI = v0.i();
                        } else {
                            mapI = map;
                        }
                        if (i16 != 0) {
                            j13 = k3.p1.INSTANCE.j();
                        } else {
                            j13 = j12;
                        }
                        if ((i13 & 16) != 0) {
                            textStyle3 = (TextStyle) lVarV.U(v2.e());
                            i14 &= -57345;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i18 != 0) {
                            spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                        } else {
                            spanStyle3 = spanStyle2;
                        }
                        if ((i13 & 64) != 0) {
                            i22 = i14 & (-3670017);
                            iA = i4.x.INSTANCE.a();
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                        } else {
                            i22 = i14;
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                            iA = i11;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                    }
                    context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                    int i214 = i22 >> 9;
                    Map<String, ? extends q90.b> map6 = mapI;
                    dVarE = e(html, map6, spanStyle2, lVarV, (i22 & 14) | 64 | (i214 & 896), 0);
                    lVarV.H(-217733872);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(Boolean.FALSE, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    lVarV.T();
                    lVarV.H(-217731777);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = new o90.f(context, null, null, null, null, 14, null);
                        lVarV.B(objI2);
                    }
                    fVar = (o90.f) objI2;
                    lVarV.T();
                    linkedHashMap = new LinkedHashMap();
                    while (r6.hasNext()) {
                        fVar = fVar;
                        if (entry.getValue() instanceof q90.b.Drawable) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            i22 = i22;
                        }
                    }
                    o90.f fVar5 = fVar;
                    i23 = i22;
                    int i215 = ((i23 >> 15) & 112) | 8;
                    mapG = g(linkedHashMap, iA, lVarV, i215);
                    linkedHashMap2 = new LinkedHashMap();
                    it = map6.entrySet().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        Iterator<Map.Entry<String, ? extends q90.b>> it5 = it;
                        if (next.getValue() instanceof q90.b.Bitmap) {
                            linkedHashMap2.put(next.getKey(), next.getValue());
                        }
                        it = it5;
                    }
                    mapF = f(linkedHashMap2, iA, lVarV, i215);
                    lVarV.H(-217704547);
                    objI3 = lVarV.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI3 == companion2.a()) {
                        objI3 = new k(p1Var);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    int i39 = iA;
                    y3<Map<String, q>> y3VarH4 = h(dVarE, map6, fVar5, i39, (wn0.a) objI3, lVarV, (i214 & 7168) | 25152);
                    i24 = i39;
                    value = y3VarH4.getValue();
                    if (value.isEmpty()) {
                        androidx.compose.ui.d dVarC6 = g4.o.c(dVar2, true, h.f105164c);
                        Map mapR6 = v0.r(v0.r(mapG, mapF), value);
                        lVarV.H(-217688304);
                        zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                        objI4 = lVarV.I();
                        if (zN) {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        }
                        lVarV.T();
                        int i310 = i23 >> 6;
                        lVar2 = lVarV;
                        a(dVarE, j12, textStyle2, dVarC6, mapR6, false, 0, 0, null, (wn0.l) objI4, lVar2, (i310 & 112) | 32768 | (i310 & 896), 480);
                    } else {
                        androidx.compose.ui.d dVarC7 = g4.o.c(dVar2, true, h.f105164c);
                        Map mapR7 = v0.r(v0.r(mapG, mapF), value);
                        lVarV.H(-217688304);
                        zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                        objI4 = lVarV.I();
                        if (zN) {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        }
                        lVarV.T();
                        int i311 = i23 >> 6;
                        lVar2 = lVarV;
                        a(dVarE, j12, textStyle2, dVarC7, mapR7, false, 0, 0, null, (wn0.l) objI4, lVar2, (i311 & 112) | 32768 | (i311 & 896), 480);
                    }
                    if (o.J()) {
                        o.R();
                    }
                    map2 = map6;
                    dVar3 = dVar2;
                    spanStyle4 = spanStyle2;
                    j14 = j12;
                    textStyle4 = textStyle2;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new j(html, dVar3, map2, j14, textStyle4, spanStyle4, i24, onClick, i12, i13));
                }
            }
            i14 |= 3072;
            j12 = j11;
            if ((57344 & i12) == 0) {
                if ((i13 & 16) == 0) {
                    textStyle2 = textStyle;
                    if (lVarV.n(textStyle2)) {
                        i26 = 16384;
                    }
                    i14 |= i26;
                } else {
                    textStyle2 = textStyle;
                }
                i26 = PKIFailureInfo.certRevoked;
                i14 |= i26;
            } else {
                textStyle2 = textStyle;
            }
            i18 = i13 & 32;
            if (i18 != 0) {
                i14 |= 196608;
                spanStyle2 = spanStyle;
            } else {
                spanStyle2 = spanStyle;
                if ((i12 & 458752) == 0) {
                    if (lVarV.n(spanStyle2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i14 |= i19;
                }
            }
            if ((i12 & 3670016) != 0) {
                if ((i13 & 64) == 0) {
                    i25 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i25 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                if ((i12 & 29360128) == 0) {
                    if (lVarV.K(onClick)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                }
                if (i15 != 4) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i27 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i15 != 0) {
                            mapI = v0.i();
                        } else {
                            mapI = map;
                        }
                        if (i16 != 0) {
                            j13 = k3.p1.INSTANCE.j();
                        } else {
                            j13 = j12;
                        }
                        if ((i13 & 16) != 0) {
                            textStyle3 = (TextStyle) lVarV.U(v2.e());
                            i14 &= -57345;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i18 != 0) {
                            spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                        } else {
                            spanStyle3 = spanStyle2;
                        }
                        if ((i13 & 64) != 0) {
                            i22 = i14 & (-3670017);
                            iA = i4.x.INSTANCE.a();
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                        } else {
                            i22 = i14;
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                            iA = i11;
                        }
                    } else {
                        if (i27 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i15 != 0) {
                            mapI = v0.i();
                        } else {
                            mapI = map;
                        }
                        if (i16 != 0) {
                            j13 = k3.p1.INSTANCE.j();
                        } else {
                            j13 = j12;
                        }
                        if ((i13 & 16) != 0) {
                            textStyle3 = (TextStyle) lVarV.U(v2.e());
                            i14 &= -57345;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i18 != 0) {
                            spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                        } else {
                            spanStyle3 = spanStyle2;
                        }
                        if ((i13 & 64) != 0) {
                            i22 = i14 & (-3670017);
                            iA = i4.x.INSTANCE.a();
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                        } else {
                            i22 = i14;
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                            iA = i11;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                    }
                    context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                    int i216 = i22 >> 9;
                    Map<String, ? extends q90.b> map7 = mapI;
                    dVarE = e(html, map7, spanStyle2, lVarV, (i22 & 14) | 64 | (i216 & 896), 0);
                    lVarV.H(-217733872);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(Boolean.FALSE, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    lVarV.T();
                    lVarV.H(-217731777);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = new o90.f(context, null, null, null, null, 14, null);
                        lVarV.B(objI2);
                    }
                    fVar = (o90.f) objI2;
                    lVarV.T();
                    linkedHashMap = new LinkedHashMap();
                    while (r6.hasNext()) {
                        fVar = fVar;
                        if (entry.getValue() instanceof q90.b.Drawable) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            i22 = i22;
                        }
                    }
                    o90.f fVar6 = fVar;
                    i23 = i22;
                    int i217 = ((i23 >> 15) & 112) | 8;
                    mapG = g(linkedHashMap, iA, lVarV, i217);
                    linkedHashMap2 = new LinkedHashMap();
                    it = map7.entrySet().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        Iterator<Map.Entry<String, ? extends q90.b>> it6 = it;
                        if (next.getValue() instanceof q90.b.Bitmap) {
                            linkedHashMap2.put(next.getKey(), next.getValue());
                        }
                        it = it6;
                    }
                    mapF = f(linkedHashMap2, iA, lVarV, i217);
                    lVarV.H(-217704547);
                    objI3 = lVarV.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI3 == companion2.a()) {
                        objI3 = new k(p1Var);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    int i312 = iA;
                    y3<Map<String, q>> y3VarH5 = h(dVarE, map7, fVar6, i312, (wn0.a) objI3, lVarV, (i216 & 7168) | 25152);
                    i24 = i312;
                    value = y3VarH5.getValue();
                    if (value.isEmpty()) {
                        androidx.compose.ui.d dVarC8 = g4.o.c(dVar2, true, h.f105164c);
                        Map mapR8 = v0.r(v0.r(mapG, mapF), value);
                        lVarV.H(-217688304);
                        zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                        objI4 = lVarV.I();
                        if (zN) {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        }
                        lVarV.T();
                        int i313 = i23 >> 6;
                        lVar2 = lVarV;
                        a(dVarE, j12, textStyle2, dVarC8, mapR8, false, 0, 0, null, (wn0.l) objI4, lVar2, (i313 & 112) | 32768 | (i313 & 896), 480);
                    } else {
                        androidx.compose.ui.d dVarC9 = g4.o.c(dVar2, true, h.f105164c);
                        Map mapR9 = v0.r(v0.r(mapG, mapF), value);
                        lVarV.H(-217688304);
                        zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                        objI4 = lVarV.I();
                        if (zN) {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        }
                        lVarV.T();
                        int i314 = i23 >> 6;
                        lVar2 = lVarV;
                        a(dVarE, j12, textStyle2, dVarC9, mapR9, false, 0, 0, null, (wn0.l) objI4, lVar2, (i314 & 112) | 32768 | (i314 & 896), 480);
                    }
                    if (o.J()) {
                        o.R();
                    }
                    map2 = map7;
                    dVar3 = dVar2;
                    spanStyle4 = spanStyle2;
                    j14 = j12;
                    textStyle4 = textStyle2;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i27 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i15 != 0) {
                            mapI = v0.i();
                        } else {
                            mapI = map;
                        }
                        if (i16 != 0) {
                            j13 = k3.p1.INSTANCE.j();
                        } else {
                            j13 = j12;
                        }
                        if ((i13 & 16) != 0) {
                            textStyle3 = (TextStyle) lVarV.U(v2.e());
                            i14 &= -57345;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i18 != 0) {
                            spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                        } else {
                            spanStyle3 = spanStyle2;
                        }
                        if ((i13 & 64) != 0) {
                            i22 = i14 & (-3670017);
                            iA = i4.x.INSTANCE.a();
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                        } else {
                            i22 = i14;
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                            iA = i11;
                        }
                    } else {
                        if (i27 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i15 != 0) {
                            mapI = v0.i();
                        } else {
                            mapI = map;
                        }
                        if (i16 != 0) {
                            j13 = k3.p1.INSTANCE.j();
                        } else {
                            j13 = j12;
                        }
                        if ((i13 & 16) != 0) {
                            textStyle3 = (TextStyle) lVarV.U(v2.e());
                            i14 &= -57345;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i18 != 0) {
                            spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                        } else {
                            spanStyle3 = spanStyle2;
                        }
                        if ((i13 & 64) != 0) {
                            i22 = i14 & (-3670017);
                            iA = i4.x.INSTANCE.a();
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                        } else {
                            i22 = i14;
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                            iA = i11;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                    }
                    context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                    int i218 = i22 >> 9;
                    Map<String, ? extends q90.b> map8 = mapI;
                    dVarE = e(html, map8, spanStyle2, lVarV, (i22 & 14) | 64 | (i218 & 896), 0);
                    lVarV.H(-217733872);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(Boolean.FALSE, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    lVarV.T();
                    lVarV.H(-217731777);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = new o90.f(context, null, null, null, null, 14, null);
                        lVarV.B(objI2);
                    }
                    fVar = (o90.f) objI2;
                    lVarV.T();
                    linkedHashMap = new LinkedHashMap();
                    while (r6.hasNext()) {
                        fVar = fVar;
                        if (entry.getValue() instanceof q90.b.Drawable) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            i22 = i22;
                        }
                    }
                    o90.f fVar7 = fVar;
                    i23 = i22;
                    int i219 = ((i23 >> 15) & 112) | 8;
                    mapG = g(linkedHashMap, iA, lVarV, i219);
                    linkedHashMap2 = new LinkedHashMap();
                    it = map8.entrySet().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        Iterator<Map.Entry<String, ? extends q90.b>> it7 = it;
                        if (next.getValue() instanceof q90.b.Bitmap) {
                            linkedHashMap2.put(next.getKey(), next.getValue());
                        }
                        it = it7;
                    }
                    mapF = f(linkedHashMap2, iA, lVarV, i219);
                    lVarV.H(-217704547);
                    objI3 = lVarV.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI3 == companion2.a()) {
                        objI3 = new k(p1Var);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    int i315 = iA;
                    y3<Map<String, q>> y3VarH6 = h(dVarE, map8, fVar7, i315, (wn0.a) objI3, lVarV, (i218 & 7168) | 25152);
                    i24 = i315;
                    value = y3VarH6.getValue();
                    if (value.isEmpty()) {
                        androidx.compose.ui.d dVarC10 = g4.o.c(dVar2, true, h.f105164c);
                        Map mapR10 = v0.r(v0.r(mapG, mapF), value);
                        lVarV.H(-217688304);
                        zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                        objI4 = lVarV.I();
                        if (zN) {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        }
                        lVarV.T();
                        int i316 = i23 >> 6;
                        lVar2 = lVarV;
                        a(dVarE, j12, textStyle2, dVarC10, mapR10, false, 0, 0, null, (wn0.l) objI4, lVar2, (i316 & 112) | 32768 | (i316 & 896), 480);
                    } else {
                        androidx.compose.ui.d dVarC11 = g4.o.c(dVar2, true, h.f105164c);
                        Map mapR11 = v0.r(v0.r(mapG, mapF), value);
                        lVarV.H(-217688304);
                        zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                        objI4 = lVarV.I();
                        if (zN) {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        }
                        lVarV.T();
                        int i317 = i23 >> 6;
                        lVar2 = lVarV;
                        a(dVarE, j12, textStyle2, dVarC11, mapR11, false, 0, 0, null, (wn0.l) objI4, lVar2, (i317 & 112) | 32768 | (i317 & 896), 480);
                    }
                    if (o.J()) {
                        o.R();
                    }
                    map2 = map8;
                    dVar3 = dVar2;
                    spanStyle4 = spanStyle2;
                    j14 = j12;
                    textStyle4 = textStyle2;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new j(html, dVar3, map2, j14, textStyle4, spanStyle4, i24, onClick, i12, i13));
                }
            }
            i21 = 12582912;
            i14 |= i21;
            if (i15 != 4) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i27 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i16 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i13 & 16) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i14 &= -57345;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i18 != 0) {
                        spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                    } else {
                        spanStyle3 = spanStyle2;
                    }
                    if ((i13 & 64) != 0) {
                        i22 = i14 & (-3670017);
                        iA = i4.x.INSTANCE.a();
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                    } else {
                        i22 = i14;
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                        iA = i11;
                    }
                } else {
                    if (i27 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i16 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i13 & 16) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i14 &= -57345;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i18 != 0) {
                        spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                    } else {
                        spanStyle3 = spanStyle2;
                    }
                    if ((i13 & 64) != 0) {
                        i22 = i14 & (-3670017);
                        iA = i4.x.INSTANCE.a();
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                    } else {
                        i22 = i14;
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                        iA = i11;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                }
                context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                int i2110 = i22 >> 9;
                Map<String, ? extends q90.b> map9 = mapI;
                dVarE = e(html, map9, spanStyle2, lVarV, (i22 & 14) | 64 | (i2110 & 896), 0);
                lVarV.H(-217733872);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                lVarV.H(-217731777);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = new o90.f(context, null, null, null, null, 14, null);
                    lVarV.B(objI2);
                }
                fVar = (o90.f) objI2;
                lVarV.T();
                linkedHashMap = new LinkedHashMap();
                while (r6.hasNext()) {
                    fVar = fVar;
                    if (entry.getValue() instanceof q90.b.Drawable) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        i22 = i22;
                    }
                }
                o90.f fVar8 = fVar;
                i23 = i22;
                int i2111 = ((i23 >> 15) & 112) | 8;
                mapG = g(linkedHashMap, iA, lVarV, i2111);
                linkedHashMap2 = new LinkedHashMap();
                it = map9.entrySet().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    Iterator<Map.Entry<String, ? extends q90.b>> it8 = it;
                    if (next.getValue() instanceof q90.b.Bitmap) {
                        linkedHashMap2.put(next.getKey(), next.getValue());
                    }
                    it = it8;
                }
                mapF = f(linkedHashMap2, iA, lVarV, i2111);
                lVarV.H(-217704547);
                objI3 = lVarV.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI3 == companion2.a()) {
                    objI3 = new k(p1Var);
                    lVarV.B(objI3);
                }
                lVarV.T();
                int i318 = iA;
                y3<Map<String, q>> y3VarH7 = h(dVarE, map9, fVar8, i318, (wn0.a) objI3, lVarV, (i2110 & 7168) | 25152);
                i24 = i318;
                value = y3VarH7.getValue();
                if (value.isEmpty()) {
                    androidx.compose.ui.d dVarC12 = g4.o.c(dVar2, true, h.f105164c);
                    Map mapR12 = v0.r(v0.r(mapG, mapF), value);
                    lVarV.H(-217688304);
                    zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                    objI4 = lVarV.I();
                    if (zN) {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    }
                    lVarV.T();
                    int i319 = i23 >> 6;
                    lVar2 = lVarV;
                    a(dVarE, j12, textStyle2, dVarC12, mapR12, false, 0, 0, null, (wn0.l) objI4, lVar2, (i319 & 112) | 32768 | (i319 & 896), 480);
                } else {
                    androidx.compose.ui.d dVarC13 = g4.o.c(dVar2, true, h.f105164c);
                    Map mapR13 = v0.r(v0.r(mapG, mapF), value);
                    lVarV.H(-217688304);
                    zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                    objI4 = lVarV.I();
                    if (zN) {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    }
                    lVarV.T();
                    int i3110 = i23 >> 6;
                    lVar2 = lVarV;
                    a(dVarE, j12, textStyle2, dVarC13, mapR13, false, 0, 0, null, (wn0.l) objI4, lVar2, (i3110 & 112) | 32768 | (i3110 & 896), 480);
                }
                if (o.J()) {
                    o.R();
                }
                map2 = map9;
                dVar3 = dVar2;
                spanStyle4 = spanStyle2;
                j14 = j12;
                textStyle4 = textStyle2;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i27 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i16 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i13 & 16) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i14 &= -57345;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i18 != 0) {
                        spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                    } else {
                        spanStyle3 = spanStyle2;
                    }
                    if ((i13 & 64) != 0) {
                        i22 = i14 & (-3670017);
                        iA = i4.x.INSTANCE.a();
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                    } else {
                        i22 = i14;
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                        iA = i11;
                    }
                } else {
                    if (i27 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i16 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i13 & 16) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i14 &= -57345;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i18 != 0) {
                        spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                    } else {
                        spanStyle3 = spanStyle2;
                    }
                    if ((i13 & 64) != 0) {
                        i22 = i14 & (-3670017);
                        iA = i4.x.INSTANCE.a();
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                    } else {
                        i22 = i14;
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                        iA = i11;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                }
                context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                int i2112 = i22 >> 9;
                Map<String, ? extends q90.b> map10 = mapI;
                dVarE = e(html, map10, spanStyle2, lVarV, (i22 & 14) | 64 | (i2112 & 896), 0);
                lVarV.H(-217733872);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                lVarV.H(-217731777);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = new o90.f(context, null, null, null, null, 14, null);
                    lVarV.B(objI2);
                }
                fVar = (o90.f) objI2;
                lVarV.T();
                linkedHashMap = new LinkedHashMap();
                while (r6.hasNext()) {
                    fVar = fVar;
                    if (entry.getValue() instanceof q90.b.Drawable) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        i22 = i22;
                    }
                }
                o90.f fVar9 = fVar;
                i23 = i22;
                int i2113 = ((i23 >> 15) & 112) | 8;
                mapG = g(linkedHashMap, iA, lVarV, i2113);
                linkedHashMap2 = new LinkedHashMap();
                it = map10.entrySet().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    Iterator<Map.Entry<String, ? extends q90.b>> it9 = it;
                    if (next.getValue() instanceof q90.b.Bitmap) {
                        linkedHashMap2.put(next.getKey(), next.getValue());
                    }
                    it = it9;
                }
                mapF = f(linkedHashMap2, iA, lVarV, i2113);
                lVarV.H(-217704547);
                objI3 = lVarV.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI3 == companion2.a()) {
                    objI3 = new k(p1Var);
                    lVarV.B(objI3);
                }
                lVarV.T();
                int i3111 = iA;
                y3<Map<String, q>> y3VarH8 = h(dVarE, map10, fVar9, i3111, (wn0.a) objI3, lVarV, (i2112 & 7168) | 25152);
                i24 = i3111;
                value = y3VarH8.getValue();
                if (value.isEmpty()) {
                    androidx.compose.ui.d dVarC14 = g4.o.c(dVar2, true, h.f105164c);
                    Map mapR14 = v0.r(v0.r(mapG, mapF), value);
                    lVarV.H(-217688304);
                    zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                    objI4 = lVarV.I();
                    if (zN) {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    }
                    lVarV.T();
                    int i3112 = i23 >> 6;
                    lVar2 = lVarV;
                    a(dVarE, j12, textStyle2, dVarC14, mapR14, false, 0, 0, null, (wn0.l) objI4, lVar2, (i3112 & 112) | 32768 | (i3112 & 896), 480);
                } else {
                    androidx.compose.ui.d dVarC15 = g4.o.c(dVar2, true, h.f105164c);
                    Map mapR15 = v0.r(v0.r(mapG, mapF), value);
                    lVarV.H(-217688304);
                    zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                    objI4 = lVarV.I();
                    if (zN) {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    }
                    lVarV.T();
                    int i3113 = i23 >> 6;
                    lVar2 = lVarV;
                    a(dVarE, j12, textStyle2, dVarC15, mapR15, false, 0, 0, null, (wn0.l) objI4, lVar2, (i3113 & 112) | 32768 | (i3113 & 896), 480);
                }
                if (o.J()) {
                    o.R();
                }
                map2 = map10;
                dVar3 = dVar2;
                spanStyle4 = spanStyle2;
                j14 = j12;
                textStyle4 = textStyle2;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new j(html, dVar3, map2, j14, textStyle4, spanStyle4, i24, onClick, i12, i13));
            }
        }
        i14 |= 48;
        dVar2 = dVar;
        i15 = i13 & 4;
        if (i15 != 0) {
            i14 |= 128;
        }
        i16 = i13 & 8;
        if (i16 != 0) {
            if ((i12 & 7168) == 0) {
                j12 = j11;
                if (lVarV.s(j12)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i14 |= i17;
            }
            if ((57344 & i12) == 0) {
                if ((i13 & 16) == 0) {
                    textStyle2 = textStyle;
                    if (lVarV.n(textStyle2)) {
                        i26 = 16384;
                    }
                    i14 |= i26;
                } else {
                    textStyle2 = textStyle;
                }
                i26 = PKIFailureInfo.certRevoked;
                i14 |= i26;
            } else {
                textStyle2 = textStyle;
            }
            i18 = i13 & 32;
            if (i18 != 0) {
                i14 |= 196608;
                spanStyle2 = spanStyle;
            } else {
                spanStyle2 = spanStyle;
                if ((i12 & 458752) == 0) {
                    if (lVarV.n(spanStyle2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i14 |= i19;
                }
            }
            if ((i12 & 3670016) != 0) {
                if ((i13 & 64) == 0) {
                    i25 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i25 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                if ((i12 & 29360128) == 0) {
                    if (lVarV.K(onClick)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                }
                if (i15 != 4) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i27 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i15 != 0) {
                            mapI = v0.i();
                        } else {
                            mapI = map;
                        }
                        if (i16 != 0) {
                            j13 = k3.p1.INSTANCE.j();
                        } else {
                            j13 = j12;
                        }
                        if ((i13 & 16) != 0) {
                            textStyle3 = (TextStyle) lVarV.U(v2.e());
                            i14 &= -57345;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i18 != 0) {
                            spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                        } else {
                            spanStyle3 = spanStyle2;
                        }
                        if ((i13 & 64) != 0) {
                            i22 = i14 & (-3670017);
                            iA = i4.x.INSTANCE.a();
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                        } else {
                            i22 = i14;
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                            iA = i11;
                        }
                    } else {
                        if (i27 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i15 != 0) {
                            mapI = v0.i();
                        } else {
                            mapI = map;
                        }
                        if (i16 != 0) {
                            j13 = k3.p1.INSTANCE.j();
                        } else {
                            j13 = j12;
                        }
                        if ((i13 & 16) != 0) {
                            textStyle3 = (TextStyle) lVarV.U(v2.e());
                            i14 &= -57345;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i18 != 0) {
                            spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                        } else {
                            spanStyle3 = spanStyle2;
                        }
                        if ((i13 & 64) != 0) {
                            i22 = i14 & (-3670017);
                            iA = i4.x.INSTANCE.a();
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                        } else {
                            i22 = i14;
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                            iA = i11;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                    }
                    context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                    int i2114 = i22 >> 9;
                    Map<String, ? extends q90.b> map11 = mapI;
                    dVarE = e(html, map11, spanStyle2, lVarV, (i22 & 14) | 64 | (i2114 & 896), 0);
                    lVarV.H(-217733872);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(Boolean.FALSE, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    lVarV.T();
                    lVarV.H(-217731777);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = new o90.f(context, null, null, null, null, 14, null);
                        lVarV.B(objI2);
                    }
                    fVar = (o90.f) objI2;
                    lVarV.T();
                    linkedHashMap = new LinkedHashMap();
                    while (r6.hasNext()) {
                        fVar = fVar;
                        if (entry.getValue() instanceof q90.b.Drawable) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            i22 = i22;
                        }
                    }
                    o90.f fVar10 = fVar;
                    i23 = i22;
                    int i2115 = ((i23 >> 15) & 112) | 8;
                    mapG = g(linkedHashMap, iA, lVarV, i2115);
                    linkedHashMap2 = new LinkedHashMap();
                    it = map11.entrySet().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        Iterator<Map.Entry<String, ? extends q90.b>> it10 = it;
                        if (next.getValue() instanceof q90.b.Bitmap) {
                            linkedHashMap2.put(next.getKey(), next.getValue());
                        }
                        it = it10;
                    }
                    mapF = f(linkedHashMap2, iA, lVarV, i2115);
                    lVarV.H(-217704547);
                    objI3 = lVarV.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI3 == companion2.a()) {
                        objI3 = new k(p1Var);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    int i3114 = iA;
                    y3<Map<String, q>> y3VarH9 = h(dVarE, map11, fVar10, i3114, (wn0.a) objI3, lVarV, (i2114 & 7168) | 25152);
                    i24 = i3114;
                    value = y3VarH9.getValue();
                    if (value.isEmpty()) {
                        androidx.compose.ui.d dVarC16 = g4.o.c(dVar2, true, h.f105164c);
                        Map mapR16 = v0.r(v0.r(mapG, mapF), value);
                        lVarV.H(-217688304);
                        zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                        objI4 = lVarV.I();
                        if (zN) {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        }
                        lVarV.T();
                        int i3115 = i23 >> 6;
                        lVar2 = lVarV;
                        a(dVarE, j12, textStyle2, dVarC16, mapR16, false, 0, 0, null, (wn0.l) objI4, lVar2, (i3115 & 112) | 32768 | (i3115 & 896), 480);
                    } else {
                        androidx.compose.ui.d dVarC17 = g4.o.c(dVar2, true, h.f105164c);
                        Map mapR17 = v0.r(v0.r(mapG, mapF), value);
                        lVarV.H(-217688304);
                        zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                        objI4 = lVarV.I();
                        if (zN) {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        }
                        lVarV.T();
                        int i3116 = i23 >> 6;
                        lVar2 = lVarV;
                        a(dVarE, j12, textStyle2, dVarC17, mapR17, false, 0, 0, null, (wn0.l) objI4, lVar2, (i3116 & 112) | 32768 | (i3116 & 896), 480);
                    }
                    if (o.J()) {
                        o.R();
                    }
                    map2 = map11;
                    dVar3 = dVar2;
                    spanStyle4 = spanStyle2;
                    j14 = j12;
                    textStyle4 = textStyle2;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i27 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i15 != 0) {
                            mapI = v0.i();
                        } else {
                            mapI = map;
                        }
                        if (i16 != 0) {
                            j13 = k3.p1.INSTANCE.j();
                        } else {
                            j13 = j12;
                        }
                        if ((i13 & 16) != 0) {
                            textStyle3 = (TextStyle) lVarV.U(v2.e());
                            i14 &= -57345;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i18 != 0) {
                            spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                        } else {
                            spanStyle3 = spanStyle2;
                        }
                        if ((i13 & 64) != 0) {
                            i22 = i14 & (-3670017);
                            iA = i4.x.INSTANCE.a();
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                        } else {
                            i22 = i14;
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                            iA = i11;
                        }
                    } else {
                        if (i27 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i15 != 0) {
                            mapI = v0.i();
                        } else {
                            mapI = map;
                        }
                        if (i16 != 0) {
                            j13 = k3.p1.INSTANCE.j();
                        } else {
                            j13 = j12;
                        }
                        if ((i13 & 16) != 0) {
                            textStyle3 = (TextStyle) lVarV.U(v2.e());
                            i14 &= -57345;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i18 != 0) {
                            spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                        } else {
                            spanStyle3 = spanStyle2;
                        }
                        if ((i13 & 64) != 0) {
                            i22 = i14 & (-3670017);
                            iA = i4.x.INSTANCE.a();
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                        } else {
                            i22 = i14;
                            textStyle2 = textStyle3;
                            j12 = j13;
                            spanStyle2 = spanStyle3;
                            iA = i11;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                    }
                    context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                    int i2116 = i22 >> 9;
                    Map<String, ? extends q90.b> map12 = mapI;
                    dVarE = e(html, map12, spanStyle2, lVarV, (i22 & 14) | 64 | (i2116 & 896), 0);
                    lVarV.H(-217733872);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = s3.d(Boolean.FALSE, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p1) objI;
                    lVarV.T();
                    lVarV.H(-217731777);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = new o90.f(context, null, null, null, null, 14, null);
                        lVarV.B(objI2);
                    }
                    fVar = (o90.f) objI2;
                    lVarV.T();
                    linkedHashMap = new LinkedHashMap();
                    while (r6.hasNext()) {
                        fVar = fVar;
                        if (entry.getValue() instanceof q90.b.Drawable) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            i22 = i22;
                        }
                    }
                    o90.f fVar11 = fVar;
                    i23 = i22;
                    int i2117 = ((i23 >> 15) & 112) | 8;
                    mapG = g(linkedHashMap, iA, lVarV, i2117);
                    linkedHashMap2 = new LinkedHashMap();
                    it = map12.entrySet().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        Iterator<Map.Entry<String, ? extends q90.b>> it11 = it;
                        if (next.getValue() instanceof q90.b.Bitmap) {
                            linkedHashMap2.put(next.getKey(), next.getValue());
                        }
                        it = it11;
                    }
                    mapF = f(linkedHashMap2, iA, lVarV, i2117);
                    lVarV.H(-217704547);
                    objI3 = lVarV.I();
                    companion2 = p020r2.l.INSTANCE;
                    if (objI3 == companion2.a()) {
                        objI3 = new k(p1Var);
                        lVarV.B(objI3);
                    }
                    lVarV.T();
                    int i3117 = iA;
                    y3<Map<String, q>> y3VarH10 = h(dVarE, map12, fVar11, i3117, (wn0.a) objI3, lVarV, (i2116 & 7168) | 25152);
                    i24 = i3117;
                    value = y3VarH10.getValue();
                    if (value.isEmpty()) {
                        androidx.compose.ui.d dVarC18 = g4.o.c(dVar2, true, h.f105164c);
                        Map mapR18 = v0.r(v0.r(mapG, mapF), value);
                        lVarV.H(-217688304);
                        zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                        objI4 = lVarV.I();
                        if (zN) {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        }
                        lVarV.T();
                        int i3118 = i23 >> 6;
                        lVar2 = lVarV;
                        a(dVarE, j12, textStyle2, dVarC18, mapR18, false, 0, 0, null, (wn0.l) objI4, lVar2, (i3118 & 112) | 32768 | (i3118 & 896), 480);
                    } else {
                        androidx.compose.ui.d dVarC19 = g4.o.c(dVar2, true, h.f105164c);
                        Map mapR19 = v0.r(v0.r(mapG, mapF), value);
                        lVarV.H(-217688304);
                        zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                        objI4 = lVarV.I();
                        if (zN) {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new i(onClick, dVarE);
                            lVarV.B(objI4);
                        }
                        lVarV.T();
                        int i3119 = i23 >> 6;
                        lVar2 = lVarV;
                        a(dVarE, j12, textStyle2, dVarC19, mapR19, false, 0, 0, null, (wn0.l) objI4, lVar2, (i3119 & 112) | 32768 | (i3119 & 896), 480);
                    }
                    if (o.J()) {
                        o.R();
                    }
                    map2 = map12;
                    dVar3 = dVar2;
                    spanStyle4 = spanStyle2;
                    j14 = j12;
                    textStyle4 = textStyle2;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new j(html, dVar3, map2, j14, textStyle4, spanStyle4, i24, onClick, i12, i13));
                }
            }
            i21 = 12582912;
            i14 |= i21;
            if (i15 != 4) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i27 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i16 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i13 & 16) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i14 &= -57345;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i18 != 0) {
                        spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                    } else {
                        spanStyle3 = spanStyle2;
                    }
                    if ((i13 & 64) != 0) {
                        i22 = i14 & (-3670017);
                        iA = i4.x.INSTANCE.a();
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                    } else {
                        i22 = i14;
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                        iA = i11;
                    }
                } else {
                    if (i27 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i16 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i13 & 16) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i14 &= -57345;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i18 != 0) {
                        spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                    } else {
                        spanStyle3 = spanStyle2;
                    }
                    if ((i13 & 64) != 0) {
                        i22 = i14 & (-3670017);
                        iA = i4.x.INSTANCE.a();
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                    } else {
                        i22 = i14;
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                        iA = i11;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                }
                context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                int i2118 = i22 >> 9;
                Map<String, ? extends q90.b> map13 = mapI;
                dVarE = e(html, map13, spanStyle2, lVarV, (i22 & 14) | 64 | (i2118 & 896), 0);
                lVarV.H(-217733872);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                lVarV.H(-217731777);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = new o90.f(context, null, null, null, null, 14, null);
                    lVarV.B(objI2);
                }
                fVar = (o90.f) objI2;
                lVarV.T();
                linkedHashMap = new LinkedHashMap();
                while (r6.hasNext()) {
                    fVar = fVar;
                    if (entry.getValue() instanceof q90.b.Drawable) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        i22 = i22;
                    }
                }
                o90.f fVar12 = fVar;
                i23 = i22;
                int i2119 = ((i23 >> 15) & 112) | 8;
                mapG = g(linkedHashMap, iA, lVarV, i2119);
                linkedHashMap2 = new LinkedHashMap();
                it = map13.entrySet().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    Iterator<Map.Entry<String, ? extends q90.b>> it12 = it;
                    if (next.getValue() instanceof q90.b.Bitmap) {
                        linkedHashMap2.put(next.getKey(), next.getValue());
                    }
                    it = it12;
                }
                mapF = f(linkedHashMap2, iA, lVarV, i2119);
                lVarV.H(-217704547);
                objI3 = lVarV.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI3 == companion2.a()) {
                    objI3 = new k(p1Var);
                    lVarV.B(objI3);
                }
                lVarV.T();
                int i31110 = iA;
                y3<Map<String, q>> y3VarH11 = h(dVarE, map13, fVar12, i31110, (wn0.a) objI3, lVarV, (i2118 & 7168) | 25152);
                i24 = i31110;
                value = y3VarH11.getValue();
                if (value.isEmpty()) {
                    androidx.compose.ui.d dVarC110 = g4.o.c(dVar2, true, h.f105164c);
                    Map mapR110 = v0.r(v0.r(mapG, mapF), value);
                    lVarV.H(-217688304);
                    zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                    objI4 = lVarV.I();
                    if (zN) {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    }
                    lVarV.T();
                    int i31111 = i23 >> 6;
                    lVar2 = lVarV;
                    a(dVarE, j12, textStyle2, dVarC110, mapR110, false, 0, 0, null, (wn0.l) objI4, lVar2, (i31111 & 112) | 32768 | (i31111 & 896), 480);
                } else {
                    androidx.compose.ui.d dVarC111 = g4.o.c(dVar2, true, h.f105164c);
                    Map mapR111 = v0.r(v0.r(mapG, mapF), value);
                    lVarV.H(-217688304);
                    zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                    objI4 = lVarV.I();
                    if (zN) {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    }
                    lVarV.T();
                    int i31112 = i23 >> 6;
                    lVar2 = lVarV;
                    a(dVarE, j12, textStyle2, dVarC111, mapR111, false, 0, 0, null, (wn0.l) objI4, lVar2, (i31112 & 112) | 32768 | (i31112 & 896), 480);
                }
                if (o.J()) {
                    o.R();
                }
                map2 = map13;
                dVar3 = dVar2;
                spanStyle4 = spanStyle2;
                j14 = j12;
                textStyle4 = textStyle2;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i27 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i16 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i13 & 16) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i14 &= -57345;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i18 != 0) {
                        spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                    } else {
                        spanStyle3 = spanStyle2;
                    }
                    if ((i13 & 64) != 0) {
                        i22 = i14 & (-3670017);
                        iA = i4.x.INSTANCE.a();
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                    } else {
                        i22 = i14;
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                        iA = i11;
                    }
                } else {
                    if (i27 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i16 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i13 & 16) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i14 &= -57345;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i18 != 0) {
                        spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                    } else {
                        spanStyle3 = spanStyle2;
                    }
                    if ((i13 & 64) != 0) {
                        i22 = i14 & (-3670017);
                        iA = i4.x.INSTANCE.a();
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                    } else {
                        i22 = i14;
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                        iA = i11;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                }
                context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                int i21110 = i22 >> 9;
                Map<String, ? extends q90.b> map14 = mapI;
                dVarE = e(html, map14, spanStyle2, lVarV, (i22 & 14) | 64 | (i21110 & 896), 0);
                lVarV.H(-217733872);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                lVarV.H(-217731777);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = new o90.f(context, null, null, null, null, 14, null);
                    lVarV.B(objI2);
                }
                fVar = (o90.f) objI2;
                lVarV.T();
                linkedHashMap = new LinkedHashMap();
                while (r6.hasNext()) {
                    fVar = fVar;
                    if (entry.getValue() instanceof q90.b.Drawable) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        i22 = i22;
                    }
                }
                o90.f fVar13 = fVar;
                i23 = i22;
                int i21111 = ((i23 >> 15) & 112) | 8;
                mapG = g(linkedHashMap, iA, lVarV, i21111);
                linkedHashMap2 = new LinkedHashMap();
                it = map14.entrySet().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    Iterator<Map.Entry<String, ? extends q90.b>> it13 = it;
                    if (next.getValue() instanceof q90.b.Bitmap) {
                        linkedHashMap2.put(next.getKey(), next.getValue());
                    }
                    it = it13;
                }
                mapF = f(linkedHashMap2, iA, lVarV, i21111);
                lVarV.H(-217704547);
                objI3 = lVarV.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI3 == companion2.a()) {
                    objI3 = new k(p1Var);
                    lVarV.B(objI3);
                }
                lVarV.T();
                int i31113 = iA;
                y3<Map<String, q>> y3VarH12 = h(dVarE, map14, fVar13, i31113, (wn0.a) objI3, lVarV, (i21110 & 7168) | 25152);
                i24 = i31113;
                value = y3VarH12.getValue();
                if (value.isEmpty()) {
                    androidx.compose.ui.d dVarC112 = g4.o.c(dVar2, true, h.f105164c);
                    Map mapR112 = v0.r(v0.r(mapG, mapF), value);
                    lVarV.H(-217688304);
                    zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                    objI4 = lVarV.I();
                    if (zN) {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    }
                    lVarV.T();
                    int i31114 = i23 >> 6;
                    lVar2 = lVarV;
                    a(dVarE, j12, textStyle2, dVarC112, mapR112, false, 0, 0, null, (wn0.l) objI4, lVar2, (i31114 & 112) | 32768 | (i31114 & 896), 480);
                } else {
                    androidx.compose.ui.d dVarC113 = g4.o.c(dVar2, true, h.f105164c);
                    Map mapR113 = v0.r(v0.r(mapG, mapF), value);
                    lVarV.H(-217688304);
                    zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                    objI4 = lVarV.I();
                    if (zN) {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    }
                    lVarV.T();
                    int i31115 = i23 >> 6;
                    lVar2 = lVarV;
                    a(dVarE, j12, textStyle2, dVarC113, mapR113, false, 0, 0, null, (wn0.l) objI4, lVar2, (i31115 & 112) | 32768 | (i31115 & 896), 480);
                }
                if (o.J()) {
                    o.R();
                }
                map2 = map14;
                dVar3 = dVar2;
                spanStyle4 = spanStyle2;
                j14 = j12;
                textStyle4 = textStyle2;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new j(html, dVar3, map2, j14, textStyle4, spanStyle4, i24, onClick, i12, i13));
            }
        }
        i14 |= 3072;
        j12 = j11;
        if ((57344 & i12) == 0) {
            if ((i13 & 16) == 0) {
                textStyle2 = textStyle;
                if (lVarV.n(textStyle2)) {
                    i26 = 16384;
                }
                i14 |= i26;
            } else {
                textStyle2 = textStyle;
            }
            i26 = PKIFailureInfo.certRevoked;
            i14 |= i26;
        } else {
            textStyle2 = textStyle;
        }
        i18 = i13 & 32;
        if (i18 != 0) {
            i14 |= 196608;
            spanStyle2 = spanStyle;
        } else {
            spanStyle2 = spanStyle;
            if ((i12 & 458752) == 0) {
                if (lVarV.n(spanStyle2)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i14 |= i19;
            }
        }
        if ((i12 & 3670016) != 0) {
            if ((i13 & 64) == 0) {
                i25 = PKIFailureInfo.signerNotTrusted;
            } else {
                i25 = PKIFailureInfo.signerNotTrusted;
            }
            i14 |= i25;
        }
        if ((i13 & 128) != 0) {
            if ((i12 & 29360128) == 0) {
                if (lVarV.K(onClick)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
            }
            if (i15 != 4) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i27 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i16 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i13 & 16) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i14 &= -57345;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i18 != 0) {
                        spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                    } else {
                        spanStyle3 = spanStyle2;
                    }
                    if ((i13 & 64) != 0) {
                        i22 = i14 & (-3670017);
                        iA = i4.x.INSTANCE.a();
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                    } else {
                        i22 = i14;
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                        iA = i11;
                    }
                } else {
                    if (i27 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i16 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i13 & 16) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i14 &= -57345;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i18 != 0) {
                        spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                    } else {
                        spanStyle3 = spanStyle2;
                    }
                    if ((i13 & 64) != 0) {
                        i22 = i14 & (-3670017);
                        iA = i4.x.INSTANCE.a();
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                    } else {
                        i22 = i14;
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                        iA = i11;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                }
                context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                int i21112 = i22 >> 9;
                Map<String, ? extends q90.b> map15 = mapI;
                dVarE = e(html, map15, spanStyle2, lVarV, (i22 & 14) | 64 | (i21112 & 896), 0);
                lVarV.H(-217733872);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                lVarV.H(-217731777);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = new o90.f(context, null, null, null, null, 14, null);
                    lVarV.B(objI2);
                }
                fVar = (o90.f) objI2;
                lVarV.T();
                linkedHashMap = new LinkedHashMap();
                while (r6.hasNext()) {
                    fVar = fVar;
                    if (entry.getValue() instanceof q90.b.Drawable) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        i22 = i22;
                    }
                }
                o90.f fVar14 = fVar;
                i23 = i22;
                int i21113 = ((i23 >> 15) & 112) | 8;
                mapG = g(linkedHashMap, iA, lVarV, i21113);
                linkedHashMap2 = new LinkedHashMap();
                it = map15.entrySet().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    Iterator<Map.Entry<String, ? extends q90.b>> it14 = it;
                    if (next.getValue() instanceof q90.b.Bitmap) {
                        linkedHashMap2.put(next.getKey(), next.getValue());
                    }
                    it = it14;
                }
                mapF = f(linkedHashMap2, iA, lVarV, i21113);
                lVarV.H(-217704547);
                objI3 = lVarV.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI3 == companion2.a()) {
                    objI3 = new k(p1Var);
                    lVarV.B(objI3);
                }
                lVarV.T();
                int i31116 = iA;
                y3<Map<String, q>> y3VarH13 = h(dVarE, map15, fVar14, i31116, (wn0.a) objI3, lVarV, (i21112 & 7168) | 25152);
                i24 = i31116;
                value = y3VarH13.getValue();
                if (value.isEmpty()) {
                    androidx.compose.ui.d dVarC114 = g4.o.c(dVar2, true, h.f105164c);
                    Map mapR114 = v0.r(v0.r(mapG, mapF), value);
                    lVarV.H(-217688304);
                    zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                    objI4 = lVarV.I();
                    if (zN) {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    }
                    lVarV.T();
                    int i31117 = i23 >> 6;
                    lVar2 = lVarV;
                    a(dVarE, j12, textStyle2, dVarC114, mapR114, false, 0, 0, null, (wn0.l) objI4, lVar2, (i31117 & 112) | 32768 | (i31117 & 896), 480);
                } else {
                    androidx.compose.ui.d dVarC115 = g4.o.c(dVar2, true, h.f105164c);
                    Map mapR115 = v0.r(v0.r(mapG, mapF), value);
                    lVarV.H(-217688304);
                    zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                    objI4 = lVarV.I();
                    if (zN) {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    }
                    lVarV.T();
                    int i31118 = i23 >> 6;
                    lVar2 = lVarV;
                    a(dVarE, j12, textStyle2, dVarC115, mapR115, false, 0, 0, null, (wn0.l) objI4, lVar2, (i31118 & 112) | 32768 | (i31118 & 896), 480);
                }
                if (o.J()) {
                    o.R();
                }
                map2 = map15;
                dVar3 = dVar2;
                spanStyle4 = spanStyle2;
                j14 = j12;
                textStyle4 = textStyle2;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i27 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i16 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i13 & 16) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i14 &= -57345;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i18 != 0) {
                        spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                    } else {
                        spanStyle3 = spanStyle2;
                    }
                    if ((i13 & 64) != 0) {
                        i22 = i14 & (-3670017);
                        iA = i4.x.INSTANCE.a();
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                    } else {
                        i22 = i14;
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                        iA = i11;
                    }
                } else {
                    if (i27 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i15 != 0) {
                        mapI = v0.i();
                    } else {
                        mapI = map;
                    }
                    if (i16 != 0) {
                        j13 = k3.p1.INSTANCE.j();
                    } else {
                        j13 = j12;
                    }
                    if ((i13 & 16) != 0) {
                        textStyle3 = (TextStyle) lVarV.U(v2.e());
                        i14 &= -57345;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i18 != 0) {
                        spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                    } else {
                        spanStyle3 = spanStyle2;
                    }
                    if ((i13 & 64) != 0) {
                        i22 = i14 & (-3670017);
                        iA = i4.x.INSTANCE.a();
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                    } else {
                        i22 = i14;
                        textStyle2 = textStyle3;
                        j12 = j13;
                        spanStyle2 = spanStyle3;
                        iA = i11;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
                }
                context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                int i21114 = i22 >> 9;
                Map<String, ? extends q90.b> map16 = mapI;
                dVarE = e(html, map16, spanStyle2, lVarV, (i22 & 14) | 64 | (i21114 & 896), 0);
                lVarV.H(-217733872);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p1) objI;
                lVarV.T();
                lVarV.H(-217731777);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = new o90.f(context, null, null, null, null, 14, null);
                    lVarV.B(objI2);
                }
                fVar = (o90.f) objI2;
                lVarV.T();
                linkedHashMap = new LinkedHashMap();
                while (r6.hasNext()) {
                    fVar = fVar;
                    if (entry.getValue() instanceof q90.b.Drawable) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        i22 = i22;
                    }
                }
                o90.f fVar15 = fVar;
                i23 = i22;
                int i21115 = ((i23 >> 15) & 112) | 8;
                mapG = g(linkedHashMap, iA, lVarV, i21115);
                linkedHashMap2 = new LinkedHashMap();
                it = map16.entrySet().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    Iterator<Map.Entry<String, ? extends q90.b>> it15 = it;
                    if (next.getValue() instanceof q90.b.Bitmap) {
                        linkedHashMap2.put(next.getKey(), next.getValue());
                    }
                    it = it15;
                }
                mapF = f(linkedHashMap2, iA, lVarV, i21115);
                lVarV.H(-217704547);
                objI3 = lVarV.I();
                companion2 = p020r2.l.INSTANCE;
                if (objI3 == companion2.a()) {
                    objI3 = new k(p1Var);
                    lVarV.B(objI3);
                }
                lVarV.T();
                int i31119 = iA;
                y3<Map<String, q>> y3VarH14 = h(dVarE, map16, fVar15, i31119, (wn0.a) objI3, lVarV, (i21114 & 7168) | 25152);
                i24 = i31119;
                value = y3VarH14.getValue();
                if (value.isEmpty()) {
                    androidx.compose.ui.d dVarC116 = g4.o.c(dVar2, true, h.f105164c);
                    Map mapR116 = v0.r(v0.r(mapG, mapF), value);
                    lVarV.H(-217688304);
                    zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                    objI4 = lVarV.I();
                    if (zN) {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    }
                    lVarV.T();
                    int i311110 = i23 >> 6;
                    lVar2 = lVarV;
                    a(dVarE, j12, textStyle2, dVarC116, mapR116, false, 0, 0, null, (wn0.l) objI4, lVar2, (i311110 & 112) | 32768 | (i311110 & 896), 480);
                } else {
                    androidx.compose.ui.d dVarC117 = g4.o.c(dVar2, true, h.f105164c);
                    Map mapR117 = v0.r(v0.r(mapG, mapF), value);
                    lVarV.H(-217688304);
                    zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                    objI4 = lVarV.I();
                    if (zN) {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new i(onClick, dVarE);
                        lVarV.B(objI4);
                    }
                    lVarV.T();
                    int i311111 = i23 >> 6;
                    lVar2 = lVarV;
                    a(dVarE, j12, textStyle2, dVarC117, mapR117, false, 0, 0, null, (wn0.l) objI4, lVar2, (i311111 & 112) | 32768 | (i311111 & 896), 480);
                }
                if (o.J()) {
                    o.R();
                }
                map2 = map16;
                dVar3 = dVar2;
                spanStyle4 = spanStyle2;
                j14 = j12;
                textStyle4 = textStyle2;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new j(html, dVar3, map2, j14, textStyle4, spanStyle4, i24, onClick, i12, i13));
            }
        }
        i21 = 12582912;
        i14 |= i21;
        if (i15 != 4) {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i27 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i15 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i16 != 0) {
                    j13 = k3.p1.INSTANCE.j();
                } else {
                    j13 = j12;
                }
                if ((i13 & 16) != 0) {
                    textStyle3 = (TextStyle) lVarV.U(v2.e());
                    i14 &= -57345;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i18 != 0) {
                    spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                } else {
                    spanStyle3 = spanStyle2;
                }
                if ((i13 & 64) != 0) {
                    i22 = i14 & (-3670017);
                    iA = i4.x.INSTANCE.a();
                    textStyle2 = textStyle3;
                    j12 = j13;
                    spanStyle2 = spanStyle3;
                } else {
                    i22 = i14;
                    textStyle2 = textStyle3;
                    j12 = j13;
                    spanStyle2 = spanStyle3;
                    iA = i11;
                }
            } else {
                if (i27 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i15 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i16 != 0) {
                    j13 = k3.p1.INSTANCE.j();
                } else {
                    j13 = j12;
                }
                if ((i13 & 16) != 0) {
                    textStyle3 = (TextStyle) lVarV.U(v2.e());
                    i14 &= -57345;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i18 != 0) {
                    spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                } else {
                    spanStyle3 = spanStyle2;
                }
                if ((i13 & 64) != 0) {
                    i22 = i14 & (-3670017);
                    iA = i4.x.INSTANCE.a();
                    textStyle2 = textStyle3;
                    j12 = j13;
                    spanStyle2 = spanStyle3;
                } else {
                    i22 = i14;
                    textStyle2 = textStyle3;
                    j12 = j13;
                    spanStyle2 = spanStyle3;
                    iA = i11;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
            }
            context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            int i21116 = i22 >> 9;
            Map<String, ? extends q90.b> map17 = mapI;
            dVarE = e(html, map17, spanStyle2, lVarV, (i22 & 14) | 64 | (i21116 & 896), 0);
            lVarV.H(-217733872);
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = s3.d(Boolean.FALSE, null, 2, null);
                lVarV.B(objI);
            }
            p1Var = (p1) objI;
            lVarV.T();
            lVarV.H(-217731777);
            objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = new o90.f(context, null, null, null, null, 14, null);
                lVarV.B(objI2);
            }
            fVar = (o90.f) objI2;
            lVarV.T();
            linkedHashMap = new LinkedHashMap();
            while (r6.hasNext()) {
                fVar = fVar;
                if (entry.getValue() instanceof q90.b.Drawable) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                    i22 = i22;
                }
            }
            o90.f fVar16 = fVar;
            i23 = i22;
            int i21117 = ((i23 >> 15) & 112) | 8;
            mapG = g(linkedHashMap, iA, lVarV, i21117);
            linkedHashMap2 = new LinkedHashMap();
            it = map17.entrySet().iterator();
            while (it.hasNext()) {
                next = it.next();
                Iterator<Map.Entry<String, ? extends q90.b>> it16 = it;
                if (next.getValue() instanceof q90.b.Bitmap) {
                    linkedHashMap2.put(next.getKey(), next.getValue());
                }
                it = it16;
            }
            mapF = f(linkedHashMap2, iA, lVarV, i21117);
            lVarV.H(-217704547);
            objI3 = lVarV.I();
            companion2 = p020r2.l.INSTANCE;
            if (objI3 == companion2.a()) {
                objI3 = new k(p1Var);
                lVarV.B(objI3);
            }
            lVarV.T();
            int i311112 = iA;
            y3<Map<String, q>> y3VarH15 = h(dVarE, map17, fVar16, i311112, (wn0.a) objI3, lVarV, (i21116 & 7168) | 25152);
            i24 = i311112;
            value = y3VarH15.getValue();
            if (value.isEmpty()) {
                androidx.compose.ui.d dVarC118 = g4.o.c(dVar2, true, h.f105164c);
                Map mapR118 = v0.r(v0.r(mapG, mapF), value);
                lVarV.H(-217688304);
                zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                objI4 = lVarV.I();
                if (zN) {
                    objI4 = new i(onClick, dVarE);
                    lVarV.B(objI4);
                } else {
                    objI4 = new i(onClick, dVarE);
                    lVarV.B(objI4);
                }
                lVarV.T();
                int i311113 = i23 >> 6;
                lVar2 = lVarV;
                a(dVarE, j12, textStyle2, dVarC118, mapR118, false, 0, 0, null, (wn0.l) objI4, lVar2, (i311113 & 112) | 32768 | (i311113 & 896), 480);
            } else {
                androidx.compose.ui.d dVarC119 = g4.o.c(dVar2, true, h.f105164c);
                Map mapR119 = v0.r(v0.r(mapG, mapF), value);
                lVarV.H(-217688304);
                zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                objI4 = lVarV.I();
                if (zN) {
                    objI4 = new i(onClick, dVarE);
                    lVarV.B(objI4);
                } else {
                    objI4 = new i(onClick, dVarE);
                    lVarV.B(objI4);
                }
                lVarV.T();
                int i311114 = i23 >> 6;
                lVar2 = lVarV;
                a(dVarE, j12, textStyle2, dVarC119, mapR119, false, 0, 0, null, (wn0.l) objI4, lVar2, (i311114 & 112) | 32768 | (i311114 & 896), 480);
            }
            if (o.J()) {
                o.R();
            }
            map2 = map17;
            dVar3 = dVar2;
            spanStyle4 = spanStyle2;
            j14 = j12;
            textStyle4 = textStyle2;
        } else {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i27 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i15 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i16 != 0) {
                    j13 = k3.p1.INSTANCE.j();
                } else {
                    j13 = j12;
                }
                if ((i13 & 16) != 0) {
                    textStyle3 = (TextStyle) lVarV.U(v2.e());
                    i14 &= -57345;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i18 != 0) {
                    spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                } else {
                    spanStyle3 = spanStyle2;
                }
                if ((i13 & 64) != 0) {
                    i22 = i14 & (-3670017);
                    iA = i4.x.INSTANCE.a();
                    textStyle2 = textStyle3;
                    j12 = j13;
                    spanStyle2 = spanStyle3;
                } else {
                    i22 = i14;
                    textStyle2 = textStyle3;
                    j12 = j13;
                    spanStyle2 = spanStyle3;
                    iA = i11;
                }
            } else {
                if (i27 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i15 != 0) {
                    mapI = v0.i();
                } else {
                    mapI = map;
                }
                if (i16 != 0) {
                    j13 = k3.p1.INSTANCE.j();
                } else {
                    j13 = j12;
                }
                if ((i13 & 16) != 0) {
                    textStyle3 = (TextStyle) lVarV.U(v2.e());
                    i14 &= -57345;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i18 != 0) {
                    spanStyle3 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null);
                } else {
                    spanStyle3 = spanStyle2;
                }
                if ((i13 & 64) != 0) {
                    i22 = i14 & (-3670017);
                    iA = i4.x.INSTANCE.a();
                    textStyle2 = textStyle3;
                    j12 = j13;
                    spanStyle2 = spanStyle3;
                } else {
                    i22 = i14;
                    textStyle2 = textStyle3;
                    j12 = j13;
                    spanStyle2 = spanStyle3;
                    iA = i11;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(583944314, i22, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:284)");
            }
            context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            int i21118 = i22 >> 9;
            Map<String, ? extends q90.b> map18 = mapI;
            dVarE = e(html, map18, spanStyle2, lVarV, (i22 & 14) | 64 | (i21118 & 896), 0);
            lVarV.H(-217733872);
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = s3.d(Boolean.FALSE, null, 2, null);
                lVarV.B(objI);
            }
            p1Var = (p1) objI;
            lVarV.T();
            lVarV.H(-217731777);
            objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = new o90.f(context, null, null, null, null, 14, null);
                lVarV.B(objI2);
            }
            fVar = (o90.f) objI2;
            lVarV.T();
            linkedHashMap = new LinkedHashMap();
            while (r6.hasNext()) {
                fVar = fVar;
                if (entry.getValue() instanceof q90.b.Drawable) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                    i22 = i22;
                }
            }
            o90.f fVar17 = fVar;
            i23 = i22;
            int i21119 = ((i23 >> 15) & 112) | 8;
            mapG = g(linkedHashMap, iA, lVarV, i21119);
            linkedHashMap2 = new LinkedHashMap();
            it = map18.entrySet().iterator();
            while (it.hasNext()) {
                next = it.next();
                Iterator<Map.Entry<String, ? extends q90.b>> it17 = it;
                if (next.getValue() instanceof q90.b.Bitmap) {
                    linkedHashMap2.put(next.getKey(), next.getValue());
                }
                it = it17;
            }
            mapF = f(linkedHashMap2, iA, lVarV, i21119);
            lVarV.H(-217704547);
            objI3 = lVarV.I();
            companion2 = p020r2.l.INSTANCE;
            if (objI3 == companion2.a()) {
                objI3 = new k(p1Var);
                lVarV.B(objI3);
            }
            lVarV.T();
            int i311115 = iA;
            y3<Map<String, q>> y3VarH16 = h(dVarE, map18, fVar17, i311115, (wn0.a) objI3, lVarV, (i21118 & 7168) | 25152);
            i24 = i311115;
            value = y3VarH16.getValue();
            if (value.isEmpty()) {
                androidx.compose.ui.d dVarC1110 = g4.o.c(dVar2, true, h.f105164c);
                Map mapR1110 = v0.r(v0.r(mapG, mapF), value);
                lVarV.H(-217688304);
                zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                objI4 = lVarV.I();
                if (zN) {
                    objI4 = new i(onClick, dVarE);
                    lVarV.B(objI4);
                } else {
                    objI4 = new i(onClick, dVarE);
                    lVarV.B(objI4);
                }
                lVarV.T();
                int i311116 = i23 >> 6;
                lVar2 = lVarV;
                a(dVarE, j12, textStyle2, dVarC1110, mapR1110, false, 0, 0, null, (wn0.l) objI4, lVar2, (i311116 & 112) | 32768 | (i311116 & 896), 480);
            } else {
                androidx.compose.ui.d dVarC1111 = g4.o.c(dVar2, true, h.f105164c);
                Map mapR1111 = v0.r(v0.r(mapG, mapF), value);
                lVarV.H(-217688304);
                zN = lVarV.n(dVarE) | ((i23 & 29360128) == 8388608);
                objI4 = lVarV.I();
                if (zN) {
                    objI4 = new i(onClick, dVarE);
                    lVarV.B(objI4);
                } else {
                    objI4 = new i(onClick, dVarE);
                    lVarV.B(objI4);
                }
                lVarV.T();
                int i311117 = i23 >> 6;
                lVar2 = lVarV;
                a(dVarE, j12, textStyle2, dVarC1111, mapR1111, false, 0, 0, null, (wn0.l) objI4, lVar2, (i311117 & 112) | 32768 | (i311117 & 896), 480);
            }
            if (o.J()) {
                o.R();
            }
            map2 = map18;
            dVar3 = dVar2;
            spanStyle4 = spanStyle2;
            j14 = j12;
            textStyle4 = textStyle2;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new j(html, dVar3, map2, j14, textStyle4, spanStyle4, i24, onClick, i12, i13));
        }
    }

    public static final i4.d e(String text, Map<String, ? extends q90.b> map, SpanStyle spanStyle, p020r2.l lVar, int i11, int i12) {
        s.k(text, "text");
        lVar.H(1962487584);
        Map<String, ? extends q90.b> mapI = (i12 & 2) != 0 ? v0.i() : map;
        SpanStyle spanStyle2 = (i12 & 4) != 0 ? new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null) : spanStyle;
        if (o.J()) {
            o.S(1962487584, i11, -1, "com.stripe.android.uicore.text.annotatedStringResource (Html.kt:351)");
        }
        lVar.H(-1904947080);
        boolean z11 = (((i11 & 14) ^ 6) > 4 && lVar.n(text)) || (i11 & 6) == 4;
        Object objI = lVar.I();
        if (z11 || objI == p020r2.l.INSTANCE.a()) {
            objI = s5.b.a(text, 0);
            lVar.B(objI);
        }
        Spanned spanned = (Spanned) objI;
        lVar.T();
        s.h(spanned);
        lVar.H(-1904940542);
        boolean zN = lVar.n(spanned);
        Object objI2 = lVar.I();
        if (zN || objI2 == p020r2.l.INSTANCE.a()) {
            i4.d.a aVar = new i4.d.a(0, 1, null);
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            s.j(spans, "getSpans(...)");
            int i13 = 0;
            for (Object obj : spans) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                if (i13 < spanned.toString().length() && spanStart < spanned.toString().length() && spanStart - i13 >= 0) {
                    String strSubstring = spanned.toString().substring(i13, spanStart);
                    s.j(strSubstring, "substring(...)");
                    aVar.i(strSubstring);
                    if (obj instanceof StyleSpan) {
                        int style = ((StyleSpan) obj).getStyle();
                        if (style == 1) {
                            aVar.c(new SpanStyle(0L, 0L, FontWeight.INSTANCE.a(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null), spanStart, spanEnd);
                        } else if (style == 2) {
                            aVar.c(new SpanStyle(0L, 0L, null, p014n4.b0.c(p014n4.b0.INSTANCE.a()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null), spanStart, spanEnd);
                        } else if (style == 3) {
                            aVar.c(new SpanStyle(0L, 0L, FontWeight.INSTANCE.a(), p014n4.b0.c(p014n4.b0.INSTANCE.a()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null), spanStart, spanEnd);
                        }
                    } else if (obj instanceof UnderlineSpan) {
                        aVar.c(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null), spanStart, spanEnd);
                    } else if (obj instanceof BulletSpan) {
                        aVar.i("•\t");
                    } else if (obj instanceof ForegroundColorSpan) {
                        aVar.c(new SpanStyle(r1.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), spanStart, spanEnd);
                    } else if (obj instanceof ImageSpan) {
                        ImageSpan imageSpan = (ImageSpan) obj;
                        if (imageSpan.getSource() != null) {
                            if (!mapI.isEmpty()) {
                                String source = imageSpan.getSource();
                                s.h(source);
                                mapI.containsKey(source);
                            }
                            String source2 = imageSpan.getSource();
                            s.h(source2);
                            r.b(aVar, source2, null, 2, null);
                        }
                        i13 = spanEnd;
                    } else if (obj instanceof URLSpan) {
                        aVar.c(spanStyle2, spanStart, spanEnd);
                        String url = ((URLSpan) obj).getURL();
                        s.j(url, "getURL(...)");
                        aVar.a("URL", url, spanStart, spanEnd);
                    }
                    i13 = spanStart;
                }
            }
            if (i13 != spanned.toString().length()) {
                String strSubstring2 = spanned.toString().substring(i13);
                s.j(strSubstring2, "substring(...)");
                aVar.i(strSubstring2);
            }
            objI2 = aVar.o();
            lVar.B(objI2);
        }
        i4.d dVar = (i4.d) objI2;
        lVar.T();
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return dVar;
    }

    private static final Map<String, q> f(Map<String, q90.b.Bitmap> map, int i11, p020r2.l lVar, int i12) {
        lVar.H(1925244042);
        if (o.J()) {
            o.S(1925244042, i12, -1, "com.stripe.android.uicore.text.rememberBitmapImages (Html.kt:114)");
        }
        Set<Map.Entry<String, q90.b.Bitmap>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(v0.e(v.y(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            q90.b.Bitmap bitmap = (q90.b.Bitmap) entry.getValue();
            long jN = j3.m.n(j3.n.a(bitmap.getBitmap().getWidth(), bitmap.getBitmap().getHeight()), 1 / ((w4.d) lVar.U(z0.g())).getDensity());
            Pair pairA = jn0.x.a(str, new q(new Placeholder(w.g(j3.m.k(jN)), w.g(j3.m.i(jN)), i11, null), z2.c.b(lVar, -560842123, true, new l(bitmap))));
            linkedHashMap.put(pairA.e(), pairA.f());
        }
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return linkedHashMap;
    }

    private static final Map<String, q> g(Map<String, q90.b.Drawable> map, int i11, p020r2.l lVar, int i12) {
        lVar.H(389303035);
        if (o.J()) {
            o.S(389303035, i12, -1, "com.stripe.android.uicore.text.rememberDrawableImages (Html.kt:81)");
        }
        Set<Map.Entry<String, q90.b.Drawable>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(v0.e(v.y(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            q90.b.Drawable drawable = (q90.b.Drawable) entry.getValue();
            androidx.compose.ui.graphics.painter.b bVarC = e4.e.c(drawable.getId(), lVar, 0);
            float fI = j3.m.i(bVarC.mo1getIntrinsicSizeNHjbRc());
            float fK = j3.m.k(bVarC.mo1getIntrinsicSizeNHjbRc());
            j1 j1Var = j1.f74525a;
            int i13 = j1.f74526b;
            long jN = j1Var.c(lVar, i13).getBody1().n();
            w.b(jN);
            Pair pairA = jn0.x.a(str, new q(new Placeholder(w.k(w4.v.f(jN), w4.v.h(jN) * (fK / fI)), j1Var.c(lVar, i13).getBody1().n(), i11, null), z2.c.b(lVar, -737684954, true, new m(drawable, bVarC))));
            linkedHashMap.put(pairA.e(), pairA.f());
        }
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return linkedHashMap;
    }

    private static final y3<Map<String, q>> h(i4.d dVar, Map<String, ? extends q90.b> map, o90.f fVar, int i11, wn0.a<h0> aVar, p020r2.l lVar, int i12) {
        lVar.H(-1863307166);
        if (o.J()) {
            o.S(-1863307166, i12, -1, "com.stripe.android.uicore.text.rememberRemoteImages (Html.kt:146)");
        }
        List<i4.d.Range<String>> listI = dVar.i(0, dVar.length());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            String str = (String) ((i4.d.Range) obj).e();
            if (o90.h.a(str) && !map.keySet().contains(str)) {
                arrayList.add(obj);
            }
        }
        lVar.H(-1903942547);
        Object objI = lVar.I();
        if (objI == p020r2.l.INSTANCE.a()) {
            objI = StateFlowKt.MutableStateFlow(v0.i());
            lVar.B(objI);
        }
        MutableStateFlow mutableStateFlow = (MutableStateFlow) objI;
        lVar.T();
        w4.d dVar2 = (w4.d) lVar.U(z0.g());
        lVar.H(-1903937156);
        if (!arrayList.isEmpty()) {
            Function0.g(dVar, new n(arrayList, mutableStateFlow, aVar, fVar, dVar2, i11, null), lVar, (i12 & 14) | 64);
        }
        lVar.T();
        y3<Map<String, q>> y3VarA = r90.f.a(mutableStateFlow, lVar, 8);
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return y3VarA;
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f105149c = new e();

        e() {
            super(0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }

        public final void b() {
        }
    }
}
