package expo.modules.kotlin.types;

import co0.q;
import java.lang.annotation.Annotation;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010$¨\u0006)"}, d2 = {"Lexpo/modules/kotlin/types/LazyKType;", "Lco0/q;", "Lco0/d;", "classifier", "", "isMarkedNullable", "Lkotlin/Function0;", "kTypeProvider", "<init>", "(Lco0/d;ZLwn0/a;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lco0/d;", "getClassifier", "()Lco0/d;", "Z", "()Z", "Lwn0/a;", "getKTypeProvider", "()Lwn0/a;", "_kType", "Lco0/q;", "getKType", "()Lco0/q;", "kType", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lco0/s;", "getArguments", "arguments", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LazyKType implements q {
    private q _kType;
    private final co0.d<?> classifier;
    private final boolean isMarkedNullable;
    private final wn0.a<q> kTypeProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyKType(co0.d<?> classifier, boolean z11, wn0.a<? extends q> kTypeProvider) {
        s.k(classifier, "classifier");
        s.k(kTypeProvider, "kTypeProvider");
        this.classifier = classifier;
        this.isMarkedNullable = z11;
        this.kTypeProvider = kTypeProvider;
    }

    private final q getKType() {
        if (this._kType == null) {
            this._kType = this.kTypeProvider.invoke();
        }
        q qVar = this._kType;
        s.h(qVar);
        return qVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyKType)) {
            return s.f(getKType(), other);
        }
        LazyKType lazyKType = (LazyKType) other;
        return s.f(getClassifier(), lazyKType.getClassifier()) && getIsMarkedNullable() == lazyKType.getIsMarkedNullable();
    }

    @Override // co0.b
    public List<Annotation> getAnnotations() {
        return getKType().getAnnotations();
    }

    @Override // co0.q
    public List<co0.s> getArguments() {
        return getKType().getArguments();
    }

    public final wn0.a<q> getKTypeProvider() {
        return this.kTypeProvider;
    }

    public int hashCode() {
        return (getClassifier().hashCode() * 31) + Boolean.hashCode(getIsMarkedNullable());
    }

    @Override // co0.q
    /* JADX INFO: renamed from: isMarkedNullable, reason: from getter */
    public boolean getIsMarkedNullable() {
        return this.isMarkedNullable;
    }

    public String toString() {
        return getKType().toString();
    }

    @Override // co0.q
    public co0.d<?> getClassifier() {
        return this.classifier;
    }

    public /* synthetic */ LazyKType(co0.d dVar, boolean z11, wn0.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i11 & 2) != 0 ? false : z11, aVar);
    }
}
