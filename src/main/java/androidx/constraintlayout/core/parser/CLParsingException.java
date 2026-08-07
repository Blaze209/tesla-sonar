package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6468c;

    public String a() {
        return this.f6466a + " (" + this.f6468c + " at line " + this.f6467b + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
