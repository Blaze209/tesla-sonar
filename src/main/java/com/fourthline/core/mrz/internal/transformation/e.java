package com.fourthline.core.mrz.internal.transformation;

import com.fourthline.core.Gender;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f24300a = new a(null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.fourthline.core.mrz.internal.transformation.d
    public MrzInfo a(com.fourthline.core.mrz.internal.parsing.model.d parsedMrz, List validationErrors, String rawMrz) {
        Gender gender;
        s.k(parsedMrz, "parsedMrz");
        s.k(validationErrors, "validationErrors");
        s.k(rawMrz, "rawMrz");
        if (!(parsedMrz instanceof com.fourthline.core.mrz.internal.parsing.model.c)) {
            throw new IllegalArgumentException("This PARSED MRZ type is not supported.");
        }
        com.fourthline.core.mrz.internal.parsing.model.c cVar = (com.fourthline.core.mrz.internal.parsing.model.c) parsedMrz;
        String strD = cVar.d();
        String strK = cVar.k();
        String strA = cVar.e().a();
        Date dateA = a(cVar);
        List listA = a(cVar.i());
        List listA2 = a(cVar.l());
        Date dateA2 = cVar.a();
        if (dateA2 == null) {
            dateA2 = new Date();
        }
        Date date = dateA2;
        String strM = cVar.m();
        String strJ = cVar.j();
        if (s.f(strJ, ezvcard.property.Gender.FEMALE)) {
            gender = Gender.FEMALE;
        } else {
            gender = s.f(strJ, ezvcard.property.Gender.MALE) ? Gender.MALE : Gender.UNKNOWN;
        }
        return new MrtdMrzInfo(strD, strK, strA, dateA, listA, listA2, date, strM, gender, cVar.n(), rawMrz, validationErrors);
    }

    private final Date a(com.fourthline.core.mrz.internal.parsing.model.c cVar) {
        if (s.f(cVar.d() + cVar.k(), "IDESP") && s.f(cVar.h(), "990101")) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(0L);
            calendar.set(9999, 0, 1);
            Date time = calendar.getTime();
            s.j(time, "getTime(...)");
            return time;
        }
        Date dateF = cVar.f();
        return dateF == null ? new Date() : dateF;
    }

    private final List a(List list) {
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
            s.j(upperCase, "toUpperCase(...)");
            arrayList.add(upperCase);
        }
        return arrayList;
    }
}
