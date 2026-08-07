package tn;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0006R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001d"}, d2 = {"Ltn/b;", "", "<init>", "()V", "", "c", "()Z", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "m", "n", "o", "p", "q", "r", "Lkotlin/Function0;", "Ltn/c;", "b", "Lwn0/a;", "accessorProvider", "Ltn/c;", "accessor", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f114820a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static wn0.a<? extends c> accessorProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static c accessor;

    static {
        wn0.a<? extends c> aVar = new wn0.a() { // from class: tn.a
            @Override // wn0.a
            public final Object invoke() {
                return b.b();
            }
        };
        accessorProvider = aVar;
        accessor = aVar.invoke();
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d b() {
        return new d();
    }

    public static final boolean c() {
        return accessor.enableBridgelessArchitecture();
    }

    public static final boolean d() {
        return accessor.enableEagerRootViewAttachment();
    }

    public static final boolean e() {
        return accessor.enableFabricLogs();
    }

    public static final boolean f() {
        return accessor.enableFabricRenderer();
    }

    public static final boolean g() {
        return accessor.enableImagePrefetchingAndroid();
    }

    public static final boolean h() {
        return accessor.enableNewBackgroundAndBorderDrawables();
    }

    public static final boolean i() {
        return accessor.enablePreciseSchedulingForPremountItemsOnAndroid();
    }

    public static final boolean j() {
        return accessor.enableViewRecycling();
    }

    public static final boolean k() {
        return accessor.enableViewRecyclingForText();
    }

    public static final boolean l() {
        return accessor.enableViewRecyclingForView();
    }

    public static final boolean m() {
        return accessor.lazyAnimationCallbacks();
    }

    public static final boolean n() {
        return accessor.useFabricInterop();
    }

    public static final boolean o() {
        return accessor.useNativeViewConfigsInBridgelessMode();
    }

    public static final boolean p() {
        return accessor.useOptimizedEventBatchingOnAndroid();
    }

    public static final boolean q() {
        return accessor.useTurboModuleInterop();
    }

    public static final boolean r() {
        return accessor.useTurboModules();
    }
}
