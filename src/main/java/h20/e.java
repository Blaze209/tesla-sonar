package h20;

import java.util.HashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0014"}, d2 = {"Lh20/e;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "<init>", "()V", "", "str", "", "maxLength", "a", "(Ljava/lang/String;I)Ljava/lang/String;", "Ljava/lang/Thread;", "t", "", "e", "Ljn0/h0;", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "Ljava/lang/Thread$UncaughtExceptionHandler;", "defaultHandler", "b", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f70415c = e.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Thread.UncaughtExceptionHandler defaultHandler = Thread.getDefaultUncaughtExceptionHandler();

    private final String a(String str, int maxLength) {
        if (str == null) {
            return null;
        }
        String strSubstring = str.substring(0, bo0.n.j(str.length(), maxLength));
        s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t11, Throwable e11) {
        String strA;
        s.k(t11, "t");
        s.k(e11, "e");
        String TAG = f70415c;
        s.j(TAG, "TAG");
        g.a(TAG, "Uncaught exception being tracked...", new Object[0]);
        String strA2 = a(e11.getMessage(), 2048);
        if (strA2 == null || strA2.length() == 0) {
            strA2 = "Android Exception. Null or empty message found";
        }
        String strA3 = a(i20.c.o(e11), 8096);
        String strA4 = a(t11.getName(), 1024);
        StackTraceElement[] stackTrace = e11.getStackTrace();
        s.j(stackTrace, "e.stackTrace");
        Integer numValueOf = null;
        if (stackTrace.length == 0) {
            strA = null;
        } else {
            StackTraceElement stackTraceElement = e11.getStackTrace()[0];
            int lineNumber = stackTraceElement.getLineNumber();
            numValueOf = lineNumber >= 0 ? Integer.valueOf(lineNumber) : null;
            strA = a(stackTraceElement.getClassName(), 1024);
        }
        String strA5 = a(e11.getClass().getName(), 1024);
        HashMap map = new HashMap();
        i20.c.a("message", strA2, map);
        i20.c.a("stackTrace", strA3, map);
        i20.c.a("threadName", strA4, map);
        i20.c.a("threadId", Long.valueOf(t11.getId()), map);
        i20.c.a("programmingLanguage", "JAVA", map);
        i20.c.a("lineNumber", numValueOf, map);
        i20.c.a("className", strA, map);
        i20.c.a("exceptionName", strA5, map);
        i20.c.a("isFatal", Boolean.TRUE, map);
        o20.l lVar = new o20.l(new r20.b("iglu:com.snowplowanalytics.snowplow/application_error/jsonschema/1-0-0", map));
        HashMap map2 = new HashMap();
        map2.put("event", lVar);
        i20.b.b("SnowplowCrashReporting", map2);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t11, e11);
        }
    }
}
