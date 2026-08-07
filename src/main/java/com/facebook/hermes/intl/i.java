package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class i implements com.facebook.hermes.intl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DateFormat f21662a = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21664b;

        static {
            int[] iArr = new int[com.facebook.hermes.intl.b.k.values().length];
            f21664b = iArr;
            try {
                iArr[com.facebook.hermes.intl.b.k.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21664b[com.facebook.hermes.intl.b.k.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21664b[com.facebook.hermes.intl.b.k.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21664b[com.facebook.hermes.intl.b.k.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21664b[com.facebook.hermes.intl.b.k.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[com.facebook.hermes.intl.b.EnumC0434b.values().length];
            f21663a = iArr2;
            try {
                iArr2[com.facebook.hermes.intl.b.EnumC0434b.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21663a[com.facebook.hermes.intl.b.EnumC0434b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21663a[com.facebook.hermes.intl.b.EnumC0434b.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21663a[com.facebook.hermes.intl.b.EnumC0434b.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21663a[com.facebook.hermes.intl.b.EnumC0434b.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static class b {
        public static String a(String str) {
            StringBuilder sb2 = new StringBuilder();
            boolean z11 = false;
            for (int i11 = 0; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (cCharAt == '\'') {
                    z11 = !z11;
                } else if (!z11 && ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                    sb2.append(str.charAt(i11));
                }
            }
            return sb2.toString();
        }
    }

    i() {
    }

    private static String i(em.b<?> bVar, com.facebook.hermes.intl.b.EnumC0434b enumC0434b, com.facebook.hermes.intl.b.k kVar) {
        if (enumC0434b == com.facebook.hermes.intl.b.EnumC0434b.UNDEFINED) {
            return ((SimpleDateFormat) DateFormat.getTimeInstance(m(kVar), (ULocale) bVar.getLocale())).toLocalizedPattern();
        }
        return kVar == com.facebook.hermes.intl.b.k.UNDEFINED ? ((SimpleDateFormat) DateFormat.getDateInstance(l(enumC0434b), (ULocale) bVar.getLocale())).toLocalizedPattern() : ((SimpleDateFormat) DateFormat.getDateTimeInstance(l(enumC0434b), m(kVar), (ULocale) bVar.getLocale())).toLocalizedPattern();
    }

    private static String j(em.b<?> bVar, com.facebook.hermes.intl.b.m mVar, com.facebook.hermes.intl.b.d dVar, com.facebook.hermes.intl.b.n nVar, com.facebook.hermes.intl.b.i iVar, com.facebook.hermes.intl.b.c cVar, com.facebook.hermes.intl.b.f fVar, com.facebook.hermes.intl.b.h hVar, com.facebook.hermes.intl.b.j jVar, com.facebook.hermes.intl.b.l lVar, com.facebook.hermes.intl.b.g gVar, com.facebook.hermes.intl.b.EnumC0434b enumC0434b, com.facebook.hermes.intl.b.k kVar, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        if (enumC0434b == com.facebook.hermes.intl.b.EnumC0434b.UNDEFINED && kVar == com.facebook.hermes.intl.b.k.UNDEFINED) {
            sb2.append(mVar.getSkeleonSymbol());
            sb2.append(dVar.getSkeleonSymbol());
            sb2.append(nVar.getSkeleonSymbol());
            sb2.append(iVar.getSkeleonSymbol());
            sb2.append(cVar.getSkeleonSymbol());
            if (gVar == com.facebook.hermes.intl.b.g.H11 || gVar == com.facebook.hermes.intl.b.g.H12) {
                sb2.append(fVar.getSkeleonSymbol12());
            } else {
                sb2.append(fVar.getSkeleonSymbol24());
            }
            sb2.append(hVar.getSkeleonSymbol());
            sb2.append(jVar.getSkeleonSymbol());
            sb2.append(lVar.getSkeleonSymbol());
        } else {
            sb2.append(i(bVar, enumC0434b, kVar));
            HashMap<String, String> mapD = bVar.d();
            if (mapD.containsKey("hc")) {
                String str = mapD.get("hc");
                if (str == "h11" || str == "h12") {
                    k(sb2, new char[]{'H', 'K', 'k'}, 'h');
                } else if (str == "h23" || str == "h24") {
                    k(sb2, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
            if (gVar == com.facebook.hermes.intl.b.g.H11 || gVar == com.facebook.hermes.intl.b.g.H12) {
                k(sb2, new char[]{'H', 'K', 'k'}, 'h');
            } else if (gVar == com.facebook.hermes.intl.b.g.H23 || gVar == com.facebook.hermes.intl.b.g.H24) {
                k(sb2, new char[]{'h', 'H', 'K'}, 'k');
            }
            if (!em.d.n(obj) && !em.d.j(obj)) {
                if (em.d.e(obj)) {
                    k(sb2, new char[]{'H', 'K', 'k'}, 'h');
                } else {
                    k(sb2, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
        }
        return sb2.toString();
    }

    private static void k(StringBuilder sb2, char[] cArr, char c11) {
        for (int i11 = 0; i11 < sb2.length(); i11++) {
            for (char c12 : cArr) {
                if (sb2.charAt(i11) == c12) {
                    sb2.setCharAt(i11, c11);
                    break;
                }
            }
        }
    }

    static int l(com.facebook.hermes.intl.b.EnumC0434b enumC0434b) throws JSRangeErrorException {
        int i11 = a.f21663a[enumC0434b.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        throw new JSRangeErrorException("Invalid DateStyle: " + enumC0434b.toString());
    }

    static int m(com.facebook.hermes.intl.b.k kVar) throws JSRangeErrorException {
        int i11 = a.f21664b[kVar.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        throw new JSRangeErrorException("Invalid DateStyle: " + kVar.toString());
    }

    @Override // com.facebook.hermes.intl.b
    public AttributedCharacterIterator a(double d11) {
        return this.f21662a.formatToCharacterIterator(Double.valueOf(d11));
    }

    @Override // com.facebook.hermes.intl.b
    public String b(em.b<?> bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.getLocale()).getName();
    }

    @Override // com.facebook.hermes.intl.b
    public String c(double d11) {
        return this.f21662a.format(new Date((long) d11));
    }

    @Override // com.facebook.hermes.intl.b
    public void d(em.b<?> bVar, String str, String str2, com.facebook.hermes.intl.b.e eVar, com.facebook.hermes.intl.b.m mVar, com.facebook.hermes.intl.b.d dVar, com.facebook.hermes.intl.b.n nVar, com.facebook.hermes.intl.b.i iVar, com.facebook.hermes.intl.b.c cVar, com.facebook.hermes.intl.b.f fVar, com.facebook.hermes.intl.b.h hVar, com.facebook.hermes.intl.b.j jVar, com.facebook.hermes.intl.b.l lVar, com.facebook.hermes.intl.b.g gVar, Object obj, com.facebook.hermes.intl.b.EnumC0434b enumC0434b, com.facebook.hermes.intl.b.k kVar, Object obj2) throws JSRangeErrorException {
        Calendar calendar;
        em.b<?> bVar2;
        String strJ = j(bVar, mVar, dVar, nVar, iVar, cVar, fVar, hVar, jVar, lVar, gVar, enumC0434b, kVar, obj2);
        if (str.isEmpty()) {
            calendar = null;
        } else {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(em.d.h(str));
            em.b<?> bVarF = bVar.f();
            bVarF.c("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) bVarF.getLocale());
        }
        if (str2.isEmpty()) {
            bVar2 = bVar;
        } else {
            try {
                if (NumberingSystem.getInstanceByName(em.d.h(str2)) == null) {
                    throw new JSRangeErrorException("Invalid numbering system: " + str2);
                }
                ArrayList<String> arrayList2 = new ArrayList<>();
                arrayList2.add(em.d.h(str2));
                bVar2 = bVar;
                bVar2.c("nu", arrayList2);
            } catch (RuntimeException unused) {
                throw new JSRangeErrorException("Invalid numbering system: " + str2);
            }
        }
        if (calendar != null) {
            this.f21662a = DateFormat.getPatternInstance(calendar, strJ, (ULocale) bVar2.getLocale());
        } else {
            this.f21662a = DateFormat.getPatternInstance(strJ, (ULocale) bVar2.getLocale());
        }
        if (em.d.n(obj) || em.d.j(obj)) {
            return;
        }
        this.f21662a.setTimeZone(TimeZone.getTimeZone(em.d.h(obj)));
    }

    @Override // com.facebook.hermes.intl.b
    public String e(AttributedCharacterIterator.Attribute attribute, String str) {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute == DateFormat.Field.YEAR) {
            try {
                Double.parseDouble(str);
                return "year";
            } catch (NumberFormatException unused) {
                return "yearName";
            }
        }
        if (attribute == DateFormat.Field.MONTH) {
            return "month";
        }
        if (attribute == DateFormat.Field.DAY_OF_MONTH) {
            return "day";
        }
        if (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) {
            return "hour";
        }
        if (attribute == DateFormat.Field.MINUTE) {
            return "minute";
        }
        if (attribute == DateFormat.Field.SECOND) {
            return "second";
        }
        if (attribute == DateFormat.Field.TIME_ZONE) {
            return "timeZoneName";
        }
        if (attribute == DateFormat.Field.AM_PM) {
            return "dayPeriod";
        }
        return attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
    }

    @Override // com.facebook.hermes.intl.b
    public com.facebook.hermes.intl.b.g f(em.b<?> bVar) {
        try {
            String strA = b.a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) bVar.getLocale())).toPattern());
            if (strA.contains(String.valueOf('h'))) {
                return com.facebook.hermes.intl.b.g.H12;
            }
            if (strA.contains(String.valueOf('K'))) {
                return com.facebook.hermes.intl.b.g.H11;
            }
            return strA.contains(String.valueOf('H')) ? com.facebook.hermes.intl.b.g.H23 : com.facebook.hermes.intl.b.g.H24;
        } catch (ClassCastException unused) {
            return com.facebook.hermes.intl.b.g.H24;
        }
    }

    @Override // com.facebook.hermes.intl.b
    public String g(em.b<?> bVar) {
        return em.g.d(DateFormat.getDateInstance(3, (ULocale) bVar.getLocale()).getCalendar().getType());
    }

    @Override // com.facebook.hermes.intl.b
    public String h(em.b<?> bVar) {
        return Calendar.getInstance((ULocale) bVar.getLocale()).getTimeZone().getID();
    }
}
