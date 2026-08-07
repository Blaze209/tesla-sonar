package ra0;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Process;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.tesla.logging.TeslaLog;
import io.realm.c0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import jn0.h0;
import jn0.x;
import kd0.i;
import nc0.l;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import p013kotlin.text.t;
import td0.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0007*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0007*\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001d\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00190\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#JK\u0010&\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u0007H\u0003¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u001bH\u0007¢\u0006\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lra0/e;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "", "data", "Landroid/os/storage/StorageManager;", "storageManager", "Landroid/app/usage/StorageStatsManager;", "storageStatsManager", "Ljn0/h0;", "m", "(Landroid/content/Context;Ljava/util/Map;Landroid/os/storage/StorageManager;Landroid/app/usage/StorageStatsManager;)V", "", "", "c", "(J)D", DateTokenConverter.CONVERTER_KEY, "(J)Ljava/lang/String;", "e", "(D)Ljava/lang/String;", "", "Ljava/io/File;", "prefix", "", "trackLastModified", "o", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Z)V", Action.KEY_ATTRIBUTE, "j", "(Ljava/lang/String;)Ljava/lang/String;", "f", "(Landroid/content/Context;)Ljava/util/List;", "Lkd0/i;", "trace", "g", "(Landroid/os/storage/StorageManager;Landroid/content/Context;Landroid/app/usage/StorageStatsManager;Ljava/util/Map;Lkd0/i;Ljava/lang/String;)V", "k", "(Landroid/content/Context;)V", "isBleProcess", "h", "(Landroid/content/Context;Z)V", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f107464a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("StorageTelemetry");

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f107466a;

        public a(Context context) {
            this.f107466a = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(((StorageVolume) t11).getDescription(this.f107466a), ((StorageVolume) t12).getDescription(this.f107466a));
        }
    }

    private e() {
    }

    private final double c(long j11) {
        return Double.parseDouble(e(j11 / 1048576.0d));
    }

    private final String d(long j11) {
        Double dValueOf = Double.valueOf(c(j11));
        if (dValueOf.doubleValue() <= 0.0d) {
            dValueOf = null;
        }
        if (dValueOf != null) {
            return e(dValueOf.doubleValue());
        }
        return null;
    }

    private final String e(double d11) {
        t0 t0Var = t0.f86535a;
        String str = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d11)}, 1));
        s.j(str, "format(...)");
        return str;
    }

    private final List<File> f(Context context) {
        File[] fileArrListFiles = context.getFilesDir().listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                String name = file.getName();
                s.j(name, "getName(...)");
                if (t.f0(name, "realm", true)) {
                    arrayList.add(file);
                }
            }
            List<File> listM1 = v.m1(arrayList);
            if (listM1 != null) {
                return listM1;
            }
        }
        return v.m();
    }

    private final void g(StorageManager storageManager, Context context, StorageStatsManager storageStatsManager, Map<String, Object> data, i trace, String prefix) {
        Iterator it;
        Context context2 = context;
        List<StorageVolume> storageVolumes = storageManager.getStorageVolumes();
        s.j(storageVolumes, "getStorageVolumes(...)");
        Iterator it2 = v.a1(storageVolumes, new a(context2)).iterator();
        while (it2.hasNext()) {
            StorageVolume storageVolume = (StorageVolume) it2.next();
            try {
                String description = storageVolume.getDescription(context2);
                s.j(description, "getDescription(...)");
                String strV = t.V(description, " ", "_", false, 4, null);
                String uuid = storageVolume.getUuid();
                UUID uuidFromString = uuid == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid);
                StorageStats storageStatsQueryStatsForPackage = storageStatsManager.queryStatsForPackage(uuidFromString, context2.getPackageName(), Process.myUserHandle());
                s.j(storageStatsQueryStatsForPackage, "queryStatsForPackage(...)");
                String str = prefix + "_" + strV + "_app_mb";
                e eVar = f107464a;
                double dC = eVar.c(storageStatsQueryStatsForPackage.getAppBytes());
                data.put(str, eVar.e(dC));
                String str2 = prefix + "_" + strV + "_data_mb";
                double dC2 = eVar.c(storageStatsQueryStatsForPackage.getDataBytes());
                data.put(str2, eVar.e(dC2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(prefix);
                sb2.append("_");
                sb2.append(strV);
                it = it2;
                try {
                    sb2.append("_cache_mb");
                    String string = sb2.toString();
                    double dC3 = eVar.c(storageStatsQueryStatsForPackage.getCacheBytes());
                    data.put(string, eVar.e(dC3));
                    String str3 = prefix + "_" + strV + "_free_mb";
                    long freeBytes = storageStatsManager.getFreeBytes(uuidFromString);
                    data.put(str3, Double.valueOf(eVar.c(freeBytes)));
                    String str4 = prefix + "_" + strV + "_total_mb";
                    long totalBytes = storageStatsManager.getTotalBytes(uuidFromString);
                    data.put(str4, Double.valueOf(eVar.c(totalBytes)));
                    data.put(prefix + "_" + strV + "_emulated", Boolean.valueOf(storageVolume.isEmulated()));
                    boolean zIsPrimary = storageVolume.isPrimary();
                    data.put(prefix + "_" + strV + "_primary", Boolean.valueOf(zIsPrimary));
                    data.put(prefix + "_" + strV + "_state", storageVolume.getState());
                    if (!zIsPrimary) {
                        trace.b(str, (long) dC);
                        trace.b(str2, (long) dC2);
                        trace.b(string, (long) dC3);
                        trace.b(str3, freeBytes);
                        trace.b(str4, totalBytes);
                    }
                } catch (Exception e11) {
                    e = e11;
                    TeslaLog.INSTANCE.e("StorageTelemetryLogger", "Storage manager error", e);
                }
            } catch (Exception e12) {
                e = e12;
                it = it2;
            }
            context2 = context;
            it2 = it;
        }
    }

    public static /* synthetic */ void i(e eVar, Context context, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        eVar.h(context, z11);
    }

    private final String j(String key) {
        if (t.L(key, "backup.realm", false, 2, null)) {
            return "realm_backup";
        }
        if (t.L(key, "TrealmStorage", false, 2, null)) {
            key = "realm";
        }
        return t.T0(key, "_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(Context context) {
        Map<String, Object> mapO = v0.o(x.a("type", "mobile-app-storage-telemetry-realm"), x.a("v", 2));
        e eVar = f107464a;
        eVar.o(eVar.f(context), mapO, "", true);
        ud0.a.b(mapO, false, null, 4, null);
        return h0.f84049a;
    }

    private final void m(final Context context, final Map<String, Object> data, final StorageManager storageManager, final StorageStatsManager storageStatsManager) {
        io.reactivex.rxjava3.core.b.f(new Callable() { // from class: ra0.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.n(context, data, storageManager, storageStatsManager);
            }
        }).k(vm0.a.c()).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 n(Context context, Map map, StorageManager storageManager, StorageStatsManager storageStatsManager) {
        e eVar = f107464a;
        p(eVar, eVar.f(context), map, "after_realm_access", false, 4, null);
        i iVarC = kd0.e.b.c(kd0.e.INSTANCE.a(), l.ANDROID_PRIMARY_STORAGE_VOLUME_DISK_STATS_WITH_COMPACTION, null, 2, null);
        eVar.g(storageManager, context, storageStatsManager, map, iVarC, "after_realm_access");
        logger.j(map.toString());
        i.a.a(iVarC, null, 1, null);
        ud0.a.b(map, false, null, 4, null);
        return h0.f84049a;
    }

    private final void o(List<? extends File> list, Map<String, Object> map, String str, boolean z11) {
        try {
            ArrayList<File> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((File) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            for (File file : arrayList) {
                String name = file.getName();
                long length = file.length();
                e eVar = f107464a;
                String strD = eVar.d(length);
                if (strD != null) {
                    s.h(name);
                    String strJ = eVar.j(name);
                    if (!t.y0(str)) {
                        strJ = str + "_" + strJ;
                    }
                    map.put(strJ + "_mb", strD);
                    if (z11) {
                        map.put(strJ + "_last_modified", Long.valueOf(file.lastModified()));
                    }
                }
            }
        } catch (Exception e11) {
            logger.d("Error tracking file sizes", e11);
        }
    }

    static /* synthetic */ void p(e eVar, List list, Map map, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        eVar.o(list, map, str, z11);
    }

    public final void h(Context context, boolean isBleProcess) {
        s.k(context, "context");
        StorageStatsManager storageStatsManagerA = b.a(context.getSystemService("storagestats"));
        StorageManager storageManager = (StorageManager) context.getSystemService(PlaceTypes.STORAGE);
        if (storageManager == null || storageStatsManagerA == null) {
            c0.U0(context);
            return;
        }
        Map<String, Object> mapO = v0.o(x.a("type", "mobile-app-storage-telemetry"), x.a("v", 3), x.a("ble_process", Boolean.valueOf(isBleProcess)));
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0.U0(context);
        m.j();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        logger.j("realm init time: " + jCurrentTimeMillis2 + " ms.");
        mapO.put("realm_init_time_ms", Long.valueOf(jCurrentTimeMillis2));
        m(context, mapO, storageManager, storageStatsManagerA);
    }

    public final void k(final Context context) {
        s.k(context, "context");
        io.reactivex.rxjava3.core.b.f(new Callable() { // from class: ra0.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.l(context);
            }
        }).k(vm0.a.c()).g();
    }
}
