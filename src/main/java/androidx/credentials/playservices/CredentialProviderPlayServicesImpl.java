package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import d6.b0;
import d6.c0;
import d6.e0;
import d6.g0;
import d6.h;
import d6.i0;
import d6.m;
import d6.o;
import d6.p;
import java.util.Iterator;
import java.util.concurrent.Executor;
import jn0.h0;
import m6.l;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJE\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001fJ?\u0010#\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\"0\u0010H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R(\u0010'\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00061"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Ld6/p;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "minApkVersion", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "Ld6/b0;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Ld6/m;", "Ld6/c0;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Ljn0/h0;", "onGetCredential", "(Landroid/content/Context;Ld6/b0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ld6/m;)V", "Ld6/b;", "Ld6/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Ld6/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ld6/m;)V", "", "isAvailableOnDevice", "()Z", "(I)Z", "Ld6/a;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Ld6/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ld6/m;)V", "Landroid/content/Context;", "Lcom/google/android/gms/common/GoogleApiAvailability;", "googleApiAvailability", "Lcom/google/android/gms/common/GoogleApiAvailability;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/GoogleApiAvailability;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/GoogleApiAvailability;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CredentialProviderPlayServicesImpl implements p {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private GoogleApiAvailability googleApiAvailability;

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$a;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", "Ljn0/h0;", "callback", "b", "(Landroid/os/CancellationSignal;Lwn0/a;)V", "", "a", "(Landroid/os/CancellationSignal;)Z", "Ld6/b0;", "request", "e", "(Ld6/b0;)Z", DateTokenConverter.CONVERTER_KEY, "c", "", "MIN_GMS_APK_VERSION", "I", "MIN_GMS_APK_VERSION_DIGITAL_CRED", "MIN_GMS_APK_VERSION_RESTORE_CRED", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public final void b(CancellationSignal cancellationSignal, wn0.a<h0> callback) {
            s.k(callback, "callback");
            if (a(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean c(b0 request) {
            s.k(request, "request");
            Iterator<o> it = request.a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof e0) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(b0 request) {
            s.k(request, "request");
            Iterator<o> it = request.a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof g0) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e(b0 request) {
            s.k(request, "request");
            Iterator<o> it = request.a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof ys.b) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f7983c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<Void, ClearCredentialException> f7984d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n0<ClearCredentialException> f7985e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Executor executor, m<Void, ClearCredentialException> mVar, n0<ClearCredentialException> n0Var) {
            super(0);
            this.f7983c = executor;
            this.f7984d = mVar;
            this.f7985e = n0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(m mVar, n0 n0Var) {
            mVar.a(n0Var.f86529a);
        }

        public final void b() {
            Executor executor = this.f7983c;
            final m<Void, ClearCredentialException> mVar = this.f7984d;
            final n0<ClearCredentialException> n0Var = this.f7985e;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.a
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.b.c(mVar, n0Var);
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
    static final class c extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Exception f7986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Executor f7987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m<Void, ClearCredentialException> f7988e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Exception exc, Executor executor, m<Void, ClearCredentialException> mVar) {
            super(0);
            this.f7986c = exc;
            this.f7987d = executor;
            this.f7988e = mVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(m mVar, Exception exc) {
            mVar.a(new ClearCredentialUnknownException(exc.getMessage()));
        }

        public final void b() {
            Log.w(CredentialProviderPlayServicesImpl.TAG, "During clear credential sign out failed with " + this.f7986c);
            Executor executor = this.f7987d;
            final m<Void, ClearCredentialException> mVar = this.f7988e;
            final Exception exc = this.f7986c;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.b
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.c.c(mVar, exc);
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
    static final class d extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f7989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<d6.c, CreateCredentialException> f7990d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Executor executor, m<d6.c, CreateCredentialException> mVar) {
            super(0);
            this.f7989c = executor;
            this.f7990d = mVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(m mVar) {
            mVar.a(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        }

        public final void b() {
            Executor executor = this.f7989c;
            final m<d6.c, CreateCredentialException> mVar = this.f7990d;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.c
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.d.c(mVar);
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

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f7991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<c0, GetCredentialException> f7992d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Executor executor, m<c0, GetCredentialException> mVar) {
            super(0);
            this.f7991c = executor;
            this.f7992d = mVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(m mVar) {
            mVar.a(new GetCredentialProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
        }

        public final void b() {
            Executor executor = this.f7991c;
            final m<c0, GetCredentialException> mVar = this.f7992d;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.d
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.e.c(mVar);
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

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f7993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<c0, GetCredentialException> f7994d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Executor executor, m<c0, GetCredentialException> mVar) {
            super(0);
            this.f7993c = executor;
            this.f7994d = mVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(m mVar) {
            mVar.a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        }

        public final void b() {
            Executor executor = this.f7993c;
            final m<c0, GetCredentialException> mVar = this.f7994d;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.e
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.f.c(mVar);
                }
            });
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        s.k(context, "context");
        this.context = context;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        s.j(googleApiAvailability, "getInstance(...)");
        this.googleApiAvailability = googleApiAvailability;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.isGooglePlayServicesAvailable(context, minApkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.credentials.exceptions.ClearCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, androidx.credentials.exceptions.ClearCredentialUnknownException] */
    public static final void onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, m mVar, Exception e11) {
        s.k(e11, "e");
        Log.w(TAG, "Clearing restore credential failed", e11);
        n0 n0Var = new n0();
        n0Var.f86529a = new ClearCredentialUnknownException("Clear restore credential failed for unknown reason.");
        if ((e11 instanceof ApiException) && ((ApiException) e11).getStatusCode() == 40201) {
            n0Var.f86529a = new ClearCredentialUnknownException("The restore credential internal service had a failure.");
        }
        INSTANCE.b(cancellationSignal, new b(executor, mVar, n0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$4(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, m mVar, Exception e11) {
        s.k(e11, "e");
        INSTANCE.b(cancellationSignal, new c(e11, executor, mVar));
    }

    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // d6.p
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onClearCredential(d6.a request, CancellationSignal cancellationSignal, Executor executor, m<Void, ClearCredentialException> callback) {
        s.k(request, "request");
        s.k(executor, "executor");
        s.k(callback, "callback");
        if (!INSTANCE.a(cancellationSignal)) {
            throw null;
        }
    }

    public void onCreateCredential(Context context, d6.b request, CancellationSignal cancellationSignal, Executor executor, m<d6.c, CreateCredentialException> callback) {
        s.k(context, "context");
        s.k(request, "request");
        s.k(executor, "executor");
        s.k(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.a(cancellationSignal)) {
            return;
        }
        if (request instanceof d6.d) {
            j6.a.INSTANCE.a(context).q((d6.d) request, callback, executor, cancellationSignal);
            return;
        }
        if (request instanceof d6.f) {
            k6.b.INSTANCE.a(context).u((d6.f) request, callback, executor, cancellationSignal);
        } else {
            if (!(request instanceof h)) {
                throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
            }
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new l6.d(context).n((h) request, callback, executor, cancellationSignal);
            } else {
                companion.b(cancellationSignal, new d(executor, callback));
            }
        }
    }

    @Override // d6.p
    public /* bridge */ /* synthetic */ void onGetCredential(Context context, i0 i0Var, CancellationSignal cancellationSignal, Executor executor, m mVar) {
        super.onGetCredential(context, i0Var, cancellationSignal, executor, (m<c0, GetCredentialException>) mVar);
    }

    @Override // d6.p
    public /* bridge */ /* synthetic */ void onPrepareCredential(b0 b0Var, CancellationSignal cancellationSignal, Executor executor, m mVar) {
        super.onPrepareCredential(b0Var, cancellationSignal, executor, mVar);
    }

    public final void setGoogleApiAvailability(GoogleApiAvailability googleApiAvailability) {
        s.k(googleApiAvailability, "<set-?>");
        this.googleApiAvailability = googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z11 = iIsGooglePlayServicesAvailable == 0;
        if (!z11) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(iIsGooglePlayServicesAvailable));
        }
        return z11;
    }

    @Override // d6.p
    public void onGetCredential(Context context, b0 request, CancellationSignal cancellationSignal, Executor executor, m<c0, GetCredentialException> callback) {
        s.k(context, "context");
        s.k(request, "request");
        s.k(executor, "executor");
        s.k(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.a(cancellationSignal)) {
            return;
        }
        if (companion.c(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                new m6.c(context).u(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.b(cancellationSignal, new e(executor, callback));
                return;
            }
        }
        if (companion.d(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new l(context).n(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.b(cancellationSignal, new f(executor, callback));
                return;
            }
        }
        if (companion.e(request)) {
            new n6.a(context).r(request, callback, executor, cancellationSignal);
        } else {
            new i6.b(context).r(request, callback, executor, cancellationSignal);
        }
    }
}
