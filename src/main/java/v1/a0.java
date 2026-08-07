package v1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\b*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000f\u001a\u00020\f*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\u00020\f*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lz3/q;", "Lv1/d0;", "c", "(Lz3/q;)Lv1/d0;", "rowColumnParentData", "Lz3/w0;", DateTokenConverter.CONVERTER_KEY, "(Lz3/w0;)Lv1/d0;", "", "e", "(Lv1/d0;)F", "weight", "", "b", "(Lv1/d0;)Z", "fill", "Landroidx/compose/foundation/layout/j;", "a", "(Lv1/d0;)Landroidx/compose/foundation/layout/j;", "crossAxisAlignment", "f", "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a0 {
    public static final androidx.compose.foundation.layout.j a(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean b(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    public static final RowColumnParentData c(z3.q qVar) {
        Object objC = qVar.c();
        if (objC instanceof RowColumnParentData) {
            return (RowColumnParentData) objC;
        }
        return null;
    }

    public static final RowColumnParentData d(w0 w0Var) {
        Object objC = w0Var.c();
        if (objC instanceof RowColumnParentData) {
            return (RowColumnParentData) objC;
        }
        return null;
    }

    public static final float e(RowColumnParentData rowColumnParentData) {
        return rowColumnParentData != null ? rowColumnParentData.getWeight() : BitmapDescriptorFactory.HUE_RED;
    }

    public static final boolean f(RowColumnParentData rowColumnParentData) {
        androidx.compose.foundation.layout.j jVarA = a(rowColumnParentData);
        if (jVarA != null) {
            return jVarA.c();
        }
        return false;
    }
}
