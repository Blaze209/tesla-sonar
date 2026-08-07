package so;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lso/a;", "", "Lcom/facebook/react/bridge/ReadableMap;", "gradientMap", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Landroid/content/Context;)V", "Landroid/graphics/Rect;", "bounds", "Landroid/graphics/Shader;", "a", "(Landroid/graphics/Rect;)Landroid/graphics/Shader;", "Lso/l;", "Lso/l;", "gradient", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l gradient;

    public a(ReadableMap readableMap, Context context) {
        s.k(context, "context");
        l lVar = null;
        if (readableMap != null) {
            try {
                lVar = new l(readableMap, context);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.gradient = lVar;
    }

    public final Shader a(Rect bounds) {
        s.k(bounds, "bounds");
        l lVar = this.gradient;
        if (lVar != null) {
            return lVar.a(bounds);
        }
        return null;
    }
}
