package com.nimbusds.jose.shaded.json.parser;

/* JADX INFO: loaded from: classes6.dex */
public class ParseException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f45798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45799c;

    public ParseException(int i11, int i12, Object obj) {
        super(a(i11, i12, obj));
        this.f45799c = i11;
        this.f45797a = i12;
        this.f45798b = obj;
    }

    private static String a(int i11, int i12, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        if (i12 == 0) {
            sb2.append("Unexpected character (");
            sb2.append(obj);
            sb2.append(") at position ");
            sb2.append(i11);
            sb2.append(".");
        } else if (i12 == 1) {
            sb2.append("Unexpected token ");
            sb2.append(obj);
            sb2.append(" at position ");
            sb2.append(i11);
            sb2.append(".");
        } else if (i12 == 2) {
            sb2.append("Unexpected exception ");
            sb2.append(obj);
            sb2.append(" occur at position ");
            sb2.append(i11);
            sb2.append(".");
        } else if (i12 == 3) {
            sb2.append("Unexpected End Of File position ");
            sb2.append(i11);
            sb2.append(": ");
            sb2.append(obj);
        } else if (i12 == 4) {
            sb2.append("Unexpected unicode escape sequence ");
            sb2.append(obj);
            sb2.append(" at position ");
            sb2.append(i11);
            sb2.append(".");
        } else if (i12 == 5) {
            sb2.append("Unexpected duplicate key:");
            sb2.append(obj);
            sb2.append(" at position ");
            sb2.append(i11);
            sb2.append(".");
        } else if (i12 == 6) {
            sb2.append("Unexpected leading 0 in digit for token:");
            sb2.append(obj);
            sb2.append(" at position ");
            sb2.append(i11);
            sb2.append(".");
        } else {
            sb2.append("Unkown error at position ");
            sb2.append(i11);
            sb2.append(".");
        }
        return sb2.toString();
    }

    public ParseException(int i11, Throwable th2) {
        super(a(i11, 2, th2), th2);
        this.f45799c = i11;
        this.f45797a = 2;
        this.f45798b = th2;
    }
}
