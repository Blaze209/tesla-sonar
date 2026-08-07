package com.plaid.internal;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class P implements Y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V3 f46567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wn0.q<Integer, String, String, jn0.h0> f46568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pattern f46569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f46570d;

    /* JADX WARN: Multi-variable type inference failed */
    public P(V3 minPriority, wn0.q<? super Integer, ? super String, ? super String, jn0.h0> qVar) {
        p013kotlin.jvm.internal.s.k(minPriority, "minPriority");
        this.f46567a = minPriority;
        this.f46568b = qVar;
        this.f46569c = Pattern.compile("(\\$\\d+)+$");
        this.f46570d = p013kotlin.collections.v.p(X5.class.getName(), X5.a.class.getName(), P.class.getName());
    }

    public final void a(int i11, Throwable th2, String str, Object[] objArr, boolean z11) {
        if (z11) {
            return;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        p013kotlin.jvm.internal.s.j(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!this.f46570d.contains(stackTraceElement.getClassName())) {
                String className = stackTraceElement.getClassName();
                p013kotlin.jvm.internal.s.j(className, "getClassName(...)");
                String strU1 = p013kotlin.text.t.u1(className, CoreConstants.DOT, null, 2, null);
                Matcher matcher = this.f46569c.matcher(strU1);
                if (matcher.find()) {
                    strU1 = matcher.replaceAll("");
                    p013kotlin.jvm.internal.s.j(strU1, "replaceAll(...)");
                }
                strU1.length();
                V3.a aVar = V3.Companion;
                V3 v11 = this.f46567a;
                aVar.getClass();
                if (i11 < V3.a.a(v11)) {
                    return;
                }
                if (str == null || str.length() == 0) {
                    if (th2 == null) {
                        return;
                    }
                    StringWriter stringWriter = new StringWriter(256);
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                    th2.printStackTrace(printWriter);
                    printWriter.flush();
                    str = stringWriter.toString();
                    p013kotlin.jvm.internal.s.j(str, "toString(...)");
                } else {
                    if (objArr.length != 0) {
                        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                        str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                        p013kotlin.jvm.internal.s.j(str, "format(...)");
                    }
                    if (th2 != null) {
                        StringWriter stringWriter2 = new StringWriter(256);
                        PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                        th2.printStackTrace(printWriter2);
                        printWriter2.flush();
                        String string = stringWriter2.toString();
                        p013kotlin.jvm.internal.s.j(string, "toString(...)");
                        str = str + "\n" + string;
                    }
                }
                try {
                    a(i11, strU1, str);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.plaid.internal.Y3
    public final void b(Throwable th2, String str, Object[] args, boolean z11) {
        p013kotlin.jvm.internal.s.k(args, "args");
        a(5, th2, str, Arrays.copyOf(args, args.length), z11);
    }

    @Override // com.plaid.internal.Y3
    public final void c(String str, Object[] args, boolean z11) {
        p013kotlin.jvm.internal.s.k(args, "args");
        a(4, null, str, Arrays.copyOf(args, args.length), z11);
    }

    @Override // com.plaid.internal.Y3
    public final void d(String str, Object[] args, boolean z11) {
        p013kotlin.jvm.internal.s.k(args, "args");
        a(3, null, str, Arrays.copyOf(args, args.length), z11);
    }

    @Override // com.plaid.internal.Y3
    public final void e(String str, Object[] args, boolean z11) {
        p013kotlin.jvm.internal.s.k(args, "args");
        a(5, null, str, Arrays.copyOf(args, args.length), z11);
    }

    @Override // com.plaid.internal.Y3
    public final void b(String str, Object[] args, boolean z11) {
        p013kotlin.jvm.internal.s.k(args, "args");
        a(6, new Throwable(), "Plog.e: " + str, Arrays.copyOf(args, args.length), z11);
    }

    @Override // com.plaid.internal.Y3
    public final void b(Throwable th2, boolean z11) {
        a(6, th2, null, new Object[0], z11);
    }

    @Override // com.plaid.internal.Y3
    public final void a(String str, Object[] args, boolean z11) {
        p013kotlin.jvm.internal.s.k(args, "args");
        a(2, null, str, Arrays.copyOf(args, args.length), z11);
    }

    @Override // com.plaid.internal.Y3
    public final void a(Throwable th2, boolean z11) {
        a(5, th2, null, new Object[0], z11);
    }

    @Override // com.plaid.internal.Y3
    public final void a(Throwable th2, String str, Object[] args, boolean z11) {
        p013kotlin.jvm.internal.s.k(args, "args");
        a(6, th2, str, Arrays.copyOf(args, args.length), z11);
    }

    public final void a(int i11, String str, String str2) {
        int iMin;
        if (str2.length() < 4000) {
            wn0.q<Integer, String, String, jn0.h0> qVar = this.f46568b;
            if (qVar != null) {
                qVar.invoke(Integer.valueOf(i11), str, str2);
            }
            if (i11 == 7) {
                Log.wtf(str, str2);
                return;
            } else {
                Log.println(i11, str, str2);
                return;
            }
        }
        int length = str2.length();
        int i12 = 0;
        while (i12 < length) {
            String str3 = str2;
            int iU0 = p013kotlin.text.t.u0(str3, '\n', i12, false, 4, null);
            if (iU0 == -1) {
                iU0 = length;
            }
            while (true) {
                iMin = Math.min(iU0, i12 + 4000);
                String strSubstring = str3.substring(i12, iMin);
                p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
                wn0.q<Integer, String, String, jn0.h0> qVar2 = this.f46568b;
                if (qVar2 != null) {
                    qVar2.invoke(Integer.valueOf(i11), str, strSubstring);
                }
                if (i11 == 7) {
                    Log.wtf(str, strSubstring);
                } else {
                    Log.println(i11, str, strSubstring);
                }
                if (iMin >= iU0) {
                    break;
                } else {
                    i12 = iMin;
                }
            }
            i12 = iMin + 1;
            str2 = str3;
        }
    }
}
