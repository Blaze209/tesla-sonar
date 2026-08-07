package bg0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: bg0.j, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u001a"}, d2 = {"Lbg0/j;", "", "Lbg0/i;", "primaryChoice", "", "backupChoices", "<init>", "(Lbg0/i;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbg0/i;", "b", "()Lbg0/i;", "Ljava/util/List;", "getBackupChoices", "()Ljava/util/List;", "allChoices", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CameraChoices {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CameraChoice primaryChoice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CameraChoice> backupChoices;

    public CameraChoices(CameraChoice primaryChoice, List<CameraChoice> backupChoices) {
        s.k(primaryChoice, "primaryChoice");
        s.k(backupChoices, "backupChoices");
        this.primaryChoice = primaryChoice;
        this.backupChoices = backupChoices;
    }

    public final List<CameraChoice> a() {
        return v.P0(v.e(this.primaryChoice), this.backupChoices);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CameraChoice getPrimaryChoice() {
        return this.primaryChoice;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraChoices)) {
            return false;
        }
        CameraChoices cameraChoices = (CameraChoices) other;
        return s.f(this.primaryChoice, cameraChoices.primaryChoice) && s.f(this.backupChoices, cameraChoices.backupChoices);
    }

    public int hashCode() {
        return (this.primaryChoice.hashCode() * 31) + this.backupChoices.hashCode();
    }

    public String toString() {
        return "CameraChoices(primaryChoice=" + this.primaryChoice + ", backupChoices=" + this.backupChoices + ")";
    }
}
