package xd;

import kf.q;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import ud.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lxd/a;", "", "Lkf/b;", "", "buttonTextResId", "<init>", "(Ljava/lang/String;II)V", "I", "getButtonTextResId", "()I", "Lkf/q;", "viewProvider", "Lkf/q;", "getViewProvider", "()Lkf/q;", "INPUT", "CONFIRMATION", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum a implements kf.b {
    INPUT(h.f116143d),
    CONFIRMATION(h.f116141b);

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final int buttonTextResId;
    private final q viewProvider = d.f123270a;

    a(int i11) {
        this.buttonTextResId = i11;
    }

    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    @Override // kf.b
    public int getButtonTextResId() {
        return this.buttonTextResId;
    }

    @Override // kf.b
    public kf.d getButtonViewProvider() {
        return kf.b.a.a(this);
    }

    @Override // kf.f
    public q getViewProvider() {
        return this.viewProvider;
    }
}
