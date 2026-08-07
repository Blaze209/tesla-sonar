package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3349hj implements InterfaceC3155d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32317a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.hj$a */
    private enum a {
        VALID,
        PARTIAL,
        INVALID;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f32322e = on0.a.a(a());
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.hj$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.VALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C3349hj(List ibanConfig) {
        p013kotlin.jvm.internal.s.k(ibanConfig, "ibanConfig");
        this.f32317a = ibanConfig;
    }

    private final boolean b(String str) {
        return new p013kotlin.text.q("^[A-Za-z]{1,2}").b(str);
    }

    private final a c(String str) {
        String upperCase = p013kotlin.text.t.V(str, " ", "", false, 4, null).toUpperCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        for (int i11 = 0; i11 < upperCase.length(); i11++) {
            if (!Character.isLetterOrDigit(upperCase.charAt(i11))) {
                return a.INVALID;
            }
        }
        String str2 = upperCase.length() > 4 ? p013kotlin.text.t.M1(upperCase, 4) + p013kotlin.text.t.T1(upperCase, 4) : upperCase;
        StringBuilder sb2 = new StringBuilder();
        int length = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str2.charAt(i12);
            sb2.append(Character.isDigit(cCharAt) ? Character.valueOf(cCharAt) : String.valueOf(cCharAt - '7'));
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        BigInteger bigIntegerRemainder = BigInteger.ZERO;
        int length2 = string.length();
        String str3 = "";
        for (int i13 = 0; i13 < length2; i13++) {
            str3 = str3 + string.charAt(i13);
            if (str3.length() > 8) {
                BigInteger bigInteger = new BigInteger(bigIntegerRemainder + str3);
                BigInteger bigIntegerValueOf = BigInteger.valueOf(97L);
                p013kotlin.jvm.internal.s.j(bigIntegerValueOf, "valueOf(...)");
                bigIntegerRemainder = bigInteger.remainder(bigIntegerValueOf);
                p013kotlin.jvm.internal.s.j(bigIntegerRemainder, "remainder(...)");
                str3 = "";
            }
        }
        if (str3.length() > 0) {
            BigInteger bigInteger2 = new BigInteger(bigIntegerRemainder + str3);
            BigInteger bigIntegerValueOf2 = BigInteger.valueOf(97L);
            p013kotlin.jvm.internal.s.j(bigIntegerValueOf2, "valueOf(...)");
            bigIntegerRemainder = bigInteger2.remainder(bigIntegerValueOf2);
            p013kotlin.jvm.internal.s.j(bigIntegerRemainder, "remainder(...)");
        }
        int length3 = upperCase.length();
        if (15 <= length3 && length3 < 35 && p013kotlin.jvm.internal.s.f(bigIntegerRemainder, BigInteger.ONE)) {
            return a.VALID;
        }
        if (upperCase.length() < 34) {
            BigInteger bigInteger3 = BigInteger.ZERO;
            BigInteger bigIntegerValueOf3 = BigInteger.valueOf(96L);
            p013kotlin.jvm.internal.s.j(bigIntegerValueOf3, "valueOf(...)");
            if (bo0.n.c(bigInteger3, bigIntegerValueOf3).d(bigIntegerRemainder)) {
                return a.PARTIAL;
            }
        }
        return a.INVALID;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3155d2
    public InterfaceC3112c2 a(String input) {
        Object obj;
        p013kotlin.jvm.internal.s.k(input, "input");
        if (p013kotlin.text.t.y0(input)) {
            return InterfaceC3112c2.g.f30774a;
        }
        if (!b(input)) {
            return InterfaceC3112c2.f.f30772a;
        }
        Iterator it = this.f32317a.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (p013kotlin.text.t.b0(input, ((BavIbanCountryConfig) next).getCountryCode(), false, 2, null)) {
                obj = next;
                break;
            }
        }
        BavIbanCountryConfig bavIbanCountryConfig = (BavIbanCountryConfig) obj;
        if (input.length() == 1) {
            return new InterfaceC3112c2.a(Integer.valueOf(R.string.shared_validation_iban_country_code));
        }
        return bavIbanCountryConfig != null ? a(input, bavIbanCountryConfig) : InterfaceC3112c2.c.f30764a;
    }

    private final InterfaceC3112c2 a(String str, BavIbanCountryConfig bavIbanCountryConfig) {
        if (str.length() == bavIbanCountryConfig.getLength()) {
            int i11 = b.$EnumSwitchMapping$0[c(str).ordinal()];
            if (i11 == 1) {
                return new InterfaceC3112c2.d(true, bavIbanCountryConfig);
            }
            if (i11 == 2) {
                return new InterfaceC3112c2.d(true, bavIbanCountryConfig);
            }
            if (i11 == 3) {
                return new InterfaceC3112c2.h(bavIbanCountryConfig);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new InterfaceC3112c2.e(str.length() > bavIbanCountryConfig.getLength(), bavIbanCountryConfig);
    }
}
