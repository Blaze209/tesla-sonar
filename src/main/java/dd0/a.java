package dd0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ie0.r;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ[\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ldd0/a;", "Ldd0/c;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isSupported", "(Landroid/content/Context;)Z", "Lkotlin/Pair;", "", "location", "destination", "", "locationText", "destinationText", "Ldd0/b;", "navType", "a", "(Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Ldd0/b;Landroid/content/Context;)Z", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements c {
    @Override // dd0.c
    public boolean a(Pair<Double, Double> location, Pair<Double, Double> destination, String locationText, String destinationText, b navType, Context context) {
        s.k(location, "location");
        s.k(destination, "destination");
        s.k(navType, "navType");
        s.k(context, "context");
        Intent intentB = e.b();
        Uri uri = Uri.parse(String.format(Locale.ENGLISH, "https://maps.google.com/maps?daddr=%s@%f,%f", URLEncoder.encode(destinationText, StandardCharsets.UTF_8.name()), destination.e(), destination.f()));
        s.j(uri, "parse(...)");
        intentB.setData(uri);
        try {
            context.startActivity(intentB);
            return true;
        } catch (Exception e11) {
            e.f60462a.d("unable to start map", e11);
            return false;
        }
    }

    @Override // dd0.c
    public boolean isSupported(Context context) {
        s.k(context, "context");
        return !r.a() || e.c(context, "com.google.android.apps.maps");
    }
}
