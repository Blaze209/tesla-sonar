package com.fourthline.analytics.internal;

import bo0.n;
import i20.c;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fj\u0002`\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/fourthline/analytics/internal/AppErrorEvent;", "Lcom/fourthline/analytics/internal/NewAnalyticsEvent;", AnalyticsAttribute.Error, "", "thread", "Ljava/lang/Thread;", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Thread;)V", "eventName", "", "getEventName", "()Ljava/lang/String;", "schema", "getSchema", "attributes", "", "", "Lcom/fourthline/analytics/internal/AnalyticsAttributes;", "getAttributes", "()Ljava/util/Map;", "truncateString", "str", "maxLength", "", "Companion", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppErrorEvent implements NewAnalyticsEvent {
    private static final int MAX_CLASS_NAME_LENGTH = 1024;
    private static final int MAX_EXCEPTION_NAME_LENGTH = 1024;
    private static final int MAX_MESSAGE_LENGTH = 2048;
    private static final int MAX_STACK_LENGTH = 8096;
    private static final int MAX_THREAD_NAME_LENGTH = 1024;
    private final Map<String, Object> attributes;
    private final Throwable error;
    private final String eventName;
    private final String schema;
    private final Thread thread;

    public AppErrorEvent(Throwable error, Thread thread) {
        String strTruncateString;
        s.k(error, "error");
        s.k(thread, "thread");
        this.error = error;
        this.thread = thread;
        this.eventName = "app_error";
        this.schema = "iglu:com.fourthline.sdk/app_error/jsonschema/1-0-0";
        Map mapC = v0.c();
        String strTruncateString2 = truncateString(error.getMessage(), 2048);
        Integer numValueOf = null;
        if (strTruncateString2 == null || strTruncateString2.length() == 0) {
            Throwable cause = error.getCause();
            String strTruncateString3 = truncateString(cause != null ? cause.getMessage() : null, 2048);
            strTruncateString3 = strTruncateString3 == null ? "Null or empty message found" : strTruncateString3;
            strTruncateString2 = error.getClass().getSimpleName() + " - " + strTruncateString3;
        }
        String strTruncateString4 = truncateString(c.o(error), MAX_STACK_LENGTH);
        String strTruncateString5 = truncateString(thread.getName(), 1024);
        StackTraceElement[] stackTrace = error.getStackTrace();
        s.j(stackTrace, "getStackTrace(...)");
        if (stackTrace.length == 0) {
            strTruncateString = null;
        } else {
            StackTraceElement stackTraceElement = error.getStackTrace()[0];
            int lineNumber = stackTraceElement.getLineNumber();
            numValueOf = lineNumber >= 0 ? Integer.valueOf(lineNumber) : null;
            strTruncateString = truncateString(stackTraceElement.getClassName(), 1024);
        }
        String strTruncateString6 = truncateString(error.getClass().getName(), 1024);
        mapC.put("message", strTruncateString2);
        mapC.put("stackTrace", strTruncateString4);
        mapC.put("threadName", strTruncateString5);
        mapC.put("threadId", Long.valueOf(thread.getId()));
        mapC.put("programmingLanguage", "JAVA");
        mapC.put("lineNumber", numValueOf);
        mapC.put("className", strTruncateString);
        mapC.put("exceptionName", strTruncateString6);
        mapC.put("isFatal", Boolean.TRUE);
        this.attributes = v0.b(mapC);
    }

    private final String truncateString(String str, int maxLength) {
        if (str == null) {
            return null;
        }
        String strSubstring = str.substring(0, n.j(str.length(), maxLength));
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.eventName;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.schema;
    }
}
