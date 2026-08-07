package ezvcard.io;

import xj0.b;

/* JADX INFO: loaded from: classes8.dex */
public class CannotParseException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f63508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f63509b;

    public CannotParseException() {
        this(null);
    }

    public Object[] a() {
        return this.f63509b;
    }

    public Integer b() {
        return this.f63508a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return b.INSTANCE.getParseMessage(this.f63508a.intValue(), this.f63509b);
    }

    public CannotParseException(int i11, Object... objArr) {
        this.f63508a = Integer.valueOf(i11);
        this.f63509b = objArr;
    }

    public CannotParseException(String str) {
        this(25, str);
    }
}
