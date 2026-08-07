package io.reactivex.rxjava3.exceptions;

import ch.qos.logback.classic.net.SyslogAppender;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CompositeException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Throwable> f78877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f78878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Throwable f78879c;

    static final class a extends RuntimeException {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    static abstract class b {
        b() {
        }

        abstract b a(Object obj);
    }

    static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PrintStream f78880a;

        c(PrintStream printStream) {
            this.f78880a = printStream;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.reactivex.rxjava3.exceptions.CompositeException.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(Object obj) {
            this.f78880a.print(obj);
            return this;
        }
    }

    static final class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PrintWriter f78881a;

        d(PrintWriter printWriter) {
            this.f78881a = printWriter;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.reactivex.rxjava3.exceptions.CompositeException.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(Object obj) {
            this.f78881a.print(obj);
            return this;
        }
    }

    public CompositeException(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    private void a(b bVar, Throwable th2, String str) {
        bVar.a(str).a(th2).a('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            bVar.a("\t\tat ").a(stackTraceElement).a('\n');
        }
        if (th2.getCause() != null) {
            bVar.a("\tCaused by: ");
            a(bVar, th2.getCause(), "");
        }
    }

    private void c(b bVar) {
        bVar.a(this).a("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            bVar.a("\tat ").a(stackTraceElement).a("\n");
        }
        int i11 = 1;
        for (Throwable th2 : this.f78877a) {
            bVar.a("  ComposedException ").a(Integer.valueOf(i11)).a(" :\n");
            a(bVar, th2, SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            i11++;
        }
        bVar.a("\n");
    }

    public List<Throwable> b() {
        return this.f78877a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        int i11;
        try {
            if (this.f78879c == null) {
                String property = System.getProperty("line.separator");
                if (this.f78877a.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Multiple exceptions (");
                    sb2.append(this.f78877a.size());
                    sb2.append(")");
                    sb2.append(property);
                    for (Throwable cause : this.f78877a) {
                        int i12 = 0;
                        while (cause != null) {
                            for (int i13 = 0; i13 < i12; i13++) {
                                sb2.append("  ");
                            }
                            sb2.append("|-- ");
                            sb2.append(cause.getClass().getCanonicalName());
                            sb2.append(": ");
                            String message = cause.getMessage();
                            if (message == null || !message.contains(property)) {
                                sb2.append(message);
                                sb2.append(property);
                            } else {
                                sb2.append(property);
                                for (String str : message.split(property)) {
                                    for (int i14 = 0; i14 < i12 + 2; i14++) {
                                        sb2.append("  ");
                                    }
                                    sb2.append(str);
                                    sb2.append(property);
                                }
                            }
                            int i15 = 0;
                            while (true) {
                                i11 = i12 + 2;
                                if (i15 >= i11) {
                                    break;
                                }
                                sb2.append("  ");
                                i15++;
                            }
                            StackTraceElement[] stackTrace = cause.getStackTrace();
                            if (stackTrace.length > 0) {
                                sb2.append("at ");
                                sb2.append(stackTrace[0]);
                                sb2.append(property);
                            }
                            if (identityHashMap.containsKey(cause)) {
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null) {
                                    break;
                                }
                                for (int i16 = 0; i16 < i11; i16++) {
                                    sb2.append("  ");
                                }
                                sb2.append("|-- ");
                                sb2.append("(cause not expanded again) ");
                                sb2.append(cause2.getClass().getCanonicalName());
                                sb2.append(": ");
                                sb2.append(cause2.getMessage());
                                sb2.append(property);
                                break;
                            }
                            identityHashMap.put(cause, Boolean.TRUE);
                            cause = cause.getCause();
                            i12++;
                        }
                    }
                    this.f78879c = new a(sb2.toString().trim());
                } else {
                    this.f78879c = this.f78877a.get(0);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f78879c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f78878b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        c(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        c(new d(printWriter));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (iterable != null) {
            for (Throwable th2 : iterable) {
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).b());
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f78877a = listUnmodifiableList;
            this.f78878b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
