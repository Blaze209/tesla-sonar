package zb;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000f\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0010\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class f extends u implements wn0.a<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<Comparable<Object>> f128038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List<Comparable<Object>> list) {
        super(0);
        this.f128038c = list;
    }

    @Override // wn0.a
    public final Object invoke() {
        return v.Y0(this.f128038c);
    }
}
