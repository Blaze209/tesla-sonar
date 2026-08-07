package wq0;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Method f122315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadMode f122316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Class<?> f122317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f122318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f122319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f122320f;

    public n(Method method, Class<?> cls, ThreadMode threadMode, int i11, boolean z11) {
        this.f122315a = method;
        this.f122316b = threadMode;
        this.f122317c = cls;
        this.f122318d = i11;
        this.f122319e = z11;
    }

    private synchronized void a() {
        if (this.f122320f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f122315a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f122315a.getName());
            sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb2.append(this.f122317c.getName());
            this.f122320f = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        a();
        n nVar = (n) obj;
        nVar.a();
        return this.f122320f.equals(nVar.f122320f);
    }

    public int hashCode() {
        return this.f122315a.hashCode();
    }
}
