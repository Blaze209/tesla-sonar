package com.google.android.gms.identitycredentials;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/android/gms/identitycredentials/IdentityCredentialManager;", "", "<init>", "()V", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IdentityCredentialManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/google/android/gms/identitycredentials/IdentityCredentialManager$Companion;", "", "<init>", "()V", "getClient", "Lcom/google/android/gms/identitycredentials/IdentityCredentialClient;", "activity", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final IdentityCredentialClient getClient(@NonNull Activity activity) {
            s.k(activity, "activity");
            return new InternalIdentityCredentialClient(activity);
        }

        public /* synthetic */ Companion(@NonNull DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IdentityCredentialClient getClient(@NonNull Context context) {
            s.k(context, "context");
            return new InternalIdentityCredentialClient(context);
        }
    }

    private IdentityCredentialManager() {
    }

    public static final IdentityCredentialClient getClient(@NonNull Activity activity) {
        return INSTANCE.getClient(activity);
    }

    public static final IdentityCredentialClient getClient(@NonNull Context context) {
        return INSTANCE.getClient(context);
    }
}
