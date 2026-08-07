package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import a70.Unvalidated;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.z0;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import d80.PollingUiState;
import f90.n;
import j90.g;
import j90.h;
import jn0.h0;
import jn0.m;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p009i2.r1;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.l;
import p020r2.o;
import p020r2.y3;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u001f¨\u0006#²\u0006\f\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "La70/c;", "result", "Ljn0/h0;", "q", "(La70/c;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$a;", "f", "Lkotlin/Lazy;", "r", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$a;", "args", "Landroidx/lifecycle/ViewModelProvider$Factory;", "g", "Landroidx/lifecycle/ViewModelProvider$Factory;", "t", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$paymentsheet_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "viewModelFactory", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b;", "h", "s", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b;", "viewModel", "Ld80/f;", "uiState", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PollingActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy args = m.b(new a());

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ViewModelProvider.Factory viewModelFactory = new com.stripe.android.paymentsheet.paymentdatacollection.polling.b.f(new f());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e1(o0.b(com.stripe.android.paymentsheet.paymentdatacollection.polling.b.class), new c(this), new e(), new d(null, this));

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$a;", "b", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$a;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<PollingContract.Args> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PollingContract.Args invoke() {
            PollingContract.Args.Companion companion = PollingContract.Args.INSTANCE;
            Intent intent = PollingActivity.this.getIntent();
            s.j(intent, "getIntent(...)");
            PollingContract.Args argsA = companion.a(intent);
            if (argsA != null) {
                return argsA;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<l, Integer, h0> {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements p<l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PollingActivity f53419c;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
            static final class C1038a extends u implements wn0.a<h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ PollingActivity f53420c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ y3<PollingUiState> f53421d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1038a(PollingActivity pollingActivity, y3<PollingUiState> y3Var) {
                    super(0);
                    this.f53420c = pollingActivity;
                    this.f53421d = y3Var;
                }

                public final void b() {
                    if (a.c(this.f53421d).getPollingState() == d80.e.Failed) {
                        this.f53420c.s().n();
                    }
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    b();
                    return h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$onCreate$1$1$2", f = "PollingActivity.kt", i = {0}, l = {73}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
            static final class C1039b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f53422n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f53423o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ PollingActivity f53424p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ g f53425q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ y3<PollingUiState> f53426r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1039b(PollingActivity pollingActivity, g gVar, y3<PollingUiState> y3Var, Continuation<? super C1039b> continuation) {
                    super(2, continuation);
                    this.f53424p = pollingActivity;
                    this.f53425q = gVar;
                    this.f53426r = y3Var;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C1039b(this.f53424p, this.f53425q, this.f53426r, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Unvalidated unvalidated;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f53423o;
                    if (i11 == 0) {
                        t.b(obj);
                        Unvalidated unvalidatedD = com.stripe.android.paymentsheet.paymentdatacollection.polling.c.d(a.c(this.f53426r).getPollingState(), this.f53424p.r());
                        if (unvalidatedD != null) {
                            g gVar = this.f53425q;
                            this.f53422n = unvalidatedD;
                            this.f53423o = 1;
                            if (gVar.c(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            unvalidated = unvalidatedD;
                        }
                        return h0.f84049a;
                    }
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    unvalidated = (Unvalidated) this.f53422n;
                    t.b(obj);
                    this.f53424p.q(unvalidated);
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C1039b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
            static final class c extends u implements wn0.a<h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final c f53427c = new c();

                c() {
                    super(0);
                }

                public final void b() {
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    b();
                    return h0.f84049a;
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class d extends u implements p<l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ PollingActivity f53428c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(PollingActivity pollingActivity) {
                    super(2);
                    this.f53428c = pollingActivity;
                }

                public final void a(l lVar, int i11) {
                    if ((i11 & 11) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (o.J()) {
                        o.S(-246136616, i11, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PollingActivity.kt:81)");
                    }
                    d80.d.c(this.f53428c.s(), null, lVar, 8, 2);
                    if (o.J()) {
                        o.R();
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
                    a(lVar, num.intValue());
                    return h0.f84049a;
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li2/r1;", "proposedValue", "", "a", "(Li2/r1;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
            static final class e extends u implements wn0.l<r1, Boolean> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ y3<PollingUiState> f53429c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(y3<PollingUiState> y3Var) {
                    super(1);
                    this.f53429c = y3Var;
                }

                @Override // wn0.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(r1 proposedValue) {
                    s.k(proposedValue, "proposedValue");
                    boolean z11 = true;
                    if (proposedValue == r1.Hidden && a.c(this.f53429c).getPollingState() == d80.e.Active) {
                        z11 = false;
                    }
                    return Boolean.valueOf(z11);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PollingActivity pollingActivity) {
                super(2);
                this.f53419c = pollingActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final PollingUiState c(y3<PollingUiState> y3Var) {
                return y3Var.getValue();
            }

            public final void b(l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(1217612191, i11, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous>.<anonymous> (PollingActivity.kt:49)");
                }
                y3 y3VarA = r90.f.a(this.f53419c.s().m(), lVar, 8);
                lVar.H(1911403227);
                boolean zN = lVar.n(y3VarA);
                Object objI = lVar.I();
                if (zN || objI == l.INSTANCE.a()) {
                    objI = new e(y3VarA);
                    lVar.B(objI);
                }
                lVar.T();
                g gVarB = h.b(null, (wn0.l) objI, lVar, 0, 1);
                f.d.a(true, new C1038a(this.f53419c, y3VarA), lVar, 6, 0);
                Function0.g(c(y3VarA).getPollingState(), new C1039b(this.f53419c, gVarB, y3VarA, null), lVar, 64);
                m30.a.a(gVarB, null, c.f53427c, z2.c.b(lVar, -246136616, true, new d(this.f53419c)), lVar, g.f83152e | 3456, 2);
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
                b(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        b() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-684927091, i11, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous> (PollingActivity.kt:48)");
            }
            n.a(null, null, null, z2.c.b(lVar, 1217612191, true, new a(PollingActivity.this)), lVar, 3072, 7);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class c extends u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f53430c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f53430c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f53430c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class d extends u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f53431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f53432d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f53431c = aVar;
            this.f53432d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f53431c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f53432d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.a<ViewModelProvider.Factory> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return PollingActivity.this.getViewModelFactory();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b$e;", "b", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/b$e;"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements wn0.a<com.stripe.android.paymentsheet.paymentdatacollection.polling.b.Args> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.paymentsheet.paymentdatacollection.polling.b.Args invoke() {
            String clientSecret = PollingActivity.this.r().getClientSecret();
            io0.b.Companion companion = io0.b.INSTANCE;
            int timeLimitInSeconds = PollingActivity.this.r().getTimeLimitInSeconds();
            io0.e eVar = io0.e.SECONDS;
            return new com.stripe.android.paymentsheet.paymentdatacollection.polling.b.Args(clientSecret, io0.d.s(timeLimitInSeconds, eVar), io0.d.s(PollingActivity.this.r().getInitialDelayInSeconds(), eVar), PollingActivity.this.r().getMaxAttempts(), PollingActivity.this.r().getCtaText(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(Unvalidated result) {
        setResult(-1, new Intent().putExtras(result.i()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PollingContract.Args r() {
        return (PollingContract.Args) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.paymentdatacollection.polling.b s() {
        return (com.stripe.android.paymentsheet.paymentdatacollection.polling.b) this.viewModel.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        r90.c.a(this);
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        z0.b(getWindow(), false);
        f.e.b(this, null, z2.c.c(-684927091, true, new b()), 1, null);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final ViewModelProvider.Factory getViewModelFactory() {
        return this.viewModelFactory;
    }
}
