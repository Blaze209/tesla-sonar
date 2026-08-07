package p020r2;

import c3.a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H ¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH ¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH ¢\u0006\u0004\b!\u0010 J\u001f\u0010$\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"H ¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020\u001dH\u0010¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b(\u0010\fR\u0014\u0010,\u001a\u00020)8 X \u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8 X \u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8 X \u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0014\u00104\u001a\u00020-8 X \u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0016\u00108\u001a\u0004\u0018\u0001058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lr2/q;", "", "<init>", "()V", "Lr2/e0;", "composition", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Lr2/e0;Lwn0/p;)V", "l", "(Lr2/e0;)V", "", "Lc3/a;", "table", "o", "(Ljava/util/Set;)V", "Lr2/l;", "composer", "p", "(Lr2/l;)V", "s", "t", "Lr2/z1;", "g", "()Lr2/z1;", "r", "c", "Lr2/k1;", "reference", "k", "(Lr2/k1;)V", "b", "Lr2/j1;", "data", "m", "(Lr2/k1;Lr2/j1;)V", "n", "(Lr2/k1;)Lr2/j1;", "q", "", "h", "()I", "compoundHashKey", "", "e", "()Z", "collectingParameterInformation", "f", "collectingSourceInformation", DateTokenConverter.CONVERTER_KEY, "collectingCallByInformation", "Lr2/z;", "j", "()Lr2/z;", "observerHolder", "Lkotlin/coroutines/CoroutineContext;", IntegerTokenConverter.CONVERTER_KEY, "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class q {
    public abstract void a(e0 composition, p<? super l, ? super Integer, h0> content);

    public abstract void b(k1 reference);

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public z1 g() {
        return r.f106783a;
    }

    public abstract int h();

    /* JADX INFO: renamed from: i */
    public abstract CoroutineContext getEffectCoroutineContext();

    public z j() {
        return null;
    }

    public abstract void k(k1 reference);

    public abstract void l(e0 composition);

    public abstract void m(k1 reference, j1 data);

    public j1 n(k1 reference) {
        return null;
    }

    public abstract void q(e0 composition);

    public abstract void t(e0 composition);

    public void c() {
    }

    public void r() {
    }

    public void o(Set<a> table) {
    }

    public void p(l composer) {
    }

    public void s(l composer) {
    }
}
