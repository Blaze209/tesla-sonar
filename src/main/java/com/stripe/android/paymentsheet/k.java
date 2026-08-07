package com.stripe.android.paymentsheet;

import androidx.p003lifecycle.s0;
import c60.LinkConfiguration;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.PaymentMethod;
import g80.LinkState;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u00012B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J,\u0010+\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0016¢\u0006\u0004\b-\u0010\"J\u0015\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0019¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0016¢\u0006\u0004\b1\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u00104\u001a\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010<R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020;0>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u001c\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001f\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140G8\u0006¢\u0006\f\n\u0004\b-\u0010H\u001a\u0004\bD\u0010IR\u001c\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010ER\u001c\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010HR\u001b\u0010P\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010N\u001a\u0004\b8\u0010O¨\u0006Q"}, d2 = {"Lcom/stripe/android/paymentsheet/k;", "", "Lcom/stripe/android/link/d;", "linkLauncher", "Lc60/d;", "linkConfigurationCoordinator", "Landroidx/lifecycle/s0;", "savedStateHandle", "Ld60/d;", "linkStore", "Lf60/a$a;", "linkAnalyticsComponentBuilder", "<init>", "(Lcom/stripe/android/link/d;Lc60/d;Landroidx/lifecycle/s0;Ld60/d;Lf60/a$a;)V", "Lc60/c;", "configuration", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lw70/j$a;", "customerRequestedSave", "", "shouldCompleteLinkInlineFlow", "Ljn0/h0;", "b", "(Lc60/c;Lcom/stripe/android/model/w0;Lw70/j$a;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/link/a;", "Lcom/stripe/android/payments/paymentlauncher/f;", "c", "(Lcom/stripe/android/link/a;)Lcom/stripe/android/payments/paymentlauncher/f;", "Lh/b;", "activityResultCaller", "l", "(Lh/b;)V", "n", "()V", "Lg80/g;", "state", "m", "(Lg80/g;)V", "Lm60/m;", "userInput", "Lw70/j;", "paymentSelection", "k", "(Lm60/m;Lw70/j;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "result", "j", "(Lcom/stripe/android/link/a;)V", IntegerTokenConverter.CONVERTER_KEY, "a", "Lcom/stripe/android/link/d;", "Lc60/d;", "e", "()Lc60/d;", "Landroidx/lifecycle/s0;", DateTokenConverter.CONVERTER_KEY, "Ld60/d;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/paymentsheet/k$a;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_processingState", "Lkotlinx/coroutines/flow/Flow;", "f", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "processingState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "g", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_isLinkEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "isLinkEnabled", "_linkConfiguration", "linkConfiguration", "Le60/c;", "Lkotlin/Lazy;", "()Le60/c;", "linkAnalyticsHelper", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.link.d linkLauncher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c60.d linkConfigurationCoordinator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d60.d linkStore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final MutableSharedFlow<a> _processingState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Flow<a> processingState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> _isLinkEnabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> isLinkEnabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<LinkConfiguration> _linkConfiguration;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<LinkConfiguration> linkConfiguration;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy linkAnalyticsHelper;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/k$a;", "", "<init>", "()V", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/k$a$a;", "Lcom/stripe/android/paymentsheet/k$a$b;", "Lcom/stripe/android/paymentsheet/k$a$c;", "Lcom/stripe/android/paymentsheet/k$a$d;", "Lcom/stripe/android/paymentsheet/k$a$e;", "Lcom/stripe/android/paymentsheet/k$a$f;", "Lcom/stripe/android/paymentsheet/k$a$g;", "Lcom/stripe/android/paymentsheet/k$a$h;", "Lcom/stripe/android/paymentsheet/k$a$i;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/k$a$a;", "Lcom/stripe/android/paymentsheet/k$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class C1011a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1011a f53159a = new C1011a();

            private C1011a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1011a);
            }

            public int hashCode() {
                return -1384461919;
            }

            public String toString() {
                return "Cancelled";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/k$a$b;", "Lcom/stripe/android/paymentsheet/k$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f53160a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 870884921;
            }

            public String toString() {
                return "CompleteWithoutLink";
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.k$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/k$a$c;", "Lcom/stripe/android/paymentsheet/k$a;", "Lcom/stripe/android/payments/paymentlauncher/f;", "result", "<init>", "(Lcom/stripe/android/payments/paymentlauncher/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/payments/paymentlauncher/f;", "()Lcom/stripe/android/payments/paymentlauncher/f;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CompletedWithPaymentResult extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f53161b = com.stripe.android.payments.paymentlauncher.f.f52254b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final com.stripe.android.payments.paymentlauncher.f result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CompletedWithPaymentResult(com.stripe.android.payments.paymentlauncher.f result) {
                super(null);
                p013kotlin.jvm.internal.s.k(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final com.stripe.android.payments.paymentlauncher.f getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CompletedWithPaymentResult) && p013kotlin.jvm.internal.s.f(this.result, ((CompletedWithPaymentResult) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "CompletedWithPaymentResult(result=" + this.result + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/k$a$d;", "Lcom/stripe/android/paymentsheet/k$a;", "", "message", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends a {
            public final String a() {
                throw null;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/k$a$e;", "Lcom/stripe/android/paymentsheet/k$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f53163a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1190189758;
            }

            public String toString() {
                return "Launched";
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.k$a$f, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/k$a$f;", "Lcom/stripe/android/paymentsheet/k$a;", "Lw70/j;", "paymentSelection", "<init>", "(Lw70/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw70/j;", "()Lw70/j;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PaymentDetailsCollected extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final w70.j paymentSelection;

            public PaymentDetailsCollected(w70.j jVar) {
                super(null);
                this.paymentSelection = jVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final w70.j getPaymentSelection() {
                return this.paymentSelection;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PaymentDetailsCollected) && p013kotlin.jvm.internal.s.f(this.paymentSelection, ((PaymentDetailsCollected) other).paymentSelection);
            }

            public int hashCode() {
                w70.j jVar = this.paymentSelection;
                if (jVar == null) {
                    return 0;
                }
                return jVar.hashCode();
            }

            public String toString() {
                return "PaymentDetailsCollected(paymentSelection=" + this.paymentSelection + ")";
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.k$a$g, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/k$a$g;", "Lcom/stripe/android/paymentsheet/k$a;", "Lcom/stripe/android/model/v0;", "paymentMethod", "<init>", "(Lcom/stripe/android/model/v0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/v0;", "()Lcom/stripe/android/model/v0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PaymentMethodCollected extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f53165b = PaymentMethod.f51534u;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentMethod paymentMethod;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentMethodCollected(PaymentMethod paymentMethod) {
                super(null);
                p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PaymentMethodCollected) && p013kotlin.jvm.internal.s.f(this.paymentMethod, ((PaymentMethodCollected) other).paymentMethod);
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "PaymentMethodCollected(paymentMethod=" + this.paymentMethod + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/k$a$h;", "Lcom/stripe/android/paymentsheet/k$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class h extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f53167a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return -66772493;
            }

            public String toString() {
                return "Ready";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/k$a$i;", "Lcom/stripe/android/paymentsheet/k$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class i extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f53168a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return 1573500113;
            }

            public String toString() {
                return "Started";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53169a;

        static {
            int[] iArr = new int[g60.a.values().length];
            try {
                iArr[g60.a.Verified.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g60.a.VerificationStarted.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g60.a.NeedsVerification.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g60.a.SignedOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g60.a.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f53169a = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.LinkHandler", f = "LinkHandler.kt", i = {1, 1, 1}, l = {155, 157, 197}, m = "completeLinkInlinePayment", n = {"this", "paymentMethodCreateParams", "customerRequestedSave"}, s = {"L$0", "L$1", "L$2"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f53170n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f53171o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f53172p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f53173q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f53175s;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53173q = obj;
            this.f53175s |= Integer.MIN_VALUE;
            return k.this.b(null, null, null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le60/c;", "b", "()Le60/c;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<e60.c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f60.a.InterfaceC1329a f53176c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f60.a.InterfaceC1329a interfaceC1329a) {
            super(0);
            this.f53176c = interfaceC1329a;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e60.c invoke() {
            return this.f53176c.build().a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.LinkHandler$logOut$1", f = "LinkHandler.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53177n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ LinkConfiguration f53179p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(LinkConfiguration linkConfiguration, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f53179p = linkConfiguration;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return k.this.new e(this.f53179p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53177n;
            if (i11 == 0) {
                jn0.t.b(obj);
                c60.d linkConfigurationCoordinator = k.this.getLinkConfigurationCoordinator();
                LinkConfiguration linkConfiguration = this.f53179p;
                this.f53177n = 1;
                if (linkConfigurationCoordinator.e(linkConfiguration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                ((jn0.s) obj).getValue();
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.LinkHandler", f = "LinkHandler.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 5, 6}, l = {104, 108, 110, 120, 125, 128, 135, 140}, m = "payWithLinkInline", n = {"this", "userInput", "paymentSelection", "params", "shouldCompleteLinkInlineFlow", "this", "userInput", "paymentSelection", "params", "configuration", "shouldCompleteLinkInlineFlow", "this", "userInput", "paymentSelection", "shouldCompleteLinkInlineFlow", "this", "this"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$0"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f53180n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f53181o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f53182p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f53183q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f53184r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f53185s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f53186t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f53188v;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53186t = obj;
            this.f53188v |= Integer.MIN_VALUE;
            return k.this.k(null, null, false, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class g extends p013kotlin.jvm.internal.p implements wn0.l<com.stripe.android.link.a, h0> {
        g(Object obj) {
            super(1, obj, k.class, "onLinkActivityResult", "onLinkActivityResult(Lcom/stripe/android/link/LinkActivityResult;)V", 0);
        }

        public final void a(com.stripe.android.link.a p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((k) this.receiver).j(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(com.stripe.android.link.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public k(com.stripe.android.link.d linkLauncher, c60.d linkConfigurationCoordinator, s0 savedStateHandle, d60.d linkStore, f60.a.InterfaceC1329a linkAnalyticsComponentBuilder) {
        p013kotlin.jvm.internal.s.k(linkLauncher, "linkLauncher");
        p013kotlin.jvm.internal.s.k(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        p013kotlin.jvm.internal.s.k(linkStore, "linkStore");
        p013kotlin.jvm.internal.s.k(linkAnalyticsComponentBuilder, "linkAnalyticsComponentBuilder");
        this.linkLauncher = linkLauncher;
        this.linkConfigurationCoordinator = linkConfigurationCoordinator;
        this.savedStateHandle = savedStateHandle;
        this.linkStore = linkStore;
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 5, null, 4, null);
        this._processingState = mutableSharedFlowMutableSharedFlow$default;
        this.processingState = mutableSharedFlowMutableSharedFlow$default;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._isLinkEnabled = MutableStateFlow;
        this.isLinkEnabled = MutableStateFlow;
        MutableStateFlow<LinkConfiguration> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._linkConfiguration = MutableStateFlow2;
        this.linkConfiguration = FlowKt.asStateFlow(MutableStateFlow2);
        this.linkAnalyticsHelper = jn0.m.b(new d(linkAnalyticsComponentBuilder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:51:0x0125  */
    /* JADX WARN: Code duplicated, block: B:57:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r1.emit(r2, r3) == r4) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013d, code lost:
    
        if (r2.emit(r5, r3) == r4) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(c60.LinkConfiguration r27, com.stripe.android.model.PaymentMethodCreateParams r28, w70.j.a r29, boolean r30, p013kotlin.coroutines.Continuation<? super jn0.h0> r31) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.k.b(c60.c, com.stripe.android.model.w0, w70.j$a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final com.stripe.android.payments.paymentlauncher.f c(com.stripe.android.link.a aVar) {
        if (aVar instanceof com.stripe.android.link.a.Completed) {
            return com.stripe.android.payments.paymentlauncher.f.c.f52256c;
        }
        if (aVar instanceof com.stripe.android.link.a.Canceled) {
            return com.stripe.android.payments.paymentlauncher.f.a.f52255c;
        }
        if (aVar instanceof com.stripe.android.link.a.Failed) {
            return new com.stripe.android.payments.paymentlauncher.f.d(((com.stripe.android.link.a.Failed) aVar).getError());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final e60.c d() {
        return (e60.c) this.linkAnalyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c60.d getLinkConfigurationCoordinator() {
        return this.linkConfigurationCoordinator;
    }

    public final Flow<a> f() {
        return this.processingState;
    }

    public final StateFlow<Boolean> g() {
        return this.isLinkEnabled;
    }

    public final void h() {
        LinkConfiguration value = this._linkConfiguration.getValue();
        if (value == null) {
            return;
        }
        this.linkLauncher.b(value);
        this._processingState.tryEmit(a.e.f53163a);
    }

    public final void i() {
        LinkConfiguration value = this.linkConfiguration.getValue();
        if (value == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new e(value, null), 3, null);
    }

    public final void j(com.stripe.android.link.a result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        com.stripe.android.link.a.Completed completed = result instanceof com.stripe.android.link.a.Completed ? (com.stripe.android.link.a.Completed) result : null;
        PaymentMethod paymentMethod = completed != null ? completed.getPaymentMethod() : null;
        boolean z11 = (result instanceof com.stripe.android.link.a.Canceled) && ((com.stripe.android.link.a.Canceled) result).getReason() == com.stripe.android.link.a.Canceled.b.BackPressed;
        if (paymentMethod != null) {
            this._processingState.tryEmit(new a.PaymentMethodCollected(paymentMethod));
            this.linkStore.d();
        } else if (z11) {
            this._processingState.tryEmit(a.C1011a.f53159a);
        } else {
            this._processingState.tryEmit(new a.CompletedWithPaymentResult(c(result)));
            this.linkStore.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    /* JADX WARN: Code duplicated, block: B:37:0x0113  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x0143  */
    /* JADX WARN: Code duplicated, block: B:55:0x015b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0176  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01da  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0155, code lost:
    
        if (r1.k(r6, r11, r2, r9) == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016c, code lost:
    
        if (r2.emit(r4, r9) == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0195, code lost:
    
        if (r1.emit(r2, r9) == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b3, code lost:
    
        if (r1.emit(r2, r9) == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d7, code lost:
    
        if (r14.b(r4, r13, r7, r8, r9) == r3) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(m60.m r18, w70.j r19, boolean r20, p013kotlin.coroutines.Continuation<? super jn0.h0> r21) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.k.k(m60.m, w70.j, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void l(h.b activityResultCaller) {
        p013kotlin.jvm.internal.s.k(activityResultCaller, "activityResultCaller");
        this.linkLauncher.c(activityResultCaller, new g(this));
    }

    public final void m(LinkState state) {
        this._isLinkEnabled.setValue(Boolean.valueOf(state != null));
        if (state == null) {
            return;
        }
        this._linkConfiguration.setValue(state.getConfiguration());
    }

    public final void n() {
        this.linkLauncher.e();
    }
}
