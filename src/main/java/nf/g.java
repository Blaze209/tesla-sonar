package nf;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import jn0.s;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpe/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "requiredPermission", "Lnf/h;", "a", "(Lpe/d;Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"nf/g$a", "Lme/d;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements me.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f94912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<h> f94913b;

        /* JADX WARN: Multi-variable type inference failed */
        a(String str, CancellableContinuation<? super h> cancellableContinuation) {
            this.f94912a = str;
            this.f94913b = cancellableContinuation;
        }
    }

    public static final Object a(pe.d dVar, Context context, String str, Continuation<? super h> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (androidx.core.content.b.checkSelfPermission(context, str) == 0) {
            s.Companion companion = s.INSTANCE;
            cancellableContinuationImpl.resumeWith(s.b(h.PERMISSION_GRANTED));
        } else {
            dVar.x(context, str, new a(str, cancellableContinuationImpl));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
