package j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatterBuilder {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j$.time.e f82065h = new j$.time.e(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f82066i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTimeFormatterBuilder f82067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTimeFormatterBuilder f82068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f82069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f82070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f82071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f82072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82073g;

    static {
        HashMap map = new HashMap();
        f82066i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.g gVar = j$.time.temporal.i.f82203a;
        map.put('Q', gVar);
        map.put('q', gVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.k.f82211a);
    }

    public DateTimeFormatterBuilder() {
        this.f82067a = this;
        this.f82069c = new ArrayList();
        this.f82073g = -1;
        this.f82068b = null;
        this.f82070d = false;
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.f82067a = this;
        this.f82069c = new ArrayList();
        this.f82073g = -1;
        this.f82068b = dateTimeFormatterBuilder;
        this.f82070d = true;
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        c(p.INSENSITIVE);
        return this;
    }

    public final void j(j$.time.temporal.p pVar) {
        i(new i(pVar, 1, 19, d0.NORMAL));
    }

    public final void k(j$.time.temporal.p pVar, int i11) {
        Objects.requireNonNull(pVar, "field");
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i11);
        }
        i(new i(pVar, i11, i11, d0.NOT_NEGATIVE));
    }

    public final void l(j$.time.temporal.p pVar, int i11, int i12, d0 d0Var) {
        if (i11 == i12 && d0Var == d0.NOT_NEGATIVE) {
            k(pVar, i12);
            return;
        }
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(d0Var, "signStyle");
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i11);
        }
        if (i12 < 1 || i12 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i12);
        }
        if (i12 < i11) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i12 + " < " + i11);
        }
        i(new i(pVar, i11, i12, d0Var));
    }

    public final void i(i iVar) {
        i iVarD;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f82067a;
        int i11 = dateTimeFormatterBuilder.f82073g;
        if (i11 < 0) {
            dateTimeFormatterBuilder.f82073g = c(iVar);
            return;
        }
        i iVar2 = (i) ((ArrayList) dateTimeFormatterBuilder.f82069c).get(i11);
        int i12 = iVar.f82104b;
        int i13 = iVar.f82105c;
        if (i12 == i13 && iVar.f82106d == d0.NOT_NEGATIVE) {
            iVarD = iVar2.e(i13);
            c(iVar.d());
            this.f82067a.f82073g = i11;
        } else {
            iVarD = iVar2.d();
            this.f82067a.f82073g = c(iVar);
        }
        ((ArrayList) this.f82067a.f82069c).set(i11, iVarD);
    }

    public final void b(j$.time.temporal.a aVar, int i11, int i12, boolean z11) {
        if (i11 == i12 && !z11) {
            i(new f(aVar, i11, i12, z11));
        } else {
            c(new f(aVar, i11, i12, z11));
        }
    }

    public final void h(j$.time.temporal.p pVar, e0 e0Var) {
        Objects.requireNonNull(e0Var, "textStyle");
        c(new q(pVar, e0Var, z.f82161c));
    }

    public final void g(j$.time.temporal.a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        e0 e0Var = e0.FULL;
        c(new q(aVar, e0Var, new a(new y(Collections.singletonMap(e0Var, linkedHashMap)))));
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        c(j.f82109e);
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        c(new j(str, str2));
        return this;
    }

    public final void f(e0 e0Var) {
        Objects.requireNonNull(e0Var, "style");
        if (e0Var != e0.FULL && e0Var != e0.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new h(e0Var, 0));
    }

    public final void d(char c11) {
        c(new c(c11));
    }

    public final void e(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            c(new c(str.charAt(0)));
        } else {
            c(new h(str, 1));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d dVar = dateTimeFormatter.f82059a;
        if (dVar.f82088b) {
            dVar = new d(dVar.f82087a, false);
        }
        c(dVar);
    }

    public final void n() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f82067a;
        dateTimeFormatterBuilder.f82073g = -1;
        this.f82067a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final void m() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f82067a;
        if (dateTimeFormatterBuilder.f82068b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) dateTimeFormatterBuilder.f82069c).size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f82067a;
            d dVar = new d(dateTimeFormatterBuilder2.f82069c, dateTimeFormatterBuilder2.f82070d);
            this.f82067a = this.f82067a.f82068b;
            c(dVar);
            return;
        }
        this.f82067a = this.f82067a.f82068b;
    }

    public final int c(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f82067a;
        int i11 = dateTimeFormatterBuilder.f82071e;
        if (i11 > 0) {
            k kVar = new k(eVar, i11, dateTimeFormatterBuilder.f82072f);
            dateTimeFormatterBuilder.f82071e = 0;
            dateTimeFormatterBuilder.f82072f = (char) 0;
            eVar = kVar;
        }
        ((ArrayList) dateTimeFormatterBuilder.f82069c).add(eVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f82067a;
        dateTimeFormatterBuilder2.f82073g = -1;
        return ((ArrayList) dateTimeFormatterBuilder2.f82069c).size() - 1;
    }

    public DateTimeFormatter toFormatter() {
        return p(Locale.getDefault(), c0.SMART, null);
    }

    public final DateTimeFormatter o(c0 c0Var, j$.time.chrono.l lVar) {
        return p(Locale.getDefault(), c0Var, lVar);
    }

    public final DateTimeFormatter p(Locale locale, c0 c0Var, j$.time.chrono.l lVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f82067a.f82068b != null) {
            m();
        }
        return new DateTimeFormatter(new d(this.f82069c, false), locale, a0.f82075a, c0Var, lVar, null);
    }
}
