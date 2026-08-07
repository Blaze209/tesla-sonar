package l70;

import com.stripe.android.financialconnections.launcher.f;
import jn0.h0;
import jn0.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.m;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \t2\u00020\u0001:\u0001\tJ3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll70/c;", "", "", "financialConnectionsSessionClientSecret", "publishableKey", "stripeAccountId", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/a$c;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f89680a;

    /* JADX INFO: renamed from: l70.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Ll70/c$a;", "", "<init>", "()V", "Landroidx/appcompat/app/c;", "activity", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/launcher/f;", "Ljn0/h0;", "onComplete", "Lkotlin/Function0;", "Ll70/c;", "provider", "Ll70/d;", "isFinancialConnectionsAvailable", "c", "(Landroidx/appcompat/app/c;Lwn0/l;Lwn0/a;Ll70/d;)Ll70/c;", "Li40/e;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f89680a = new Companion();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: l70.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll70/b;", "Lcom/stripe/android/financialconnections/launcher/c;", "b", "()Ll70/b;"}, k = 3, mv = {1, 9, 0})
        public static final class C1890a extends u implements wn0.a<l70.b<com.stripe.android.financialconnections.launcher.c>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.app.c f89681c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l<i40.e, h0> f89682d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1890a(androidx.appcompat.app.c cVar, l<? super i40.e, h0> lVar) {
                super(0);
                this.f89681c = cVar;
                this.f89682d = lVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final l70.b<com.stripe.android.financialconnections.launcher.c> invoke() {
                return new l70.b<>(new com.stripe.android.financialconnections.launcher.c(this.f89681c, new b(this.f89682d)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: l70.c$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll70/b;", "Lcom/stripe/android/financialconnections/launcher/d;", "b", "()Ll70/b;"}, k = 3, mv = {1, 9, 0})
        public static final class b extends u implements wn0.a<l70.b<com.stripe.android.financialconnections.launcher.d>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.app.c f89683c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l<f, h0> f89684d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(androidx.appcompat.app.c cVar, l<? super f, h0> lVar) {
                super(0);
                this.f89683c = cVar;
                this.f89684d = lVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final l70.b<com.stripe.android.financialconnections.launcher.d> invoke() {
                return new l70.b<>(new com.stripe.android.financialconnections.launcher.d(this.f89683c, this.f89684d));
            }
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c b(Companion companion, androidx.appcompat.app.c cVar, l lVar, wn0.a aVar, d dVar, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                aVar = new C1890a(cVar, lVar);
            }
            if ((i11 & 8) != 0) {
                dVar = a.f89677a;
            }
            return companion.a(cVar, lVar, aVar, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c d(Companion companion, androidx.appcompat.app.c cVar, l lVar, wn0.a aVar, d dVar, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                aVar = new b(cVar, lVar);
            }
            if ((i11 & 8) != 0) {
                dVar = a.f89677a;
            }
            return companion.c(cVar, lVar, aVar, dVar);
        }

        public final c a(androidx.appcompat.app.c activity, l<? super i40.e, h0> onComplete, wn0.a<? extends c> provider, d isFinancialConnectionsAvailable) {
            s.k(activity, "activity");
            s.k(onComplete, "onComplete");
            s.k(provider, "provider");
            s.k(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            return isFinancialConnectionsAvailable.invoke() ? provider.invoke() : new e();
        }

        public final c c(androidx.appcompat.app.c activity, l<? super f, h0> onComplete, wn0.a<? extends c> provider, d isFinancialConnectionsAvailable) {
            s.k(activity, "activity");
            s.k(onComplete, "onComplete");
            s.k(provider, "provider");
            s.k(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            return isFinancialConnectionsAvailable.invoke() ? provider.invoke() : new e();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b implements i40.f, m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f89685a;

        b(l function) {
            s.k(function, "function");
            this.f89685a = function;
        }

        @Override // i40.f
        public final /* synthetic */ void a(i40.e eVar) {
            this.f89685a.invoke(eVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof i40.f) && (obj instanceof m)) {
                return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final i<?> getFunctionDelegate() {
            return this.f89685a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    void a(String financialConnectionsSessionClientSecret, String publishableKey, String stripeAccountId, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext);
}
