package net.time4j.i18n;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.format.y;
import net.time4j.x0;

/* JADX INFO: loaded from: classes9.dex */
public class i implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<String> f94657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, x0> f94658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, x0> f94659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, x0> f94660e;

    public i() {
        String strSubstring;
        x0 x0Var;
        HashMap map;
        URI uriF = net.time4j.base.d.c().f("i18n", i.class, "data/week.data");
        InputStream inputStreamE = net.time4j.base.d.c().e(uriF, true);
        if (inputStreamE == null) {
            try {
                inputStreamE = net.time4j.base.d.c().d(i.class, "data/week.data", true);
            } catch (IOException unused) {
            }
        }
        if (inputStreamE == null) {
            this.f94656a = "@STATIC";
            this.f94657b = Collections.EMPTY_SET;
            Map<String, x0> map2 = Collections.EMPTY_MAP;
            this.f94658c = map2;
            this.f94659d = map2;
            this.f94660e = map2;
            System.err.println("Warning: File \"data/week.data\" not found.");
            return;
        }
        this.f94656a = "@" + uriF;
        HashSet hashSet = new HashSet();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        try {
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamE, "US-ASCII"));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            this.f94657b = Collections.unmodifiableSet(hashSet);
                            this.f94658c = Collections.unmodifiableMap(map3);
                            this.f94659d = Collections.unmodifiableMap(map4);
                            this.f94660e = Collections.unmodifiableMap(map5);
                            try {
                                inputStreamE.close();
                                return;
                            } catch (IOException e11) {
                                e11.printStackTrace(System.err);
                                return;
                            }
                        }
                        if (!line.startsWith("#")) {
                            int iIndexOf = line.indexOf(61);
                            int i11 = 0;
                            String strTrim = line.substring(0, iIndexOf).trim();
                            String[] strArrSplit = line.substring(iIndexOf + 1).split(" ");
                            if (strTrim.equals("minDays-4")) {
                                int length = strArrSplit.length;
                                while (i11 < length) {
                                    String upperCase = strArrSplit[i11].trim().toUpperCase(Locale.US);
                                    if (!upperCase.isEmpty()) {
                                        hashSet.add(upperCase);
                                    }
                                    i11++;
                                }
                            } else {
                                if (strTrim.startsWith("start-")) {
                                    strSubstring = strTrim.substring(6);
                                    x0Var = x0.SATURDAY;
                                    map = map4;
                                } else if (strTrim.startsWith("end-")) {
                                    strSubstring = strTrim.substring(4);
                                    x0Var = x0.SUNDAY;
                                    map = map5;
                                } else {
                                    if (!strTrim.startsWith("first-")) {
                                        throw new IllegalStateException("Unexpected format: " + this.f94656a);
                                    }
                                    strSubstring = strTrim.substring(6);
                                    x0Var = x0.MONDAY;
                                    map = map3;
                                }
                                if (strSubstring.equals("sun")) {
                                    x0Var = x0.SUNDAY;
                                } else if (strSubstring.equals("sat")) {
                                    x0Var = x0.SATURDAY;
                                } else if (strSubstring.equals("fri")) {
                                    x0Var = x0.FRIDAY;
                                } else if (strSubstring.equals("thu")) {
                                    x0Var = x0.THURSDAY;
                                } else if (strSubstring.equals("wed")) {
                                    x0Var = x0.WEDNESDAY;
                                } else if (strSubstring.equals("tue")) {
                                    x0Var = x0.TUESDAY;
                                } else if (strSubstring.equals("mon")) {
                                    x0Var = x0.MONDAY;
                                }
                                int length2 = strArrSplit.length;
                                while (i11 < length2) {
                                    String upperCase2 = strArrSplit[i11].trim().toUpperCase(Locale.US);
                                    if (!upperCase2.isEmpty()) {
                                        map.put(upperCase2, x0Var);
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                } catch (Exception e12) {
                    throw new IllegalStateException("Unexpected format: " + this.f94656a, e12);
                }
            } catch (UnsupportedEncodingException e13) {
                throw new AssertionError(e13);
            }
        } catch (Throwable th2) {
            try {
                inputStreamE.close();
            } catch (IOException e14) {
                e14.printStackTrace(System.err);
            }
            throw th2;
        }
    }

    @Override // net.time4j.format.y
    public int a(Locale locale) {
        String country = locale.getCountry();
        x0 x0Var = x0.SUNDAY;
        if (this.f94660e.containsKey(country)) {
            x0Var = this.f94660e.get(country);
        }
        return x0Var.getValue();
    }

    @Override // net.time4j.format.y
    public int b(Locale locale) {
        String country = locale.getCountry();
        x0 x0Var = x0.SATURDAY;
        if (this.f94659d.containsKey(country)) {
            x0Var = this.f94659d.get(country);
        }
        return x0Var.getValue();
    }

    @Override // net.time4j.format.y
    public int c(Locale locale) {
        if (this.f94657b.isEmpty()) {
            return new GregorianCalendar(locale).getMinimalDaysInFirstWeek();
        }
        String country = locale.getCountry();
        return ((country.isEmpty() && locale.getLanguage().isEmpty()) || this.f94657b.contains(country)) ? 4 : 1;
    }

    @Override // net.time4j.format.y
    public int d(Locale locale) {
        if (this.f94658c.isEmpty()) {
            int firstDayOfWeek = new GregorianCalendar(locale).getFirstDayOfWeek();
            if (firstDayOfWeek == 1) {
                return 7;
            }
            return firstDayOfWeek - 1;
        }
        String country = locale.getCountry();
        x0 x0Var = x0.MONDAY;
        if (this.f94658c.containsKey(country)) {
            x0Var = this.f94658c.get(country);
        }
        return x0Var.getValue();
    }

    public String toString() {
        return getClass().getName() + this.f94656a;
    }
}
