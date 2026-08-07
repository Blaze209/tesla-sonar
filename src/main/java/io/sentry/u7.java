package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class u7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f81448a;

    public u7(q7 q7Var) {
        this.f81448a = q7Var;
    }

    public List<io.sentry.protocol.b0> a(StackTraceElement[] stackTraceElementArr, boolean z11) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z11 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.b0 b0Var = new io.sentry.protocol.b0();
                    b0Var.z(b(className));
                    b0Var.D(className);
                    b0Var.y(stackTraceElement.getMethodName());
                    b0Var.x(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        b0Var.B(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    b0Var.E(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(b0Var);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public Boolean b(String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = this.f81448a.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = this.f81448a.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }
}
