package m60;

import androidx.compose.foundation.layout.t;
import androidx.compose.ui.focus.o;
import androidx.compose.ui.platform.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f90.n;
import i4.TextStyle;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.j1;
import p009i2.v2;
import p010i90.c0;
import p010i90.f1;
import p010i90.q0;
import p010i90.r1;
import p010i90.v1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p014n4.FontWeight;
import p020r2.Function0;
import p020r2.d4;
import p020r2.k2;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.x;
import p020r2.y2;
import p020r2.y3;
import v1.e0;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001ay\u0010\u001d\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a=\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0003¢\u0006\u0004\b!\u0010\"\u001aa\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b%\u0010&¨\u0006+²\u0006\f\u0010'\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\nX\u008a\u0084\u0002²\u0006\u000e\u0010(\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010*\u001a\u0004\u0018\u00010)8\nX\u008a\u0084\u0002"}, d2 = {"Lm60/c;", "viewModel", "", "enabled", "Lkotlin/Function1;", "Lm60/e;", "Ljn0/h0;", "onStateChanged", "Landroidx/compose/ui/d;", "modifier", "g", "(Lm60/c;ZLwn0/l;Landroidx/compose/ui/d;Lr2/l;II)V", "", "merchantName", "Li90/f1;", "sectionController", "Li90/v1;", "emailController", "Li90/q0;", "phoneNumberController", "nameController", "Lo60/b;", "signUpState", "expanded", "requiresNameCollection", "Lk60/b;", "errorMessage", "Lkotlin/Function0;", "toggleExpanded", "f", "(Ljava/lang/String;Li90/f1;Li90/v1;Li90/q0;Li90/v1;Lo60/b;ZZZLk60/b;Lwn0/a;Landroidx/compose/ui/d;Lr2/l;III)V", "", "contentAlpha", "a", "(Ljava/lang/String;ZZFLwn0/a;Lr2/l;I)V", "Landroidx/compose/ui/focus/o;", "emailFocusRequester", "b", "(ZZLo60/b;ZLk60/b;Li90/f1;Li90/v1;Li90/q0;Li90/v1;Landroidx/compose/ui/focus/o;Lr2/l;I)V", "viewState", "didShowAllFields", "Li90/c0;", "sectionError", "link_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f91438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.a<h0> aVar) {
            super(0);
            this.f91438c = aVar;
        }

        public final void b() {
            this.f91438c.invoke();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f91439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f91440d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f91441e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f91442f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f91443g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f91444h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z11, boolean z12, float f11, wn0.a<h0> aVar, int i11) {
            super(2);
            this.f91439c = str;
            this.f91440d = z11;
            this.f91441e = z12;
            this.f91442f = f11;
            this.f91443g = aVar;
            this.f91444h = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            h.a(this.f91439c, this.f91440d, this.f91441e, this.f91442f, this.f91443g, lVar, k2.a(this.f91444h | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo1/e;", "Ljn0/h0;", "a", "(Lo1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements q<p015o1.e, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v1 f91445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q0 f91446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ v1 f91447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o60.b f91448f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f91449g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f91450h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ k60.b f91451i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f91452j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ o f91453k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ y3<c0> f91454l;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p1<Boolean> f91455c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p1<Boolean> p1Var) {
                super(0);
                this.f91455c = p1Var;
            }

            public final void b() {
                h.d(this.f91455c, true);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(v1 v1Var, q0 q0Var, v1 v1Var2, o60.b bVar, boolean z11, boolean z12, k60.b bVar2, p1<Boolean> p1Var, o oVar, y3<c0> y3Var) {
            super(3);
            this.f91445c = v1Var;
            this.f91446d = q0Var;
            this.f91447e = v1Var2;
            this.f91448f = bVar;
            this.f91449g = z11;
            this.f91450h = z12;
            this.f91451i = bVar2;
            this.f91452j = p1Var;
            this.f91453k = oVar;
            this.f91454l = y3Var;
        }

        public final void a(p015o1.e AnimatedVisibility, p020r2.l lVar, int i11) {
            s.k(AnimatedVisibility, "$this$AnimatedVisibility");
            if (p020r2.o.J()) {
                p020r2.o.S(-195510504, i11, -1, "com.stripe.android.link.ui.inline.LinkFields.<anonymous> (LinkInlineSignup.kt:235)");
            }
            float f11 = 16;
            androidx.compose.ui.d dVarM = t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f11), BitmapDescriptorFactory.HUE_RED, w4.h.g(f11), w4.h.g(f11), 2, null);
            v1 v1Var = this.f91445c;
            q0 q0Var = this.f91446d;
            v1 v1Var2 = this.f91447e;
            o60.b bVar = this.f91448f;
            boolean z11 = this.f91449g;
            boolean z12 = this.f91450h;
            k60.b bVar2 = this.f91451i;
            p1<Boolean> p1Var = this.f91452j;
            o oVar = this.f91453k;
            y3<c0> y3Var = this.f91454l;
            lVar.H(-483455358);
            i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVar, 0);
            lVar.H(-1323940314);
            int iA = p020r2.j.a(lVar, 0);
            x xVarC = lVar.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarM);
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarA, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            c0 c0VarE = h.e(y3Var);
            Integer numValueOf = c0VarE != null ? Integer.valueOf(c0VarE.getErrorMessage()) : null;
            boolean zC = h.c(p1Var);
            lVar.H(-574101848);
            boolean zN = lVar.n(p1Var);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(p1Var);
                lVar.B(objI);
            }
            lVar.T();
            m60.g.a(numValueOf, v1Var, q0Var, v1Var2, bVar, z11, false, z12, bVar2, zC, (wn0.a) objI, null, oVar, null, null, lVar, (q0.f76828s << 6) | 1577024, 0, 26624);
            p015o1.d.e(jVar, bVar == o60.b.InputtingRemainingFields, null, null, null, null, m60.b.f91323a.a(), lVar, 1572870, 30);
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(p015o1.e eVar, p020r2.l lVar, Integer num) {
            a(eVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f91456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f91457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ o60.b f91458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f91459f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k60.b f91460g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f1 f91461h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ v1 f91462i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q0 f91463j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ v1 f91464k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ o f91465l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f91466m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z11, boolean z12, o60.b bVar, boolean z13, k60.b bVar2, f1 f1Var, v1 v1Var, q0 q0Var, v1 v1Var2, o oVar, int i11) {
            super(2);
            this.f91456c = z11;
            this.f91457d = z12;
            this.f91458e = bVar;
            this.f91459f = z13;
            this.f91460g = bVar2;
            this.f91461h = f1Var;
            this.f91462i = v1Var;
            this.f91463j = q0Var;
            this.f91464k = v1Var2;
            this.f91465l = oVar;
            this.f91466m = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            h.b(this.f91456c, this.f91457d, this.f91458e, this.f91459f, this.f91460g, this.f91461h, this.f91462i, this.f91463j, this.f91464k, this.f91465l, lVar, k2.a(this.f91466m | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/p1;", "", "b", "()Lr2/p1;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.a<p1<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f91467c = new e();

        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p1<Boolean> invoke() {
            return s3.d(Boolean.FALSE, null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$1$1", f = "LinkInlineSignup.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f91468n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ wn0.l<InlineSignupViewState, h0> f91469o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ y3<InlineSignupViewState> f91470p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(wn0.l<? super InlineSignupViewState, h0> lVar, y3<InlineSignupViewState> y3Var, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f91469o = lVar;
            this.f91470p = y3Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new f(this.f91469o, this.f91470p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f91468n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f91469o.invoke(h.h(this.f91470p));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$2", f = "LinkInlineSignup.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f91471n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ i3.f f91472o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ o4.q0 f91473p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ y3<InlineSignupViewState> f91474q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(i3.f fVar, o4.q0 q0Var, y3<InlineSignupViewState> y3Var, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f91472o = fVar;
            this.f91473p = q0Var;
            this.f91474q = y3Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new g(this.f91472o, this.f91473p, this.f91474q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f91471n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            if (h.h(this.f91474q).getSignUpState() == o60.b.InputtingPrimaryField && h.h(this.f91474q).getUserInput() != null) {
                this.f91472o.r(true);
                o4.q0 q0Var = this.f91473p;
                if (q0Var != null) {
                    q0Var.b();
                }
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: m60.h$h, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C1954h extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
        C1954h(Object obj) {
            super(0, obj, m60.c.class, "toggleExpanded", "toggleExpanded()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            o();
            return h0.f84049a;
        }

        public final void o() {
            ((m60.c) this.receiver).A();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class i extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m60.c f91475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f91476d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.l<InlineSignupViewState, h0> f91477e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f91478f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f91479g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f91480h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(m60.c cVar, boolean z11, wn0.l<? super InlineSignupViewState, h0> lVar, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f91475c = cVar;
            this.f91476d = z11;
            this.f91477e = lVar;
            this.f91478f = dVar;
            this.f91479g = i11;
            this.f91480h = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            h.g(this.f91475c, this.f91476d, this.f91477e, this.f91478f, lVar, k2.a(this.f91479g | 1), this.f91480h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$5$1", f = "LinkInlineSignup.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f91481n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f91482o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ o f91483p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z11, o oVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f91482o = z11;
            this.f91483p = oVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new j(this.f91482o, this.f91483p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f91481n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            if (this.f91482o) {
                this.f91483p.f();
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li3/o;", "state", "Ljn0/h0;", "a", "(Li3/o;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends u implements wn0.l<i3.o, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f91484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f91485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ z1.b f91486e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$6$1", f = "LinkInlineSignup.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f91487n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ z1.b f91488o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z1.b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f91488o = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f91488o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f91487n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    z1.b bVar = this.f91488o;
                    this.f91487n = 1;
                    if (z1.b.a(bVar, null, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z11, CoroutineScope coroutineScope, z1.b bVar) {
            super(1);
            this.f91484c = z11;
            this.f91485d = coroutineScope;
            this.f91486e = bVar;
        }

        public final void a(i3.o state) {
            s.k(state, "state");
            if (state.getHasFocus() && this.f91484c) {
                BuildersKt__Builders_commonKt.launch$default(this.f91485d, null, null, new a(this.f91486e, null), 3, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(i3.o oVar) {
            a(oVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class l extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f91489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f1 f91490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ v1 f91491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q0 f91492f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ v1 f91493g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o60.b f91494h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f91495i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f91496j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f91497k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ k60.b f91498l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f91499m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f91500n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f91501o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f91502p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f91503q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, f1 f1Var, v1 v1Var, q0 q0Var, v1 v1Var2, o60.b bVar, boolean z11, boolean z12, boolean z13, k60.b bVar2, wn0.a<h0> aVar, androidx.compose.ui.d dVar, int i11, int i12, int i13) {
            super(2);
            this.f91489c = str;
            this.f91490d = f1Var;
            this.f91491e = v1Var;
            this.f91492f = q0Var;
            this.f91493g = v1Var2;
            this.f91494h = bVar;
            this.f91495i = z11;
            this.f91496j = z12;
            this.f91497k = z13;
            this.f91498l = bVar2;
            this.f91499m = aVar;
            this.f91500n = dVar;
            this.f91501o = i11;
            this.f91502p = i12;
            this.f91503q = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            h.f(this.f91489c, this.f91490d, this.f91491e, this.f91492f, this.f91493g, this.f91494h, this.f91495i, this.f91496j, this.f91497k, this.f91498l, this.f91499m, this.f91500n, lVar, k2.a(this.f91501o | 1), k2.a(this.f91502p), this.f91503q);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(String str, boolean z11, boolean z12, float f11, wn0.a<h0> aVar, p020r2.l lVar, int i11) {
        String str2;
        int i12;
        boolean z13;
        p020r2.l lVar2;
        p020r2.l lVarV = lVar.v(136966845);
        if ((i11 & 14) == 0) {
            str2 = str;
            i12 = (lVarV.n(str2) ? 4 : 2) | i11;
        } else {
            str2 = str;
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.p(z11) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            z13 = z12;
            i12 |= lVarV.p(z13) ? 256 : 128;
        } else {
            z13 = z12;
        }
        if ((i11 & 7168) == 0) {
            i12 |= lVarV.q(f11) ? 2048 : 1024;
        }
        if ((i11 & 57344) == 0) {
            i12 |= lVarV.K(aVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((46811 & i12) == 9362 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(136966845, i12, -1, "com.stripe.android.link.ui.inline.LinkCheckbox (LinkInlineSignup.kt:186)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            lVarV.H(-1521076051);
            boolean z14 = (i12 & 57344) == 16384;
            Object objI = lVarV.I();
            if (z14 || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(aVar);
                lVarV.B(objI);
            }
            lVarV.T();
            androidx.compose.ui.d dVarI = t.i(androidx.compose.foundation.d.d(companion, z13, null, null, (wn0.a) objI, 6, null), w4.h.g(16));
            lVarV.H(693286680);
            v1.b bVar = v1.b.f117444a;
            v1.b.e eVarF = bVar.f();
            d3.c.Companion companion2 = d3.c.INSTANCE;
            i0 i0VarB = e0.b(eVarF, companion2.l(), lVarV, 0);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            x xVarC = lVarV.c();
            b4.g.Companion companion3 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion3.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarI);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarB, companion3.c());
            d4.b(lVarA, xVarC, companion3.e());
            p<b4.g, Integer, h0> pVarB = companion3.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            l90.a.a(z11, null, t.m(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.h.g(8), BitmapDescriptorFactory.HUE_RED, 11, null), z12, lVarV, ((i12 >> 3) & 14) | 432 | ((i12 << 3) & 7168), 0);
            lVarV.H(-483455358);
            i0 i0VarA = v1.g.a(bVar.g(), companion2.k(), lVarV, 0);
            lVarV.H(-1323940314);
            int iA2 = p020r2.j.a(lVarV, 0);
            x xVarC2 = lVarV.c();
            wn0.a<b4.g> aVarA2 = companion3.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA2 = a0.a(companion);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarA, companion3.c());
            d4.b(lVarA2, xVarC2, companion3.e());
            p<b4.g, Integer, h0> pVarB2 = companion3.b();
            if (lVarA2.getInserting() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            String strC = e4.i.c(c60.i.f18822a, lVarV, 0);
            j1 j1Var = j1.f74525a;
            int i13 = j1.f74526b;
            lVar2 = lVarV;
            v2.b(strC, null, k3.p1.p(j1Var.a(lVarV, i13).i(), f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.e(j1Var.c(lVarV, i13).getBody1(), 0L, 0L, FontWeight.INSTANCE.a(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777211, null), lVar2, 0, 0, 65530);
            v2.b(e4.i.d(c60.i.f18825d, new Object[]{str2}, lVar2, 64), t.m(androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(4), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), n.n(j1Var, lVar2, i13).getSubtitle(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var.c(lVar2, i13).getBody1(), lVar2, 48, 0, 65528);
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new b(str2, z11, z12, f11, aVar, i11));
        }
    }

    public static final void b(boolean z11, boolean z12, o60.b signUpState, boolean z13, k60.b bVar, f1 sectionController, v1 emailController, q0 phoneNumberController, v1 nameController, o emailFocusRequester, p020r2.l lVar, int i11) {
        s.k(signUpState, "signUpState");
        s.k(sectionController, "sectionController");
        s.k(emailController, "emailController");
        s.k(phoneNumberController, "phoneNumberController");
        s.k(nameController, "nameController");
        s.k(emailFocusRequester, "emailFocusRequester");
        p020r2.l lVarV = lVar.v(1587095792);
        if (p020r2.o.J()) {
            p020r2.o.S(1587095792, i11, -1, "com.stripe.android.link.ui.inline.LinkFields (LinkInlineSignup.kt:229)");
        }
        p015o1.d.f(z11, null, null, null, null, z2.c.b(lVarV, -195510504, true, new c(emailController, phoneNumberController, nameController, signUpState, z12, z13, bVar, (p1) a3.b.c(new Object[0], null, null, e.f91467c, lVarV, 3080, 6), emailFocusRequester, r90.f.a(sectionController.a(), lVarV, 8))), lVarV, (i11 & 14) | 196608, 30);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(z11, z12, signUpState, z13, bVar, sectionController, emailController, phoneNumberController, nameController, emailFocusRequester, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(p1<Boolean> p1Var) {
        return p1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(p1<Boolean> p1Var, boolean z11) {
        p1Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 e(y3<c0> y3Var) {
        return y3Var.getValue();
    }

    public static final void f(String merchantName, f1 sectionController, v1 emailController, q0 phoneNumberController, v1 nameController, o60.b signUpState, boolean z11, boolean z12, boolean z13, k60.b bVar, wn0.a<h0> toggleExpanded, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12, int i13) {
        float fB;
        s.k(merchantName, "merchantName");
        s.k(sectionController, "sectionController");
        s.k(emailController, "emailController");
        s.k(phoneNumberController, "phoneNumberController");
        s.k(nameController, "nameController");
        s.k(signUpState, "signUpState");
        s.k(toggleExpanded, "toggleExpanded");
        p020r2.l lVarV = lVar.v(27226494);
        androidx.compose.ui.d dVar2 = (i13 & 2048) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        if (p020r2.o.J()) {
            p020r2.o.S(27226494, i11, i12, "com.stripe.android.link.ui.inline.LinkInlineSignup (LinkInlineSignup.kt:117)");
        }
        lVarV.H(773894976);
        lVarV.H(-492369756);
        Object objI = lVarV.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            p020r2.a0 a0Var = new p020r2.a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVarV));
            lVarV.B(a0Var);
            objI = a0Var;
        }
        lVarV.T();
        CoroutineScope coroutineScope = ((p020r2.a0) objI).getCoroutineScope();
        lVarV.T();
        lVarV.H(-98328252);
        Object objI2 = lVarV.I();
        if (objI2 == companion.a()) {
            objI2 = new o();
            lVarV.B(objI2);
        }
        o oVar = (o) objI2;
        lVarV.T();
        lVarV.H(-98325908);
        Object objI3 = lVarV.I();
        if (objI3 == companion.a()) {
            objI3 = androidx.compose.foundation.relocation.b.a();
            lVarV.B(objI3);
        }
        z1.b bVar2 = (z1.b) objI3;
        lVarV.T();
        Boolean boolValueOf = Boolean.valueOf(z12);
        lVarV.H(-98323681);
        boolean z14 = (((i11 & 29360128) ^ 12582912) > 8388608 && lVarV.p(z12)) || (i11 & 12582912) == 8388608;
        Object objI4 = lVarV.I();
        if (z14 || objI4 == companion.a()) {
            objI4 = new j(z12, oVar, null);
            lVarV.B(objI4);
        }
        lVarV.T();
        int i14 = (i11 >> 21) & 14;
        Function0.g(boolValueOf, (p) objI4, lVarV, i14 | 64);
        if (z11) {
            lVarV.H(-98319317);
            fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
        } else {
            lVarV.H(-98318577);
            fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
        }
        lVarV.T();
        j1 j1Var = j1.f74525a;
        int i15 = j1.f74526b;
        androidx.compose.ui.d dVarB = androidx.compose.foundation.relocation.b.b(androidx.compose.ui.focus.e.a(androidx.compose.foundation.b.c(q1.e.e(dVar2, n.e(j1Var, false, lVarV, i15 | 48), n.o(j1Var, lVarV, i15).e()), n.n(j1Var, lVarV, i15).getComponent(), n.o(j1Var, lVarV, i15).e()), new k(z12, coroutineScope, bVar2)), bVar2);
        lVarV.H(733328855);
        d3.c.Companion companion2 = d3.c.INSTANCE;
        i0 i0VarJ = androidx.compose.foundation.layout.g.j(companion2.o(), false, lVarV, 0);
        lVarV.H(-1323940314);
        int iA = p020r2.j.a(lVarV, 0);
        x xVarC = lVarV.c();
        b4.g.Companion companion3 = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion3.a();
        q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarB);
        if (lVarV.w() == null) {
            p020r2.j.c();
        }
        lVarV.h();
        if (lVarV.getInserting()) {
            lVarV.z(aVarA);
        } else {
            lVarV.d();
        }
        p020r2.l lVarA = d4.a(lVarV);
        d4.b(lVarA, i0VarJ, companion3.c());
        d4.b(lVarA, xVarC, companion3.e());
        p<b4.g, Integer, h0> pVarB = companion3.b();
        if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
        androidx.compose.ui.d dVarA = h3.a.a(h3.e.a(androidx.compose.foundation.layout.x.h(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), n.o(j1Var, lVarV, i15).e()), fB);
        lVarV.H(-483455358);
        i0 i0VarA = v1.g.a(v1.b.f117444a.g(), companion2.k(), lVarV, 0);
        lVarV.H(-1323940314);
        int iA2 = p020r2.j.a(lVarV, 0);
        x xVarC2 = lVarV.c();
        wn0.a<b4.g> aVarA2 = companion3.a();
        q<y2<b4.g>, p020r2.l, Integer, h0> qVarA2 = a0.a(dVarA);
        if (lVarV.w() == null) {
            p020r2.j.c();
        }
        lVarV.h();
        if (lVarV.getInserting()) {
            lVarV.z(aVarA2);
        } else {
            lVarV.d();
        }
        p020r2.l lVarA2 = d4.a(lVarV);
        d4.b(lVarA2, i0VarA, companion3.c());
        d4.b(lVarA2, xVarC2, companion3.e());
        p<b4.g, Integer, h0> pVarB2 = companion3.b();
        if (lVarA2.getInserting() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
            lVarA2.B(Integer.valueOf(iA2));
            lVarA2.f(Integer.valueOf(iA2), pVarB2);
        }
        qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        v1.j jVar = v1.j.f117505a;
        a(merchantName, z12, z11, fB, toggleExpanded, lVarV, (i11 & 14) | ((i11 >> 18) & 112) | ((i11 >> 12) & 896) | ((i12 << 12) & 57344));
        int i16 = i11 >> 15;
        int i17 = i14 | 941621248 | (i16 & 112) | ((i11 >> 9) & 896) | (i16 & 7168) | (i16 & 57344) | (f1.f76526c << 15);
        int i18 = i11 << 12;
        b(z12, z11, signUpState, z13, bVar, sectionController, emailController, phoneNumberController, nameController, oVar, lVarV, i17 | (458752 & i18) | (q0.f76828s << 21) | (i18 & 29360128));
        lVarV.T();
        lVarV.g();
        lVarV.T();
        lVarV.T();
        lVarV.T();
        lVarV.g();
        lVarV.T();
        lVarV.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new l(merchantName, sectionController, emailController, phoneNumberController, nameController, signUpState, z11, z12, z13, bVar, toggleExpanded, dVar2, i11, i12, i13));
        }
    }

    public static final void g(m60.c viewModel, boolean z11, wn0.l<? super InlineSignupViewState, h0> onStateChanged, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        s.k(viewModel, "viewModel");
        s.k(onStateChanged, "onStateChanged");
        p020r2.l lVarV = lVar.v(762633745);
        androidx.compose.ui.d dVar2 = (i12 & 8) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        if (p020r2.o.J()) {
            p020r2.o.S(762633745, i11, -1, "com.stripe.android.link.ui.inline.LinkInlineSignup (LinkInlineSignup.kt:67)");
        }
        y3 y3VarA = r90.f.a(viewModel.v(), lVarV, 8);
        y3 y3VarA2 = r90.f.a(viewModel.p(), lVarV, 8);
        InlineSignupViewState inlineSignupViewStateH = h(y3VarA);
        lVarV.H(-98379888);
        boolean zN = ((((i11 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && lVarV.n(onStateChanged)) || (i11 & KyberEngine.KyberPolyBytes) == 256) | lVarV.n(y3VarA);
        Object objI = lVarV.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            objI = new f(onStateChanged, y3VarA, null);
            lVarV.B(objI);
        }
        lVarV.T();
        Function0.g(inlineSignupViewStateH, (p) objI, lVarV, 72);
        Function0.g(h(y3VarA).getSignUpState(), new g((i3.f) lVarV.U(z0.h()), (o4.q0) lVarV.U(z0.r()), y3VarA, null), lVarV, 64);
        String merchantName = h(y3VarA).getMerchantName();
        f1 sectionController = viewModel.getSectionController();
        r1 emailController = viewModel.getEmailController();
        q0 phoneController = viewModel.getPhoneController();
        r1 nameController = viewModel.getNameController();
        o60.b signUpState = h(y3VarA).getSignUpState();
        boolean isExpanded = h(y3VarA).getIsExpanded();
        boolean zS = viewModel.s();
        k60.b bVarI = i(y3VarA2);
        C1954h c1954h = new C1954h(viewModel);
        int i13 = f1.f76526c << 3;
        int i14 = r1.f76877x;
        f(merchantName, sectionController, emailController, phoneController, nameController, signUpState, z11, isExpanded, zS, bVarI, c1954h, dVar2, lVarV, i13 | (i14 << 6) | (q0.f76828s << 9) | (i14 << 12) | ((i11 << 15) & 3670016), (i11 >> 6) & 112, 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new i(viewModel, z11, onStateChanged, dVar2, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InlineSignupViewState h(y3<InlineSignupViewState> y3Var) {
        return y3Var.getValue();
    }

    private static final k60.b i(y3<? extends k60.b> y3Var) {
        return y3Var.getValue();
    }
}
