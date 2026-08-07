package ac0;

import com.squareup.moshi.u;
import com.tesla.features.FeaturesConfigEnvelope;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"?\u0010\u0007\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/squareup/moshi/h;", "Lcom/tesla/features/FeaturesConfigEnvelope;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "c", "()Lcom/squareup/moshi/h;", "configAdapter", "features_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f955a = m.b(new wn0.a() { // from class: ac0.a
        @Override // wn0.a
        public final Object invoke() {
            return b.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.squareup.moshi.h b() {
        return new u.b().d().c(FeaturesConfigEnvelope.class);
    }

    public static final com.squareup.moshi.h<FeaturesConfigEnvelope> c() {
        return (com.squareup.moshi.h) f955a.getValue();
    }
}
