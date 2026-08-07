package no0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: no0.t, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0017B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR*\u0010\"\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lno0/t;", "T", "Lno0/s;", "", "onZero", "Lno0/o;", "format", "<init>", "(Ljava/lang/String;Lno0/o;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lpo0/p;", "b", "()Lpo0/p;", "Loo0/e;", "a", "()Loo0/e;", "Ljava/lang/String;", "getOnZero", "Lno0/o;", DateTokenConverter.CONVERTER_KEY, "()Lno0/o;", "", "Lno0/t$a;", "c", "Ljava/util/List;", "fields", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Optional<T> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String onZero;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o<T> format;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<a<T, ? extends Object>> fields;

    /* JADX INFO: renamed from: no0.t$a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 \r*\u0006\b\u0001\u0010\u0001 \u0000*\u0004\b\u0002\u0010\u00022\u00020\u0003:\u0001\tB%\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00028\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lno0/t$a;", "T", "E", "", "Lno0/b;", "accessor", "defaultValue", "<init>", "(Lno0/b;Ljava/lang/Object;)V", "a", "Lno0/b;", "b", "Ljava/lang/Object;", "c", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a<T, E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final no0.b<T, E> accessor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final E defaultValue;

        /* JADX INFO: renamed from: no0.t$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\b\"\u0004\b\u0003\u0010\u0004\"\u0004\b\u0004\u0010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lno0/t$a$a;", "", "<init>", "()V", "T", "E", "Lno0/n;", "field", "Lno0/t$a;", "a", "(Lno0/n;)Lno0/t$a;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <T, E> a<T, E> a(n<? super T, E> field) {
                p013kotlin.jvm.internal.s.k(field, "field");
                E defaultValue = field.getDefaultValue();
                if (defaultValue != null) {
                    return new a<>(field.a(), defaultValue, null);
                }
                throw new IllegalArgumentException(("The field '" + field.getName() + "' does not define a default value").toString());
            }

            private Companion() {
            }
        }

        public /* synthetic */ a(no0.b bVar, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private a(no0.b<? super T, E> bVar, E e11) {
            this.accessor = bVar;
            this.defaultValue = e11;
        }
    }

    /* JADX INFO: renamed from: no0.t$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<T, Boolean> {
        b(Object obj) {
            super(1, obj, v.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t11) {
            return Boolean.valueOf(((v) this.receiver).test(t11));
        }
    }

    /* JADX INFO: renamed from: no0.t$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class c extends p013kotlin.jvm.internal.p implements wn0.l<Object, Boolean> {
        c(Object obj) {
            super(1, obj, a0.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((a0) this.receiver).test(obj));
        }
    }

    /* JADX INFO: renamed from: no0.t$d */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000 \u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<T, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Optional<T> f95272c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Optional<? super T> optional) {
            super(1);
            this.f95272c = optional;
        }

        public final void b(T t11) {
            for (a aVar : ((Optional) this.f95272c).fields) {
                aVar.accessor.c(t11, aVar.defaultValue);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            b(obj);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Optional(String onZero, o<? super T> format) {
        p013kotlin.jvm.internal.s.k(onZero, "onZero");
        p013kotlin.jvm.internal.s.k(format, "format");
        this.onZero = onZero;
        this.format = format;
        List listB = p.b(format);
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((l) it.next()).c());
        }
        List listH0 = p013kotlin.collections.v.h0(arrayList);
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(listH0, 10));
        Iterator<T> it2 = listH0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a.INSTANCE.a((n) it2.next()));
        }
        this.fields = arrayList2;
    }

    @Override // no0.o
    public oo0.e<T> a() {
        oo0.e<T> eVarA = this.format.a();
        List<a<T, ? extends Object>> list = this.fields;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            arrayList.add(new g(aVar.defaultValue, new u(aVar.accessor)));
        }
        v vVarA = w.a(arrayList);
        return vVarA instanceof a0 ? new oo0.c(this.onZero) : new oo0.b(p013kotlin.collections.v.p(jn0.x.a(new b(vVarA), new oo0.c(this.onZero)), jn0.x.a(new c(a0.f95231a), eVarA)));
    }

    @Override // no0.o
    public po0.p<T> b() {
        return new po0.p<>(p013kotlin.collections.v.m(), p013kotlin.collections.v.p(this.format.b(), po0.m.b(p013kotlin.collections.v.p(new ConstantFormatStructure(this.onZero).b(), new po0.p(this.fields.isEmpty() ? p013kotlin.collections.v.m() : p013kotlin.collections.v.e(new po0.t(new d(this))), p013kotlin.collections.v.m())))));
    }

    public final o<T> d() {
        return this.format;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Optional)) {
            return false;
        }
        Optional optional = (Optional) other;
        return p013kotlin.jvm.internal.s.f(this.onZero, optional.onZero) && p013kotlin.jvm.internal.s.f(this.format, optional.format);
    }

    public int hashCode() {
        return (this.onZero.hashCode() * 31) + this.format.hashCode();
    }

    public String toString() {
        return "Optional(" + this.onZero + ", " + this.format + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
