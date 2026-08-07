package hc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.m;
import okio.o;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001b\u0010\u0006\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0002¨\u0006\u0007"}, d2 = {"Lhc/a;", DateTokenConverter.CONVERTER_KEY, "()Lhc/a;", "a", "Lkotlin/Lazy;", "b", "instance", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f72532a = m.b(new wn0.a() { // from class: hc.f
        @Override // wn0.a
        public final Object invoke() {
            return g.c();
        }
    });

    private static final a b() {
        return (a) f72532a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a c() {
        return new a.C1519a().b(o.f97988c.i("coil3_disk_cache")).a();
    }

    public static final a d() {
        return b();
    }
}
