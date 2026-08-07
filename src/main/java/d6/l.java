package d6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Ld6/l;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ld6/b0;", "request", "Ld6/c0;", "b", "(Landroid/content/Context;Ld6/b0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Ld6/m;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Ljn0/h0;", "c", "(Landroid/content/Context;Ld6/b0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ld6/m;)V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f59653a;

    /* JADX INFO: renamed from: d6.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld6/l$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ld6/l;", "a", "(Landroid/content/Context;)Ld6/l;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f59653a = new Companion();

        private Companion() {
        }

        public final l a(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            return new n(context);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f59654c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CancellationSignal cancellationSignal) {
            super(1);
            this.f59654c = cancellationSignal;
        }

        public final void a(Throwable th2) {
            this.f59654c.cancel();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Throwable th2) {
            a(th2);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"d6/l$c", "Ld6/m;", "Ld6/c0;", "Landroidx/credentials/exceptions/GetCredentialException;", "result", "Ljn0/h0;", "c", "(Ld6/c0;)V", "e", "b", "(Landroidx/credentials/exceptions/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements m<c0, GetCredentialException> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<c0> f59655a;

        /* JADX WARN: Multi-variable type inference failed */
        c(CancellableContinuation<? super c0> cancellableContinuation) {
            this.f59655a = cancellableContinuation;
        }

        @Override // d6.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(GetCredentialException e11) {
            p013kotlin.jvm.internal.s.k(e11, "e");
            if (this.f59655a.isActive()) {
                CancellableContinuation<c0> cancellableContinuation = this.f59655a;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(jn0.t.a(e11)));
            }
        }

        @Override // d6.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(c0 result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            if (this.f59655a.isActive()) {
                this.f59655a.resumeWith(jn0.s.b(result));
            }
        }
    }

    static /* synthetic */ Object a(l lVar, Context context, b0 b0Var, Continuation<? super c0> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellationSignal cancellationSignal = new CancellationSignal();
        cancellableContinuationImpl.invokeOnCancellation(new b(cancellationSignal));
        lVar.c(context, b0Var, cancellationSignal, new k(), new c(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    default Object b(Context context, b0 b0Var, Continuation<? super c0> continuation) {
        return a(this, context, b0Var, continuation);
    }

    void c(Context context, b0 request, CancellationSignal cancellationSignal, Executor executor, m<c0, GetCredentialException> callback);
}
