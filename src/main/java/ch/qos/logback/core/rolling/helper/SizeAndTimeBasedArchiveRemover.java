package ch.qos.logback.core.rolling.helper;

/* JADX INFO: loaded from: classes3.dex */
public class SizeAndTimeBasedArchiveRemover extends TimeBasedArchiveRemover {
    public SizeAndTimeBasedArchiveRemover(FileNamePattern fileNamePattern, RollingCalendar rollingCalendar, FileProvider fileProvider) {
        super(fileNamePattern, rollingCalendar, fileProvider);
    }
}
