package expo.modules.rncompatibility;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import so.BoxShadow;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/bridge/ReadableMap;", "boxShadow", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lso/g;", "parseBoxShadow", "(Lcom/facebook/react/bridge/ReadableMap;Landroid/content/Context;)Lso/g;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RNCompatibleStaticWrapperKt {
    public static final BoxShadow parseBoxShadow(ReadableMap readableMap, Context context) {
        s.k(context, "context");
        return BoxShadow.INSTANCE.a(readableMap, context);
    }
}
