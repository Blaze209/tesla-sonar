package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.p0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.google.android.gms.wallet.contract.TaskResultContracts;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.n;
import jn0.h0;
import jn0.m;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.json.JSONObject;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J)\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Lcom/google/android/gms/wallet/contract/ApiTaskResult;", "Lcom/google/android/gms/wallet/PaymentData;", "taskResult", "Ljn0/h0;", "v", "(Lcom/google/android/gms/wallet/contract/ApiTaskResult;)V", "Lcom/stripe/android/googlepaylauncher/f$h;", "result", "r", "(Lcom/stripe/android/googlepaylauncher/f$h;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/stripe/android/googlepaylauncher/g;", "f", "Lkotlin/Lazy;", "t", "()Lcom/stripe/android/googlepaylauncher/g;", "viewModel", "Lh70/h;", "g", "s", "()Lh70/h;", "errorReporter", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$a;", "h", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$a;", "args", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GooglePayLauncherActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e1(o0.b(g.class), new d(this), new f(), new e(null, this));

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy errorReporter = m.b(new a());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private GooglePayLauncherContract.a args;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh70/h;", "b", "()Lh70/h;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<h70.h> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h70.h invoke() {
            return h70.h.Companion.b(h70.h.INSTANCE, GooglePayLauncherActivity.this, null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$3", f = "GooglePayLauncherActivity.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50679n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/googlepaylauncher/f$h;", "googlePayResult", "Ljn0/h0;", "a", "(Lcom/stripe/android/googlepaylauncher/f$h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ GooglePayLauncherActivity f50681a;

            a(GooglePayLauncherActivity googlePayLauncherActivity) {
                this.f50681a = googlePayLauncherActivity;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.googlepaylauncher.f.h hVar, Continuation<? super h0> continuation) {
                if (hVar != null) {
                    this.f50681a.r(hVar);
                }
                return h0.f84049a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return GooglePayLauncherActivity.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50679n;
            if (i11 == 0) {
                t.b(obj);
                SharedFlow<com.stripe.android.googlepaylauncher.f.h> sharedFlowP = GooglePayLauncherActivity.this.t().p();
                a aVar = new a(GooglePayLauncherActivity.this);
                this.f50679n = 1;
                if (sharedFlowP.collect(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$4", f = "GooglePayLauncherActivity.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50682n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher<Task<PaymentData>> f50684p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$4$1", f = "GooglePayLauncherActivity.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f50685n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ GooglePayLauncherActivity f50686o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ ActivityResultLauncher<Task<PaymentData>> f50687p;

            /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "task", "Ljn0/h0;", "a", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            static final class C0843a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ ActivityResultLauncher<Task<PaymentData>> f50688a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ GooglePayLauncherActivity f50689b;

                C0843a(ActivityResultLauncher<Task<PaymentData>> activityResultLauncher, GooglePayLauncherActivity googlePayLauncherActivity) {
                    this.f50688a = activityResultLauncher;
                    this.f50689b = googlePayLauncherActivity;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Task<PaymentData> task, Continuation<? super h0> continuation) {
                    if (task != null) {
                        this.f50688a.b(task);
                        this.f50689b.t().t();
                    }
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GooglePayLauncherActivity googlePayLauncherActivity, ActivityResultLauncher<Task<PaymentData>> activityResultLauncher, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f50686o = googlePayLauncherActivity;
                this.f50687p = activityResultLauncher;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f50686o, this.f50687p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f50685n;
                if (i11 == 0) {
                    t.b(obj);
                    SharedFlow<Task<PaymentData>> sharedFlowO = this.f50686o.t().o();
                    C0843a c0843a = new C0843a(this.f50687p, this.f50686o);
                    this.f50685n = 1;
                    if (sharedFlowO.collect(c0843a, this) == coroutine_suspended) {
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
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ActivityResultLauncher<Task<PaymentData>> activityResultLauncher, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f50684p = activityResultLauncher;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return GooglePayLauncherActivity.this.new c(this.f50684p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50682n;
            if (i11 == 0) {
                t.b(obj);
                GooglePayLauncherActivity googlePayLauncherActivity = GooglePayLauncherActivity.this;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                a aVar = new a(googlePayLauncherActivity, this.f50684p, null);
                this.f50682n = 1;
                if (p0.b(googlePayLauncherActivity, state, aVar, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class d extends u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f50690c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f50690c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f50690c.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class e extends u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f50691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f50692d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f50691c = aVar;
            this.f50692d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f50691c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f50692d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements wn0.a<ViewModelProvider.Factory> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            GooglePayLauncherContract.a aVar = GooglePayLauncherActivity.this.args;
            if (aVar == null) {
                s.B("args");
                aVar = null;
            }
            return new g.c(aVar, false, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(com.stripe.android.googlepaylauncher.f.h result) {
        setResult(-1, new Intent().putExtras(q5.d.b(x.a("extra_result", result))));
        finish();
    }

    private final h70.h s() {
        return (h70.h) this.errorReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g t() {
        return (g) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(GooglePayLauncherActivity this$0, ApiTaskResult apiTaskResult) {
        s.k(this$0, "this$0");
        s.h(apiTaskResult);
        this$0.v(apiTaskResult);
    }

    private final void v(ApiTaskResult<PaymentData> taskResult) {
        int statusCode = taskResult.getStatus().getStatusCode();
        if (statusCode == 0) {
            PaymentData result = taskResult.getResult();
            if (result != null) {
                t().k(n.Companion.b(n.INSTANCE, this, null, 2, null), PaymentMethodCreateParams.INSTANCE.D(new JSONObject(result.toJson())));
                return;
            } else {
                h70.h.b.a(s(), h70.h.f.GOOGLE_PAY_MISSING_INTENT_DATA, null, null, 6, null);
                t().x(new com.stripe.android.googlepaylauncher.f.h.Failed(new RuntimeException("Google Pay missing result data.")));
                return;
            }
        }
        if (statusCode == 16) {
            t().x(com.stripe.android.googlepaylauncher.f.h.a.f50797a);
            return;
        }
        Status status = taskResult.getStatus();
        s.j(status, "getStatus(...)");
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        h70.h.b.a(s(), h70.h.d.GOOGLE_PAY_FAILED, null, v0.m(x.a("status_message", statusMessage), x.a("status_code", String.valueOf(status.getStatusCode()))), 2, null);
        g gVarT = t();
        int statusCode2 = status.getStatusCode();
        String statusMessage2 = status.getStatusMessage();
        gVarT.x(new com.stripe.android.googlepaylauncher.f.h.Failed(new RuntimeException("Google Pay failed with error " + statusCode2 + ": " + (statusMessage2 != null ? statusMessage2 : ""))));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        r90.c.a(this);
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, android.app.Activity
    @jn0.e
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 50000:
            case 50001:
                g gVarT = t();
                if (data == null) {
                    data = new Intent();
                }
                gVarT.u(requestCode, data);
                break;
        }
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object objB;
        super.onCreate(savedInstanceState);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            GooglePayLauncherContract.a.Companion companion2 = GooglePayLauncherContract.a.INSTANCE;
            Intent intent = getIntent();
            s.j(intent, "getIntent(...)");
            GooglePayLauncherContract.a aVarA = companion2.a(intent);
            if (aVarA == null) {
                throw new IllegalArgumentException("GooglePayLauncherActivity was started without arguments.");
            }
            objB = jn0.s.b(aVarA);
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                r(new com.stripe.android.googlepaylauncher.f.h.Failed(thE));
                return;
            }
            this.args = (GooglePayLauncherContract.a) objB;
            BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new b(null), 3, null);
            ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new TaskResultContracts.GetPaymentDataResult(), new ActivityResultCallback() { // from class: a60.e
                @Override // androidx.p002activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    GooglePayLauncherActivity.u(this.f476a, (ApiTaskResult) obj);
                }
            });
            s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
            BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new c(activityResultLauncherRegisterForActivityResult, null), 3, null);
        } catch (Throwable th2) {
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
    }
}
