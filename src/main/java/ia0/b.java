package ia0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lia0/b;", "Lii/b;", "Lia0/a$a;", "<init>", "()V", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "c", "(Lmi/f;Lii/k;)Lia0/a$a;", "Lmi/g;", "writer", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lmi/g;Lii/k;Lia0/a$a;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements ii.b<ChargingNearbySitesLiteFragment.AccessHours> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f77380a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = v.p("shouldDisplay", "openNow", "hour");

    private b() {
    }

    @Override // ii.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ChargingNearbySitesLiteFragment.AccessHours a(mi.f reader, ii.k customScalarAdapters) {
        s.k(reader, "reader");
        s.k(customScalarAdapters, "customScalarAdapters");
        Boolean boolA = null;
        Boolean boolA2 = null;
        String strA = null;
        while (true) {
            int iA3 = reader.A3(RESPONSE_NAMES);
            if (iA3 == 0) {
                boolA = ii.d.f78092f.a(reader, customScalarAdapters);
            } else if (iA3 == 1) {
                boolA2 = ii.d.f78098l.a(reader, customScalarAdapters);
            } else {
                if (iA3 != 2) {
                    s.h(boolA);
                    return new ChargingNearbySitesLiteFragment.AccessHours(boolA.booleanValue(), boolA2, strA);
                }
                strA = ii.d.f78095i.a(reader, customScalarAdapters);
            }
        }
    }

    @Override // ii.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(mi.g writer, ii.k customScalarAdapters, ChargingNearbySitesLiteFragment.AccessHours value) {
        s.k(writer, "writer");
        s.k(customScalarAdapters, "customScalarAdapters");
        s.k(value, "value");
        writer.N("shouldDisplay");
        ii.d.f78092f.b(writer, customScalarAdapters, Boolean.valueOf(value.getShouldDisplay()));
        writer.N("openNow");
        ii.d.f78098l.b(writer, customScalarAdapters, value.getOpenNow());
        writer.N("hour");
        ii.d.f78095i.b(writer, customScalarAdapters, value.getHour());
    }
}
