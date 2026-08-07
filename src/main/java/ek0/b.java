package ek0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lek0/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "serviceName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "a", "Landroid/content/Context;", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, ExecutorService> f63023d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String serviceName;

    protected b(Context context, String serviceName) {
        s.k(context, "context");
        s.k(serviceName, "serviceName");
        this.context = context;
        this.serviceName = serviceName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Context getContext() {
        return this.context;
    }
}
