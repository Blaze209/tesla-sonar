package com.fourthline.orca.internal;

import android.icu.util.Calendar;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3433jj implements DeviceDataCollector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32785c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f32786d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f32788b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.jj$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3433jj(Map destination, boolean z11) {
        p013kotlin.jvm.internal.s.k(destination, "destination");
        this.f32787a = destination;
        this.f32788b = z11;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.f32788b) {
            Locale locale = Locale.getDefault();
            TimeZone timeZone = TimeZone.getDefault();
            Currency currency = Currency.getInstance(locale);
            this.f32787a.put("localeCode", locale.getLanguage() + "-" + locale.getCountry());
            this.f32787a.put("timeZone", timeZone.getID());
            this.f32787a.put("gmtShift", Integer.valueOf((int) (((double) timeZone.getRawOffset()) / 3600000.0d)));
            this.f32787a.put("currencyCode", currency.getCurrencyCode());
            this.f32787a.put("currencySymbol", currency.getSymbol());
            Map map = this.f32787a;
            String type = Calendar.getInstance().getType();
            p013kotlin.jvm.internal.s.j(type, "getType(...)");
            map.put("calendarType", p013kotlin.text.t.V(type, "-", "_", false, 4, null));
        }
    }
}
