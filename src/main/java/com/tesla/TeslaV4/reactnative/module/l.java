package com.tesla.TeslaV4.reactnative.module;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0004J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/l;", "", "", "Ldd0/c;", "a", "()Ljava/util/List;", "", "fromLatitude", "fromLongitude", "toLatitude", "toLongitude", "Ldd0/b;", "b", "(DDDD)Ldd0/b;", "Companion", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f55706a;

    /* JADX INFO: renamed from: com.tesla.TeslaV4.reactnative.module.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/l$a;", "", "<init>", "()V", "Lcom/tesla/TeslaV4/reactnative/module/l;", "b", "Lcom/tesla/TeslaV4/reactnative/module/l;", "a", "()Lcom/tesla/TeslaV4/reactnative/module/l;", "instance", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f55706a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final l instance = dd0.d.f60460a;

        private Companion() {
        }

        public final l a() {
            return instance;
        }
    }

    List<dd0.c> a();

    dd0.b b(double fromLatitude, double fromLongitude, double toLatitude, double toLongitude);
}
