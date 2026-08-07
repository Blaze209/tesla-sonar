package s80;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import p013kotlin.Metadata;
import q80.m;
import t80.q;
import t80.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Ja\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Ls80/a;", "", "Lt80/q;", "sdkTransactionId", "", "directoryServerID", "messageVersion", "", "isLiveMode", "directoryServerName", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "Ljava/security/PublicKey;", "dsPublicKey", "keyId", "Lq80/m;", "uiCustomization", "Lt80/s;", "a", "(Lt80/q;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/security/PublicKey;Ljava/lang/String;Lq80/m;)Lt80/s;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {
    s a(q sdkTransactionId, String directoryServerID, String messageVersion, boolean isLiveMode, String directoryServerName, List<? extends X509Certificate> rootCerts, PublicKey dsPublicKey, String keyId, m uiCustomization);
}
