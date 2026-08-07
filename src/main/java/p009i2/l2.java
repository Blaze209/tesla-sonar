package p009i2;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import d3.i;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Li2/k2;", InquiryField.StringField.TYPE, "", "a", "(ILr2/l;I)Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l2 {
    public static final String a(int i11, l lVar, int i12) {
        String string;
        if (o.J()) {
            o.S(-726638443, i12, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        lVar.U(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) lVar.U(AndroidCompositionLocals_androidKt.g())).getResources();
        k2.Companion companion = k2.INSTANCE;
        if (k2.i(i11, companion.e())) {
            string = resources.getString(i.f59322h);
        } else if (k2.i(i11, companion.a())) {
            string = resources.getString(i.f59315a);
        } else if (k2.i(i11, companion.b())) {
            string = resources.getString(i.f59316b);
        } else if (k2.i(i11, companion.c())) {
            string = resources.getString(i.f59317c);
        } else if (k2.i(i11, companion.d())) {
            string = resources.getString(i.f59319e);
        } else if (k2.i(i11, companion.g())) {
            string = resources.getString(i.f59325k);
        } else {
            string = k2.i(i11, companion.f()) ? resources.getString(i.f59324j) : "";
        }
        if (o.J()) {
            o.R();
        }
        return string;
    }
}
