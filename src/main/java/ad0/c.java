package ad0;

import android.content.Context;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.StatusPrinter;
import com.tesla.logging.e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lad0/c;", "Lvr0/a$a;", "<init>", "()V", "", "tag", "", "priority", "", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;I)Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "childDirName", "processName", "Lad0/c$a;", "p", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lad0/c$a;", "message", "", "t", "Ljn0/h0;", "j", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "f", "Z", "initialized", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "g", "Lorg/slf4j/Logger;", "logger", "a", "logging_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends vr0.a.C2564a {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static boolean initialized;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f977e = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) c.class);

    /* JADX INFO: renamed from: ad0.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lad0/c$a;", "", "", "", "logs", "fatalErrorMessages", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "a", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLogs", "Ljava/lang/String;", "getFatalErrorMessages", "logging_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FileLoggingTreeConfigurationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> logs;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fatalErrorMessages;

        public FileLoggingTreeConfigurationResult(List<String> logs, String str) {
            s.k(logs, "logs");
            this.logs = logs;
            this.fatalErrorMessages = str;
        }

        public final List<String> a() {
            return this.logs;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFatalErrorMessages() {
            return this.fatalErrorMessages;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileLoggingTreeConfigurationResult)) {
                return false;
            }
            FileLoggingTreeConfigurationResult fileLoggingTreeConfigurationResult = (FileLoggingTreeConfigurationResult) other;
            return s.f(this.logs, fileLoggingTreeConfigurationResult.logs) && s.f(this.fatalErrorMessages, fileLoggingTreeConfigurationResult.fatalErrorMessages);
        }

        public int hashCode() {
            int iHashCode = this.logs.hashCode() * 31;
            String str = this.fatalErrorMessages;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "FileLoggingTreeConfigurationResult(logs=" + this.logs + ", fatalErrorMessages=" + this.fatalErrorMessages + ")";
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence q(Status status) {
        String message = status.getMessage();
        s.j(message, "getMessage(...)");
        return message;
    }

    @Override // vr0.a.c
    protected boolean i(String tag, int priority) {
        return priority >= 3;
    }

    @Override // vr0.a.C2564a, vr0.a.c
    protected void j(int priority, String tag, String message, Throwable t11) {
        s.k(message, "message");
        StringBuilder sb2 = new StringBuilder();
        e eVar = e.f56373a;
        if (tag == null) {
            tag = "";
        }
        sb2.append(d.c(eVar.c(tag), 24, null, null, false, 8, null));
        sb2.append("   ");
        sb2.append(message);
        String string = sb2.toString();
        s.j(string, "toString(...)");
        if (priority == 3) {
            logger.debug(string);
            return;
        }
        if (priority == 4) {
            logger.info(string);
        } else if (priority == 5) {
            logger.warn(string);
        } else {
            if (priority != 6) {
                return;
            }
            logger.error(string);
        }
    }

    public final FileLoggingTreeConfigurationResult p(Context context, String childDirName, String processName) {
        s.k(context, "context");
        s.k(childDirName, "childDirName");
        s.k(processName, "processName");
        if (initialized) {
            return new FileLoggingTreeConfigurationResult(v.m(), null);
        }
        ArrayList arrayList = new ArrayList();
        initialized = true;
        String absolutePath = context.getCacheDir().getAbsolutePath();
        String str = File.separator;
        String str2 = absolutePath + str + "logs" + str + childDirName;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        ILoggerFactory iLoggerFactory = LoggerFactory.getILoggerFactory();
        s.i(iLoggerFactory, "null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext");
        LoggerContext loggerContext = (LoggerContext) iLoggerFactory;
        loggerContext.reset();
        RollingFileAppender rollingFileAppender = new RollingFileAppender();
        rollingFileAppender.setContext(loggerContext);
        rollingFileAppender.setAppend(true);
        SizeAndTimeBasedRollingPolicy sizeAndTimeBasedRollingPolicy = new SizeAndTimeBasedRollingPolicy();
        sizeAndTimeBasedRollingPolicy.setContext(loggerContext);
        sizeAndTimeBasedRollingPolicy.setMaxFileSize(FileSize.valueOf("512kb"));
        sizeAndTimeBasedRollingPolicy.setTotalSizeCap(FileSize.valueOf("5mb"));
        sizeAndTimeBasedRollingPolicy.setMaxHistory(30);
        sizeAndTimeBasedRollingPolicy.setFileNamePattern(str2 + "/log.%d{yyyy-MM-dd}.%i." + childDirName + ".txt");
        sizeAndTimeBasedRollingPolicy.setParent(rollingFileAppender);
        sizeAndTimeBasedRollingPolicy.start();
        a aVar = new a(processName);
        aVar.setContext(loggerContext);
        aVar.start();
        LayoutWrappingEncoder layoutWrappingEncoder = new LayoutWrappingEncoder();
        layoutWrappingEncoder.setContext(loggerContext);
        layoutWrappingEncoder.setLayout(aVar);
        layoutWrappingEncoder.setCharset(p013kotlin.text.d.UTF_8);
        layoutWrappingEncoder.start();
        rollingFileAppender.setRollingPolicy(sizeAndTimeBasedRollingPolicy);
        rollingFileAppender.setEncoder(layoutWrappingEncoder);
        rollingFileAppender.start();
        Logger logger2 = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        s.i(logger2, "null cannot be cast to non-null type ch.qos.logback.classic.Logger");
        ch.qos.logback.classic.Logger logger3 = (ch.qos.logback.classic.Logger) logger2;
        logger3.setLevel(Level.DEBUG);
        logger3.addAppender(rollingFileAppender);
        StatusPrinter.print(loggerContext);
        List<Status> copyOfStatusList = loggerContext.getStatusManager().getCopyOfStatusList();
        s.j(copyOfStatusList, "getCopyOfStatusList(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : copyOfStatusList) {
            if (((Status) obj).getLevel() == 2) {
                arrayList2.add(obj);
            }
        }
        return new FileLoggingTreeConfigurationResult(arrayList, arrayList2.isEmpty() ? null : v.y0(arrayList2, ", ", null, null, 0, null, new l() { // from class: ad0.b
            @Override // wn0.l
            public final Object invoke(Object obj2) {
                return c.q((Status) obj2);
            }
        }, 30, null));
    }
}
