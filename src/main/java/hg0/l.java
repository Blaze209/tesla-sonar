package hg0;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u0012"}, d2 = {"Lhg0/l;", "Lhg0/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "a", "()Z", "Landroid/content/Context;", "", "b", "()Ljava/lang/String;", "manufacturer", "c", "model", DateTokenConverter.CONVERTER_KEY, "versionRelease", "device_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public l(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
    }

    @Override // hg0.b
    public boolean a() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    @Override // hg0.b
    public String b() {
        String MANUFACTURER = Build.MANUFACTURER;
        p013kotlin.jvm.internal.s.j(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    @Override // hg0.b
    public String c() {
        String MODEL = Build.MODEL;
        p013kotlin.jvm.internal.s.j(MODEL, "MODEL");
        return MODEL;
    }

    @Override // hg0.b
    public String d() {
        String RELEASE = Build.VERSION.RELEASE;
        p013kotlin.jvm.internal.s.j(RELEASE, "RELEASE");
        return RELEASE;
    }
}
