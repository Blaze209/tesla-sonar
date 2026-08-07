package com.facebook.hermes.intl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    public enum a {
        BOOLEAN,
        STRING
    }

    public static Object a(String str, Object obj, Object obj2, Object obj3, Object obj4) throws JSRangeErrorException {
        if (em.d.n(obj)) {
            return obj4;
        }
        if (!em.d.k(obj)) {
            throw new JSRangeErrorException(str + " value is invalid.");
        }
        double dF = em.d.f(obj);
        if (!Double.isNaN(dF) && dF <= em.d.f(obj3) && dF >= em.d.f(obj2)) {
            return obj;
        }
        throw new JSRangeErrorException(str + " value is invalid.");
    }

    public static Object b(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        return a(str, em.d.a(obj, str), obj2, obj3, obj4);
    }

    public static Object c(Object obj, String str, a aVar, Object obj2, Object obj3) throws JSRangeErrorException {
        Object objA = em.d.a(obj, str);
        if (em.d.n(objA)) {
            return obj3;
        }
        if (em.d.j(objA)) {
            objA = "";
        }
        if (aVar == a.BOOLEAN && !em.d.i(objA)) {
            throw new JSRangeErrorException("Boolean option expected but not found");
        }
        if (aVar == a.STRING && !em.d.m(objA)) {
            throw new JSRangeErrorException("String option expected but not found");
        }
        if (em.d.n(obj2) || Arrays.asList((Object[]) obj2).contains(objA)) {
            return objA;
        }
        throw new JSRangeErrorException("String option expected but not found");
    }

    public static <T extends Enum<T>> T d(Class<T> cls, Object obj) {
        try {
            if (em.d.n(obj)) {
                return (T) Enum.valueOf(cls, "UNDEFINED");
            }
            if (em.d.j(obj)) {
                return null;
            }
            String strH = em.d.h(obj);
            if (strH.equals("2-digit")) {
                return (T) Enum.valueOf(cls, "DIGIT2");
            }
            for (T t11 : cls.getEnumConstants()) {
                if (t11.name().compareToIgnoreCase(strH) == 0) {
                    return t11;
                }
            }
            return null;
        } catch (IllegalArgumentException unused) {
        }
    }
}
