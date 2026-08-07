package dq0;

/* JADX INFO: loaded from: classes9.dex */
public enum s implements e {
    OVERRIDE_READ_ONLY;

    public static boolean overrideReadOnly(e[] eVarArr) {
        if (eVarArr != null && eVarArr.length != 0) {
            for (e eVar : eVarArr) {
                if (eVar == OVERRIDE_READ_ONLY) {
                    return true;
                }
            }
        }
        return false;
    }
}
