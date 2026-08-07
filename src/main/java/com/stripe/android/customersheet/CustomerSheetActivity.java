package com.stripe.android.customersheet;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.z0;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import jn0.h0;
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
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.y3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R.\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010!¨\u0006%²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Lcom/stripe/android/customersheet/p;", "result", "Ljn0/h0;", "q", "(Lcom/stripe/android/customersheet/p;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "Lcom/stripe/android/customersheet/CustomerSheetContract$a;", "f", "Lkotlin/Lazy;", "r", "()Lcom/stripe/android/customersheet/CustomerSheetContract$a;", "args", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "g", "Lwn0/a;", "t", "()Lwn0/a;", "setViewModelFactoryProducer$paymentsheet_release", "(Lwn0/a;)V", "getViewModelFactoryProducer$paymentsheet_release$annotations", "viewModelFactoryProducer", "Lcom/stripe/android/customersheet/l;", "h", "s", "()Lcom/stripe/android/customersheet/l;", "viewModel", "Lcom/stripe/android/customersheet/n;", "viewState", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CustomerSheetActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy args = jn0.m.b(new a());

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private wn0.a<? extends ViewModelProvider.Factory> viewModelFactoryProducer = new f();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e1(o0.b(l.class), new c(this), new e(), new d(null, this));

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetContract$a;", "b", "()Lcom/stripe/android/customersheet/CustomerSheetContract$a;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<CustomerSheetContract.Args> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CustomerSheetContract.Args invoke() {
            CustomerSheetContract.Args.Companion companion = CustomerSheetContract.Args.INSTANCE;
            Intent intent = CustomerSheetActivity.this.getIntent();
            p013kotlin.jvm.internal.s.j(intent, "getIntent(...)");
            return companion.a(intent);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.p<p020r2.l, Integer, h0> {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "c", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CustomerSheetActivity f49712c;

            /* JADX INFO: renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetActivity$onCreate$1$1$1", f = "CustomerSheetActivity.kt", i = {0}, l = {85}, m = "invokeSuspend", n = {"result"}, s = {"L$1"})
            static final class C0797a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f49713n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                Object f49714o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                int f49715p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ y3<p> f49716q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ j90.g f49717r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f49718s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0797a(y3<? extends p> y3Var, j90.g gVar, CustomerSheetActivity customerSheetActivity, Continuation<? super C0797a> continuation) {
                    super(2, continuation);
                    this.f49716q = y3Var;
                    this.f49717r = gVar;
                    this.f49718s = customerSheetActivity;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C0797a(this.f49716q, this.f49717r, this.f49718s, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    p pVar;
                    CustomerSheetActivity customerSheetActivity;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f49715p;
                    if (i11 == 0) {
                        t.b(obj);
                        p pVarF = a.f(this.f49716q);
                        if (pVarF != null) {
                            j90.g gVar = this.f49717r;
                            CustomerSheetActivity customerSheetActivity2 = this.f49718s;
                            this.f49713n = customerSheetActivity2;
                            this.f49714o = pVarF;
                            this.f49715p = 1;
                            if (gVar.c(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pVar = pVarF;
                            customerSheetActivity = customerSheetActivity2;
                        }
                        return h0.f84049a;
                    }
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (p) this.f49714o;
                    customerSheetActivity = (CustomerSheetActivity) this.f49713n;
                    t.b(obj);
                    customerSheetActivity.q(pVar);
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C0797a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
            static final class C0798b extends u implements wn0.a<h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f49719c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0798b(CustomerSheetActivity customerSheetActivity) {
                    super(0);
                    this.f49719c = customerSheetActivity;
                }

                public final void b() {
                    this.f49719c.s().b0(k.c.f49814a);
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    b();
                    return h0.f84049a;
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
            static final class c extends u implements wn0.a<h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f49720c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(CustomerSheetActivity customerSheetActivity) {
                    super(0);
                    this.f49720c = customerSheetActivity;
                }

                public final void b() {
                    this.f49720c.s().b0(k.h.f49820a);
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    b();
                    return h0.f84049a;
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class d extends u implements wn0.p<p020r2.l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f49721c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ y3<n> f49722d;

                /* JADX INFO: renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$d$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* synthetic */ class C0799a extends p013kotlin.jvm.internal.p implements wn0.l<k, h0> {
                    C0799a(Object obj) {
                        super(1, obj, l.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V", 0);
                    }

                    public final void a(k p11) {
                        p013kotlin.jvm.internal.s.k(p11, "p0");
                        ((l) this.receiver).b0(p11);
                    }

                    @Override // wn0.l
                    public /* bridge */ /* synthetic */ h0 invoke(k kVar) {
                        a(kVar);
                        return h0.f84049a;
                    }
                }

                /* JADX INFO: renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$d$b, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* synthetic */ class C0800b extends p013kotlin.jvm.internal.p implements wn0.l<String, x30.c> {
                    C0800b(Object obj) {
                        super(1, obj, l.class, "providePaymentMethodName", "providePaymentMethodName(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;", 0);
                    }

                    @Override // wn0.l
                    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                    public final x30.c invoke(String str) {
                        return ((l) this.receiver).t0(str);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                d(CustomerSheetActivity customerSheetActivity, y3<? extends n> y3Var) {
                    super(2);
                    this.f49721c = customerSheetActivity;
                    this.f49722d = y3Var;
                }

                public final void a(p020r2.l lVar, int i11) {
                    if ((i11 & 11) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1927642793, i11, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CustomerSheetActivity.kt:97)");
                    }
                    f40.a.b(a.e(this.f49722d), false, null, new C0799a(this.f49721c.s()), new C0800b(this.f49721c.s()), lVar, 0, 6);
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

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li2/r1;", "it", "", "a", "(Li2/r1;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
            static final class e extends u implements wn0.l<r1, Boolean> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f49723c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(CustomerSheetActivity customerSheetActivity) {
                    super(1);
                    this.f49723c = customerSheetActivity;
                }

                @Override // wn0.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(r1 it) {
                    p013kotlin.jvm.internal.s.k(it, "it");
                    return Boolean.valueOf(it == r1.Hidden ? this.f49723c.s().P() : true);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CustomerSheetActivity customerSheetActivity) {
                super(2);
                this.f49712c = customerSheetActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final n e(y3<? extends n> y3Var) {
                return y3Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final p f(y3<? extends p> y3Var) {
                return y3Var.getValue();
            }

            public final void c(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-295136510, i11, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous>.<anonymous> (CustomerSheetActivity.kt:69)");
                }
                j90.g gVarB = j90.h.b(null, new e(this.f49712c), lVar, 0, 1);
                y3 y3VarA = r90.f.a(this.f49712c.s().X(), lVar, 8);
                y3 y3VarA2 = r90.f.a(this.f49712c.s().W(), lVar, 8);
                Function0.g(f(y3VarA2), new C0797a(y3VarA2, gVarB, this.f49712c, null), lVar, 64);
                f.d.a(false, new C0798b(this.f49712c), lVar, 0, 1);
                m30.a.a(gVarB, null, new c(this.f49712c), z2.c.b(lVar, 1927642793, true, new d(this.f49712c, y3VarA)), lVar, j90.g.f83152e | 3072, 2);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                c(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        b() {
            super(2);
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(602239828, i11, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous> (CustomerSheetActivity.kt:68)");
            }
            f90.n.a(null, null, null, z2.c.b(lVar, -295136510, true, new a(CustomerSheetActivity.this)), lVar, 3072, 7);
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
    public static final class c extends u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f49724c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f49724c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f49724c.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class d extends u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f49725c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f49726d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f49725c = aVar;
            this.f49726d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f49725c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f49726d.getDefaultViewModelCreationExtras() : creationExtras;
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
            return CustomerSheetActivity.this.t().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/customersheet/l$g;", "b", "()Lcom/stripe/android/customersheet/l$g;"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements wn0.a<l.g> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l.g invoke() {
            CustomerSheetContract.Args argsR = CustomerSheetActivity.this.r();
            p013kotlin.jvm.internal.s.h(argsR);
            return new l.g(argsR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(p result) {
        setResult(-1, new Intent().putExtras(result.a()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerSheetContract.Args r() {
        return (CustomerSheetContract.Args) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l s() {
        return (l) this.viewModel.getValue();
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
        if (r() == null) {
            q(new p.c(new IllegalStateException("No CustomerSheetContract.Args provided")));
        } else {
            s().v0(this, this);
            f.e.b(this, null, z2.c.c(602239828, true, new b()), 1, null);
        }
    }

    public final wn0.a<ViewModelProvider.Factory> t() {
        return this.viewModelFactoryProducer;
    }
}
