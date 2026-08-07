package ym;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lym/f;", "", "", "avoidPoolGet", "avoidPoolRelease", "<init>", "(ZZ)V", "a", "Z", "()Z", "b", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean avoidPoolGet;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean avoidPoolRelease;

    public f(boolean z11, boolean z12) {
        this.avoidPoolGet = z11;
        this.avoidPoolRelease = z12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAvoidPoolGet() {
        return this.avoidPoolGet;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAvoidPoolRelease() {
        return this.avoidPoolRelease;
    }

    public /* synthetic */ f(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
    }
}
