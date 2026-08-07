package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import g80.Full;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p009i2.r1;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import p020r2.Function0;
import p020r2.y3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0018\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001e\u001a\u00020\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0007¨\u0006$²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;", "Lh80/e;", "Lcom/stripe/android/paymentsheet/s;", "<init>", "()V", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;", "u", "()Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onCreate", "(Landroid/os/Bundle;)V", "result", "v", "(Lcom/stripe/android/paymentsheet/s;)V", "Landroidx/lifecycle/ViewModelProvider$Factory;", "g", "Landroidx/lifecycle/ViewModelProvider$Factory;", "t", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$paymentsheet_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getViewModelFactory$paymentsheet_release$annotations", "viewModelFactory", "Lcom/stripe/android/paymentsheet/x;", "h", "Lkotlin/Lazy;", "s", "()Lcom/stripe/android/paymentsheet/x;", "viewModel", IntegerTokenConverter.CONVERTER_KEY, "r", "starterArgs", "", "isProcessing", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentOptionsActivity extends p008h80.e<s> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ViewModelProvider.Factory viewModelFactory = new x.b(new f());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e1(o0.b(x.class), new b(this), new e(), new c(null, this));

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy starterArgs = jn0.m.b(new d());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class C0958a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PaymentOptionsActivity f52284c;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentOptionsActivity$onCreate$1$1$1", f = "PaymentOptionsActivity.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
            static final class C0959a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f52285n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ PaymentOptionsActivity f52286o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ j90.g f52287p;

                /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/s;", "sheetResult", "Ljn0/h0;", "a", "(Lcom/stripe/android/paymentsheet/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
                static final class C0960a<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ PaymentOptionsActivity f52288a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ j90.g f52289b;

                    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a$a, reason: collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentOptionsActivity$onCreate$1$1$1$1", f = "PaymentOptionsActivity.kt", i = {0}, l = {62}, m = "emit", n = {"this"}, s = {"L$0"})
                    static final class C0961a extends ContinuationImpl {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        Object f52290n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        /* synthetic */ Object f52291o;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        final /* synthetic */ C0960a<T> f52292p;

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        int f52293q;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C0961a(C0960a<? super T> c0960a, Continuation<? super C0961a> continuation) {
                            super(continuation);
                            this.f52292p = c0960a;
                        }

                        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f52291o = obj;
                            this.f52293q |= Integer.MIN_VALUE;
                            return this.f52292p.emit(null, this);
                        }
                    }

                    C0960a(PaymentOptionsActivity paymentOptionsActivity, j90.g gVar) {
                        this.f52288a = paymentOptionsActivity;
                        this.f52289b = gVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object emit(s sVar, Continuation<? super h0> continuation) {
                        C0961a c0961a;
                        C0960a<T> c0960a;
                        if (continuation instanceof C0961a) {
                            c0961a = (C0961a) continuation;
                            int i11 = c0961a.f52293q;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                c0961a.f52293q = i11 - Integer.MIN_VALUE;
                            } else {
                                c0961a = new C0961a(this, continuation);
                            }
                        } else {
                            c0961a = new C0961a(this, continuation);
                        }
                        Object obj = c0961a.f52291o;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = c0961a.f52293q;
                        if (i12 == 0) {
                            jn0.t.b(obj);
                            this.f52288a.v(sVar);
                            j90.g gVar = this.f52289b;
                            c0961a.f52290n = this;
                            c0961a.f52293q = 1;
                            if (gVar.c(c0961a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c0960a = this;
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0960a = (C0960a) c0961a.f52290n;
                            jn0.t.b(obj);
                        }
                        c0960a.f52288a.m().getNavigationHandler().d();
                        c0960a.f52288a.finish();
                        return h0.f84049a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0959a(PaymentOptionsActivity paymentOptionsActivity, j90.g gVar, Continuation<? super C0959a> continuation) {
                    super(2, continuation);
                    this.f52286o = paymentOptionsActivity;
                    this.f52287p = gVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C0959a(this.f52286o, this.f52287p, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f52285n;
                    if (i11 == 0) {
                        jn0.t.b(obj);
                        Flow flowFilterNotNull = FlowKt.filterNotNull(this.f52286o.m().V());
                        C0960a c0960a = new C0960a(this.f52286o, this.f52287p);
                        this.f52285n = 1;
                        if (flowFilterNotNull.collect(c0960a, this) == coroutine_suspended) {
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
                    return ((C0959a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$b */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
                b(Object obj) {
                    super(0, obj, x.class, "onUserCancel", "onUserCancel()V", 0);
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    o();
                    return h0.f84049a;
                }

                public final void o() {
                    ((x) this.receiver).L();
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$c */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ PaymentOptionsActivity f52294c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(PaymentOptionsActivity paymentOptionsActivity) {
                    super(2);
                    this.f52294c = paymentOptionsActivity;
                }

                public final void a(p020r2.l lVar, int i11) {
                    if ((i11 & 11) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(713072409, i11, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaymentOptionsActivity.kt:71)");
                    }
                    com.stripe.android.paymentsheet.ui.b.f(this.f52294c.m(), lVar, 8);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                    a(lVar, num.intValue());
                    return h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$d */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li2/r1;", "it", "", "a", "(Li2/r1;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
            static final class d extends p013kotlin.jvm.internal.u implements wn0.l<r1, Boolean> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ y3<Boolean> f52295c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(y3<Boolean> y3Var) {
                    super(1);
                    this.f52295c = y3Var;
                }

                @Override // wn0.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(r1 it) {
                    p013kotlin.jvm.internal.s.k(it, "it");
                    return Boolean.valueOf(!C0958a.c(this.f52295c));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0958a(PaymentOptionsActivity paymentOptionsActivity) {
                super(2);
                this.f52284c = paymentOptionsActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean c(y3<Boolean> y3Var) {
                return y3Var.getValue().booleanValue();
            }

            public final void b(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(526390752, i11, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous>.<anonymous> (PaymentOptionsActivity.kt:52)");
                }
                y3 y3VarA = r90.f.a(this.f52284c.m().z(), lVar, 8);
                lVar.H(1788261935);
                boolean zN = lVar.n(y3VarA);
                Object objI = lVar.I();
                if (zN || objI == p020r2.l.INSTANCE.a()) {
                    objI = new d(y3VarA);
                    lVar.B(objI);
                }
                lVar.T();
                j90.g gVarB = j90.h.b(null, (wn0.l) objI, lVar, 0, 1);
                Function0.g(h0.f84049a, new C0959a(this.f52284c, gVarB, null), lVar, 70);
                m30.a.a(gVarB, null, new b(this.f52284c.m()), z2.c.b(lVar, 713072409, true, new c(this.f52284c)), lVar, j90.g.f83152e | 3072, 2);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                b(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        a() {
            super(2);
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1719713842, i11, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous> (PaymentOptionsActivity.kt:51)");
            }
            f90.n.a(null, null, null, z2.c.b(lVar, 526390752, true, new C0958a(PaymentOptionsActivity.this)), lVar, 3072, 7);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class b extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f52296c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f52296c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f52296c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class c extends p013kotlin.jvm.internal.u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f52297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f52298d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f52297c = aVar;
            this.f52298d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f52297c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f52298d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;", "b", "()Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<PaymentOptionContract.Args> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentOptionContract.Args invoke() {
            PaymentOptionContract.Args.Companion companion = PaymentOptionContract.Args.INSTANCE;
            Intent intent = PaymentOptionsActivity.this.getIntent();
            p013kotlin.jvm.internal.s.j(intent, "getIntent(...)");
            return companion.a(intent);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelProvider.Factory> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return PaymentOptionsActivity.this.getViewModelFactory();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;", "b", "()Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<PaymentOptionContract.Args> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentOptionContract.Args invoke() {
            PaymentOptionContract.Args argsR = PaymentOptionsActivity.this.r();
            if (argsR != null) {
                return argsR;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentOptionContract.Args r() {
        return (PaymentOptionContract.Args) this.starterArgs.getValue();
    }

    private final PaymentOptionContract.Args u() {
        Full state;
        y.Configuration config;
        y.Appearance appearance;
        PaymentOptionContract.Args argsR = r();
        if (argsR != null && (state = argsR.getState()) != null && (config = state.getConfig()) != null && (appearance = config.getAppearance()) != null) {
            z.b(appearance);
        }
        p(r() == null);
        return r();
    }

    @Override // p008h80.e, androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        PaymentOptionContract.Args argsU = u();
        super.onCreate(savedInstanceState);
        if (argsU == null) {
            finish();
            return;
        }
        if (!i80.a.a(this)) {
            m().getAnalyticsListener().b();
        }
        f.e.b(this, null, z2.c.c(-1719713842, true, new a()), 1, null);
    }

    @Override // p008h80.e
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public x m() {
        return (x) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final ViewModelProvider.Factory getViewModelFactory() {
        return this.viewModelFactory;
    }

    public void v(s result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        setResult(result.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.RESULT_CODE java.lang.String(), new Intent().putExtras(result.c()));
    }
}
