package rp0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrp0/a;", "Ljp0/b;", "Lrp0/c;", "<init>", "()V", "", "expression", "data", "", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements jp0.b, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f108686a = new a();

    /* JADX INFO: renamed from: rp0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "first", "second", "", "a", "(II)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class C2315a extends u implements p<Integer, Integer, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2315a f108687c = new C2315a();

        C2315a() {
            super(2);
        }

        public final Boolean a(int i11, int i12) {
            return Boolean.valueOf(i11 == i12);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2) {
            return a(num.intValue(), num2.intValue());
        }
    }

    private a() {
    }

    @Override // rp0.c, sp0.a
    public Object a(Object obj) {
        return c.a.f(this, obj);
    }

    @Override // kp0.a
    public Boolean b(Object obj) {
        return c.a.g(this, obj);
    }

    @Override // kp0.b
    public List<Comparable<?>> c(Comparable<?> comparable, Comparable<?> comparable2) {
        return c.a.d(this, comparable, comparable2);
    }

    @Override // sp0.c
    public Object d(Object obj) {
        return c.a.e(this, obj);
    }

    @Override // kp0.b
    public List<Comparable<?>> e(Comparable<?> comparable, Comparable<?> comparable2) {
        return c.a.c(this, comparable, comparable2);
    }

    @Override // kp0.c
    public boolean g(List<? extends Object> list, p<? super Integer, ? super Integer, Boolean> pVar) {
        return c.a.b(this, list, pVar);
    }

    public boolean h(Object obj, p<? super Integer, ? super Integer, Boolean> pVar) {
        return c.a.a(this, obj, pVar);
    }

    @Override // jp0.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean f(Object expression, Object data) {
        return Boolean.valueOf(!h(expression, C2315a.f108687c));
    }
}
