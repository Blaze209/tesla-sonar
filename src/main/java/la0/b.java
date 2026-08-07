package la0;

import android.os.Bundle;
import cc0.c;
import cc0.e;
import cc0.f;
import cc0.h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0015\u0010\u0019¨\u0006\u001b"}, d2 = {"Lla0/b;", "Lpa0/a;", "<init>", "()V", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "Lcc0/c;", "event", "Ljn0/h0;", "a", "(Lcc0/c;)V", "", "Lcc0/f;", "parameters", "b", "(Ljava/util/List;)V", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "c", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getFirebaseAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "firebaseAnalytics", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements pa0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f89742a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("FirebaseAnalyticsAdapter");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static FirebaseAnalytics firebaseAnalytics;

    private b() {
    }

    private final String d(String str) {
        Locale US = Locale.US;
        s.j(US, "US");
        String lowerCase = str.toLowerCase(US);
        s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // pa0.a
    public void a(c event) {
        String value;
        s.k(event, "event");
        if (firebaseAnalytics == null) {
            g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("record called but firebase analytics is null");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return;
        }
        Bundle bundle = new Bundle();
        for (f fVar : event.d()) {
            b bVar = f89742a;
            String strD = bVar.d(fVar.getKey().name());
            cc0.a aVar2 = fVar.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.BooleanField.TYPE java.lang.String();
            if (aVar2 != null) {
                bundle.putBoolean(strD, aVar2.getValue());
            }
            cc0.b bVar2 = fVar.getDouble();
            if (bVar2 != null) {
                bundle.putDouble(strD, bVar2.getValue());
            }
            h hVar = fVar.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.StringField.TYPE java.lang.String();
            if (hVar != null && (value = hVar.getValue()) != null) {
                bundle.putString(strD, bVar.d(value));
            }
            e eVar = fVar.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.IntegerField.TYPE java.lang.String();
            if (eVar != null) {
                bundle.putLong(strD, eVar.getValue());
            }
        }
        FirebaseAnalytics firebaseAnalytics2 = firebaseAnalytics;
        if (firebaseAnalytics2 != null) {
            firebaseAnalytics2.a(d(event.getName().name()), bundle);
        }
    }

    @Override // pa0.a
    public void b(List<f> parameters) {
        String value;
        if (firebaseAnalytics == null) {
            g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("record called but firebase analytics is null");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return;
        }
        Bundle bundle = new Bundle();
        if (parameters != null) {
            for (f fVar : parameters) {
                b bVar = f89742a;
                String strD = bVar.d(fVar.getKey().name());
                cc0.a aVar2 = fVar.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.BooleanField.TYPE java.lang.String();
                if (aVar2 != null) {
                    bundle.putBoolean(strD, aVar2.getValue());
                }
                cc0.b bVar2 = fVar.getDouble();
                if (bVar2 != null) {
                    bundle.putDouble(strD, bVar2.getValue());
                }
                h hVar = fVar.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.StringField.TYPE java.lang.String();
                if (hVar != null && (value = hVar.getValue()) != null) {
                    bundle.putString(strD, bVar.d(value));
                }
                e eVar = fVar.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.IntegerField.TYPE java.lang.String();
                if (eVar != null) {
                    bundle.putLong(strD, eVar.getValue());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics2 = firebaseAnalytics;
        if (firebaseAnalytics2 != null) {
            firebaseAnalytics2.c(bundle);
        }
    }

    public final void c(FirebaseAnalytics firebaseAnalytics2) {
        firebaseAnalytics = firebaseAnalytics2;
    }
}
