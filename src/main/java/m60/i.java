package m60;

import androidx.compose.foundation.layout.x;
import androidx.compose.ui.focus.o;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import f90.n;
import g4.v;
import g4.y;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import o4.q0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p009i2.e1;
import p009i2.j1;
import p010i90.Function1;
import p010i90.c0;
import p010i90.f1;
import p010i90.r1;
import p010i90.v1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.d4;
import p020r2.k2;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.y2;
import p020r2.y3;
import v1.e0;
import v1.g0;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001ac\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00022\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010 H\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020\u0006H\u0001¢\u0006\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*²\u0006\f\u0010&\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u00178\nX\u008a\u0084\u0002²\u0006\u000e\u0010'\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u0004\u0018\u00010(8\nX\u008a\u0084\u0002"}, d2 = {"Lm60/c;", "viewModel", "", "enabled", "Lkotlin/Function1;", "Lm60/e;", "Ljn0/h0;", "onStateChanged", "Landroidx/compose/ui/d;", "modifier", DateTokenConverter.CONVERTER_KEY, "(Lm60/c;ZLwn0/l;Landroidx/compose/ui/d;Lr2/l;II)V", "Li90/f1;", "sectionController", "Li90/v1;", "emailController", "Li90/q0;", "phoneNumberController", "nameController", "isShowingPhoneFirst", "Lo60/b;", "signUpState", "requiresNameCollection", "Lk60/b;", "errorMessage", "c", "(Li90/f1;Li90/v1;Li90/q0;Li90/v1;ZLo60/b;ZZLk60/b;Landroidx/compose/ui/d;Lr2/l;II)V", "Lo4/r;", "imeAction", "Landroidx/compose/ui/focus/o;", "focusRequester", "requestFocusWhenShown", "Lkotlin/Function0;", "trailingIcon", "a", "(ZLi90/v1;Lo60/b;ILandroidx/compose/ui/focus/o;ZLwn0/p;Lr2/l;II)V", "b", "(Lr2/l;I)V", "viewState", "didShowAllFields", "Li90/c0;", "sectionError", "link_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f91504c = new a();

        a() {
            super(1);
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
            v.q0(semantics, "CircularProgressIndicator");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$EmailCollection$3$1", f = "LinkOptionalInlineSignup.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f91505n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f91506o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ o f91507p;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<Throwable, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ o f91508c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o oVar) {
                super(1);
                this.f91508c = oVar;
            }

            public final void a(Throwable th2) {
                this.f91508c.f();
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
                a(th2);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o oVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f91507p = oVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f91507p, continuation);
            bVar.f91506o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f91505n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            JobKt.getJob(((CoroutineScope) this.f91506o).getCoroutineContext()).invokeOnCompletion(new a(this.f91507p));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f91509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v1 f91510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ o60.b f91511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f91512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f91513g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f91514h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f91515i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f91516j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f91517k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z11, v1 v1Var, o60.b bVar, int i11, o oVar, boolean z12, p<? super p020r2.l, ? super Integer, h0> pVar, int i12, int i13) {
            super(2);
            this.f91509c = z11;
            this.f91510d = v1Var;
            this.f91511e = bVar;
            this.f91512f = i11;
            this.f91513g = oVar;
            this.f91514h = z12;
            this.f91515i = pVar;
            this.f91516j = i12;
            this.f91517k = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            i.a(this.f91509c, this.f91510d, this.f91511e, this.f91512f, this.f91513g, this.f91514h, this.f91515i, lVar, k2.a(this.f91516j | 1), this.f91517k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f91518c = new d();

        d() {
            super(1);
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
            v.q0(semantics, "LinkLogoIcon");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f91519c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11) {
            super(2);
            this.f91519c = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            i.b(lVar, k2.a(this.f91519c | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1", f = "LinkOptionalInlineSignup.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f91520n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ wn0.l<InlineSignupViewState, h0> f91521o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ y3<InlineSignupViewState> f91522p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(wn0.l<? super InlineSignupViewState, h0> lVar, y3<InlineSignupViewState> y3Var, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f91521o = lVar;
            this.f91522p = y3Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new f(this.f91521o, this.f91522p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f91520n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            this.f91521o.invoke(i.e(this.f91522p));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$LinkOptionalInlineSignup$2", f = "LinkOptionalInlineSignup.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f91523n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ i3.f f91524o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ q0 f91525p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ y3<InlineSignupViewState> f91526q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(i3.f fVar, q0 q0Var, y3<InlineSignupViewState> y3Var, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f91524o = fVar;
            this.f91525p = q0Var;
            this.f91526q = y3Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new g(this.f91524o, this.f91525p, this.f91526q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f91523n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            if (i.e(this.f91526q).getSignUpState() == o60.b.InputtingPrimaryField && i.e(this.f91526q).getUserInput() != null) {
                this.f91524o.r(true);
                q0 q0Var = this.f91525p;
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m60.c f91527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f91528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.l<InlineSignupViewState, h0> f91529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f91530f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f91531g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f91532h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(m60.c cVar, boolean z11, wn0.l<? super InlineSignupViewState, h0> lVar, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f91527c = cVar;
            this.f91528d = z11;
            this.f91529e = lVar;
            this.f91530f = dVar;
            this.f91531g = i11;
            this.f91532h = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            i.d(this.f91527c, this.f91528d, this.f91529e, this.f91530f, lVar, k2.a(this.f91531g | 1), this.f91532h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: m60.i$i, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$LinkOptionalInlineSignup$4$1", f = "LinkOptionalInlineSignup.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    static final class C1955i extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f91533n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ z1.b f91534o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ v1 f91535p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f91536q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ o f91537r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ o f91538s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ o f91539t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f91540u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1955i(z1.b bVar, v1 v1Var, boolean z11, o oVar, o oVar2, o oVar3, boolean z12, Continuation<? super C1955i> continuation) {
            super(2, continuation);
            this.f91534o = bVar;
            this.f91535p = v1Var;
            this.f91536q = z11;
            this.f91537r = oVar;
            this.f91538s = oVar2;
            this.f91539t = oVar3;
            this.f91540u = z12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C1955i(this.f91534o, this.f91535p, this.f91536q, this.f91537r, this.f91538s, this.f91539t, this.f91540u, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f91533n;
            o oVar = null;
            boolean z11 = true;
            if (i11 == 0) {
                t.b(obj);
                z1.b bVar = this.f91534o;
                this.f91533n = 1;
                if (z1.b.a(bVar, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            String initialValue = this.f91535p.getInitialValue();
            boolean z12 = initialValue == null || p013kotlin.text.t.y0(initialValue);
            String initialValue2 = this.f91535p.getInitialValue();
            if (initialValue2 != null && !p013kotlin.text.t.y0(initialValue2)) {
                z11 = false;
            }
            boolean z13 = this.f91536q;
            if (z13 && z12) {
                oVar = this.f91537r;
            } else if (z13 || !z11) {
                o oVar2 = this.f91539t;
                if (this.f91540u) {
                    oVar = oVar2;
                }
            } else {
                oVar = this.f91538s;
            }
            if (oVar != null) {
                oVar.f();
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C1955i) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class j extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f91541c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(p1<Boolean> p1Var) {
            super(0);
            this.f91541c = p1Var;
        }

        public final void b() {
            i.h(this.f91541c, true);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/p1;", "", "b", "()Lr2/p1;"}, k = 3, mv = {1, 9, 0})
    static final class k extends u implements wn0.a<p1<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f91542c = new k();

        k() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p1<Boolean> invoke() {
            return s3.d(Boolean.FALSE, null, 2, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class l extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f1 f91543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v1 f91544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p010i90.q0 f91545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ v1 f91546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f91547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o60.b f91548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f91549i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f91550j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ k60.b f91551k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f91552l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f91553m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f91554n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(f1 f1Var, v1 v1Var, p010i90.q0 q0Var, v1 v1Var2, boolean z11, o60.b bVar, boolean z12, boolean z13, k60.b bVar2, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f91543c = f1Var;
            this.f91544d = v1Var;
            this.f91545e = q0Var;
            this.f91546f = v1Var2;
            this.f91547g = z11;
            this.f91548h = bVar;
            this.f91549i = z12;
            this.f91550j = z13;
            this.f91551k = bVar2;
            this.f91552l = dVar;
            this.f91553m = i11;
            this.f91554n = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            i.c(this.f91543c, this.f91544d, this.f91545e, this.f91546f, this.f91547g, this.f91548h, this.f91549i, this.f91550j, this.f91551k, this.f91552l, lVar, k2.a(this.f91553m | 1), this.f91554n);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(boolean z11, v1 emailController, o60.b signUpState, int i11, o oVar, boolean z12, p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i12, int i13) {
        o oVar2;
        s.k(emailController, "emailController");
        s.k(signUpState, "signUpState");
        p020r2.l lVarV = lVar.v(1243429650);
        if ((i13 & 16) != 0) {
            lVarV.H(-1492093893);
            Object objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = new o();
                lVarV.B(objI);
            }
            lVarV.T();
            oVar2 = (o) objI;
        } else {
            oVar2 = oVar;
        }
        boolean z13 = (i13 & 32) != 0 ? false : z12;
        p<? super p020r2.l, ? super Integer, h0> pVar2 = (i13 & 64) != 0 ? null : pVar;
        if (p020r2.o.J()) {
            p020r2.o.S(1243429650, i12, -1, "com.stripe.android.link.ui.inline.EmailCollection (LinkOptionalInlineSignup.kt:173)");
        }
        androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
        androidx.compose.ui.d dVarH = x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
        d3.c.InterfaceC1212c interfaceC1212cI = d3.c.INSTANCE.i();
        lVarV.H(693286680);
        i0 i0VarB = e0.b(v1.b.f117444a.f(), interfaceC1212cI, lVarV, 48);
        lVarV.H(-1323940314);
        int iA = p020r2.j.a(lVarV, 0);
        p020r2.x xVarC = lVarV.c();
        b4.g.Companion companion2 = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion2.a();
        q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarH);
        if (lVarV.w() == null) {
            p020r2.j.c();
        }
        lVarV.h();
        if (lVarV.u()) {
            lVarV.z(aVarA);
        } else {
            lVarV.d();
        }
        p020r2.l lVarA = d4.a(lVarV);
        d4.b(lVarA, i0VarB, companion2.c());
        d4.b(lVarA, xVarC, companion2.e());
        p<b4.g, Integer, h0> pVarB = companion2.b();
        if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        Function1.c(emailController, z11, i11, androidx.compose.ui.focus.p.a(g0.c(v1.h0.f117504a, companion, 1.0f, false, 2, null), oVar2), null, 0, 0, null, lVarV, ((i12 << 3) & 112) | 8 | ((i12 >> 3) & 896), EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        p020r2.l lVar2 = lVarV;
        lVar2.H(-1293866320);
        if (signUpState == o60.b.VerifyingEmail) {
            float f11 = 8;
            w80.d.a(g4.o.d(androidx.compose.foundation.layout.t.l(x.q(companion, w4.h.g(32)), w4.h.g(0), w4.h.g(f11), w4.h.g(16), w4.h.g(f11)), false, a.f91504c, 1, null), j1.f74525a.a(lVar2, j1.f74526b).j(), w4.h.g(2), 0L, 0, lVar2, KyberEngine.KyberPolyBytes, 24);
            lVar2 = lVar2;
        }
        lVar2.T();
        lVar2.H(-1293851067);
        if (pVar2 != null) {
            pVar2.invoke(lVar2, Integer.valueOf((i12 >> 18) & 14));
        }
        lVar2.T();
        lVar2.T();
        lVar2.g();
        lVar2.T();
        lVar2.T();
        if (z13) {
            h0 h0Var = h0.f84049a;
            lVar2.H(-1492059269);
            boolean z14 = (((57344 & i12) ^ 24576) > 16384 && lVar2.n(oVar2)) || (i12 & 24576) == 16384;
            Object objI2 = lVar2.I();
            if (z14 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new b(oVar2, null);
                lVar2.B(objI2);
            }
            lVar2.T();
            Function0.g(h0Var, (p) objI2, lVar2, 70);
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new c(z11, emailController, signUpState, i11, oVar2, z13, pVar2, i12, i13));
        }
    }

    public static final void b(p020r2.l lVar, int i11) {
        p020r2.l lVarV = lVar.v(-2039774832);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-2039774832, i11, -1, "com.stripe.android.link.ui.inline.LinkLogo (LinkOptionalInlineSignup.kt:213)");
            }
            e1.a(e4.e.c(n.s(n.n(j1.f74525a, lVarV, j1.f74526b).getComponent()) ? c60.h.f18820b : c60.h.f18821c, lVarV, 0), e4.i.c(c60.i.f18823b, lVarV, 0), g4.o.d(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, 11, null), false, d.f91518c, 1, null), k3.p1.INSTANCE.j(), lVarV, 3080, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(i11));
        }
    }

    public static final void c(f1 sectionController, v1 emailController, p010i90.q0 phoneNumberController, v1 nameController, boolean z11, o60.b signUpState, boolean z12, boolean z13, k60.b bVar, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        z1.b bVar2;
        p1 p1Var;
        o oVar;
        s.k(sectionController, "sectionController");
        s.k(emailController, "emailController");
        s.k(phoneNumberController, "phoneNumberController");
        s.k(nameController, "nameController");
        s.k(signUpState, "signUpState");
        p020r2.l lVarV = lVar.v(-198300985);
        androidx.compose.ui.d dVar2 = (i12 & 512) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        if (p020r2.o.J()) {
            p020r2.o.S(-198300985, i11, -1, "com.stripe.android.link.ui.inline.LinkOptionalInlineSignup (LinkOptionalInlineSignup.kt:107)");
        }
        lVarV.H(-483455358);
        i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
        lVarV.H(-1323940314);
        int iA = p020r2.j.a(lVarV, 0);
        p020r2.x xVarC = lVarV.c();
        b4.g.Companion companion = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion.a();
        q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVar2);
        if (lVarV.w() == null) {
            p020r2.j.c();
        }
        lVarV.h();
        if (lVarV.u()) {
            lVarV.z(aVarA);
        } else {
            lVarV.d();
        }
        p020r2.l lVarA = d4.a(lVarV);
        d4.b(lVarA, i0VarA, companion.c());
        d4.b(lVarA, xVarC, companion.e());
        p<b4.g, Integer, h0> pVarB = companion.b();
        if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        v1.j jVar = v1.j.f117505a;
        lVarV.H(726211115);
        Object objI = lVarV.I();
        p020r2.l.Companion companion2 = p020r2.l.INSTANCE;
        if (objI == companion2.a()) {
            objI = androidx.compose.foundation.relocation.b.a();
            lVarV.B(objI);
        }
        z1.b bVar3 = (z1.b) objI;
        lVarV.T();
        lVarV.H(726213411);
        Object objI2 = lVarV.I();
        if (objI2 == companion2.a()) {
            objI2 = new o();
            lVarV.B(objI2);
        }
        o oVar2 = (o) objI2;
        lVarV.T();
        lVarV.H(726215459);
        Object objI3 = lVarV.I();
        if (objI3 == companion2.a()) {
            objI3 = new o();
            lVarV.B(objI3);
        }
        o oVar3 = (o) objI3;
        lVarV.T();
        lVarV.H(726217475);
        Object objI4 = lVarV.I();
        if (objI4 == companion2.a()) {
            objI4 = new o();
            lVarV.B(objI4);
        }
        o oVar4 = (o) objI4;
        lVarV.T();
        p1 p1Var2 = (p1) a3.b.c(new Object[0], null, null, k.f91542c, lVarV, 3080, 6);
        y3 y3VarA = r90.f.a(sectionController.a(), lVarV, 8);
        lVarV.H(726224087);
        if (signUpState == o60.b.InputtingRemainingFields) {
            bVar2 = bVar3;
            p1Var = p1Var2;
            oVar = oVar2;
            Function0.g(signUpState, new C1955i(bVar2, emailController, z11, oVar, oVar3, oVar4, z13, null), lVarV, ((i11 >> 15) & 14) | 64);
        } else {
            bVar2 = bVar3;
            p1Var = p1Var2;
            oVar = oVar2;
        }
        lVarV.T();
        c0 c0VarI = i(y3VarA);
        Integer numValueOf = c0VarI != null ? Integer.valueOf(c0VarI.getErrorMessage()) : null;
        o oVar5 = oVar;
        boolean zG = g(p1Var);
        lVarV.H(726270241);
        boolean zN = lVarV.n(p1Var);
        Object objI5 = lVarV.I();
        if (zN || objI5 == companion2.a()) {
            objI5 = new j(p1Var);
            lVarV.B(objI5);
        }
        lVarV.T();
        int i13 = i11 >> 3;
        m60.g.a(numValueOf, emailController, phoneNumberController, nameController, signUpState, z12, z11, z13, bVar, zG, (wn0.a) objI5, null, oVar5, oVar3, oVar4, lVarV, (p010i90.q0.f76828s << 6) | 4160 | (i11 & 896) | (57344 & i13) | (i13 & 458752) | ((i11 << 6) & 3670016) | (29360128 & i11) | (234881024 & i11), 28032, 2048);
        k60.g.a(true, z11, androidx.compose.foundation.relocation.b.b(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, w4.h.g(8), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), bVar2), t4.j.INSTANCE.f(), lVarV, ((i11 >> 9) & 112) | 6, 0);
        lVarV.T();
        lVarV.g();
        lVarV.T();
        lVarV.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new l(sectionController, emailController, phoneNumberController, nameController, z11, signUpState, z12, z13, bVar, dVar2, i11, i12));
        }
    }

    public static final void d(m60.c viewModel, boolean z11, wn0.l<? super InlineSignupViewState, h0> onStateChanged, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        s.k(viewModel, "viewModel");
        s.k(onStateChanged, "onStateChanged");
        p020r2.l lVarV = lVar.v(-1868616687);
        androidx.compose.ui.d dVar2 = (i12 & 8) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        if (p020r2.o.J()) {
            p020r2.o.S(-1868616687, i11, -1, "com.stripe.android.link.ui.inline.LinkOptionalInlineSignup (LinkOptionalInlineSignup.kt:61)");
        }
        y3 y3VarA = r90.f.a(viewModel.v(), lVarV, 8);
        y3 y3VarA2 = r90.f.a(viewModel.p(), lVarV, 8);
        InlineSignupViewState inlineSignupViewStateE = e(y3VarA);
        lVarV.H(-233533584);
        boolean zN = ((((i11 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && lVarV.n(onStateChanged)) || (i11 & KyberEngine.KyberPolyBytes) == 256) | lVarV.n(y3VarA);
        Object objI = lVarV.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            objI = new f(onStateChanged, y3VarA, null);
            lVarV.B(objI);
        }
        lVarV.T();
        Function0.g(inlineSignupViewStateE, (p) objI, lVarV, 72);
        Function0.g(e(y3VarA).getSignUpState(), new g((i3.f) lVarV.U(z0.h()), (q0) lVarV.U(z0.r()), y3VarA, null), lVarV, 64);
        f1 sectionController = viewModel.getSectionController();
        r1 emailController = viewModel.getEmailController();
        p010i90.q0 phoneController = viewModel.getPhoneController();
        r1 nameController = viewModel.getNameController();
        o60.b signUpState = e(y3VarA).getSignUpState();
        boolean zL = e(y3VarA).l();
        boolean zS = viewModel.s();
        k60.b bVarF = f(y3VarA2);
        int i13 = f1.f76526c;
        int i14 = r1.f76877x;
        c(sectionController, emailController, phoneController, nameController, zL, signUpState, z11, zS, bVarF, dVar2, lVarV, i13 | (i14 << 3) | (p010i90.q0.f76828s << 6) | (i14 << 9) | ((i11 << 15) & 3670016) | ((i11 << 18) & 1879048192), 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new h(viewModel, z11, onStateChanged, dVar2, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InlineSignupViewState e(y3<InlineSignupViewState> y3Var) {
        return y3Var.getValue();
    }

    private static final k60.b f(y3<? extends k60.b> y3Var) {
        return y3Var.getValue();
    }

    private static final boolean g(p1<Boolean> p1Var) {
        return p1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(p1<Boolean> p1Var, boolean z11) {
        p1Var.setValue(Boolean.valueOf(z11));
    }

    private static final c0 i(y3<c0> y3Var) {
        return y3Var.getValue();
    }
}
