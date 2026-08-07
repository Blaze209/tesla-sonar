package vo0;

import java.util.Arrays;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvo0/f0;", "Lvo0/m1;", "", "name", "Lvo0/e0;", "generatedSerializer", "<init>", "(Ljava/lang/String;Lvo0/e0;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "m", "Z", "isInline", "()Z", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f0 extends m1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isInline;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(String name, e0<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(generatedSerializer, "generatedSerializer");
        this.isInline = true;
    }

    @Override // vo0.m1
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f0)) {
            return false;
        }
        to0.f fVar = (to0.f) other;
        if (!p013kotlin.jvm.internal.s.f(getSerialName(), fVar.getSerialName())) {
            return false;
        }
        f0 f0Var = (f0) other;
        if (!f0Var.getIsInline() || !Arrays.equals(t(), f0Var.t()) || getElementsCount() != fVar.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i11 = 0; i11 < elementsCount; i11++) {
            if (!p013kotlin.jvm.internal.s.f(d(i11).getSerialName(), fVar.d(i11).getSerialName()) || !p013kotlin.jvm.internal.s.f(d(i11).getKind(), fVar.d(i11).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // vo0.m1
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // vo0.m1, to0.f
    /* JADX INFO: renamed from: isInline, reason: from getter */
    public boolean getIsInline() {
        return this.isInline;
    }
}
