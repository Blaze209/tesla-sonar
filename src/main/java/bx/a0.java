package bx;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18151a;

    public a0(String str) {
        this.f18151a = str;
    }

    private BigDecimal a() {
        return c0.b(this.f18151a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f18151a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f18151a.equals(((a0) obj).f18151a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f18151a);
    }

    public int hashCode() {
        return this.f18151a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f18151a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f18151a);
            }
        } catch (NumberFormatException unused2) {
            return a().intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f18151a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f18151a;
    }
}
