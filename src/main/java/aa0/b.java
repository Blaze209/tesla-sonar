package aa0;

import com.adyen.checkout.components.core.paymentmethod.EPSPaymentMethod;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"equalWithRespectToEps", "", "", "other", EPSPaymentMethod.PAYMENT_METHOD_TYPE, "react-native-screens_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final boolean equalWithRespectToEps(float f11, float f12, float f13) {
        return Math.abs(f11 - f12) <= f13;
    }

    public static /* synthetic */ boolean equalWithRespectToEps$default(float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f13 = 1.0E-4f;
        }
        return equalWithRespectToEps(f11, f12, f13);
    }
}
