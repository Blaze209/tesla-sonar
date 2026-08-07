package sb0;

import bo0.n;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Lsb0/e;", "", "<init>", "()V", "", "", "data", "b", "(Ljava/util/List;)Ljava/util/List;", "Lsb0/c;", "a", "(Ljava/util/List;)Lsb0/c;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f111038a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("DashcamViewer_SEIParser");

    private e() {
    }

    private final List<Byte> b(List<Byte> data) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < data.size()) {
            int i12 = i11 + 2;
            if (i12 < data.size() && data.get(i11).byteValue() == 0) {
                int i13 = i11 + 1;
                if (data.get(i13).byteValue() == 0 && data.get(i12).byteValue() == 3) {
                    arrayList.add(data.get(i11));
                    arrayList.add(data.get(i13));
                    i11 += 3;
                }
            }
            arrayList.add(data.get(i11));
            i11++;
        }
        return arrayList;
    }

    public final SEIMetadataProcessed a(List<Byte> data) {
        s.k(data, "data");
        List<Byte> listB = b(data);
        if (listB.size() < 16) {
            logger.j("parseSEIData returning empty, cleanedData size < 16");
            return SEIMetadataProcessed.INSTANCE.a();
        }
        if (listB.get(7).byteValue() != 66) {
            logger.j("parseSEIData returning empty, first padding byte not 0x42");
            return SEIMetadataProcessed.INSTANCE.a();
        }
        int i11 = 8;
        while (i11 < listB.size()) {
            byte bByteValue = listB.get(i11).byteValue();
            i11++;
            if (bByteValue == 105) {
                break;
            }
            if (bByteValue != 66) {
                logger.j("parseSEIData returning empty, invalid padding byte found");
                return SEIMetadataProcessed.INSTANCE.a();
            }
        }
        if (i11 >= listB.size()) {
            logger.j("parseSEIData returning empty, protobufStart >= cleanedData.size");
            return SEIMetadataProcessed.INSTANCE.a();
        }
        int iF = n.f(i11, listB.size() - 1);
        byte[] bArrG1 = v.g1(listB.subList(i11, iF));
        g gVar = logger;
        gVar.j("parseSEIData extracted protobufData size: " + bArrG1.length + ", protobufStart: " + i11 + ", protobufEnd: " + iF + ", cleanedData size: " + listB.size());
        try {
            SEIMetadataProcessed sEIMetadataProcessedA = d.a(a.a.f8r.decode(bArrG1));
            gVar.j("parseSEIData returning processed: " + sEIMetadataProcessedA);
            return sEIMetadataProcessedA;
        } catch (Exception e11) {
            g gVar2 = logger;
            String str = "error decoding SEI protobuf: " + e11.getMessage();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar2.getTag();
            String strG = gVar2.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            logger.j("parseSEIData returning empty, exception during decode");
            return SEIMetadataProcessed.INSTANCE.a();
        }
    }
}
