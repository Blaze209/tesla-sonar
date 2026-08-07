package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class o implements Comparable<o>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f94070a = {"jia", "yi", "bing", "ding", "wu", "ji", "geng", "xin", "ren", "gui"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f94071b = {"jiǎ", "yǐ", "bǐng", "dīng", "wù", "jǐ", "gēng", "xīn", "rén", "guǐ"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f94072c = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f94073d = {"갑", "을", "병", "정", "무", "기", "경", "신", "임", "계"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f94074e = {"giáp", "ất", "bính", "đinh", "mậu", "kỷ", "canh", "tân", "nhâm", "quý"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f94075f = {"Цзя", "И", "Бин", "Дин", "У", "Цзи", "Гэн", "Синь", "Жэнь", "Гуй"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f94076g = {"zi", "chou", "yin", "mao", "chen", "si", "wu", "wei", "shen", "you", "xu", "hai"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f94077h = {"zǐ", "chǒu", "yín", "mǎo", "chén", "sì", "wǔ", "wèi", "shēn", "yǒu", "xū", "hài"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f94078i = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f94079j = {"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f94080k = {"tí", "sửu", "dần", "mão", "thìn", "tị", "ngọ", "mùi", "thân", "dậu", "tuất", "hợi"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f94081l = {"Цзы", "Чоу", "Инь", "Мао", "Чэнь", "Сы", "У", "Вэй", "Шэнь", "Ю", "Сюй", "Хай"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final o[] f94082m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map<String, String[]> f94083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map<String, String[]> f94084o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Set<String> f94085p;
    private static final long serialVersionUID = -4556668597489844917L;
    private final int number;

    public enum a {
        ZI_1_RAT,
        CHOU_2_OX,
        YIN_3_TIGER,
        MAO_4_HARE,
        CHEN_5_DRAGON,
        SI_6_SNAKE,
        WU_7_HORSE,
        WEI_8_SHEEP,
        SHEN_9_MONKEY,
        YOU_10_FOWL,
        XU_11_DOG,
        HAI_12_PIG;

        public String getDisplayName(Locale locale) {
            String language = locale.getLanguage();
            Map map = o.f94084o;
            if (language.isEmpty()) {
                language = "root";
            }
            String[] strArr = (String[]) map.get(language);
            if (strArr == null) {
                strArr = o.f94077h;
            }
            return strArr[ordinal()];
        }

        public String getZodiac(Locale locale) {
            return net.time4j.format.b.c("chinese", locale).m().get("zodiac-" + String.valueOf(ordinal() + 1));
        }
    }

    public enum b {
        JIA_1_WOOD_YANG,
        YI_2_WOOD_YIN,
        BING_3_FIRE_YANG,
        DING_4_FIRE_YIN,
        WU_5_EARTH_YANG,
        JI_6_EARTH_YIN,
        GENG_7_METAL_YANG,
        XIN_8_METAL_YIN,
        REN_9_WATER_YANG,
        GUI_10_WATER_YIN;

        public String getDisplayName(Locale locale) {
            String language = locale.getLanguage();
            Map map = o.f94083n;
            if (language.isEmpty()) {
                language = "root";
            }
            String[] strArr = (String[]) map.get(language);
            if (strArr == null) {
                strArr = o.f94071b;
            }
            return strArr[ordinal()];
        }
    }

    static {
        o[] oVarArr = new o[60];
        int i11 = 0;
        while (i11 < 60) {
            int i12 = i11 + 1;
            oVarArr[i11] = new o(i12);
            i11 = i12;
        }
        f94082m = oVarArr;
        HashMap map = new HashMap();
        map.put("root", f94070a);
        String[] strArr = f94072c;
        map.put("zh", strArr);
        map.put("ja", strArr);
        map.put("ko", f94073d);
        map.put("vi", f94074e);
        map.put("ru", f94075f);
        f94083n = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("root", f94076g);
        String[] strArr2 = f94078i;
        map2.put("zh", strArr2);
        map2.put("ja", strArr2);
        map2.put("ko", f94079j);
        map2.put("vi", f94080k);
        map2.put("ru", f94081l);
        f94084o = Collections.unmodifiableMap(map2);
        HashSet hashSet = new HashSet();
        hashSet.add("zh");
        hashSet.add("ja");
        hashSet.add("ko");
        f94085p = Collections.unmodifiableSet(hashSet);
    }

    o(int i11) {
        this.number = i11;
    }

    public static o i(int i11) {
        if (i11 >= 1 && i11 <= 60) {
            return f94082m[i11 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i11);
    }

    public static o j(b bVar, a aVar) {
        int iOrdinal = bVar.ordinal();
        o oVarI = i(iOrdinal + 1 + net.time4j.base.c.c((aVar.ordinal() - iOrdinal) * 25, 60));
        if (oVarI.h() == bVar && oVarI.f() == aVar) {
            return oVarI;
        }
        throw new IllegalArgumentException("Invalid combination of stem and branch.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static o k(CharSequence charSequence, ParsePosition parsePosition, Locale locale, boolean z11) {
        b bVar;
        boolean z12;
        o oVar;
        int i11;
        boolean z13;
        a aVar;
        a aVar2;
        Locale locale2 = locale;
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        boolean zIsEmpty = locale2.getLanguage().isEmpty();
        int i12 = index + 1;
        o oVar2 = null;
        if (i12 >= length || index < 0) {
            parsePosition.setErrorIndex(index);
            return null;
        }
        if (f94085p.contains(locale2.getLanguage())) {
            b[] bVarArrValues = b.values();
            int length2 = bVarArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    bVar = null;
                    break;
                }
                bVar = bVarArrValues[i13];
                if (bVar.getDisplayName(locale2).charAt(0) == charSequence.charAt(index)) {
                    break;
                }
                i13++;
            }
            if (bVar != null) {
                a[] aVarArrValues = a.values();
                int length3 = aVarArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length3) {
                        aVar2 = null;
                        break;
                    }
                    a aVar3 = aVarArrValues[i14];
                    if (aVar3.getDisplayName(locale2).charAt(0) == charSequence.charAt(i12)) {
                        index += 2;
                        aVar2 = aVar3;
                        break;
                    }
                    i14++;
                }
                z12 = zIsEmpty;
                oVar = null;
                aVar = aVar2;
            } else {
                z12 = zIsEmpty;
                aVar = 0;
                oVar = null;
            }
        } else {
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                }
                if (charSequence.charAt(i12) == '-') {
                    break;
                }
                i12++;
            }
            if (i12 == -1) {
                parsePosition.setErrorIndex(index);
                return null;
            }
            b[] bVarArrValues2 = b.values();
            int length4 = bVarArrValues2.length;
            bVar = null;
            int i15 = 0;
            while (i15 < length4) {
                b bVar2 = bVarArrValues2[i15];
                String displayName = bVar2.getDisplayName(locale2);
                o oVar3 = oVar2;
                int i16 = index;
                while (true) {
                    if (i16 >= i12) {
                        z13 = zIsEmpty;
                        break;
                    }
                    int i17 = i16 - index;
                    char cCharAt = charSequence.charAt(i16);
                    if (zIsEmpty) {
                        cCharAt = l(cCharAt);
                    }
                    char c11 = cCharAt;
                    z13 = zIsEmpty;
                    if (i17 >= displayName.length() || displayName.charAt(i17) != c11) {
                        break;
                    }
                    if (i17 + 1 == displayName.length()) {
                        bVar = bVar2;
                        break;
                    }
                    i16++;
                    zIsEmpty = z13;
                }
                i15++;
                oVar2 = oVar3;
                zIsEmpty = z13;
            }
            z12 = zIsEmpty;
            oVar = oVar2;
            if (bVar == null) {
                if (z11 && !z12 && i12 + 1 < length) {
                    return k(charSequence, parsePosition, Locale.ROOT, true);
                }
                parsePosition.setErrorIndex(index);
                return oVar;
            }
            a[] aVarArrValues2 = a.values();
            int length5 = aVarArrValues2.length;
            Object obj = oVar;
            int i18 = 0;
            while (i18 < length5) {
                a aVar4 = aVarArrValues2[i18];
                String displayName2 = aVar4.getDisplayName(locale2);
                int i19 = i12 + 1;
                while (true) {
                    if (i19 < length) {
                        int i21 = i19 - i12;
                        int i22 = i21 - 1;
                        char cCharAt2 = charSequence.charAt(i19);
                        if (z12) {
                            cCharAt2 = l(cCharAt2);
                        }
                        char c12 = cCharAt2;
                        i11 = index;
                        if (i22 < displayName2.length() && displayName2.charAt(i22) == c12) {
                            if (i21 == displayName2.length()) {
                                obj = aVar4;
                                index = i19 + 1;
                                break;
                            }
                            i19++;
                            index = i11;
                        }
                    } else {
                        i11 = index;
                    }
                    index = i11;
                    break;
                }
                i18++;
                locale2 = locale;
                obj = obj;
            }
            aVar = obj;
        }
        if (bVar != null && aVar != 0) {
            parsePosition.setIndex(index);
            return j(bVar, aVar);
        }
        if (z11 && !z12) {
            return k(charSequence, parsePosition, Locale.ROOT, true);
        }
        parsePosition.setErrorIndex(index);
        return oVar;
    }

    private static char l(char c11) {
        if (c11 == 224) {
            return 'a';
        }
        if (c11 == 249) {
            return 'u';
        }
        if (c11 == 275) {
            return 'e';
        }
        if (c11 == 299) {
            return 'i';
        }
        if (c11 == 363) {
            return 'u';
        }
        if (c11 == 462) {
            return 'a';
        }
        if (c11 == 464) {
            return 'i';
        }
        if (c11 == 466) {
            return 'o';
        }
        if (c11 == 232 || c11 == 233) {
            return 'e';
        }
        if (c11 == 236 || c11 == 237) {
            return 'i';
        }
        return c11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(o oVar) {
        if (getClass().equals(oVar.getClass())) {
            return this.number - ((o) o.class.cast(oVar)).number;
        }
        throw new ClassCastException("Cannot compare different types.");
    }

    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass()) && this.number == ((o) obj).number;
    }

    public a f() {
        int i11 = this.number % 12;
        return a.values()[(i11 != 0 ? i11 : 12) - 1];
    }

    public String g(Locale locale) {
        b bVarH = h();
        a aVarF = f();
        return bVarH.getDisplayName(locale) + (f94085p.contains(locale.getLanguage()) ? "" : "-") + aVarF.getDisplayName(locale);
    }

    public int getNumber() {
        return this.number;
    }

    public b h() {
        int i11 = this.number % 10;
        return b.values()[(i11 != 0 ? i11 : 10) - 1];
    }

    public int hashCode() {
        return this.number;
    }

    Object readResolve() {
        return i(this.number);
    }

    public String toString() {
        return g(Locale.ROOT) + "(" + String.valueOf(this.number) + ")";
    }
}
