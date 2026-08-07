package tp0;

import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltp0/g;", "Ljp0/b;", "Ltp0/c;", "Lvp0/b;", "<init>", "()V", "", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements jp0.b, c, vp0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f114918a = new g();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "it", "a", "(Ljava/util/List;)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<List<? extends Double>, Double> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f114919c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Double invoke(List<Double> it) {
            s.k(it, "it");
            Iterator<T> it2 = it.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = Double.valueOf(((Number) next).doubleValue() * ((Number) it2.next()).doubleValue());
            }
            return (Double) next;
        }
    }

    private g() {
    }

    public Double a(Object obj, l<? super List<Double>, Double> lVar) {
        return c.a.a(this, obj, lVar);
    }

    public List<Object> b(Object obj) {
        return vp0.b.a.b(this, obj);
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        List<Object> listC = yr0.a.c(expression);
        int size = listC.size();
        if (size != 0) {
            return size != 1 ? a(b(expression), a.f114919c) : v.o0(listC);
        }
        return null;
    }
}
