package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final StackTraceElement[] f20551g = new StackTraceElement[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Throwable> f20552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dj.e f20553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dj.a f20554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Class<?> f20555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f20557f;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    private void a(Throwable th2, List<Throwable> list) {
        if (!(th2 instanceof GlideException)) {
            list.add(th2);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th2).e().iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            appendable.append("Cause (").append(String.valueOf(i12)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = list.get(i11);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).h(appendable);
            } else {
                d(th2, appendable);
            }
            i11 = i12;
        }
    }

    private static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.f20552a;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List<Throwable> listF = f();
        int size = listF.size();
        int i11 = 0;
        while (i11 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i12 = i11 + 1;
            sb2.append(i12);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), listF.get(i11));
            i11 = i12;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f20556e);
        sb2.append(this.f20555d != null ? ", " + this.f20555d : "");
        sb2.append(this.f20554c != null ? ", " + this.f20554c : "");
        sb2.append(this.f20553b != null ? ", " + this.f20553b : "");
        List<Throwable> listF = f();
        if (listF.isEmpty()) {
            return sb2.toString();
        }
        if (listF.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(listF.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : listF) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb2.append(th2.getMessage());
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    void i(dj.e eVar, dj.a aVar) {
        j(eVar, aVar, null);
    }

    void j(dj.e eVar, dj.a aVar, Class<?> cls) {
        this.f20553b = eVar;
        this.f20554c = aVar;
        this.f20555d = cls;
    }

    public void k(Exception exc) {
        this.f20557f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th2) {
        this(str, (List<Throwable>) Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f20556e = str;
        setStackTrace(f20551g);
        this.f20552a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    private static final class a implements Appendable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Appendable f20558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f20559b = true;

        a(Appendable appendable) {
            this.f20558a = appendable;
        }

        @NonNull
        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c11) throws IOException {
            if (this.f20559b) {
                this.f20559b = false;
                this.f20558a.append("  ");
            }
            this.f20559b = c11 == '\n';
            this.f20558a.append(c11);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i11, int i12) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z11 = false;
            if (this.f20559b) {
                this.f20559b = false;
                this.f20558a.append("  ");
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i12 - 1) == '\n') {
                z11 = true;
            }
            this.f20559b = z11;
            this.f20558a.append(charSequenceA, i11, i12);
            return this;
        }
    }
}
