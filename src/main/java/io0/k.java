package io0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio0/k;", "", "Lio0/j;", "a", "()Lio0/j;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface k {
    j a();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lio0/k$a;", "", "<init>", "()V", "Lio0/k$a$a;", "b", "()J", "", "toString", "()Ljava/lang/String;", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f81656a = new a();

        private a() {
        }

        @Override // io0.k
        public /* bridge */ /* synthetic */ j a() {
            return C1711a.b(b());
        }

        public long b() {
            return i.f81654a.d();
        }

        public String toString() {
            return i.f81654a.toString();
        }

        /* JADX INFO: renamed from: io0.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u001a"}, d2 = {"Lio0/k$a$a;", "Lio0/a;", "", "Lkotlin/time/ValueTimeMarkReading;", "reading", DateTokenConverter.CONVERTER_KEY, "(J)J", "Lio0/b;", "e", "other", IntegerTokenConverter.CONVERTER_KEY, "(JLio0/a;)J", "h", "(JJ)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @vn0.b
        public static final class C1711a implements io0.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final long reading;

            private /* synthetic */ C1711a(long j11) {
                this.reading = j11;
            }

            public static final /* synthetic */ C1711a b(long j11) {
                return new C1711a(j11);
            }

            public static long e(long j11) {
                return i.f81654a.c(j11);
            }

            public static boolean f(long j11, Object obj) {
                return (obj instanceof C1711a) && j11 == ((C1711a) obj).getReading();
            }

            public static int g(long j11) {
                return Long.hashCode(j11);
            }

            public static final long h(long j11, long j12) {
                return i.f81654a.b(j11, j12);
            }

            public static long i(long j11, io0.a other) {
                s.k(other, "other");
                if (other instanceof C1711a) {
                    return h(j11, ((C1711a) other).getReading());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) j(j11)) + " and " + other);
            }

            public static String j(long j11) {
                return "ValueTimeMark(reading=" + j11 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // io0.a
            public long Q2(io0.a other) {
                s.k(other, "other");
                return i(this.reading, other);
            }

            @Override // io0.j
            public long a() {
                return e(this.reading);
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compareTo(io0.a aVar) {
                return io0.a.C1710a.a(this, aVar);
            }

            public boolean equals(Object other) {
                return f(this.reading, other);
            }

            public int hashCode() {
                return g(this.reading);
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final /* synthetic */ long getReading() {
                return this.reading;
            }

            public String toString() {
                return j(this.reading);
            }

            public static long d(long j11) {
                return j11;
            }
        }
    }
}
