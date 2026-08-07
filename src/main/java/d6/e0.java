package d6;

import android.content.ComponentName;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017BG\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Ld6/e0;", "Ld6/o;", "", "requestJson", "Landroid/os/Bundle;", "requestData", "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "", "Landroid/content/ComponentName;", "allowedProviders", "", "typePriorityHint", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "(Ljava/lang/String;)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "f", "()Ljava/lang/String;", "j", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e0 extends o {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String requestJson;

    /* JADX INFO: renamed from: d6.e0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ld6/e0$a;", "", "<init>", "()V", "", "requestJson", "Landroid/os/Bundle;", "a", "(Ljava/lang/String;)Landroid/os/Bundle;", "BUNDLE_KEY_REQUEST_JSON", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle a(String requestJson) {
            p013kotlin.jvm.internal.s.k(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            return bundle;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String requestJson, Bundle requestData, Bundle candidateQueryData, boolean z11, boolean z12, Set<ComponentName> allowedProviders, int i11) {
        super("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", requestData, candidateQueryData, z11, z12, allowedProviders, i11);
        p013kotlin.jvm.internal.s.k(requestJson, "requestJson");
        p013kotlin.jvm.internal.s.k(requestData, "requestData");
        p013kotlin.jvm.internal.s.k(candidateQueryData, "candidateQueryData");
        p013kotlin.jvm.internal.s.k(allowedProviders, "allowedProviders");
        this.requestJson = requestJson;
        if (!f6.b.INSTANCE.a(requestJson)) {
            throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
        }
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRequestJson() {
        return this.requestJson;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e0(String requestJson) {
        p013kotlin.jvm.internal.s.k(requestJson, "requestJson");
        Companion companion = INSTANCE;
        this(requestJson, companion.a(requestJson), companion.a(requestJson), false, false, d1.d(), 100);
    }
}
