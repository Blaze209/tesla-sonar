package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.google.android.gms.wallet.contract.TaskResultContracts;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity;
import jn0.h0;
import jn0.m;
import jn0.s;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.u;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Lcom/google/android/gms/wallet/contract/ApiTaskResult;", "Lcom/google/android/gms/wallet/PaymentData;", "taskResult", "Ljn0/h0;", "y", "(Lcom/google/android/gms/wallet/contract/ApiTaskResult;)V", "paymentData", "x", "(Lcom/google/android/gms/wallet/PaymentData;)V", "Lcom/stripe/android/googlepaylauncher/h$g;", "result", "A", "(Lcom/stripe/android/googlepaylauncher/h$g;)V", "s", "z", "", "googlePayStatusCode", "v", "(I)I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "Lcom/stripe/android/googlepaylauncher/j;", "f", "Lkotlin/Lazy;", "u", "()Lcom/stripe/android/googlepaylauncher/j;", "viewModel", "Lh70/h;", "g", "t", "()Lh70/h;", "errorReporter", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;", "h", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;", "args", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GooglePayPaymentMethodLauncherActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e1(o0.b(j.class), new e(this), new g(), new f(null, this));

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy errorReporter = m.b(new a());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private GooglePayPaymentMethodLauncherContractV2.Args args;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh70/h;", "b", "()Lh70/h;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<h70.h> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h70.h invoke() {
            return h70.h.Companion.b(h70.h.INSTANCE, GooglePayPaymentMethodLauncherActivity.this, null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$1", f = "GooglePayPaymentMethodLauncherActivity.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50708n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/googlepaylauncher/h$g;", "googlePayResult", "Ljn0/h0;", "a", "(Lcom/stripe/android/googlepaylauncher/h$g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ GooglePayPaymentMethodLauncherActivity f50710a;

            a(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity) {
                this.f50710a = googlePayPaymentMethodLauncherActivity;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(h.g gVar, Continuation<? super h0> continuation) {
                if (gVar != null) {
                    this.f50710a.s(gVar);
                }
                return h0.f84049a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return GooglePayPaymentMethodLauncherActivity.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50708n;
            if (i11 == 0) {
                t.b(obj);
                StateFlow<h.g> stateFlowI = GooglePayPaymentMethodLauncherActivity.this.u().i();
                a aVar = new a(GooglePayPaymentMethodLauncherActivity.this);
                this.f50708n = 1;
                if (stateFlowI.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$2", f = "GooglePayPaymentMethodLauncherActivity.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50711n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f50712o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher<Task<PaymentData>> f50714q;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$2$1$1", f = "GooglePayPaymentMethodLauncherActivity.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super Task<PaymentData>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f50715n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ GooglePayPaymentMethodLauncherActivity f50716o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f50716o = googlePayPaymentMethodLauncherActivity;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f50716o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f50715n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                j jVarU = this.f50716o.u();
                this.f50715n = 1;
                Object objL = jVarU.l(this);
                return objL == coroutine_suspended ? coroutine_suspended : objL;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Task<PaymentData>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ActivityResultLauncher<Task<PaymentData>> activityResultLauncher, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f50714q = activityResultLauncher;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = GooglePayPaymentMethodLauncherActivity.this.new c(this.f50714q, continuation);
            cVar.f50712o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50711n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = GooglePayPaymentMethodLauncherActivity.this;
                    s.Companion companion = s.INSTANCE;
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    a aVar = new a(googlePayPaymentMethodLauncherActivity, null);
                    this.f50711n = 1;
                    obj = BuildersKt.withContext(io2, aVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                objB = s.b((Task) obj);
            } catch (Throwable th2) {
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
            ActivityResultLauncher<Task<PaymentData>> activityResultLauncher = this.f50714q;
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = GooglePayPaymentMethodLauncherActivity.this;
            Throwable thE = s.e(objB);
            if (thE == null) {
                activityResultLauncher.b((Task) objB);
                googlePayPaymentMethodLauncherActivity2.u().m(true);
            } else {
                googlePayPaymentMethodLauncherActivity2.A(new h.g.Failed(thE, 1));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onGooglePayResult$1", f = "GooglePayPaymentMethodLauncherActivity.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50717n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f50718o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ PaymentData f50720q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(PaymentData paymentData, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f50720q = paymentData;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return GooglePayPaymentMethodLauncherActivity.this.new d(this.f50720q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50718o;
            if (i11 == 0) {
                t.b(obj);
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = GooglePayPaymentMethodLauncherActivity.this;
                j jVarU = googlePayPaymentMethodLauncherActivity2.u();
                PaymentData paymentData = this.f50720q;
                this.f50717n = googlePayPaymentMethodLauncherActivity2;
                this.f50718o = 1;
                Object objG = jVarU.g(paymentData, this);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
                googlePayPaymentMethodLauncherActivity = googlePayPaymentMethodLauncherActivity2;
                obj = objG;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                googlePayPaymentMethodLauncherActivity = (GooglePayPaymentMethodLauncherActivity) this.f50717n;
                t.b(obj);
            }
            googlePayPaymentMethodLauncherActivity.s((h.g) obj);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class e extends u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f50721c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f50721c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f50721c.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class f extends u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f50722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f50723d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f50722c = aVar;
            this.f50723d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f50722c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f50723d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.a<ViewModelProvider.Factory> {
        g() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            GooglePayPaymentMethodLauncherContractV2.Args args = GooglePayPaymentMethodLauncherActivity.this.args;
            if (args == null) {
                p013kotlin.jvm.internal.s.B("args");
                args = null;
            }
            return new j.b(args);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(h.g result) {
        u().n(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(h.g result) {
        setResult(-1, new Intent().putExtras(q5.d.b(x.a("extra_result", result))));
        finish();
    }

    private final h70.h t() {
        return (h70.h) this.errorReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j u() {
        return (j) this.viewModel.getValue();
    }

    private final int v(int googlePayStatusCode) {
        if (googlePayStatusCode != 7) {
            return googlePayStatusCode != 10 ? 1 : 2;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(GooglePayPaymentMethodLauncherActivity this$0, ApiTaskResult apiTaskResult) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.h(apiTaskResult);
        this$0.y(apiTaskResult);
    }

    private final void x(PaymentData paymentData) {
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new d(paymentData, null), 3, null);
    }

    private final void y(ApiTaskResult<PaymentData> taskResult) {
        int statusCode = taskResult.getStatus().getStatusCode();
        if (statusCode == 0) {
            PaymentData result = taskResult.getResult();
            if (result != null) {
                x(result);
                return;
            } else {
                h70.h.b.a(t(), h70.h.f.GOOGLE_PAY_MISSING_INTENT_DATA, null, null, 6, null);
                A(new h.g.Failed(new RuntimeException("Google Pay failed with missing data."), 1));
                return;
            }
        }
        if (statusCode == 16) {
            A(h.g.a.f50859a);
            return;
        }
        Status status = taskResult.getStatus();
        p013kotlin.jvm.internal.s.j(status, "getStatus(...)");
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        h70.h.b.a(t(), h70.h.d.GOOGLE_PAY_FAILED, null, v0.m(x.a("status_message", statusMessage), x.a("status_code", String.valueOf(status.getStatusCode()))), 2, null);
        j jVarU = u();
        int statusCode2 = status.getStatusCode();
        String statusMessage2 = status.getStatusMessage();
        jVarU.n(new h.g.Failed(new RuntimeException("Google Pay failed with error " + statusCode2 + ": " + (statusMessage2 != null ? statusMessage2 : "")), v(status.getStatusCode())));
    }

    private final void z() {
        r90.c.a(this);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        z();
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        z();
        GooglePayPaymentMethodLauncherContractV2.Args.Companion companion = GooglePayPaymentMethodLauncherContractV2.Args.INSTANCE;
        Intent intent = getIntent();
        p013kotlin.jvm.internal.s.j(intent, "getIntent(...)");
        GooglePayPaymentMethodLauncherContractV2.Args argsA = companion.a(intent);
        if (argsA == null) {
            s(new h.g.Failed(new RuntimeException("GooglePayPaymentMethodLauncherActivity was started without arguments."), 2));
            return;
        }
        this.args = argsA;
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new b(null), 3, null);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new TaskResultContracts.GetPaymentDataResult(), new ActivityResultCallback() { // from class: a60.g
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                GooglePayPaymentMethodLauncherActivity.w(this.f478a, (ApiTaskResult) obj);
            }
        });
        p013kotlin.jvm.internal.s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        if (u().j()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new c(activityResultLauncherRegisterForActivityResult, null), 3, null);
    }
}
