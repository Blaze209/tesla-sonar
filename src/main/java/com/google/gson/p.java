package com.google.gson;

import bx.a0;
import bx.c0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f45012a;

    public p(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f45012a = bool;
    }

    private static boolean q(p pVar) {
        Object obj = pVar.f45012a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.l
    public long e() {
        return r() ? o().longValue() : Long.parseLong(f());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f45012a == null) {
            return pVar.f45012a == null;
        }
        if (q(this) && q(pVar)) {
            if ((this.f45012a instanceof BigInteger) || (pVar.f45012a instanceof BigInteger)) {
                return l().equals(pVar.l());
            }
            return o().longValue() == pVar.o().longValue();
        }
        Object obj2 = this.f45012a;
        if (obj2 instanceof Number) {
            Object obj3 = pVar.f45012a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return k().compareTo(pVar.k()) == 0;
                }
                double dN = n();
                double dN2 = pVar.n();
                return dN == dN2 || (Double.isNaN(dN) && Double.isNaN(dN2));
            }
        }
        return obj2.equals(pVar.f45012a);
    }

    @Override // com.google.gson.l
    public String f() {
        Object obj = this.f45012a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (r()) {
            return o().toString();
        }
        if (p()) {
            return ((Boolean) this.f45012a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f45012a.getClass());
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f45012a == null) {
            return 31;
        }
        if (q(this)) {
            jDoubleToLongBits = o().longValue();
        } else {
            Object obj = this.f45012a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(o().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public BigDecimal k() {
        Object obj = this.f45012a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : c0.b(f());
    }

    public BigInteger l() {
        Object obj = this.f45012a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return q(this) ? BigInteger.valueOf(o().longValue()) : c0.c(f());
    }

    public boolean m() {
        return p() ? ((Boolean) this.f45012a).booleanValue() : Boolean.parseBoolean(f());
    }

    public double n() {
        return r() ? o().doubleValue() : Double.parseDouble(f());
    }

    public Number o() {
        Object obj = this.f45012a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new a0((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public boolean p() {
        return this.f45012a instanceof Boolean;
    }

    public boolean r() {
        return this.f45012a instanceof Number;
    }

    public boolean s() {
        return this.f45012a instanceof String;
    }

    public p(Number number) {
        Objects.requireNonNull(number);
        this.f45012a = number;
    }

    public p(String str) {
        Objects.requireNonNull(str);
        this.f45012a = str;
    }
}
