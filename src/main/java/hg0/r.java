package hg0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import jn0.h0;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR#\u0010\u0013\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lhg0/r;", "Lhg0/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "g", "()Ljava/lang/String;", "b", "Ljn0/h0;", "a", "()V", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", IntegerTokenConverter.CONVERTER_KEY, "()Landroid/content/SharedPreferences;", "prefs", "c", "Ljava/lang/String;", "androidId", DateTokenConverter.CONVERTER_KEY, "appSetId", "device_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy prefs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String androidId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String appSetId;

    public r(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
        this.prefs = jn0.m.b(new wn0.a() { // from class: hg0.n
            @Override // wn0.a
            public final Object invoke() {
                return r.j(this.f72777a);
            }
        });
        this.androidId = g();
        this.appSetId = "";
    }

    private final String g() throws NoSuchAlgorithmException {
        if (Build.VERSION.SDK_INT < 26) {
            return "";
        }
        String string = i().getString("ANDROID_ID", null);
        if (string != null && !p013kotlin.text.t.y0(string)) {
            return string;
        }
        String string2 = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        if (string2 == null || p013kotlin.text.t.y0(string2)) {
            return "";
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String MODEL = Build.MODEL;
        p013kotlin.jvm.internal.s.j(MODEL, "MODEL");
        byte[] bytes = MODEL.getBytes(p013kotlin.text.d.UTF_8);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        p013kotlin.jvm.internal.s.h(bArrDigest);
        String str = string2 + p013kotlin.collections.n.P0(bArrDigest, "", null, null, 0, null, new wn0.l() { // from class: hg0.q
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r.h(((Byte) obj).byteValue());
            }
        }, 30, null);
        i().edit().putString("ANDROID_ID", str).apply();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence h(byte b11) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        return str;
    }

    private final SharedPreferences i() {
        return (SharedPreferences) this.prefs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences j(r rVar) {
        return rVar.context.getSharedPreferences("com.withpersona.sdk2.prefs", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(r rVar, AppSetIdInfo appSetIdInfo) {
        rVar.appSetId = appSetIdInfo.getId();
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(wn0.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    @Override // hg0.g
    public void a() {
        if (p013kotlin.text.t.y0(this.androidId)) {
            AppSetIdClient client = AppSet.getClient(this.context);
            p013kotlin.jvm.internal.s.j(client, "getClient(...)");
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            p013kotlin.jvm.internal.s.j(appSetIdInfo, "getAppSetIdInfo(...)");
            final wn0.l lVar = new wn0.l() { // from class: hg0.o
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r.k(this.f72778a, (AppSetIdInfo) obj);
                }
            };
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: hg0.p
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    r.l(lVar, obj);
                }
            });
        }
    }

    @Override // hg0.g
    public String b() {
        if (!p013kotlin.text.t.y0(this.androidId)) {
            return this.androidId;
        }
        if (this.appSetId.length() == 0) {
            a();
        }
        return this.appSetId;
    }
}
