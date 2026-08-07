package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkManagerInitializer implements cb.a<s0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f14435a = z.i("WrkMgrInitializer");

    @Override // cb.a
    public List<Class<? extends cb.a<?>>> b() {
        return Collections.EMPTY_LIST;
    }

    @Override // cb.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public s0 a(Context context) {
        z.e().a(f14435a, "Initializing WorkManager with default configuration.");
        s0.g(context, new c.a().a());
        return s0.e(context);
    }
}
