package xb0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.moshi.h;
import com.squareup.moshi.u;
import com.tesla.domain.model.EnergySite;
import com.tesla.domain.model.Product;
import com.tesla.domain.model.Vehicle;
import com.tesla.domain.model.adapter.ForceToIntAdapter;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lxb0/c;", "", "<init>", "()V", "Lcom/squareup/moshi/u;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", "e", "()Lcom/squareup/moshi/u;", "moshi", "Lcom/squareup/moshi/h;", "Lcom/tesla/domain/model/Product;", "c", DateTokenConverter.CONVERTER_KEY, "()Lcom/squareup/moshi/h;", "adapter", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f123196a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy moshi = m.b(new wn0.a() { // from class: xb0.a
        @Override // wn0.a
        public final Object invoke() {
            return c.f();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Lazy adapter = m.b(new wn0.a() { // from class: xb0.b
        @Override // wn0.a
        public final Object invoke() {
            return c.c();
        }
    });

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h c() {
        return f123196a.e().c(Product.class);
    }

    private final u e() {
        return (u) moshi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u f() {
        return new u.b().a(u20.b.b(Product.class, "type").e(Vehicle.class, "VEHICLE").e(EnergySite.class, "ENERGY_SITE")).b(new ForceToIntAdapter()).a(new w20.b()).d();
    }

    public final h<Product> d() {
        Object value = adapter.getValue();
        s.j(value, "getValue(...)");
        return (h) value;
    }
}
