package com.plaid.internal.core.crashreporting.internal.models;

import com.plaid.BuildConfig;
import com.plaid.internal.X5;
import java.util.ArrayList;
import java.util.Objects;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;", "", "module", "", "function", "filename", "lineno", "", "in_app", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;)V", "Ljava/lang/Boolean;", "equals", "other", "hashCode", "toString", "Companion", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StackTraceElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String filename;
    private final String function;
    private final Boolean in_app;
    private final int lineno;
    private final String module;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement$Companion;", "", "()V", "fromStackTraceElement", "Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;", "stackTraceElement", "Ljava/lang/StackTraceElement;", "fromStackTraceElements", "", "stackTraceElements", "([Ljava/lang/StackTraceElement;)[Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final StackTraceElement fromStackTraceElement(java.lang.StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            s.j(className, "getClassName(...)");
            String methodName = stackTraceElement.getMethodName();
            s.j(methodName, "getMethodName(...)");
            String fileName = stackTraceElement.getFileName();
            int lineNumber = stackTraceElement.getLineNumber();
            String className2 = stackTraceElement.getClassName();
            s.j(className2, "getClassName(...)");
            return new StackTraceElement(className, methodName, fileName, lineNumber, Boolean.valueOf(t.h0(className2, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null)));
        }

        public final StackTraceElement[] fromStackTraceElements(java.lang.StackTraceElement[] stackTraceElements) {
            s.k(stackTraceElements, "stackTraceElements");
            ArrayList arrayList = new ArrayList(stackTraceElements.length);
            X5.a.c(X5.f46812a, "Sentry stack trace elements size:  " + arrayList.size());
            int length = stackTraceElements.length;
            for (int i11 = 0; i11 < length; i11++) {
                java.lang.StackTraceElement stackTraceElement = stackTraceElements[i11];
                if (stackTraceElement != null) {
                    arrayList.add(fromStackTraceElement(stackTraceElement));
                }
            }
            return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
        }

        private Companion() {
        }
    }

    public StackTraceElement(String module, String function, String str, int i11, Boolean bool) {
        s.k(module, "module");
        s.k(function, "function");
        this.module = module;
        this.function = function;
        this.filename = str;
        this.lineno = i11;
        this.in_app = bool;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && s.f(StackTraceElement.class, other.getClass())) {
            StackTraceElement stackTraceElement = (StackTraceElement) other;
            if (this.lineno == stackTraceElement.lineno && s.f(this.module, stackTraceElement.module) && s.f(this.function, stackTraceElement.function) && s.f(this.filename, stackTraceElement.filename) && s.f(this.in_app, stackTraceElement.in_app)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.module, this.function, this.filename, Integer.valueOf(this.lineno));
    }

    public String toString() {
        return "SentryStackTraceElement{module='" + this.module + "', function='" + this.function + "', filename='" + this.filename + "', lineno=" + this.lineno + ", in_app=" + this.in_app + "}";
    }

    public /* synthetic */ StackTraceElement(String str, String str2, String str3, int i11, Boolean bool, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i11, (i12 & 16) != 0 ? Boolean.FALSE : bool);
    }
}
