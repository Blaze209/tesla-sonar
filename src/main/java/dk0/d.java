package dk0;

import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.f;
import com.tesla.domain.model.DataRestrictedCountry;
import java.util.Set;
import java.util.concurrent.Callable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001b"}, d2 = {"Ldk0/d;", "Lek0/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "serviceName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "name", "Landroid/os/Bundle;", "parameters", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "f", "(Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;", "", "enabled", "h", "(Ljava/lang/Boolean;)Lcom/google/android/gms/tasks/Task;", "properties", "j", "(Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;", "e", "()Z", "Z", "isDataRestricted", "isRestrictedCountry", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends ek0.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isDataRestricted;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isRestrictedCountry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String serviceName) {
        super(context, serviceName);
        s.k(context, "context");
        s.k(serviceName, "serviceName");
        DataRestrictedCountry.Companion companion = DataRestrictedCountry.INSTANCE;
        this.isDataRestricted = companion.c(context);
        this.isRestrictedCountry = companion.b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void g(d dVar, String str, Bundle bundle) {
        if (dVar.isDataRestricted) {
            return null;
        }
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(dVar.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String());
        s.h(str);
        firebaseAnalytics.a(str, bundle);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i(d dVar, Boolean bool) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(dVar.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String());
        s.h(bool);
        boolean z11 = false;
        firebaseAnalytics.b(bool.booleanValue() && !dVar.isDataRestricted);
        f fVarL = f.l();
        if (bool.booleanValue() && !dVar.isDataRestricted) {
            z11 = true;
        }
        fVarL.y(z11);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void k(d dVar, Bundle bundle) {
        if (dVar.isDataRestricted) {
            return null;
        }
        Set<String> setKeySet = bundle.keySet();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(dVar.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String());
        s.j(firebaseAnalytics, "getInstance(...)");
        for (String str : setKeySet) {
            Object obj = bundle.get(str);
            s.i(obj, "null cannot be cast to non-null type kotlin.String");
            firebaseAnalytics.d(str, (String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsRestrictedCountry() {
        return this.isRestrictedCountry;
    }

    public final Task<Void> f(final String name, final Bundle parameters) {
        Task<Void> taskCall = Tasks.call(new Callable() { // from class: dk0.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.g(this.f60706a, name, parameters);
            }
        });
        s.j(taskCall, "call(...)");
        return taskCall;
    }

    public final Task<Void> h(final Boolean enabled) {
        Task<Void> taskCall = Tasks.call(new Callable() { // from class: dk0.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.i(this.f60702a, enabled);
            }
        });
        s.j(taskCall, "call(...)");
        return taskCall;
    }

    public final Task<Void> j(final Bundle properties) {
        s.k(properties, "properties");
        Task<Void> taskCall = Tasks.call(new Callable() { // from class: dk0.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.k(this.f60704a, properties);
            }
        });
        s.j(taskCall, "call(...)");
        return taskCall;
    }
}
