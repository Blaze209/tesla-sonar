package com.google.android.gms.identitycredentials;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020$2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010,\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b,\u0010(R\u0014\u0010-\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b-\u0010(R\u0014\u0010.\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b.\u0010(R\u0014\u0010/\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b/\u0010(R\u0014\u00100\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b0\u0010(R\u0014\u00101\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b1\u0010(R\u0014\u00102\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b2\u0010(R\u0014\u00103\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b3\u0010(R\u0014\u00104\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b4\u0010(R\u0014\u00105\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b5\u0010(R\u0014\u00106\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b6\u0010(R\u0014\u00107\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b7\u0010(R\u0014\u00108\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b8\u0010(R\u0014\u00109\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b9\u0010(¨\u0006:"}, d2 = {"Lcom/google/android/gms/identitycredentials/IntentHelper;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/google/android/gms/identitycredentials/CallingAppInfo;", "extractCallingAppInfo", "(Landroid/content/Intent;)Lcom/google/android/gms/identitycredentials/CallingAppInfo;", "", "errorMessage", "Lcom/google/android/gms/identitycredentials/GetCredentialException;", "newUnknownException", "(Ljava/lang/String;)Lcom/google/android/gms/identitycredentials/GetCredentialException;", "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "extractGetCredentialRequest", "(Landroid/content/Intent;)Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "", StatusResponse.RESULT_CODE, "Landroid/os/Bundle;", "resultData", "Lcom/google/android/gms/identitycredentials/GetCredentialResponse;", "extractGetCredentialResponse", "(ILandroid/os/Bundle;)Lcom/google/android/gms/identitycredentials/GetCredentialResponse;", "errorType", "Ljn0/h0;", "setGetCredentialException", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V", "response", "setGetCredentialResponse", "(Landroid/content/Intent;Lcom/google/android/gms/identitycredentials/GetCredentialResponse;)V", "Lcom/google/android/gms/identitycredentials/ImportCredentialsResponse;", "setImportCredentialsResponse", "(Landroid/content/Intent;Lcom/google/android/gms/identitycredentials/ImportCredentialsResponse;)V", "extractImportCredentialsResponse", "(ILandroid/os/Bundle;)Lcom/google/android/gms/identitycredentials/ImportCredentialsResponse;", "Lcom/google/android/gms/identitycredentials/ImportCredentialsException;", "newUnknownImportCredentialsException", "(Ljava/lang/String;)Lcom/google/android/gms/identitycredentials/ImportCredentialsException;", "ACTION_GET_CREDENTIAL", "Ljava/lang/String;", "EXTRA_CREDENTIAL_ID", "ACTION_IMPORT_CREDENTIAL", "EXTRA_GET_CREDENTIAL_REQUEST", "EXTRA_IMPORT_CREDENTIALS_REQUEST", "EXTRA_IMPORT_CREDENTIALS_REQUEST_JSON", "EXTRA_CALLING_PACKAGE_NAME", "EXTRA_SIGNATURE_COUNT", "EXTRA_SIGNATURE_PREFIX", "EXTRA_ORIGIN", "EXTRA_EXCEPTION_TYPE", "EXTRA_IMPORT_CREDENTIALS_RESPONSE", "EXTRA_EXCEPTION_MESSAGE", "EXTRA_CREDENTIAL_TYPE", "EXTRA_CREDENTIAL_DATA", "BUNDLE_KEY_PROVIDER_DATA", "BUNDLE_KEY_EXCEPTION_TYPE", "BUNDLE_KEY_EXCEPTION_MESSAGE", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntentHelper {
    public static final String ACTION_GET_CREDENTIAL = "androidx.identitycredentials.action.GET_CREDENTIALS";
    public static final String EXTRA_CREDENTIAL_ID = "androidx.identitycredentials.extra.CREDENTIAL_ID";
    public static final IntentHelper INSTANCE = new IntentHelper();

    private IntentHelper() {
    }

    public static final CallingAppInfo extractCallingAppInfo(@NonNull Intent intent) {
        s.k(intent, "intent");
        intent.setExtrasClassLoader(null);
        String stringExtra = intent.getStringExtra("androidx.identitycredentials.extra.CALLING_PACKAGE_NAME");
        if (stringExtra == null) {
            return null;
        }
        String stringExtra2 = intent.getStringExtra("androidx.identitycredentials.extra.ORIGIN");
        int intExtra = intent.getIntExtra("androidx.identitycredentials.extra.SIGNATURE_COUNT", 0);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < intExtra; i11++) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("androidx.identitycredentials.extra.SIGNATURE_" + i11);
            if (byteArrayExtra == null) {
                Log.w("IntentHelper", "cannot find expected signature at count " + i11);
                return null;
            }
            arrayList.add(byteArrayExtra);
        }
        return new CallingAppInfo(stringExtra, arrayList, stringExtra2);
    }

    public static final GetCredentialRequest extractGetCredentialRequest(@NonNull Intent intent) {
        s.k(intent, "intent");
        intent.setExtrasClassLoader(GetCredentialRequest.class.getClassLoader());
        return (GetCredentialRequest) intent.getParcelableExtra("androidx.identitycredentials.extra.GET_CREDENTIAL_REQUEST");
    }

    public static final GetCredentialResponse extractGetCredentialResponse(int resultCode, @NonNull Bundle resultData) throws GetCredentialException {
        s.k(resultData, "resultData");
        if (resultCode != -1) {
            if (resultCode == 0) {
                CharSequence charSequence = resultData.getCharSequence("androidx.identitycredentials.BUNDLE_KEY_EXCEPTION_TYPE");
                String string = charSequence != null ? charSequence.toString() : GetCredentialException.ERROR_TYPE_USER_CANCELED;
                CharSequence charSequence2 = resultData.getCharSequence("androidx.identitycredentials.BUNDLE_KEY_EXCEPTION_MESSAGE");
                throw new GetCredentialException(string, charSequence2 != null ? charSequence2.toString() : null);
            }
            throw INSTANCE.newUnknownException("Activity result has unexpected resultCode: " + resultCode);
        }
        Intent intent = Build.VERSION.SDK_INT >= 33 ? (Intent) resultData.getParcelable("androidx.identitycredentials.BUNDLE_KEY_PROVIDER_DATA", Intent.class) : (Intent) resultData.getParcelable("androidx.identitycredentials.BUNDLE_KEY_PROVIDER_DATA");
        if (intent == null) {
            throw INSTANCE.newUnknownException("Provider result is empty");
        }
        if (intent.hasExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_TYPE")) {
            String stringExtra = intent.getStringExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_TYPE");
            Bundle bundleExtra = intent.getBundleExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_DATA");
            if (stringExtra == null || bundleExtra == null) {
                throw INSTANCE.newUnknownException("Credential result is empty");
            }
            return new GetCredentialResponse(new Credential(stringExtra, bundleExtra));
        }
        if (!intent.hasExtra("androidx.identitycredentials.EXTRA_EXCEPTION_TYPE")) {
            throw INSTANCE.newUnknownException("Unknown provider error");
        }
        String stringExtra2 = intent.getStringExtra("androidx.identitycredentials.EXTRA_EXCEPTION_TYPE");
        if (stringExtra2 == null) {
            throw INSTANCE.newUnknownException("Unknown provider error");
        }
        throw new GetCredentialException(stringExtra2, intent.getStringExtra("androidx.identitycredentials.EXTRA_EXCEPTION_MESSAGE"));
    }

    private final GetCredentialException newUnknownException(String errorMessage) {
        return new GetCredentialException(GetCredentialException.ERROR_TYPE_UNKNOWN, errorMessage);
    }

    public static final void setGetCredentialException(@NonNull Intent intent, @NonNull String errorType, String errorMessage) {
        s.k(intent, "intent");
        s.k(errorType, "errorType");
        intent.putExtra("androidx.identitycredentials.EXTRA_EXCEPTION_TYPE", errorType);
        intent.putExtra("androidx.identitycredentials.EXTRA_EXCEPTION_MESSAGE", errorMessage);
    }

    public static final void setGetCredentialResponse(@NonNull Intent intent, @NonNull GetCredentialResponse response) {
        s.k(intent, "intent");
        s.k(response, "response");
        intent.putExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_TYPE", response.getCredential().getType());
        intent.putExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_DATA", response.getCredential().getData());
    }
}
