package tb0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltb0/d;", "", "<init>", "()V", "Ltb0/e;", "b", "()Ltb0/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "a", "(Landroid/content/Context;)Ltb0/e;", "datasource_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f113112a = new d();

    private d() {
    }

    public final e a(Context context) {
        s.k(context, "context");
        c.Companion companion = c.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        return companion.a(applicationContext);
    }

    public final e b() {
        return f.INSTANCE.a();
    }
}
