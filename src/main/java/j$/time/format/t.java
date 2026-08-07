package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f82140i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f82141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f82142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f82143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f82144h;

    public t(e0 e0Var, boolean z11) {
        super(j$.time.temporal.q.f82218e, "ZoneText(" + e0Var + ")");
        this.f82143g = new HashMap();
        this.f82144h = new HashMap();
        Objects.requireNonNull(e0Var, "textStyle");
        this.f82141e = e0Var;
        this.f82142f = z11;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.time.format.s, j$.time.format.e
    public final boolean s(w wVar, StringBuilder sb2) {
        boolean zG;
        String[] strArr;
        ZoneId zoneId = (ZoneId) wVar.b(j$.time.temporal.q.f82214a);
        if (zoneId == null) {
            return false;
        }
        String strM = zoneId.m();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessor = wVar.f82154a;
            String str = null;
            Map concurrentHashMap = null;
            if (this.f82142f) {
                zG = 2;
            } else if (temporalAccessor.h(j$.time.temporal.a.INSTANT_SECONDS)) {
                zG = zoneId.s().g(Instant.w(temporalAccessor));
            } else {
                j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.h(aVar)) {
                    j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                    if (temporalAccessor.h(aVar2)) {
                        LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(temporalAccessor.i(aVar));
                        LocalTime localTimeE = LocalTime.E(temporalAccessor.i(aVar2));
                        localDateOfEpochDay.getClass();
                        LocalDateTime localDateTimeE = LocalDateTime.E(localDateOfEpochDay, localTimeE);
                        Object objE = zoneId.s().e(localDateTimeE);
                        if ((objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null) == null) {
                            j$.time.zone.f fVarS = zoneId.s();
                            ZonedDateTime zonedDateTimeB = ZonedDateTime.B(localDateTimeE, zoneId, null);
                            zG = fVarS.g(Instant.ofEpochSecond(zonedDateTimeB.toEpochSecond(), zonedDateTimeB.f81988a.f81969b.f81975d));
                        } else {
                            zG = 2;
                        }
                    } else {
                        zG = 2;
                    }
                } else {
                    zG = 2;
                }
            }
            Locale locale = wVar.f82155b.f82060b;
            e0 e0Var = e0.NARROW;
            e0 e0Var2 = this.f82141e;
            if (e0Var2 != e0Var) {
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) f82140i;
                SoftReference softReference = (SoftReference) concurrentHashMap2.get(strM);
                if (softReference == null || (concurrentHashMap = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap.get(locale)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(strM);
                    String[] strArr2 = {strM, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), strM, strM};
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(locale, strArr2);
                    concurrentHashMap2.put(strM, new SoftReference(concurrentHashMap));
                    strArr = strArr2;
                }
                if (zG == 0) {
                    str = strArr[e0Var2.f82091a + 1];
                } else if (zG == 1) {
                    str = strArr[e0Var2.f82091a + 3];
                } else {
                    str = strArr[e0Var2.f82091a + 5];
                }
            }
            if (str != null) {
                strM = str;
            }
        }
        sb2.append(strM);
        return true;
    }

    @Override // j$.time.format.s
    public final m a(u uVar) {
        m mVar;
        if (this.f82141e == e0.NARROW) {
            return super.a(uVar);
        }
        Locale locale = uVar.f82145a.f82060b;
        boolean z11 = uVar.f82146b;
        Set set = j$.time.zone.i.f82276d;
        int size = set.size();
        Map map = z11 ? this.f82143g : this.f82144h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (mVar = (m) ((SoftReference) entry.getValue()).get()) != null) {
            return mVar;
        }
        m mVar2 = uVar.f82146b ? new m("", null, null) : new l("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                mVar2.a(str, str);
                HashMap map2 = (HashMap) f0.f82096d;
                String str2 = (String) map2.get(str);
                if (str2 == null) {
                    HashMap map3 = (HashMap) f0.f82099g;
                    if (map3.containsKey(str)) {
                        str = (String) map3.get(str);
                        str2 = (String) map2.get(str);
                    }
                }
                if (str2 != null) {
                    Map map4 = (Map) ((HashMap) f0.f82098f).get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) ((HashMap) f0.f82097e).get(str2) : (String) map4.get(locale.getCountry());
                }
                HashMap map5 = (HashMap) f0.f82099g;
                if (map5.containsKey(str)) {
                    str = (String) map5.get(str);
                }
                for (int i11 = this.f82141e == e0.FULL ? 1 : 2; i11 < strArr.length; i11 += 2) {
                    mVar2.a(strArr[i11], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(mVar2)));
        return mVar2;
    }
}
