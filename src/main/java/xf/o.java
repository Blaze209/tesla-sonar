package xf;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000)\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u000f\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0000\"\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006$\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00068\nX\u008a\u0084\u0002"}, d2 = {"", "Lxf/p;", "properties", "Lxf/n;", "b", "([Lxf/p;Lr2/l;I)Lxf/n;", "T", "property", "value", "", "keyPath", "c", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;Lr2/l;I)Lxf/p;", "Lkotlin/Function1;", "Lig/b;", "xf/o$a", DateTokenConverter.CONVERTER_KEY, "(Lwn0/l;)Lxf/o$a;", "callbackState", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class o {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0004\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"xf/o$a", "Lig/c;", "Lig/b;", "frameInfo", "a", "(Lig/b;)Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ig.c<Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<ig.b<Object>, Object> f123449d;

        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.l<? super ig.b<Object>, Object> lVar) {
            this.f123449d = lVar;
        }

        @Override // ig.c
        public Object a(ig.b<Object> frameInfo) {
            s.k(frameInfo, "frameInfo");
            return this.f123449d.invoke(frameInfo);
        }
    }

    public static final n b(p<?>[] properties, p020r2.l lVar, int i11) {
        s.k(properties, "properties");
        lVar.H(-395574495);
        if (p020r2.o.J()) {
            p020r2.o.S(-395574495, i11, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperties (LottieDynamicProperties.kt:27)");
        }
        int iHashCode = Arrays.hashCode(properties);
        lVar.H(34468001);
        boolean zR = lVar.r(iHashCode);
        Object objI = lVar.I();
        if (zR || objI == p020r2.l.INSTANCE.a()) {
            objI = new n(p013kotlin.collections.n.w1(properties));
            lVar.B(objI);
        }
        n nVar = (n) objI;
        lVar.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.T();
        return nVar;
    }

    public static final <T> p<T> c(T t11, T t12, String[] keyPath, p020r2.l lVar, int i11) {
        s.k(keyPath, "keyPath");
        lVar.H(-1788530187);
        if (p020r2.o.J()) {
            p020r2.o.S(-1788530187, i11, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperty (LottieDynamicProperties.kt:46)");
        }
        lVar.H(1613443961);
        boolean zN = lVar.n(keyPath);
        Object objI = lVar.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            objI = new ag.e((String[]) Arrays.copyOf(keyPath, keyPath.length));
            lVar.B(objI);
        }
        ag.e eVar = (ag.e) objI;
        lVar.T();
        lVar.H(1613444012);
        boolean zN2 = lVar.n(eVar) | ((((i11 & 14) ^ 6) > 4 && lVar.n(t11)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && lVar.n(t12)) || (i11 & 48) == 32);
        Object objI2 = lVar.I();
        if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
            objI2 = new p(t11, eVar, t12);
            lVar.B(objI2);
        }
        p<T> pVar = (p) objI2;
        lVar.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.T();
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a d(wn0.l lVar) {
        return new a(lVar);
    }
}
