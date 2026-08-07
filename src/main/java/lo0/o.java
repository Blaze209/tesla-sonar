package lo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Llo0/o;", "", "", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "a", "b", "c", "Llo0/b;", "Llo0/o$a;", "Llo0/o$c;", "Llo0/o$d;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface o {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0001\u0001\u0015¨\u0006\u0016"}, d2 = {"Llo0/o$a;", "Llo0/o;", "Llo0/h0;", "padding", "Ljn0/h0;", "t", "(Llo0/h0;)V", IntegerTokenConverter.CONVERTER_KEY, "Llo0/f0;", "names", "m", "(Llo0/f0;)V", "p", "Llo0/s;", "c", "(Llo0/s;)V", "Llo0/n;", "Lko0/d;", "format", "b", "(Llo0/n;)V", "Llo0/c;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends o {

        /* JADX INFO: renamed from: lo0.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1918a {
            public static /* synthetic */ void a(a aVar, h0 h0Var, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dayOfMonth");
                }
                if ((i11 & 1) != 0) {
                    h0Var = h0.ZERO;
                }
                aVar.p(h0Var);
            }

            public static /* synthetic */ void b(a aVar, h0 h0Var, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: monthNumber");
                }
                if ((i11 & 1) != 0) {
                    h0Var = h0.ZERO;
                }
                aVar.i(h0Var);
            }

            public static /* synthetic */ void c(a aVar, h0 h0Var, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: year");
                }
                if ((i11 & 1) != 0) {
                    h0Var = h0.ZERO;
                }
                aVar.t(h0Var);
            }
        }

        void b(n<ko0.d> format);

        void c(s names);

        void i(h0 padding);

        void m(f0 names);

        void p(h0 padding);

        void t(h0 padding);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Llo0/o$b;", "", "Llo0/o$d;", "Llo0/l$a;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends a, c, d {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J#\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0001\u000e¨\u0006\u000f"}, d2 = {"Llo0/o$c;", "Llo0/o;", "Llo0/h0;", "padding", "Ljn0/h0;", "q", "(Llo0/h0;)V", "s", "r", "", "minLength", "maxLength", "f", "(II)V", "Llo0/f;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends o {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public static /* synthetic */ void a(c cVar, h0 h0Var, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hour");
                }
                if ((i11 & 1) != 0) {
                    h0Var = h0.ZERO;
                }
                cVar.q(h0Var);
            }

            public static /* synthetic */ void b(c cVar, h0 h0Var, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: minute");
                }
                if ((i11 & 1) != 0) {
                    h0Var = h0.ZERO;
                }
                cVar.s(h0Var);
            }

            public static /* synthetic */ void c(c cVar, h0 h0Var, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: second");
                }
                if ((i11 & 1) != 0) {
                    h0Var = h0.ZERO;
                }
                cVar.r(h0Var);
            }
        }

        void f(int minLength, int maxLength);

        void q(h0 padding);

        void r(h0 padding);

        void s(h0 padding);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u001d\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Llo0/o$d;", "Llo0/o;", "Llo0/h0;", "padding", "Ljn0/h0;", "w", "(Llo0/h0;)V", "a", "u", "Llo0/n;", "Lko0/i;", "format", "o", "(Llo0/n;)V", "Llo0/e;", "Llo0/o$b;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d extends o {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public static /* synthetic */ void a(d dVar, h0 h0Var, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetHours");
                }
                if ((i11 & 1) != 0) {
                    h0Var = h0.ZERO;
                }
                dVar.w(h0Var);
            }

            public static /* synthetic */ void b(d dVar, h0 h0Var, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetMinutesOfHour");
                }
                if ((i11 & 1) != 0) {
                    h0Var = h0.ZERO;
                }
                dVar.a(h0Var);
            }

            public static /* synthetic */ void c(d dVar, h0 h0Var, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetSecondsOfMinute");
                }
                if ((i11 & 1) != 0) {
                    h0Var = h0.ZERO;
                }
                dVar.u(h0Var);
            }
        }

        void a(h0 padding);

        void o(n<ko0.i> format);

        void u(h0 padding);

        void w(h0 padding);
    }

    void d(String value);
}
