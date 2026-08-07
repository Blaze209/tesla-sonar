package f6;

import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "errorType", "", "errorMsg", "Landroidx/credentials/exceptions/GetCredentialException;", "a", "(Ljava/lang/String;Ljava/lang/CharSequence;)Landroidx/credentials/exceptions/GetCredentialException;", "credentials_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final GetCredentialException a(String errorType, CharSequence charSequence) {
        s.k(errorType, "errorType");
        switch (errorType.hashCode()) {
            case -781118336:
                if (errorType.equals(com.google.android.gms.identitycredentials.GetCredentialException.ERROR_TYPE_UNKNOWN)) {
                    return new GetCredentialUnknownException(charSequence);
                }
                break;
            case -408155724:
                if (errorType.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new GetCredentialUnsupportedException(charSequence);
                }
                break;
            case -45448328:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new GetCredentialInterruptedException(charSequence);
                }
                break;
            case 580557411:
                if (errorType.equals(com.google.android.gms.identitycredentials.GetCredentialException.ERROR_TYPE_USER_CANCELED)) {
                    return new GetCredentialCancellationException(charSequence);
                }
                break;
            case 627896683:
                if (errorType.equals(com.google.android.gms.identitycredentials.GetCredentialException.ERROR_TYPE_NO_CREDENTIAL)) {
                    return new NoCredentialException(charSequence);
                }
                break;
            case 1594095913:
                if (errorType.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new GetCredentialProviderConfigurationException(charSequence);
                }
                break;
        }
        if (t.b0(errorType, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
            return GetPublicKeyCredentialException.INSTANCE.a(errorType, charSequence != null ? charSequence.toString() : null);
        }
        return new GetCredentialCustomException(errorType, charSequence);
    }
}
