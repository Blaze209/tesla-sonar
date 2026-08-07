package yo;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Objects;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0016\u0018\u0000 *2\u00020\u0001:\u0001+B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lyo/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "source", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Lgo/a;", "cacheControl", "<init>", "(Landroid/content/Context;Ljava/lang/String;DDLgo/a;)V", "Landroid/net/Uri;", "computeUri", "(Landroid/content/Context;)Landroid/net/Uri;", "computeLocalUri", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "Lgo/a;", "getCacheControl", "()Lgo/a;", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "size", "D", "getSize", "()D", "_isResource", "Z", "isResource", "()Z", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TRANSPARENT_BITMAP_URI = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=";
    private boolean _isResource;
    private final go.a cacheControl;
    private final double size;
    private final String source;
    private final Uri uri;

    /* JADX INFO: renamed from: yo.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyo/a$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lyo/a;", "a", "(Landroid/content/Context;)Lyo/a;", "", "TRANSPARENT_BITMAP_URI", "Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context) {
            s.k(context, "context");
            return new a(context, a.TRANSPARENT_BITMAP_URI, 0.0d, 0.0d, go.a.DEFAULT, 12, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str) {
        this(context, str, 0.0d, 0.0d, null, 28, null);
        s.k(context, "context");
    }

    private final Uri computeLocalUri(Context context) {
        this._isResource = true;
        return c.INSTANCE.a().g(context, this.source);
    }

    private final Uri computeUri(Context context) {
        try {
            Uri uri = Uri.parse(this.source);
            return uri.getScheme() == null ? computeLocalUri(context) : uri;
        } catch (NullPointerException unused) {
            return computeLocalUri(context);
        }
    }

    public static final a getTransparentBitmapImageSource(Context context) {
        return INSTANCE.a(context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && s.f(getClass(), other.getClass())) {
            a aVar = (a) other;
            if (Double.compare(aVar.size, this.size) == 0 && get_isResource() == aVar.get_isResource() && s.f(getUri(), aVar.getUri()) && s.f(this.source, aVar.source) && this.cacheControl == aVar.cacheControl) {
                return true;
            }
        }
        return false;
    }

    public final go.a getCacheControl() {
        return this.cacheControl;
    }

    public final double getSize() {
        return this.size;
    }

    public final String getSource() {
        return this.source;
    }

    public Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return Objects.hash(getUri(), this.source, Double.valueOf(this.size), Boolean.valueOf(get_isResource()), this.cacheControl);
    }

    /* JADX INFO: renamed from: isResource, reason: from getter */
    public boolean get_isResource() {
        return this._isResource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, double d11) {
        this(context, str, d11, 0.0d, null, 24, null);
        s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, double d11, double d12) {
        this(context, str, d11, d12, null, 16, null);
        s.k(context, "context");
    }

    public a(Context context, String str, double d11, double d12, go.a cacheControl) {
        s.k(context, "context");
        s.k(cacheControl, "cacheControl");
        this.source = str;
        this.cacheControl = cacheControl;
        this.uri = computeUri(context);
        this.size = d11 * d12;
    }

    public /* synthetic */ a(Context context, String str, double d11, double d12, go.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? 0.0d : d11, (i11 & 8) != 0 ? 0.0d : d12, (i11 & 16) != 0 ? go.a.DEFAULT : aVar);
    }
}
