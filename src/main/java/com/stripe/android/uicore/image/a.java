package com.stripe.android.uicore.image;

import android.graphics.Bitmap;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.platform.s2;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d3.c;
import jn0.h0;
import jn0.s;
import jn0.t;
import k3.n0;
import k3.q1;
import kotlinx.coroutines.CoroutineScope;
import o90.f;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import q1.b0;
import v1.e;
import w4.h;
import wn0.p;
import wn0.q;
import wn0.r;
import z3.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0095\u0001\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"", ImagesContract.URL, "Lo90/f;", "imageLoader", "contentDescription", "Landroidx/compose/ui/d;", "modifier", "Lz3/k;", "contentScale", "Lk3/q1;", "colorFilter", "Landroidx/compose/ui/graphics/painter/b;", "debugPainter", "Ld3/c;", "alignment", "", "disableAnimations", "Lkotlin/Function1;", "Lv1/e;", "Ljn0/h0;", "errorContent", "loadingContent", "a", "(Ljava/lang/String;Lo90/f;Ljava/lang/String;Landroidx/compose/ui/d;Lz3/k;Lk3/q1;Landroidx/compose/ui/graphics/painter/b;Ld3/c;ZLwn0/q;Lwn0/q;Lr2/l;III)V", "Lkotlin/Pair;", "", "c", "(Lv1/e;)Lkotlin/Pair;", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: com.stripe.android.uicore.image.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/e;", "Ljn0/h0;", "a", "(Lv1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C1090a extends u implements q<e, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f54355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f54356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.painter.b f54357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f54358f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<e, l, Integer, h0> f54359g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q<e, l, Integer, h0> f54360h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ d f54361i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f54362j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ d3.c f54363k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ k f54364l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ q1 f54365m;

        /* JADX INFO: renamed from: com.stripe.android.uicore.image.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageKt$StripeImage$1$1", f = "StripeImage.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
        static final class C1091a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f54366n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ f f54367o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f54368p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f54369q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ int f54370r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p1<StripeImageState> f54371s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1091a(f fVar, String str, int i11, int i12, p1<StripeImageState> p1Var, Continuation<? super C1091a> continuation) {
                super(2, continuation);
                this.f54367o = fVar;
                this.f54368p = str;
                this.f54369q = i11;
                this.f54370r = i12;
                this.f54371s = p1Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C1091a(this.f54367o, this.f54368p, this.f54369q, this.f54370r, this.f54371s, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG;
                Bitmap bitmap;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f54366n;
                if (i11 == 0) {
                    t.b(obj);
                    f fVar = this.f54367o;
                    String str = this.f54368p;
                    int i12 = this.f54369q;
                    int i13 = this.f54370r;
                    this.f54366n = 1;
                    objG = fVar.g(str, i12, i13, this);
                    if (objG == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    objG = ((s) obj).getValue();
                }
                p1<StripeImageState> p1Var = this.f54371s;
                if (s.h(objG) && (bitmap = (Bitmap) objG) != null) {
                    p1Var.setValue(new StripeImageState.Success(new BitmapPainter(n0.c(bitmap), 0L, 0L, 6, null)));
                }
                p1<StripeImageState> p1Var2 = this.f54371s;
                if (s.e(objG) != null) {
                    p1Var2.setValue(StripeImageState.a.f54353a);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C1091a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.uicore.image.a$a$b */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/uicore/image/StripeImageState;", "targetState", "", "a", "(Lcom/stripe/android/uicore/image/StripeImageState;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements wn0.l<StripeImageState, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f54372c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z11) {
                super(1);
                this.f54372c = z11;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(StripeImageState targetState) {
                p013kotlin.jvm.internal.s.k(targetState, "targetState");
                return this.f54372c ? Boolean.TRUE : targetState;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.uicore.image.a$a$c */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo1/b;", "Lcom/stripe/android/uicore/image/StripeImageState;", "it", "Ljn0/h0;", "a", "(Lo1/b;Lcom/stripe/android/uicore/image/StripeImageState;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class c extends u implements r<p015o1.b, StripeImageState, l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ q<e, l, Integer, h0> f54373c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f54374d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ q<e, l, Integer, h0> f54375e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f54376f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f54377g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ d3.c f54378h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ k f54379i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ q1 f54380j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(q<? super e, ? super l, ? super Integer, h0> qVar, e eVar, q<? super e, ? super l, ? super Integer, h0> qVar2, d dVar, String str, d3.c cVar, k kVar, q1 q1Var) {
                super(4);
                this.f54373c = qVar;
                this.f54374d = eVar;
                this.f54375e = qVar2;
                this.f54376f = dVar;
                this.f54377g = str;
                this.f54378h = cVar;
                this.f54379i = kVar;
                this.f54380j = q1Var;
            }

            public final void a(p015o1.b AnimatedContent, StripeImageState it, l lVar, int i11) {
                p013kotlin.jvm.internal.s.k(AnimatedContent, "$this$AnimatedContent");
                p013kotlin.jvm.internal.s.k(it, "it");
                if (o.J()) {
                    o.S(1707989893, i11, -1, "com.stripe.android.uicore.image.StripeImage.<anonymous>.<anonymous> (StripeImage.kt:95)");
                }
                if (p013kotlin.jvm.internal.s.f(it, StripeImageState.a.f54353a)) {
                    lVar.H(-1892467073);
                    this.f54373c.invoke(this.f54374d, lVar, 0);
                    lVar.T();
                } else if (p013kotlin.jvm.internal.s.f(it, StripeImageState.b.f54354a)) {
                    lVar.H(-1892465727);
                    this.f54375e.invoke(this.f54374d, lVar, 0);
                    lVar.T();
                } else if (it instanceof StripeImageState.Success) {
                    lVar.H(1463161246);
                    b0.a(((StripeImageState.Success) it).getPainter(), this.f54377g, s2.a(this.f54376f, "StripeImageFromUrl"), this.f54378h, this.f54379i, BitmapDescriptorFactory.HUE_RED, this.f54380j, lVar, 8, 32);
                    lVar.T();
                } else {
                    lVar.H(1463500913);
                    lVar.T();
                }
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.r
            public /* bridge */ /* synthetic */ h0 invoke(p015o1.b bVar, StripeImageState stripeImageState, l lVar, Integer num) {
                a(bVar, stripeImageState, lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1090a(String str, boolean z11, androidx.compose.ui.graphics.painter.b bVar, f fVar, q<? super e, ? super l, ? super Integer, h0> qVar, q<? super e, ? super l, ? super Integer, h0> qVar2, d dVar, String str2, d3.c cVar, k kVar, q1 q1Var) {
            super(3);
            this.f54355c = str;
            this.f54356d = z11;
            this.f54357e = bVar;
            this.f54358f = fVar;
            this.f54359g = qVar;
            this.f54360h = qVar2;
            this.f54361i = dVar;
            this.f54362j = str2;
            this.f54363k = cVar;
            this.f54364l = kVar;
            this.f54365m = q1Var;
        }

        public final void a(e BoxWithConstraints, l lVar, int i11) {
            int i12;
            p013kotlin.jvm.internal.s.k(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i11 & 14) == 0) {
                i12 = i11 | (lVar.n(BoxWithConstraints) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 91) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1632138495, i12, -1, "com.stripe.android.uicore.image.StripeImage.<anonymous> (StripeImage.kt:61)");
            }
            boolean zBooleanValue = ((Boolean) lVar.U(androidx.compose.ui.platform.p1.a())).booleanValue();
            Pair pairC = a.c(BoxWithConstraints);
            int iIntValue = ((Number) pairC.a()).intValue();
            int iIntValue2 = ((Number) pairC.b()).intValue();
            lVar.H(-406660964);
            androidx.compose.ui.graphics.painter.b bVar = this.f54357e;
            Object objI = lVar.I();
            l.Companion companion = l.INSTANCE;
            if (objI == companion.a()) {
                objI = (!zBooleanValue || bVar == null) ? s3.d(StripeImageState.b.f54354a, null, 2, null) : s3.d(new StripeImageState.Success(bVar), null, 2, null);
                lVar.B(objI);
            }
            p1 p1Var = (p1) objI;
            lVar.T();
            String str = this.f54355c;
            Function0.g(str, new C1091a(this.f54358f, str, iIntValue, iIntValue2, p1Var, null), lVar, 64);
            Object value = p1Var.getValue();
            lVar.H(-406637573);
            boolean zP = lVar.p(this.f54356d);
            boolean z11 = this.f54356d;
            Object objI2 = lVar.I();
            if (zP || objI2 == companion.a()) {
                objI2 = new b(z11);
                lVar.B(objI2);
            }
            lVar.T();
            androidx.compose.animation.a.a(value, null, null, null, "loading_image_animation", (wn0.l) objI2, z2.c.b(lVar, 1707989893, true, new c(this.f54359g, BoxWithConstraints, this.f54360h, this.f54361i, this.f54362j, this.f54363k, this.f54364l, this.f54365m)), lVar, 1597440, 14);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(e eVar, l lVar, Integer num) {
            a(eVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f54381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f54382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f54383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f54384f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k f54385g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q1 f54386h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.painter.b f54387i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c f54388j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f54389k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q<e, l, Integer, h0> f54390l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ q<e, l, Integer, h0> f54391m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f54392n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f54393o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f54394p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, f fVar, String str2, d dVar, k kVar, q1 q1Var, androidx.compose.ui.graphics.painter.b bVar, c cVar, boolean z11, q<? super e, ? super l, ? super Integer, h0> qVar, q<? super e, ? super l, ? super Integer, h0> qVar2, int i11, int i12, int i13) {
            super(2);
            this.f54381c = str;
            this.f54382d = fVar;
            this.f54383e = str2;
            this.f54384f = dVar;
            this.f54385g = kVar;
            this.f54386h = q1Var;
            this.f54387i = bVar;
            this.f54388j = cVar;
            this.f54389k = z11;
            this.f54390l = qVar;
            this.f54391m = qVar2;
            this.f54392n = i11;
            this.f54393o = i12;
            this.f54394p = i13;
        }

        public final void a(l lVar, int i11) {
            a.a(this.f54381c, this.f54382d, this.f54383e, this.f54384f, this.f54385g, this.f54386h, this.f54387i, this.f54388j, this.f54389k, this.f54390l, this.f54391m, lVar, k2.a(this.f54392n | 1), k2.a(this.f54393o), this.f54394p);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(String url, f imageLoader, String str, d dVar, k kVar, q1 q1Var, androidx.compose.ui.graphics.painter.b bVar, c cVar, boolean z11, q<? super e, ? super l, ? super Integer, h0> qVar, q<? super e, ? super l, ? super Integer, h0> qVar2, l lVar, int i11, int i12, int i13) {
        int i14;
        p013kotlin.jvm.internal.s.k(url, "url");
        p013kotlin.jvm.internal.s.k(imageLoader, "imageLoader");
        l lVarV = lVar.v(464230935);
        d dVar2 = (i13 & 8) != 0 ? d.INSTANCE : dVar;
        k kVarE = (i13 & 16) != 0 ? k.INSTANCE.e() : kVar;
        q1 q1Var2 = (i13 & 32) != 0 ? null : q1Var;
        androidx.compose.ui.graphics.painter.b bVar2 = (i13 & 64) != 0 ? null : bVar;
        c cVarE = (i13 & 128) != 0 ? c.INSTANCE.e() : cVar;
        boolean z12 = (i13 & 256) != 0 ? false : z11;
        q<? super e, ? super l, ? super Integer, h0> qVarA = (i13 & 512) != 0 ? o90.a.f96968a.a() : qVar;
        q<? super e, ? super l, ? super Integer, h0> qVarB = (i13 & 1024) != 0 ? o90.a.f96968a.b() : qVar2;
        if (o.J()) {
            i14 = i11;
            o.S(464230935, i14, i12, "com.stripe.android.uicore.image.StripeImage (StripeImage.kt:59)");
        } else {
            i14 = i11;
        }
        c cVar2 = cVarE;
        d dVar3 = dVar2;
        androidx.compose.ui.graphics.painter.b bVar3 = bVar2;
        q<? super e, ? super l, ? super Integer, h0> qVar3 = qVarB;
        k kVar2 = kVarE;
        C1090a c1090a = new C1090a(url, z12, bVar3, imageLoader, qVarA, qVar3, dVar3, str, cVar2, kVar2, q1Var2);
        q<? super e, ? super l, ? super Integer, h0> qVar4 = qVarA;
        q1 q1Var3 = q1Var2;
        v1.d.a(null, null, false, z2.c.b(lVarV, -1632138495, true, c1090a), lVarV, 3072, 7);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(url, imageLoader, str, dVar3, kVar2, q1Var3, bVar3, cVar2, z12, qVar4, qVar3, i14, i12, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, Integer> c(e eVar) {
        int iL = w4.b.l(eVar.getConstraints());
        w4.r.Companion companion = w4.r.INSTANCE;
        int iL2 = (iL <= w4.r.g(companion.a()) || w4.b.l(eVar.getConstraints()) >= ((int) h.INSTANCE.b())) ? -1 : w4.b.l(eVar.getConstraints());
        int iK = (w4.b.k(eVar.getConstraints()) <= w4.r.f(companion.a()) || w4.b.k(eVar.getConstraints()) >= ((int) h.INSTANCE.b())) ? -1 : w4.b.k(eVar.getConstraints());
        if (iL2 == -1) {
            iL2 = iK;
        }
        if (iK == -1) {
            iK = iL2;
        }
        return new Pair<>(Integer.valueOf(iL2), Integer.valueOf(iK));
    }
}
