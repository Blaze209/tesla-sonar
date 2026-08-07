package qe0;

import androidx.camera.view.i;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.atomic.AtomicReference;
import jn0.m;
import me0.s;
import oe0.e;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001b\u0010\u0018\u001a\u00020\u00148@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000f\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001f¨\u0006 "}, d2 = {"Lqe0/c;", "", "<init>", "()V", "", "g", "()Ljava/lang/Void;", "Lqe0/a;", "widgetDependencies", "Loe0/e;", "vehicleRepository", "Ljn0/h0;", "f", "(Lqe0/a;Loe0/e;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "widgetDependencyHolder", "c", "vehicleRepositoryHolder", "Lme0/s;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "()Lme0/s;", "widgetBuilder", "Lne0/b;", "e", "Lne0/b;", "()Lne0/b;", "vehicleCommandMarker", "()Lqe0/a;", "()Loe0/e;", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f105355a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final AtomicReference<a> widgetDependencyHolder = new AtomicReference<>(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final AtomicReference<e> vehicleRepositoryHolder = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Lazy widgetBuilder = m.b(new wn0.a() { // from class: qe0.b
        @Override // wn0.a
        public final Object invoke() {
            return c.h();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final ne0.b vehicleCommandMarker = ne0.a.f93899a;

    private c() {
    }

    private final Void g() {
        throw new IllegalStateException("WidgetModule is not initialized");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s h() {
        c cVar = f105355a;
        return new s(cVar.c(), cVar.e(), vehicleCommandMarker);
    }

    public final ne0.b b() {
        return vehicleCommandMarker;
    }

    public final e c() {
        e eVar = vehicleRepositoryHolder.get();
        if (eVar != null) {
            return eVar;
        }
        g();
        throw new KotlinNothingValueException();
    }

    public final s d() {
        return (s) widgetBuilder.getValue();
    }

    public final a e() {
        a aVar = widgetDependencyHolder.get();
        if (aVar != null) {
            return aVar;
        }
        g();
        throw new KotlinNothingValueException();
    }

    public final void f(a widgetDependencies, e vehicleRepository) {
        p013kotlin.jvm.internal.s.k(widgetDependencies, "widgetDependencies");
        p013kotlin.jvm.internal.s.k(vehicleRepository, "vehicleRepository");
        i.a(widgetDependencyHolder, null, widgetDependencies);
        i.a(vehicleRepositoryHolder, null, vehicleRepository);
    }
}
