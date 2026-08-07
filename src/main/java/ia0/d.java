package ia0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lia0/d;", "Lii/b;", "Lia0/a;", "<init>", "()V", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "c", "(Lmi/f;Lii/k;)Lia0/a;", "Lmi/g;", "writer", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lmi/g;Lii/k;Lia0/a;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements ii.b<ChargingNearbySitesLiteFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f77384a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = v.p("centroid", "drivingDistanceMiles", "entryPoint", "haversineDistanceMiles", "id", "localizedSiteName", "maxPowerKw", "trtId", "totalStalls", "siteType", "accessType", "teslaExclusive", "chargingAccessibility", "locationGUID", "isMagicDockSupportedSite", "accessHours", "chargingQueue");

    private d() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002c. Please report as an issue. */
    @Override // ii.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ChargingNearbySitesLiteFragment a(mi.f reader, ii.k customScalarAdapters) {
        s.k(reader, "reader");
        s.k(customScalarAdapters, "customScalarAdapters");
        Boolean boolA = null;
        ChargingNearbySitesLiteFragment.Centroid centroid = null;
        ChargingNearbySitesLiteFragment.DrivingDistanceMiles drivingDistanceMiles = null;
        ChargingNearbySitesLiteFragment.EntryPoint entryPoint = null;
        ChargingNearbySitesLiteFragment.HaversineDistanceMiles haversineDistanceMiles = null;
        ChargingNearbySitesLiteFragment.Id id2 = null;
        ChargingNearbySitesLiteFragment.LocalizedSiteName localizedSiteName = null;
        ChargingNearbySitesLiteFragment.MaxPowerKw maxPowerKw = null;
        ChargingNearbySitesLiteFragment.TrtId trtId = null;
        ChargingNearbySitesLiteFragment.TotalStalls totalStalls = null;
        ja0.b bVarA = null;
        ja0.a aVarA = null;
        Boolean boolA2 = null;
        ja0.c cVar = null;
        String strA = null;
        ChargingNearbySitesLiteFragment.AccessHours accessHours = null;
        ChargingNearbySitesLiteFragment.ChargingQueue chargingQueue = null;
        while (true) {
            switch (reader.A3(RESPONSE_NAMES)) {
                case 0:
                    centroid = (ChargingNearbySitesLiteFragment.Centroid) ii.d.b(ii.d.c(c.f77382a, true)).a(reader, customScalarAdapters);
                    boolA = boolA;
                    drivingDistanceMiles = drivingDistanceMiles;
                    break;
                case 1:
                    drivingDistanceMiles = (ChargingNearbySitesLiteFragment.DrivingDistanceMiles) ii.d.b(ii.d.d(f.f77388a, false, 1, null)).a(reader, customScalarAdapters);
                    centroid = centroid;
                    boolA = boolA;
                    chargingQueue = chargingQueue;
                    break;
                case 2:
                    entryPoint = (ChargingNearbySitesLiteFragment.EntryPoint) ii.d.b(ii.d.c(g.f77390a, true)).a(reader, customScalarAdapters);
                    boolA = boolA;
                    chargingQueue = chargingQueue;
                    break;
                case 3:
                    haversineDistanceMiles = (ChargingNearbySitesLiteFragment.HaversineDistanceMiles) ii.d.b(ii.d.d(i.f77394a, false, 1, null)).a(reader, customScalarAdapters);
                    centroid = centroid;
                    boolA = boolA;
                    drivingDistanceMiles = drivingDistanceMiles;
                    chargingQueue = chargingQueue;
                    break;
                case 4:
                    id2 = (ChargingNearbySitesLiteFragment.Id) ii.d.d(j.f77396a, false, 1, null).a(reader, customScalarAdapters);
                    centroid = centroid;
                    boolA = boolA;
                    drivingDistanceMiles = drivingDistanceMiles;
                    chargingQueue = chargingQueue;
                    break;
                case 5:
                    localizedSiteName = (ChargingNearbySitesLiteFragment.LocalizedSiteName) ii.d.b(ii.d.d(k.f77398a, false, 1, null)).a(reader, customScalarAdapters);
                    centroid = centroid;
                    boolA = boolA;
                    drivingDistanceMiles = drivingDistanceMiles;
                    chargingQueue = chargingQueue;
                    break;
                case 6:
                    maxPowerKw = (ChargingNearbySitesLiteFragment.MaxPowerKw) ii.d.b(ii.d.d(l.f77400a, false, 1, null)).a(reader, customScalarAdapters);
                    centroid = centroid;
                    boolA = boolA;
                    drivingDistanceMiles = drivingDistanceMiles;
                    chargingQueue = chargingQueue;
                    break;
                case 7:
                    trtId = (ChargingNearbySitesLiteFragment.TrtId) ii.d.b(ii.d.d(n.f77404a, false, 1, null)).a(reader, customScalarAdapters);
                    centroid = centroid;
                    boolA = boolA;
                    drivingDistanceMiles = drivingDistanceMiles;
                    chargingQueue = chargingQueue;
                    break;
                case 8:
                    totalStalls = (ChargingNearbySitesLiteFragment.TotalStalls) ii.d.b(ii.d.d(m.f77402a, false, 1, null)).a(reader, customScalarAdapters);
                    centroid = centroid;
                    boolA = boolA;
                    drivingDistanceMiles = drivingDistanceMiles;
                    chargingQueue = chargingQueue;
                    break;
                case 9:
                    chargingQueue = chargingQueue;
                    bVarA = ka0.b.f85784a.a(reader, customScalarAdapters);
                    chargingQueue = chargingQueue;
                    break;
                case 10:
                    chargingQueue = chargingQueue;
                    aVarA = ka0.a.f85783a.a(reader, customScalarAdapters);
                    chargingQueue = chargingQueue;
                    break;
                case 11:
                    chargingQueue = chargingQueue;
                    boolA2 = ii.d.f78098l.a(reader, customScalarAdapters);
                    chargingQueue = chargingQueue;
                    break;
                case 12:
                    chargingQueue = chargingQueue;
                    cVar = (ja0.c) ii.d.b(ka0.c.f85785a).a(reader, customScalarAdapters);
                    chargingQueue = chargingQueue;
                    break;
                case 13:
                    chargingQueue = chargingQueue;
                    strA = ii.d.f78087a.a(reader, customScalarAdapters);
                    chargingQueue = chargingQueue;
                    break;
                case 14:
                    chargingQueue = chargingQueue;
                    boolA = ii.d.f78092f.a(reader, customScalarAdapters);
                    chargingQueue = chargingQueue;
                    break;
                case 15:
                    accessHours = (ChargingNearbySitesLiteFragment.AccessHours) ii.d.b(ii.d.d(b.f77380a, false, 1, null)).a(reader, customScalarAdapters);
                    centroid = centroid;
                    boolA = boolA;
                    drivingDistanceMiles = drivingDistanceMiles;
                    chargingQueue = chargingQueue;
                    break;
                case 16:
                    centroid = centroid;
                    boolA = boolA;
                    drivingDistanceMiles = drivingDistanceMiles;
                    chargingQueue = (ChargingNearbySitesLiteFragment.ChargingQueue) ii.d.b(ii.d.d(e.f77386a, false, 1, null)).a(reader, customScalarAdapters);
                    break;
            }
            Boolean bool = boolA;
            s.h(id2);
            s.h(bVarA);
            s.h(aVarA);
            s.h(strA);
            s.h(bool);
            return new ChargingNearbySitesLiteFragment(centroid, drivingDistanceMiles, entryPoint, haversineDistanceMiles, id2, localizedSiteName, maxPowerKw, trtId, totalStalls, bVarA, aVarA, boolA2, cVar, strA, bool.booleanValue(), accessHours, chargingQueue);
        }
    }

    @Override // ii.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(mi.g writer, ii.k customScalarAdapters, ChargingNearbySitesLiteFragment value) {
        s.k(writer, "writer");
        s.k(customScalarAdapters, "customScalarAdapters");
        s.k(value, "value");
        writer.N("centroid");
        ii.d.b(ii.d.c(c.f77382a, true)).b(writer, customScalarAdapters, value.getCentroid());
        writer.N("drivingDistanceMiles");
        ii.d.b(ii.d.d(f.f77388a, false, 1, null)).b(writer, customScalarAdapters, value.getDrivingDistanceMiles());
        writer.N("entryPoint");
        ii.d.b(ii.d.c(g.f77390a, true)).b(writer, customScalarAdapters, value.getEntryPoint());
        writer.N("haversineDistanceMiles");
        ii.d.b(ii.d.d(i.f77394a, false, 1, null)).b(writer, customScalarAdapters, value.getHaversineDistanceMiles());
        writer.N("id");
        ii.d.d(j.f77396a, false, 1, null).b(writer, customScalarAdapters, value.getId());
        writer.N("localizedSiteName");
        ii.d.b(ii.d.d(k.f77398a, false, 1, null)).b(writer, customScalarAdapters, value.getLocalizedSiteName());
        writer.N("maxPowerKw");
        ii.d.b(ii.d.d(l.f77400a, false, 1, null)).b(writer, customScalarAdapters, value.getMaxPowerKw());
        writer.N("trtId");
        ii.d.b(ii.d.d(n.f77404a, false, 1, null)).b(writer, customScalarAdapters, value.getTrtId());
        writer.N("totalStalls");
        ii.d.b(ii.d.d(m.f77402a, false, 1, null)).b(writer, customScalarAdapters, value.getTotalStalls());
        writer.N("siteType");
        ka0.b.f85784a.b(writer, customScalarAdapters, value.getSiteType());
        writer.N("accessType");
        ka0.a.f85783a.b(writer, customScalarAdapters, value.getAccessType());
        writer.N("teslaExclusive");
        ii.d.f78098l.b(writer, customScalarAdapters, value.getTeslaExclusive());
        writer.N("chargingAccessibility");
        ii.d.b(ka0.c.f85785a).b(writer, customScalarAdapters, value.getChargingAccessibility());
        writer.N("locationGUID");
        ii.d.f78087a.b(writer, customScalarAdapters, value.getLocationGUID());
        writer.N("isMagicDockSupportedSite");
        ii.d.f78092f.b(writer, customScalarAdapters, Boolean.valueOf(value.getIsMagicDockSupportedSite()));
        writer.N("accessHours");
        ii.d.b(ii.d.d(b.f77380a, false, 1, null)).b(writer, customScalarAdapters, value.getAccessHours());
        writer.N("chargingQueue");
        ii.d.b(ii.d.d(e.f77386a, false, 1, null)).b(writer, customScalarAdapters, value.getChargingQueue());
    }
}
