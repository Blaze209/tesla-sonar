package net.time4j.format;

import java.lang.Comparable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d<V extends Comparable<V>> extends net.time4j.engine.e<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f94217a;

    static {
        HashMap map = new HashMap();
        map.put("YEAR_OF_DISPLAY", "L_year");
        map.put("MONTH_AS_NUMBER", "L_month");
        map.put("HOUR_FROM_0_TO_24", "L_hour");
        map.put("DAY_OF_MONTH", "L_day");
        map.put("DAY_OF_DIVISION", "L_day");
        f94217a = Collections.unmodifiableMap(map);
    }

    protected d(String str) {
        super(str);
    }
}
