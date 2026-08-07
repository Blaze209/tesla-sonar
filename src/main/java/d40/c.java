package d40;

import android.content.Context;
import n70.r;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ld40/c;", "", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f59355a;

    /* JADX INFO: renamed from: d40.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ld40/c$a;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/Function1;", "", "Ln70/r;", "a", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Lwn0/l;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f59355a = new Companion();

        /* JADX INFO: renamed from: d40.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "customerId", "Ln70/e;", "a", "(Ljava/lang/String;)Ln70/e;"}, k = 3, mv = {1, 9, 0})
        static final class C1214a extends u implements l<String, n70.e> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f59356c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f59357d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1214a(Context context, CoroutineContext coroutineContext) {
                super(1);
                this.f59356c = context;
                this.f59357d = coroutineContext;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n70.e invoke(String customerId) {
                s.k(customerId, "customerId");
                return new n70.e(this.f59356c, customerId, this.f59357d);
            }
        }

        private Companion() {
        }

        public final l<String, r> a(Context appContext, CoroutineContext workContext) {
            s.k(appContext, "appContext");
            s.k(workContext, "workContext");
            return new C1214a(appContext, workContext);
        }
    }
}
