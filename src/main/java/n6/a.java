package n6;

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
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import d6.b0;
import d6.c0;
import d6.m;
import d6.o;
import java.util.concurrent.Executor;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\b\u0006*\u00018\b\u0000\u0018\u0000 \u00152 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001<B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\"\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b&\u0010'\u0012\u0004\b,\u0010-\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u0010-\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b5\u00106\u0012\u0004\b7\u0010-R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Ln6/a;", "Lh6/b;", "Ld6/b0;", "Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "Ld6/c0;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "request", "Ld6/m;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljn0/h0;", "r", "(Ld6/b0;Ld6/m;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "l", "(Ld6/b0;)Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;", "response", "m", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Ld6/c0;", "Lys/c;", "n", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Lys/c;", "", "uniqueRequestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "q", "(IILandroid/content/Intent;)V", "g", "Landroid/content/Context;", "h", "Ld6/m;", "o", "()Ld6/m;", "s", "(Ld6/m;)V", "getCallback$annotations", "()V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Executor;", "p", "()Ljava/util/concurrent/Executor;", "t", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "j", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "n6/a$j", "k", "Ln6/a$j;", "resultReceiver", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a extends h6.b<b0, GetSignInIntentRequest, SignInCredential, c0, GetCredentialException> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public m<c0, GetCredentialException> callback;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public Executor executor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private CancellationSignal cancellationSignal;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final j resultReceiver;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/CancellationSignal;", "s", "Lkotlin/Function0;", "Ljn0/h0;", "f", "a", "(Landroid/os/CancellationSignal;Lwn0/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<CancellationSignal, wn0.a<? extends h0>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f93355c = new b();

        b() {
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
        public static final void c(a aVar, GetCredentialException getCredentialException) {
            aVar.o().a(getCredentialException);
        }

        public final void b(final GetCredentialException e11) {
            s.k(e11, "e");
            Executor executorP = a.this.p();
            final a aVar = a.this;
            executorP.execute(new Runnable() { // from class: n6.b
                @Override // java.lang.Runnable
                public final void run() {
                    a.c.c(aVar, e11);
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
        final /* synthetic */ c0 f93358d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c0 c0Var) {
            super(0);
            this.f93358d = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, c0 c0Var) {
            aVar.o().onResult(c0Var);
        }

        public final void b() {
            Executor executorP = a.this.p();
            final a aVar = a.this;
            final c0 c0Var = this.f93358d;
            executorP.execute(new Runnable() { // from class: n6.c
                @Override // java.lang.Runnable
                public final void run() {
                    a.d.c(aVar, c0Var);
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
        final /* synthetic */ n0<GetCredentialException> f93360d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n0<GetCredentialException> n0Var) {
            super(0);
            this.f93360d = n0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void c(a aVar, n0 n0Var) {
            aVar.o().a(n0Var.f86529a);
        }

        public final void b() {
            Executor executorP = a.this.p();
            final a aVar = a.this;
            final n0<GetCredentialException> n0Var = this.f93360d;
            executorP.execute(new Runnable() { // from class: n6.d
                @Override // java.lang.Runnable
                public final void run() {
                    a.e.c(aVar, n0Var);
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
        final /* synthetic */ GetCredentialException f93362d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(GetCredentialException getCredentialException) {
            super(0);
            this.f93362d = getCredentialException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, GetCredentialException getCredentialException) {
            aVar.o().a(getCredentialException);
        }

        public final void b() {
            Executor executorP = a.this.p();
            final a aVar = a.this;
            final GetCredentialException getCredentialException = this.f93362d;
            executorP.execute(new Runnable() { // from class: n6.e
                @Override // java.lang.Runnable
                public final void run() {
                    a.f.c(aVar, getCredentialException);
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
        final /* synthetic */ GetCredentialUnknownException f93364d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(GetCredentialUnknownException getCredentialUnknownException) {
            super(0);
            this.f93364d = getCredentialUnknownException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, GetCredentialUnknownException getCredentialUnknownException) {
            aVar.o().a(getCredentialUnknownException);
        }

        public final void b() {
            Executor executorP = a.this.p();
            final a aVar = a.this;
            final GetCredentialUnknownException getCredentialUnknownException = this.f93364d;
            executorP.execute(new Runnable() { // from class: n6.f
                @Override // java.lang.Runnable
                public final void run() {
                    a.g.c(aVar, getCredentialUnknownException);
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

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Exception f93366d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Exception exc) {
            super(0);
            this.f93366d = exc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void c(a aVar, Exception exc) {
            aVar.o().a(exc);
        }

        public final void b() {
            Executor executorP = a.this.p();
            final a aVar = a.this;
            final Exception exc = this.f93366d;
            executorP.execute(new Runnable() { // from class: n6.g
                @Override // java.lang.Runnable
                public final void run() {
                    a.h.c(aVar, exc);
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
    static final class i extends u implements wn0.a<h0> {
        i() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar) {
            aVar.o().a(new GetCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
        }

        public final void b() {
            Executor executorP = a.this.p();
            final a aVar = a.this;
            executorP.execute(new Runnable() { // from class: n6.h
                @Override // java.lang.Runnable
                public final void run() {
                    a.i.c(aVar);
                }
            });
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"n6/a$j", "Landroid/os/ResultReceiver;", "", StatusResponse.RESULT_CODE, "Landroid/os/Bundle;", "resultData", "Ljn0/h0;", "onReceiveResult", "(ILandroid/os/Bundle;)V", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends ResultReceiver {

        /* JADX INFO: renamed from: n6.a$j$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class C1991a extends p013kotlin.jvm.internal.p implements p<String, String, GetCredentialException> {
            C1991a(Object obj) {
                super(2, obj, h6.a.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final GetCredentialException invoke(String str, String str2) {
                return ((h6.a.Companion) this.receiver).c(str, str2);
            }
        }

        j(Handler handler) {
            super(handler);
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int resultCode, Bundle resultData) {
            s.k(resultData, "resultData");
            if (a.this.f(resultData, new C1991a(h6.a.INSTANCE), a.this.p(), a.this.o(), a.this.cancellationSignal)) {
                return;
            }
            a.this.q(resultData.getInt("ACTIVITY_REQUEST_CODE"), resultCode, (Intent) resultData.getParcelable("RESULT_DATA"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        s.k(context, "context");
        this.context = context;
        this.resultReceiver = new j(new Handler(Looper.getMainLooper()));
    }

    public GetSignInIntentRequest l(b0 request) throws GetCredentialUnsupportedException {
        s.k(request, "request");
        if (request.a().size() != 1) {
            throw new GetCredentialUnsupportedException("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        o oVar = request.a().get(0);
        s.i(oVar, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
        ys.b bVar = (ys.b) oVar;
        GetSignInIntentRequest getSignInIntentRequestBuild = GetSignInIntentRequest.builder().setServerClientId(bVar.getF125793i()).filterByHostedDomain(bVar.getF125794j()).setNonce(bVar.getF125795k()).build();
        s.j(getSignInIntentRequestBuild, "build(...)");
        return getSignInIntentRequestBuild;
    }

    protected c0 m(SignInCredential response) throws GetCredentialUnknownException {
        ys.c cVarN;
        s.k(response, "response");
        if (response.getGoogleIdToken() != null) {
            cVarN = n(response);
        } else {
            Log.w("GetSignInIntent", "Credential returned but no google Id found");
            cVarN = null;
        }
        if (cVarN != null) {
            return new c0(cVarN);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    public final ys.c n(SignInCredential response) throws GetCredentialUnknownException {
        s.k(response, "response");
        ys.c.a aVar = new ys.c.a();
        String id2 = response.getId();
        s.j(id2, "getId(...)");
        ys.c.a aVarE = aVar.e(id2);
        try {
            String googleIdToken = response.getGoogleIdToken();
            s.h(googleIdToken);
            aVarE.f(googleIdToken);
            if (response.getDisplayName() != null) {
                aVarE.b(response.getDisplayName());
            }
            if (response.getGivenName() != null) {
                aVarE.d(response.getGivenName());
            }
            if (response.getFamilyName() != null) {
                aVarE.c(response.getFamilyName());
            }
            if (response.getPhoneNumber() != null) {
                aVarE.g(response.getPhoneNumber());
            }
            if (response.getProfilePictureUri() != null) {
                aVarE.h(response.getProfilePictureUri());
            }
            return aVarE.a();
        } catch (Exception unused) {
            throw new GetCredentialUnknownException("When attempting to convert get response, null Google ID Token found");
        }
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
            Log.w("GetSignInIntent", "Returned request code " + companion.b() + " which  does not match what was given " + uniqueRequestCode);
            return;
        }
        if (h6.b.h(resultCode, b.f93355c, new c(), this.cancellationSignal)) {
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
        try {
            GetSignInIntentRequest getSignInIntentRequestL = l(request);
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra("REQUEST_TYPE", getSignInIntentRequestL);
            c(this.resultReceiver, intent, "SIGN_IN_INTENT");
            this.context.startActivity(intent);
        } catch (Exception e11) {
            if (e11 instanceof GetCredentialUnsupportedException) {
                h6.b.e(cancellationSignal, new h(e11));
            } else {
                h6.b.e(cancellationSignal, new i());
            }
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
