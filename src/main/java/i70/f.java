package i70;

import a70.Unvalidated;
import androidx.p002activity.result.ActivityResultCallback;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH¤@¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Li70/f;", "Actionable", "Lg70/a;", "<init>", "()V", "Lcom/stripe/android/view/n;", "host", "actionable", "Lw30/l$c;", "requestOptions", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/view/n;Ljava/lang/Object;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class f<Actionable> implements g70.a {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.PaymentNextActionHandler", f = "PaymentNextActionHandler.kt", i = {0, 0, 0, 0}, l = {35, 36}, m = "performNextAction", n = {"this", "host", "actionable", "requestOptions"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f76095n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f76096o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f76097p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f76098q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f76099r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ f<Actionable> f76100s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f76101t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<Actionable> fVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f76100s = fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f76099r = obj;
            this.f76101t |= Integer.MIN_VALUE;
            return this.f76100s.d(null, null, null, this);
        }
    }

    @Override // g70.a
    public void b(h.b bVar, ActivityResultCallback<Unvalidated> activityResultCallback) {
        g70.a.C1386a.b(this, bVar, activityResultCallback);
    }

    @Override // g70.a
    public void c() {
        g70.a.C1386a.a(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r2.e(r6, r7, r8, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.stripe.android.view.n r6, Actionable r7, w30.l.Options r8, p013kotlin.coroutines.Continuation<? super jn0.h0> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof i70.f.a
            if (r0 == 0) goto L13
            r0 = r9
            i70.f$a r0 = (i70.f.a) r0
            int r1 = r0.f76101t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f76101t = r1
            goto L18
        L13:
            i70.f$a r0 = new i70.f$a
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f76099r
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f76101t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r9)
            goto L72
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f76098q
            r8 = r6
            w30.l$c r8 = (w30.l.Options) r8
            java.lang.Object r7 = r0.f76097p
            java.lang.Object r6 = r0.f76096o
            com.stripe.android.view.n r6 = (com.stripe.android.view.n) r6
            java.lang.Object r2 = r0.f76095n
            i70.f r2 = (i70.f) r2
            jn0.t.b(r9)
            goto L60
        L47:
            jn0.t.b(r9)
            androidx.lifecycle.LifecycleOwner r9 = r6.d()
            r0.f76095n = r5
            r0.f76096o = r6
            r0.f76097p = r7
            r0.f76098q = r8
            r0.f76101t = r4
            java.lang.Object r9 = i70.g.a(r9, r0)
            if (r9 != r1) goto L5f
            goto L71
        L5f:
            r2 = r5
        L60:
            r9 = 0
            r0.f76095n = r9
            r0.f76096o = r9
            r0.f76097p = r9
            r0.f76098q = r9
            r0.f76101t = r3
            java.lang.Object r6 = r2.e(r6, r7, r8, r0)
            if (r6 != r1) goto L72
        L71:
            return r1
        L72:
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i70.f.d(com.stripe.android.view.n, java.lang.Object, w30.l$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    protected abstract Object e(com.stripe.android.view.n nVar, Actionable actionable, w30.l.Options options, Continuation<? super h0> continuation);
}
