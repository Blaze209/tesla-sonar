package lo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\bR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u001a\u0010\b¨\u0006\u001c"}, d2 = {"Llo0/l0;", "", "<init>", "()V", "Lno0/b0;", "Llo0/k0;", "b", "Lno0/b0;", "()Lno0/b0;", "hour", "c", "minute", DateTokenConverter.CONVERTER_KEY, "second", "Lno0/q;", "Lmo0/a;", "e", "Lno0/q;", "a", "()Lno0/q;", "fractionOfSecond", "Llo0/g;", "f", "getAmPm", "amPm", "g", "getHourOfAmPm", "hourOfAmPm", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f90564a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final no0.b0<k0> hour = new no0.b0<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.l0.c
        @Override // p013kotlin.jvm.internal.z, co0.o
        public Object get(Object obj) {
            return ((k0) obj).c();
        }

        @Override // p013kotlin.jvm.internal.z, co0.k
        public void h(Object obj, Object obj2) {
            ((k0) obj).D((Integer) obj2);
        }
    }), 0, 23, null, null, null, 56, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final no0.b0<k0> minute = new no0.b0<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.l0.e
        @Override // p013kotlin.jvm.internal.z, co0.o
        public Object get(Object obj) {
            return ((k0) obj).e();
        }

        @Override // p013kotlin.jvm.internal.z, co0.k
        public void h(Object obj, Object obj2) {
            ((k0) obj).z((Integer) obj2);
        }
    }), 0, 59, null, null, null, 56, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final no0.b0<k0> second = new no0.b0<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.l0.f
        @Override // p013kotlin.jvm.internal.z, co0.o
        public Object get(Object obj) {
            return ((k0) obj).d();
        }

        @Override // p013kotlin.jvm.internal.z, co0.k
        public void h(Object obj, Object obj2) {
            ((k0) obj).k((Integer) obj2);
        }
    }), 0, 59, null, 0, null, 40, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final no0.q<k0, mo0.a> fractionOfSecond = new no0.q<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.l0.b
        @Override // p013kotlin.jvm.internal.z, co0.o
        public Object get(Object obj) {
            return ((k0) obj).A();
        }

        @Override // p013kotlin.jvm.internal.z, co0.k
        public void h(Object obj, Object obj2) {
            ((k0) obj).E((mo0.a) obj2);
        }
    }), null, new mo0.a(0, 9), null, 10, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final no0.q<k0, g> amPm = new no0.q<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.l0.a
        @Override // p013kotlin.jvm.internal.z, co0.o
        public Object get(Object obj) {
            return ((k0) obj).m();
        }

        @Override // p013kotlin.jvm.internal.z, co0.k
        public void h(Object obj, Object obj2) {
            ((k0) obj).t((g) obj2);
        }
    }), null, null, null, 14, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final no0.b0<k0> hourOfAmPm = new no0.b0<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.l0.d
        @Override // p013kotlin.jvm.internal.z, co0.o
        public Object get(Object obj) {
            return ((k0) obj).g();
        }

        @Override // p013kotlin.jvm.internal.z, co0.k
        public void h(Object obj, Object obj2) {
            ((k0) obj).n((Integer) obj2);
        }
    }), 1, 12, null, null, null, 56, null);

    private l0() {
    }

    public final no0.q<k0, mo0.a> a() {
        return fractionOfSecond;
    }

    public final no0.b0<k0> b() {
        return hour;
    }

    public final no0.b0<k0> c() {
        return minute;
    }

    public final no0.b0<k0> d() {
        return second;
    }
}
