package e30;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: e30.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Le30/d;", "", "B", "Le30/f;", "Le30/e;", "beneathModals", "", "modals", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "Ljava/util/List;", "()Ljava/util/List;", "wf1-container-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AlertContainerScreen<B> implements f<B, AlertScreen> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final B beneathModals;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<AlertScreen> modals;

    public AlertContainerScreen(B beneathModals, List<AlertScreen> modals) {
        s.k(beneathModals, "beneathModals");
        s.k(modals, "modals");
        this.beneathModals = beneathModals;
        this.modals = modals;
    }

    @Override // e30.f
    public List<AlertScreen> b() {
        return this.modals;
    }

    @Override // e30.f
    public B c() {
        return this.beneathModals;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertContainerScreen)) {
            return false;
        }
        AlertContainerScreen alertContainerScreen = (AlertContainerScreen) other;
        return s.f(c(), alertContainerScreen.c()) && s.f(b(), alertContainerScreen.b());
    }

    public int hashCode() {
        return (c().hashCode() * 31) + b().hashCode();
    }

    public String toString() {
        return "AlertContainerScreen(beneathModals=" + c() + ", modals=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ AlertContainerScreen(Object obj, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? v.m() : list);
    }
}
