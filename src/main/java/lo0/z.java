package lo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.datetime.DateTimeFormatException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\r\u0010\u000b\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, d2 = {"T", "field", "", "name", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "Llo0/n;", "Lko0/d;", "a", "Lkotlin/Lazy;", "b", "()Llo0/n;", "ISO_DATE", "c", "ISO_DATE_BASIC", "Llo0/v;", "Llo0/v;", "emptyIncompleteLocalDate", "kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f90639a = jn0.m.b(a.f90642c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f90640b = jn0.m.b(b.f90644c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v f90641c = new v(null, null, null, null, null, 31, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/n;", "Lko0/d;", "b", "()Llo0/n;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<n<ko0.d>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f90642c = new a();

        /* JADX INFO: renamed from: lo0.z$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$a;", "Ljn0/h0;", "a", "(Llo0/o$a;)V"}, k = 3, mv = {1, 9, 0})
        static final class C1928a extends p013kotlin.jvm.internal.u implements wn0.l<o.a, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1928a f90643c = new C1928a();

            C1928a() {
                super(1);
            }

            public final void a(o.a build) {
                p013kotlin.jvm.internal.s.k(build, "$this$build");
                o.a.C1918a.c(build, null, 1, null);
                p.b(build, CoreConstants.DASH_CHAR);
                o.a.C1918a.b(build, null, 1, null);
                p.b(build, CoreConstants.DASH_CHAR);
                o.a.C1918a.a(build, null, 1, null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(o.a aVar) {
                a(aVar);
                return jn0.h0.f84049a;
            }
        }

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n<ko0.d> invoke() {
            return y.f90636b.a(C1928a.f90643c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/n;", "Lko0/d;", "b", "()Llo0/n;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<n<ko0.d>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f90644c = new b();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$a;", "Ljn0/h0;", "a", "(Llo0/o$a;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<o.a, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f90645c = new a();

            a() {
                super(1);
            }

            public final void a(o.a build) {
                p013kotlin.jvm.internal.s.k(build, "$this$build");
                o.a.C1918a.c(build, null, 1, null);
                o.a.C1918a.b(build, null, 1, null);
                o.a.C1918a.a(build, null, 1, null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(o.a aVar) {
                a(aVar);
                return jn0.h0.f84049a;
            }
        }

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n<ko0.d> invoke() {
            return y.f90636b.a(a.f90645c);
        }
    }

    public static final n<ko0.d> b() {
        return (n) f90639a.getValue();
    }

    public static final n<ko0.d> c() {
        return (n) f90640b.getValue();
    }

    public static final <T> T d(T t11, String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        if (t11 != null) {
            return t11;
        }
        throw new DateTimeFormatException("Can not create a " + name + " from the given input: the field " + name + " is missing");
    }
}
