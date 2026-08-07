package j6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import d6.m;
import java.util.concurrent.Executor;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\b\u0007*\u0001)\b\u0000\u0018\u0000 -2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001.B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010#R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010#R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lj6/a;", "Lh6/b;", "Ld6/d;", "Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;", "Ljn0/h0;", "Ld6/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "request", "Ld6/m;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "q", "(Ld6/d;Ld6/m;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", StatusResponse.RESULT_CODE, "p", "(II)V", "n", "(Ld6/d;)Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;", "response", "o", "(Ljn0/h0;)Ld6/c;", "g", "Landroid/content/Context;", "h", "Ld6/m;", "getCallback$annotations", "()V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Executor;", "j", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "j6/a$f", "k", "Lj6/a$f;", "resultReceiver", "l", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a extends h6.b<d6.d, SavePasswordRequest, h0, d6.c, CreateCredentialException> {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private m<d6.c, CreateCredentialException> callback;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Executor executor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private CancellationSignal cancellationSignal;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final f resultReceiver;

    /* JADX INFO: renamed from: j6.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lj6/a$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj6/a;", "a", "(Landroid/content/Context;)Lj6/a;", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context) {
            s.k(context, "context");
            return new a(context);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/CancellationSignal;", "s", "Lkotlin/Function0;", "Ljn0/h0;", "f", "a", "(Landroid/os/CancellationSignal;Lwn0/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<CancellationSignal, wn0.a<? extends h0>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f82716c = new b();

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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialException;", "e", "Ljn0/h0;", "b", "(Landroidx/credentials/exceptions/CreateCredentialException;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements l<CreateCredentialException, h0> {
        c() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, CreateCredentialException createCredentialException) {
            m mVar = aVar.callback;
            if (mVar == null) {
                s.B("callback");
                mVar = null;
            }
            mVar.a(createCredentialException);
        }

        public final void b(final CreateCredentialException e11) {
            s.k(e11, "e");
            Executor executor = a.this.executor;
            if (executor == null) {
                s.B("executor");
                executor = null;
            }
            final a aVar = a.this;
            executor.execute(new Runnable() { // from class: j6.b
                @Override // java.lang.Runnable
                public final void run() {
                    a.c.c(aVar, e11);
                }
            });
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(CreateCredentialException createCredentialException) {
            b(createCredentialException);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d6.c f82719d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(d6.c cVar) {
            super(0);
            this.f82719d = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, d6.c cVar) {
            m mVar = aVar.callback;
            if (mVar == null) {
                s.B("callback");
                mVar = null;
            }
            mVar.onResult(cVar);
        }

        public final void b() {
            Executor executor = a.this.executor;
            if (executor == null) {
                s.B("executor");
                executor = null;
            }
            final a aVar = a.this;
            final d6.c cVar = this.f82719d;
            executor.execute(new Runnable() { // from class: j6.c
                @Override // java.lang.Runnable
                public final void run() {
                    a.d.c(aVar, cVar);
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
        e() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar) {
            m mVar = aVar.callback;
            if (mVar == null) {
                s.B("callback");
                mVar = null;
            }
            mVar.a(new CreateCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
        }

        public final void b() {
            Executor executor = a.this.executor;
            if (executor == null) {
                s.B("executor");
                executor = null;
            }
            final a aVar = a.this;
            executor.execute(new Runnable() { // from class: j6.d
                @Override // java.lang.Runnable
                public final void run() {
                    a.e.c(aVar);
                }
            });
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"j6/a$f", "Landroid/os/ResultReceiver;", "", StatusResponse.RESULT_CODE, "Landroid/os/Bundle;", "resultData", "Ljn0/h0;", "onReceiveResult", "(ILandroid/os/Bundle;)V", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends ResultReceiver {

        /* JADX INFO: renamed from: j6.a$f$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class C1730a extends p013kotlin.jvm.internal.p implements p<String, String, CreateCredentialException> {
            C1730a(Object obj) {
                super(2, obj, h6.a.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final CreateCredentialException invoke(String str, String str2) {
                return ((h6.a.Companion) this.receiver).a(str, str2);
            }
        }

        f(Handler handler) {
            super(handler);
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int resultCode, Bundle resultData) {
            Executor executor;
            m mVar;
            s.k(resultData, "resultData");
            a aVar = a.this;
            C1730a c1730a = new C1730a(h6.a.INSTANCE);
            Executor executor2 = a.this.executor;
            if (executor2 == null) {
                s.B("executor");
                executor = null;
            } else {
                executor = executor2;
            }
            m mVar2 = a.this.callback;
            if (mVar2 == null) {
                s.B("callback");
                mVar = null;
            } else {
                mVar = mVar2;
            }
            if (aVar.f(resultData, c1730a, executor, mVar, a.this.cancellationSignal)) {
                return;
            }
            a.this.p(resultData.getInt("ACTIVITY_REQUEST_CODE"), resultCode);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        s.k(context, "context");
        this.context = context;
        this.resultReceiver = new f(new Handler(Looper.getMainLooper()));
    }

    public SavePasswordRequest n(d6.d request) {
        s.k(request, "request");
        SavePasswordRequest savePasswordRequestBuild = SavePasswordRequest.builder().setSignInPassword(new SignInPassword(request.b(), request.c())).build();
        s.j(savePasswordRequestBuild, "build(...)");
        return savePasswordRequestBuild;
    }

    public d6.c o(h0 response) {
        s.k(response, "response");
        return new d6.e();
    }

    public final void p(int uniqueRequestCode, int resultCode) {
        h6.a.Companion companion = h6.a.INSTANCE;
        if (uniqueRequestCode == companion.b()) {
            if (h6.b.g(resultCode, b.f82716c, new c(), this.cancellationSignal)) {
                return;
            }
            h6.b.e(this.cancellationSignal, new d(o(h0.f84049a)));
            return;
        }
        Log.w("CreatePassword", "Returned request code " + companion.b() + " which does not match what was given " + uniqueRequestCode);
    }

    public void q(d6.d request, m<d6.c, CreateCredentialException> callback, Executor executor, CancellationSignal cancellationSignal) {
        s.k(request, "request");
        s.k(callback, "callback");
        s.k(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.INSTANCE.a(cancellationSignal)) {
            return;
        }
        SavePasswordRequest savePasswordRequestN = n(request);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", savePasswordRequestN);
        c(this.resultReceiver, intent, "CREATE_PASSWORD");
        try {
            this.context.startActivity(intent);
        } catch (Exception unused) {
            h6.b.e(cancellationSignal, new e());
        }
    }
}
