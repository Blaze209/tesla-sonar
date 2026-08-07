package expo.modules.core.logging;

import android.util.Log;
import ch.qos.logback.classic.net.SyslogAppender;
import jn0.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0010¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/core/logging/OSLogHandler;", "Lexpo/modules/core/logging/LogHandler;", "", "category", "<init>", "(Ljava/lang/String;)V", "Lexpo/modules/core/logging/LogType;", "type", "message", "", "cause", "Ljn0/h0;", "log$expo_modules_core_release", "(Lexpo/modules/core/logging/LogType;Ljava/lang/String;Ljava/lang/Throwable;)V", "log", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OSLogHandler extends LogHandler {
    private final String category;

    public OSLogHandler(String category) {
        s.k(category, "category");
        this.category = category;
    }

    public final String getCategory() {
        return this.category;
    }

    @Override // expo.modules.core.logging.LogHandler
    public void log$expo_modules_core_release(LogType type, String message, Throwable cause) {
        s.k(type, "type");
        s.k(message, "message");
        if (OSLogHandlerKt.isAndroid) {
            int oSLogType = LogType.INSTANCE.toOSLogType(type);
            if (oSLogType == 3) {
                Log.d(this.category, message, cause);
                return;
            }
            if (oSLogType == 4) {
                Log.i(this.category, message, cause);
                return;
            }
            if (oSLogType == 5) {
                Log.w(this.category, message, cause);
                return;
            } else if (oSLogType == 6) {
                Log.e(this.category, message, cause);
                return;
            } else {
                if (oSLogType != 7) {
                    return;
                }
                Log.e(this.category, message, cause);
                return;
            }
        }
        System.out.println((Object) ("[" + type.getType() + "] " + this.category + SyslogAppender.DEFAULT_STACKTRACE_PATTERN + message));
        if (cause != null) {
            System.out.println((Object) (LoggerUtilsKt.localizedMessageWithCauseLocalizedMessage(cause) + "\n" + g.b(cause)));
        }
    }
}
