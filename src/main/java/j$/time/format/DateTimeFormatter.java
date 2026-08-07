package j$.time.format;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.actions.SearchIntents;
import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_DATE_TIME;
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DateTimeFormatter f82057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DateTimeFormatter f82058h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f82059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f82060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f82061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f82062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j$.time.chrono.l f82063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ZoneId f82064f;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:148:0x0265  */
    /* JADX WARN: Code duplicated, block: B:249:0x045b  */
    /* JADX WARN: Code duplicated, block: B:251:0x0465  */
    /* JADX WARN: Code duplicated, block: B:252:0x0469  */
    /* JADX WARN: Code duplicated, block: B:285:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0474 A[SYNTHETIC] */
    public static DateTimeFormatter ofPattern(String str) {
        String strSubstring;
        boolean z11;
        int i11;
        int i12;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        Objects.requireNonNull(str, "pattern");
        int i13 = 0;
        while (i13 < str.length()) {
            char cCharAt = str.charAt(i13);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i14 = i13 + 1;
                while (i14 < str.length() && str.charAt(i14) == cCharAt) {
                    i14++;
                }
                int i15 = i14 - i13;
                if (cCharAt == 'p') {
                    if (i14 >= str.length() || (((cCharAt = str.charAt(i14)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i11 = i14;
                        i12 = i15;
                        i15 = 0;
                    } else {
                        i11 = i14 + 1;
                        while (i11 < str.length() && str.charAt(i11) == cCharAt) {
                            i11++;
                        }
                        i12 = i11 - i14;
                    }
                    if (i15 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i15 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i15);
                    }
                    DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder.f82067a;
                    dateTimeFormatterBuilder2.f82071e = i15;
                    dateTimeFormatterBuilder2.f82072f = ' ';
                    dateTimeFormatterBuilder2.f82073g = -1;
                    i15 = i12;
                    i14 = i11;
                }
                j$.time.temporal.p pVar = (j$.time.temporal.p) ((HashMap) DateTimeFormatterBuilder.f82066i).get(Character.valueOf(cCharAt));
                if (pVar != null) {
                    if (cCharAt == 'A') {
                        dateTimeFormatterBuilder.l(pVar, i15, 19, d0.NOT_NEGATIVE);
                    } else {
                        if (cCharAt == 'Q') {
                            z11 = false;
                        } else if (cCharAt == 'S') {
                            dateTimeFormatterBuilder.b(j$.time.temporal.a.NANO_OF_SECOND, i15, i15, false);
                        } else if (cCharAt == 'a') {
                            if (i15 != 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            dateTimeFormatterBuilder.h(pVar, e0.SHORT);
                        } else if (cCharAt == 'k') {
                            if (i15 == 1) {
                                dateTimeFormatterBuilder.j(pVar);
                            } else {
                                if (i15 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                dateTimeFormatterBuilder.k(pVar, i15);
                            }
                        } else if (cCharAt == 'q') {
                            z11 = true;
                        } else if (cCharAt == 's') {
                            if (i15 == 1) {
                                dateTimeFormatterBuilder.j(pVar);
                            } else {
                                if (i15 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                dateTimeFormatterBuilder.k(pVar, i15);
                            }
                        } else if (cCharAt == 'u' || cCharAt == 'y') {
                            if (i15 == 2) {
                                LocalDate localDate = o.f82127h;
                                Objects.requireNonNull(localDate, "baseDate");
                                dateTimeFormatterBuilder.i(new o(pVar, 2, 2, localDate, 0));
                            } else if (i15 < 4) {
                                dateTimeFormatterBuilder.l(pVar, i15, 19, d0.NORMAL);
                            } else {
                                dateTimeFormatterBuilder.l(pVar, i15, 19, d0.EXCEEDS_PAD);
                            }
                        } else if (cCharAt == 'g') {
                            dateTimeFormatterBuilder.l(pVar, i15, 19, d0.NORMAL);
                        } else if (cCharAt == 'h' || cCharAt == 'm') {
                            if (i15 == 1) {
                                dateTimeFormatterBuilder.j(pVar);
                            } else {
                                if (i15 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                dateTimeFormatterBuilder.k(pVar, i15);
                            }
                        } else if (cCharAt != 'n') {
                            switch (cCharAt) {
                                case 'D':
                                    if (i15 == 1) {
                                        dateTimeFormatterBuilder.j(pVar);
                                    } else {
                                        if (i15 != 2 && i15 != 3) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        dateTimeFormatterBuilder.l(pVar, i15, 3, d0.NOT_NEGATIVE);
                                    }
                                    break;
                                case 'E':
                                    z11 = false;
                                    break;
                                case 'F':
                                    if (i15 != 1) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    dateTimeFormatterBuilder.j(pVar);
                                    break;
                                    break;
                                case 'G':
                                    if (i15 == 1 || i15 == 2 || i15 == 3) {
                                        dateTimeFormatterBuilder.h(pVar, e0.SHORT);
                                    } else if (i15 == 4) {
                                        dateTimeFormatterBuilder.h(pVar, e0.FULL);
                                    } else {
                                        if (i15 != 5) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        dateTimeFormatterBuilder.h(pVar, e0.NARROW);
                                    }
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'K':
                                            break;
                                        case 'L':
                                            z11 = true;
                                            break;
                                        case 'M':
                                            z11 = false;
                                            break;
                                        case 'N':
                                            dateTimeFormatterBuilder.l(pVar, i15, 19, d0.NOT_NEGATIVE);
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case 'c':
                                                    if (i15 == 1) {
                                                        int i16 = i15;
                                                        dateTimeFormatterBuilder.i(new r(cCharAt, i16, i16, i16, 0));
                                                    } else {
                                                        if (i15 == 2) {
                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                        }
                                                        z11 = true;
                                                    }
                                                    break;
                                                case 'd':
                                                    break;
                                                case 'e':
                                                    z11 = false;
                                                    break;
                                                default:
                                                    if (i15 != 1) {
                                                        dateTimeFormatterBuilder.k(pVar, i15);
                                                    } else {
                                                        dateTimeFormatterBuilder.j(pVar);
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                case 'H':
                                    if (i15 == 1) {
                                        dateTimeFormatterBuilder.j(pVar);
                                    } else {
                                        if (i15 == 2) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        dateTimeFormatterBuilder.k(pVar, i15);
                                    }
                                    break;
                            }
                        } else {
                            dateTimeFormatterBuilder.l(pVar, i15, 19, d0.NOT_NEGATIVE);
                        }
                        if (i15 == 1 || i15 == 2) {
                            if (cCharAt == 'e') {
                                int i17 = i15;
                                dateTimeFormatterBuilder.i(new r(cCharAt, i17, i17, i17, 0));
                            } else if (cCharAt == 'E') {
                                dateTimeFormatterBuilder.h(pVar, e0.SHORT);
                            } else if (i15 == 1) {
                                dateTimeFormatterBuilder.j(pVar);
                            } else {
                                dateTimeFormatterBuilder.k(pVar, 2);
                            }
                        } else if (i15 == 3) {
                            dateTimeFormatterBuilder.h(pVar, z11 ? e0.SHORT_STANDALONE : e0.SHORT);
                        } else if (i15 == 4) {
                            dateTimeFormatterBuilder.h(pVar, z11 ? e0.FULL_STANDALONE : e0.FULL);
                        } else {
                            if (i15 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            dateTimeFormatterBuilder.h(pVar, z11 ? e0.NARROW_STANDALONE : e0.NARROW);
                        }
                    }
                } else if (cCharAt == 'z') {
                    if (i15 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    if (i15 == 4) {
                        dateTimeFormatterBuilder.c(new t(e0.FULL, false));
                    } else {
                        dateTimeFormatterBuilder.c(new t(e0.SHORT, false));
                    }
                } else if (cCharAt == 'V') {
                    if (i15 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    dateTimeFormatterBuilder.c(new s(j$.time.temporal.q.f82214a, "ZoneId()"));
                } else if (cCharAt != 'v') {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i15 < 4) {
                            dateTimeFormatterBuilder.appendOffset("+HHMM", "+0000");
                        } else if (i15 == 4) {
                            dateTimeFormatterBuilder.f(e0.FULL);
                        } else {
                            if (i15 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            dateTimeFormatterBuilder.appendOffset("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i15 == 1) {
                            dateTimeFormatterBuilder.f(e0.SHORT);
                        } else {
                            if (i15 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            dateTimeFormatterBuilder.f(e0.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i15 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        dateTimeFormatterBuilder.appendOffset(j.f82108d[i15 + (i15 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i15 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i15 == 1) {
                            str2 = "+00";
                        } else if (i15 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        dateTimeFormatterBuilder.appendOffset(j.f82108d[i15 + (i15 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt != 'W') {
                        int i18 = i15;
                        if (cCharAt == 'w') {
                            if (i18 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            dateTimeFormatterBuilder.i(new r(cCharAt, i18, i18, 2, 0));
                        } else {
                            if (cCharAt != 'Y') {
                                throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                            }
                            if (i18 == 2) {
                                dateTimeFormatterBuilder.i(new r(cCharAt, i18, i18, 2, 0));
                            } else {
                                dateTimeFormatterBuilder.i(new r(cCharAt, i18, i18, 19, 0));
                            }
                        }
                    } else {
                        if (i15 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        int i19 = i15;
                        dateTimeFormatterBuilder.i(new r(cCharAt, i19, i19, i19, 0));
                    }
                } else if (i15 == 1) {
                    dateTimeFormatterBuilder.c(new t(e0.SHORT, true));
                } else {
                    if (i15 != 4) {
                        throw new IllegalArgumentException("Wrong number of  pattern letters: " + cCharAt);
                    }
                    dateTimeFormatterBuilder.c(new t(e0.FULL, true));
                }
                i13 = i14 - 1;
            } else if (cCharAt == '\'') {
                int i21 = i13 + 1;
                int i22 = i21;
                while (i22 < str.length()) {
                    if (str.charAt(i22) == '\'') {
                        int i23 = i22 + 1;
                        if (i23 < str.length() && str.charAt(i23) == '\'') {
                            i22 = i23;
                        } else {
                            if (i22 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            strSubstring = str.substring(i21, i22);
                            if (strSubstring.isEmpty()) {
                                dateTimeFormatterBuilder.d(CoreConstants.SINGLE_QUOTE_CHAR);
                            } else {
                                dateTimeFormatterBuilder.e(strSubstring.replace("''", "'"));
                            }
                            i13 = i22;
                        }
                    }
                    i22++;
                }
                if (i22 < str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                }
                strSubstring = str.substring(i21, i22);
                if (strSubstring.isEmpty()) {
                    dateTimeFormatterBuilder.d(CoreConstants.SINGLE_QUOTE_CHAR);
                } else {
                    dateTimeFormatterBuilder.e(strSubstring.replace("''", "'"));
                }
                i13 = i22;
            } else if (cCharAt == '[') {
                dateTimeFormatterBuilder.n();
            } else if (cCharAt == ']') {
                if (dateTimeFormatterBuilder.f82067a.f82068b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                dateTimeFormatterBuilder.m();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                dateTimeFormatterBuilder.d(cCharAt);
            }
            i13++;
        }
        return dateTimeFormatterBuilder.toFormatter();
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        d0 d0Var = d0.EXCEEDS_PAD;
        dateTimeFormatterBuilder.l(aVar, 4, 10, d0Var);
        dateTimeFormatterBuilder.d(CoreConstants.DASH_CHAR);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.k(aVar2, 2);
        dateTimeFormatterBuilder.d(CoreConstants.DASH_CHAR);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        dateTimeFormatterBuilder.k(aVar3, 2);
        c0 c0Var = c0.STRICT;
        j$.time.chrono.s sVar = j$.time.chrono.s.f82037c;
        DateTimeFormatter dateTimeFormatterO = dateTimeFormatterBuilder.o(c0Var, sVar);
        ISO_LOCAL_DATE = dateTimeFormatterO;
        DateTimeFormatterBuilder caseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive.a(dateTimeFormatterO);
        caseInsensitive.appendOffsetId().o(c0Var, sVar);
        DateTimeFormatterBuilder caseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive2.a(dateTimeFormatterO);
        caseInsensitive2.n();
        caseInsensitive2.appendOffsetId().o(c0Var, sVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        dateTimeFormatterBuilder2.k(aVar4, 2);
        dateTimeFormatterBuilder2.d(CoreConstants.COLON_CHAR);
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder2.k(aVar5, 2);
        dateTimeFormatterBuilder2.n();
        dateTimeFormatterBuilder2.d(CoreConstants.COLON_CHAR);
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder2.k(aVar6, 2);
        dateTimeFormatterBuilder2.n();
        dateTimeFormatterBuilder2.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterO2 = dateTimeFormatterBuilder2.o(c0Var, null);
        f82057g = dateTimeFormatterO2;
        DateTimeFormatterBuilder caseInsensitive3 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive3.a(dateTimeFormatterO2);
        caseInsensitive3.appendOffsetId().o(c0Var, null);
        DateTimeFormatterBuilder caseInsensitive4 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive4.a(dateTimeFormatterO2);
        caseInsensitive4.n();
        caseInsensitive4.appendOffsetId().o(c0Var, null);
        DateTimeFormatterBuilder caseInsensitive5 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive5.a(dateTimeFormatterO);
        caseInsensitive5.d('T');
        caseInsensitive5.a(dateTimeFormatterO2);
        DateTimeFormatter dateTimeFormatterO3 = caseInsensitive5.o(c0Var, sVar);
        DateTimeFormatterBuilder caseInsensitive6 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive6.a(dateTimeFormatterO3);
        p pVar = p.LENIENT;
        caseInsensitive6.c(pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId = caseInsensitive6.appendOffsetId();
        p pVar2 = p.STRICT;
        dateTimeFormatterBuilderAppendOffsetId.c(pVar2);
        DateTimeFormatter dateTimeFormatterO4 = dateTimeFormatterBuilderAppendOffsetId.o(c0Var, sVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.a(dateTimeFormatterO4);
        dateTimeFormatterBuilder3.n();
        dateTimeFormatterBuilder3.d('[');
        p pVar3 = p.SENSITIVE;
        dateTimeFormatterBuilder3.c(pVar3);
        j$.time.e eVar = DateTimeFormatterBuilder.f82065h;
        dateTimeFormatterBuilder3.c(new s(eVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder3.d(']');
        dateTimeFormatterBuilder3.o(c0Var, sVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.a(dateTimeFormatterO3);
        dateTimeFormatterBuilder4.n();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId2 = dateTimeFormatterBuilder4.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId2.n();
        dateTimeFormatterBuilderAppendOffsetId2.d('[');
        dateTimeFormatterBuilderAppendOffsetId2.c(pVar3);
        dateTimeFormatterBuilderAppendOffsetId2.c(new s(eVar, "ZoneRegionId()"));
        dateTimeFormatterBuilderAppendOffsetId2.d(']');
        ISO_DATE_TIME = dateTimeFormatterBuilderAppendOffsetId2.o(c0Var, sVar);
        DateTimeFormatterBuilder caseInsensitive7 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive7.l(aVar, 4, 10, d0Var);
        caseInsensitive7.d(CoreConstants.DASH_CHAR);
        caseInsensitive7.k(j$.time.temporal.a.DAY_OF_YEAR, 3);
        caseInsensitive7.n();
        caseInsensitive7.appendOffsetId().o(c0Var, sVar);
        DateTimeFormatterBuilder caseInsensitive8 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive8.l(j$.time.temporal.i.f82205c, 4, 10, d0Var);
        caseInsensitive8.e("-W");
        caseInsensitive8.k(j$.time.temporal.i.f82204b, 2);
        caseInsensitive8.d(CoreConstants.DASH_CHAR);
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        caseInsensitive8.k(aVar7, 1);
        caseInsensitive8.n();
        caseInsensitive8.appendOffsetId().o(c0Var, sVar);
        DateTimeFormatterBuilder caseInsensitive9 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive9.getClass();
        caseInsensitive9.c(new g());
        f82058h = caseInsensitive9.o(c0Var, null);
        DateTimeFormatterBuilder caseInsensitive10 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive10.k(aVar, 4);
        caseInsensitive10.k(aVar2, 2);
        caseInsensitive10.k(aVar3, 2);
        caseInsensitive10.n();
        caseInsensitive10.c(pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffset = caseInsensitive10.appendOffset("+HHMMss", "Z");
        dateTimeFormatterBuilderAppendOffset.c(pVar2);
        dateTimeFormatterBuilderAppendOffset.o(c0Var, sVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder caseInsensitive11 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive11.c(pVar);
        caseInsensitive11.n();
        caseInsensitive11.g(aVar7, map);
        caseInsensitive11.e(", ");
        caseInsensitive11.m();
        caseInsensitive11.l(aVar3, 1, 2, d0.NOT_NEGATIVE);
        caseInsensitive11.d(' ');
        caseInsensitive11.g(aVar2, map2);
        caseInsensitive11.d(' ');
        caseInsensitive11.k(aVar, 4);
        caseInsensitive11.d(' ');
        caseInsensitive11.k(aVar4, 2);
        caseInsensitive11.d(CoreConstants.COLON_CHAR);
        caseInsensitive11.k(aVar5, 2);
        caseInsensitive11.n();
        caseInsensitive11.d(CoreConstants.COLON_CHAR);
        caseInsensitive11.k(aVar6, 2);
        caseInsensitive11.m();
        caseInsensitive11.d(' ');
        caseInsensitive11.appendOffset("+HHMM", "GMT").o(c0.SMART, sVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, a0 a0Var, c0 c0Var, j$.time.chrono.l lVar, ZoneId zoneId) {
        Objects.requireNonNull(dVar, "printerParser");
        this.f82059a = dVar;
        Objects.requireNonNull(locale, "locale");
        this.f82060b = locale;
        Objects.requireNonNull(a0Var, "decimalStyle");
        this.f82061c = a0Var;
        Objects.requireNonNull(c0Var, "resolverStyle");
        this.f82062d = c0Var;
        this.f82063e = lVar;
        this.f82064f = zoneId;
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.f82064f, zoneId)) {
            return this;
        }
        return new DateTimeFormatter(this.f82059a, this.f82060b, this.f82061c, this.f82062d, this.f82063e, zoneId);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb2 = new StringBuilder(32);
        d dVar = this.f82059a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            dVar.s(new w(temporalAccessor, this), sb2);
            return sb2.toString();
        } catch (IOException e11) {
            throw new DateTimeException(e11.getMessage(), e11);
        }
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(temporalQuery, SearchIntents.EXTRA_QUERY);
        try {
            return (T) a(charSequence).b(temporalQuery);
        } catch (DateTimeParseException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e12.getMessage(), e12);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0291  */
    /* JADX WARN: Code duplicated, block: B:132:0x0328  */
    /* JADX WARN: Code duplicated, block: B:134:0x0334  */
    /* JADX WARN: Code duplicated, block: B:135:0x0361  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x026b  */
    public final b0 a(CharSequence charSequence) {
        String string;
        long j11;
        long j12;
        j$.time.temporal.p pVar;
        j$.time.temporal.a aVar;
        Map map;
        j$.time.temporal.a aVar2;
        j$.time.temporal.p pVar2;
        int i11 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        u uVar = new u(this);
        int iW = this.f82059a.w(uVar, charSequence, parsePosition.getIndex());
        if (iW < 0) {
            parsePosition.setErrorIndex(~iW);
            uVar = null;
        } else {
            parsePosition.setIndex(iW);
        }
        if (uVar != null) {
            DateTimeFormatter dateTimeFormatter = uVar.f82145a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                b0 b0VarC = uVar.c();
                j$.time.chrono.l lVar = uVar.c().f82079c;
                if (lVar == null && (lVar = dateTimeFormatter.f82063e) == null) {
                    lVar = j$.time.chrono.s.f82037c;
                }
                b0VarC.f82079c = lVar;
                ZoneId zoneId = b0VarC.f82078b;
                if (zoneId == null) {
                    zoneId = dateTimeFormatter.f82064f;
                }
                b0VarC.f82078b = zoneId;
                b0VarC.f82081e = this.f82062d;
                b0VarC.m();
                b0VarC.u(b0VarC.f82079c.M(b0VarC.f82077a, b0VarC.f82081e));
                b0VarC.q();
                if (((HashMap) b0VarC.f82077a).size() > 0) {
                    loop0: while (i11 < 50) {
                        Iterator it = ((HashMap) b0VarC.f82077a).entrySet().iterator();
                        do {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            pVar2 = (j$.time.temporal.p) ((Map.Entry) it.next()).getKey();
                            TemporalAccessor temporalAccessorB = pVar2.B(b0VarC.f82077a, b0VarC, b0VarC.f82081e);
                            if (temporalAccessorB != null) {
                                if (temporalAccessorB instanceof j$.time.chrono.i) {
                                    j$.time.chrono.i iVar = (j$.time.chrono.i) temporalAccessorB;
                                    ZoneId zoneId2 = b0VarC.f82078b;
                                    if (zoneId2 == null) {
                                        b0VarC.f82078b = iVar.getZone();
                                    } else if (!zoneId2.equals(iVar.getZone())) {
                                        throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + b0VarC.f82078b);
                                    }
                                    temporalAccessorB = iVar.toLocalDateTime();
                                }
                                if (temporalAccessorB instanceof j$.time.chrono.d) {
                                    j$.time.chrono.d dVar = (j$.time.chrono.d) temporalAccessorB;
                                    b0VarC.s(dVar.toLocalTime(), j$.time.n.f82174d);
                                    b0VarC.u(dVar.toLocalDate());
                                    break;
                                }
                                if (temporalAccessorB instanceof ChronoLocalDate) {
                                    b0VarC.u((ChronoLocalDate) temporalAccessorB);
                                    break;
                                }
                                if (temporalAccessorB instanceof LocalTime) {
                                    b0VarC.s((LocalTime) temporalAccessorB, j$.time.n.f82174d);
                                    break;
                                }
                                throw new DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                            }
                        } while (((HashMap) b0VarC.f82077a).containsKey(pVar2));
                        i11++;
                    }
                    if (i11 == 50) {
                        throw new DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
                    }
                    if (i11 > 0) {
                        b0VarC.m();
                        b0VarC.u(b0VarC.f82079c.M(b0VarC.f82077a, b0VarC.f82081e));
                        b0VarC.q();
                    }
                }
                if (b0VarC.f82083g == null) {
                    Map map2 = b0VarC.f82077a;
                    j$.time.temporal.a aVar3 = j$.time.temporal.a.MILLI_OF_SECOND;
                    if (((HashMap) map2).containsKey(aVar3)) {
                        long jLongValue = ((Long) ((HashMap) b0VarC.f82077a).remove(aVar3)).longValue();
                        Map map3 = b0VarC.f82077a;
                        j$.time.temporal.a aVar4 = j$.time.temporal.a.MICRO_OF_SECOND;
                        if (((HashMap) map3).containsKey(aVar4)) {
                            long jLongValue2 = (((Long) ((HashMap) b0VarC.f82077a).get(aVar4)).longValue() % 1000) + (jLongValue * 1000);
                            b0VarC.v(aVar3, aVar4, Long.valueOf(jLongValue2));
                            ((HashMap) b0VarC.f82077a).remove(aVar4);
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                        } else {
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                        }
                    } else {
                        Map map4 = b0VarC.f82077a;
                        j$.time.temporal.a aVar5 = j$.time.temporal.a.MICRO_OF_SECOND;
                        if (((HashMap) map4).containsKey(aVar5)) {
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) b0VarC.f82077a).remove(aVar5)).longValue() * 1000));
                        }
                    }
                    Map map5 = b0VarC.f82077a;
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.HOUR_OF_DAY;
                    Long l11 = (Long) ((HashMap) map5).get(aVar6);
                    if (l11 != null) {
                        Map map6 = b0VarC.f82077a;
                        j$.time.temporal.a aVar7 = j$.time.temporal.a.MINUTE_OF_HOUR;
                        Long l12 = (Long) ((HashMap) map6).get(aVar7);
                        Map map7 = b0VarC.f82077a;
                        j$.time.temporal.a aVar8 = j$.time.temporal.a.SECOND_OF_MINUTE;
                        Long l13 = (Long) ((HashMap) map7).get(aVar8);
                        Map map8 = b0VarC.f82077a;
                        j$.time.temporal.a aVar9 = j$.time.temporal.a.NANO_OF_SECOND;
                        Long l14 = (Long) ((HashMap) map8).get(aVar9);
                        if ((l12 != null || (l13 == null && l14 == null)) && (l12 == null || l13 != null || l14 == null)) {
                            j11 = 1000000;
                            j12 = 1000;
                            b0VarC.p(l11.longValue(), l12 != null ? l12.longValue() : 0L, l13 != null ? l13.longValue() : 0L, l14 != null ? l14.longValue() : 0L);
                            ((HashMap) b0VarC.f82077a).remove(aVar6);
                            ((HashMap) b0VarC.f82077a).remove(aVar7);
                            ((HashMap) b0VarC.f82077a).remove(aVar8);
                            ((HashMap) b0VarC.f82077a).remove(aVar9);
                        } else {
                            j11 = 1000000;
                            j12 = 1000;
                        }
                    } else {
                        j11 = 1000000;
                        j12 = 1000;
                    }
                    if (b0VarC.f82081e != c0.LENIENT && ((HashMap) b0VarC.f82077a).size() > 0) {
                        for (Map.Entry entry : ((HashMap) b0VarC.f82077a).entrySet()) {
                            pVar = (j$.time.temporal.p) entry.getKey();
                            if (pVar instanceof j$.time.temporal.a) {
                                aVar = (j$.time.temporal.a) pVar;
                                if (aVar.S()) {
                                    aVar.R(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                } else {
                    j11 = 1000000;
                    j12 = 1000;
                    if (b0VarC.f82081e != c0.LENIENT) {
                        while (r1.hasNext()) {
                            pVar = (j$.time.temporal.p) entry.getKey();
                            if (pVar instanceof j$.time.temporal.a) {
                                aVar = (j$.time.temporal.a) pVar;
                                if (aVar.S()) {
                                    aVar.R(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                }
                ChronoLocalDate chronoLocalDate = b0VarC.f82082f;
                if (chronoLocalDate != null) {
                    b0VarC.l(chronoLocalDate);
                }
                LocalTime localTime = b0VarC.f82083g;
                if (localTime != null) {
                    b0VarC.l(localTime);
                    if (b0VarC.f82082f != null && ((HashMap) b0VarC.f82077a).size() > 0) {
                        b0VarC.l(b0VarC.f82082f.F(b0VarC.f82083g));
                    }
                }
                if (b0VarC.f82082f != null && b0VarC.f82083g != null) {
                    j$.time.n nVar = b0VarC.f82084h;
                    nVar.getClass();
                    j$.time.n nVar2 = j$.time.n.f82174d;
                    if (nVar != nVar2) {
                        b0VarC.f82082f = b0VarC.f82082f.L(b0VarC.f82084h);
                        b0VarC.f82084h = nVar2;
                    }
                }
                if (b0VarC.f82083g == null) {
                    if (((HashMap) b0VarC.f82077a).containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
                        map = b0VarC.f82077a;
                        aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(aVar2)) {
                            long jLongValue3 = ((Long) ((HashMap) b0VarC.f82077a).get(aVar2)).longValue();
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / j12));
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / j11));
                        } else {
                            ((HashMap) b0VarC.f82077a).put(aVar2, 0L);
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) b0VarC.f82077a).containsKey(j$.time.temporal.a.SECOND_OF_DAY)) {
                        map = b0VarC.f82077a;
                        aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(aVar2)) {
                            long jLongValue4 = ((Long) ((HashMap) b0VarC.f82077a).get(aVar2)).longValue();
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue4 / j12));
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue4 / j11));
                        } else {
                            ((HashMap) b0VarC.f82077a).put(aVar2, 0L);
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) b0VarC.f82077a).containsKey(j$.time.temporal.a.SECOND_OF_MINUTE)) {
                        map = b0VarC.f82077a;
                        aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(aVar2)) {
                            long jLongValue5 = ((Long) ((HashMap) b0VarC.f82077a).get(aVar2)).longValue();
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue5 / j12));
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue5 / j11));
                        } else {
                            ((HashMap) b0VarC.f82077a).put(aVar2, 0L);
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                            ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                        }
                    }
                }
                if (b0VarC.f82082f != null && b0VarC.f82083g != null) {
                    Long l15 = (Long) ((HashMap) b0VarC.f82077a).get(j$.time.temporal.a.OFFSET_SECONDS);
                    if (l15 != null) {
                        ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(b0VarC.f82082f.F(b0VarC.f82083g).A(ZoneOffset.ofTotalSeconds(l15.intValue())).toEpochSecond()));
                        return b0VarC;
                    }
                    if (b0VarC.f82078b != null) {
                        ((HashMap) b0VarC.f82077a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(b0VarC.f82082f.F(b0VarC.f82083g).A(b0VarC.f82078b).toEpochSecond()));
                    }
                }
                return b0VarC;
            }
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(str, charSequence);
        }
        String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new DateTimeParseException(str2, charSequence);
    }

    public final String toString() {
        String string = this.f82059a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
