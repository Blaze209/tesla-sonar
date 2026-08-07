package expo.modules.core.logging;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import io0.e;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0011J!\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0017\u0010\u0015J!\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u0018¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lexpo/modules/core/logging/Logger;", "", "", "Lexpo/modules/core/logging/LogHandler;", "logHandlers", "<init>", "(Ljava/util/List;)V", "Lexpo/modules/core/logging/LogType;", "type", "", "message", "", "cause", "Ljn0/h0;", "log", "(Lexpo/modules/core/logging/LogType;Ljava/lang/String;Ljava/lang/Throwable;)V", "trace", "(Ljava/lang/String;)V", "debug", "info", "warn", "(Ljava/lang/String;Ljava/lang/Throwable;)V", AnalyticsAttribute.Error, "fatal", "Lkotlin/Function1;", "", "logFormatter", "Lexpo/modules/core/logging/LoggerTimer;", "startTimer", "(Lwn0/l;)Lexpo/modules/core/logging/LoggerTimer;", "Ljava/util/List;", "", "minOSLevel", "I", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Logger {
    private final List<LogHandler> logHandlers;
    private final int minOSLevel;

    /* JADX WARN: Multi-variable type inference failed */
    public Logger(List<? extends LogHandler> logHandlers) {
        s.k(logHandlers, "logHandlers");
        this.logHandlers = logHandlers;
        this.minOSLevel = 4;
    }

    public static /* synthetic */ void error$default(Logger logger, String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        logger.error(str, th2);
    }

    public static /* synthetic */ void fatal$default(Logger logger, String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        logger.fatal(str, th2);
    }

    private final void log(LogType type, String message, Throwable cause) {
        if (LogType.INSTANCE.toOSLogType(type) >= this.minOSLevel) {
            Iterator<T> it = this.logHandlers.iterator();
            while (it.hasNext()) {
                ((LogHandler) it.next()).log$expo_modules_core_release(type, message, cause);
            }
        }
    }

    static /* synthetic */ void log$default(Logger logger, LogType logType, String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        logger.log(logType, str, th2);
    }

    public static /* synthetic */ void warn$default(Logger logger, String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        logger.warn(str, th2);
    }

    public final void debug(String message) {
        s.k(message, "message");
        log$default(this, LogType.Debug, message, null, 4, null);
    }

    public final void error(String message, Throwable cause) {
        s.k(message, "message");
        log(LogType.Error, message, cause);
    }

    public final void fatal(String message, Throwable cause) {
        s.k(message, "message");
        log(LogType.Fatal, message, cause);
    }

    public final void info(String message) {
        s.k(message, "message");
        log$default(this, LogType.Info, message, null, 4, null);
    }

    public final LoggerTimer startTimer(final l<? super Long, String> logFormatter) {
        s.k(logFormatter, "logFormatter");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        return new LoggerTimer() { // from class: expo.modules.core.logging.Logger.startTimer.1
            @Override // expo.modules.core.logging.LoggerTimer
            /* JADX INFO: renamed from: stop-UwyO8pc, reason: not valid java name */
            public long mo161stopUwyO8pc() {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                Logger.log$default(this, LogType.Timer, logFormatter.invoke(Long.valueOf(jCurrentTimeMillis2)), null, 4, null);
                return io0.d.t(jCurrentTimeMillis2, e.MILLISECONDS);
            }
        };
    }

    public final void trace(String message) {
        s.k(message, "message");
        log$default(this, LogType.Trace, message, null, 4, null);
    }

    public final void warn(String message, Throwable cause) {
        s.k(message, "message");
        log(LogType.Warn, message, cause);
    }
}
