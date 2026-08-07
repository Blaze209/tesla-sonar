package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
public interface SignInClient extends HasApiKey<zbv> {
    @NonNull
    @Deprecated
    Task<BeginSignInResult> beginSignIn(@NonNull BeginSignInRequest beginSignInRequest);

    @NonNull
    String getPhoneNumberFromIntent(Intent intent);

    @NonNull
    Task<PendingIntent> getPhoneNumberHintIntent(@NonNull GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest);

    @NonNull
    @Deprecated
    SignInCredential getSignInCredentialFromIntent(Intent intent);

    @NonNull
    @Deprecated
    Task<PendingIntent> getSignInIntent(@NonNull GetSignInIntentRequest getSignInIntentRequest);

    @NonNull
    @Deprecated
    Task<Void> signOut();
}
