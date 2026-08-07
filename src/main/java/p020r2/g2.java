package p020r2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H ¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000f\u0010\rJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lr2/g2;", "T", "Lr2/u;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lwn0/a;)V", "Lr2/h2;", "value", "Lr2/e4;", "f", "(Lr2/h2;)Lr2/e4;", "c", "(Ljava/lang/Object;)Lr2/h2;", DateTokenConverter.CONVERTER_KEY, "e", "previous", "b", "(Lr2/h2;Lr2/e4;)Lr2/e4;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class g2<T> extends u<T> {
    public g2(a<? extends T> aVar) {
        super(aVar, null);
    }

    private final e4<T> f(h2<T> value) {
        if (!value.getIsDynamic()) {
            if (value.c() != null) {
                return new ComputedValueHolder(value.c());
            }
            return value.f() != null ? new DynamicValueHolder(value.f()) : new StaticValueHolder(value.d());
        }
        p1<T> p1VarF = value.f();
        if (p1VarF == null) {
            T tG = value.g();
            m3<T> m3VarE = value.e();
            if (m3VarE == null) {
                m3VarE = n3.q();
            }
            p1VarF = n3.h(tG, m3VarE);
        }
        return new DynamicValueHolder(p1VarF);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 java.lang.Object) = (r5v5 java.lang.Object), (r5v6 java.lang.Object) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p020r2.u
    public e4<T> b(h2<T> value, e4<T> previous) {
        ComputedValueHolder computedValueHolder;
        StaticValueHolder staticValueHolder;
        DynamicValueHolder dynamicValueHolder = null;
        if (previous instanceof DynamicValueHolder) {
            if (value.getIsDynamic()) {
                dynamicValueHolder = (DynamicValueHolder) previous;
                dynamicValueHolder.b().setValue(value.d());
            }
        } else if (previous instanceof StaticValueHolder) {
            if (value.j()) {
                staticValueHolder = (StaticValueHolder) previous;
                if (s.f(value.d(), staticValueHolder.b())) {
                    Object obj = computedValueHolder;
                    obj = staticValueHolder;
                    dynamicValueHolder = (e4<T>) obj;
                }
            }
        } else if (previous instanceof ComputedValueHolder) {
            computedValueHolder = (ComputedValueHolder) previous;
            if (value.c() == computedValueHolder.b()) {
                Object obj2 = computedValueHolder;
                obj2 = staticValueHolder;
                dynamicValueHolder = (e4<T>) obj2;
            }
        }
        return dynamicValueHolder == null ? f(value) : dynamicValueHolder;
    }

    public abstract h2<T> c(T value);

    public final h2<T> d(T value) {
        return c(value);
    }

    public final h2<T> e(T value) {
        return c(value).h();
    }
}
