package l6;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.restorecredential.CreateRestoreCredentialDomException;
import androidx.credentials.exceptions.restorecredential.E2eeUnavailableException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.auth.blockstore.restorecredential.RestoreCredential;
import com.google.android.gms.auth.blockstore.restorecredential.RestoreCredentialStatusCodes;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d6.h;
import d6.i;
import d6.m;
import java.util.concurrent.Executor;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ll6/d;", "Lh6/b;", "Ld6/h;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;", "Ld6/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "request", "Ld6/m;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljn0/h0;", "n", "(Ld6/h;Ld6/m;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "l", "(Ld6/h;)Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", "response", "m", "(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;)Ld6/c;", "g", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends h6.b<h, CreateRestoreCredentialRequest, CreateRestoreCredentialResponse, d6.c, CreateCredentialException> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;", "kotlin.jvm.PlatformType", "it", "Ljn0/h0;", "a", "(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<CreateRestoreCredentialResponse, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f89659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Executor f89660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m<d6.c, CreateCredentialException> f89661f;

        /* JADX INFO: renamed from: l6.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class C1888a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Executor f89662c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ m<d6.c, CreateCredentialException> f89663d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ d6.c f89664e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1888a(Executor executor, m<d6.c, CreateCredentialException> mVar, d6.c cVar) {
                super(0);
                this.f89662c = executor;
                this.f89663d = mVar;
                this.f89664e = cVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(m mVar, d6.c cVar) {
                mVar.onResult(cVar);
            }

            public final void b() {
                Executor executor = this.f89662c;
                final m<d6.c, CreateCredentialException> mVar = this.f89663d;
                final d6.c cVar = this.f89664e;
                executor.execute(new Runnable() { // from class: l6.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.C1888a.c(mVar, cVar);
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
        static final class b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Executor f89665c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ m<d6.c, CreateCredentialException> f89666d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Exception f89667e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Executor executor, m<d6.c, CreateCredentialException> mVar, Exception exc) {
                super(0);
                this.f89665c = executor;
                this.f89666d = mVar;
                this.f89667e = exc;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(m mVar, Exception exc) {
                mVar.a(new CreateCredentialUnknownException(exc.getMessage()));
            }

            public final void b() {
                Executor executor = this.f89665c;
                final m<d6.c, CreateCredentialException> mVar = this.f89666d;
                final Exception exc = this.f89667e;
                executor.execute(new Runnable() { // from class: l6.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.b.c(mVar, exc);
                    }
                });
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CancellationSignal cancellationSignal, Executor executor, m<d6.c, CreateCredentialException> mVar) {
            super(1);
            this.f89659d = cancellationSignal;
            this.f89660e = executor;
            this.f89661f = mVar;
        }

        public final void a(CreateRestoreCredentialResponse createRestoreCredentialResponse) {
            try {
                d dVar = d.this;
                s.h(createRestoreCredentialResponse);
                d6.c cVarM = dVar.m(createRestoreCredentialResponse);
                h6.b.Companion aVar = h6.b.INSTANCE;
                h6.b.e(this.f89659d, new C1888a(this.f89660e, this.f89661f, cVarM));
            } catch (Exception e11) {
                h6.b.Companion aVar2 = h6.b.INSTANCE;
                h6.b.e(this.f89659d, new b(this.f89660e, this.f89661f, e11));
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(CreateRestoreCredentialResponse createRestoreCredentialResponse) {
            a(createRestoreCredentialResponse);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f89668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<d6.c, CreateCredentialException> f89669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n0<CreateCredentialException> f89670e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Executor executor, m<d6.c, CreateCredentialException> mVar, n0<CreateCredentialException> n0Var) {
            super(0);
            this.f89668c = executor;
            this.f89669d = mVar;
            this.f89670e = n0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(m mVar, n0 n0Var) {
            mVar.a(n0Var.f86529a);
        }

        public final void b() {
            Executor executor = this.f89668c;
            final m<d6.c, CreateCredentialException> mVar = this.f89669d;
            final n0<CreateCredentialException> n0Var = this.f89670e;
            executor.execute(new Runnable() { // from class: l6.f
                @Override // java.lang.Runnable
                public final void run() {
                    d.b.c(mVar, n0Var);
                }
            });
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        s.k(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, androidx.credentials.exceptions.restorecredential.CreateRestoreCredentialDomException] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, androidx.credentials.exceptions.restorecredential.E2eeUnavailableException] */
    public static final void p(CancellationSignal cancellationSignal, Executor executor, m mVar, Exception e11) {
        s.k(e11, "e");
        n0 n0Var = new n0();
        n0Var.f86529a = new CreateCredentialUnknownException("Create restore credential failed for unknown reason, failure: " + e11.getMessage());
        if (e11 instanceof ApiException) {
            ApiException apiException = (ApiException) e11;
            switch (apiException.getStatusCode()) {
                case RestoreCredentialStatusCodes.RESTORE_CREDENTIAL_INTERNAL_FAILURE /* 40201 */:
                    n0Var.f86529a = new CreateCredentialUnknownException("The restore credential internal service had a failure, failure: " + e11.getMessage());
                    break;
                case RestoreCredentialStatusCodes.RESTORE_CREDENTIAL_FIDO_FAILURE /* 40202 */:
                    n0Var.f86529a = new CreateRestoreCredentialDomException(new e6.d(), "The request did not match the fido spec, failure: " + e11.getMessage());
                    break;
                case RestoreCredentialStatusCodes.RESTORE_CREDENTIAL_E2EE_UNAVAILABLE /* 40203 */:
                    n0Var.f86529a = new E2eeUnavailableException("E2ee is not available on the device. Check whether the backup and screen lock are enabled.");
                    break;
                default:
                    n0Var.f86529a = new CreateCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + e11.getMessage() + ", status code: " + apiException.getStatusCode());
                    break;
            }
        }
        h6.b.e(cancellationSignal, new b(executor, mVar, n0Var));
    }

    public CreateRestoreCredentialRequest l(h request) {
        s.k(request, "request");
        return new CreateRestoreCredentialRequest(request.a());
    }

    public d6.c m(CreateRestoreCredentialResponse response) {
        s.k(response, "response");
        return i.INSTANCE.a(response.getResponseBundle());
    }

    public void n(h request, final m<d6.c, CreateCredentialException> callback, final Executor executor, final CancellationSignal cancellationSignal) {
        s.k(request, "request");
        s.k(callback, "callback");
        s.k(executor, "executor");
        if (CredentialProviderPlayServicesImpl.INSTANCE.a(cancellationSignal)) {
            return;
        }
        Task<CreateRestoreCredentialResponse> taskCreateRestoreCredential = RestoreCredential.getRestoreCredentialClient(this.context).createRestoreCredential(l(request));
        final a aVar = new a(cancellationSignal, executor, callback);
        taskCreateRestoreCredential.addOnSuccessListener(new OnSuccessListener() { // from class: l6.a
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                d.o(aVar, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: l6.b
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                d.p(cancellationSignal, executor, callback, exc);
            }
        });
    }
}
