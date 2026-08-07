package rx;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.sdkinternal.i;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final GmsLogger f109234b = new GmsLogger("ModelFileHelper", "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final String f109235c = String.format("com.google.mlkit.%s.models", "translate");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final String f109236d = String.format("com.google.mlkit.%s.models", "custom");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f109237e = String.format("com.google.mlkit.%s.models", "base");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f109238a;

    public b(@NonNull i iVar) {
        this.f109238a = iVar;
    }
}
