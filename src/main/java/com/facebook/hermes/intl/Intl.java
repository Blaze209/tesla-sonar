package com.facebook.hermes.intl;

import android.icu.lang.UCharacter;
import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@in.a
public class Intl {
    private static List<String> a(List<String> list) throws JSRangeErrorException {
        if (list.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str == null) {
                throw new JSRangeErrorException("Incorrect locale information provided");
            }
            if (str.isEmpty()) {
                throw new JSRangeErrorException("Incorrect locale information provided");
            }
            String strA = d.a(str);
            if (!strA.isEmpty() && !arrayList.contains(strA)) {
                arrayList.add(strA);
            }
        }
        return arrayList;
    }

    @in.a
    public static List<String> getCanonicalLocales(List<String> list) {
        return a(list);
    }

    @in.a
    public static String toLocaleLowerCase(List<String> list, String str) {
        return UCharacter.toLowerCase((ULocale) e.c((String[]) list.toArray(new String[list.size()])).f21657a.getLocale(), str);
    }

    @in.a
    public static String toLocaleUpperCase(List<String> list, String str) {
        return UCharacter.toUpperCase((ULocale) e.c((String[]) list.toArray(new String[list.size()])).f21657a.getLocale(), str);
    }
}
