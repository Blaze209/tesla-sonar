package w0;

import androidx.annotation.NonNull;
import androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExtensionDisabledQuirk f120245a = (ExtensionDisabledQuirk) androidx.camera.extensions.internal.compat.quirk.a.b(ExtensionDisabledQuirk.class);

    public boolean a(@NonNull String str) {
        ExtensionDisabledQuirk extensionDisabledQuirk = this.f120245a;
        return extensionDisabledQuirk != null && extensionDisabledQuirk.m(str);
    }
}
