package ie0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.atomic.AtomicReference;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lie0/o0;", "Lie0/l;", "<init>", "()V", "dataRestrictionPolicy", "Ljn0/h0;", "b", "(Lie0/l;)V", "", "a", "()Z", "Ljava/util/concurrent/atomic/AtomicReference;", "c", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/tesla/logging/g;", DateTokenConverter.CONVERTER_KEY, "Lcom/tesla/logging/g;", "logger", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o0 implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f77607b = new o0();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final AtomicReference<l> dataRestrictionPolicy = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("DataRestrictionPolicy");

    private o0() {
    }

    @Override // ie0.l
    public boolean a() {
        l lVar = dataRestrictionPolicy.get();
        if (lVar != null) {
            return lVar.a();
        }
        return false;
    }

    public final void b(l dataRestrictionPolicy2) {
        p013kotlin.jvm.internal.s.k(dataRestrictionPolicy2, "dataRestrictionPolicy");
        if (androidx.camera.view.i.a(dataRestrictionPolicy, null, dataRestrictionPolicy2)) {
            return;
        }
        logger.f("unable to initialize data restriction holder", new IllegalStateException("Do not init DataRestriction interface twice"));
    }
}
