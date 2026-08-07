package kotlinx.coroutines;

import ch.qos.logback.core.CoreConstants;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BW\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\t2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJh\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R.\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0011\u0010/\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lkotlinx/coroutines/CompletedContinuation;", "R", "", "result", "Lkotlinx/coroutines/CancelHandler;", "cancelHandler", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "Ljn0/h0;", "onCancellation", "idempotentResume", "cancelCause", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/CancelHandler;Lwn0/q;Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/CancellableContinuationImpl;", "cont", "cause", "invokeHandlers", "(Lkotlinx/coroutines/CancellableContinuationImpl;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lkotlinx/coroutines/CancelHandler;", "component3", "()Lwn0/q;", "component4", "component5", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Object;Lkotlinx/coroutines/CancelHandler;Lwn0/q;Ljava/lang/Object;Ljava/lang/Throwable;)Lkotlinx/coroutines/CompletedContinuation;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "Lkotlinx/coroutines/CancelHandler;", "Lwn0/q;", "Ljava/lang/Throwable;", "getCancelled", "()Z", "cancelled", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class CompletedContinuation<R> {
    public final Throwable cancelCause;
    public final CancelHandler cancelHandler;
    public final Object idempotentResume;
    public final q<Throwable, R, CoroutineContext, h0> onCancellation;
    public final R result;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletedContinuation(R r11, CancelHandler cancelHandler, q<? super Throwable, ? super R, ? super CoroutineContext, h0> qVar, Object obj, Throwable th2) {
        this.result = r11;
        this.cancelHandler = cancelHandler;
        this.onCancellation = qVar;
        this.idempotentResume = obj;
        this.cancelCause = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompletedContinuation copy$default(CompletedContinuation completedContinuation, Object obj, CancelHandler cancelHandler, q qVar, Object obj2, Throwable th2, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            obj = completedContinuation.result;
        }
        if ((i11 & 2) != 0) {
            cancelHandler = completedContinuation.cancelHandler;
        }
        if ((i11 & 4) != 0) {
            qVar = completedContinuation.onCancellation;
        }
        if ((i11 & 8) != 0) {
            obj2 = completedContinuation.idempotentResume;
        }
        if ((i11 & 16) != 0) {
            th2 = completedContinuation.cancelCause;
        }
        Throwable th3 = th2;
        q qVar2 = qVar;
        return completedContinuation.copy(obj, cancelHandler, qVar2, obj2, th3);
    }

    public final R component1() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CancelHandler getCancelHandler() {
        return this.cancelHandler;
    }

    public final q<Throwable, R, CoroutineContext, h0> component3() {
        return this.onCancellation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getIdempotentResume() {
        return this.idempotentResume;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Throwable getCancelCause() {
        return this.cancelCause;
    }

    public final CompletedContinuation<R> copy(R result, CancelHandler cancelHandler, q<? super Throwable, ? super R, ? super CoroutineContext, h0> onCancellation, Object idempotentResume, Throwable cancelCause) {
        return new CompletedContinuation<>(result, cancelHandler, onCancellation, idempotentResume, cancelCause);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) other;
        return s.f(this.result, completedContinuation.result) && s.f(this.cancelHandler, completedContinuation.cancelHandler) && s.f(this.onCancellation, completedContinuation.onCancellation) && s.f(this.idempotentResume, completedContinuation.idempotentResume) && s.f(this.cancelCause, completedContinuation.cancelCause);
    }

    public final boolean getCancelled() {
        return this.cancelCause != null;
    }

    public int hashCode() {
        R r11 = this.result;
        int iHashCode = (r11 == null ? 0 : r11.hashCode()) * 31;
        CancelHandler cancelHandler = this.cancelHandler;
        int iHashCode2 = (iHashCode + (cancelHandler == null ? 0 : cancelHandler.hashCode())) * 31;
        q<Throwable, R, CoroutineContext, h0> qVar = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th2 = this.cancelCause;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final void invokeHandlers(CancellableContinuationImpl<?> cont, Throwable cause) {
        CancelHandler cancelHandler = this.cancelHandler;
        if (cancelHandler != null) {
            cont.callCancelHandler(cancelHandler, cause);
        }
        q<Throwable, R, CoroutineContext, h0> qVar = this.onCancellation;
        if (qVar != null) {
            cont.callOnCancellation(qVar, cause, this.result);
        }
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ CompletedContinuation(Object obj, CancelHandler cancelHandler, q qVar, Object obj2, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? null : cancelHandler, (i11 & 4) != 0 ? null : qVar, (i11 & 8) != 0 ? null : obj2, (i11 & 16) != 0 ? null : th2);
    }
}
