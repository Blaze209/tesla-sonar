package expo.modules.kotlin.activityaware;

import androidx.appcompat.app.c;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"expo/modules/kotlin/activityaware/AppCompatActivityAwareKt$withActivityAvailable$2$listener$1", "Lexpo/modules/kotlin/activityaware/OnActivityAvailableListener;", "Landroidx/appcompat/app/c;", "activity", "Ljn0/h0;", "onActivityAvailable", "(Landroidx/appcompat/app/c;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
public final class AppCompatActivityAwareKt$withActivityAvailable$2$listener$1 implements OnActivityAvailableListener {
    final /* synthetic */ CancellableContinuation<R> $continuation;
    final /* synthetic */ l<c, R> $onActivityAvailable;
    final /* synthetic */ AppCompatActivityAware $this_withActivityAvailable;

    /* JADX WARN: Multi-variable type inference failed */
    public AppCompatActivityAwareKt$withActivityAvailable$2$listener$1(CancellableContinuation<? super R> cancellableContinuation, AppCompatActivityAware appCompatActivityAware, l<? super c, ? extends R> lVar) {
        this.$continuation = cancellableContinuation;
        this.$this_withActivityAvailable = appCompatActivityAware;
        this.$onActivityAvailable = lVar;
    }

    @Override // expo.modules.kotlin.activityaware.OnActivityAvailableListener
    public void onActivityAvailable(c activity) {
        Object objB;
        s.k(activity, "activity");
        if (this.$continuation.isActive()) {
            this.$this_withActivityAvailable.removeOnActivityAvailableListener(this);
            Continuation continuation = this.$continuation;
            l<c, R> lVar = this.$onActivityAvailable;
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(lVar.invoke(activity));
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            continuation.resumeWith(objB);
        }
    }
}
