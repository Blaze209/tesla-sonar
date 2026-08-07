package xj0;

/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f123622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f123623b;

    public d(int i11, Object... objArr) {
        this.f123622a = Integer.valueOf(i11);
        this.f123623b = b.INSTANCE.getValidationWarning(i11, objArr);
    }

    public Integer a() {
        return this.f123622a;
    }

    public String b() {
        return this.f123623b;
    }

    public String toString() {
        if (this.f123622a == null) {
            return this.f123623b;
        }
        return "(" + this.f123622a + ") " + this.f123623b;
    }
}
