package ch.qos.logback.classic.net.server;

import ch.qos.logback.core.net.HardenedObjectInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HardenedLoggingEventInputStream extends HardenedObjectInputStream {
    static final String ARRAY_PREFIX = "[L";

    public HardenedLoggingEventInputStream(InputStream inputStream) throws IOException {
        super(inputStream, getWhilelist());
    }

    public static List<String> getWhilelist() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ch.qos.logback.classic.spi.LoggingEventVO");
        arrayList.add("ch.qos.logback.classic.spi.LoggerContextVO");
        arrayList.add("ch.qos.logback.classic.spi.LoggerRemoteView");
        arrayList.add("ch.qos.logback.classic.spi.ThrowableProxyVO");
        arrayList.add("org.slf4j.helpers.BasicMarker");
        arrayList.add("ch.qos.logback.classic.Level");
        arrayList.add("ch.qos.logback.classic.Logger");
        arrayList.add("java.lang.StackTraceElement");
        arrayList.add("[Ljava.lang.StackTraceElement;");
        arrayList.add("ch.qos.logback.classic.spi.ThrowableProxy");
        arrayList.add("[Lch.qos.logback.classic.spi.ThrowableProxy;");
        arrayList.add("ch.qos.logback.classic.spi.IThrowableProxy");
        arrayList.add("[Lch.qos.logback.classic.spi.IThrowableProxy;");
        arrayList.add("ch.qos.logback.classic.spi.StackTraceElementProxy");
        arrayList.add("[Lch.qos.logback.classic.spi.StackTraceElementProxy;");
        arrayList.add("ch.qos.logback.classic.spi.ClassPackagingData");
        return arrayList;
    }

    public HardenedLoggingEventInputStream(InputStream inputStream, List<String> list) throws IOException {
        this(inputStream);
        super.addToWhitelist(list);
    }
}
