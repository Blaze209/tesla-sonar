package p2;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Lp2/g;", InquiryField.StringField.TYPE, "", "a", "(ILr2/l;I)Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {
    public static final String a(int i11, p020r2.l lVar, int i12) {
        if (p020r2.o.J()) {
            p020r2.o.S(-907677715, i12, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        lVar.U(AndroidCompositionLocals_androidKt.f());
        String string = ((Context) lVar.U(AndroidCompositionLocals_androidKt.g())).getResources().getString(i11);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return string;
    }
}
