package so;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lso/l;", "", "Lcom/facebook/react/bridge/ReadableMap;", "gradient", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Landroid/content/Context;)V", "Landroid/graphics/Rect;", "bounds", "Landroid/graphics/Shader;", "a", "(Landroid/graphics/Rect;)Landroid/graphics/Shader;", "Lso/l$a;", "Lso/l$a;", "type", "Lso/m;", "b", "Lso/m;", "linearGradient", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m linearGradient;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lso/l$a;", "", "<init>", "(Ljava/lang/String;I)V", "LINEAR_GRADIENT", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private enum a {
        LINEAR_GRADIENT;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111520a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.LINEAR_GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f111520a = iArr;
        }
    }

    public l(ReadableMap readableMap, Context context) {
        s.k(context, "context");
        if (readableMap == null) {
            throw new IllegalArgumentException("Gradient cannot be null");
        }
        String string = readableMap.getString("type");
        if (!s.f(string, "linearGradient")) {
            throw new IllegalArgumentException("Unsupported gradient type: " + string);
        }
        this.type = a.LINEAR_GRADIENT;
        ReadableMap map = readableMap.getMap("direction");
        if (map == null) {
            throw new IllegalArgumentException("Gradient must have direction");
        }
        ReadableArray array = readableMap.getArray("colorStops");
        if (array == null) {
            throw new IllegalArgumentException("Invalid colorStops array");
        }
        this.linearGradient = new m(map, array, context);
    }

    public final Shader a(Rect bounds) {
        s.k(bounds, "bounds");
        if (b.f111520a[this.type.ordinal()] == 1) {
            return this.linearGradient.d(bounds.width(), bounds.height());
        }
        throw new NoWhenBranchMatchedException();
    }
}
