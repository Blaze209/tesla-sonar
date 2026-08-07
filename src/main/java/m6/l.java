package m6;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.auth.blockstore.restorecredential.RestoreCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d6.b0;
import d6.c0;
import d6.g0;
import d6.o;
import java.util.Iterator;
import java.util.concurrent.Executor;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lm6/l;", "Lh6/b;", "Ld6/b0;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;", "Ld6/c0;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "request", "Ld6/m;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljn0/h0;", "n", "(Ld6/b0;Ld6/m;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "l", "(Ld6/b0;)Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "response", "m", "(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;)Ld6/c0;", "g", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l extends h6.b<b0, GetRestoreCredentialRequest, GetRestoreCredentialResponse, c0, GetCredentialException> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;", "kotlin.jvm.PlatformType", "it", "Ljn0/h0;", "a", "(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<GetRestoreCredentialResponse, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f91302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Executor f91303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d6.m<c0, GetCredentialException> f91304f;

        /* JADX INFO: renamed from: m6.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class C1946a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Executor f91305c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ d6.m<c0, GetCredentialException> f91306d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c0 f91307e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1946a(Executor executor, d6.m<c0, GetCredentialException> mVar, c0 c0Var) {
                super(0);
                this.f91305c = executor;
                this.f91306d = mVar;
                this.f91307e = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(d6.m mVar, c0 c0Var) {
                mVar.onResult(c0Var);
            }

            public final void b() {
                Executor executor = this.f91305c;
                final d6.m<c0, GetCredentialException> mVar = this.f91306d;
                final c0 c0Var = this.f91307e;
                executor.execute(new Runnable() { // from class: m6.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.a.C1946a.c(mVar, c0Var);
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
            final /* synthetic */ Executor f91308c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ d6.m<c0, GetCredentialException> f91309d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Exception f91310e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Executor executor, d6.m<c0, GetCredentialException> mVar, Exception exc) {
                super(0);
                this.f91308c = executor;
                this.f91309d = mVar;
                this.f91310e = exc;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(d6.m mVar, Exception exc) {
                mVar.a(exc instanceof NoCredentialException ? (GetCredentialException) exc : new GetCredentialUnknownException(exc.getMessage()));
            }

            public final void b() {
                Executor executor = this.f91308c;
                final d6.m<c0, GetCredentialException> mVar = this.f91309d;
                final Exception exc = this.f91310e;
                executor.execute(new Runnable() { // from class: m6.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.a.b.c(mVar, exc);
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
        a(CancellationSignal cancellationSignal, Executor executor, d6.m<c0, GetCredentialException> mVar) {
            super(1);
            this.f91302d = cancellationSignal;
            this.f91303e = executor;
            this.f91304f = mVar;
        }

        public final void a(GetRestoreCredentialResponse getRestoreCredentialResponse) {
            try {
                l lVar = l.this;
                s.h(getRestoreCredentialResponse);
                c0 c0VarM = lVar.m(getRestoreCredentialResponse);
                h6.b.Companion aVar = h6.b.INSTANCE;
                h6.b.e(this.f91302d, new C1946a(this.f91303e, this.f91304f, c0VarM));
            } catch (Exception e11) {
                h6.b.Companion aVar2 = h6.b.INSTANCE;
                h6.b.e(this.f91302d, new b(this.f91303e, this.f91304f, e11));
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(GetRestoreCredentialResponse getRestoreCredentialResponse) {
            a(getRestoreCredentialResponse);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f91311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d6.m<c0, GetCredentialException> f91312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n0<GetCredentialException> f91313e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Executor executor, d6.m<c0, GetCredentialException> mVar, n0<GetCredentialException> n0Var) {
            super(0);
            this.f91311c = executor;
            this.f91312d = mVar;
            this.f91313e = n0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(d6.m mVar, n0 n0Var) {
            mVar.a(n0Var.f86529a);
        }

        public final void b() {
            Executor executor = this.f91311c;
            final d6.m<c0, GetCredentialException> mVar = this.f91312d;
            final n0<GetCredentialException> n0Var = this.f91313e;
            executor.execute(new Runnable() { // from class: m6.n
                @Override // java.lang.Runnable
                public final void run() {
                    l.b.c(mVar, n0Var);
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
    public l(Context context) {
        super(context);
        s.k(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(wn0.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    public static final void p(CancellationSignal cancellationSignal, Executor executor, d6.m mVar, Exception e11) {
        s.k(e11, "e");
        n0 n0Var = new n0();
        n0Var.f86529a = new GetCredentialUnknownException("Get restore credential failed for unknown reason, failure: " + e11.getMessage());
        if (e11 instanceof ApiException) {
            ApiException apiException = (ApiException) e11;
            if (apiException.getStatusCode() == 40201) {
                n0Var.f86529a = new GetCredentialUnknownException("The restore credential internal service had a failure, failure: " + e11.getMessage());
            } else {
                n0Var.f86529a = new GetCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + e11.getMessage() + ", status code: " + apiException.getStatusCode());
            }
        }
        h6.b.e(cancellationSignal, new b(executor, mVar, n0Var));
    }

    public GetRestoreCredentialRequest l(b0 request) {
        o oVar;
        s.k(request, "request");
        Iterator<o> it = request.a().iterator();
        do {
            oVar = null;
            if (!it.hasNext()) {
                break;
            }
        } while (!(it.next() instanceof g0));
        s.B("credentialOption");
        return new GetRestoreCredentialRequest(oVar.getRequestData());
    }

    public c0 m(GetRestoreCredentialResponse response) {
        s.k(response, "response");
        return new c0(d6.j.INSTANCE.b("androidx.credentials.TYPE_RESTORE_CREDENTIAL", response.getResponseBundle()));
    }

    public void n(b0 request, final d6.m<c0, GetCredentialException> callback, final Executor executor, final CancellationSignal cancellationSignal) {
        s.k(request, "request");
        s.k(callback, "callback");
        s.k(executor, "executor");
        if (CredentialProviderPlayServicesImpl.INSTANCE.a(cancellationSignal)) {
            return;
        }
        Task<GetRestoreCredentialResponse> restoreCredential = RestoreCredential.getRestoreCredentialClient(this.context).getRestoreCredential(l(request));
        final a aVar = new a(cancellationSignal, executor, callback);
        restoreCredential.addOnSuccessListener(new OnSuccessListener() { // from class: m6.i
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                l.o(aVar, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: m6.j
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                l.p(cancellationSignal, executor, callback, exc);
            }
        });
    }
}
