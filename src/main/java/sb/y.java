package sb;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsb/z;", "generationalId", "", "systemId", "Lsb/r;", "a", "(Lsb/z;I)Lsb/r;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y {
    public static final SystemIdInfo a(WorkGenerationalId generationalId, int i11) {
        p013kotlin.jvm.internal.s.k(generationalId, "generationalId");
        return new SystemIdInfo(generationalId.getWorkSpecId(), generationalId.getGeneration(), i11);
    }
}
