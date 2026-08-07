package androidx.compose.foundation.layout;

import b4.m1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import v1.RowColumnParentData;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/w;", "Lb4/m1;", "Landroidx/compose/ui/d$c;", "<init>", "()V", "a", "Landroidx/compose/foundation/layout/w$a;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class w extends androidx.compose.ui.d.c implements m1 {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/layout/w$a;", "Landroidx/compose/foundation/layout/w;", "Lz3/a;", "alignmentLine", "<init>", "(Lz3/a;)V", "Lw4/d;", "", "parentData", "G", "(Lw4/d;Ljava/lang/Object;)Ljava/lang/Object;", "n", "Lz3/a;", "getAlignmentLine", "()Lz3/a;", "x2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends w {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private z3.a alignmentLine;

        public a(z3.a aVar) {
            super(null);
            this.alignmentLine = aVar;
        }

        @Override // b4.m1
        public Object G(w4.d dVar, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(BitmapDescriptorFactory.HUE_RED, false, null, null, 15, null);
            }
            rowColumnParentData.e(j.INSTANCE.a(new c.Value(this.alignmentLine)));
            return rowColumnParentData;
        }

        public final void x2(z3.a aVar) {
            this.alignmentLine = aVar;
        }
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w() {
    }
}
