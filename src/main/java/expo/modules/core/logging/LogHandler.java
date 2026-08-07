package expo.modules.core.logging;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lexpo/modules/core/logging/LogHandler;", "", "<init>", "()V", "Lexpo/modules/core/logging/LogType;", "type", "", "message", "", "cause", "Ljn0/h0;", "log$expo_modules_core_release", "(Lexpo/modules/core/logging/LogType;Ljava/lang/String;Ljava/lang/Throwable;)V", "log", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LogHandler {
    public static /* synthetic */ void log$expo_modules_core_release$default(LogHandler logHandler, LogType logType, String str, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        logHandler.log$expo_modules_core_release(logType, str, th2);
    }

    public abstract void log$expo_modules_core_release(LogType type, String message, Throwable cause);
}
