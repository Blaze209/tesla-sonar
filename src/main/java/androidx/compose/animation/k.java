package androidx.compose.animation;

import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p015o1.ChangeSize;
import p015o1.Fade;
import p015o1.Scale;
import p015o1.Slide;
import p015o1.TransitionData;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118 X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/k;", "", "<init>", "()V", "exit", "c", "(Landroidx/compose/animation/k;)Landroidx/compose/animation/k;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "Lo1/a0;", "b", "()Lo1/a0;", "data", "a", "Landroidx/compose/animation/l;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k f4126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k f4127c;

    /* JADX INFO: renamed from: androidx.compose.animation.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/animation/k$a;", "", "<init>", "()V", "Landroidx/compose/animation/k;", "None", "Landroidx/compose/animation/k;", "a", "()Landroidx/compose/animation/k;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return k.f4126b;
        }

        private Companion() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Fade fade = null;
        Slide slide = null;
        ChangeSize changeSize = null;
        Scale scale = null;
        Map map = null;
        f4126b = new l(new TransitionData(fade, slide, changeSize, scale, false, map, 63, defaultConstructorMarker));
        f4127c = new l(new TransitionData(fade, slide, changeSize, scale, true, map, 47, defaultConstructorMarker));
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract TransitionData b();

    public final k c(k exit) {
        Fade fade = exit.b().getFade();
        if (fade == null) {
            fade = b().getFade();
        }
        Slide slide = exit.b().getSlide();
        if (slide == null) {
            slide = b().getSlide();
        }
        ChangeSize changeSize = exit.b().getChangeSize();
        if (changeSize == null) {
            changeSize = b().getChangeSize();
        }
        Scale scale = exit.b().getScale();
        if (scale == null) {
            scale = b().getScale();
        }
        return new l(new TransitionData(fade, slide, changeSize, scale, exit.b().getHold() || b().getHold(), v0.r(b().b(), exit.b().b())));
    }

    public boolean equals(Object other) {
        return (other instanceof k) && s.f(((k) other).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (s.f(this, f4126b)) {
            return "ExitTransition.None";
        }
        if (s.f(this, f4127c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData transitionDataB = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExitTransition: \nFade - ");
        Fade fade = transitionDataB.getFade();
        sb2.append(fade != null ? fade.toString() : null);
        sb2.append(",\nSlide - ");
        Slide slide = transitionDataB.getSlide();
        sb2.append(slide != null ? slide.toString() : null);
        sb2.append(",\nShrink - ");
        ChangeSize changeSize = transitionDataB.getChangeSize();
        sb2.append(changeSize != null ? changeSize.toString() : null);
        sb2.append(",\nScale - ");
        Scale scale = transitionDataB.getScale();
        sb2.append(scale != null ? scale.toString() : null);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(transitionDataB.getHold());
        return sb2.toString();
    }

    private k() {
    }
}
