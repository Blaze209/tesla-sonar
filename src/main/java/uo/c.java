package uo;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.util.RCTLog;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Luo/c;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "message", "Ljn0/h0;", "e", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;)V", "a", "b", "(Ljava/lang/String;)V", "", "level", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;I)V", "c", "(I)Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f116493a = new c();

    private c() {
    }

    public static final void a(ReactContext context, String message) {
        s.k(message, "message");
        f116493a.d(context, message, 6);
        qk.a.m("ReactNative", message);
    }

    public static final void b(String message) {
        s.k(message, "message");
        qk.a.m("ReactNative", message);
    }

    private final String c(int level) {
        if (level == 2 || level == 3) {
            return "log";
        }
        if (level == 4 || level == 5) {
            return "warn";
        }
        return level != 6 ? "none" : AnalyticsAttribute.Error;
    }

    private final void d(ReactContext context, String message, int level) {
        if (level < 5 || context == null || !context.hasActiveReactInstance() || message == null) {
            return;
        }
        ((RCTLog) context.getJSModule(RCTLog.class)).logIfNoNativeHook(c(level), message);
    }

    public static final void e(ReactContext context, String message) {
        s.k(message, "message");
        f116493a.d(context, message, 5);
        qk.a.I("ReactNative", message);
    }
}
