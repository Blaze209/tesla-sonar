package oe0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u0011\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ltd0/m;", "Ljn0/h0;", "a", "(Ltd0/m;)V", "", "appWidgetId", "", DateTokenConverter.CONVERTER_KEY, "(Ltd0/m;I)Ljava/lang/String;", "b", "(Ltd0/m;I)V", "vin", "f", "(Ltd0/m;ILjava/lang/String;)V", "Lkotlin/Pair;", "", "location", "c", "(Ltd0/m;Ljava/lang/String;Lkotlin/Pair;)Ljava/lang/String;", "locationString", "e", "(Ltd0/m;Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;)V", "widget_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final void a(m mVar) {
        s.k(mVar, "<this>");
        mVar.s(v.m(), v.e("appwidget_cache"));
    }

    public static final void b(m mVar, int i11) {
        s.k(mVar, "<this>");
        mVar.r("appwidget_" + i11);
    }

    public static final String c(m mVar, String vin, Pair<Double, Double> location) {
        s.k(mVar, "<this>");
        s.k(vin, "vin");
        s.k(location, "location");
        return mVar.h("REALM_WIDGET_LOCATION_CACHE" + vin + ":location" + location);
    }

    public static final String d(m mVar, int i11) {
        s.k(mVar, "<this>");
        return mVar.h("appwidget_" + i11);
    }

    public static final void e(m mVar, String vin, Pair<Double, Double> location, String locationString) {
        s.k(mVar, "<this>");
        s.k(vin, "vin");
        s.k(location, "location");
        s.k(locationString, "locationString");
        mVar.s(v.m(), v.e("REALM_WIDGET_LOCATION_CACHE" + vin + ":location"));
        mVar.u("REALM_WIDGET_LOCATION_CACHE" + vin + ":location" + location, locationString);
    }

    public static final void f(m mVar, int i11, String vin) {
        s.k(mVar, "<this>");
        s.k(vin, "vin");
        mVar.u("appwidget_" + i11, vin);
    }
}
