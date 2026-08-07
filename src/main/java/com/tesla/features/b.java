package com.tesla.features;

import ac0.d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import td0.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/features/b;", "", "Lcom/tesla/features/FeaturesConfig;", "b", "()Lcom/tesla/features/FeaturesConfig;", "config", "Ljn0/h0;", "a", "(Lcom/tesla/features/FeaturesConfig;)V", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f56266a;

    /* JADX INFO: renamed from: com.tesla.features.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/features/b$a;", "", "<init>", "()V", "Ltd0/m;", "realmHelper", "Lcom/tesla/features/b;", "a", "(Ltd0/m;)Lcom/tesla/features/b;", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f56266a = new Companion();

        private Companion() {
        }

        public final b a(m realmHelper) {
            s.k(realmHelper, "realmHelper");
            return new d(realmHelper);
        }
    }

    void a(FeaturesConfig config);

    FeaturesConfig b();
}
