package i6;

import android.content.Context;
import android.content.pm.PackageManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import d6.b0;
import d6.f0;
import d6.o;
import k6.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Li6/a;", "", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i6.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Li6/a$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "c", "(Landroid/content/Context;)J", "curAuthVersion", "", DateTokenConverter.CONVERTER_KEY, "(J)Z", "Lys/a;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "b", "(Lys/a;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "Ld6/b0;", "request", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "a", "(Ld6/b0;Landroid/content/Context;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "AUTH_MIN_VERSION_JSON_PARSING", "J", "AUTH_MIN_VERSION_PREFER_IMME_CRED", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions b(ys.a option) {
            BeginSignInRequest.GoogleIdTokenRequestOptions.Builder supported = BeginSignInRequest.GoogleIdTokenRequestOptions.builder().setFilterByAuthorizedAccounts(option.g()).setNonce(option.j()).setRequestVerifiedPhoneNumber(option.k()).setServerClientId(option.l()).setSupported(true);
            s.j(supported, "setSupported(...)");
            if (option.i() != null) {
                String strI = option.i();
                s.h(strI);
                supported.associateLinkedAccounts(strI, option.h());
            }
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptionsBuild = supported.build();
            s.j(googleIdTokenRequestOptionsBuild, "build(...)");
            return googleIdTokenRequestOptionsBuild;
        }

        private final long c(Context context) {
            PackageManager packageManager = context.getPackageManager();
            s.j(packageManager, "getPackageManager(...)");
            return packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean d(long curAuthVersion) {
            return curAuthVersion < 231815000;
        }

        public final BeginSignInRequest a(b0 request, Context context) {
            s.k(request, "request");
            s.k(context, "context");
            BeginSignInRequest.Builder builder = new BeginSignInRequest.Builder();
            long jC = c(context);
            boolean z11 = false;
            boolean z12 = false;
            for (o oVar : request.a()) {
                if ((oVar instanceof f0) && !z12) {
                    if (d(jC)) {
                        builder.setPasskeysSignInRequestOptions(k.INSTANCE.g((f0) oVar));
                    } else {
                        builder.setPasskeyJsonSignInRequestOptions(k.INSTANCE.f((f0) oVar));
                    }
                    z12 = true;
                } else if (oVar instanceof ys.a) {
                    ys.a aVar = (ys.a) oVar;
                    builder.setGoogleIdTokenRequestOptions(b(aVar));
                    z11 = z11 || aVar.f();
                }
            }
            if (jC > 241217000) {
                builder.setPreferImmediatelyAvailableCredentials(request.getPreferImmediatelyAvailableCredentials());
            }
            BeginSignInRequest beginSignInRequestBuild = builder.setAutoSelectEnabled(z11).build();
            s.j(beginSignInRequestBuild, "build(...)");
            return beginSignInRequestBuild;
        }

        private Companion() {
        }
    }
}
