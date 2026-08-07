package m6;

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
import androidx.credentials.playservices.IdentityCredentialApiHiddenActivity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialResponse;
import com.google.android.gms.identitycredentials.IdentityCredentialManager;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d6.b0;
import d6.c0;
import d6.e0;
import d6.o;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\b\b*\u00016\b\u0001\u0018\u0000 ;2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001<B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R4\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00188\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b$\u0010%\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b,\u0010-\u0012\u0004\b2\u0010+\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010+R\u001a\u0010:\u001a\u0002068\u0002X\u0082\u0004¢\u0006\f\n\u0004\b7\u00108\u0012\u0004\b9\u0010+¨\u0006="}, d2 = {"Lm6/c;", "Lh6/b;", "Ld6/b0;", "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "Lcom/google/android/gms/identitycredentials/GetCredentialResponse;", "Ld6/c0;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "e", "q", "(Ljava/lang/Throwable;)Landroidx/credentials/exceptions/GetCredentialException;", "", "uniqueRequestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "Ljn0/h0;", "t", "(IILandroid/content/Intent;)V", "request", "Ld6/m;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "u", "(Ld6/b0;Ld6/m;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "p", "(Ld6/b0;)Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "g", "Landroid/content/Context;", "h", "Ld6/m;", "r", "()Ld6/m;", "x", "(Ld6/m;)V", "getCallback$annotations", "()V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Executor;", "s", "()Ljava/util/concurrent/Executor;", "y", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "j", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "m6/c$i", "k", "Lm6/c$i;", "getResultReceiver$annotations", "resultReceiver", "l", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c extends h6.b<b0, GetCredentialRequest, GetCredentialResponse, c0, GetCredentialException> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f91266l = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public d6.m<c0, GetCredentialException> callback;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public Executor executor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private CancellationSignal cancellationSignal;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i resultReceiver;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm6/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/CancellationSignal;", "s", "Lkotlin/Function0;", "Ljn0/h0;", "f", "a", "(Landroid/os/CancellationSignal;Lwn0/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<CancellationSignal, wn0.a<? extends h0>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f91272c = new b();

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

    /* JADX INFO: renamed from: m6.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialException;", "e", "Ljn0/h0;", "b", "(Landroidx/credentials/exceptions/GetCredentialException;)V"}, k = 3, mv = {1, 9, 0})
    static final class C1945c extends u implements wn0.l<GetCredentialException, h0> {
        C1945c() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c cVar, GetCredentialException getCredentialException) {
            cVar.r().a(getCredentialException);
        }

        public final void b(final GetCredentialException e11) {
            s.k(e11, "e");
            Executor executorS = c.this.s();
            final c cVar = c.this;
            executorS.execute(new Runnable() { // from class: m6.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.C1945c.c(cVar, e11);
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
        d() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c cVar) {
            cVar.r().a(new GetCredentialUnknownException("No provider data returned."));
        }

        public final void b() {
            Executor executorS = c.this.s();
            final c cVar = c.this;
            executorS.execute(new Runnable() { // from class: m6.e
                @Override // java.lang.Runnable
                public final void run() {
                    c.d.c(cVar);
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
        final /* synthetic */ c0 f91276d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c0 c0Var) {
            super(0);
            this.f91276d = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c cVar, c0 c0Var) {
            cVar.r().onResult(c0Var);
        }

        public final void b() {
            Executor executorS = c.this.s();
            final c cVar = c.this;
            final c0 c0Var = this.f91276d;
            executorS.execute(new Runnable() { // from class: m6.f
                @Override // java.lang.Runnable
                public final void run() {
                    c.e.c(cVar, c0Var);
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
        final /* synthetic */ GetCredentialException f91278d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(GetCredentialException getCredentialException) {
            super(0);
            this.f91278d = getCredentialException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c cVar, GetCredentialException getCredentialException) {
            d6.m<c0, GetCredentialException> mVarR = cVar.r();
            if (getCredentialException == null) {
                getCredentialException = new GetCredentialUnknownException("Unexpected configuration error");
            }
            mVarR.a(getCredentialException);
        }

        public final void b() {
            Executor executorS = c.this.s();
            final c cVar = c.this;
            final GetCredentialException getCredentialException = this.f91278d;
            executorS.execute(new Runnable() { // from class: m6.g
                @Override // java.lang.Runnable
                public final void run() {
                    c.f.c(cVar, getCredentialException);
                }
            });
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;", "kotlin.jvm.PlatformType", "result", "Ljn0/h0;", "a", "(Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.l<PendingGetCredentialHandle, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f91279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f91280d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(CancellationSignal cancellationSignal, c cVar) {
            super(1);
            this.f91279c = cancellationSignal;
            this.f91280d = cVar;
        }

        public final void a(PendingGetCredentialHandle pendingGetCredentialHandle) {
            if (CredentialProviderPlayServicesImpl.INSTANCE.a(this.f91279c)) {
                return;
            }
            Intent intent = new Intent(this.f91280d.context, (Class<?>) IdentityCredentialApiHiddenActivity.class);
            intent.setFlags(65536);
            c cVar = this.f91280d;
            intent.putExtra("RESULT_RECEIVER", cVar.d(cVar.resultReceiver));
            intent.putExtra("EXTRA_GET_CREDENTIAL_INTENT", pendingGetCredentialHandle.getPendingIntent());
            this.f91280d.context.startActivity(intent);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(PendingGetCredentialHandle pendingGetCredentialHandle) {
            a(pendingGetCredentialHandle);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f91281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d6.m<c0, GetCredentialException> f91282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ GetCredentialException f91283e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Executor executor, d6.m<c0, GetCredentialException> mVar, GetCredentialException getCredentialException) {
            super(0);
            this.f91281c = executor;
            this.f91282d = mVar;
            this.f91283e = getCredentialException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(d6.m mVar, GetCredentialException getCredentialException) {
            mVar.a(getCredentialException);
        }

        public final void b() {
            Executor executor = this.f91281c;
            final d6.m<c0, GetCredentialException> mVar = this.f91282d;
            final GetCredentialException getCredentialException = this.f91283e;
            executor.execute(new Runnable() { // from class: m6.h
                @Override // java.lang.Runnable
                public final void run() {
                    c.h.c(mVar, getCredentialException);
                }
            });
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"m6/c$i", "Landroid/os/ResultReceiver;", "", StatusResponse.RESULT_CODE, "Landroid/os/Bundle;", "resultData", "Ljn0/h0;", "onReceiveResult", "(ILandroid/os/Bundle;)V", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            if (c.this.f(resultData, new a(h6.a.INSTANCE), c.this.s(), c.this.r(), c.this.cancellationSignal)) {
                return;
            }
            c.this.t(resultData.getInt("ACTIVITY_REQUEST_CODE"), resultCode, (Intent) resultData.getParcelable("RESULT_DATA"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        s.k(context, "context");
        this.context = context;
        this.resultReceiver = new i(new Handler(Looper.getMainLooper()));
    }

    private final GetCredentialException q(Throwable e11) {
        if (e11 instanceof com.google.android.gms.identitycredentials.GetCredentialException) {
            return f6.a.a(((com.google.android.gms.identitycredentials.GetCredentialException) e11).getType(), e11.getMessage());
        }
        if (!(e11 instanceof ApiException)) {
            return new GetCredentialUnknownException("Get digital credential failed, failure: " + e11);
        }
        int statusCode = ((ApiException) e11).getStatusCode();
        if (statusCode == 16) {
            return new GetCredentialCancellationException(e11.getMessage());
        }
        if (h6.a.INSTANCE.d().contains(Integer.valueOf(statusCode))) {
            return new GetCredentialInterruptedException(e11.getMessage());
        }
        return new GetCredentialUnknownException("Get digital credential failed, failure: " + e11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(wn0.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(c cVar, CancellationSignal cancellationSignal, Executor executor, d6.m mVar, Exception e11) {
        s.k(e11, "e");
        h6.b.e(cancellationSignal, new h(executor, mVar, cVar.q(e11)));
    }

    public GetCredentialRequest p(b0 request) {
        s.k(request, "request");
        ArrayList arrayList = new ArrayList();
        for (o oVar : request.a()) {
            if (oVar instanceof e0) {
                arrayList.add(new CredentialOption(oVar.getType(), oVar.getRequestData(), oVar.getCandidateQueryData(), ((e0) oVar).getRequestJson(), "", ""));
            }
        }
        return new GetCredentialRequest(arrayList, b0.INSTANCE.a(request), request.getOrigin(), new ResultReceiver(null));
    }

    public final d6.m<c0, GetCredentialException> r() {
        d6.m<c0, GetCredentialException> mVar = this.callback;
        if (mVar != null) {
            return mVar;
        }
        s.B("callback");
        return null;
    }

    public final Executor s() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        s.B("executor");
        return null;
    }

    public final void t(int uniqueRequestCode, int resultCode, Intent data) {
        h6.a.Companion companion = h6.a.INSTANCE;
        if (uniqueRequestCode != companion.b()) {
            Log.w("DigitalCredentialClient", "Returned request code " + companion.b() + " which  does not match what was given " + uniqueRequestCode);
            return;
        }
        if (h6.b.h(resultCode, b.f91272c, new C1945c(), this.cancellationSignal)) {
            return;
        }
        if (data == null) {
            h6.b.e(this.cancellationSignal, new d());
            return;
        }
        o6.a.Companion companion2 = o6.a.INSTANCE;
        c0 c0VarB = companion2.b(data);
        if (c0VarB != null) {
            h6.b.e(this.cancellationSignal, new e(c0VarB));
        } else {
            h6.b.e(this.cancellationSignal, new f(companion2.a(data)));
        }
    }

    public void u(b0 request, final d6.m<c0, GetCredentialException> callback, final Executor executor, final CancellationSignal cancellationSignal) {
        s.k(request, "request");
        s.k(callback, "callback");
        s.k(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        x(callback);
        y(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.a(cancellationSignal)) {
            return;
        }
        Task<PendingGetCredentialHandle> credential = IdentityCredentialManager.INSTANCE.getClient(this.context).getCredential(p(request));
        final g gVar = new g(cancellationSignal, this);
        credential.addOnSuccessListener(new OnSuccessListener() { // from class: m6.a
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                c.v(gVar, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: m6.b
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                c.w(this.f91262a, cancellationSignal, executor, callback, exc);
            }
        });
    }

    public final void x(d6.m<c0, GetCredentialException> mVar) {
        s.k(mVar, "<set-?>");
        this.callback = mVar;
    }

    public final void y(Executor executor) {
        s.k(executor, "<set-?>");
        this.executor = executor;
    }
}
