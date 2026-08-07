package na0;

import android.content.Context;
import android.content.pm.PackageInfo;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.p0;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.f;
import com.rnmaps.maps.u;
import com.tesla.TeslaV4.BuildConfig;
import com.tesla.domain.model.DataRestrictedCountry;
import com.tesla.logging.g;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import jn0.h0;
import ma0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"Lna0/c;", "Lna0/a;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)V", "c", "", "Lcom/facebook/react/p0;", "b", "()Ljava/util/List;", "", "a", "(Landroid/content/Context;)Z", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Z", "initialized", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f93688a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("RegionPackageManager");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static boolean initialized;

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Context context, FirebaseCrashlytics firebaseCrashlytics) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss.SSS", Locale.US);
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            Calendar calendar = Calendar.getInstance();
            s.j(calendar, "getInstance(...)");
            String str = packageInfo.versionName;
            if (str != null) {
                firebaseCrashlytics.setCustomKey("version_name", str);
            }
            firebaseCrashlytics.setCustomKey("git_hash", qb0.a.INSTANCE.b().t());
            firebaseCrashlytics.setCustomKey("binary_built", g(BuildConfig.BINARY_BUILD_TIMESTAMP, calendar, simpleDateFormat));
            firebaseCrashlytics.setCustomKey("first_install", g(packageInfo.firstInstallTime, calendar, simpleDateFormat));
            firebaseCrashlytics.setCustomKey("last_update", g(packageInfo.lastUpdateTime, calendar, simpleDateFormat));
            return firebaseCrashlytics;
        } catch (Exception e11) {
            logger.d("Error setting build properties to firebase", e11);
            return h0.f84049a;
        }
    }

    private static final String g(long j11, Calendar calendar, SimpleDateFormat simpleDateFormat) {
        calendar.setTimeInMillis(j11);
        String str = simpleDateFormat.format(calendar.getTime());
        s.j(str, "format(...)");
        return str;
    }

    @Override // na0.a
    public boolean a(Context context) {
        s.k(context, "context");
        return false;
    }

    @Override // na0.a
    public List<p0> b() {
        return v.p(new u(), new e());
    }

    @Override // na0.a
    public void c(final Context context) {
        s.k(context, "context");
        a.b.a(this, context);
        try {
            final FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            s.j(firebaseCrashlytics, "getInstance(...)");
            if (DataRestrictedCountry.INSTANCE.c(context)) {
                logger.j("Data restricted country detected, not enabling firebase crashlytics");
                firebaseCrashlytics.setCrashlyticsCollectionEnabled(false);
            } else {
                firebaseCrashlytics.setCrashlyticsCollectionEnabled(true);
            }
            io.reactivex.rxjava3.core.b.f(new Callable() { // from class: na0.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.f(context, firebaseCrashlytics);
                }
            }).k(vm0.a.c()).g();
        } catch (Exception e11) {
            logger.d("error initializing after realm", e11);
        }
    }

    @Override // na0.a
    public void d(Context context) {
        s.k(context, "context");
        if (initialized) {
            return;
        }
        initialized = true;
        try {
            f.q(context);
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            s.j(firebaseCrashlytics, "getInstance(...)");
            firebaseCrashlytics.setCrashlyticsCollectionEnabled(true);
        } catch (Exception e11) {
            logger.d("Error during initialization of region package manager", e11);
        }
    }
}
