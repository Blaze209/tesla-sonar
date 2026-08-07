package p80;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lp80/k;", "Lv80/d;", "Lp80/j;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "()Lp80/j;", "Landroid/content/Context;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k implements v80.d<HardwareId> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public k(Context context) {
        s.k(context, "context");
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
    }

    @Override // v80.d
    @SuppressLint({"HardwareIds"})
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HardwareId get() {
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        return new HardwareId(string);
    }
}
