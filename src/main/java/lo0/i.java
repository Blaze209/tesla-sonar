package lo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0007\u0010\u000fR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0018"}, d2 = {"Llo0/i;", "", "<init>", "()V", "Lno0/q;", "Llo0/h;", "", "b", "Lno0/q;", DateTokenConverter.CONVERTER_KEY, "()Lno0/q;", "year", "Lno0/b0;", "c", "Lno0/b0;", "()Lno0/b0;", "month", "a", "dayOfMonth", "e", "isoDayOfWeek", "f", "getDayOfYear", "dayOfYear", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f90515a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final no0.q<h, Integer> year = new no0.q<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.i.e
        @Override // p013kotlin.jvm.internal.z, co0.o
        public Object get(Object obj) {
            return ((h) obj).b();
        }

        @Override // p013kotlin.jvm.internal.z, co0.k
        public void h(Object obj, Object obj2) {
            ((h) obj).C((Integer) obj2);
        }
    }), null, null, null, 14, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final no0.b0<h> month = new no0.b0<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.i.d
        @Override // p013kotlin.jvm.internal.z, co0.o
        public Object get(Object obj) {
            return ((h) obj).r();
        }

        @Override // p013kotlin.jvm.internal.z, co0.k
        public void h(Object obj, Object obj2) {
            ((h) obj).y((Integer) obj2);
        }
    }), 1, 12, null, null, null, 56, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final no0.b0<h> dayOfMonth = new no0.b0<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.i.a
        @Override // p013kotlin.jvm.internal.z, co0.o
        public Object get(Object obj) {
            return ((h) obj).f();
        }

        @Override // p013kotlin.jvm.internal.z, co0.k
        public void h(Object obj, Object obj2) {
            ((h) obj).q((Integer) obj2);
        }
    }), 1, 31, null, null, null, 56, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final no0.b0<h> isoDayOfWeek = new no0.b0<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.i.c
        @Override // p013kotlin.jvm.internal.z, co0.o
        public Object get(Object obj) {
            return ((h) obj).h();
        }

        @Override // p013kotlin.jvm.internal.z, co0.k
        public void h(Object obj, Object obj2) {
            ((h) obj).s((Integer) obj2);
        }
    }), 1, 7, null, null, null, 56, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final no0.b0<h> dayOfYear = new no0.b0<>(new no0.x(new p013kotlin.jvm.internal.z() { // from class: lo0.i.b
        @Override // p013kotlin.jvm.internal.z, co0.o
        public Object get(Object obj) {
            return ((h) obj).B();
        }

        @Override // p013kotlin.jvm.internal.z, co0.k
        public void h(Object obj, Object obj2) {
            ((h) obj).w((Integer) obj2);
        }
    }), 1, 366, null, null, null, 56, null);

    private i() {
    }

    public final no0.b0<h> a() {
        return dayOfMonth;
    }

    public final no0.b0<h> b() {
        return isoDayOfWeek;
    }

    public final no0.b0<h> c() {
        return month;
    }

    public final no0.q<h, Integer> d() {
        return year;
    }
}
