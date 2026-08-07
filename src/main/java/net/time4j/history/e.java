package net.time4j.history;

import net.time4j.engine.z;
import net.time4j.g0;

/* JADX INFO: loaded from: classes9.dex */
public enum e {
    WESTERN,
    EASTERN;

    public g0 easterSunday(int i11) {
        int i12;
        int iMarchDay = marchDay(i11);
        if (iMarchDay > 31) {
            iMarchDay -= 31;
            i12 = 4;
        } else {
            i12 = 3;
        }
        return (this != WESTERN || i11 <= 1582) ? g0.O0(m.h(i11, i12, iMarchDay), z.MODIFIED_JULIAN_DATE) : g0.I0(i11, i12, iMarchDay);
    }

    int marchDay(int i11) {
        int i12;
        int i13;
        if (i11 < 532) {
            throw new IllegalArgumentException("Out of range: " + i11);
        }
        int i14 = i11 / 100;
        if (this != WESTERN || i11 <= 1582) {
            i12 = 15;
            i13 = 0;
        } else {
            int i15 = ((i14 * 3) + 3) / 4;
            i12 = (i15 + 15) - (((i14 * 8) + 13) / 25);
            i13 = 2 - i15;
        }
        int i16 = i11 % 19;
        int i17 = ((i16 * 19) + i12) % 30;
        int i18 = i17 / 29;
        int i19 = (i17 + 21) - (i18 + (((i17 / 28) - i18) * (i16 / 11)));
        return i19 + (7 - ((i19 - (7 - (((i11 + (i11 / 4)) + i13) % 7))) % 7));
    }
}
