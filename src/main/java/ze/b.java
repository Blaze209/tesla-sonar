package ze;

import af.QRCodeOutputData;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import je.e;
import je.f;
import je.g;
import je.h;
import kf.r;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lze/b;", "Lje/a;", "Lje/c;", "Lje/h;", "Laf/a;", "", "Lje/g;", "Lkf/r;", "Lje/f;", "Lje/e;", "Lpe/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "o", "(Landroid/content/Context;)V", "Lkotlinx/coroutines/flow/Flow;", "Laf/c;", "a", "()Lkotlinx/coroutines/flow/Flow;", "eventFlow", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b extends je.a, je.c, h<QRCodeOutputData>, g, r, f, e, pe.d {
    Flow<af.c> a();

    void o(Context context);
}
