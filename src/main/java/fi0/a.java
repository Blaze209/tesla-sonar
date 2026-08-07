package fi0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lfi0/a;", "", "Lfi0/c;", "sdkFilesManager", "<init>", "(Lfi0/c;)V", "a", "()Lfi0/c;", "Lfi0/c;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c sdkFilesManager;

    public a(c sdkFilesManager) {
        s.k(sdkFilesManager, "sdkFilesManager");
        this.sdkFilesManager = sdkFilesManager;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getSdkFilesManager() {
        return this.sdkFilesManager;
    }
}
