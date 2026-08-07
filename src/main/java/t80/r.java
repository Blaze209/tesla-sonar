package t80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import java.security.KeyPair;
import java.security.PublicKey;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001\u0011BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lt80/r;", "Lt80/s;", "Lt80/d;", "areqParamsFactory", "", "directoryServerId", "Ljava/security/PublicKey;", "directoryServerPublicKey", "directoryServerKeyId", "Lt80/q;", "sdkTransactionId", "Ljava/security/KeyPair;", "sdkKeyPair", "sdkReferenceNumber", "<init>", "(Lt80/d;Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lt80/q;Ljava/security/KeyPair;Ljava/lang/String;)V", "Lt80/c;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt80/e;", "challengeParameters", "", "timeoutMins", "Lcom/stripe/android/stripe3ds2/transaction/n;", "intentData", "Lt80/m;", "b", "(Lt80/e;ILcom/stripe/android/stripe3ds2/transaction/n;)Lt80/m;", "Lt80/d;", "Ljava/lang/String;", "c", "Ljava/security/PublicKey;", DateTokenConverter.CONVERTER_KEY, "e", "Lt80/q;", "()Lt80/q;", "f", "Ljava/security/KeyPair;", "g", "h", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d areqParamsFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String directoryServerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PublicKey directoryServerPublicKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String directoryServerKeyId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q sdkTransactionId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final KeyPair sdkKeyPair;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String sdkReferenceNumber;

    public r(d areqParamsFactory, String directoryServerId, PublicKey directoryServerPublicKey, String str, q sdkTransactionId, KeyPair sdkKeyPair, String sdkReferenceNumber) {
        p013kotlin.jvm.internal.s.k(areqParamsFactory, "areqParamsFactory");
        p013kotlin.jvm.internal.s.k(directoryServerId, "directoryServerId");
        p013kotlin.jvm.internal.s.k(directoryServerPublicKey, "directoryServerPublicKey");
        p013kotlin.jvm.internal.s.k(sdkTransactionId, "sdkTransactionId");
        p013kotlin.jvm.internal.s.k(sdkKeyPair, "sdkKeyPair");
        p013kotlin.jvm.internal.s.k(sdkReferenceNumber, "sdkReferenceNumber");
        this.areqParamsFactory = areqParamsFactory;
        this.directoryServerId = directoryServerId;
        this.directoryServerPublicKey = directoryServerPublicKey;
        this.directoryServerKeyId = str;
        this.sdkTransactionId = sdkTransactionId;
        this.sdkKeyPair = sdkKeyPair;
        this.sdkReferenceNumber = sdkReferenceNumber;
    }

    @Override // t80.s
    public Object a(Continuation<? super AuthenticationRequestParameters> continuation) {
        d dVar = this.areqParamsFactory;
        String str = this.directoryServerId;
        PublicKey publicKey = this.directoryServerPublicKey;
        String str2 = this.directoryServerKeyId;
        q sdkTransactionId = getSdkTransactionId();
        PublicKey publicKey2 = this.sdkKeyPair.getPublic();
        p013kotlin.jvm.internal.s.j(publicKey2, "getPublic(...)");
        return dVar.a(str, publicKey, str2, sdkTransactionId, publicKey2, continuation);
    }

    @Override // t80.s
    public InitChallengeArgs b(ChallengeParameters challengeParameters, int timeoutMins, IntentData intentData) {
        p013kotlin.jvm.internal.s.k(challengeParameters, "challengeParameters");
        p013kotlin.jvm.internal.s.k(intentData, "intentData");
        return new InitChallengeArgs(this.sdkReferenceNumber, this.sdkKeyPair, challengeParameters, bo0.n.f(timeoutMins, 5), intentData);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public q getSdkTransactionId() {
        return this.sdkTransactionId;
    }
}
