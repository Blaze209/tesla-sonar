package atd.ax;

import android.net.Uri;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/ui/listener/OutOfBandChallengeListener;", "Lcom/adyen/threeds2/internal/ui/listener/ChallengeListener;", "Landroid/net/Uri;", "appUri", "", "whitelistStatus", "Ljn0/h0;", "openOobApp", "(Landroid/net/Uri;Ljava/lang/String;)V", "submitOobChallenge", "(Ljava/lang/String;)V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AuthenticationRequestParameters extends getSDKReferenceNumber {
    void AuthenticationRequestParameters(String str);

    void dh_(Uri uri, String str);
}
