package r70;

import c80.CvcRecollectionData;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.y;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import w70.j;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0013\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lr70/a;", "", "Lw70/j;", "paymentSelection", "Lkotlin/Function1;", "Lc80/d;", "Ljn0/h0;", "launch", "a", "(Lw70/j;Lwn0/l;)V", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "", "b", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/y$m;)Z", "Lkotlin/Function0;", "extraRequirements", "c", "(Lcom/stripe/android/model/StripeIntent;Lw70/j;Lcom/stripe/android/paymentsheet/y$m;Lwn0/a;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: r70.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C2279a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: r70.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        public static final class C2280a extends u implements wn0.a<Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C2280a f107125c = new C2280a();

            C2280a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean a(a aVar, StripeIntent stripeIntent, j jVar, y.m mVar, wn0.a aVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requiresCVCRecollection");
            }
            if ((i11 & 8) != 0) {
                aVar2 = C2280a.f107125c;
            }
            return aVar.c(stripeIntent, jVar, mVar, aVar2);
        }
    }

    void a(j paymentSelection, l<? super CvcRecollectionData, h0> launch);

    boolean b(StripeIntent stripeIntent, y.m initializationMode);

    boolean c(StripeIntent stripeIntent, j paymentSelection, y.m initializationMode, wn0.a<Boolean> extraRequirements);
}
