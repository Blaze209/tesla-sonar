package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4114zc {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.zc$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(G5 g11, X7 x11) {
        if (x11 == null) {
            return p013kotlin.collections.v.m();
        }
        Calendar calendar = Calendar.getInstance();
        String strC = g11.c();
        if (p013kotlin.jvm.internal.s.f(strC, "FRA")) {
            int i11 = a.$EnumSwitchMapping$0[x11.c().ordinal()];
            if (i11 != 1 && i11 != 2) {
                return p013kotlin.collections.v.m();
            }
            p013kotlin.jvm.internal.s.h(calendar);
            return p013kotlin.collections.v.p(new C3684pc(g11, a(calendar, 15, 2, 2021, 0, 0, 0, 0, 120, null), X7.a(x11, DocumentType.ID_CARD, null, null, false, 14, null)), new C3684pc(g11, null, X7.a(x11, DocumentType.FRENCH_ID_CARD, null, null, false, 14, null)));
        }
        if (!p013kotlin.jvm.internal.s.f(strC, "ROU")) {
            return p013kotlin.collections.v.m();
        }
        int i12 = a.$EnumSwitchMapping$0[x11.c().ordinal()];
        if (i12 != 1 && i12 != 2) {
            return p013kotlin.collections.v.m();
        }
        p013kotlin.jvm.internal.s.h(calendar);
        return p013kotlin.collections.v.p(new C3684pc(g11, a(calendar, 2, 7, 2021, 0, 0, 0, 0, 120, null), X7.a(x11, DocumentType.ID_CARD, null, null, false, 14, null)), new C3684pc(g11, null, X7.a(x11, DocumentType.FRENCH_ID_CARD, null, null, false, 14, null)));
    }

    static /* synthetic */ Date a(Calendar calendar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 8) != 0) {
            i14 = 0;
        }
        if ((i18 & 16) != 0) {
            i15 = 0;
        }
        if ((i18 & 32) != 0) {
            i16 = 0;
        }
        if ((i18 & 64) != 0) {
            i17 = 0;
        }
        return a(calendar, i11, i12, i13, i14, i15, i16, i17);
    }

    private static final Date a(Calendar calendar, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        calendar.set(i13, i12, i11);
        calendar.set(11, i14);
        calendar.set(12, i15);
        calendar.set(13, i16);
        calendar.set(14, i17);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        Date time = calendar.getTime();
        p013kotlin.jvm.internal.s.j(time, "getTime(...)");
        return time;
    }
}
