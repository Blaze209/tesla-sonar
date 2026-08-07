package f60;

import f30.h0;
import o30.AppInfo;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import w30.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lf60/e;", "", "a", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f64515a;

    /* JADX INFO: renamed from: f60.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf60/e$a;", "", "<init>", "()V", "Lo30/d;", "logger", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lm80/a;", "a", "(Lo30/d;Lkotlin/coroutines/CoroutineContext;)Lm80/a;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f64515a = new Companion();

        private Companion() {
        }

        public final m80.a a(o30.d logger, CoroutineContext workContext) {
            s.k(logger, "logger");
            s.k(workContext, "workContext");
            AppInfo appInfoB = h0.INSTANCE.b();
            return new m80.b(new r(workContext, null, null, 0, logger, 14, null), h0.f64035h, "AndroidBindings/20.52.3", appInfoB);
        }
    }
}
