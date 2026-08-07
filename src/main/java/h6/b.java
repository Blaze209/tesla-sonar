package h6;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import d6.m;
import java.util.concurrent.Executor;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u0000 \u0018*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u0001*\b\b\u0003\u0010\u0005*\u00020\u0001*\b\b\u0004\u0010\u0006*\u00020\u00012\u00020\u0007:\u0001\u001cB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ[\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00028\u00040\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lh6/b;", "", "T1", "T2", "R2", "R1", "E1", "Lh6/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "resultData", "Lkotlin/Function2;", "", "conversionFn", "Ljava/util/concurrent/Executor;", "executor", "Ld6/m;", "callback", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "f", "(Landroid/os/Bundle;Lwn0/p;Ljava/util/concurrent/Executor;Ld6/m;Landroid/os/CancellationSignal;)Z", "e", "Landroid/content/Context;", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class b<T1, T2, R2, R1, E1> extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: h6.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016JW\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0005¢\u0006\u0004\b\u0018\u0010\u0011J'\u0010\u001a\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0005¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lh6/b$a;", "", "<init>", "()V", "", StatusResponse.RESULT_CODE, "Lkotlin/Function2;", "Landroid/os/CancellationSignal;", "Lkotlin/Function0;", "Ljn0/h0;", "cancelOnError", "Lkotlin/Function1;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onError", "cancellationSignal", "", DateTokenConverter.CONVERTER_KEY, "(ILwn0/p;Lwn0/l;Landroid/os/CancellationSignal;)Z", "", "c", "(I)Ljava/lang/String;", "b", "()Ljava/lang/String;", "Landroidx/credentials/exceptions/GetCredentialException;", "e", "onResultOrException", "a", "(Landroid/os/CancellationSignal;Lwn0/a;)V", "ERROR_MESSAGE_START_ACTIVITY_FAILED", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: h6.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T1", "T2", "R2", "R1", "E1", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class C1481a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l<CreateCredentialException, h0> f70905c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ n0<CreateCredentialException> f70906d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1481a(l<? super CreateCredentialException, h0> lVar, n0<CreateCredentialException> n0Var) {
                super(0);
                this.f70905c = lVar;
                this.f70906d = n0Var;
            }

            public final void b() {
                this.f70905c.invoke(this.f70906d.f86529a);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: h6.b$a$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T1", "T2", "R2", "R1", "E1", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class C1482b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l<GetCredentialException, h0> f70907c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ n0<GetCredentialException> f70908d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1482b(l<? super GetCredentialException, h0> lVar, n0<GetCredentialException> n0Var) {
                super(0);
                this.f70907c = lVar;
                this.f70908d = n0Var;
            }

            public final void b() {
                this.f70907c.invoke(this.f70908d.f86529a);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        protected final void a(CancellationSignal cancellationSignal, wn0.a<h0> onResultOrException) {
            s.k(onResultOrException, "onResultOrException");
            if (CredentialProviderPlayServicesImpl.INSTANCE.a(cancellationSignal)) {
                return;
            }
            onResultOrException.invoke();
        }

        public final String b() {
            return "activity is cancelled by the user.";
        }

        public final String c(int resultCode) {
            return "activity with result code: " + resultCode + " indicating not RESULT_OK";
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.credentials.exceptions.CreateCredentialCancellationException] */
        protected final boolean d(int resultCode, p<? super CancellationSignal, ? super wn0.a<h0>, h0> cancelOnError, l<? super CreateCredentialException, h0> onError, CancellationSignal cancellationSignal) {
            s.k(cancelOnError, "cancelOnError");
            s.k(onError, "onError");
            if (resultCode == -1) {
                return false;
            }
            n0 n0Var = new n0();
            n0Var.f86529a = new CreateCredentialUnknownException(c(resultCode));
            if (resultCode == 0) {
                n0Var.f86529a = new CreateCredentialCancellationException(b());
            }
            cancelOnError.invoke(cancellationSignal, new C1481a(onError, n0Var));
            return true;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.credentials.exceptions.GetCredentialCancellationException] */
        protected final boolean e(int resultCode, p<? super CancellationSignal, ? super wn0.a<h0>, h0> cancelOnError, l<? super GetCredentialException, h0> onError, CancellationSignal cancellationSignal) {
            s.k(cancelOnError, "cancelOnError");
            s.k(onError, "onError");
            if (resultCode == -1) {
                return false;
            }
            n0 n0Var = new n0();
            n0Var.f86529a = new GetCredentialUnknownException(c(resultCode));
            if (resultCode == 0) {
                n0Var.f86529a = new GetCredentialCancellationException(b());
            }
            cancelOnError.invoke(cancellationSignal, new C1482b(onError, n0Var));
            return true;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: h6.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T1", "T2", "R2", "R1", "E1", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class C1483b extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f70909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<R1, E1> f70910d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ E1 f70911e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1483b(Executor executor, m<R1, E1> mVar, E1 e11) {
            super(0);
            this.f70909c = executor;
            this.f70910d = mVar;
            this.f70911e = e11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(m mVar, Object obj) {
            mVar.a(obj);
        }

        public final void b() {
            Executor executor = this.f70909c;
            final m<R1, E1> mVar = this.f70910d;
            final E1 e11 = this.f70911e;
            executor.execute(new Runnable() { // from class: h6.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.C1483b.c(mVar, e11);
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
    public b(Context context) {
        super(context);
        s.k(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void e(CancellationSignal cancellationSignal, wn0.a<h0> aVar) {
        INSTANCE.a(cancellationSignal, aVar);
    }

    protected static final boolean g(int i11, p<? super CancellationSignal, ? super wn0.a<h0>, h0> pVar, l<? super CreateCredentialException, h0> lVar, CancellationSignal cancellationSignal) {
        return INSTANCE.d(i11, pVar, lVar, cancellationSignal);
    }

    protected static final boolean h(int i11, p<? super CancellationSignal, ? super wn0.a<h0>, h0> pVar, l<? super GetCredentialException, h0> lVar, CancellationSignal cancellationSignal) {
        return INSTANCE.e(i11, pVar, lVar, cancellationSignal);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean f(Bundle resultData, p<? super String, ? super String, ? extends E1> conversionFn, Executor executor, m<R1, E1> callback, CancellationSignal cancellationSignal) {
        s.k(resultData, "resultData");
        s.k(conversionFn, "conversionFn");
        s.k(executor, "executor");
        s.k(callback, "callback");
        if (!resultData.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        e(cancellationSignal, new C1483b(executor, callback, conversionFn.invoke(resultData.getString("EXCEPTION_TYPE"), resultData.getString("EXCEPTION_MESSAGE"))));
        return true;
    }
}
