package e40;

import android.content.Context;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Le40/j0;", "", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f61756a;

    /* JADX INFO: renamed from: e40.j0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le40/j0$a;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/Function1;", "La40/a;", "Ln70/r;", "a", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Lwn0/l;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f61756a = new Companion();

        /* JADX INFO: renamed from: e40.j0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La40/a;", "customer", "Ln70/e;", "a", "(La40/a;)Ln70/e;"}, k = 3, mv = {1, 9, 0})
        static final class C1266a extends p013kotlin.jvm.internal.u implements wn0.l<a40.a, n70.e> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f61757c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f61758d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1266a(Context context, CoroutineContext coroutineContext) {
                super(1);
                this.f61757c = context;
                this.f61758d = coroutineContext;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n70.e invoke(a40.a customer) {
                p013kotlin.jvm.internal.s.k(customer, "customer");
                return new n70.e(this.f61757c, customer.getCustomerId(), this.f61758d);
            }
        }

        private Companion() {
        }

        public final wn0.l<a40.a, n70.r> a(Context appContext, CoroutineContext workContext) {
            p013kotlin.jvm.internal.s.k(appContext, "appContext");
            p013kotlin.jvm.internal.s.k(workContext, "workContext");
            return new C1266a(appContext, workContext);
        }
    }
}
