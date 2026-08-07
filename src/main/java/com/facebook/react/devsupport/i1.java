package com.facebook.react.devsupport;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f22496a = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f22497b = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");

    public static class a implements pn.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f22499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f22500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f22501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f22502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f22503f;

        @Override // pn.k
        public int a() {
            return this.f22500c;
        }

        @Override // pn.k
        public boolean b() {
            return this.f22503f;
        }

        @Override // pn.k
        public int getColumn() {
            return this.f22501d;
        }

        @Override // pn.k
        public String getFile() {
            return this.f22498a;
        }

        @Override // pn.k
        public String getFileName() {
            return this.f22502e;
        }

        @Override // pn.k
        public String getMethod() {
            return this.f22499b;
        }

        private a(String str, String str2, String str3, int i11, int i12) {
            this.f22498a = str;
            this.f22502e = str2;
            this.f22499b = str3;
            this.f22500c = i11;
            this.f22501d = i12;
            this.f22503f = false;
        }
    }

    public static pn.k[] a(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        pn.k[] kVarArr = new pn.k[stackTrace.length];
        for (int i11 = 0; i11 < stackTrace.length; i11++) {
            kVarArr[i11] = new a(stackTrace[i11].getClassName(), stackTrace[i11].getFileName(), stackTrace[i11].getMethodName(), stackTrace[i11].getLineNumber(), -1);
        }
        return kVarArr;
    }

    public static JavaOnlyMap b(ReactJsExceptionHandler.ProcessedError processedError) {
        List<ReactJsExceptionHandler.ProcessedError.StackFrame> stack = processedError.getStack();
        ArrayList arrayList = new ArrayList();
        for (ReactJsExceptionHandler.ProcessedError.StackFrame stackFrame : stack) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            if (stackFrame.getColumn() != null) {
                javaOnlyMap.putDouble("column", stackFrame.getColumn().intValue());
            }
            if (stackFrame.getLineNumber() != null) {
                javaOnlyMap.putDouble("lineNumber", stackFrame.getLineNumber().intValue());
            }
            javaOnlyMap.putString(Action.FILE_ATTRIBUTE, stackFrame.getFile());
            javaOnlyMap.putString("methodName", stackFrame.getMethodName());
            arrayList.add(javaOnlyMap);
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putString("message", processedError.getMessage());
        if (processedError.getOriginalMessage() != null) {
            javaOnlyMap2.putString("originalMessage", processedError.getOriginalMessage());
        }
        if (processedError.getName() != null) {
            javaOnlyMap2.putString("name", processedError.getName());
        }
        if (processedError.getComponentStack() != null) {
            javaOnlyMap2.putString("componentStack", processedError.getComponentStack());
        }
        javaOnlyMap2.putArray("stack", JavaOnlyArray.from(arrayList));
        javaOnlyMap2.putInt("id", processedError.getId());
        javaOnlyMap2.putBoolean("isFatal", processedError.isFatal());
        javaOnlyMap2.putMap("extraData", processedError.getExtraData());
        return javaOnlyMap2;
    }

    public static String c(pn.k kVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kVar.getFileName());
        int iA = kVar.a();
        if (iA > 0) {
            sb2.append(":");
            sb2.append(iA);
            int column = kVar.getColumn();
            if (column > 0) {
                sb2.append(":");
                sb2.append(column);
            }
        }
        return sb2.toString();
    }
}
