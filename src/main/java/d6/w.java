package d6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.concurrent.Executor;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*¨\u0006,"}, d2 = {"Ld6/w;", "Ld6/p;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lkotlin/Function0;", "Ljn0/h0;", "handleNullCredMan", "", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;)Z", "Ld6/b0;", "request", "Landroid/credentials/GetCredentialRequest;", "a", "(Ld6/b0;)Landroid/credentials/GetCredentialRequest;", "Landroid/credentials/GetCredentialRequest$Builder;", "builder", "e", "(Ld6/b0;Landroid/credentials/GetCredentialRequest$Builder;)V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Ld6/m;", "Ld6/c0;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "onGetCredential", "(Landroid/content/Context;Ld6/b0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ld6/m;)V", "Landroid/credentials/GetCredentialException;", AnalyticsAttribute.Error, "c", "(Landroid/credentials/GetCredentialException;)Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/credentials/GetCredentialResponse;", "response", "b", "(Landroid/credentials/GetCredentialResponse;)Ld6/c0;", "isAvailableOnDevice", "()Z", "Landroid/credentials/CredentialManager;", "Landroid/credentials/CredentialManager;", "credentialManager", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f59671b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CredentialManager credentialManager;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ld6/w$a;", "", "<init>", "()V", "", "CREATE_DOM_EXCEPTION_PREFIX", "Ljava/lang/String;", "GET_DOM_EXCEPTION_PREFIX", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<c0, GetCredentialException> f59673c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m<c0, GetCredentialException> mVar) {
            super(0);
            this.f59673c = mVar;
        }

        public final void b() {
            this.f59673c.a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"d6/w$c", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/GetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "response", "Ljn0/h0;", "b", "(Landroid/credentials/GetCredentialResponse;)V", AnalyticsAttribute.Error, "a", "(Landroid/credentials/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements OutcomeReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m<c0, GetCredentialException> f59674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f59675b;

        c(m<c0, GetCredentialException> mVar, w wVar) {
            this.f59674a = mVar;
            this.f59675b = wVar;
        }

        public void a(android.credentials.GetCredentialException error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
            this.f59674a.a(this.f59675b.c(error));
        }

        public void b(GetCredentialResponse response) {
            p013kotlin.jvm.internal.s.k(response, "response");
            Log.i("CredManProvService", "GetCredentialResponse returned from framework");
            this.f59674a.onResult(this.f59675b.b(response));
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th2) {
            a(x.a(th2));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            b(y.a(obj));
        }
    }

    public w(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.credentialManager = v.a(context.getSystemService("credential"));
    }

    private final GetCredentialRequest a(b0 request) {
        t.a();
        GetCredentialRequest.Builder builderA = r.a(b0.INSTANCE.a(request));
        for (o oVar : request.a()) {
            u.a();
            builderA.addCredentialOption(s.a(oVar.getType(), oVar.getRequestData(), oVar.getCandidateQueryData()).setIsSystemProviderRequired(oVar.getIsSystemProviderRequired()).setAllowedProviders(oVar.a()).build());
        }
        e(request, builderA);
        GetCredentialRequest getCredentialRequestBuild = builderA.build();
        p013kotlin.jvm.internal.s.j(getCredentialRequestBuild, "builder.build()");
        return getCredentialRequestBuild;
    }

    private final boolean d(wn0.a<jn0.h0> handleNullCredMan) {
        if (this.credentialManager != null) {
            return false;
        }
        handleNullCredMan.invoke();
        return true;
    }

    @SuppressLint({"MissingPermission"})
    private final void e(b0 request, GetCredentialRequest.Builder builder) {
        if (request.getOrigin() != null) {
            builder.setOrigin(request.getOrigin());
        }
    }

    public final c0 b(GetCredentialResponse response) {
        p013kotlin.jvm.internal.s.k(response, "response");
        Credential credential = response.getCredential();
        p013kotlin.jvm.internal.s.j(credential, "response.credential");
        j.Companion companion = j.INSTANCE;
        String type = credential.getType();
        p013kotlin.jvm.internal.s.j(type, "credential.type");
        Bundle data = credential.getData();
        p013kotlin.jvm.internal.s.j(data, "credential.data");
        return new c0(companion.b(type, data));
    }

    public final GetCredentialException c(android.credentials.GetCredentialException error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        String type = error.getType();
        p013kotlin.jvm.internal.s.j(type, "error.type");
        return f6.a.a(type, error.getMessage());
    }

    @Override // d6.p
    public boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.credentialManager != null;
    }

    @Override // d6.p
    public void onGetCredential(Context context, b0 request, CancellationSignal cancellationSignal, Executor executor, m<c0, GetCredentialException> callback) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(request, "request");
        p013kotlin.jvm.internal.s.k(executor, "executor");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        if (d(new b(callback))) {
            return;
        }
        c cVar = new c(callback, this);
        CredentialManager credentialManager = this.credentialManager;
        p013kotlin.jvm.internal.s.h(credentialManager);
        credentialManager.getCredential(context, a(request), cancellationSignal, executor, cVar);
    }
}
