package expo.modules.kotlin.activityaware;

import jn0.h0;
import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class AppCompatActivityAwareKt$withActivityAvailable$2$1 implements l<Throwable, h0> {
    final /* synthetic */ AppCompatActivityAwareKt$withActivityAvailable$2$listener$1 $listener;
    final /* synthetic */ AppCompatActivityAware $this_withActivityAvailable;

    public AppCompatActivityAwareKt$withActivityAvailable$2$1(AppCompatActivityAware appCompatActivityAware, AppCompatActivityAwareKt$withActivityAvailable$2$listener$1 appCompatActivityAwareKt$withActivityAvailable$2$listener$1) {
        this.$this_withActivityAvailable = appCompatActivityAware;
        this.$listener = appCompatActivityAwareKt$withActivityAvailable$2$listener$1;
    }

    @Override // wn0.l
    public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
        invoke2(th2);
        return h0.f84049a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        this.$this_withActivityAvailable.removeOnActivityAvailableListener(this.$listener);
    }
}
