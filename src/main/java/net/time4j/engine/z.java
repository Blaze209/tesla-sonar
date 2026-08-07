package net.time4j.engine;

import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public enum z implements p<Long> {
    UTC(2441317),
    UNIX(2440587),
    MODIFIED_JULIAN_DATE(2400000),
    EXCEL(2415019),
    ANSI(2305812),
    RATA_DIE(1721424),
    JULIAN_DAY_NUMBER(-1),
    LILIAN_DAY_NUMBER(2299159);

    private final int offset;

    private static class a<D extends q<D>> implements y<D, Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z f94164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k<D> f94165b;

        a(z zVar, k<D> kVar) {
            this.f94164a = zVar;
            this.f94165b = kVar;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public p<?> getChildAtCeiling(D d11) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p<?> getChildAtFloor(D d11) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Long getMaximum(D d11) {
            return Long.valueOf(this.f94164a.transform(this.f94165b.a() + 730, z.UNIX));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long getMinimum(D d11) {
            return Long.valueOf(this.f94164a.transform(this.f94165b.c() + 730, z.UNIX));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Long getValue(D d11) {
            return Long.valueOf(this.f94164a.transform(this.f94165b.transform(d11) + 730, z.UNIX));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(D d11, Long l11) {
            if (l11 == null) {
                return false;
            }
            try {
                long jM = net.time4j.base.c.m(z.UNIX.transform(l11.longValue(), this.f94164a), 730L);
                return jM <= this.f94165b.a() && jM >= this.f94165b.c();
            } catch (ArithmeticException | IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public D withValue(D d11, Long l11, boolean z11) {
            if (l11 == null) {
                throw new IllegalArgumentException("Missing epoch day value.");
            }
            return this.f94165b.b(net.time4j.base.c.m(z.UNIX.transform(l11.longValue(), this.f94164a), 730L));
        }
    }

    z(int i11) {
        this.offset = i11 - 2441317;
    }

    <D extends q<D>> y<D, Long> derive(k<D> kVar) {
        return new a(this, kVar);
    }

    public String getDisplayName(Locale locale) {
        return name();
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return this == MODIFIED_JULIAN_DATE ? 'g' : (char) 0;
    }

    @Override // net.time4j.engine.p
    public Class<Long> getType() {
        return Long.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    public long transform(long j11, z zVar) {
        try {
            return net.time4j.base.c.f(j11, zVar.offset - this.offset);
        } catch (ArithmeticException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    @Override // java.util.Comparator
    public int compare(o oVar, o oVar2) {
        return ((Long) oVar.s(this)).compareTo((Long) oVar2.s(this));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.time4j.engine.p
    public Long getDefaultMaximum() {
        return Long.valueOf(365241779741L - ((long) this.offset));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.time4j.engine.p
    public Long getDefaultMinimum() {
        return Long.valueOf((-365243219892L) - ((long) this.offset));
    }
}
