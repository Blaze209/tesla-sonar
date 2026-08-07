package rd0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.features.FeaturesConfig;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import vc0.f3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004JC\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0016j\u0002`\u00170\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lrd0/h;", "", "Ljn0/h0;", "start", "()V", "destroy", "", "vin", "Lvc0/f3;", "userPresence", "g", "(Ljava/lang/String;Lvc0/f3;)V", "e", "b", "f", "a", "Lvc0/m;", "requestedLevel", "", "authReasons", "Lkotlin/Pair;", "Lvc0/r;", "Lkotlin/Function0;", "Lcom/tesla/phonekeyauthengine/Logging;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lvc0/m;[Ljava/lang/String;)Lkotlin/Pair;", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f107784a;

    /* JADX INFO: renamed from: rd0.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrd0/h$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isFeedbackEnabled", "Lbe0/e;", "getVehicleData", "Lcom/tesla/features/FeaturesConfig;", "featuresConfig", "Lrd0/h;", "a", "(Landroid/content/Context;ZLbe0/e;Lcom/tesla/features/FeaturesConfig;)Lrd0/h;", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f107784a = new Companion();

        private Companion() {
        }

        public final h a(Context context, boolean isFeedbackEnabled, be0.e getVehicleData, FeaturesConfig featuresConfig) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(getVehicleData, "getVehicleData");
            p013kotlin.jvm.internal.s.k(featuresConfig, "featuresConfig");
            t.Companion bVar = t.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
            return bVar.a(applicationContext, isFeedbackEnabled, getVehicleData, featuresConfig);
        }
    }

    static h i(Context context, boolean z11, be0.e eVar, FeaturesConfig featuresConfig) {
        return INSTANCE.a(context, z11, eVar, featuresConfig);
    }

    void a();

    void b();

    Pair<vc0.r, wn0.a<h0>> d(String vin, vc0.m requestedLevel, String[] authReasons);

    void destroy();

    void e();

    void f();

    void g(String vin, f3 userPresence);

    void start();
}
