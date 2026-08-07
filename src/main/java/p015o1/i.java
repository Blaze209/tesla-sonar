package p015o1;

import androidx.compose.animation.a;
import androidx.compose.animation.k;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.b2;
import p020r2.l1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0010\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lo1/i;", "", "Landroidx/compose/animation/i;", "targetContentEnter", "Landroidx/compose/animation/k;", "initialContentExit", "", "targetContentZIndex", "Lo1/v;", "sizeTransform", "<init>", "(Landroidx/compose/animation/i;Landroidx/compose/animation/k;FLo1/v;)V", "a", "Landroidx/compose/animation/i;", "c", "()Landroidx/compose/animation/i;", "b", "Landroidx/compose/animation/k;", "()Landroidx/compose/animation/k;", "<set-?>", "Lr2/l1;", DateTokenConverter.CONVERTER_KEY, "()F", "setTargetContentZIndex", "(F)V", "Lo1/v;", "()Lo1/v;", "setSizeTransform$animation_release", "(Lo1/v;)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.animation.i targetContentEnter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k initialContentExit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l1 targetContentZIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private v sizeTransform;

    public i(androidx.compose.animation.i iVar, k kVar, float f11, v vVar) {
        this.targetContentEnter = iVar;
        this.initialContentExit = kVar;
        this.targetContentZIndex = b2.a(f11);
        this.sizeTransform = vVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k getInitialContentExit() {
        return this.initialContentExit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final v getSizeTransform() {
        return this.sizeTransform;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.animation.i getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public final float d() {
        return this.targetContentZIndex.d();
    }

    public /* synthetic */ i(androidx.compose.animation.i iVar, k kVar, float f11, v vVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, kVar, (i11 & 4) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i11 & 8) != 0 ? a.d(false, null, 3, null) : vVar);
    }
}
