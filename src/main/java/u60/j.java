package u60;

import com.stripe.android.paymentsheet.y;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/model/h;", "Lcom/stripe/android/paymentsheet/y$e$c;", "a", "(Lcom/stripe/android/model/h;)Lcom/stripe/android/paymentsheet/y$e$c;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115782a;

        static {
            int[] iArr = new int[com.stripe.android.model.h.values().length];
            try {
                iArr[com.stripe.android.model.h.Visa.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.stripe.android.model.h.MasterCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.stripe.android.model.h.AmericanExpress.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.stripe.android.model.h.Discover.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.stripe.android.model.h.DinersClub.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.stripe.android.model.h.JCB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.stripe.android.model.h.UnionPay.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f115782a = iArr;
        }
    }

    public static final y.e.c a(com.stripe.android.model.h hVar) {
        s.k(hVar, "<this>");
        switch (a.f115782a[hVar.ordinal()]) {
            case 1:
                return y.e.c.Visa;
            case 2:
                return y.e.c.Mastercard;
            case 3:
                return y.e.c.Amex;
            case 4:
            case 5:
            case 6:
            case 7:
                return y.e.c.Discover;
            default:
                return null;
        }
    }
}
