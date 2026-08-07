package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010!\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0004\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010'\u001a\u00020\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010+\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006.²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetActivity;", "Lh80/e;", "Lcom/stripe/android/paymentsheet/b0;", "<init>", "()V", "Ljn0/s;", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "w", "()Ljava/lang/Object;", "", AnalyticsAttribute.Error, "Ljn0/h0;", "s", "(Ljava/lang/Throwable;)V", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "r", "()Ljava/lang/IllegalArgumentException;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "result", "x", "(Lcom/stripe/android/paymentsheet/b0;)V", "Landroidx/lifecycle/ViewModelProvider$Factory;", "g", "Landroidx/lifecycle/ViewModelProvider$Factory;", "v", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$paymentsheet_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getViewModelFactory$paymentsheet_release$annotations", "viewModelFactory", "Lcom/stripe/android/paymentsheet/c0;", "h", "Lkotlin/Lazy;", "u", "()Lcom/stripe/android/paymentsheet/c0;", "viewModel", IntegerTokenConverter.CONVERTER_KEY, "t", "()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "starterArgs", "", "isProcessing", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentSheetActivity extends p008h80.e<b0> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ViewModelProvider.Factory viewModelFactory = new c0.d(new f());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e1(o0.b(c0.class), new b(this), new e(), new c(null, this));

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy starterArgs = jn0.m.b(new d());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class C0962a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PaymentSheetActivity f52306c;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetActivity$onCreate$1$1$1", f = "PaymentSheetActivity.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
            static final class C0963a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f52307n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ PaymentSheetActivity f52308o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ j90.g f52309p;

                /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/b0;", "sheetResult", "Ljn0/h0;", "a", "(Lcom/stripe/android/paymentsheet/b0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
                static final class C0964a<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ PaymentSheetActivity f52310a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ j90.g f52311b;

                    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a$a, reason: collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetActivity$onCreate$1$1$1$1", f = "PaymentSheetActivity.kt", i = {0}, l = {66}, m = "emit", n = {"this"}, s = {"L$0"})
                    static final class C0965a extends ContinuationImpl {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        Object f52312n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        /* synthetic */ Object f52313o;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        final /* synthetic */ C0964a<T> f52314p;

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        int f52315q;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C0965a(C0964a<? super T> c0964a, Continuation<? super C0965a> continuation) {
                            super(continuation);
                            this.f52314p = c0964a;
                        }

                        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f52313o = obj;
                            this.f52315q |= Integer.MIN_VALUE;
                            return this.f52314p.emit(null, this);
                        }
                    }

                    C0964a(PaymentSheetActivity paymentSheetActivity, j90.g gVar) {
                        this.f52310a = paymentSheetActivity;
                        this.f52311b = gVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object emit(b0 b0Var, Continuation<? super h0> continuation) {
                        C0965a c0965a;
                        C0964a<T> c0964a;
                        if (continuation instanceof C0965a) {
                            c0965a = (C0965a) continuation;
                            int i11 = c0965a.f52315q;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                c0965a.f52315q = i11 - Integer.MIN_VALUE;
                            } else {
                                c0965a = new C0965a(this, continuation);
                            }
                        } else {
                            c0965a = new C0965a(this, continuation);
                        }
                        Object obj = c0965a.f52313o;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = c0965a.f52315q;
                        if (i12 == 0) {
                            jn0.t.b(obj);
                            this.f52310a.x(b0Var);
                            j90.g gVar = this.f52311b;
                            c0965a.f52312n = this;
                            c0965a.f52315q = 1;
                            if (gVar.c(c0965a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c0964a = this;
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0964a = (C0964a) c0965a.f52312n;
                            jn0.t.b(obj);
                        }
                        c0964a.f52310a.m().getNavigationHandler().d();
                        c0964a.f52310a.finish();
                        return h0.f84049a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0963a(PaymentSheetActivity paymentSheetActivity, j90.g gVar, Continuation<? super C0963a> continuation) {
                    super(2, continuation);
                    this.f52308o = paymentSheetActivity;
                    this.f52309p = gVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C0963a(this.f52308o, this.f52309p, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f52307n;
                    if (i11 == 0) {
                        jn0.t.b(obj);
                        Flow flowFilterNotNull = FlowKt.filterNotNull(this.f52308o.m().w0());
                        C0964a c0964a = new C0964a(this.f52308o, this.f52309p);
                        this.f52307n = 1;
                        if (flowFilterNotNull.collect(c0964a, this) == coroutine_suspended) {
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
                    return ((C0963a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$b */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
                b(Object obj) {
                    super(0, obj, c0.class, "onUserCancel", "onUserCancel()V", 0);
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    o();
                    return h0.f84049a;
                }

                public final void o() {
                    ((c0) this.receiver).L();
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$c */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ PaymentSheetActivity f52316c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(PaymentSheetActivity paymentSheetActivity) {
                    super(2);
                    this.f52316c = paymentSheetActivity;
                }

                public final void a(p020r2.l lVar, int i11) {
                    if ((i11 & 11) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1652456663, i11, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaymentSheetActivity.kt:75)");
                    }
                    com.stripe.android.paymentsheet.ui.b.g(this.f52316c.m(), lVar, 8);
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

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$d */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li2/r1;", "it", "", "a", "(Li2/r1;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
            static final class d extends p013kotlin.jvm.internal.u implements wn0.l<r1, Boolean> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ y3<Boolean> f52317c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(y3<Boolean> y3Var) {
                    super(1);
                    this.f52317c = y3Var;
                }

                @Override // wn0.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(r1 it) {
                    p013kotlin.jvm.internal.s.k(it, "it");
                    return Boolean.valueOf(!C0962a.c(this.f52317c));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0962a(PaymentSheetActivity paymentSheetActivity) {
                super(2);
                this.f52306c = paymentSheetActivity;
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
                    p020r2.o.S(952004382, i11, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous>.<anonymous> (PaymentSheetActivity.kt:56)");
                }
                y3 y3VarA = r90.f.a(this.f52306c.m().z(), lVar, 8);
                lVar.H(2130490094);
                boolean zN = lVar.n(y3VarA);
                Object objI = lVar.I();
                if (zN || objI == p020r2.l.INSTANCE.a()) {
                    objI = new d(y3VarA);
                    lVar.B(objI);
                }
                lVar.T();
                j90.g gVarB = j90.h.b(null, (wn0.l) objI, lVar, 0, 1);
                Function0.g(h0.f84049a, new C0963a(this.f52306c, gVarB, null), lVar, 70);
                m30.a.a(gVarB, null, new b(this.f52306c.m()), z2.c.b(lVar, 1652456663, true, new c(this.f52306c)), lVar, j90.g.f83152e | 3072, 2);
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
                p020r2.o.S(485212172, i11, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous> (PaymentSheetActivity.kt:55)");
            }
            f90.n.a(null, null, null, z2.c.b(lVar, 952004382, true, new C0962a(PaymentSheetActivity.this)), lVar, 3072, 7);
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
        final /* synthetic */ ComponentActivity f52318c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f52318c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f52318c.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class c extends p013kotlin.jvm.internal.u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f52319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f52320d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f52319c = aVar;
            this.f52320d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f52319c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f52320d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "b", "()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<PaymentSheetContractV2.Args> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentSheetContractV2.Args invoke() {
            PaymentSheetContractV2.Args.Companion c0967a = PaymentSheetContractV2.Args.INSTANCE;
            Intent intent = PaymentSheetActivity.this.getIntent();
            p013kotlin.jvm.internal.s.j(intent, "getIntent(...)");
            return c0967a.a(intent);
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
            return PaymentSheetActivity.this.getViewModelFactory();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "b", "()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<PaymentSheetContractV2.Args> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentSheetContractV2.Args invoke() {
            PaymentSheetContractV2.Args aVarT = PaymentSheetActivity.this.t();
            if (aVarT != null) {
                return aVarT;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private final IllegalArgumentException r() {
        return new IllegalArgumentException("PaymentSheet started without arguments.");
    }

    private final void s(Throwable error) {
        if (error == null) {
            error = r();
        }
        x(new b0.Failed(error));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentSheetContractV2.Args t() {
        return (PaymentSheetContractV2.Args) this.starterArgs.getValue();
    }

    private final Object w() {
        Object objB;
        PaymentSheetContractV2.Args aVarT = t();
        if (aVarT == null) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(r()));
        } else {
            try {
                aVarT.getInitializationMode().a();
                z.e(aVarT.getConfig());
                z.b(aVarT.getConfig().getAppearance());
                objB = jn0.s.b(aVarT);
            } catch (IllegalArgumentException e11) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(e11));
            }
        }
        p(jn0.s.g(objB));
        return objB;
    }

    @Override // p008h80.e, androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object objW = w();
        super.onCreate(savedInstanceState);
        if (((PaymentSheetContractV2.Args) (jn0.s.g(objW) ? null : objW)) == null) {
            s(jn0.s.e(objW));
            return;
        }
        m().P0(this, this);
        if (!i80.a.a(this)) {
            m().getAnalyticsListener().b();
        }
        f.e.b(this, null, z2.c.c(485212172, true, new a()), 1, null);
    }

    @Override // p008h80.e
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public c0 m() {
        return (c0) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final ViewModelProvider.Factory getViewModelFactory() {
        return this.viewModelFactory;
    }

    public void x(b0 result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        setResult(-1, new Intent().putExtras(new PaymentSheetContractV2.Result(result).b()));
    }
}
