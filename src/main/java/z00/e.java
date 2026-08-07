package z00;

import android.content.Intent;
import android.os.Build;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lz00/e;", "", "<init>", "()V", "Lz00/g;", "options", "Landroid/content/Intent;", "a", "(Lz00/g;)Landroid/content/Intent;", "react-native-documents_picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f126411a = new e();

    private e() {
    }

    public final Intent a(PickOptions options) {
        String strD;
        s.k(options, "options");
        Intent intent = new Intent(options.a());
        String[] mimeTypes = options.getMimeTypes();
        if (mimeTypes.length > 1) {
            intent.putExtra("android.intent.extra.MIME_TYPES", mimeTypes);
            strD = options.d();
        } else {
            strD = mimeTypes[0];
        }
        intent.setType(strD);
        if (Build.VERSION.SDK_INT >= 26 && options.getInitialDirectoryUrl() != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", options.getInitialDirectoryUrl());
        }
        if (!options.getAllowVirtualFiles()) {
            intent.addCategory("android.intent.category.OPENABLE");
        }
        intent.putExtra("android.intent.extra.LOCAL_ONLY", options.getLocalOnly());
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", options.getMultiple());
        return intent;
    }
}
