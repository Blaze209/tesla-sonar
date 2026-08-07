package androidx.compose.foundation.layout;

import b4.m1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import v1.RowColumnParentData;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/l;", "Lb4/m1;", "Landroidx/compose/ui/d$c;", "Ld3/c$b;", "horizontal", "<init>", "(Ld3/c$b;)V", "Lw4/d;", "", "parentData", "Lv1/d0;", "x2", "(Lw4/d;Ljava/lang/Object;)Lv1/d0;", "n", "Ld3/c$b;", "getHorizontal", "()Ld3/c$b;", "y2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l extends androidx.compose.ui.d.c implements m1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private d3.c.b horizontal;

    public l(d3.c.b bVar) {
        this.horizontal = bVar;
    }

    @Override // b4.m1
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public RowColumnParentData G(w4.d dVar, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(BitmapDescriptorFactory.HUE_RED, false, null, null, 15, null);
        }
        rowColumnParentData.e(j.INSTANCE.b(this.horizontal));
        return rowColumnParentData;
    }

    public final void y2(d3.c.b bVar) {
        this.horizontal = bVar;
    }
}
