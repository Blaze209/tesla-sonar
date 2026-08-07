package f30;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lr30/a;", "b", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Lr30/a;", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class u {
    public static final r30.a b(Context context, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        return new r30.a(new r30.c(context, workContext), new r30.b(context), new w30.r(workContext, null, null, 0, null, 30, null), h70.h.INSTANCE.a(context, d1.d()), workContext, new r30.m() { // from class: f30.t
            @Override // r30.m
            public final boolean a() {
                return u.d();
            }
        });
    }

    public static /* synthetic */ r30.a c(Context context, CoroutineContext coroutineContext, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        return b(context, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d() {
        return h0.INSTANCE.a();
    }
}
