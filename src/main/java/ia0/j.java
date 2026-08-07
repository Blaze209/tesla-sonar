package ia0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lia0/j;", "Lii/b;", "Lia0/a$h;", "<init>", "()V", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "c", "(Lmi/f;Lii/k;)Lia0/a$h;", "Lmi/g;", "writer", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lmi/g;Lii/k;Lia0/a$h;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements ii.b<ChargingNearbySitesLiteFragment.Id> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f77396a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = v.e("text");

    private j() {
    }

    @Override // ii.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ChargingNearbySitesLiteFragment.Id a(mi.f reader, ii.k customScalarAdapters) {
        s.k(reader, "reader");
        s.k(customScalarAdapters, "customScalarAdapters");
        String strA = null;
        while (reader.A3(RESPONSE_NAMES) == 0) {
            strA = ii.d.f78087a.a(reader, customScalarAdapters);
        }
        s.h(strA);
        return new ChargingNearbySitesLiteFragment.Id(strA);
    }

    @Override // ii.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(mi.g writer, ii.k customScalarAdapters, ChargingNearbySitesLiteFragment.Id value) {
        s.k(writer, "writer");
        s.k(customScalarAdapters, "customScalarAdapters");
        s.k(value, "value");
        writer.N("text");
        ii.d.f78087a.b(writer, customScalarAdapters, value.getText());
    }
}
