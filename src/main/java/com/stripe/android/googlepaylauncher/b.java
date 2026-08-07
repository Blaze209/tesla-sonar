package com.stripe.android.googlepaylauncher;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;
import jn0.t;
import kotlinx.coroutines.tasks.TasksKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/googlepaylauncher/b;", "Lcom/stripe/android/googlepaylauncher/e;", "Lcom/google/android/gms/wallet/PaymentsClient;", "paymentsClient", "<init>", "(Lcom/google/android/gms/wallet/PaymentsClient;)V", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "request", "", "a", "(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/gms/wallet/PaymentsClient;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PaymentsClient paymentsClient;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/googlepaylauncher/b$a;", "Lcom/stripe/android/googlepaylauncher/e$a;", "<init>", "()V", "Lcom/google/android/gms/wallet/PaymentsClient;", "paymentsClient", "Lcom/stripe/android/googlepaylauncher/e;", "a", "(Lcom/google/android/gms/wallet/PaymentsClient;)Lcom/stripe/android/googlepaylauncher/e;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e.a {
        @Override // com.stripe.android.googlepaylauncher.e.a
        public e a(PaymentsClient paymentsClient) {
            s.k(paymentsClient, "paymentsClient");
            return new b(paymentsClient);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.DefaultGooglePayAvailabilityClient", f = "GooglePayAvailabilityClient.kt", i = {}, l = {22}, m = "isReady", n = {}, s = {})
    static final class C0849b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f50749n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f50751p;

        C0849b(Continuation<? super C0849b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50749n = obj;
            this.f50751p |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    public b(PaymentsClient paymentsClient) {
        s.k(paymentsClient, "paymentsClient");
        this.paymentsClient = paymentsClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.stripe.android.googlepaylauncher.e
    public Object a(IsReadyToPayRequest isReadyToPayRequest, Continuation<? super Boolean> continuation) {
        C0849b c0849b;
        if (continuation instanceof C0849b) {
            c0849b = (C0849b) continuation;
            int i11 = c0849b.f50751p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0849b.f50751p = i11 - Integer.MIN_VALUE;
            } else {
                c0849b = new C0849b(continuation);
            }
        } else {
            c0849b = new C0849b(continuation);
        }
        Object objAwait = c0849b.f50749n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c0849b.f50751p;
        if (i12 == 0) {
            t.b(objAwait);
            Task<Boolean> taskIsReadyToPay = this.paymentsClient.isReadyToPay(isReadyToPayRequest);
            s.j(taskIsReadyToPay, "isReadyToPay(...)");
            c0849b.f50751p = 1;
            objAwait = TasksKt.await(taskIsReadyToPay, c0849b);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objAwait);
        }
        s.j(objAwait, "await(...)");
        return objAwait;
    }
}
