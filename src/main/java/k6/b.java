package k6;

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
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import d6.m;
import e6.b0;
import java.util.concurrent.Executor;
import jn0.h0;
import org.json.JSONException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\b\u0007*\u00011\b\u0000\u0018\u0000 52 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00016B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0004H\u0017¢\u0006\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00118\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010+R\u001c\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010+R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000e\u0010/\u0012\u0004\b0\u0010+R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lk6/b;", "Lh6/b;", "Ld6/f;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Ld6/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lorg/json/JSONException;", "exception", "Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;", "j", "(Lorg/json/JSONException;)Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;", "request", "Ld6/m;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljn0/h0;", "u", "(Ld6/f;Ld6/m;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "s", "(IILandroid/content/Intent;)V", "q", "(Ld6/f;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "response", "r", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)Ld6/c;", "g", "Landroid/content/Context;", "h", "Ld6/m;", "getCallback$annotations", "()V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Executor;", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "k6/b$k", "k", "Lk6/b$k;", "resultReceiver", "l", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b extends h6.b<d6.f, PublicKeyCredentialCreationOptions, PublicKeyCredential, d6.c, CreateCredentialException> {

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
    private final k resultReceiver;

    /* JADX INFO: renamed from: k6.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk6/b$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lk6/b;", "a", "(Landroid/content/Context;)Lk6/b;", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Context context) {
            s.k(context, "context");
            return new b(context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: k6.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/CancellationSignal;", "s", "Lkotlin/Function0;", "Ljn0/h0;", "f", "a", "(Landroid/os/CancellationSignal;Lwn0/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class C1800b extends u implements p<CancellationSignal, wn0.a<? extends h0>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1800b f85066c = new C1800b();

        C1800b() {
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
        public static final void c(b bVar, CreateCredentialException createCredentialException) {
            m mVar = bVar.callback;
            if (mVar == null) {
                s.B("callback");
                mVar = null;
            }
            mVar.a(createCredentialException);
        }

        public final void b(final CreateCredentialException e11) {
            s.k(e11, "e");
            Executor executor = b.this.executor;
            if (executor == null) {
                s.B("executor");
                executor = null;
            }
            final b bVar = b.this;
            executor.execute(new Runnable() { // from class: k6.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.c(bVar, e11);
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
        final /* synthetic */ CreateCredentialException f85069d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CreateCredentialException createCredentialException) {
            super(0);
            this.f85069d = createCredentialException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar, CreateCredentialException createCredentialException) {
            m mVar = bVar.callback;
            if (mVar == null) {
                s.B("callback");
                mVar = null;
            }
            mVar.a(createCredentialException);
        }

        public final void b() {
            Executor executor = b.this.executor;
            if (executor == null) {
                s.B("executor");
                executor = null;
            }
            final b bVar = b.this;
            final CreateCredentialException createCredentialException = this.f85069d;
            executor.execute(new Runnable() { // from class: k6.d
                @Override // java.lang.Runnable
                public final void run() {
                    b.d.c(bVar, createCredentialException);
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
        final /* synthetic */ d6.c f85071d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(d6.c cVar) {
            super(0);
            this.f85071d = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar, d6.c cVar) {
            m mVar = bVar.callback;
            if (mVar == null) {
                s.B("callback");
                mVar = null;
            }
            mVar.onResult(cVar);
        }

        public final void b() {
            Executor executor = b.this.executor;
            if (executor == null) {
                s.B("executor");
                executor = null;
            }
            final b bVar = b.this;
            final d6.c cVar = this.f85071d;
            executor.execute(new Runnable() { // from class: k6.e
                @Override // java.lang.Runnable
                public final void run() {
                    b.e.c(bVar, cVar);
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
        final /* synthetic */ JSONException f85073d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(JSONException jSONException) {
            super(0);
            this.f85073d = jSONException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar, JSONException jSONException) {
            m mVar = bVar.callback;
            if (mVar == null) {
                s.B("callback");
                mVar = null;
            }
            mVar.a(new CreatePublicKeyCredentialDomException(new e6.f(), jSONException.getMessage()));
        }

        public final void b() {
            Executor executor = b.this.executor;
            if (executor == null) {
                s.B("executor");
                executor = null;
            }
            final b bVar = b.this;
            final JSONException jSONException = this.f85073d;
            executor.execute(new Runnable() { // from class: k6.f
                @Override // java.lang.Runnable
                public final void run() {
                    b.f.c(bVar, jSONException);
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
        final /* synthetic */ Throwable f85075d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Throwable th2) {
            super(0);
            this.f85075d = th2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar, Throwable th2) {
            m mVar = bVar.callback;
            if (mVar == null) {
                s.B("callback");
                mVar = null;
            }
            mVar.a(new CreatePublicKeyCredentialDomException(new b0(), th2.getMessage()));
        }

        public final void b() {
            Executor executor = b.this.executor;
            if (executor == null) {
                s.B("executor");
                executor = null;
            }
            final b bVar = b.this;
            final Throwable th2 = this.f85075d;
            executor.execute(new Runnable() { // from class: k6.g
                @Override // java.lang.Runnable
                public final void run() {
                    b.g.c(bVar, th2);
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
        final /* synthetic */ JSONException f85077d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(JSONException jSONException) {
            super(0);
            this.f85077d = jSONException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar, JSONException jSONException) {
            m mVar = bVar.callback;
            if (mVar == null) {
                s.B("callback");
                mVar = null;
            }
            mVar.a(bVar.j(jSONException));
        }

        public final void b() {
            Executor executor = b.this.executor;
            if (executor == null) {
                s.B("executor");
                executor = null;
            }
            final b bVar = b.this;
            final JSONException jSONException = this.f85077d;
            executor.execute(new Runnable() { // from class: k6.h
                @Override // java.lang.Runnable
                public final void run() {
                    b.h.c(bVar, jSONException);
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

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Throwable f85079d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Throwable th2) {
            super(0);
            this.f85079d = th2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar, Throwable th2) {
            m mVar = bVar.callback;
            if (mVar == null) {
                s.B("callback");
                mVar = null;
            }
            mVar.a(new CreateCredentialUnknownException(th2.getMessage()));
        }

        public final void b() {
            Executor executor = b.this.executor;
            if (executor == null) {
                s.B("executor");
                executor = null;
            }
            final b bVar = b.this;
            final Throwable th2 = this.f85079d;
            executor.execute(new Runnable() { // from class: k6.i
                @Override // java.lang.Runnable
                public final void run() {
                    b.i.c(bVar, th2);
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
    static final class j extends u implements wn0.a<h0> {
        j() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar) {
            m mVar = bVar.callback;
            if (mVar == null) {
                s.B("callback");
                mVar = null;
            }
            mVar.a(new CreateCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
        }

        public final void b() {
            Executor executor = b.this.executor;
            if (executor == null) {
                s.B("executor");
                executor = null;
            }
            final b bVar = b.this;
            executor.execute(new Runnable() { // from class: k6.j
                @Override // java.lang.Runnable
                public final void run() {
                    b.j.c(bVar);
                }
            });
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"k6/b$k", "Landroid/os/ResultReceiver;", "", StatusResponse.RESULT_CODE, "Landroid/os/Bundle;", "resultData", "Ljn0/h0;", "onReceiveResult", "(ILandroid/os/Bundle;)V", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k extends ResultReceiver {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements p<String, String, CreateCredentialException> {
            a(Object obj) {
                super(2, obj, h6.a.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final CreateCredentialException invoke(String str, String str2) {
                return ((h6.a.Companion) this.receiver).a(str, str2);
            }
        }

        k(Handler handler) {
            super(handler);
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int resultCode, Bundle resultData) {
            Executor executor;
            m mVar;
            s.k(resultData, "resultData");
            b bVar = b.this;
            a aVar = new a(h6.a.INSTANCE);
            Executor executor2 = b.this.executor;
            if (executor2 == null) {
                s.B("executor");
                executor = null;
            } else {
                executor = executor2;
            }
            m mVar2 = b.this.callback;
            if (mVar2 == null) {
                s.B("callback");
                mVar = null;
            } else {
                mVar = mVar2;
            }
            if (bVar.f(resultData, aVar, executor, mVar, b.this.cancellationSignal)) {
                return;
            }
            b.this.s(resultData.getInt("ACTIVITY_REQUEST_CODE"), resultCode, (Intent) resultData.getParcelable("RESULT_DATA"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        s.k(context, "context");
        this.context = context;
        this.resultReceiver = new k(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreatePublicKeyCredentialDomException j(JSONException exception) {
        String message = exception.getMessage();
        return (message == null || message.length() <= 0) ? new CreatePublicKeyCredentialDomException(new e6.f(), "Unknown error") : new CreatePublicKeyCredentialDomException(new e6.f(), message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(b bVar) {
        m<d6.c, CreateCredentialException> mVar = bVar.callback;
        if (mVar == null) {
            s.B("callback");
            mVar = null;
        }
        mVar.a(new CreatePublicKeyCredentialDomException(new b0(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }

    public PublicKeyCredentialCreationOptions q(d6.f request) {
        s.k(request, "request");
        return k6.k.INSTANCE.d(request, this.context);
    }

    public d6.c r(PublicKeyCredential response) throws CreateCredentialUnknownException {
        s.k(response, "response");
        try {
            String json = response.toJson();
            s.j(json, "toJson(...)");
            return new d6.g(json);
        } catch (Throwable th2) {
            throw new CreateCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
        }
    }

    public final void s(int uniqueRequestCode, int resultCode, Intent data) {
        h6.a.Companion companion = h6.a.INSTANCE;
        if (uniqueRequestCode != companion.b()) {
            Log.w("CreatePublicKey", "Returned request code " + companion.b() + " does not match what was given " + uniqueRequestCode);
            return;
        }
        if (h6.b.g(resultCode, C1800b.f85066c, new c(), this.cancellationSignal)) {
            return;
        }
        Executor executor = null;
        byte[] byteArrayExtra = data != null ? data.getByteArrayExtra(Fido.FIDO2_KEY_CREDENTIAL_EXTRA) : null;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.INSTANCE.a(this.cancellationSignal)) {
                return;
            }
            Executor executor2 = this.executor;
            if (executor2 == null) {
                s.B("executor");
            } else {
                executor = executor2;
            }
            executor.execute(new Runnable() { // from class: k6.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.t(this.f85059a);
                }
            });
            return;
        }
        PublicKeyCredential publicKeyCredentialDeserializeFromBytes = PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
        s.j(publicKeyCredentialDeserializeFromBytes, "deserializeFromBytes(...)");
        CreateCredentialException createCredentialExceptionM = k6.k.INSTANCE.M(publicKeyCredentialDeserializeFromBytes);
        if (createCredentialExceptionM != null) {
            h6.b.e(this.cancellationSignal, new d(createCredentialExceptionM));
            return;
        }
        try {
            h6.b.e(this.cancellationSignal, new e(r(publicKeyCredentialDeserializeFromBytes)));
        } catch (JSONException e11) {
            h6.b.e(this.cancellationSignal, new f(e11));
        } catch (Throwable th2) {
            h6.b.e(this.cancellationSignal, new g(th2));
        }
    }

    public void u(d6.f request, m<d6.c, CreateCredentialException> callback, Executor executor, CancellationSignal cancellationSignal) {
        s.k(request, "request");
        s.k(callback, "callback");
        s.k(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsQ = q(request);
            if (CredentialProviderPlayServicesImpl.INSTANCE.a(cancellationSignal)) {
                return;
            }
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra("REQUEST_TYPE", publicKeyCredentialCreationOptionsQ);
            c(this.resultReceiver, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
            try {
                this.context.startActivity(intent);
            } catch (Exception unused) {
                h6.b.e(cancellationSignal, new j());
            }
        } catch (JSONException e11) {
            h6.b.e(cancellationSignal, new h(e11));
        } catch (Throwable th2) {
            h6.b.e(cancellationSignal, new i(th2));
        }
    }
}
