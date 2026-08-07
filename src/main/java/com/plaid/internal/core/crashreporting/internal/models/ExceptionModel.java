package com.plaid.internal.core.crashreporting.internal.models;

import com.plaid.internal.C4571x;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel;", "Ljava/io/Serializable;", "throwable", "", "(Ljava/lang/Throwable;)V", "module", "", "stacktrace", "Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceInterface;", "type", "value", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExceptionModel implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DEFAULT_PACKAGE_NAME = "(default)";
    private final String module;

    /* JADX INFO: renamed from: stacktrace, reason: from kotlin metadata and from toString */
    private final StackTraceInterface stackTraceInterface;
    private final String type;
    private final String value;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel$Companion;", "", "()V", "DEFAULT_PACKAGE_NAME", "", "extractExceptionQueue", "Ljava/util/Queue;", "Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel;", "throwable", "", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Queue<ExceptionModel> extractExceptionQueue(Throwable throwable) {
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            Throwable cause = throwable;
            while (cause != null && hashSet.add(cause)) {
                linkedList.add(new ExceptionModel(cause));
                cause = throwable != null ? throwable.getCause() : null;
            }
            return linkedList;
        }

        private Companion() {
        }
    }

    public ExceptionModel(Throwable throwable) {
        String strW0;
        java.lang.StackTraceElement[] stackTrace;
        s.k(throwable, "throwable");
        Package r11 = throwable.getClass().getPackage();
        String name = throwable.getClass().getName();
        this.value = throwable.getMessage();
        if (r11 != null) {
            s.h(name);
            name = t.V(name, r11.getName() + ".", "", false, 4, null);
        } else {
            s.h(name);
        }
        this.type = name;
        String canonicalName = throwable.getClass().getCanonicalName();
        if (canonicalName != null) {
            strW0 = t.W0(canonicalName, "." + throwable.getClass().getSimpleName());
        } else {
            strW0 = null;
        }
        this.module = strW0;
        try {
            stackTrace = throwable.getStackTrace();
            s.h(stackTrace);
            n.b1(stackTrace);
        } catch (NullPointerException e11) {
            stackTrace = e11.getStackTrace();
        }
        StackTraceElement.Companion companion = StackTraceElement.INSTANCE;
        s.h(stackTrace);
        this.stackTraceInterface = new StackTraceInterface(companion.fromStackTraceElements(stackTrace));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !s.f(ExceptionModel.class, other.getClass())) {
            return false;
        }
        ExceptionModel exceptionModel = (ExceptionModel) other;
        if (!s.f(this.type, exceptionModel.type)) {
            return false;
        }
        String str = this.value;
        if (str == null ? exceptionModel.value != null : !s.f(str, exceptionModel.value)) {
            return false;
        }
        String str2 = this.module;
        if (str2 == null ? exceptionModel.module == null : s.f(str2, exceptionModel.module)) {
            return s.f(this.stackTraceInterface, exceptionModel.stackTraceInterface);
        }
        return false;
    }

    public int hashCode() {
        String str = this.value;
        int iA = C4571x.a(this.type, (str != null ? str.hashCode() : 0) * 31, 31);
        String str2 = this.module;
        return iA + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SentryException{value='" + this.value + "', type='" + this.type + "', module='" + this.module + "', stackTraceInterface=" + this.stackTraceInterface + "}";
    }
}
