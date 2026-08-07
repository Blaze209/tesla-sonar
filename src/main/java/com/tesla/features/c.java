package com.tesla.features;

import ac0.h;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.tesla.oapi.OwnerApiEndpoints;
import com.tesla.oapi.SendOwnerRequest;
import ie0.j0;
import io.reactivex.rxjava3.core.u;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import td0.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/features/c;", "", "", "refresh", "Lio/reactivex/rxjava3/core/u;", "Lie0/j0;", "Lcom/tesla/features/FeaturesConfig;", "a", "(Z)Lio/reactivex/rxjava3/core/u;", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f56268a;

    /* JADX INFO: renamed from: com.tesla.features.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/features/c$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/tesla/features/c;", "a", "(Landroid/content/Context;)Lcom/tesla/features/c;", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f56268a = new Companion();

        private Companion() {
        }

        public final c a(Context context) {
            s.k(context, "context");
            Context applicationContext = context.getApplicationContext();
            OwnerApiEndpoints.Companion companion = OwnerApiEndpoints.INSTANCE;
            s.h(applicationContext);
            OwnerApiEndpoints companion2 = companion.getInstance(applicationContext);
            SendOwnerRequest sendOwnerRequestNewInstance = SendOwnerRequest.INSTANCE.newInstance(applicationContext);
            m mVarJ = m.j();
            com.tesla.features.b.Companion companion3 = com.tesla.features.b.INSTANCE;
            s.h(mVarJ);
            return new h(companion2, mVarJ, sendOwnerRequestNewInstance, companion3.a(mVarJ), new ac0.c(mVarJ), context);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ u a(c cVar, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return cVar.a(z11);
        }
    }

    u<j0<FeaturesConfig>> a(boolean refresh);
}
