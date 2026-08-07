package k70;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lk70/u;", "", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k70.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lk70/u$a;", "", "<init>", "()V", "Lt80/p;", "a", "()Lt80/p;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "enableLogging", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Ls80/a;", "b", "(Landroid/content/Context;ZLkotlin/coroutines/CoroutineContext;)Ls80/a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t80.p a() {
            return new t80.p();
        }

        public final s80.a b(Context context, boolean enableLogging, CoroutineContext workContext) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(workContext, "workContext");
            return new s80.b(context, enableLogging, workContext);
        }

        private Companion() {
        }
    }
}
