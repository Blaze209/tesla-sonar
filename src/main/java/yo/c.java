package yo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import j5.h;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003J\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\nJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lyo/c;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "normalizedName", "", "b", "(Landroid/content/Context;Ljava/lang/String;)I", "Ljn0/h0;", "c", "name", "f", "Landroid/graphics/drawable/Drawable;", "e", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "Landroid/net/Uri;", "g", "(Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;", "", "a", "Ljava/util/Map;", "resourceDrawableIdMap", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f125722c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> resourceDrawableIdMap = new HashMap();

    /* JADX INFO: renamed from: yo.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyo/c$a;", "", "<init>", "()V", "Lyo/c;", "a", "()Lyo/c;", "getInstance$annotations", "instance", "", "LOCAL_RESOURCE_SCHEME", "Ljava/lang/String;", "resourceDrawableIdHelper", "Lyo/c;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return c.f125722c;
        }

        private Companion() {
        }
    }

    private c() {
    }

    private final int b(Context context, String normalizedName) {
        int identifier = context.getResources().getIdentifier(normalizedName, "drawable", context.getPackageName());
        this.resourceDrawableIdMap.put(normalizedName, Integer.valueOf(identifier));
        return identifier;
    }

    public static final c d() {
        return INSTANCE.a();
    }

    public final synchronized void c() {
        this.resourceDrawableIdMap.clear();
    }

    public final Drawable e(Context context, String name) {
        s.k(context, "context");
        int iF = f(context, name);
        if (iF > 0) {
            return h.f(context.getResources(), iF, null);
        }
        return null;
    }

    public final int f(Context context, String name) {
        s.k(context, "context");
        if (name == null || name.length() == 0) {
            return 0;
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        String strV = t.V(lowerCase, "-", "_", false, 4, null);
        try {
            return Integer.parseInt(strV);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                try {
                    Integer num = this.resourceDrawableIdMap.get(strV);
                    return num != null ? num.intValue() : b(context, strV);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final Uri g(Context context, String name) {
        s.k(context, "context");
        int iF = f(context, name);
        if (iF > 0) {
            Uri uriBuild = new Uri.Builder().scheme("res").path(String.valueOf(iF)).build();
            s.h(uriBuild);
            return uriBuild;
        }
        Uri uri = Uri.EMPTY;
        s.h(uri);
        return uri;
    }
}
