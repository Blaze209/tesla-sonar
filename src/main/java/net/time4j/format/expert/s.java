package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.text.ParsePosition;

/* JADX INFO: loaded from: classes9.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ParsePosition f94410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f94411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private net.time4j.engine.q<?> f94412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f94413d;

    public s() {
        this(0);
    }

    void a() {
        this.f94410a.setErrorIndex(-1);
        this.f94411b = "";
    }

    void b() {
        this.f94413d = false;
    }

    public int c() {
        return this.f94410a.getErrorIndex();
    }

    public String d() {
        return this.f94411b;
    }

    ParsePosition e() {
        return this.f94410a;
    }

    public int f() {
        return this.f94410a.getIndex();
    }

    public net.time4j.engine.q<?> g() {
        if (this.f94412c == null) {
            this.f94412c = new v(0, false);
        }
        return this.f94412c;
    }

    net.time4j.engine.q<?> h() {
        return this.f94412c;
    }

    public boolean i() {
        return this.f94410a.getErrorIndex() != -1;
    }

    boolean j() {
        return this.f94413d;
    }

    public void k(int i11, String str) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Undefined error index: " + i11);
        }
        if (str == null || str.isEmpty()) {
            str = "Error occurred at position: " + i11;
        }
        this.f94411b = str;
        this.f94410a.setErrorIndex(i11);
    }

    public void l(int i11) {
        if (i11 >= 0) {
            this.f94410a.setIndex(i11);
            return;
        }
        throw new IllegalArgumentException("Undefined position: " + i11);
    }

    void m(net.time4j.engine.q<?> qVar) {
        this.f94412c = qVar;
    }

    public void n() {
        if (!i()) {
            this.f94411b = "Warning state active.";
            this.f94410a.setErrorIndex(f());
        }
        this.f94413d = true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("[position=");
        sb2.append(f());
        sb2.append(", error-index=");
        sb2.append(c());
        sb2.append(", error-message=\"");
        sb2.append(this.f94411b);
        sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        if (this.f94413d) {
            sb2.append(", warning-active");
        }
        if (this.f94412c != null) {
            sb2.append(", raw-values=");
            sb2.append(this.f94412c);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public s(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Undefined: " + i11);
        }
        this.f94410a = new ParsePosition(i11);
        this.f94411b = "";
        this.f94412c = null;
        this.f94413d = false;
    }
}
