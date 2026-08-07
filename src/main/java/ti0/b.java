package ti0;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "Lti0/a;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;)Lti0/a;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final a a(Mdoc.Provider provider) {
        Mdoc.ClientMetadata clientMetadata;
        String requestJsonString;
        a.b bVar;
        s.k(provider, "<this>");
        if (!s.f(provider.getProviderType(), "google_wallet") || (clientMetadata = provider.getClientMetadata()) == null || (requestJsonString = clientMetadata.getRequestJsonString()) == null) {
            return null;
        }
        try {
            new JSONObject(requestJsonString);
            String nonce = provider.getNonce();
            String idType = provider.getIdType();
            if (!s.f(idType, "dl")) {
                if (s.f(idType, "pp")) {
                    bVar = a.b.PP;
                }
                return null;
            }
            bVar = a.b.DL;
            return new a.GoogleWalletRequestMetadata(nonce, bVar, requestJsonString);
        } catch (Exception unused) {
        }
    }
}
