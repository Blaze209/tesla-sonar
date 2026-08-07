package expo.modules.imageloader;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import expo.modules.core.BasePackage;
import expo.modules.core.interfaces.InternalModule;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lexpo/modules/imageloader/ImageLoaderPackage;", "Lexpo/modules/core/BasePackage;", "<init>", "()V", "createInternalModules", "", "Lexpo/modules/core/interfaces/InternalModule;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "expo-image-loader_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageLoaderPackage extends BasePackage {
    @Override // expo.modules.core.BasePackage, expo.modules.core.interfaces.Package
    public List<InternalModule> createInternalModules(Context context) {
        s.k(context, "context");
        return v.e(new ImageLoaderModule(context));
    }
}
