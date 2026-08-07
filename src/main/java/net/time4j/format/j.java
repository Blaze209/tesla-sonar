package net.time4j.format;

import ezvcard.property.Gender;
import java.io.IOException;
import java.util.Locale;
import org.webrtc.WebrtcBuildVersion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j ARABIC;
    public static final j ARABIC_INDIC;
    public static final j ARABIC_INDIC_EXT;
    public static final j BENGALI;
    public static final j DEVANAGARI;
    public static final j DOZENAL;
    private static final int[] D_FACTORS;
    public static final j ETHIOPIC;
    private static final char ETHIOPIC_HUNDRED = 4987;
    private static final char ETHIOPIC_ONE = 4969;
    private static final char ETHIOPIC_TEN = 4978;
    private static final char ETHIOPIC_TEN_THOUSAND = 4988;
    public static final j GUJARATI;
    public static final j JAPANESE;
    public static final j KHMER;
    private static final String[] LETTERS;
    public static final j MYANMAR;
    private static final int[] NUMBERS;
    public static final j ORYA;
    public static final j ROMAN;
    public static final j TELUGU;
    public static final j THAI;
    private final String code;

    static enum g extends j {
        g(String str, int i11, String str2) {
            super(str, i11, str2, null);
        }

        @Override // net.time4j.format.j
        public boolean contains(char c11) {
            return c11 >= '0' && c11 <= '9';
        }

        @Override // net.time4j.format.j
        public String getDigits() {
            return "0123456789";
        }

        @Override // net.time4j.format.j
        public boolean isDecimal() {
            return true;
        }

        @Override // net.time4j.format.j
        public int toInteger(String str, net.time4j.format.g gVar) {
            int i11 = Integer.parseInt(str);
            if (i11 >= 0) {
                return i11;
            }
            throw new NumberFormatException("Cannot convert negative number: " + str);
        }

        @Override // net.time4j.format.j
        public String toNumeral(int i11) {
            if (i11 >= 0) {
                return Integer.toString(i11);
            }
            throw new IllegalArgumentException("Cannot convert: " + i11);
        }
    }

    static {
        g gVar = new g("ARABIC", 0, "latn");
        ARABIC = gVar;
        j jVar = new j("ARABIC_INDIC", 1, "arab") { // from class: net.time4j.format.j.h
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "٠١٢٣٤٥٦٧٨٩";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        ARABIC_INDIC = jVar;
        j jVar2 = new j("ARABIC_INDIC_EXT", 2, "arabext") { // from class: net.time4j.format.j.i
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "۰۱۲۳۴۵۶۷۸۹";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        ARABIC_INDIC_EXT = jVar2;
        j jVar3 = new j("BENGALI", 3, "beng") { // from class: net.time4j.format.j.j
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "০১২৩৪৫৬৭৮৯";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        BENGALI = jVar3;
        j jVar4 = new j("DEVANAGARI", 4, "deva") { // from class: net.time4j.format.j.k
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "०१२३४५६७८९";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        DEVANAGARI = jVar4;
        j jVar5 = new j("DOZENAL", 5, "dozenal") { // from class: net.time4j.format.j.l
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public boolean contains(char c11) {
                return (c11 >= '0' && c11 <= '9') || c11 == 8586 || c11 == 8587;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "0123456789↊↋";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return false;
            }

            @Override // net.time4j.format.j
            public int toInteger(String str, net.time4j.format.g gVar2) {
                int i11 = Integer.parseInt(str.replace((char) 8586, 'a').replace((char) 8587, 'b'), 12);
                if (i11 >= 0) {
                    return i11;
                }
                throw new NumberFormatException("Cannot convert negative number: " + str);
            }

            @Override // net.time4j.format.j
            public String toNumeral(int i11) {
                if (i11 >= 0) {
                    return Integer.toString(i11, 12).replace('a', (char) 8586).replace('b', (char) 8587);
                }
                throw new IllegalArgumentException("Cannot convert: " + i11);
            }

            @Override // net.time4j.format.j
            public int toNumeral(int i11, Appendable appendable) throws IOException {
                char c11;
                if (i11 >= 0) {
                    int i12 = 1;
                    while (true) {
                        if (i12 > 4) {
                            i12 = 0;
                            break;
                        }
                        if (i11 < j.D_FACTORS[i12]) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 > 0) {
                        int i13 = i12 - 1;
                        do {
                            int i14 = i11 / j.D_FACTORS[i13];
                            if (i14 == 11) {
                                c11 = 8587;
                            } else {
                                c11 = i14 == 10 ? (char) 8586 : (char) (i14 + 48);
                            }
                            appendable.append(c11);
                            i11 -= i14 * j.D_FACTORS[i13];
                            i13--;
                        } while (i13 >= 0);
                        return i12;
                    }
                }
                return super.toNumeral(i11, appendable);
            }
        };
        DOZENAL = jVar5;
        j jVar6 = new j("ETHIOPIC", 6, "ethiopic") { // from class: net.time4j.format.j.m
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public boolean contains(char c11) {
                return c11 >= 4969 && c11 <= 4988;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "፩፪፫፬፭፮፯፰፱፲፳፴፵፶፷፸፹፺፻፼";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return false;
            }

            @Override // net.time4j.format.j
            public int toInteger(String str, net.time4j.format.g gVar2) {
                int i11;
                int i12 = 1;
                boolean z11 = false;
                boolean z12 = false;
                int iAddEthiopic = 0;
                int i13 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char cCharAt = str.charAt(length);
                    if (cCharAt < 4969 || cCharAt >= 4978) {
                        if (cCharAt >= 4978 && cCharAt < 4987) {
                            i11 = (cCharAt - 4977) * 10;
                        } else if (cCharAt == 4988) {
                            if (z11 && i13 == 0) {
                                i13 = 1;
                            }
                            iAddEthiopic = j.addEthiopic(iAddEthiopic, i13, i12);
                            i12 = z11 ? i12 * 100 : i12 * 10000;
                            z12 = true;
                            z11 = false;
                            i13 = 0;
                        } else if (cCharAt == 4987) {
                            iAddEthiopic = j.addEthiopic(iAddEthiopic, i13, i12);
                            i12 *= 100;
                            z11 = true;
                            z12 = false;
                            i13 = 0;
                        }
                    } else {
                        i11 = cCharAt - 4968;
                    }
                    i13 += i11;
                }
                return j.addEthiopic(iAddEthiopic, ((z11 || z12) && i13 == 0) ? 1 : i13, i12);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x005e  */
            @Override // net.time4j.format.j
            public String toNumeral(int i11) {
                char c11;
                if (i11 < 1) {
                    throw new IllegalArgumentException("Can only convert positive numbers: " + i11);
                }
                String strValueOf = String.valueOf(i11);
                int length = strValueOf.length();
                int i12 = length - 1;
                if (i12 % 2 == 0) {
                    strValueOf = WebrtcBuildVersion.maint_version + strValueOf;
                } else {
                    length = i12;
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i13 = length; i13 >= 0; i13 -= 2) {
                    char cCharAt = strValueOf.charAt(length - i13);
                    int i14 = i13 - 1;
                    char cCharAt2 = strValueOf.charAt(length - i14);
                    char c12 = 0;
                    char c13 = cCharAt2 != '0' ? (char) (cCharAt2 + 4920) : (char) 0;
                    char c14 = cCharAt != '0' ? (char) (cCharAt + 4929) : (char) 0;
                    int i15 = (i14 % 4) / 2;
                    if (i14 == 0) {
                        c11 = 0;
                    } else if (i15 == 0) {
                        c11 = j.ETHIOPIC_TEN_THOUSAND;
                    } else if (c13 == 0 && c14 == 0) {
                        c11 = 0;
                    } else {
                        c11 = 4987;
                    }
                    if (c13 != 4969 || c14 != 0 || length <= 1 || (c11 != 4987 && i13 != length)) {
                        c12 = c13;
                    }
                    if (c14 != 0) {
                        sb2.append(c14);
                    }
                    if (c12 != 0) {
                        sb2.append(c12);
                    }
                    if (c11 != 0) {
                        sb2.append(c11);
                    }
                }
                return sb2.toString();
            }
        };
        ETHIOPIC = jVar6;
        j jVar7 = new j("GUJARATI", 7, "gujr") { // from class: net.time4j.format.j.n
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "૦૧૨૩૪૫૬૭૮૯";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        GUJARATI = jVar7;
        j jVar8 = new j("JAPANESE", 8, "jpan") { // from class: net.time4j.format.j.o
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "一二三四五六七八九十百千";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return false;
            }

            @Override // net.time4j.format.j
            public int toInteger(String str, net.time4j.format.g gVar2) {
                boolean z11;
                String digits = getDigits();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char cCharAt = str.charAt(length);
                    if (cCharAt == 21313) {
                        if (i11 != 0 || i13 != 0 || i14 != 0) {
                            throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                        }
                        i11++;
                    } else if (cCharAt == 21315) {
                        if (i14 != 0) {
                            throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                        }
                        i14++;
                    } else if (cCharAt != 30334) {
                        int i15 = 0;
                        while (true) {
                            if (i15 >= 9) {
                                z11 = false;
                                break;
                            }
                            if (digits.charAt(i15) == cCharAt) {
                                int i16 = i15 + 1;
                                if (i14 == 1) {
                                    i12 += i16 * 1000;
                                    i14 = -1;
                                } else if (i13 == 1) {
                                    i12 += i16 * 100;
                                    i13 = -1;
                                } else if (i11 == 1) {
                                    i12 += i16 * 10;
                                    i11 = -1;
                                } else {
                                    i12 += i16;
                                }
                                z11 = true;
                                break;
                            }
                            i15++;
                        }
                        if (!z11) {
                            throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                        }
                    } else {
                        if (i13 != 0 || i14 != 0) {
                            throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                        }
                        i13++;
                    }
                }
                if (i11 == 1) {
                    i12 += 10;
                }
                if (i13 == 1) {
                    i12 += 100;
                }
                return i14 == 1 ? i12 + 1000 : i12;
            }

            @Override // net.time4j.format.j
            public String toNumeral(int i11) {
                if (i11 < 1 || i11 > 9999) {
                    throw new IllegalArgumentException("Cannot convert: " + i11);
                }
                String digits = getDigits();
                int i12 = i11 / 1000;
                int i13 = i11 % 1000;
                int i14 = i13 / 100;
                int i15 = i13 % 100;
                int i16 = i15 / 10;
                int i17 = i15 % 10;
                StringBuilder sb2 = new StringBuilder();
                if (i12 >= 1) {
                    if (i12 > 1) {
                        sb2.append(digits.charAt(i12 - 1));
                    }
                    sb2.append((char) 21315);
                }
                if (i14 >= 1) {
                    if (i14 > 1) {
                        sb2.append(digits.charAt(i14 - 1));
                    }
                    sb2.append((char) 30334);
                }
                if (i16 >= 1) {
                    if (i16 > 1) {
                        sb2.append(digits.charAt(i16 - 1));
                    }
                    sb2.append((char) 21313);
                }
                if (i17 > 0) {
                    sb2.append(digits.charAt(i17 - 1));
                }
                return sb2.toString();
            }
        };
        JAPANESE = jVar8;
        j jVar9 = new j("KHMER", 9, "khmr") { // from class: net.time4j.format.j.a
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "០១២៣៤៥៦៧៨៩";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        KHMER = jVar9;
        j jVar10 = new j("MYANMAR", 10, "mymr") { // from class: net.time4j.format.j.b
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "၀၁၂၃၄၅၆၇၈၉";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        MYANMAR = jVar10;
        j jVar11 = new j("ORYA", 11, "orya") { // from class: net.time4j.format.j.c
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "୦୧୨୩୪୫୬୭୮୯";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        ORYA = jVar11;
        j jVar12 = new j("ROMAN", 12, "roman") { // from class: net.time4j.format.j.d
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public boolean contains(char c11) {
                char upperCase = Character.toUpperCase(c11);
                return upperCase == 'I' || upperCase == 'V' || upperCase == 'X' || upperCase == 'L' || upperCase == 'C' || upperCase == 'D' || upperCase == 'M';
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "IVXLCDM";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return false;
            }

            @Override // net.time4j.format.j
            public int toInteger(String str, net.time4j.format.g gVar2) {
                if (str.isEmpty()) {
                    throw new NumberFormatException("Empty Roman numeral.");
                }
                String upperCase = str.toUpperCase(Locale.US);
                boolean zIsStrict = gVar2.isStrict();
                int length = str.length();
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    char cCharAt = upperCase.charAt(i11);
                    int value = j.getValue(cCharAt);
                    i11++;
                    if (i11 != length) {
                        int i13 = 1;
                        while (i11 < length) {
                            char cCharAt2 = upperCase.charAt(i11);
                            int i14 = i11 + 1;
                            if (cCharAt2 == cCharAt) {
                                i13++;
                                if (i13 >= 4 && zIsStrict) {
                                    throw new NumberFormatException("Roman numeral contains more than 3 equal letters in sequence: " + str);
                                }
                                if (i14 == length) {
                                    i12 += value * i13;
                                }
                                i11 = i14;
                            } else {
                                int value2 = j.getValue(cCharAt2);
                                if (value2 >= value) {
                                    if (!zIsStrict || (i13 <= 1 && j.isValidRomanCombination(cCharAt, cCharAt2))) {
                                        i12 = (i12 + value2) - (value * i13);
                                        i11 = i14;
                                        break;
                                    }
                                    throw new NumberFormatException("Not conform with modern usage: " + str);
                                }
                                value *= i13;
                            }
                        }
                    }
                    i12 += value;
                }
                if (i12 > 3999) {
                    throw new NumberFormatException("Roman numbers bigger than 3999 not supported.");
                }
                if (zIsStrict) {
                    if (i12 >= 900 && upperCase.contains("DCD")) {
                        throw new NumberFormatException("Roman number contains invalid sequence DCD.");
                    }
                    if (i12 >= 90 && upperCase.contains("LXL")) {
                        throw new NumberFormatException("Roman number contains invalid sequence LXL.");
                    }
                    if (i12 >= 9 && upperCase.contains("VIV")) {
                        throw new NumberFormatException("Roman number contains invalid sequence VIV.");
                    }
                }
                return i12;
            }

            @Override // net.time4j.format.j
            public String toNumeral(int i11) {
                if (i11 < 1 || i11 > 3999) {
                    throw new IllegalArgumentException("Out of range (1-3999): " + i11);
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = 0; i12 < j.NUMBERS.length; i12++) {
                    while (i11 >= j.NUMBERS[i12]) {
                        sb2.append(j.LETTERS[i12]);
                        i11 -= j.NUMBERS[i12];
                    }
                }
                return sb2.toString();
            }
        };
        ROMAN = jVar12;
        j jVar13 = new j("TELUGU", 13, "telu") { // from class: net.time4j.format.j.e
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "౦౧౨౩౪౫౬౭౮౯";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        TELUGU = jVar13;
        j jVar14 = new j("THAI", 14, "thai") { // from class: net.time4j.format.j.f
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return "๐๑๒๓๔๕๖๗๘๙";
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        THAI = jVar14;
        $VALUES = new j[]{gVar, jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14};
        NUMBERS = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        LETTERS = new String[]{Gender.MALE, "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        D_FACTORS = new int[]{1, 12, 144, 1728, 20736};
    }

    /* synthetic */ j(String str, int i11, String str2, g gVar) {
        this(str, i11, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int addEthiopic(int i11, int i12, int i13) {
        return net.time4j.base.c.e(i11, net.time4j.base.c.h(i12, i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getValue(char c11) {
        if (c11 == 'C') {
            return 100;
        }
        if (c11 == 'D') {
            return 500;
        }
        if (c11 == 'I') {
            return 1;
        }
        if (c11 == 'V') {
            return 5;
        }
        if (c11 == 'X') {
            return 10;
        }
        if (c11 == 'L') {
            return 50;
        }
        if (c11 == 'M') {
            return 1000;
        }
        throw new NumberFormatException("Invalid Roman digit: " + c11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidRomanCombination(char c11, char c12) {
        if (c11 == 'C') {
            return c12 == 'M' || c12 == 'D';
        }
        if (c11 == 'I') {
            return c12 == 'X' || c12 == 'V';
        }
        if (c11 != 'X') {
            return false;
        }
        return c12 == 'C' || c12 == 'L';
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public boolean contains(char c11) {
        String digits = getDigits();
        int length = digits.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (digits.charAt(i11) == c11) {
                return true;
            }
        }
        return false;
    }

    public String getCode() {
        return this.code;
    }

    public String getDigits() {
        throw new AbstractMethodError();
    }

    public boolean isDecimal() {
        throw new AbstractMethodError();
    }

    public final int toInteger(String str) {
        return toInteger(str, net.time4j.format.g.SMART);
    }

    public String toNumeral(int i11) {
        if (!isDecimal() || i11 < 0) {
            throw new IllegalArgumentException("Cannot convert: " + i11);
        }
        int iCharAt = getDigits().charAt(0) - '0';
        String string = Integer.toString(i11);
        StringBuilder sb2 = new StringBuilder();
        int length = string.length();
        for (int i12 = 0; i12 < length; i12++) {
            sb2.append((char) (string.charAt(i12) + iCharAt));
        }
        return sb2.toString();
    }

    private j(String str, int i11, String str2) {
        super(str, i11);
        this.code = str2;
    }

    public int toInteger(String str, net.time4j.format.g gVar) {
        if (!isDecimal()) {
            throw new NumberFormatException("Cannot convert: " + str);
        }
        int iCharAt = getDigits().charAt(0) - '0';
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append((char) (str.charAt(i11) - iCharAt));
        }
        int i12 = Integer.parseInt(sb2.toString());
        if (i12 >= 0) {
            return i12;
        }
        throw new NumberFormatException("Cannot convert negative number: " + str);
    }

    public int toNumeral(int i11, Appendable appendable) throws IOException {
        String numeral = toNumeral(i11);
        appendable.append(numeral);
        return numeral.length();
    }
}
