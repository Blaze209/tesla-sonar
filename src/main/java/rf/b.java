package rf;

import kf.f;
import kf.q;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lrf/b;", "", "Lkf/f;", "<init>", "(Ljava/lang/String;I)V", "Lkf/q;", "viewProvider", "Lkf/q;", "getViewProvider", "()Lkf/q;", "SIMPLE_VOUCHER", "FULL_VOUCHER", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum b implements f {
    SIMPLE_VOUCHER,
    FULL_VOUCHER;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final q viewProvider = d.f108093a;

    b() {
    }

    public static EnumEntries<b> getEntries() {
        return $ENTRIES;
    }

    @Override // kf.f
    public q getViewProvider() {
        return this.viewProvider;
    }
}
