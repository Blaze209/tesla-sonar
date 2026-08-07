package a70;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.SetupIntent;
import f30.SetupIntentResult;
import java.util.List;
import javax.inject.Provider;
import jn0.s;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0094@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0094@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0018J4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0007H\u0094@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\"\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"La70/j;", "La70/e;", "Lcom/stripe/android/model/d1;", "Lf30/g0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function0;", "", "publishableKeyProvider", "Lz60/g;", "stripeRepository", "Lo30/d;", "logger", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Landroid/content/Context;Lwn0/a;Lz60/g;Lo30/d;Lkotlin/coroutines/CoroutineContext;)V", "clientSecret", "Lw30/l$c;", "requestOptions", "", "expandFields", "Ljn0/s;", "s", "(Ljava/lang/String;Lw30/l$c;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "stripeIntentId", "sourceId", "l", "(Ljava/lang/String;Lw30/l$c;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stripeIntent", "", "outcomeFromFlow", "failureMessage", "z", "(Lcom/stripe/android/model/d1;ILjava/lang/String;)Lf30/g0;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j extends e<SetupIntent, SetupIntentResult> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.SetupIntentFlowResultProcessor", f = "PaymentFlowResultProcessor.kt", i = {}, l = {393}, m = "cancelStripeIntentSource-BWLJW6A", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f562n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f564p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f562n = obj;
            this.f564p |= Integer.MIN_VALUE;
            Object objL = j.this.l(null, null, null, this);
            return objL == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objL : s.a(objL);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.SetupIntentFlowResultProcessor", f = "PaymentFlowResultProcessor.kt", i = {}, l = {382}, m = "refreshStripeIntent-BWLJW6A", n = {}, s = {})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f565n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f567p;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f565n = obj;
            this.f567p |= Integer.MIN_VALUE;
            Object objQ = j.this.q(null, null, null, this);
            return objQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQ : s.a(objQ);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.SetupIntentFlowResultProcessor", f = "PaymentFlowResultProcessor.kt", i = {}, l = {370}, m = "retrieveStripeIntent-BWLJW6A", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f568n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f570p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f568n = obj;
            this.f570p |= Integer.MIN_VALUE;
            Object objS = j.this.s(null, null, null, this);
            return objS == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objS : s.a(objS);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, final wn0.a<String> publishableKeyProvider, z60.g stripeRepository, o30.d logger, CoroutineContext workContext) {
        super(context, new Provider() { // from class: a70.i
            @Override // javax.inject.Provider
            public final Object get() {
                return j.y(publishableKeyProvider);
            }
        }, stripeRepository, logger, workContext, null, 32, null);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(publishableKeyProvider, "publishableKeyProvider");
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String y(wn0.a tmp0) {
        p013kotlin.jvm.internal.s.k(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a70.e
    protected Object l(String str, w30.l.Options options, String str2, Continuation<? super s<SetupIntent>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f564p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f564p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f562n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f564p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((s) obj).getValue();
        }
        t.b(obj);
        z60.g stripeRepository = getStripeRepository();
        aVar.f564p = 1;
        Object objS = stripeRepository.s(str, str2, options, aVar);
        return objS == coroutine_suspended ? coroutine_suspended : objS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a70.e
    protected Object q(String str, w30.l.Options options, List<String> list, Continuation<? super s<SetupIntent>> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f567p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f567p = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f565n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f567p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((s) obj).getValue();
        }
        t.b(obj);
        z60.g stripeRepository = getStripeRepository();
        bVar.f567p = 1;
        Object objA = stripeRepository.A(str, options, bVar);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a70.e
    protected Object s(String str, w30.l.Options options, List<String> list, Continuation<? super s<SetupIntent>> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f570p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f570p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f568n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f570p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((s) obj).getValue();
        }
        t.b(obj);
        z60.g stripeRepository = getStripeRepository();
        cVar.f570p = 1;
        Object objG = stripeRepository.g(str, options, list, cVar);
        return objG == coroutine_suspended ? coroutine_suspended : objG;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a70.e
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public SetupIntentResult m(SetupIntent stripeIntent, int outcomeFromFlow, String failureMessage) {
        p013kotlin.jvm.internal.s.k(stripeIntent, "stripeIntent");
        return new SetupIntentResult(stripeIntent, outcomeFromFlow, failureMessage);
    }
}
