package h90;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lh90/d2;", "Lg90/a;", "<init>", "()V", "", "Lg90/d;", "a", "()Ljava/util/List;", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "countryCode", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d2 implements g90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2 f71788a = new d2();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String countryCode = "GN";

    private d2() {
    }

    @Override // g90.a
    public List<g90.d> a() {
        return p013kotlin.collections.v.p(new g90.d(g90.f.PostalCode, false, new g90.e(false, (ArrayList) null, g90.g.Postal, 2, (DefaultConstructorMarker) null)), new g90.d(g90.f.AddressLine1, true, null), new g90.d(g90.f.AddressLine2, false, null), new g90.d(g90.f.Locality, true, new g90.e(false, (ArrayList) null, g90.g.City, 2, (DefaultConstructorMarker) null)));
    }

    public String b() {
        return countryCode;
    }
}
