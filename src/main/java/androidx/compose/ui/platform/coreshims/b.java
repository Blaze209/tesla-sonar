package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5667a;

    private b(@NonNull AutofillId autofillId) {
        this.f5667a = autofillId;
    }

    @NonNull
    public static b b(@NonNull AutofillId autofillId) {
        return new b(autofillId);
    }

    @NonNull
    public AutofillId a() {
        return a.a(this.f5667a);
    }
}
