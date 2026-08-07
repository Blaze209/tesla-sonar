package v1;

import b4.m1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lv1/x;", "Lb4/m1;", "Landroidx/compose/ui/d$c;", "", "weight", "", "fill", "<init>", "(FZ)V", "Lw4/d;", "", "parentData", "Lv1/d0;", "x2", "(Lw4/d;Ljava/lang/Object;)Lv1/d0;", "n", Gender.FEMALE, "getWeight", "()F", "z2", "(F)V", "o", "Z", "getFill", "()Z", "y2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x extends androidx.compose.ui.d.c implements m1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float weight;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean fill;

    public x(float f11, boolean z11) {
        this.weight = f11;
        this.fill = z11;
    }

    @Override // b4.m1
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public RowColumnParentData G(w4.d dVar, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(BitmapDescriptorFactory.HUE_RED, false, null, null, 15, null);
        }
        rowColumnParentData.g(this.weight);
        rowColumnParentData.f(this.fill);
        return rowColumnParentData;
    }

    public final void y2(boolean z11) {
        this.fill = z11;
    }

    public final void z2(float f11) {
        this.weight = f11;
    }
}
