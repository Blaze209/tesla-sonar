package re;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"Lre/c;", "Lme/b;", "<init>", "()V", "", "message", "", "throwable", "c", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;", "", "priority", "tag", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(ILjava/lang/String;Ljava/lang/String;)V", "Lme/a;", "level", "", "a", "(Lme/a;)Z", "b", "(Lme/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lme/a;", "minLogLevel", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements me.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private me.a minLogLevel = me.a.NONE;

    private final String c(String message, Throwable throwable) {
        if (throwable == null) {
            return message;
        }
        return message + ": " + Log.getStackTraceString(throwable);
    }

    @SuppressLint({"NotAdyenLog"})
    private final void d(int priority, String tag, String message) {
        if (priority != me.a.NONE.getPriority()) {
            if (priority == 7) {
                Log.wtf(tag, message);
            } else {
                Log.println(priority, tag, message);
            }
        }
    }

    @Override // me.b
    public boolean a(me.a level) {
        s.k(level, "level");
        return level.getPriority() >= this.minLogLevel.getPriority();
    }

    @Override // me.b
    public void b(me.a level, String tag, String message, Throwable throwable) {
        String strSubstring;
        s.k(level, "level");
        s.k(tag, "tag");
        s.k(message, "message");
        int i11 = 0;
        if (tag.length() > 23 && Build.VERSION.SDK_INT < 26) {
            tag = tag.substring(0, 23);
            s.j(tag, "substring(...)");
        }
        String strC = c(message, throwable);
        if (strC.length() < 2048) {
            d(level.getPriority(), tag, strC);
            return;
        }
        int length = strC.length() / 2048;
        if (length < 0) {
            return;
        }
        while (true) {
            if (i11 != length) {
                strSubstring = strC.substring(i11 * 2048, (i11 + 1) * 2048);
                s.j(strSubstring, "substring(...)");
            } else {
                strSubstring = strC.substring(i11 * 2048);
                s.j(strSubstring, "substring(...)");
            }
            d(level.getPriority(), tag + "-" + i11, strSubstring);
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }
}
