package wo;

import android.content.Context;
import android.content.ContextWrapper;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lwo/a;", "", "<init>", "()V", "T", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Class;", "clazz", "a", "(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f122101a = new a();

    private a() {
    }

    public static final <T> T a(Context context, Class<? extends T> clazz) {
        Context baseContext;
        s.k(clazz, "clazz");
        Object obj = context;
        while (!clazz.isInstance(obj)) {
            if (!(obj instanceof ContextWrapper) || obj == (baseContext = obj.getBaseContext())) {
                return null;
            }
            obj = (T) baseContext;
        }
        return (T) obj;
    }
}
