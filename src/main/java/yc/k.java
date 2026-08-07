package yc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.i0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lokio/o;", "Lokio/i0;", Action.FILE_ATTRIBUTE, "", "mustCreate", "Ljn0/h0;", "a", "(Lokio/o;Lokio/i0;Z)V", "directory", "c", "(Lokio/o;Lokio/i0;)V", "", DateTokenConverter.CONVERTER_KEY, "(Lokio/i0;)Ljava/lang/String;", "extension", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {
    public static final void a(okio.o oVar, i0 i0Var, boolean z11) {
        if (z11) {
            f0.h(oVar.n0(i0Var, true));
        } else {
            if (oVar.J(i0Var)) {
                return;
            }
            f0.h(oVar.k0(i0Var));
        }
    }

    public static /* synthetic */ void b(okio.o oVar, i0 i0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        a(oVar, i0Var, z11);
    }

    public static final void c(okio.o oVar, i0 i0Var) throws IOException {
        try {
            IOException iOException = null;
            for (i0 i0Var2 : oVar.T(i0Var)) {
                try {
                    if (oVar.b0(i0Var2).getIsDirectory()) {
                        c(oVar, i0Var2);
                    }
                    oVar.H(i0Var2);
                } catch (IOException e11) {
                    if (iOException == null) {
                        iOException = e11;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final String d(i0 i0Var) {
        return p013kotlin.text.t.s1(i0Var.e(), CoreConstants.DOT, "");
    }
}
