package j$.time.format;

import ch.qos.logback.core.CoreConstants;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f82092g;

    @Override // j$.time.format.i
    public final boolean b(u uVar) {
        return uVar.f82147c && this.f82104b == this.f82105c && !this.f82092g;
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i11) {
        boolean z11 = uVar.f82147c;
        DateTimeFormatter dateTimeFormatter = uVar.f82145a;
        int i12 = (z11 || b(uVar)) ? this.f82104b : 0;
        int i13 = (uVar.f82147c || b(uVar)) ? this.f82105c : 9;
        int length = charSequence.length();
        if (i11 != length) {
            if (this.f82092g) {
                char cCharAt = charSequence.charAt(i11);
                dateTimeFormatter.f82061c.getClass();
                if (cCharAt == '.') {
                    i11++;
                } else if (i12 > 0) {
                    return ~i11;
                }
            }
            int i14 = i11;
            int i15 = i12 + i14;
            if (i15 > length) {
                return ~i14;
            }
            int iMin = Math.min(i13 + i14, length);
            int i16 = 0;
            int i17 = i14;
            while (i17 < iMin) {
                int i18 = i17 + 1;
                char cCharAt2 = charSequence.charAt(i17);
                dateTimeFormatter.f82061c.getClass();
                int i19 = cCharAt2 - '0';
                if (i19 < 0 || i19 > 9) {
                    i19 = -1;
                }
                if (i19 < 0) {
                    if (i18 >= i15) {
                        break;
                    }
                    return ~i14;
                }
                i16 = (i16 * 10) + i19;
                i17 = i18;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i16).movePointLeft(i17 - i14);
            j$.time.temporal.t tVarE = this.f82103a.E();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(tVarE.f82221a);
            return uVar.f(this.f82103a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(tVarE.f82224d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i14, i17);
        }
        if (i12 > 0) {
            return ~i11;
        }
        return i11;
    }

    public f(j$.time.temporal.p pVar, int i11, int i12, boolean z11) {
        this(pVar, i11, i12, z11, 0);
        Objects.requireNonNull(pVar, "field");
        j$.time.temporal.t tVarE = pVar.E();
        if (tVarE.f82221a != tVarE.f82222b || tVarE.f82223c != tVarE.f82224d) {
            throw new IllegalArgumentException(j$.time.c.a("Field must have a fixed set of values: ", pVar));
        }
        if (i11 < 0 || i11 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i11);
        }
        if (i12 < 1 || i12 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i12);
        }
        if (i12 >= i11) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i12 + " < " + i11);
    }

    public f(j$.time.temporal.p pVar, int i11, int i12, boolean z11, int i13) {
        super(pVar, i11, i12, d0.NOT_NEGATIVE, i13);
        this.f82092g = z11;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.f82107e == -1) {
            return this;
        }
        return new f(this.f82103a, this.f82104b, this.f82105c, this.f82092g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i11) {
        return new f(this.f82103a, this.f82104b, this.f82105c, this.f82092g, this.f82107e + i11);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final boolean s(w wVar, StringBuilder sb2) {
        j$.time.temporal.p pVar = this.f82103a;
        Long lA = wVar.a(pVar);
        if (lA == null) {
            return false;
        }
        a0 a0Var = wVar.f82155b.f82061c;
        long jLongValue = lA.longValue();
        j$.time.temporal.t tVarE = pVar.E();
        tVarE.b(jLongValue, pVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(tVarE.f82221a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(tVarE.f82224d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z11 = this.f82092g;
        int i11 = this.f82104b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i11), this.f82105c), roundingMode).toPlainString().substring(2);
            a0Var.getClass();
            if (z11) {
                sb2.append(CoreConstants.DOT);
            }
            sb2.append(strSubstring);
            return true;
        }
        if (i11 > 0) {
            if (z11) {
                a0Var.getClass();
                sb2.append(CoreConstants.DOT);
            }
            for (int i12 = 0; i12 < i11; i12++) {
                a0Var.getClass();
                sb2.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.f82103a + "," + this.f82104b + "," + this.f82105c + (this.f82092g ? ",DecimalPoint" : "") + ")";
    }
}
