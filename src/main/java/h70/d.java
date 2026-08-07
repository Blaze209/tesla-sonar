package h70;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import f30.PaymentConfiguration;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lh70/d;", "", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f70980a;

    /* JADX INFO: renamed from: h70.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lh70/d$a;", "", "<init>", "()V", "Lo30/d;", "b", "()Lo30/d;", "Lkotlin/coroutines/CoroutineContext;", "a", "()Lkotlin/coroutines/CoroutineContext;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function0;", "", "c", "(Landroid/content/Context;)Lwn0/a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f70980a = new Companion();

        /* JADX INFO: renamed from: h70.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class C1487a extends u implements wn0.a<String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f70981c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1487a(Context context) {
                super(0);
                this.f70981c = context;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return PaymentConfiguration.INSTANCE.a(this.f70981c).getPublishableKey();
            }
        }

        private Companion() {
        }

        public final CoroutineContext a() {
            return Dispatchers.getIO();
        }

        public final o30.d b() {
            return o30.d.INSTANCE.a(false);
        }

        public final wn0.a<String> c(Context context) {
            s.k(context, "context");
            return new C1487a(context);
        }
    }
}
