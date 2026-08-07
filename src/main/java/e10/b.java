package e10;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Le10/b;", "Le10/a;", "<init>", "()V", "", "dy", "absoluteFingerPosition", "keyboardPosition", "offset", "a", "(IIII)I", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements a {
    @Override // e10.a
    public int a(int dy2, int absoluteFingerPosition, int keyboardPosition, int offset) {
        if (absoluteFingerPosition <= keyboardPosition + offset || dy2 <= 0) {
            return dy2;
        }
        return 0;
    }
}
