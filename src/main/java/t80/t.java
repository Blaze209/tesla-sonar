package t80;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001JO\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lt80/t;", "", "", "directoryServerId", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "Ljava/security/PublicKey;", "directoryServerPublicKey", "keyId", "Lt80/q;", "sdkTransactionId", "", "isLiveMode", "Lcom/stripe/android/stripe3ds2/views/b;", "brand", "Lt80/s;", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/security/PublicKey;Ljava/lang/String;Lt80/q;ZLcom/stripe/android/stripe3ds2/views/b;)Lt80/s;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface t {
    s a(String directoryServerId, List<? extends X509Certificate> rootCerts, PublicKey directoryServerPublicKey, String keyId, q sdkTransactionId, boolean isLiveMode, com.stripe.android.stripe3ds2.views.b brand);
}
