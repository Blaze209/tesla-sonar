package hg0;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lhg0/j;", "Lhg0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()Landroid/content/SharedPreferences;", "prefs", "", "value", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "deviceId", "device_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy prefs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String deviceId;

    public j(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
        this.prefs = jn0.m.b(new wn0.a() { // from class: hg0.i
            @Override // wn0.a
            public final Object invoke() {
                return j.e(this.f72770a);
            }
        });
    }

    private final SharedPreferences d() {
        return (SharedPreferences) this.prefs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences e(j jVar) {
        return jVar.context.getSharedPreferences("com.withpersona.sdk2.prefs", 0);
    }

    @Override // hg0.a
    public void a(String str) {
        if ((!p013kotlin.jvm.internal.s.f(str, this.deviceId) ? str : null) != null) {
            this.deviceId = str;
            d().edit().putString("DEVICE_ID", this.deviceId).apply();
        }
    }

    @Override // hg0.a
    public String b() {
        String str = this.deviceId;
        return str == null ? d().getString("DEVICE_ID", null) : str;
    }
}
