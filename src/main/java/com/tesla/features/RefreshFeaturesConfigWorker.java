package com.tesla.features;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.a0;
import androidx.work.e;
import androidx.work.j0;
import androidx.work.k;
import androidx.work.rxjava3.RxWorker;
import androidx.work.y;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cm0.h;
import com.tesla.logging.g;
import io.reactivex.rxjava3.core.u;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wb.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/tesla/features/RefreshFeaturesConfigWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lio/reactivex/rxjava3/core/u;", "Landroidx/work/y$a;", DateTokenConverter.CONVERTER_KEY, "()Lio/reactivex/rxjava3/core/u;", "a", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RefreshFeaturesConfigWorker extends RxWorker {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f56244e = g.INSTANCE.a("RefreshFeaturesConfigWorker");

    /* JADX INFO: renamed from: com.tesla.features.RefreshFeaturesConfigWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tesla/features/RefreshFeaturesConfigWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "a", "(Landroid/content/Context;)V", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) {
            s.k(context, "context");
            try {
                e eVarB = new e.a().e(true).d(a0.UNMETERED).g(true).b();
                TimeUnit timeUnit = TimeUnit.HOURS;
                f.h(context).e("RefreshFeaturesConfigWorker", k.REPLACE, new j0.a(RefreshFeaturesConfigWorker.class, 12L, timeUnit, 6L, timeUnit).j(eVarB).b());
            } catch (Exception e11) {
                RefreshFeaturesConfigWorker.f56244e.d("Failed to schedule refresh config worker", e11);
            }
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T, R> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T, R> f56245a = new b<>();

        b() {
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y.a apply(ie0.j0<FeaturesConfig> result) {
            s.k(result, "result");
            return result.getIsFailure() ? y.a.a() : y.a.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshFeaturesConfigWorker(Context context, WorkerParameters params) {
        super(context, params);
        s.k(context, "context");
        s.k(params, "params");
    }

    @Override // androidx.work.rxjava3.RxWorker
    public u<y.a> d() {
        c.Companion companion = c.INSTANCE;
        Context applicationContext = getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        u uVarN = companion.a(applicationContext).a(true).n(b.f56245a);
        s.j(uVarN, "map(...)");
        return uVarN;
    }
}
