package dd0;

import com.tesla.TeslaV4.reactnative.module.l;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Ldd0/d;", "Lcom/tesla/TeslaV4/reactnative/module/l;", "<init>", "()V", "", "Ldd0/c;", "a", "()Ljava/util/List;", "", "fromLatitude", "fromLongitude", "toLatitude", "toLongitude", "Ldd0/b;", "b", "(DDDD)Ldd0/b;", "Ldd0/a;", "Ljava/util/List;", "providerList", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f60460a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<a> providerList = v.e(new a());

    private d() {
    }

    @Override // com.tesla.TeslaV4.reactnative.module.l
    public List<c> a() {
        return providerList;
    }

    @Override // com.tesla.TeslaV4.reactnative.module.l
    public b b(double fromLatitude, double fromLongitude, double toLatitude, double toLongitude) {
        return b.DRIVE;
    }
}
