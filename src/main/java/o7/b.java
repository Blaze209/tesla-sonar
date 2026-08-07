package o7;

import jn0.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo7/a;", "b", "()Lo7/a;", "Lkotlinx/coroutines/CoroutineScope;", "a", "(Lkotlinx/coroutines/CoroutineScope;)Lo7/a;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final a a(CoroutineScope coroutineScope) {
        s.k(coroutineScope, "<this>");
        return new a(coroutineScope);
    }

    public static final a b() {
        CoroutineContext immediate;
        try {
            immediate = Dispatchers.getMain().getImmediate();
        } catch (IllegalStateException unused) {
            immediate = EmptyCoroutineContext.INSTANCE;
        } catch (q unused2) {
            immediate = EmptyCoroutineContext.INSTANCE;
        }
        return new a(immediate.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    }
}
