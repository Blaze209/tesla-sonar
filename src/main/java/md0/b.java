package md0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ie0.e0;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmd0/b;", "", "<init>", "()V", "Lio/sentry/android/core/SentryAndroidOptions;", "options", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "b", "(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;)V", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f91832a = new b();

    private b() {
    }

    public static final String a(Context context) {
        s.k(context, "context");
        String strB = e0.b(context);
        String strU1 = (strB == null || !t.h0(strB, ":", false, 2, null)) ? "main" : t.u1(strB, CoreConstants.COLON_CHAR, null, 2, null);
        File file = new File(context.getCacheDir(), "sentry-" + strU1);
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath = file.getAbsolutePath();
        s.j(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public static final void b(SentryAndroidOptions options, Context context) {
        s.k(options, "options");
        s.k(context, "context");
        options.setCacheDirPath(a(context));
    }
}
