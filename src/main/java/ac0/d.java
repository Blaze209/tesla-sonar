package ac0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.squareup.moshi.u;
import com.tesla.features.FeaturesConfig;
import com.tesla.logging.TeslaLog;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import td0.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR8\u0010\u0012\u001a&\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00060\u0006 \u000f*\u0012\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lac0/d;", "Lcom/tesla/features/b;", "Ltd0/m;", "realmHelper", "<init>", "(Ltd0/m;)V", "Lcom/tesla/features/FeaturesConfig;", "b", "()Lcom/tesla/features/FeaturesConfig;", "config", "Ljn0/h0;", "a", "(Lcom/tesla/features/FeaturesConfig;)V", "Ltd0/m;", "Lcom/squareup/moshi/h;", "kotlin.jvm.PlatformType", "c", "Lcom/squareup/moshi/h;", "adapter", DateTokenConverter.CONVERTER_KEY, "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements com.tesla.features.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.tesla.logging.g f958e = com.tesla.logging.g.INSTANCE.a("FeaturesConfigRepository");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m realmHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.squareup.moshi.h<FeaturesConfig> adapter;

    public d(m realmHelper) {
        s.k(realmHelper, "realmHelper");
        this.realmHelper = realmHelper;
        this.adapter = new u.b().d().c(FeaturesConfig.class);
    }

    @Override // com.tesla.features.b
    public void a(FeaturesConfig config) {
        try {
            if (config == null) {
                this.realmHelper.r("FEATURE_CONFIG");
                return;
            }
            if (this.realmHelper.u("FEATURE_CONFIG", this.adapter.toJson(config))) {
                return;
            }
            com.tesla.logging.g gVar = f958e;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("failed to persist config");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        } catch (Exception e11) {
            f958e.d("failure setting feature config", e11);
        }
    }

    @Override // com.tesla.features.b
    public FeaturesConfig b() {
        FeaturesConfig featuresConfigFromJson;
        FeaturesConfig featuresConfig = new FeaturesConfig(null, null, null, null, null, null, null, 127, null);
        try {
            String strH = this.realmHelper.h("FEATURE_CONFIG");
            return (strH == null || (featuresConfigFromJson = this.adapter.fromJson(strH)) == null) ? featuresConfig : featuresConfigFromJson;
        } catch (Exception e11) {
            f958e.d("error getting local config", e11);
            return featuresConfig;
        }
    }
}
