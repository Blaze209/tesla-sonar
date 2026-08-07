package d6;

import android.content.ComponentName;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000eBC\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Ld6/b0;", "", "", "Ld6/o;", "credentialOptions", "", "origin", "", "preferIdentityDocUi", "Landroid/content/ComponentName;", "preferUiBrandingComponentName", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLandroid/content/ComponentName;Z)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", "e", "f", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<o> credentialOptions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String origin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean preferIdentityDocUi;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ComponentName preferUiBrandingComponentName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean preferImmediatelyAvailableCredentials;

    /* JADX INFO: renamed from: d6.b0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Ld6/b0$a;", "", "<init>", "()V", "Ld6/b0;", "request", "Landroid/os/Bundle;", "a", "(Ld6/b0;)Landroid/os/Bundle;", "", "BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", "Ljava/lang/String;", "BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", "BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle a(b0 request) {
            p013kotlin.jvm.internal.s.k(request, "request");
            Bundle bundle = new Bundle();
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", request.getPreferIdentityDocUi());
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.getPreferImmediatelyAvailableCredentials());
            bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", request.getPreferUiBrandingComponentName());
            return bundle;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(List<? extends o> credentialOptions, String str, boolean z11, ComponentName componentName, boolean z12) {
        p013kotlin.jvm.internal.s.k(credentialOptions, "credentialOptions");
        this.credentialOptions = credentialOptions;
        this.origin = str;
        this.preferIdentityDocUi = z11;
        this.preferUiBrandingComponentName = componentName;
        this.preferImmediatelyAvailableCredentials = z12;
        if (credentialOptions.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
        if (credentialOptions.size() > 1) {
            List<? extends o> list = credentialOptions;
            int i11 = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ((((o) it.next()) instanceof e0) && (i11 = i11 + 1) < 0) {
                        p013kotlin.collections.v.w();
                    }
                }
            }
            if (i11 > 0 && i11 != this.credentialOptions.size()) {
                throw new IllegalArgumentException("Digital Credential Option cannot be used with other credential option.");
            }
            Iterator<o> it2 = this.credentialOptions.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof g0) {
                    throw new IllegalArgumentException("Only a single GetRestoreCredentialOption should be provided.");
                }
            }
        }
    }

    public final List<o> a() {
        return this.credentialOptions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPreferIdentityDocUi() {
        return this.preferIdentityDocUi;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ComponentName getPreferUiBrandingComponentName() {
        return this.preferUiBrandingComponentName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    public /* synthetic */ b0(List list, String str, boolean z11, ComponentName componentName, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : componentName, (i11 & 16) != 0 ? false : z12);
    }
}
