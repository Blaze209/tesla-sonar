package w80;

import androidx.p002activity.result.ActivityResultRegistry;
import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lw80/o;", "", "Ljn0/h0;", "a", "()V", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f121551a;

    /* JADX INFO: renamed from: w80.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lw80/o$a;", "", "<init>", "()V", "Landroidx/appcompat/app/c;", "activity", "", "stripePublishableKey", "Lkotlin/Function1;", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;", "Ljn0/h0;", "onFinished", "Lh70/h;", "errorReporter", "Lkotlin/Function0;", "Lw80/o;", "provider", "Lw80/j;", "isStripeCardScanAvailable", "a", "(Landroidx/appcompat/app/c;Ljava/lang/String;Lwn0/l;Lh70/h;Lwn0/a;Lw80/j;)Lw80/o;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f121551a = new Companion();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: w80.o$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw80/f;", "b", "()Lw80/f;"}, k = 3, mv = {1, 9, 0})
        public static final class C2603a extends u implements wn0.a<f> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.app.c f121552c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f121553d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ wn0.l<CardScanSheetResult, h0> f121554e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2603a(androidx.appcompat.app.c cVar, String str, wn0.l<? super CardScanSheetResult, h0> lVar) {
                super(0);
                this.f121552c = cVar;
                this.f121553d = str;
                this.f121554e = lVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f invoke() {
                return new f(CardScanSheet.Companion.create$default(CardScanSheet.Companion, this.f121552c, this.f121553d, new b(this.f121554e), (ActivityResultRegistry) null, 8, (Object) null));
            }
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ o b(Companion companion, androidx.appcompat.app.c cVar, String str, wn0.l lVar, h70.h hVar, wn0.a aVar, j jVar, int i11, Object obj) {
            if ((i11 & 16) != 0) {
                aVar = new C2603a(cVar, str, lVar);
            }
            wn0.a aVar2 = aVar;
            if ((i11 & 32) != 0) {
                jVar = new e();
            }
            return companion.a(cVar, str, lVar, hVar, aVar2, jVar);
        }

        public final o a(androidx.appcompat.app.c activity, String stripePublishableKey, wn0.l<? super CardScanSheetResult, h0> onFinished, h70.h errorReporter, wn0.a<? extends o> provider, j isStripeCardScanAvailable) {
            s.k(activity, "activity");
            s.k(stripePublishableKey, "stripePublishableKey");
            s.k(onFinished, "onFinished");
            s.k(errorReporter, "errorReporter");
            s.k(provider, "provider");
            s.k(isStripeCardScanAvailable, "isStripeCardScanAvailable");
            return isStripeCardScanAvailable.invoke() ? provider.invoke() : new p(errorReporter);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b implements CardScanSheet.CardScanResultCallback, p013kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ wn0.l f121555a;

        b(wn0.l function) {
            s.k(function, "function");
            this.f121555a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof CardScanSheet.CardScanResultCallback) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return this.f121555a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    void a();
}
