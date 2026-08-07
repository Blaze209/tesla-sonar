package expo.modules.kotlin.jni;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"nextValue", "", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CppTypeKt {
    private static int nextValue;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nextValue() {
        int i11 = nextValue;
        int i12 = 1 << i11;
        nextValue = i11 + 1;
        return i12;
    }
}
