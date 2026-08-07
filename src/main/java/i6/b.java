package i6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import d6.b0;
import d6.c0;
import d6.j;
import d6.j0;
import d6.m;
import java.util.concurrent.Executor;
import jn0.h0;
import k6.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\b\u0006*\u00018\b\u0000\u0018\u0000  2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001<B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R4\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00108\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b&\u0010'\u0012\u0004\b,\u0010-\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u0010-\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b5\u00106\u0012\u0004\b7\u0010-R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Li6/b;", "Lh6/b;", "Ld6/b0;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "Ld6/c0;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "response", "Lys/c;", "n", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Lys/c;", "request", "Ld6/m;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljn0/h0;", "r", "(Ld6/b0;Ld6/m;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "q", "(IILandroid/content/Intent;)V", "l", "(Ld6/b0;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "m", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Ld6/c0;", "g", "Landroid/content/Context;", "h", "Ld6/m;", "o", "()Ld6/m;", "s", "(Ld6/m;)V", "getCallback$annotations", "()V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Executor;", "p", "()Ljava/util/concurrent/Executor;", "t", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "j", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "i6/b$i", "k", "Li6/b$i;", "resultReceiver", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b extends h6.b<b0, BeginSignInRequest, SignInCredential, c0, GetCredentialException> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public m<c0, GetCredentialException> callback;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public Executor executor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private CancellationSignal cancellationSignal;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i resultReceiver;

    /* JADX INFO: renamed from: i6.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/CancellationSignal;", "s", "Lkotlin/Function0;", "Ljn0/h0;", "f", "a", "(Landroid/os/CancellationSignal;Lwn0/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class C1589b extends u implements p<CancellationSignal, wn0.a<? extends h0>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1589b f76012c = new C1589b();

        C1589b() {
            super(2);
        }

        public final void a(CancellationSignal cancellationSignal, wn0.a<h0> f11) {
            s.k(f11, "f");
            h6.b.Companion aVar = h6.b.INSTANCE;
            h6.b.e(cancellationSignal, f11);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(CancellationSignal cancellationSignal, wn0.a<? extends h0> aVar) {
            a(cancellationSignal, aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialException;", "e", "Ljn0/h0;", "b", "(Landroidx/credentials/exceptions/GetCredentialException;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements l<GetCredentialException, h0> {
        c() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar, GetCredentialException getCredentialException) {
            bVar.o().a(getCredentialException);
        }

        public final void b(final GetCredentialException e11) {
            s.k(e11, "e");
            Executor executorP = b.this.p();
            final b bVar = b.this;
            executorP.execute(new Runnable() { // from class: i6.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.c(bVar, e11);
                }
            });
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(GetCredentialException getCredentialException) {
            b(getCredentialException);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0 f76015d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c0 c0Var) {
            super(0);
            this.f76015d = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar, c0 c0Var) {
            bVar.o().onResult(c0Var);
        }

        public final void b() {
            Executor executorP = b.this.p();
            final b bVar = b.this;
            final c0 c0Var = this.f76015d;
            executorP.execute(new Runnable() { // from class: i6.d
                @Override // java.lang.Runnable
                public final void run() {
                    b.d.c(bVar, c0Var);
                }
            });
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0<GetCredentialException> f76017d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n0<GetCredentialException> n0Var) {
            super(0);
            this.f76017d = n0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void c(b bVar, n0 n0Var) {
            bVar.o().a(n0Var.f86529a);
        }

        public final void b() {
            Executor executorP = b.this.p();
            final b bVar = b.this;
            final n0<GetCredentialException> n0Var = this.f76017d;
            executorP.execute(new Runnable() { // from class: i6.e
                @Override // java.lang.Runnable
                public final void run() {
                    b.e.c(bVar, n0Var);
                }
            });
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GetCredentialException f76019d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(GetCredentialException getCredentialException) {
            super(0);
            this.f76019d = getCredentialException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar, GetCredentialException getCredentialException) {
            bVar.o().a(getCredentialException);
        }

        public final void b() {
            Executor executorP = b.this.p();
            final b bVar = b.this;
            final GetCredentialException getCredentialException = this.f76019d;
            executorP.execute(new Runnable() { // from class: i6.f
                @Override // java.lang.Runnable
                public final void run() {
                    b.f.c(bVar, getCredentialException);
                }
            });
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GetCredentialUnknownException f76021d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(GetCredentialUnknownException getCredentialUnknownException) {
            super(0);
            this.f76021d = getCredentialUnknownException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar, GetCredentialUnknownException getCredentialUnknownException) {
            bVar.o().a(getCredentialUnknownException);
        }

        public final void b() {
            Executor executorP = b.this.p();
            final b bVar = b.this;
            final GetCredentialUnknownException getCredentialUnknownException = this.f76021d;
            executorP.execute(new Runnable() { // from class: i6.g
                @Override // java.lang.Runnable
                public final void run() {
                    b.g.c(bVar, getCredentialUnknownException);
                }
            });
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements wn0.a<h0> {
        h() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar) {
            bVar.o().a(new GetCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
        }

        public final void b() {
            Executor executorP = b.this.p();
            final b bVar = b.this;
            executorP.execute(new Runnable() { // from class: i6.h
                @Override // java.lang.Runnable
                public final void run() {
                    b.h.c(bVar);
                }
            });
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"i6/b$i", "Landroid/os/ResultReceiver;", "", StatusResponse.RESULT_CODE, "Landroid/os/Bundle;", "resultData", "Ljn0/h0;", "onReceiveResult", "(ILandroid/os/Bundle;)V", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i extends ResultReceiver {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements p<String, String, GetCredentialException> {
            a(Object obj) {
                super(2, obj, h6.a.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final GetCredentialException invoke(String str, String str2) {
                return ((h6.a.Companion) this.receiver).c(str, str2);
            }
        }

        i(Handler handler) {
            super(handler);
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int resultCode, Bundle resultData) {
            s.k(resultData, "resultData");
            if (b.this.f(resultData, new a(h6.a.INSTANCE), b.this.p(), b.this.o(), b.this.cancellationSignal)) {
                return;
            }
            b.this.q(resultData.getInt("ACTIVITY_REQUEST_CODE"), resultCode, (Intent) resultData.getParcelable("RESULT_DATA"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        s.k(context, "context");
        this.context = context;
        this.resultReceiver = new i(new Handler(Looper.getMainLooper()));
    }

    private final ys.c n(SignInCredential response) {
        ys.c.a aVar = new ys.c.a();
        String id2 = response.getId();
        s.j(id2, "getId(...)");
        ys.c.a aVarE = aVar.e(id2);
        String googleIdToken = response.getGoogleIdToken();
        s.h(googleIdToken);
        ys.c.a aVarF = aVarE.f(googleIdToken);
        if (response.getDisplayName() != null) {
            aVarF.b(response.getDisplayName());
        }
        if (response.getGivenName() != null) {
            aVarF.d(response.getGivenName());
        }
        if (response.getFamilyName() != null) {
            aVarF.c(response.getFamilyName());
        }
        if (response.getPhoneNumber() != null) {
            aVarF.g(response.getPhoneNumber());
        }
        if (response.getProfilePictureUri() != null) {
            aVarF.h(response.getProfilePictureUri());
        }
        return aVarF.a();
    }

    public BeginSignInRequest l(b0 request) {
        s.k(request, "request");
        return a.INSTANCE.a(request, this.context);
    }

    public c0 m(SignInCredential response) throws GetCredentialUnknownException {
        j j0Var;
        s.k(response, "response");
        if (response.getPassword() != null) {
            String id2 = response.getId();
            s.j(id2, "getId(...)");
            String password = response.getPassword();
            s.h(password);
            j0Var = new d6.h0(id2, password);
        } else if (response.getGoogleIdToken() != null) {
            j0Var = n(response);
        } else if (response.getPublicKeyCredential() != null) {
            j0Var = new j0(k.INSTANCE.N(response));
        } else {
            Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
            j0Var = null;
        }
        if (j0Var != null) {
            return new c0(j0Var);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    public final m<c0, GetCredentialException> o() {
        m<c0, GetCredentialException> mVar = this.callback;
        if (mVar != null) {
            return mVar;
        }
        s.B("callback");
        return null;
    }

    public final Executor p() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        s.B("executor");
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, androidx.credentials.exceptions.GetCredentialInterruptedException] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, androidx.credentials.exceptions.GetCredentialCancellationException] */
    public final void q(int uniqueRequestCode, int resultCode, Intent data) {
        h6.a.Companion companion = h6.a.INSTANCE;
        if (uniqueRequestCode != companion.b()) {
            Log.w("BeginSignIn", "Returned request code " + companion.b() + " which  does not match what was given " + uniqueRequestCode);
            return;
        }
        if (h6.b.h(resultCode, C1589b.f76012c, new c(), this.cancellationSignal)) {
            return;
        }
        try {
            SignInCredential signInCredentialFromIntent = Identity.getSignInClient(this.context).getSignInCredentialFromIntent(data);
            s.j(signInCredentialFromIntent, "getSignInCredentialFromIntent(...)");
            h6.b.e(this.cancellationSignal, new d(m(signInCredentialFromIntent)));
        } catch (GetCredentialException e11) {
            h6.b.e(this.cancellationSignal, new f(e11));
        } catch (ApiException e12) {
            n0 n0Var = new n0();
            n0Var.f86529a = new GetCredentialUnknownException(e12.getMessage());
            if (e12.getStatusCode() == 16) {
                n0Var.f86529a = new GetCredentialCancellationException(e12.getMessage());
            } else if (h6.a.INSTANCE.d().contains(Integer.valueOf(e12.getStatusCode()))) {
                n0Var.f86529a = new GetCredentialInterruptedException(e12.getMessage());
            }
            h6.b.e(this.cancellationSignal, new e(n0Var));
        } catch (Throwable th2) {
            h6.b.e(this.cancellationSignal, new g(new GetCredentialUnknownException(th2.getMessage())));
        }
    }

    public void r(b0 request, m<c0, GetCredentialException> callback, Executor executor, CancellationSignal cancellationSignal) {
        s.k(request, "request");
        s.k(callback, "callback");
        s.k(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        s(callback);
        t(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.a(cancellationSignal)) {
            return;
        }
        BeginSignInRequest beginSignInRequestL = l(request);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", beginSignInRequestL);
        c(this.resultReceiver, intent, "BEGIN_SIGN_IN");
        try {
            this.context.startActivity(intent);
        } catch (Exception unused) {
            h6.b.e(cancellationSignal, new h());
        }
    }

    public final void s(m<c0, GetCredentialException> mVar) {
        s.k(mVar, "<set-?>");
        this.callback = mVar;
    }

    public final void t(Executor executor) {
        s.k(executor, "<set-?>");
        this.executor = executor;
    }
}
