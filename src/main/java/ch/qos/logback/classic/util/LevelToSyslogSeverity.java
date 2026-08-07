package ch.qos.logback.classic.util;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;

/* JADX INFO: loaded from: classes3.dex */
public class LevelToSyslogSeverity {
    public static int convert(ILoggingEvent iLoggingEvent) {
        Level level = iLoggingEvent.getLevel();
        int i11 = level.levelInt;
        if (i11 == 5000 || i11 == 10000) {
            return 7;
        }
        if (i11 == 20000) {
            return 6;
        }
        if (i11 == 30000) {
            return 4;
        }
        if (i11 == 40000) {
            return 3;
        }
        throw new IllegalArgumentException("Level " + level + " is not a valid level for a printing method");
    }
}
