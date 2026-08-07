package lo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u0013"}, d2 = {"Llo0/g0;", "", "<init>", "()V", "lo0/g0$c", "b", "Llo0/g0$c;", "sign", "Lno0/b0;", "Llo0/n0;", "c", "Lno0/b0;", "()Lno0/b0;", "totalHoursAbs", DateTokenConverter.CONVERTER_KEY, "a", "minutesOfHour", "e", "secondsOfMinute", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f90505a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final c sign;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final no0.b0<n0> totalHoursAbs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final no0.b0<n0> minutesOfHour;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final no0.b0<n0> secondsOfMinute;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"lo0/g0$c", "Lno0/m;", "Llo0/n0;", "obj", "", "c", "(Llo0/n0;)Z", "Lno0/x;", "a", "Lno0/x;", "b", "()Lno0/x;", "isNegative", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements no0.m<n0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final no0.x<n0, Boolean> isNegative = new no0.x<>(new p013kotlin.jvm.internal.z() { // from class: lo0.g0.c.a
            @Override // p013kotlin.jvm.internal.z, co0.o
            public Object get(Object obj) {
                return ((n0) obj).getIsNegative();
            }

            @Override // p013kotlin.jvm.internal.z, co0.k
            public void h(Object obj, Object obj2) {
                ((n0) obj).i((Boolean) obj2);
            }
        });

        c() {
        }

        @Override // no0.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public no0.x<n0, Boolean> isNegative() {
            return this.isNegative;
        }

        @Override // no0.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean a(n0 obj) {
            p013kotlin.jvm.internal.s.k(obj, "obj");
            Integer totalHoursAbs = obj.getTotalHoursAbs();
            if ((totalHoursAbs != null ? totalHoursAbs.intValue() : 0) == 0) {
                Integer minutesOfHour = obj.getMinutesOfHour();
                if ((minutesOfHour != null ? minutesOfHour.intValue() : 0) == 0) {
                    Integer secondsOfMinute = obj.getSecondsOfMinute();
                    if ((secondsOfMinute != null ? secondsOfMinute.intValue() : 0) == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    static {
        c cVar = new c();
        sign = cVar;
        totalHoursAbs = new no0.b0<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.g0.d
            @Override // p013kotlin.jvm.internal.z, co0.o
            public Object get(Object obj) {
                return ((n0) obj).getTotalHoursAbs();
            }

            @Override // p013kotlin.jvm.internal.z, co0.k
            public void h(Object obj, Object obj2) {
                ((n0) obj).l((Integer) obj2);
            }
        }), 0, 18, null, 0, cVar, 8, null);
        minutesOfHour = new no0.b0<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.g0.a
            @Override // p013kotlin.jvm.internal.z, co0.o
            public Object get(Object obj) {
                return ((n0) obj).getMinutesOfHour();
            }

            @Override // p013kotlin.jvm.internal.z, co0.k
            public void h(Object obj, Object obj2) {
                ((n0) obj).j((Integer) obj2);
            }
        }), 0, 59, null, 0, cVar, 8, null);
        secondsOfMinute = new no0.b0<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.g0.b
            @Override // p013kotlin.jvm.internal.z, co0.o
            public Object get(Object obj) {
                return ((n0) obj).getSecondsOfMinute();
            }

            @Override // p013kotlin.jvm.internal.z, co0.k
            public void h(Object obj, Object obj2) {
                ((n0) obj).x((Integer) obj2);
            }
        }), 0, 59, null, 0, cVar, 8, null);
    }

    private g0() {
    }

    public final no0.b0<n0> a() {
        return minutesOfHour;
    }

    public final no0.b0<n0> b() {
        return secondsOfMinute;
    }

    public final no0.b0<n0> c() {
        return totalHoursAbs;
    }
}
