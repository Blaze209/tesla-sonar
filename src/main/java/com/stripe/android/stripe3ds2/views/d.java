package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d0;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.e0;
import androidx.p003lifecycle.i0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import ezvcard.property.Gender;
import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002bcB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\u001fJ\u0015\u0010#\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b#\u0010\u001dJ\u0015\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010.R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104R\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u00106\u001a\u0004\b7\u0010\u0011R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0019038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00104R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010\u0011R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020$038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00104R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020$0\u000e8\u0006¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u0010\u0011R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020C038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00104R\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020C0\u000e8\u0006¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bG\u0010\u0011R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020J0\u000e8\u0006¢\u0006\f\n\u0004\bN\u00106\u001a\u0004\bO\u0010\u0011R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020(0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010LR\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020(0\u000e8\u0006¢\u0006\f\n\u0004\bS\u00106\u001a\u0004\bT\u0010\u0011R\"\u0010[\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\b0\u0010ZR\u001a\u0010a\u001a\u00020\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`¨\u0006d"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/d;", "Landroidx/lifecycle/c1;", "Lcom/stripe/android/stripe3ds2/transaction/b;", "challengeActionHandler", "Lt80/v;", "transactionTimer", "Lr80/c;", "errorReporter", "Lv80/b;", "imageCache", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/b;Lt80/v;Lr80/c;Lv80/b;Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/lifecycle/d0;", "", "p", "()Landroidx/lifecycle/d0;", "Lcom/stripe/android/stripe3ds2/transactions/b$d;", "imageData", "", "densityDpi", "Landroid/graphics/Bitmap;", "j", "(Lcom/stripe/android/stripe3ds2/transactions/b$d;I)Landroidx/lifecycle/d0;", "Lcom/stripe/android/stripe3ds2/transaction/a;", "action", "Ljn0/h0;", "x", "(Lcom/stripe/android/stripe3ds2/transaction/a;)V", "w", "()V", "r", "t", "challengeAction", "u", "Lcom/stripe/android/stripe3ds2/transaction/h;", "challengeResult", "q", "(Lcom/stripe/android/stripe3ds2/transaction/h;)V", "Lcom/stripe/android/stripe3ds2/transactions/b;", "cres", "s", "(Lcom/stripe/android/stripe3ds2/transactions/b;)V", "Lcom/stripe/android/stripe3ds2/transaction/b;", "Lt80/v;", "Lv80/b;", "Lcom/stripe/android/stripe3ds2/views/s;", "v", "Lcom/stripe/android/stripe3ds2/views/s;", "imageRepository", "Landroidx/lifecycle/i0;", "Landroidx/lifecycle/i0;", "_refreshUi", "Landroidx/lifecycle/d0;", "l", "refreshUi", "y", "_submitClicked", "z", "o", "submitClicked", "A", "_shouldFinish", "B", "m", "shouldFinish", "", "C", "_challengeText", "D", IntegerTokenConverter.CONVERTER_KEY, "challengeText", "Lcom/stripe/android/stripe3ds2/views/d$c;", "Lcom/stripe/android/stripe3ds2/transaction/d;", "E", "Lcom/stripe/android/stripe3ds2/views/d$c;", "_challengeRequestResult", Gender.FEMALE, "h", "challengeRequestResult", "G", "_nextScreen", "H", "k", "nextScreen", "I", "Z", "n", "()Z", "(Z)V", "shouldRefreshUi", "Lkotlinx/coroutines/Job;", "J", "Lkotlinx/coroutines/Job;", "getTransactionTimerJob$3ds2sdk_release", "()Lkotlinx/coroutines/Job;", "transactionTimerJob", "b", "c", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends c1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final i0<com.stripe.android.stripe3ds2.transaction.h> _shouldFinish;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final d0<com.stripe.android.stripe3ds2.transaction.h> shouldFinish;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final i0<String> _challengeText;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final d0<String> challengeText;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final c<com.stripe.android.stripe3ds2.transaction.d> _challengeRequestResult;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final d0<com.stripe.android.stripe3ds2.transaction.d> challengeRequestResult;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final c<ChallengeResponseData> _nextScreen;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final d0<ChallengeResponseData> nextScreen;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean shouldRefreshUi;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final Job transactionTimerJob;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.transaction.b challengeActionHandler;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final t80.v transactionTimer;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final v80.b imageCache;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final s imageRepository;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final i0<h0> _refreshUi;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final d0<h0> refreshUi;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final i0<com.stripe.android.stripe3ds2.transaction.a> _submitClicked;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final d0<com.stripe.android.stripe3ds2.transaction.a> submitClicked;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$1", f = "ChallengeActivityViewModel.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54229n;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f54229n;
            if (i11 == 0) {
                jn0.t.b(obj);
                t80.v vVar = d.this.transactionTimer;
                this.f54229n = 1;
                if (vVar.a(this) == coroutine_suspended) {
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/d$b;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/stripe3ds2/transaction/b;", "challengeActionHandler", "Lt80/v;", "transactionTimer", "Lr80/c;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/b;Lt80/v;Lr80/c;Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "a", "Lcom/stripe/android/stripe3ds2/transaction/b;", "b", "Lt80/v;", DateTokenConverter.CONVERTER_KEY, "Lr80/c;", "e", "Lkotlin/coroutines/CoroutineContext;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.stripe.android.stripe3ds2.transaction.b challengeActionHandler;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final t80.v transactionTimer;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final r80.c errorReporter;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final CoroutineContext workContext;

        public b(com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, t80.v transactionTimer, r80.c errorReporter, CoroutineContext workContext) {
            p013kotlin.jvm.internal.s.k(challengeActionHandler, "challengeActionHandler");
            p013kotlin.jvm.internal.s.k(transactionTimer, "transactionTimer");
            p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
            p013kotlin.jvm.internal.s.k(workContext, "workContext");
            this.challengeActionHandler = challengeActionHandler;
            this.transactionTimer = transactionTimer;
            this.errorReporter = errorReporter;
            this.workContext = workContext;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass) {
            p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
            return new d(this.challengeActionHandler, this.transactionTimer, this.errorReporter, null, this.workContext, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/d$c;", "T", "Landroidx/lifecycle/i0;", "<init>", "()V", "Ljn0/h0;", "onInactive", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class c<T> extends i0<T> {
        @Override // androidx.p003lifecycle.d0
        protected void onInactive() {
            super.onInactive();
            setValue(null);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.views.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/e0;", "Landroid/graphics/Bitmap;", "Ljn0/h0;", "<anonymous>", "(Landroidx/lifecycle/e0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getImage$1", f = "ChallengeActivityViewModel.kt", i = {}, l = {70, 69}, m = "invokeSuspend", n = {}, s = {})
    static final class C1085d extends SuspendLambda implements wn0.p<e0<Bitmap>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54235n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f54236o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ChallengeResponseData.Image f54238q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f54239r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1085d(ChallengeResponseData.Image image, int i11, Continuation<? super C1085d> continuation) {
            super(2, continuation);
            this.f54238q = image;
            this.f54239r = i11;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e0<Bitmap> e0Var, Continuation<? super h0> continuation) {
            return ((C1085d) create(e0Var, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C1085d c1085d = d.this.new C1085d(this.f54238q, this.f54239r, continuation);
            c1085d.f54236o = obj;
            return c1085d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L19;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f54235n
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                jn0.t.b(r8)
                goto L53
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f54236o
                androidx.lifecycle.e0 r1 = (androidx.p003lifecycle.e0) r1
                jn0.t.b(r8)
                goto L48
            L23:
                jn0.t.b(r8)
                java.lang.Object r8 = r7.f54236o
                r1 = r8
                androidx.lifecycle.e0 r1 = (androidx.p003lifecycle.e0) r1
                com.stripe.android.stripe3ds2.views.d r8 = com.stripe.android.stripe3ds2.views.d.this
                com.stripe.android.stripe3ds2.views.s r8 = com.stripe.android.stripe3ds2.views.d.c(r8)
                com.stripe.android.stripe3ds2.transactions.b$d r5 = r7.f54238q
                if (r5 == 0) goto L3c
                int r6 = r7.f54239r
                java.lang.String r5 = r5.b(r6)
                goto L3d
            L3c:
                r5 = r2
            L3d:
                r7.f54236o = r1
                r7.f54235n = r4
                java.lang.Object r8 = r8.e(r5, r7)
                if (r8 != r0) goto L48
                goto L52
            L48:
                r7.f54236o = r2
                r7.f54235n = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L53
            L52:
                return r0
            L53:
                jn0.h0 r8 = jn0.h0.f84049a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.d.C1085d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/e0;", "", "Ljn0/h0;", "<anonymous>", "(Landroidx/lifecycle/e0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1", f = "ChallengeActivityViewModel.kt", i = {}, l = {61, 60}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<e0<Boolean>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54240n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f54241o;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "isTimeout"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1$1", f = "ChallengeActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<Boolean, Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f54243n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ boolean f54244o;

            a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            public final Object a(boolean z11, Continuation<? super Boolean> continuation) {
                return ((a) create(Boolean.valueOf(z11), continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.f54244o = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f54243n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return Boxing.boxBoolean(this.f54244o);
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e0<Boolean> e0Var, Continuation<? super h0> continuation) {
            return ((e) create(e0Var, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = d.this.new e(continuation);
            eVar.f54241o = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f54240n
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                jn0.t.b(r7)
                goto L50
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.f54241o
                androidx.lifecycle.e0 r1 = (androidx.p003lifecycle.e0) r1
                jn0.t.b(r7)
                goto L45
            L23:
                jn0.t.b(r7)
                java.lang.Object r7 = r6.f54241o
                r1 = r7
                androidx.lifecycle.e0 r1 = (androidx.p003lifecycle.e0) r1
                com.stripe.android.stripe3ds2.views.d r7 = com.stripe.android.stripe3ds2.views.d.this
                t80.v r7 = com.stripe.android.stripe3ds2.views.d.f(r7)
                kotlinx.coroutines.flow.Flow r7 = r7.b()
                com.stripe.android.stripe3ds2.views.d$e$a r5 = new com.stripe.android.stripe3ds2.views.d$e$a
                r5.<init>(r2)
                r6.f54241o = r1
                r6.f54240n = r4
                java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r7, r5, r6)
                if (r7 != r0) goto L45
                goto L4f
            L45:
                r6.f54241o = r2
                r6.f54240n = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L50
            L4f:
                return r0
            L50:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$submit$1", f = "ChallengeActivityViewModel.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f54245n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f54246o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.stripe3ds2.transaction.a f54248q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.stripe.android.stripe3ds2.transaction.a aVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f54248q = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new f(this.f54248q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c cVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f54246o;
            if (i11 == 0) {
                jn0.t.b(obj);
                c cVar2 = d.this._challengeRequestResult;
                com.stripe.android.stripe3ds2.transaction.b bVar = d.this.challengeActionHandler;
                com.stripe.android.stripe3ds2.transaction.a aVar = this.f54248q;
                this.f54245n = cVar2;
                this.f54246o = 1;
                Object objA = bVar.a(aVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cVar = cVar2;
                obj = objA;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) this.f54245n;
                jn0.t.b(obj);
            }
            cVar.postValue(obj);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ d(com.stripe.android.stripe3ds2.transaction.b bVar, t80.v vVar, r80.c cVar, v80.b bVar2, CoroutineContext coroutineContext, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, vVar, cVar, (i11 & 8) != 0 ? v80.b.a.f118418a : bVar2, coroutineContext);
    }

    public final d0<com.stripe.android.stripe3ds2.transaction.d> h() {
        return this.challengeRequestResult;
    }

    public final d0<String> i() {
        return this.challengeText;
    }

    public final d0<Bitmap> j(ChallengeResponseData.Image imageData, int densityDpi) {
        return androidx.p003lifecycle.g.b(null, 0L, new C1085d(imageData, densityDpi, null), 3, null);
    }

    public final d0<ChallengeResponseData> k() {
        return this.nextScreen;
    }

    public final d0<h0> l() {
        return this.refreshUi;
    }

    public final d0<com.stripe.android.stripe3ds2.transaction.h> m() {
        return this.shouldFinish;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getShouldRefreshUi() {
        return this.shouldRefreshUi;
    }

    public final d0<com.stripe.android.stripe3ds2.transaction.a> o() {
        return this.submitClicked;
    }

    public final d0<Boolean> p() {
        return androidx.p003lifecycle.g.b(null, 0L, new e(null), 3, null);
    }

    public final void q(com.stripe.android.stripe3ds2.transaction.h challengeResult) {
        p013kotlin.jvm.internal.s.k(challengeResult, "challengeResult");
        this._shouldFinish.postValue(challengeResult);
    }

    public final void r() {
        this.imageCache.clear();
    }

    public final void s(ChallengeResponseData cres) {
        p013kotlin.jvm.internal.s.k(cres, "cres");
        this._nextScreen.setValue(cres);
    }

    public final void t() {
        this._refreshUi.setValue(h0.f84049a);
    }

    public final void u(com.stripe.android.stripe3ds2.transaction.a challengeAction) {
        p013kotlin.jvm.internal.s.k(challengeAction, "challengeAction");
        this._submitClicked.postValue(challengeAction);
    }

    public final void v(boolean z11) {
        this.shouldRefreshUi = z11;
    }

    public final void w() {
        Job.DefaultImpls.cancel$default(this.transactionTimerJob, (CancellationException) null, 1, (Object) null);
    }

    public final void x(com.stripe.android.stripe3ds2.transaction.a action) {
        p013kotlin.jvm.internal.s.k(action, "action");
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new f(action, null), 3, null);
    }

    public d(com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, t80.v transactionTimer, r80.c errorReporter, v80.b imageCache, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(challengeActionHandler, "challengeActionHandler");
        p013kotlin.jvm.internal.s.k(transactionTimer, "transactionTimer");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(imageCache, "imageCache");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.challengeActionHandler = challengeActionHandler;
        this.transactionTimer = transactionTimer;
        this.imageCache = imageCache;
        this.imageRepository = new s(errorReporter, workContext);
        i0<h0> i0Var = new i0<>();
        this._refreshUi = i0Var;
        this.refreshUi = i0Var;
        i0<com.stripe.android.stripe3ds2.transaction.a> i0Var2 = new i0<>();
        this._submitClicked = i0Var2;
        this.submitClicked = i0Var2;
        i0<com.stripe.android.stripe3ds2.transaction.h> i0Var3 = new i0<>();
        this._shouldFinish = i0Var3;
        this.shouldFinish = i0Var3;
        i0<String> i0Var4 = new i0<>();
        this._challengeText = i0Var4;
        this.challengeText = i0Var4;
        c<com.stripe.android.stripe3ds2.transaction.d> cVar = new c<>();
        this._challengeRequestResult = cVar;
        this.challengeRequestResult = cVar;
        c<ChallengeResponseData> cVar2 = new c<>();
        this._nextScreen = cVar2;
        this.nextScreen = cVar2;
        this.transactionTimerJob = BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new a(null), 3, null);
    }
}
