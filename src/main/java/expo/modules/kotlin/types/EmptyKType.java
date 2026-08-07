package expo.modules.kotlin.types;

import co0.q;
import java.lang.annotation.Annotation;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"Lexpo/modules/kotlin/types/EmptyKType;", "Lco0/q;", "Lco0/d;", "classifier", "", "isMarkedNullable", "<init>", "(Lco0/d;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lco0/d;", "getClassifier", "()Lco0/d;", "Z", "()Z", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lco0/s;", "getArguments", "arguments", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmptyKType implements q {
    private final co0.d<?> classifier;
    private final boolean isMarkedNullable;

    public EmptyKType(co0.d<?> classifier, boolean z11) {
        s.k(classifier, "classifier");
        this.classifier = classifier;
        this.isMarkedNullable = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyKType)) {
            return false;
        }
        EmptyKType emptyKType = (EmptyKType) other;
        return s.f(getClassifier(), emptyKType.getClassifier()) && getIsMarkedNullable() == emptyKType.getIsMarkedNullable();
    }

    @Override // co0.b
    public List<Annotation> getAnnotations() {
        return v.m();
    }

    @Override // co0.q
    public List<co0.s> getArguments() {
        return v.m();
    }

    public int hashCode() {
        return (getClassifier().hashCode() * 31) + Boolean.hashCode(getIsMarkedNullable());
    }

    @Override // co0.q
    /* JADX INFO: renamed from: isMarkedNullable, reason: from getter */
    public boolean getIsMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // co0.q
    public co0.d<?> getClassifier() {
        return this.classifier;
    }

    public /* synthetic */ EmptyKType(co0.d dVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i11 & 2) != 0 ? false : z11);
    }
}
