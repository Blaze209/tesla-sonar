package ss;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k {
    public static void a(i iVar) {
        if (iVar != null) {
            try {
                iVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
