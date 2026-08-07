package androidx.p003lifecycle;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.location.DeviceOrientationRequest;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aY\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005H\u0007¢\u0006\u0004\b\f\u0010\r*V\b\u0000\u0010\u000e\u001a\u0004\b\u0000\u0010\u0000\"$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00052$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¨\u0006\u000f"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/e0;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "Landroidx/lifecycle/d0;", "a", "(Lkotlin/coroutines/CoroutineContext;JLwn0/p;)Landroidx/lifecycle/d0;", "Block", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {
    public static final <T> d0<T> a(CoroutineContext context, long j11, p<? super e0<T>, ? super Continuation<? super h0>, ? extends Object> block) {
        s.k(context, "context");
        s.k(block, "block");
        return new f(context, j11, block);
    }

    public static /* synthetic */ d0 b(CoroutineContext coroutineContext, long j11, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            j11 = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
        }
        return a(coroutineContext, j11, pVar);
    }
}
