package j$.time.temporal;

import j$.time.DateTimeException;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f82221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f82222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f82223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f82224d;

    public static t f(long j11, long j12) {
        if (j11 > j12) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new t(j11, j11, j12, j12);
    }

    public static t g(long j11, long j12, long j13) {
        if (j11 > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j12 > j13) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j13) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new t(j11, 1L, j12, j13);
    }

    public t(long j11, long j12, long j13, long j14) {
        this.f82221a = j11;
        this.f82222b = j12;
        this.f82223c = j13;
        this.f82224d = j14;
    }

    public final boolean d() {
        return this.f82221a >= -2147483648L && this.f82224d <= 2147483647L;
    }

    public final boolean e(long j11) {
        return j11 >= this.f82221a && j11 <= this.f82224d;
    }

    public final int a(long j11, p pVar) {
        if (d() && e(j11)) {
            return (int) j11;
        }
        throw new DateTimeException(c(j11, pVar));
    }

    public final void b(long j11, p pVar) {
        if (!e(j11)) {
            throw new DateTimeException(c(j11, pVar));
        }
    }

    public final String c(long j11, p pVar) {
        if (pVar != null) {
            return "Invalid value for " + pVar + " (valid values " + this + "): " + j11;
        }
        return "Invalid value (valid values " + this + "): " + j11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j11 = this.f82221a;
        long j12 = this.f82222b;
        if (j11 > j12) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j13 = this.f82223c;
        long j14 = this.f82224d;
        if (j13 > j14) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j12 > j14) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f82221a == tVar.f82221a && this.f82222b == tVar.f82222b && this.f82223c == tVar.f82223c && this.f82224d == tVar.f82224d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f82221a;
        long j12 = this.f82222b;
        long j13 = j11 + (j12 << 16) + (j12 >> 48);
        long j14 = this.f82223c;
        long j15 = j13 + (j14 << 32) + (j14 >> 32);
        long j16 = this.f82224d;
        long j17 = j15 + (j16 << 48) + (j16 >> 16);
        return (int) (j17 ^ (j17 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f82221a);
        if (this.f82221a != this.f82222b) {
            sb2.append('/');
            sb2.append(this.f82222b);
        }
        sb2.append(" - ");
        sb2.append(this.f82223c);
        if (this.f82223c != this.f82224d) {
            sb2.append('/');
            sb2.append(this.f82224d);
        }
        return sb2.toString();
    }
}
