package t80;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJO\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lt80/i;", "Lt80/t;", "Lt80/d;", "areqParamsFactory", "Lcom/stripe/android/stripe3ds2/security/g;", "ephemeralKeyPairGenerator", "", "sdkReferenceNumber", "<init>", "(Lt80/d;Lcom/stripe/android/stripe3ds2/security/g;Ljava/lang/String;)V", "directoryServerId", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "Ljava/security/PublicKey;", "directoryServerPublicKey", "keyId", "Lt80/q;", "sdkTransactionId", "", "isLiveMode", "Lcom/stripe/android/stripe3ds2/views/b;", "brand", "Lt80/s;", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/security/PublicKey;Ljava/lang/String;Lt80/q;ZLcom/stripe/android/stripe3ds2/views/b;)Lt80/s;", "Lt80/d;", "b", "Lcom/stripe/android/stripe3ds2/security/g;", "c", "Ljava/lang/String;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d areqParamsFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.security.g ephemeralKeyPairGenerator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String sdkReferenceNumber;

    public i(d areqParamsFactory, com.stripe.android.stripe3ds2.security.g ephemeralKeyPairGenerator, String sdkReferenceNumber) {
        p013kotlin.jvm.internal.s.k(areqParamsFactory, "areqParamsFactory");
        p013kotlin.jvm.internal.s.k(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        p013kotlin.jvm.internal.s.k(sdkReferenceNumber, "sdkReferenceNumber");
        this.areqParamsFactory = areqParamsFactory;
        this.ephemeralKeyPairGenerator = ephemeralKeyPairGenerator;
        this.sdkReferenceNumber = sdkReferenceNumber;
    }

    @Override // t80.t
    public s a(String directoryServerId, List<? extends X509Certificate> rootCerts, PublicKey directoryServerPublicKey, String keyId, q sdkTransactionId, boolean isLiveMode, com.stripe.android.stripe3ds2.views.b brand) {
        p013kotlin.jvm.internal.s.k(directoryServerId, "directoryServerId");
        p013kotlin.jvm.internal.s.k(rootCerts, "rootCerts");
        p013kotlin.jvm.internal.s.k(directoryServerPublicKey, "directoryServerPublicKey");
        p013kotlin.jvm.internal.s.k(sdkTransactionId, "sdkTransactionId");
        p013kotlin.jvm.internal.s.k(brand, "brand");
        return new r(this.areqParamsFactory, directoryServerId, directoryServerPublicKey, keyId, sdkTransactionId, this.ephemeralKeyPairGenerator.generate(), this.sdkReferenceNumber);
    }
}
