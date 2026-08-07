package d6;

import android.credentials.Credential;
import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ld6/j;", "", "", "type", "Landroid/os/Bundle;", "data", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "getData", "()Landroid/os/Bundle;", "c", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bundle data;

    /* JADX INFO: renamed from: d6.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ld6/j$a;", "", "<init>", "()V", "", "type", "Landroid/os/Bundle;", "data", "Ld6/j;", "b", "(Ljava/lang/String;Landroid/os/Bundle;)Ld6/j;", "Landroid/credentials/Credential;", "credential", "a", "(Landroid/credentials/Credential;)Ld6/j;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(Credential credential) {
            p013kotlin.jvm.internal.s.k(credential, "credential");
            String type = credential.getType();
            p013kotlin.jvm.internal.s.j(type, "credential.type");
            Bundle data = credential.getData();
            p013kotlin.jvm.internal.s.j(data, "credential.data");
            return b(type, data);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final j b(String type, Bundle data) {
            p013kotlin.jvm.internal.s.k(type, "type");
            p013kotlin.jvm.internal.s.k(data, "data");
            try {
                switch (type.hashCode()) {
                    case -1678407252:
                        if (type.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                            return a0.INSTANCE.a(data);
                        }
                        break;
                    case -1072734346:
                        if (type.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                            return k0.INSTANCE.a(data);
                        }
                        break;
                    case -543568185:
                        if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                            return h0.INSTANCE.a(data);
                        }
                        break;
                    case -95037569:
                        if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                            return j0.INSTANCE.a(data);
                        }
                        break;
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new z(type, data);
            }
        }

        private Companion() {
        }
    }

    public j(String type, Bundle data) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(data, "data");
        this.type = type;
        this.data = data;
    }
}
